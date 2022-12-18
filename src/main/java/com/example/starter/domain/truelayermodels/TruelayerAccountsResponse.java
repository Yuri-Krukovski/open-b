package com.example.starter.domain.truelayermodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TruelayerAccountsResponse {

    @JsonProperty("results")
    public List<TruelayerAccount> results = null;
    @JsonProperty("status")
    public String status;
}