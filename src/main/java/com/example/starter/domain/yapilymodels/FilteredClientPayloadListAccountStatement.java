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
 * FilteredClientPayloadListAccountStatement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class FilteredClientPayloadListAccountStatement {
  public static final String SERIALIZED_NAME_API_CALL = "apiCall";
  @SerializedName(SERIALIZED_NAME_API_CALL)
  private Object apiCall;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<AccountStatement> data = null;

  public static final String SERIALIZED_NAME_NEXT_CURSOR_HASH = "nextCursorHash";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR_HASH)
  private String nextCursorHash;

  public static final String SERIALIZED_NAME_NEXT_LINK = "nextLink";
  @SerializedName(SERIALIZED_NAME_NEXT_LINK)
  private String nextLink;

  public static final String SERIALIZED_NAME_PAGING_MAP = "pagingMap";
  @SerializedName(SERIALIZED_NAME_PAGING_MAP)
  private Map<String, FilterAndSort> pagingMap = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public FilteredClientPayloadListAccountStatement() { 
  }

  public FilteredClientPayloadListAccountStatement apiCall(Object apiCall) {
    
    this.apiCall = apiCall;
    return this;
  }

   /**
   * Get apiCall
   * @return apiCall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getApiCall() {
    return apiCall;
  }


  public void setApiCall(Object apiCall) {
    this.apiCall = apiCall;
  }


  public FilteredClientPayloadListAccountStatement data(List<AccountStatement> data) {
    
    this.data = data;
    return this;
  }

  public FilteredClientPayloadListAccountStatement addDataItem(AccountStatement dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<AccountStatement>();
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

  public List<AccountStatement> getData() {
    return data;
  }


  public void setData(List<AccountStatement> data) {
    this.data = data;
  }


  public FilteredClientPayloadListAccountStatement nextCursorHash(String nextCursorHash) {
    
    this.nextCursorHash = nextCursorHash;
    return this;
  }

   /**
   * Get nextCursorHash
   * @return nextCursorHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextCursorHash() {
    return nextCursorHash;
  }


  public void setNextCursorHash(String nextCursorHash) {
    this.nextCursorHash = nextCursorHash;
  }


  public FilteredClientPayloadListAccountStatement nextLink(String nextLink) {
    
    this.nextLink = nextLink;
    return this;
  }

   /**
   * Get nextLink
   * @return nextLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextLink() {
    return nextLink;
  }


  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  public FilteredClientPayloadListAccountStatement pagingMap(Map<String, FilterAndSort> pagingMap) {
    
    this.pagingMap = pagingMap;
    return this;
  }

  public FilteredClientPayloadListAccountStatement putPagingMapItem(String key, FilterAndSort pagingMapItem) {
    if (this.pagingMap == null) {
      this.pagingMap = new HashMap<String, FilterAndSort>();
    }
    this.pagingMap.put(key, pagingMapItem);
    return this;
  }

   /**
   * Get pagingMap
   * @return pagingMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, FilterAndSort> getPagingMap() {
    return pagingMap;
  }


  public void setPagingMap(Map<String, FilterAndSort> pagingMap) {
    this.pagingMap = pagingMap;
  }


  public FilteredClientPayloadListAccountStatement totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteredClientPayloadListAccountStatement filteredClientPayloadListAccountStatement = (FilteredClientPayloadListAccountStatement) o;
    return Objects.equals(this.apiCall, filteredClientPayloadListAccountStatement.apiCall) &&
        Objects.equals(this.data, filteredClientPayloadListAccountStatement.data) &&
        Objects.equals(this.nextCursorHash, filteredClientPayloadListAccountStatement.nextCursorHash) &&
        Objects.equals(this.nextLink, filteredClientPayloadListAccountStatement.nextLink) &&
        Objects.equals(this.pagingMap, filteredClientPayloadListAccountStatement.pagingMap) &&
        Objects.equals(this.totalCount, filteredClientPayloadListAccountStatement.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCall, data, nextCursorHash, nextLink, pagingMap, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteredClientPayloadListAccountStatement {\n");
    sb.append("    apiCall: ").append(toIndentedString(apiCall)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextCursorHash: ").append(toIndentedString(nextCursorHash)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    pagingMap: ").append(toIndentedString(pagingMap)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

