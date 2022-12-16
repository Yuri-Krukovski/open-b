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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Part of a financial profile for a User.
 */
@ApiModel(description = "Part of a financial profile for a User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class EnrichedTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_INFORMATION = "transactionInformation";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_INFORMATION)
  private String transactionInformation;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_BOOKING_DATE_TIME = "bookingDateTime";
  @SerializedName(SERIALIZED_NAME_BOOKING_DATE_TIME)
  private OffsetDateTime bookingDateTime;

  public EnrichedTransaction() { 
  }

  public EnrichedTransaction transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of the transaction
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c51e3bee-36fb-4c0a-8441-d6ba2056fe87", value = "The id of the transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public EnrichedTransaction transactionInformation(String transactionInformation) {
    
    this.transactionInformation = transactionInformation;
    return this;
  }

   /**
   * Information for the transaction
   * @return transactionInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Amazon Marketplace", value = "Information for the transaction")

  public String getTransactionInformation() {
    return transactionInformation;
  }


  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }


  public EnrichedTransaction amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transaction
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21.99", value = "The amount of the transaction")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public EnrichedTransaction institution(String institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * The id of the institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "starling", value = "The id of the institution")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public EnrichedTransaction bookingDateTime(OffsetDateTime bookingDateTime) {
    
    this.bookingDateTime = bookingDateTime;
    return this;
  }

   /**
   * The datetime of the transaction
   * @return bookingDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-24T00:30:19.951Z", value = "The datetime of the transaction")

  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }


  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichedTransaction enrichedTransaction = (EnrichedTransaction) o;
    return Objects.equals(this.transactionId, enrichedTransaction.transactionId) &&
        Objects.equals(this.transactionInformation, enrichedTransaction.transactionInformation) &&
        Objects.equals(this.amount, enrichedTransaction.amount) &&
        Objects.equals(this.institution, enrichedTransaction.institution) &&
        Objects.equals(this.bookingDateTime, enrichedTransaction.bookingDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, transactionInformation, amount, institution, bookingDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedTransaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
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

