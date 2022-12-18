package com.example.starter.domain.truelayermodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TruelayerAccount {

    @JsonProperty("update_timestamp")
    public String updateTimestamp;
    @JsonProperty("account_id")
    public String accountId;
    @JsonProperty("account_type")
    public String accountType;
    @JsonProperty("display_name")
    public String displayName;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("account_number")
    public AccountNumber accountNumber;
    @JsonProperty("provider")
    public Provider provider;
}