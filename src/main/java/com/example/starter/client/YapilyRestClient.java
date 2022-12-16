package com.example.starter.client;

import com.example.starter.domain.yapilymodels.Account;
import com.example.starter.domain.yapilymodels.AccountApiListResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class YapilyRestClient implements YapilyClient {

    @Value("${yapily.application.uuid}")
    private String yapilyApplicationUuid;
    @Value("${yapily.application.secret}")
    private String yapilyApplicationSecret;
    @Value("${yapily.base.url}")
    private String yapilyBaseUrl;

    private static final String CONSENT_HEAD = "Consent";

    public static final String INSTITUTIONS_PATH = "/institutions";
    public static final String IDENTITY_PATH = "/identity";
    public static final String CONSENTS_PATH = "/consents";
    public static final String ACCOUNT_AUTH_PATH = "/account-auth-requests";
    public static final String ACCOUNTS_PATH = "/accounts";
    public static final String TRANSACTIONS_PATH = "/transactions";


    private final RestTemplate restTemplate;

    public YapilyRestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private String baseAuthInit() {
        return HttpHeaders.encodeBasicAuth(yapilyApplicationUuid, yapilyApplicationSecret, null);
    }

    @Override
    public AccountApiListResponse getAccounts(String consent) {

        final HttpHeaders httpHeaders = createHeadersWithConsent(consent);

        final URI requestUri = UriComponentsBuilder
                .fromUriString(yapilyBaseUrl)
                .path(ACCOUNTS_PATH)
                .encode()
                .build()
                .toUri();

        final RequestEntity<Void> request = RequestEntity
                .get(requestUri)
                .headers(httpHeaders)
                .build();

        log.info("getAccounts:: Initiating GET-ACCOUNTS request to {}", requestUri);

        try {
            ResponseEntity<AccountApiListResponse> response = restTemplate.exchange(
                    request,
                    AccountApiListResponse.class);

            if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
                List<Account> data = response.getBody().getData();
                log.info("getAccounts:: Success - retrieved {} accounts", data.size());
            }

            return Optional.of(response)
                    .map(ResponseEntity::getBody)
                    .orElseThrow(() -> new RestClientException("No body in the response"));

        } catch (RestClientException e) {
            log.error("getAccounts:: Failed to retrieve accounts with message {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private HttpHeaders createHeadersWithConsent(String consent) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBasicAuth(baseAuthInit());
        httpHeaders.set(CONSENT_HEAD, consent);
        return httpHeaders;
    }
}
