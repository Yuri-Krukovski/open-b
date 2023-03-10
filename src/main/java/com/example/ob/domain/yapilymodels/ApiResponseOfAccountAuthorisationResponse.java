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

import java.util.*;

/**
 * ApiResponseOfAccountAuthorisationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class ApiResponseOfAccountAuthorisationResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ResponseMeta meta;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AccountAuthorisationResponse data;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_FORWARDED_DATA = "forwardedData";
  @SerializedName(SERIALIZED_NAME_FORWARDED_DATA)
  private List<ResponseForwardedData> forwardedData = null;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private List<RawResponse> raw = null;

  public static final String SERIALIZED_NAME_TRACING_ID = "tracingId";
  @SerializedName(SERIALIZED_NAME_TRACING_ID)
  private String tracingId;

  public ApiResponseOfAccountAuthorisationResponse() { 
  }

  public ApiResponseOfAccountAuthorisationResponse meta(ResponseMeta meta) {
    
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


  public ApiResponseOfAccountAuthorisationResponse data(AccountAuthorisationResponse data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountAuthorisationResponse getData() {
    return data;
  }


  public void setData(AccountAuthorisationResponse data) {
    this.data = data;
  }


  public ApiResponseOfAccountAuthorisationResponse links(Map<String, String> links) {
    
    this.links = links;
    return this;
  }

  public ApiResponseOfAccountAuthorisationResponse putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }


  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  public ApiResponseOfAccountAuthorisationResponse forwardedData(List<ResponseForwardedData> forwardedData) {
    
    this.forwardedData = forwardedData;
    return this;
  }

  public ApiResponseOfAccountAuthorisationResponse addForwardedDataItem(ResponseForwardedData forwardedDataItem) {
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


  public ApiResponseOfAccountAuthorisationResponse raw(List<RawResponse> raw) {
    
    this.raw = raw;
    return this;
  }

  public ApiResponseOfAccountAuthorisationResponse addRawItem(RawResponse rawItem) {
    if (this.raw == null) {
      this.raw = new ArrayList<RawResponse>();
    }
    this.raw.add(rawItem);
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RawResponse> getRaw() {
    return raw;
  }


  public void setRaw(List<RawResponse> raw) {
    this.raw = raw;
  }


  public ApiResponseOfAccountAuthorisationResponse tracingId(String tracingId) {
    
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
    ApiResponseOfAccountAuthorisationResponse apiResponseOfAccountAuthorisationResponse = (ApiResponseOfAccountAuthorisationResponse) o;
    return Objects.equals(this.meta, apiResponseOfAccountAuthorisationResponse.meta) &&
        Objects.equals(this.data, apiResponseOfAccountAuthorisationResponse.data) &&
        Objects.equals(this.links, apiResponseOfAccountAuthorisationResponse.links) &&
        Objects.equals(this.forwardedData, apiResponseOfAccountAuthorisationResponse.forwardedData) &&
        Objects.equals(this.raw, apiResponseOfAccountAuthorisationResponse.raw) &&
        Objects.equals(this.tracingId, apiResponseOfAccountAuthorisationResponse.tracingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data, links, forwardedData, raw, tracingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOfAccountAuthorisationResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    forwardedData: ").append(toIndentedString(forwardedData)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

