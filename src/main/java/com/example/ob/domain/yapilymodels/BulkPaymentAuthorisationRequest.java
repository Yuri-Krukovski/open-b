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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * BulkPaymentAuthorisationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class BulkPaymentAuthorisationRequest {
  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private UUID userUuid;

  public static final String SERIALIZED_NAME_APPLICATION_USER_ID = "applicationUserId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_USER_ID)
  private String applicationUserId;

  public static final String SERIALIZED_NAME_FORWARD_PARAMETERS = "forwardParameters";
  @SerializedName(SERIALIZED_NAME_FORWARD_PARAMETERS)
  private List<String> forwardParameters = null;

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
  private BulkPaymentRequest paymentRequest;

  public BulkPaymentAuthorisationRequest() { 
  }

  public BulkPaymentAuthorisationRequest userUuid(UUID userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * __Conditional__. The reference to the &#x60;User&#x60; that will authorise the authorisation request using the Yapily generated UUID. Either the &#x60;userUuid&#x60; or &#x60;applicationUserId&#x60; must be provided.
   * @return userUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e006a012-c306-4355-a6a1-99bf69ae5171", value = "__Conditional__. The reference to the `User` that will authorise the authorisation request using the Yapily generated UUID. Either the `userUuid` or `applicationUserId` must be provided.")

  public UUID getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }


  public BulkPaymentAuthorisationRequest applicationUserId(String applicationUserId) {
    
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


  public BulkPaymentAuthorisationRequest forwardParameters(List<String> forwardParameters) {
    
    this.forwardParameters = forwardParameters;
    return this;
  }

  public BulkPaymentAuthorisationRequest addForwardParametersItem(String forwardParametersItem) {
    if (this.forwardParameters == null) {
      this.forwardParameters = new ArrayList<String>();
    }
    this.forwardParameters.add(forwardParametersItem);
    return this;
  }

   /**
   * Extra parameters the TPP may want to get forwarded in the callback request after the PSU redirect.
   * @return forwardParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra parameters the TPP may want to get forwarded in the callback request after the PSU redirect.")

  public List<String> getForwardParameters() {
    return forwardParameters;
  }


  public void setForwardParameters(List<String> forwardParameters) {
    this.forwardParameters = forwardParameters;
  }


  public BulkPaymentAuthorisationRequest institutionId(String institutionId) {
    
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


  public BulkPaymentAuthorisationRequest callback(String callback) {
    
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


  public BulkPaymentAuthorisationRequest redirect(RedirectRequest redirect) {
    
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


  public BulkPaymentAuthorisationRequest oneTimeToken(Boolean oneTimeToken) {
    
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


  public BulkPaymentAuthorisationRequest paymentRequest(BulkPaymentRequest paymentRequest) {
    
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BulkPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }


  public void setPaymentRequest(BulkPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPaymentAuthorisationRequest bulkPaymentAuthorisationRequest = (BulkPaymentAuthorisationRequest) o;
    return Objects.equals(this.userUuid, bulkPaymentAuthorisationRequest.userUuid) &&
        Objects.equals(this.applicationUserId, bulkPaymentAuthorisationRequest.applicationUserId) &&
        Objects.equals(this.forwardParameters, bulkPaymentAuthorisationRequest.forwardParameters) &&
        Objects.equals(this.institutionId, bulkPaymentAuthorisationRequest.institutionId) &&
        Objects.equals(this.callback, bulkPaymentAuthorisationRequest.callback) &&
        Objects.equals(this.redirect, bulkPaymentAuthorisationRequest.redirect) &&
        Objects.equals(this.oneTimeToken, bulkPaymentAuthorisationRequest.oneTimeToken) &&
        Objects.equals(this.paymentRequest, bulkPaymentAuthorisationRequest.paymentRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUuid, applicationUserId, forwardParameters, institutionId, callback, redirect, oneTimeToken, paymentRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPaymentAuthorisationRequest {\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    applicationUserId: ").append(toIndentedString(applicationUserId)).append("\n");
    sb.append("    forwardParameters: ").append(toIndentedString(forwardParameters)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    oneTimeToken: ").append(toIndentedString(oneTimeToken)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
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
