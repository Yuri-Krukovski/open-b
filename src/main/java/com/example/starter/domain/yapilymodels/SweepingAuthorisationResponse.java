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

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * SweepingAuthorisationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class SweepingAuthorisationResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_APPLICATION_USER_ID = "applicationUserId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_USER_ID)
  private String applicationUserId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institutionId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AuthorisationStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

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

  public static final String SERIALIZED_NAME_INSTITUTION_CONSENT_ID = "institutionConsentId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_CONSENT_ID)
  private String institutionConsentId;

  public static final String SERIALIZED_NAME_AUTHORISATION_URL = "authorisationUrl";
  @SerializedName(SERIALIZED_NAME_AUTHORISATION_URL)
  private String authorisationUrl;

  public static final String SERIALIZED_NAME_QR_CODE_URL = "qrCodeUrl";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL)
  private String qrCodeUrl;

  public static final String SERIALIZED_NAME_CONTROL_PARAMETERS = "controlParameters";
  @SerializedName(SERIALIZED_NAME_CONTROL_PARAMETERS)
  private SweepingControlParameters controlParameters;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private Payer payer;

  public static final String SERIALIZED_NAME_INITIATION_DETAILS = "initiationDetails";
  @SerializedName(SERIALIZED_NAME_INITIATION_DETAILS)
  private InitiationDetails initiationDetails;

  public SweepingAuthorisationResponse() { 
  }

  public SweepingAuthorisationResponse id(UUID id) {
    
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


  public SweepingAuthorisationResponse userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * This is the Yapily user identifier for the user returned by the create user step POST ../users
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the Yapily user identifier for the user returned by the create user step POST ../users")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public SweepingAuthorisationResponse applicationUserId(String applicationUserId) {
    
    this.applicationUserId = applicationUserId;
    return this;
  }

   /**
   * A client&#39;s own user reference. If the client wants to work with their own unique references for individual PSUs then they can use the applicationUserId property to provide that value. Where Yapily does not already have a Yapily userId that matches the supplied applicationUserId, then a new Yapily userId is created automatically and linked to the applicationUserId value.  Clients can then use either their own applicationUserId or the Yapily userId to reference the same user in future calls.
   * @return applicationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A client's own user reference. If the client wants to work with their own unique references for individual PSUs then they can use the applicationUserId property to provide that value. Where Yapily does not already have a Yapily userId that matches the supplied applicationUserId, then a new Yapily userId is created automatically and linked to the applicationUserId value.  Clients can then use either their own applicationUserId or the Yapily userId to reference the same user in future calls.")

  public String getApplicationUserId() {
    return applicationUserId;
  }


  public void setApplicationUserId(String applicationUserId) {
    this.applicationUserId = applicationUserId;
  }


  public SweepingAuthorisationResponse institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The reference to the Institution which identifies which institution the authorisation request is sent to.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference to the Institution which identifies which institution the authorisation request is sent to.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public SweepingAuthorisationResponse status(AuthorisationStatus status) {
    
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


  public SweepingAuthorisationResponse createdAt(OffsetDateTime createdAt) {
    
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


  public SweepingAuthorisationResponse featureScope(Set<FeatureEnum> featureScope) {
    
    this.featureScope = featureScope;
    return this;
  }

  public SweepingAuthorisationResponse addFeatureScopeItem(FeatureEnum featureScopeItem) {
    if (this.featureScope == null) {
      this.featureScope = new LinkedHashSet<FeatureEnum>();
    }
    this.featureScope.add(featureScopeItem);
    return this;
  }

   /**
   * __Optional__. Used to granularly specify the set of features that the user will give their consent for when requesting access to their account information. Depending on the &#x60;Institution&#x60;, this may also populate a consent screen which list these scopes before the user authorises.&lt;br&gt;&lt;br&gt;This endpoint accepts allow all [Financial Data Features](/guides/financial-data/features/#feature-list) that the &#x60;Institution&#x60; supports.To find out which scopes an &#x60;Institution&#x60; supports, check [GET Institution](./#get-institution).
   * @return featureScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "__Optional__. Used to granularly specify the set of features that the user will give their consent for when requesting access to their account information. Depending on the `Institution`, this may also populate a consent screen which list these scopes before the user authorises.<br><br>This endpoint accepts allow all [Financial Data Features](/guides/financial-data/features/#feature-list) that the `Institution` supports.To find out which scopes an `Institution` supports, check [GET Institution](./#get-institution).")

  public Set<FeatureEnum> getFeatureScope() {
    return featureScope;
  }


  public void setFeatureScope(Set<FeatureEnum> featureScope) {
    this.featureScope = featureScope;
  }


  public SweepingAuthorisationResponse consentToken(String consentToken) {
    
    this.consentToken = consentToken;
    return this;
  }

   /**
   * The &#x60;consent-token&#x60; containing the user&#39;s authorisation to make the payment request.
   * @return consentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `consent-token` containing the user's authorisation to make the payment request.")

  public String getConsentToken() {
    return consentToken;
  }


  public void setConsentToken(String consentToken) {
    this.consentToken = consentToken;
  }


  public SweepingAuthorisationResponse state(String state) {
    
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


  public SweepingAuthorisationResponse authorizedAt(OffsetDateTime authorizedAt) {
    
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


  public SweepingAuthorisationResponse institutionConsentId(String institutionConsentId) {
    
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


  public SweepingAuthorisationResponse authorisationUrl(String authorisationUrl) {
    
    this.authorisationUrl = authorisationUrl;
    return this;
  }

   /**
   * Get authorisationUrl
   * @return authorisationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorisationUrl() {
    return authorisationUrl;
  }


  public void setAuthorisationUrl(String authorisationUrl) {
    this.authorisationUrl = authorisationUrl;
  }


  public SweepingAuthorisationResponse qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * Get qrCodeUrl
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


  public SweepingAuthorisationResponse controlParameters(SweepingControlParameters controlParameters) {
    
    this.controlParameters = controlParameters;
    return this;
  }

   /**
   * Get controlParameters
   * @return controlParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SweepingControlParameters getControlParameters() {
    return controlParameters;
  }


  public void setControlParameters(SweepingControlParameters controlParameters) {
    this.controlParameters = controlParameters;
  }


  public SweepingAuthorisationResponse payer(Payer payer) {
    
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


  public SweepingAuthorisationResponse initiationDetails(InitiationDetails initiationDetails) {
    
    this.initiationDetails = initiationDetails;
    return this;
  }

   /**
   * Get initiationDetails
   * @return initiationDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InitiationDetails getInitiationDetails() {
    return initiationDetails;
  }


  public void setInitiationDetails(InitiationDetails initiationDetails) {
    this.initiationDetails = initiationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepingAuthorisationResponse sweepingAuthorisationResponse = (SweepingAuthorisationResponse) o;
    return Objects.equals(this.id, sweepingAuthorisationResponse.id) &&
        Objects.equals(this.userId, sweepingAuthorisationResponse.userId) &&
        Objects.equals(this.applicationUserId, sweepingAuthorisationResponse.applicationUserId) &&
        Objects.equals(this.institutionId, sweepingAuthorisationResponse.institutionId) &&
        Objects.equals(this.status, sweepingAuthorisationResponse.status) &&
        Objects.equals(this.createdAt, sweepingAuthorisationResponse.createdAt) &&
        Objects.equals(this.featureScope, sweepingAuthorisationResponse.featureScope) &&
        Objects.equals(this.consentToken, sweepingAuthorisationResponse.consentToken) &&
        Objects.equals(this.state, sweepingAuthorisationResponse.state) &&
        Objects.equals(this.authorizedAt, sweepingAuthorisationResponse.authorizedAt) &&
        Objects.equals(this.institutionConsentId, sweepingAuthorisationResponse.institutionConsentId) &&
        Objects.equals(this.authorisationUrl, sweepingAuthorisationResponse.authorisationUrl) &&
        Objects.equals(this.qrCodeUrl, sweepingAuthorisationResponse.qrCodeUrl) &&
        Objects.equals(this.controlParameters, sweepingAuthorisationResponse.controlParameters) &&
        Objects.equals(this.payer, sweepingAuthorisationResponse.payer) &&
        Objects.equals(this.initiationDetails, sweepingAuthorisationResponse.initiationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, applicationUserId, institutionId, status, createdAt, featureScope, consentToken, state, authorizedAt, institutionConsentId, authorisationUrl, qrCodeUrl, controlParameters, payer, initiationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepingAuthorisationResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    applicationUserId: ").append(toIndentedString(applicationUserId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    featureScope: ").append(toIndentedString(featureScope)).append("\n");
    sb.append("    consentToken: ").append(toIndentedString(consentToken)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    authorizedAt: ").append(toIndentedString(authorizedAt)).append("\n");
    sb.append("    institutionConsentId: ").append(toIndentedString(institutionConsentId)).append("\n");
    sb.append("    authorisationUrl: ").append(toIndentedString(authorisationUrl)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    controlParameters: ").append(toIndentedString(controlParameters)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    initiationDetails: ").append(toIndentedString(initiationDetails)).append("\n");
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
