package com.example.ob.domain.truelayermodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class AccountNumber {

    @JsonProperty("iban")
    public String iban;
    @JsonProperty("swift_bic")
    public String swiftBic;
    @JsonProperty("number")
    public String number;
    @JsonProperty("sort_code")
    public String sortCode;
}