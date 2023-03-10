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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VirtualAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_DATE_TIME = "createdDateTime";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE_TIME)
  private OffsetDateTime createdDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<VirtualAccountBalance> balances = null;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private VirtualAccountBankAccount bankAccount;

  public VirtualAccount() { 
  }

  public VirtualAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique id of the account
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eb2ad083-a111-4143-8756-a3a3cef4031c", value = "Unique id of the account")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VirtualAccount createdDateTime(OffsetDateTime createdDateTime) {
    
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Date and time that the account was created
   * @return createdDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-24T00:30:19.951Z", value = "Date and time that the account was created")

  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }


  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  public VirtualAccount status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current state of the Account &lt;br&gt; PENDING - Creation of the account is in progress &lt;br&gt; ACTIVE - The account is active and in use &lt;br&gt; FAILED - An issue occured during account creation &lt;br&gt; SUSPENDED - The account has been temporarily suspended by the account provider. It cannot currently be used &lt;br&gt; CLOSED - The account has been permanently closed and cannot be used
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "The current state of the Account <br> PENDING - Creation of the account is in progress <br> ACTIVE - The account is active and in use <br> FAILED - An issue occured during account creation <br> SUSPENDED - The account has been temporarily suspended by the account provider. It cannot currently be used <br> CLOSED - The account has been permanently closed and cannot be used")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VirtualAccount nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Reference that can be provided in order to help with identification of the account
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyAccount123", value = "Reference that can be provided in order to help with identification of the account")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public VirtualAccount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Three-letter ISO 4217 currency code
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GBP", value = "Three-letter ISO 4217 currency code")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public VirtualAccount balances(List<VirtualAccountBalance> balances) {
    
    this.balances = balances;
    return this;
  }

  public VirtualAccount addBalancesItem(VirtualAccountBalance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<VirtualAccountBalance>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualAccountBalance> getBalances() {
    return balances;
  }


  public void setBalances(List<VirtualAccountBalance> balances) {
    this.balances = balances;
  }


  public VirtualAccount bankAccount(VirtualAccountBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(VirtualAccountBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccount virtualAccount = (VirtualAccount) o;
    return Objects.equals(this.id, virtualAccount.id) &&
        Objects.equals(this.createdDateTime, virtualAccount.createdDateTime) &&
        Objects.equals(this.status, virtualAccount.status) &&
        Objects.equals(this.nickname, virtualAccount.nickname) &&
        Objects.equals(this.currency, virtualAccount.currency) &&
        Objects.equals(this.balances, virtualAccount.balances) &&
        Objects.equals(this.bankAccount, virtualAccount.bankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDateTime, status, nickname, currency, balances, bankAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
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

