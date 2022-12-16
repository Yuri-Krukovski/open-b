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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * __Mandatory__. The payment pre authorisation request object defining the details of the payment and pre auth.
 */
@ApiModel(description = "__Mandatory__. The payment pre authorisation request object defining the details of the payment and pre auth.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class PaymentPreAuthorisationRequest {
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

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private PayeeDetails payee;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private PayerDetails payer;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public PaymentPreAuthorisationRequest() { 
  }

  public PaymentPreAuthorisationRequest userUuid(UUID userUuid) {
    
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


  public PaymentPreAuthorisationRequest applicationUserId(String applicationUserId) {
    
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


  public PaymentPreAuthorisationRequest forwardParameters(List<String> forwardParameters) {
    
    this.forwardParameters = forwardParameters;
    return this;
  }

  public PaymentPreAuthorisationRequest addForwardParametersItem(String forwardParametersItem) {
    if (this.forwardParameters == null) {
      this.forwardParameters = new ArrayList<String>();
    }
    this.forwardParameters.add(forwardParametersItem);
    return this;
  }

   /**
   * Get forwardParameters
   * @return forwardParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getForwardParameters() {
    return forwardParameters;
  }


  public void setForwardParameters(List<String> forwardParameters) {
    this.forwardParameters = forwardParameters;
  }


  public PaymentPreAuthorisationRequest institutionId(String institutionId) {
    
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


  public PaymentPreAuthorisationRequest callback(String callback) {
    
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


  public PaymentPreAuthorisationRequest redirect(RedirectRequest redirect) {
    
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


  public PaymentPreAuthorisationRequest oneTimeToken(Boolean oneTimeToken) {
    
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


  public PaymentPreAuthorisationRequest scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * __Mandatory__. Defines the scope of the pre-authorisation request.
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AIS", required = true, value = "__Mandatory__. Defines the scope of the pre-authorisation request.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public PaymentPreAuthorisationRequest payee(PayeeDetails payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PayeeDetails getPayee() {
    return payee;
  }


  public void setPayee(PayeeDetails payee) {
    this.payee = payee;
  }


  public PaymentPreAuthorisationRequest payer(PayerDetails payer) {
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PayerDetails getPayer() {
    return payer;
  }


  public void setPayer(PayerDetails payer) {
    this.payer = payer;
  }


  public PaymentPreAuthorisationRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PaymentPreAuthorisationRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * __Mandatory__. The payment reference or description. Limited to a maximum of 18 characters long.
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bill payment", required = true, value = "__Mandatory__. The payment reference or description. Limited to a maximum of 18 characters long.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPreAuthorisationRequest paymentPreAuthorisationRequest = (PaymentPreAuthorisationRequest) o;
    return Objects.equals(this.userUuid, paymentPreAuthorisationRequest.userUuid) &&
        Objects.equals(this.applicationUserId, paymentPreAuthorisationRequest.applicationUserId) &&
        Objects.equals(this.forwardParameters, paymentPreAuthorisationRequest.forwardParameters) &&
        Objects.equals(this.institutionId, paymentPreAuthorisationRequest.institutionId) &&
        Objects.equals(this.callback, paymentPreAuthorisationRequest.callback) &&
        Objects.equals(this.redirect, paymentPreAuthorisationRequest.redirect) &&
        Objects.equals(this.oneTimeToken, paymentPreAuthorisationRequest.oneTimeToken) &&
        Objects.equals(this.scope, paymentPreAuthorisationRequest.scope) &&
        Objects.equals(this.payee, paymentPreAuthorisationRequest.payee) &&
        Objects.equals(this.payer, paymentPreAuthorisationRequest.payer) &&
        Objects.equals(this.amount, paymentPreAuthorisationRequest.amount) &&
        Objects.equals(this.reference, paymentPreAuthorisationRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUuid, applicationUserId, forwardParameters, institutionId, callback, redirect, oneTimeToken, scope, payee, payer, amount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPreAuthorisationRequest {\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    applicationUserId: ").append(toIndentedString(applicationUserId)).append("\n");
    sb.append("    forwardParameters: ").append(toIndentedString(forwardParameters)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    oneTimeToken: ").append(toIndentedString(oneTimeToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
