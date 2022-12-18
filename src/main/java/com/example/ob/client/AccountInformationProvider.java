package com.example.ob.client;

import com.example.ob.domain.internalmodels.AccountDto;

import java.util.List;

public interface AccountInformationProvider {
    List<AccountDto> getAccounts(String consent);
}
