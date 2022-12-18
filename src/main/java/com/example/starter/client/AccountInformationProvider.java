package com.example.starter.client;

import com.example.starter.domain.internalmodels.AccountDto;

import java.util.List;

public interface AccountInformationProvider {

    List<AccountDto> getAccounts(String consent);
}
