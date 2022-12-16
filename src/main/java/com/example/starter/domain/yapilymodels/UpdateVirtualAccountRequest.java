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

import java.util.Objects;

/**
 * UpdateVirtualAccountRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class UpdateVirtualAccountRequest {
  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public UpdateVirtualAccountRequest() { 
  }

  public UpdateVirtualAccountRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * New reference that can be provided in order to help with identification of the account
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyAccount123", value = "New reference that can be provided in order to help with identification of the account")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public UpdateVirtualAccountRequest status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * New state of the Account: CLOSED - The account has been permanently closed and cannot be used
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CLOSED", value = "New state of the Account: CLOSED - The account has been permanently closed and cannot be used")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVirtualAccountRequest updateVirtualAccountRequest = (UpdateVirtualAccountRequest) o;
    return Objects.equals(this.nickname, updateVirtualAccountRequest.nickname) &&
        Objects.equals(this.status, updateVirtualAccountRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVirtualAccountRequest {\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

