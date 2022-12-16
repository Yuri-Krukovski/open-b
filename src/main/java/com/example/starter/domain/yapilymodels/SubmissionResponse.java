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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * SubmissionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class SubmissionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAYMENT_IDEMPOTENCY_ID = "paymentIdempotencyId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_IDEMPOTENCY_ID)
  private String paymentIdempotencyId;

  public static final String SERIALIZED_NAME_INSTITUTION_CONSENT_ID = "institutionConsentId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_CONSENT_ID)
  private String institutionConsentId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentStatus status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "statusDetails";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private PaymentStatusDetails statusDetails;

  public static final String SERIALIZED_NAME_INITIATION_DETAILS = "initiationDetails";
  @SerializedName(SERIALIZED_NAME_INITIATION_DETAILS)
  private InitiationDetails initiationDetails;

  public static final String SERIALIZED_NAME_SUBMISSION_DETAILS = "submissionDetails";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_DETAILS)
  private SubmissionDetails submissionDetails;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private Payer payer;

  public static final String SERIALIZED_NAME_REFUND_ACCOUNT = "refundAccount";
  @SerializedName(SERIALIZED_NAME_REFUND_ACCOUNT)
  private RefundAccount refundAccount;

  public static final String SERIALIZED_NAME_EXPECTED_EXECUTION_TIME = "expectedExecutionTime";
  @SerializedName(SERIALIZED_NAME_EXPECTED_EXECUTION_TIME)
  private OffsetDateTime expectedExecutionTime;

  public static final String SERIALIZED_NAME_EXPECTED_SETTLEMENT_TIME = "expectedSettlementTime";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SETTLEMENT_TIME)
  private OffsetDateTime expectedSettlementTime;

  public SubmissionResponse() { 
  }

  public SubmissionResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubmissionResponse paymentIdempotencyId(String paymentIdempotencyId) {
    
    this.paymentIdempotencyId = paymentIdempotencyId;
    return this;
  }

   /**
   * Get paymentIdempotencyId
   * @return paymentIdempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentIdempotencyId() {
    return paymentIdempotencyId;
  }


  public void setPaymentIdempotencyId(String paymentIdempotencyId) {
    this.paymentIdempotencyId = paymentIdempotencyId;
  }


  public SubmissionResponse institutionConsentId(String institutionConsentId) {
    
    this.institutionConsentId = institutionConsentId;
    return this;
  }

   /**
   * Get institutionConsentId
   * @return institutionConsentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstitutionConsentId() {
    return institutionConsentId;
  }


  public void setInstitutionConsentId(String institutionConsentId) {
    this.institutionConsentId = institutionConsentId;
  }


  public SubmissionResponse status(PaymentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentStatus status) {
    this.status = status;
  }


  public SubmissionResponse statusDetails(PaymentStatusDetails statusDetails) {
    
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentStatusDetails getStatusDetails() {
    return statusDetails;
  }


  public void setStatusDetails(PaymentStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }


  public SubmissionResponse initiationDetails(InitiationDetails initiationDetails) {
    
    this.initiationDetails = initiationDetails;
    return this;
  }

   /**
   * Get initiationDetails
   * @return initiationDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InitiationDetails getInitiationDetails() {
    return initiationDetails;
  }


  public void setInitiationDetails(InitiationDetails initiationDetails) {
    this.initiationDetails = initiationDetails;
  }


  public SubmissionResponse submissionDetails(SubmissionDetails submissionDetails) {
    
    this.submissionDetails = submissionDetails;
    return this;
  }

   /**
   * Get submissionDetails
   * @return submissionDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubmissionDetails getSubmissionDetails() {
    return submissionDetails;
  }


  public void setSubmissionDetails(SubmissionDetails submissionDetails) {
    this.submissionDetails = submissionDetails;
  }


  public SubmissionResponse payer(Payer payer) {
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Payer getPayer() {
    return payer;
  }


  public void setPayer(Payer payer) {
    this.payer = payer;
  }


  public SubmissionResponse refundAccount(RefundAccount refundAccount) {
    
    this.refundAccount = refundAccount;
    return this;
  }

   /**
   * Get refundAccount
   * @return refundAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RefundAccount getRefundAccount() {
    return refundAccount;
  }


  public void setRefundAccount(RefundAccount refundAccount) {
    this.refundAccount = refundAccount;
  }


  public SubmissionResponse expectedExecutionTime(OffsetDateTime expectedExecutionTime) {
    
    this.expectedExecutionTime = expectedExecutionTime;
    return this;
  }

   /**
   * Get expectedExecutionTime
   * @return expectedExecutionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpectedExecutionTime() {
    return expectedExecutionTime;
  }


  public void setExpectedExecutionTime(OffsetDateTime expectedExecutionTime) {
    this.expectedExecutionTime = expectedExecutionTime;
  }


  public SubmissionResponse expectedSettlementTime(OffsetDateTime expectedSettlementTime) {
    
    this.expectedSettlementTime = expectedSettlementTime;
    return this;
  }

   /**
   * Get expectedSettlementTime
   * @return expectedSettlementTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpectedSettlementTime() {
    return expectedSettlementTime;
  }


  public void setExpectedSettlementTime(OffsetDateTime expectedSettlementTime) {
    this.expectedSettlementTime = expectedSettlementTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionResponse submissionResponse = (SubmissionResponse) o;
    return Objects.equals(this.id, submissionResponse.id) &&
        Objects.equals(this.paymentIdempotencyId, submissionResponse.paymentIdempotencyId) &&
        Objects.equals(this.institutionConsentId, submissionResponse.institutionConsentId) &&
        Objects.equals(this.status, submissionResponse.status) &&
        Objects.equals(this.statusDetails, submissionResponse.statusDetails) &&
        Objects.equals(this.initiationDetails, submissionResponse.initiationDetails) &&
        Objects.equals(this.submissionDetails, submissionResponse.submissionDetails) &&
        Objects.equals(this.payer, submissionResponse.payer) &&
        Objects.equals(this.refundAccount, submissionResponse.refundAccount) &&
        Objects.equals(this.expectedExecutionTime, submissionResponse.expectedExecutionTime) &&
        Objects.equals(this.expectedSettlementTime, submissionResponse.expectedSettlementTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentIdempotencyId, institutionConsentId, status, statusDetails, initiationDetails, submissionDetails, payer, refundAccount, expectedExecutionTime, expectedSettlementTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentIdempotencyId: ").append(toIndentedString(paymentIdempotencyId)).append("\n");
    sb.append("    institutionConsentId: ").append(toIndentedString(institutionConsentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    initiationDetails: ").append(toIndentedString(initiationDetails)).append("\n");
    sb.append("    submissionDetails: ").append(toIndentedString(submissionDetails)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    refundAccount: ").append(toIndentedString(refundAccount)).append("\n");
    sb.append("    expectedExecutionTime: ").append(toIndentedString(expectedExecutionTime)).append("\n");
    sb.append("    expectedSettlementTime: ").append(toIndentedString(expectedSettlementTime)).append("\n");
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
