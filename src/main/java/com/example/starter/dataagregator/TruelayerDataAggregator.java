package com.example.starter.dataagregator;

import com.example.starter.domain.internalmodels.AccountDto;
import com.example.starter.domain.internalmodels.DataProviderType;
import com.example.starter.record.BankDataParams;

import java.util.List;

public class TruelayerDataAggregator implements DataAggregator {
    @Override
    public void processBankData(BankDataParams bankDataParams) {

    }

    @Override
    public List<AccountDto> processAccounts(BankDataParams bankDataParams) {
        return null;
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
        return null;
    }
}
