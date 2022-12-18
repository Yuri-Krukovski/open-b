package com.example.starter.domain.truelayermodels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Provider {

    @JsonProperty("display_name")
    public String displayName;
    @JsonProperty("provider_id")
    public String providerId;
    @JsonProperty("logo_uri")
    public String logoUri;
}