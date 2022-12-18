package com.example.ob.dataaggregator;

import com.example.ob.client.AccountInformationProvider;
import com.example.ob.domain.internalmodels.AccountDto;
import com.example.ob.record.BankDataParams;
import com.example.ob.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public abstract class AbstractAggregator implements DataAggregator {

    protected final List<AccountInformationProvider> accountInformationProvider;
    protected final AccountRepository accountRepository;
    protected final ModelMapper modelMapper;

    public AbstractAggregator(List<AccountInformationProvider> accountInformationProvider,
                              AccountRepository accountRepository,
                              ModelMapper modelMapper) {
        this.accountInformationProvider = accountInformationProvider;
        this.accountRepository = accountRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void processBankData(BankDataParams bankDataParams) {
        List<AccountDto> accountDtos = processAccounts(bankDataParams);
        accountDtos.forEach(accountDto -> log.info(String.valueOf(accountDto)));
    }
}


