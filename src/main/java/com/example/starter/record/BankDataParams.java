package com.example.starter.record;

import lombok.With;

@With
public record BankDataParams(String consent, String accountId) {

    public static BankDataParams create(String consent){
        return new BankDataParams(consent, null);
    }

    public static BankDataParams create(String consent, String accountId){
        return new BankDataParams(consent, accountId);
    }
}