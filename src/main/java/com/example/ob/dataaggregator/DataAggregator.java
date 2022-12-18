package com.example.ob.dataaggregator;

import com.example.ob.domain.internalmodels.AccountDto;
import com.example.ob.record.BankDataParams;

import java.util.List;

public interface DataAggregator {

    void processBankData(BankDataParams bankDataParams);
    List<AccountDto> processAccounts(BankDataParams bankDataParams);
    void processIdentity(AccountDto accountDto);
    void processBalances();
    void processTransactions(AccountDto accountDto);

    AggregatorType getDataProviderType();
}
