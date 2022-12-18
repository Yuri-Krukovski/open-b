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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.util.Arrays;
import java.util.Objects;

/**
 * VirtualAccountPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccountPayment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_DATE_TIME = "createdDateTime";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE_TIME)
  private OffsetDateTime createdDateTime;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private LocalDate paymentDate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PAYMENT_SCHEME = "paymentScheme";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SCHEME)
  private String paymentScheme;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private VirtualAccountPaymentSource source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private VirtualAccountPaymentDestination destination;

  public static final String SERIALIZED_NAME_ORIGINAL_PAYMENT_ID = "originalPaymentId";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PAYMENT_ID)
  private String originalPaymentId;

  public VirtualAccountPayment() { 
  }

  public VirtualAccountPayment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique id of the payment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "za2ad0234-a333-5435-8787-a3a3cef4031c", value = "Unique id of the payment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VirtualAccountPayment createdDateTime(OffsetDateTime createdDateTime) {
    
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Date and time that the payment was created
   * @return createdDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-24T00:30:19.951Z", value = "Date and time that the payment was created")

  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }


  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  public VirtualAccountPayment paymentDate(LocalDate paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Date on which the payment instruction will be executed, that may be in the future
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Oct 04 01:00:00 BST 2022", value = "Date on which the payment instruction will be executed, that may be in the future")

  public LocalDate getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }


  public VirtualAccountPayment type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of payment. One of PAY_IN, PAY_OUT, RETURN_IN or RETURN_OUT
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAY_IN", value = "Type of payment. One of PAY_IN, PAY_OUT, RETURN_IN or RETURN_OUT")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VirtualAccountPayment paymentScheme(String paymentScheme) {
    
    this.paymentScheme = paymentScheme;
    return this;
  }

   /**
   * Method of settlement to complete the payment. One of: &lt;br&gt; FASTER_PAYMENTS &lt;br&gt; SEPA_CREDIT &lt;br&gt; SEPA_INSTANT &lt;br&gt; SWIFT &lt;br&gt; SWIFT_EXPRESS &lt;br&gt; CHAPS &lt;br&gt; IAT &lt;br&gt; WIRE
   * @return paymentScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FASTER_PAYMENTS", value = "Method of settlement to complete the payment. One of: <br> FASTER_PAYMENTS <br> SEPA_CREDIT <br> SEPA_INSTANT <br> SWIFT <br> SWIFT_EXPRESS <br> CHAPS <br> IAT <br> WIRE")

  public String getPaymentScheme() {
    return paymentScheme;
  }


  public void setPaymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
  }


  public VirtualAccountPayment amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public VirtualAccountPayment reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Reference to be associated with the payment. This will be appear on the beneficiary&#39;s bank statement
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invoice 1267765", value = "Reference to be associated with the payment. This will be appear on the beneficiary's bank statement")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public VirtualAccountPayment status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current state of the transaction &lt;br&gt; INITIATED - The transaction request is acknowledged and will not undergo validation checks &lt;br&gt; PROCESSING - Initial checks succeeded and the transaction request is now being processed &lt;br&gt; COMPLETED - The transaction has been successfully processed (terminal status) &lt;br&gt; FAILED - An failure occured during transaction processing (terminal status)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INITIATED", value = "The current state of the transaction <br> INITIATED - The transaction request is acknowledged and will not undergo validation checks <br> PROCESSING - Initial checks succeeded and the transaction request is now being processed <br> COMPLETED - The transaction has been successfully processed (terminal status) <br> FAILED - An failure occured during transaction processing (terminal status)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VirtualAccountPayment source(VirtualAccountPaymentSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountPaymentSource getSource() {
    return source;
  }


  public void setSource(VirtualAccountPaymentSource source) {
    this.source = source;
  }


  public VirtualAccountPayment destination(VirtualAccountPaymentDestination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountPaymentDestination getDestination() {
    return destination;
  }


  public void setDestination(VirtualAccountPaymentDestination destination) {
    this.destination = destination;
  }


  public VirtualAccountPayment originalPaymentId(String originalPaymentId) {
    
    this.originalPaymentId = originalPaymentId;
    return this;
  }

   /**
   * Unique id of the original payment that was refunded
   * @return originalPaymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "za2ad0234-a333-5435-8787-a3a3cef4031c", value = "Unique id of the original payment that was refunded")

  public String getOriginalPaymentId() {
    return originalPaymentId;
  }


  public void setOriginalPaymentId(String originalPaymentId) {
    this.originalPaymentId = originalPaymentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccountPayment virtualAccountPayment = (VirtualAccountPayment) o;
    return Objects.equals(this.id, virtualAccountPayment.id) &&
        Objects.equals(this.createdDateTime, virtualAccountPayment.createdDateTime) &&
        Objects.equals(this.paymentDate, virtualAccountPayment.paymentDate) &&
        Objects.equals(this.type, virtualAccountPayment.type) &&
        Objects.equals(this.paymentScheme, virtualAccountPayment.paymentScheme) &&
        Objects.equals(this.amount, virtualAccountPayment.amount) &&
        Objects.equals(this.reference, virtualAccountPayment.reference) &&
        Objects.equals(this.status, virtualAccountPayment.status) &&
        Objects.equals(this.source, virtualAccountPayment.source) &&
        Objects.equals(this.destination, virtualAccountPayment.destination) &&
        Objects.equals(this.originalPaymentId, virtualAccountPayment.originalPaymentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDateTime, paymentDate, type, paymentScheme, amount, reference, status, source, destination, originalPaymentId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccountPayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    originalPaymentId: ").append(toIndentedString(originalPaymentId)).append("\n");
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
