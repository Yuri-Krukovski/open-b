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
 * ResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class ResponseMeta {
  public static final String SERIALIZED_NAME_TRACING_ID = "tracingId";
  @SerializedName(SERIALIZED_NAME_TRACING_ID)
  private String tracingId;

  public ResponseMeta() { 
  }

  public ResponseMeta tracingId(String tracingId) {
    
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
    ResponseMeta responseMeta = (ResponseMeta) o;
    return Objects.equals(this.tracingId, responseMeta.tracingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMeta {\n");
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

