package com.example.starter.dataagregator;

import com.example.starter.client.AccountInformationProvider;
import com.example.starter.domain.internalmodels.AccountDto;
import com.example.starter.record.BankDataParams;
import com.example.starter.repository.AccountRepository;
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

        for (AccountDto accountDto : accountDtos) {
            processTransactions(accountDto);
        }

    }
}


