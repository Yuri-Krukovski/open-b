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

import java.util.*;

/**
 * AccountApiListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class AccountApiListResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ResponseListMeta meta;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Account> data = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_FORWARDED_DATA = "forwardedData";
  @SerializedName(SERIALIZED_NAME_FORWARDED_DATA)
  private List<ResponseForwardedData> forwardedData = null;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private List<RawResponse> raw = null;

  public static final String SERIALIZED_NAME_PAGING = "paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private FilteredClientPayloadListAccount paging;

  public static final String SERIALIZED_NAME_TRACING_ID = "tracingId";
  @SerializedName(SERIALIZED_NAME_TRACING_ID)
  private String tracingId;

  public AccountApiListResponse() { 
  }

  public AccountApiListResponse meta(ResponseListMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseListMeta getMeta() {
    return meta;
  }


  public void setMeta(ResponseListMeta meta) {
    this.meta = meta;
  }


  public AccountApiListResponse data(List<Account> data) {
    
    this.data = data;
    return this;
  }

  public AccountApiListResponse addDataItem(Account dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Account>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Account> getData() {
    return data;
  }


  public void setData(List<Account> data) {
    this.data = data;
  }


  public AccountApiListResponse links(Map<String, String> links) {
    
    this.links = links;
    return this;
  }

  public AccountApiListResponse putLinksItem(String key, String linksItem) {
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


  public AccountApiListResponse forwardedData(List<ResponseForwardedData> forwardedData) {
    
    this.forwardedData = forwardedData;
    return this;
  }

  public AccountApiListResponse addForwardedDataItem(ResponseForwardedData forwardedDataItem) {
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


  public AccountApiListResponse raw(List<RawResponse> raw) {
    
    this.raw = raw;
    return this;
  }

  public AccountApiListResponse addRawItem(RawResponse rawItem) {
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


  public AccountApiListResponse paging(FilteredClientPayloadListAccount paging) {
    
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FilteredClientPayloadListAccount getPaging() {
    return paging;
  }


  public void setPaging(FilteredClientPayloadListAccount paging) {
    this.paging = paging;
  }


  public AccountApiListResponse tracingId(String tracingId) {
    
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
    AccountApiListResponse accountApiListResponse = (AccountApiListResponse) o;
    return Objects.equals(this.meta, accountApiListResponse.meta) &&
        Objects.equals(this.data, accountApiListResponse.data) &&
        Objects.equals(this.links, accountApiListResponse.links) &&
        Objects.equals(this.forwardedData, accountApiListResponse.forwardedData) &&
        Objects.equals(this.raw, accountApiListResponse.raw) &&
        Objects.equals(this.paging, accountApiListResponse.paging) &&
        Objects.equals(this.tracingId, accountApiListResponse.tracingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data, links, forwardedData, raw, paging, tracingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountApiListResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    forwardedData: ").append(toIndentedString(forwardedData)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

