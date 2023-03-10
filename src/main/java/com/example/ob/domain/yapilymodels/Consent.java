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
import org.threeten.bp.OffsetDateTime;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Consent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class Consent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private UUID userUuid;

  public static final String SERIALIZED_NAME_APPLICATION_USER_ID = "applicationUserId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_USER_ID)
  private String applicationUserId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institutionId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AuthorisationStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TRANSACTION_FROM = "transactionFrom";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FROM)
  private OffsetDateTime transactionFrom;

  public static final String SERIALIZED_NAME_TRANSACTION_TO = "transactionTo";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TO)
  private OffsetDateTime transactionTo;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_TIME_TO_EXPIRE_IN_MILLIS = "timeToExpireInMillis";
  @SerializedName(SERIALIZED_NAME_TIME_TO_EXPIRE_IN_MILLIS)
  private Long timeToExpireInMillis;

  public static final String SERIALIZED_NAME_TIME_TO_EXPIRE = "timeToExpire";
  @SerializedName(SERIALIZED_NAME_TIME_TO_EXPIRE)
  private String timeToExpire;

  public static final String SERIALIZED_NAME_FEATURE_SCOPE = "featureScope";
  @SerializedName(SERIALIZED_NAME_FEATURE_SCOPE)
  private Set<FeatureEnum> featureScope = null;

  public static final String SERIALIZED_NAME_CONSENT_TOKEN = "consentToken";
  @SerializedName(SERIALIZED_NAME_CONSENT_TOKEN)
  private String consentToken;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_AUTHORIZED_AT = "authorizedAt";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_AT)
  private OffsetDateTime authorizedAt;

  public static final String SERIALIZED_NAME_LAST_CONFIRMED_AT = "lastConfirmedAt";
  @SerializedName(SERIALIZED_NAME_LAST_CONFIRMED_AT)
  private OffsetDateTime lastConfirmedAt;

  public static final String SERIALIZED_NAME_RECONFIRM_BY = "reconfirmBy";
  @SerializedName(SERIALIZED_NAME_RECONFIRM_BY)
  private OffsetDateTime reconfirmBy;

  public static final String SERIALIZED_NAME_INSTITUTION_CONSENT_ID = "institutionConsentId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_CONSENT_ID)
  private String institutionConsentId;

  public Consent() { 
  }

  public Consent id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Consent userUuid(UUID userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }


  public Consent applicationUserId(String applicationUserId) {
    
    this.applicationUserId = applicationUserId;
    return this;
  }

   /**
   * Get applicationUserId
   * @return applicationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplicationUserId() {
    return applicationUserId;
  }


  public void setApplicationUserId(String applicationUserId) {
    this.applicationUserId = applicationUserId;
  }


  public Consent referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public Consent institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Get institutionId
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Consent status(AuthorisationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorisationStatus getStatus() {
    return status;
  }


  public void setStatus(AuthorisationStatus status) {
    this.status = status;
  }


  public Consent createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Consent transactionFrom(OffsetDateTime transactionFrom) {
    
    this.transactionFrom = transactionFrom;
    return this;
  }

   /**
   * Get transactionFrom
   * @return transactionFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTransactionFrom() {
    return transactionFrom;
  }


  public void setTransactionFrom(OffsetDateTime transactionFrom) {
    this.transactionFrom = transactionFrom;
  }


  public Consent transactionTo(OffsetDateTime transactionTo) {
    
    this.transactionTo = transactionTo;
    return this;
  }

   /**
   * Get transactionTo
   * @return transactionTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTransactionTo() {
    return transactionTo;
  }


  public void setTransactionTo(OffsetDateTime transactionTo) {
    this.transactionTo = transactionTo;
  }


  public Consent expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Consent timeToExpireInMillis(Long timeToExpireInMillis) {
    
    this.timeToExpireInMillis = timeToExpireInMillis;
    return this;
  }

   /**
   * Get timeToExpireInMillis
   * @return timeToExpireInMillis
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimeToExpireInMillis() {
    return timeToExpireInMillis;
  }


  public void setTimeToExpireInMillis(Long timeToExpireInMillis) {
    this.timeToExpireInMillis = timeToExpireInMillis;
  }


  public Consent timeToExpire(String timeToExpire) {
    
    this.timeToExpire = timeToExpire;
    return this;
  }

   /**
   * Get timeToExpire
   * @return timeToExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeToExpire() {
    return timeToExpire;
  }


  public void setTimeToExpire(String timeToExpire) {
    this.timeToExpire = timeToExpire;
  }


  public Consent featureScope(Set<FeatureEnum> featureScope) {
    
    this.featureScope = featureScope;
    return this;
  }

  public Consent addFeatureScopeItem(FeatureEnum featureScopeItem) {
    if (this.featureScope == null) {
      this.featureScope = new LinkedHashSet<FeatureEnum>();
    }
    this.featureScope.add(featureScopeItem);
    return this;
  }

   /**
   * Get featureScope
   * @return featureScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<FeatureEnum> getFeatureScope() {
    return featureScope;
  }


  public void setFeatureScope(Set<FeatureEnum> featureScope) {
    this.featureScope = featureScope;
  }


  public Consent consentToken(String consentToken) {
    
    this.consentToken = consentToken;
    return this;
  }

   /**
   * Get consentToken
   * @return consentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentToken() {
    return consentToken;
  }


  public void setConsentToken(String consentToken) {
    this.consentToken = consentToken;
  }


  public Consent state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Consent authorizedAt(OffsetDateTime authorizedAt) {
    
    this.authorizedAt = authorizedAt;
    return this;
  }

   /**
   * Get authorizedAt
   * @return authorizedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAuthorizedAt() {
    return authorizedAt;
  }


  public void setAuthorizedAt(OffsetDateTime authorizedAt) {
    this.authorizedAt = authorizedAt;
  }


  public Consent lastConfirmedAt(OffsetDateTime lastConfirmedAt) {
    
    this.lastConfirmedAt = lastConfirmedAt;
    return this;
  }

   /**
   * The time that the PSU last confirmed access to their account information, either through full authentication with the institution, or through reconfirmation with the TPP.
   * @return lastConfirmedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time that the PSU last confirmed access to their account information, either through full authentication with the institution, or through reconfirmation with the TPP.")

  public OffsetDateTime getLastConfirmedAt() {
    return lastConfirmedAt;
  }


  public void setLastConfirmedAt(OffsetDateTime lastConfirmedAt) {
    this.lastConfirmedAt = lastConfirmedAt;
  }


  public Consent reconfirmBy(OffsetDateTime reconfirmBy) {
    
    this.reconfirmBy = reconfirmBy;
    return this;
  }

   /**
   * The time by which the consent should be reconfirmed to ensure continued access to the account information.
   * @return reconfirmBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time by which the consent should be reconfirmed to ensure continued access to the account information.")

  public OffsetDateTime getReconfirmBy() {
    return reconfirmBy;
  }


  public void setReconfirmBy(OffsetDateTime reconfirmBy) {
    this.reconfirmBy = reconfirmBy;
  }


  public Consent institutionConsentId(String institutionConsentId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consent consent = (Consent) o;
    return Objects.equals(this.id, consent.id) &&
        Objects.equals(this.userUuid, consent.userUuid) &&
        Objects.equals(this.applicationUserId, consent.applicationUserId) &&
        Objects.equals(this.referenceId, consent.referenceId) &&
        Objects.equals(this.institutionId, consent.institutionId) &&
        Objects.equals(this.status, consent.status) &&
        Objects.equals(this.createdAt, consent.createdAt) &&
        Objects.equals(this.transactionFrom, consent.transactionFrom) &&
        Objects.equals(this.transactionTo, consent.transactionTo) &&
        Objects.equals(this.expiresAt, consent.expiresAt) &&
        Objects.equals(this.timeToExpireInMillis, consent.timeToExpireInMillis) &&
        Objects.equals(this.timeToExpire, consent.timeToExpire) &&
        Objects.equals(this.featureScope, consent.featureScope) &&
        Objects.equals(this.consentToken, consent.consentToken) &&
        Objects.equals(this.state, consent.state) &&
        Objects.equals(this.authorizedAt, consent.authorizedAt) &&
        Objects.equals(this.lastConfirmedAt, consent.lastConfirmedAt) &&
        Objects.equals(this.reconfirmBy, consent.reconfirmBy) &&
        Objects.equals(this.institutionConsentId, consent.institutionConsentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userUuid, applicationUserId, referenceId, institutionId, status, createdAt, transactionFrom, transactionTo, expiresAt, timeToExpireInMillis, timeToExpire, featureScope, consentToken, state, authorizedAt, lastConfirmedAt, reconfirmBy, institutionConsentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    applicationUserId: ").append(toIndentedString(applicationUserId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    transactionFrom: ").append(toIndentedString(transactionFrom)).append("\n");
    sb.append("    transactionTo: ").append(toIndentedString(transactionTo)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    timeToExpireInMillis: ").append(toIndentedString(timeToExpireInMillis)).append("\n");
    sb.append("    timeToExpire: ").append(toIndentedString(timeToExpire)).append("\n");
    sb.append("    featureScope: ").append(toIndentedString(featureScope)).append("\n");
    sb.append("    consentToken: ").append(toIndentedString(consentToken)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    authorizedAt: ").append(toIndentedString(authorizedAt)).append("\n");
    sb.append("    lastConfirmedAt: ").append(toIndentedString(lastConfirmedAt)).append("\n");
    sb.append("    reconfirmBy: ").append(toIndentedString(reconfirmBy)).append("\n");
    sb.append("    institutionConsentId: ").append(toIndentedString(institutionConsentId)).append("\n");
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

