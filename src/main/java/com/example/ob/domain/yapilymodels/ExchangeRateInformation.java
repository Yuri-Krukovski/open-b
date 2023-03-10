/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.14.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.ob.domain.yapilymodels;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * __Optional__. Used to provide details on the currency exchange rate and contract.
 */
@ApiModel(description = "__Optional__. Used to provide details on the currency exchange rate and contract.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class ExchangeRateInformation {
  public static final String SERIALIZED_NAME_UNIT_CURRENCY = "unitCurrency";
  @SerializedName(SERIALIZED_NAME_UNIT_CURRENCY)
  private String unitCurrency;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_RATE_TYPE = "rateType";
  @SerializedName(SERIALIZED_NAME_RATE_TYPE)
  private RateTypeEnum rateType;

  public static final String SERIALIZED_NAME_FOREIGN_EXCHANGE_CONTRACT_REFERENCE = "foreignExchangeContractReference";
  @SerializedName(SERIALIZED_NAME_FOREIGN_EXCHANGE_CONTRACT_REFERENCE)
  private String foreignExchangeContractReference;

  public ExchangeRateInformation() { 
  }

  public ExchangeRateInformation unitCurrency(String unitCurrency) {
    
    this.unitCurrency = unitCurrency;
    return this;
  }

   /**
   * __Mandatory__. The currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is &#x60;GBP&#x60;.
   * @return unitCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "__Mandatory__. The currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is `GBP`.")

  public String getUnitCurrency() {
    return unitCurrency;
  }


  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }


  public ExchangeRateInformation rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * __Optional__. The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__Optional__. The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  public ExchangeRateInformation rateType(RateTypeEnum rateType) {
    
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RateTypeEnum getRateType() {
    return rateType;
  }


  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }


  public ExchangeRateInformation foreignExchangeContractReference(String foreignExchangeContractReference) {
    
    this.foreignExchangeContractReference = foreignExchangeContractReference;
    return this;
  }

   /**
   * __Optional__. The unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
   * @return foreignExchangeContractReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__Optional__. The unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")

  public String getForeignExchangeContractReference() {
    return foreignExchangeContractReference;
  }


  public void setForeignExchangeContractReference(String foreignExchangeContractReference) {
    this.foreignExchangeContractReference = foreignExchangeContractReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateInformation exchangeRateInformation = (ExchangeRateInformation) o;
    return Objects.equals(this.unitCurrency, exchangeRateInformation.unitCurrency) &&
        Objects.equals(this.rate, exchangeRateInformation.rate) &&
        Objects.equals(this.rateType, exchangeRateInformation.rateType) &&
        Objects.equals(this.foreignExchangeContractReference, exchangeRateInformation.foreignExchangeContractReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCurrency, rate, rateType, foreignExchangeContractReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateInformation {\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    foreignExchangeContractReference: ").append(toIndentedString(foreignExchangeContractReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

