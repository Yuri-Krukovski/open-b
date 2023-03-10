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

import java.util.Objects;

/**
 * __Mandatory__. The payment submission object defining the details of the payment instruction to be executed under the Variable Recurring Payment.
 */
@ApiModel(description = "__Mandatory__. The payment submission object defining the details of the payment instruction to be executed under the Variable Recurring Payment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class SubmissionDetails {
  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private Payee payee;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "paymentAmount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private Amount paymentAmount;

  public SubmissionDetails() { 
  }

  public SubmissionDetails reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * __Optional__. The payment reference or description. Limited to a maximum of 18 characters long.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Own Account Sweeping", value = "__Optional__. The payment reference or description. Limited to a maximum of 18 characters long.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public SubmissionDetails payee(Payee payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Payee getPayee() {
    return payee;
  }


  public void setPayee(Payee payee) {
    this.payee = payee;
  }


  public SubmissionDetails paymentAmount(Amount paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Amount getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(Amount paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionDetails submissionDetails = (SubmissionDetails) o;
    return Objects.equals(this.reference, submissionDetails.reference) &&
        Objects.equals(this.payee, submissionDetails.payee) &&
        Objects.equals(this.paymentAmount, submissionDetails.paymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, payee, paymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionDetails {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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

