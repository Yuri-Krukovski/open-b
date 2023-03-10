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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Statement information belonging to the account.
 */
@ApiModel(description = "Statement information belonging to the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class AccountStatement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public AccountStatement() { 
  }

  public AccountStatement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the statement.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the statement.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AccountStatement startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Date and time of when the statement period starts.
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of when the statement period starts.")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public AccountStatement endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Date and time of when the statement period ends.
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of when the statement period ends.")

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public AccountStatement creationDateTime(OffsetDateTime creationDateTime) {
    
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time of when the statement was created.
   * @return creationDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of when the statement was created.")

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }


  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountStatement accountStatement = (AccountStatement) o;
    return Objects.equals(this.id, accountStatement.id) &&
        Objects.equals(this.startDateTime, accountStatement.startDateTime) &&
        Objects.equals(this.endDateTime, accountStatement.endDateTime) &&
        Objects.equals(this.creationDateTime, accountStatement.creationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDateTime, endDateTime, creationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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

