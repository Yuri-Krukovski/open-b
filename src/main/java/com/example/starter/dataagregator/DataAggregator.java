package com.example.starter.dataagregator;

import com.example.starter.domain.internalmodels.AccountDto;
import com.example.starter.domain.internalmodels.DataProviderType;
import com.example.starter.record.BankDataParams;

import java.util.List;

public interface DataAggregator {

    void processBankData(BankDataParams bankDataParams);
    List<AccountDto> processAccounts(BankDataParams bankDataParams);
    void processIdentity(AccountDto accountDto);
    void processBalances();
    void processTransactions(AccountDto accountDto);

    DataProviderType getDataProviderType();
}
