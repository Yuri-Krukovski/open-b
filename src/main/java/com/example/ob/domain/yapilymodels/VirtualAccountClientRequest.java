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

import java.util.Objects;

/**
 * VirtualAccountClientRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class VirtualAccountClientRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VirtualAccountClientType type;

  public static final String SERIALIZED_NAME_INDIVIDUAL = "individual";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL)
  private VirtualAccountIndividualClient individual;

  public static final String SERIALIZED_NAME_BUSINESS = "business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private VirtualAccountBusinessClient business;

  public VirtualAccountClientRequest() { 
  }

  public VirtualAccountClientRequest type(VirtualAccountClientType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualAccountClientType getType() {
    return type;
  }


  public void setType(VirtualAccountClientType type) {
    this.type = type;
  }


  public VirtualAccountClientRequest individual(VirtualAccountIndividualClient individual) {
    
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountIndividualClient getIndividual() {
    return individual;
  }


  public void setIndividual(VirtualAccountIndividualClient individual) {
    this.individual = individual;
  }


  public VirtualAccountClientRequest business(VirtualAccountBusinessClient business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountBusinessClient getBusiness() {
    return business;
  }


  public void setBusiness(VirtualAccountBusinessClient business) {
    this.business = business;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualAccountClientRequest virtualAccountClientRequest = (VirtualAccountClientRequest) o;
    return Objects.equals(this.type, virtualAccountClientRequest.type) &&
        Objects.equals(this.individual, virtualAccountClientRequest.individual) &&
        Objects.equals(this.business, virtualAccountClientRequest.business);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, individual, business);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualAccountClientRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
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

