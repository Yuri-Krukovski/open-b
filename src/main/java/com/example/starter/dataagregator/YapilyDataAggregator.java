package com.example.starter.dataagregator;

import com.example.starter.client.AccountInformationProvider;
import com.example.starter.domain.entities.Account;
import com.example.starter.domain.internalmodels.AccountDto;
import com.example.starter.domain.internalmodels.DataProviderType;
import com.example.starter.record.BankDataParams;
import com.example.starter.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class YapilyDataAggregator extends AbstractAggregator {


    public YapilyDataAggregator(List<AccountInformationProvider> accountInformationProvider,
                                AccountRepository accountRepository,
                                ModelMapper modelMapper) {
        super(accountInformationProvider, accountRepository, modelMapper);
    }

    @Override
    public List<AccountDto> processAccounts(BankDataParams bankDataParams) {
        return accountInformationProvider.get(0).getAccounts(bankDataParams.consent())
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
    public DataProviderType getDataProviderType() {
        return DataProviderType.YAPILY;
    }
}