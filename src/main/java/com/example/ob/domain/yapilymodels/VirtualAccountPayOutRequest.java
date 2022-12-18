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
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;

import java.util.Objects;

/**
 * VirtualAccountPayOutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccountPayOutRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiaryId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_PAYMENT_SCHEME = "paymentScheme";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SCHEME)
  private String paymentScheme;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private LocalDate paymentDate;

  public VirtualAccountPayOutRequest() { 
  }

  public VirtualAccountPayOutRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Unique id of the source / payer account
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "eb2ad083-a111-4143-8756-a3a3cef4031c", required = true, value = "Unique id of the source / payer account")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public VirtualAccountPayOutRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public VirtualAccountPayOutRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Reference to be associated with the payment. This will be appear on the beneficiary&#39;s bank statement
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Invoice 1267765", required = true, value = "Reference to be associated with the payment. This will be appear on the beneficiary's bank statement")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public VirtualAccountPayOutRequest beneficiaryId(String beneficiaryId) {
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * Unique id of the beneficiary to whom the payment will be made
   * @return beneficiaryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sd6ad034-a111-4143-8756-a3a3cef4045v", required = true, value = "Unique id of the beneficiary to whom the payment will be made")

  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public VirtualAccountPayOutRequest paymentScheme(String paymentScheme) {
    
    this.paymentScheme = paymentScheme;
    return this;
  }

   /**
   * Method of settlement to complete the payment. One of: &lt;br&gt; FASTER_PAYMENTS &lt;br&gt; SEPA_CREDIT &lt;br&gt; SEPA_INSTANT &lt;br&gt; SWIFT &lt;br&gt; SWIFT_EXPRESS &lt;br&gt; CHAPS &lt;br&gt; IAT &lt;br&gt; WIRE
   * @return paymentScheme
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FASTER_PAYMENTS", required = true, value = "Method of settlement to complete the payment. One of: <br> FASTER_PAYMENTS <br> SEPA_CREDIT <br> SEPA_INSTANT <br> SWIFT <br> SWIFT_EXPRESS <br> CHAPS <br> IAT <br> WIRE")

  public String getPaymentScheme() {
    return paymentScheme;
  }


  public void setPaymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
  }


  public VirtualAccountPayOutRequest paymentDate(LocalDate paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Date on which a payment instruction will be executed, that must be in the future
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Oct 04 01:00:00 BST 2022", value = "Date on which a payment instruction will be executed, that must be in the future")

  public LocalDate getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccountPayOutRequest virtualAccountPayOutRequest = (VirtualAccountPayOutRequest) o;
    return Objects.equals(this.accountId, virtualAccountPayOutRequest.accountId) &&
        Objects.equals(this.amount, virtualAccountPayOutRequest.amount) &&
        Objects.equals(this.reference, virtualAccountPayOutRequest.reference) &&
        Objects.equals(this.beneficiaryId, virtualAccountPayOutRequest.beneficiaryId) &&
        Objects.equals(this.paymentScheme, virtualAccountPayOutRequest.paymentScheme) &&
        Objects.equals(this.paymentDate, virtualAccountPayOutRequest.paymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, reference, beneficiaryId, paymentScheme, paymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccountPayOutRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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
