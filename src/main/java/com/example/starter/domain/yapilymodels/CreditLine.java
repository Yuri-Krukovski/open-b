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
 * CreditLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class CreditLine {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreditLineType type;

  public static final String SERIALIZED_NAME_CREDIT_LINE_AMOUNT = "creditLineAmount";
  @SerializedName(SERIALIZED_NAME_CREDIT_LINE_AMOUNT)
  private Amount creditLineAmount;

  public CreditLine() { 
  }

  public CreditLine type(CreditLineType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditLineType getType() {
    return type;
  }


  public void setType(CreditLineType type) {
    this.type = type;
  }


  public CreditLine creditLineAmount(Amount creditLineAmount) {
    
    this.creditLineAmount = creditLineAmount;
    return this;
  }

   /**
   * Get creditLineAmount
   * @return creditLineAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getCreditLineAmount() {
    return creditLineAmount;
  }


  public void setCreditLineAmount(Amount creditLineAmount) {
    this.creditLineAmount = creditLineAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditLine creditLine = (CreditLine) o;
    return Objects.equals(this.type, creditLine.type) &&
        Objects.equals(this.creditLineAmount, creditLine.creditLineAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, creditLineAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditLine {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creditLineAmount: ").append(toIndentedString(creditLineAmount)).append("\n");
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

