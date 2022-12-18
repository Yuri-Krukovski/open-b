package com.example.ob.dataaggregator;

import com.example.ob.client.AccountInformationProvider;
import com.example.ob.domain.entities.Account;
import com.example.ob.domain.internalmodels.AccountDto;
import com.example.ob.record.BankDataParams;
import com.example.ob.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.ob.dataaggregator.AggregatorType.TRUELAYER_CLIENT;

@Service
@Slf4j
public class TruelayerDataAggregator extends AbstractAggregator {
    public TruelayerDataAggregator(List<AccountInformationProvider> accountInformationProvider,
                                   AccountRepository accountRepository,
                                   ModelMapper modelMapper) {
        super(accountInformationProvider, accountRepository, modelMapper);
    }

    @Override
    public List<AccountDto> processAccounts(BankDataParams bankDataParams) {
        return accountInformationProvider.get(TRUELAYER_CLIENT)
                .getAccounts(bankDataParams.consent())
                .stream()
                .map(accountDto -> modelMapper.map(accountDto, Account.class))
                .map(accountRepository::save)
                .map(account -> modelMapper.map(account, AccountDto.class))
                .toList();
    }

    @Override
    public void processIdentity(AccountDto accountDto) {

    }

    @Override
    public void processBalances() {

    }

    @Override
    public void processTransactions(AccountDto accountDto) {

    }

    @Override
    public AggregatorType getDataProviderType() {
        return AggregatorType.TRUELAYER;
    }
}
