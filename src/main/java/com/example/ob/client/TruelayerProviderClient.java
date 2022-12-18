package com.example.ob.client;

import com.example.ob.domain.internalmodels.AccountDto;
import com.example.ob.domain.truelayermodels.TruelayerAccount;
import com.example.ob.domain.truelayermodels.TruelayerAccountsResponse;
import com.example.ob.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static com.example.ob.dataaggregator.AggregatorType.TRUELAYER_CLIENT;

@Order(TRUELAYER_CLIENT)
@Component
@Slf4j
public class TruelayerProviderClient implements AccountInformationProvider {

    @Value("${truelayer.base.url}")
    private String truelayerBaseUrl;
    private static final String API_VERSION = "data/v1/";
    private static final String ACCOUNTS_PATH = "accounts";

    private final RestTemplate restTemplate;
    private final AccountMapper accountMapper;

    public TruelayerProviderClient(RestTemplate restTemplate, AccountMapper accountMapper) {
        this.restTemplate = restTemplate;
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountDto> getAccounts(String consent) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(consent);

        final URI requestUri = UriComponentsBuilder
                .fromUriString(truelayerBaseUrl)
                .path(API_VERSION)
                .path(ACCOUNTS_PATH)
                .build()
                .toUri();

        final RequestEntity<Void> request = RequestEntity
                .get(requestUri)
                .headers(httpHeaders)
                .build();

        log.info("getAccounts:: Initiating GET-ACCOUNTS request to {}", requestUri);

        try {
            ResponseEntity<TruelayerAccountsResponse> response = restTemplate.exchange(
                    request,
                    TruelayerAccountsResponse.class);

            if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
                List<TruelayerAccount> data = response.getBody().getResults();
                log.info("getAccounts:: Success - retrieved {} accounts", data.size());
            }

            return Optional.of(response)
                    .map(ResponseEntity::getBody)
                    .map(TruelayerAccountsResponse::getResults)
                    .map(accountMapper::mapTruelayerAccounts)
                    .orElseThrow(() -> new RestClientException("No body in the response"));
        } catch (Exception e) {
            log.error("getAccounts:: Failed to retrieve accounts with message {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
