package com.example.starter.client;

import com.example.starter.domain.yapilymodels.AccountApiListResponse;

public interface YapilyClient {

    AccountApiListResponse getAccounts(String consent);
}
