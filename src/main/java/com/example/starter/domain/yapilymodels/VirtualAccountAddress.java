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
 * VirtualAccountAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccountAddress {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_TOWN_NAME = "townName";
  @SerializedName(SERIALIZED_NAME_TOWN_NAME)
  private String townName;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public VirtualAccountAddress() { 
  }

  public VirtualAccountAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * __Mandatory__. AddressLine1 of the sub-client
   * @return addressLine1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12 New Street", required = true, value = "__Mandatory__. AddressLine1 of the sub-client")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public VirtualAccountAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * __Optional__. AddressLine2 of the sub-client
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Barcelona CA 08005", value = "__Optional__. AddressLine2 of the sub-client")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public VirtualAccountAddress townName(String townName) {
    
    this.townName = townName;
    return this;
  }

   /**
   * __Mandatory__. Town name of the sub-client
   * @return townName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Barcelona ", required = true, value = "__Mandatory__. Town name of the sub-client")

  public String getTownName() {
    return townName;
  }


  public void setTownName(String townName) {
    this.townName = townName;
  }


  public VirtualAccountAddress postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * __Optional__. Address postcode of the sub-client
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "08005", value = "__Optional__. Address postcode of the sub-client")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public VirtualAccountAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * __Optional__. Country of the sub-client
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ES", required = true, value = "__Optional__. Country of the sub-client")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccountAddress virtualAccountAddress = (VirtualAccountAddress) o;
    return Objects.equals(this.addressLine1, virtualAccountAddress.addressLine1) &&
        Objects.equals(this.addressLine2, virtualAccountAddress.addressLine2) &&
        Objects.equals(this.townName, virtualAccountAddress.townName) &&
        Objects.equals(this.postCode, virtualAccountAddress.postCode) &&
        Objects.equals(this.country, virtualAccountAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, townName, postCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccountAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
