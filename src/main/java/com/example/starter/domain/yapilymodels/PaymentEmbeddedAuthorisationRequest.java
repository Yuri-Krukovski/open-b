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

import java.util.Objects;
import java.util.UUID;

/**
 * The request body containing an &#x60;PaymentEmbeddedAuthorisationRequest&#x60; json payload
 */
@ApiModel(description = "The request body containing an `PaymentEmbeddedAuthorisationRequest` json payload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class PaymentEmbeddedAuthorisationRequest {
  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private UUID userUuid;

  public static final String SERIALIZED_NAME_APPLICATION_USER_ID = "applicationUserId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_USER_ID)
  private String applicationUserId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institutionId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback;

  public static final String SERIALIZED_NAME_REDIRECT = "redirect";
  @SerializedName(SERIALIZED_NAME_REDIRECT)
  private RedirectRequest redirect;

  public static final String SERIALIZED_NAME_ONE_TIME_TOKEN = "oneTimeToken";
  @SerializedName(SERIALIZED_NAME_ONE_TIME_TOKEN)
  private Boolean oneTimeToken;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST = "paymentRequest";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST)
  private PaymentRequest paymentRequest;

  public static final String SERIALIZED_NAME_USER_CREDENTIALS = "userCredentials";
  @SerializedName(SERIALIZED_NAME_USER_CREDENTIALS)
  private UserCredentials userCredentials;

  public static final String SERIALIZED_NAME_SELECTED_SCA_METHOD = "selectedScaMethod";
  @SerializedName(SERIALIZED_NAME_SELECTED_SCA_METHOD)
  private ScaMethod selectedScaMethod;

  public static final String SERIALIZED_NAME_SCA_CODE = "scaCode";
  @SerializedName(SERIALIZED_NAME_SCA_CODE)
  private String scaCode;

  public PaymentEmbeddedAuthorisationRequest() { 
  }

  public PaymentEmbeddedAuthorisationRequest userUuid(UUID userUuid) {
    
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


  public PaymentEmbeddedAuthorisationRequest applicationUserId(String applicationUserId) {
    
    this.applicationUserId = applicationUserId;
    return this;
  }

   /**
   * __Conditional__. The user-friendly reference to the &#x60;User&#x60; that will authorise the authorisation request. If a &#x60;User&#x60; with the specified &#x60;applicationUserId&#x60; exists, it will be used otherwise, a new &#x60;User&#x60; with the specified &#x60;applicationUserId&#x60; will be created and used. Either the &#x60;userUuid&#x60; or &#x60;applicationUserId&#x60; must be provided.
   * @return applicationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-234562290", value = "__Conditional__. The user-friendly reference to the `User` that will authorise the authorisation request. If a `User` with the specified `applicationUserId` exists, it will be used otherwise, a new `User` with the specified `applicationUserId` will be created and used. Either the `userUuid` or `applicationUserId` must be provided.")

  public String getApplicationUserId() {
    return applicationUserId;
  }


  public void setApplicationUserId(String applicationUserId) {
    this.applicationUserId = applicationUserId;
  }


  public PaymentEmbeddedAuthorisationRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * __Mandatory__. The reference to the &#x60;Institution&#x60; which identifies which institution the authorisation request is sent to.
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "yapily-mock", required = true, value = "__Mandatory__. The reference to the `Institution` which identifies which institution the authorisation request is sent to.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public PaymentEmbeddedAuthorisationRequest callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * __Optional__. The server to redirect the user to after the user complete the authorisation at the &#x60;Institution&#x60;. &lt;br&gt;&lt;br&gt;See [Using a callback (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-optional) for more information.
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://display-parameters.com", value = "__Optional__. The server to redirect the user to after the user complete the authorisation at the `Institution`. <br><br>See [Using a callback (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-optional) for more information.")

  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  public PaymentEmbeddedAuthorisationRequest redirect(RedirectRequest redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * Get redirect
   * @return redirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectRequest getRedirect() {
    return redirect;
  }


  public void setRedirect(RedirectRequest redirect) {
    this.redirect = redirect;
  }


  public PaymentEmbeddedAuthorisationRequest oneTimeToken(Boolean oneTimeToken) {
    
    this.oneTimeToken = oneTimeToken;
    return this;
  }

   /**
   * __Conditional__. Used to receive a &#x60;oneTimeToken&#x60; rather than a &#x60;consentToken&#x60; at the &#x60;callback&#x60; for additional security. This can only be used when the &#x60;callback&#x60; is set. &lt;br&gt;&lt;br&gt;See [Using a callback with an OTT (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-with-an-ott-optional) for more information.
   * @return oneTimeToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "__Conditional__. Used to receive a `oneTimeToken` rather than a `consentToken` at the `callback` for additional security. This can only be used when the `callback` is set. <br><br>See [Using a callback with an OTT (Optional)](https://docs.yapily.com/pages/knowledge/yapily-concepts/callback_url/#using-a-callback-with-an-ott-optional) for more information.")

  public Boolean getOneTimeToken() {
    return oneTimeToken;
  }


  public void setOneTimeToken(Boolean oneTimeToken) {
    this.oneTimeToken = oneTimeToken;
  }


  public PaymentEmbeddedAuthorisationRequest paymentRequest(PaymentRequest paymentRequest) {
    
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentRequest getPaymentRequest() {
    return paymentRequest;
  }


  public void setPaymentRequest(PaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  public PaymentEmbeddedAuthorisationRequest userCredentials(UserCredentials userCredentials) {
    
    this.userCredentials = userCredentials;
    return this;
  }

   /**
   * Get userCredentials
   * @return userCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCredentials getUserCredentials() {
    return userCredentials;
  }


  public void setUserCredentials(UserCredentials userCredentials) {
    this.userCredentials = userCredentials;
  }


  public PaymentEmbeddedAuthorisationRequest selectedScaMethod(ScaMethod selectedScaMethod) {
    
    this.selectedScaMethod = selectedScaMethod;
    return this;
  }

   /**
   * Get selectedScaMethod
   * @return selectedScaMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScaMethod getSelectedScaMethod() {
    return selectedScaMethod;
  }


  public void setSelectedScaMethod(ScaMethod selectedScaMethod) {
    this.selectedScaMethod = selectedScaMethod;
  }


  public PaymentEmbeddedAuthorisationRequest scaCode(String scaCode) {
    
    this.scaCode = scaCode;
    return this;
  }

   /**
   * __Conditional__. Used to update the authorisation with the sca code received by the user from the &#x60;Institution&#x60; using the embedded payment authorisation flow.&lt;br&gt;&lt;br&gt;This is the penultimate step required in the embedded payment authorisation flow to authorise the &#x60;Consent&#x60;. After sending the sca code, to obtain an authorised consent, the last step is to poll [Get Consent](https://docs.yapily.com/api/reference/#operation/getConsentById) until the &#x60;Institution&#x60; authorises the request and the &#x60;Consent&#x60; &#x60;status&#x60; transitions to &#x60;AUTHORIZED&#x60;.
   * @return scaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "325614", value = "__Conditional__. Used to update the authorisation with the sca code received by the user from the `Institution` using the embedded payment authorisation flow.<br><br>This is the penultimate step required in the embedded payment authorisation flow to authorise the `Consent`. After sending the sca code, to obtain an authorised consent, the last step is to poll [Get Consent](https://docs.yapily.com/api/reference/#operation/getConsentById) until the `Institution` authorises the request and the `Consent` `status` transitions to `AUTHORIZED`.")

  public String getScaCode() {
    return scaCode;
  }


  public void setScaCode(String scaCode) {
    this.scaCode = scaCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEmbeddedAuthorisationRequest paymentEmbeddedAuthorisationRequest = (PaymentEmbeddedAuthorisationRequest) o;
    return Objects.equals(this.userUuid, paymentEmbeddedAuthorisationRequest.userUuid) &&
        Objects.equals(this.applicationUserId, paymentEmbeddedAuthorisationRequest.applicationUserId) &&
        Objects.equals(this.institutionId, paymentEmbeddedAuthorisationRequest.institutionId) &&
        Objects.equals(this.callback, paymentEmbeddedAuthorisationRequest.callback) &&
        Objects.equals(this.redirect, paymentEmbeddedAuthorisationRequest.redirect) &&
        Objects.equals(this.oneTimeToken, paymentEmbeddedAuthorisationRequest.oneTimeToken) &&
        Objects.equals(this.paymentRequest, paymentEmbeddedAuthorisationRequest.paymentRequest) &&
        Objects.equals(this.userCredentials, paymentEmbeddedAuthorisationRequest.userCredentials) &&
        Objects.equals(this.selectedScaMethod, paymentEmbeddedAuthorisationRequest.selectedScaMethod) &&
        Objects.equals(this.scaCode, paymentEmbeddedAuthorisationRequest.scaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUuid, applicationUserId, institutionId, callback, redirect, oneTimeToken, paymentRequest, userCredentials, selectedScaMethod, scaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEmbeddedAuthorisationRequest {\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    applicationUserId: ").append(toIndentedString(applicationUserId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    oneTimeToken: ").append(toIndentedString(oneTimeToken)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
    sb.append("    userCredentials: ").append(toIndentedString(userCredentials)).append("\n");
    sb.append("    selectedScaMethod: ").append(toIndentedString(selectedScaMethod)).append("\n");
    sb.append("    scaCode: ").append(toIndentedString(scaCode)).append("\n");
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

