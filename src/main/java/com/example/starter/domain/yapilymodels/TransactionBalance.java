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


package com.example.starter.domain.yapilymodels;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * TransactionBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class TransactionBalance {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountBalanceType type;

  public static final String SERIALIZED_NAME_BALANCE_AMOUNT = "balanceAmount";
  @SerializedName(SERIALIZED_NAME_BALANCE_AMOUNT)
  private Amount balanceAmount;

  public TransactionBalance() { 
  }

  public TransactionBalance type(AccountBalanceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountBalanceType getType() {
    return type;
  }


  public void setType(AccountBalanceType type) {
    this.type = type;
  }


  public TransactionBalance balanceAmount(Amount balanceAmount) {
    
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Get balanceAmount
   * @return balanceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getBalanceAmount() {
    return balanceAmount;
  }


  public void setBalanceAmount(Amount balanceAmount) {
    this.balanceAmount = balanceAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionBalance transactionBalance = (TransactionBalance) o;
    return Objects.equals(this.type, transactionBalance.type) &&
        Objects.equals(this.balanceAmount, transactionBalance.balanceAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, balanceAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionBalance {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
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

