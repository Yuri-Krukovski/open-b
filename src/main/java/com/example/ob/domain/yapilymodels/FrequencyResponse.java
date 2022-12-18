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
 * FrequencyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class FrequencyResponse {
  public static final String SERIALIZED_NAME_FREQUENCY_TYPE = "frequencyType";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_TYPE)
  private FrequencyEnumExtended frequencyType;

  public static final String SERIALIZED_NAME_INTERVAL_WEEK = "intervalWeek";
  @SerializedName(SERIALIZED_NAME_INTERVAL_WEEK)
  private Integer intervalWeek;

  public static final String SERIALIZED_NAME_INTERVAL_MONTH = "intervalMonth";
  @SerializedName(SERIALIZED_NAME_INTERVAL_MONTH)
  private Integer intervalMonth;

  public static final String SERIALIZED_NAME_EXECUTION_DAY = "executionDay";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DAY)
  private Integer executionDay;

  public FrequencyResponse() { 
  }

  public FrequencyResponse frequencyType(FrequencyEnumExtended frequencyType) {
    
    this.frequencyType = frequencyType;
    return this;
  }

   /**
   * Get frequencyType
   * @return frequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FrequencyEnumExtended getFrequencyType() {
    return frequencyType;
  }


  public void setFrequencyType(FrequencyEnumExtended frequencyType) {
    this.frequencyType = frequencyType;
  }


  public FrequencyResponse intervalWeek(Integer intervalWeek) {
    
    this.intervalWeek = intervalWeek;
    return this;
  }

   /**
   * Get intervalWeek
   * @return intervalWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntervalWeek() {
    return intervalWeek;
  }


  public void setIntervalWeek(Integer intervalWeek) {
    this.intervalWeek = intervalWeek;
  }


  public FrequencyResponse intervalMonth(Integer intervalMonth) {
    
    this.intervalMonth = intervalMonth;
    return this;
  }

   /**
   * Get intervalMonth
   * @return intervalMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntervalMonth() {
    return intervalMonth;
  }


  public void setIntervalMonth(Integer intervalMonth) {
    this.intervalMonth = intervalMonth;
  }


  public FrequencyResponse executionDay(Integer executionDay) {
    
    this.executionDay = executionDay;
    return this;
  }

   /**
   * Get executionDay
   * @return executionDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExecutionDay() {
    return executionDay;
  }


  public void setExecutionDay(Integer executionDay) {
    this.executionDay = executionDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyResponse frequencyResponse = (FrequencyResponse) o;
    return Objects.equals(this.frequencyType, frequencyResponse.frequencyType) &&
        Objects.equals(this.intervalWeek, frequencyResponse.intervalWeek) &&
        Objects.equals(this.intervalMonth, frequencyResponse.intervalMonth) &&
        Objects.equals(this.executionDay, frequencyResponse.executionDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyType, intervalWeek, intervalMonth, executionDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyResponse {\n");
    sb.append("    frequencyType: ").append(toIndentedString(frequencyType)).append("\n");
    sb.append("    intervalWeek: ").append(toIndentedString(intervalWeek)).append("\n");
    sb.append("    intervalMonth: ").append(toIndentedString(intervalMonth)).append("\n");
    sb.append("    executionDay: ").append(toIndentedString(executionDay)).append("\n");
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
