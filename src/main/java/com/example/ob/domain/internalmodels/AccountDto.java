package com.example.ob.domain.internalmodels;

import lombok.*;

import java.io.Serializable;

@Data
public class AccountDto implements Serializable {
    private Long id;
    private String accountId;
    private String name;
    private String accountType;
    private String accountSubType;
}