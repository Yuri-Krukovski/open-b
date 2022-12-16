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

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * VirtualAccountPaymentDestination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccountPaymentDestination {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_IDENTIFICATIONS = "accountIdentifications";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDENTIFICATIONS)
  private Set<AccountIdentification> accountIdentifications = null;

  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiaryId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public VirtualAccountPaymentDestination() { 
  }

  public VirtualAccountPaymentDestination type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of destination for a payment. One of ACCOUNT, EXTERNAL or BENEFICIARY
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EXTERNAL", required = true, value = "Type of destination for a payment. One of ACCOUNT, EXTERNAL or BENEFICIARY")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VirtualAccountPaymentDestination accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Only present if type is ACCOUNT. Identifies the Virtual Account to which the payment was made
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eb2ad083-a111-4143-8756-a3a3cef4031c", value = "Only present if type is ACCOUNT. Identifies the Virtual Account to which the payment was made")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public VirtualAccountPaymentDestination accountIdentifications(Set<AccountIdentification> accountIdentifications) {
    
    this.accountIdentifications = accountIdentifications;
    return this;
  }

  public VirtualAccountPaymentDestination addAccountIdentificationsItem(AccountIdentification accountIdentificationsItem) {
    if (this.accountIdentifications == null) {
      this.accountIdentifications = new LinkedHashSet<AccountIdentification>();
    }
    this.accountIdentifications.add(accountIdentificationsItem);
    return this;
  }

   /**
   * Only present if type is EXTERNAL. The account identifications that identify an external destination
   * @return accountIdentifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"identification\":\"401016\",\"type\":\"SORT_CODE\"},{\"identification\":\"71518920\",\"type\":\"ACCOUNT_NUMBER\"}]", value = "Only present if type is EXTERNAL. The account identifications that identify an external destination")

  public Set<AccountIdentification> getAccountIdentifications() {
    return accountIdentifications;
  }


  public void setAccountIdentifications(Set<AccountIdentification> accountIdentifications) {
    this.accountIdentifications = accountIdentifications;
  }


  public VirtualAccountPaymentDestination beneficiaryId(String beneficiaryId) {
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * Only present if type is BENEFICIARY. Unique id of the beneficiary
   * @return beneficiaryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sd6ad034-a111-4143-8756-a3a3cef4045v", value = "Only present if type is BENEFICIARY. Unique id of the beneficiary")

  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccountPaymentDestination virtualAccountPaymentDestination = (VirtualAccountPaymentDestination) o;
    return Objects.equals(this.type, virtualAccountPaymentDestination.type) &&
        Objects.equals(this.accountId, virtualAccountPaymentDestination.accountId) &&
        Objects.equals(this.accountIdentifications, virtualAccountPaymentDestination.accountIdentifications) &&
        Objects.equals(this.beneficiaryId, virtualAccountPaymentDestination.beneficiaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accountId, accountIdentifications, beneficiaryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccountPaymentDestination {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdentifications: ").append(toIndentedString(accountIdentifications)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
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

