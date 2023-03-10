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

/**
 * ApiResponseOfVirtualAccountBeneficiary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class ApiResponseOfVirtualAccountBeneficiary {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ResponseMeta meta;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VirtualAccountBeneficiary data;

  public static final String SERIALIZED_NAME_FORWARDED_DATA = "forwardedData";
  @SerializedName(SERIALIZED_NAME_FORWARDED_DATA)
  private List<ResponseForwardedData> forwardedData = null;

  public static final String SERIALIZED_NAME_TRACING_ID = "tracingId";
  @SerializedName(SERIALIZED_NAME_TRACING_ID)
  private String tracingId;

  public ApiResponseOfVirtualAccountBeneficiary() { 
  }

  public ApiResponseOfVirtualAccountBeneficiary meta(ResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(ResponseMeta meta) {
    this.meta = meta;
  }


  public ApiResponseOfVirtualAccountBeneficiary data(VirtualAccountBeneficiary data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualAccountBeneficiary getData() {
    return data;
  }


  public void setData(VirtualAccountBeneficiary data) {
    this.data = data;
  }


  public ApiResponseOfVirtualAccountBeneficiary forwardedData(List<ResponseForwardedData> forwardedData) {
    
    this.forwardedData = forwardedData;
    return this;
  }

  public ApiResponseOfVirtualAccountBeneficiary addForwardedDataItem(ResponseForwardedData forwardedDataItem) {
    if (this.forwardedData == null) {
      this.forwardedData = new ArrayList<ResponseForwardedData>();
    }
    this.forwardedData.add(forwardedDataItem);
    return this;
  }

   /**
   * Get forwardedData
   * @return forwardedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResponseForwardedData> getForwardedData() {
    return forwardedData;
  }


  public void setForwardedData(List<ResponseForwardedData> forwardedData) {
    this.forwardedData = forwardedData;
  }


  public ApiResponseOfVirtualAccountBeneficiary tracingId(String tracingId) {
    
    this.tracingId = tracingId;
    return this;
  }

   /**
   * Get tracingId
   * @return tracingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTracingId() {
    return tracingId;
  }


  public void setTracingId(String tracingId) {
    this.tracingId = tracingId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOfVirtualAccountBeneficiary apiResponseOfVirtualAccountBeneficiary = (ApiResponseOfVirtualAccountBeneficiary) o;
    return Objects.equals(this.meta, apiResponseOfVirtualAccountBeneficiary.meta) &&
        Objects.equals(this.data, apiResponseOfVirtualAccountBeneficiary.data) &&
        Objects.equals(this.forwardedData, apiResponseOfVirtualAccountBeneficiary.forwardedData) &&
        Objects.equals(this.tracingId, apiResponseOfVirtualAccountBeneficiary.tracingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data, forwardedData, tracingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOfVirtualAccountBeneficiary {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    forwardedData: ").append(toIndentedString(forwardedData)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
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

