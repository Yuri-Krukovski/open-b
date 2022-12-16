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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
import java.util.UUID;

/**
 * EventSubscriptionDeleteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class EventSubscriptionDeleteResponse {
  public static final String SERIALIZED_NAME_EVENT_TYPE_ID = "eventTypeId";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE_ID)
  private String eventTypeId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private UUID applicationId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DELETE_STATUS = "deleteStatus";
  @SerializedName(SERIALIZED_NAME_DELETE_STATUS)
  private DeleteStatusEnum deleteStatus;

  public EventSubscriptionDeleteResponse() { 
  }

  public EventSubscriptionDeleteResponse eventTypeId(String eventTypeId) {
    
    this.eventTypeId = eventTypeId;
    return this;
  }

   /**
   * Unique identifier of the event type (for which notifications will be sent)
   * @return eventTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "payment.status.completed", required = true, value = "Unique identifier of the event type (for which notifications will be sent)")

  public String getEventTypeId() {
    return eventTypeId;
  }


  public void setEventTypeId(String eventTypeId) {
    this.eventTypeId = eventTypeId;
  }


  public EventSubscriptionDeleteResponse applicationId(UUID applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Application related to event subscription.
   * @return applicationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2698db90-6635-4f76-b673-5ce8e2aeda0e", required = true, value = "Application related to event subscription.")

  public UUID getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }


  public EventSubscriptionDeleteResponse created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Creation datetime of event subscription.
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creation datetime of event subscription.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public EventSubscriptionDeleteResponse deleteStatus(DeleteStatusEnum deleteStatus) {
    
    this.deleteStatus = deleteStatus;
    return this;
  }

   /**
   * Get deleteStatus
   * @return deleteStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DeleteStatusEnum getDeleteStatus() {
    return deleteStatus;
  }


  public void setDeleteStatus(DeleteStatusEnum deleteStatus) {
    this.deleteStatus = deleteStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscriptionDeleteResponse eventSubscriptionDeleteResponse = (EventSubscriptionDeleteResponse) o;
    return Objects.equals(this.eventTypeId, eventSubscriptionDeleteResponse.eventTypeId) &&
        Objects.equals(this.applicationId, eventSubscriptionDeleteResponse.applicationId) &&
        Objects.equals(this.created, eventSubscriptionDeleteResponse.created) &&
        Objects.equals(this.deleteStatus, eventSubscriptionDeleteResponse.deleteStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTypeId, applicationId, created, deleteStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionDeleteResponse {\n");
    sb.append("    eventTypeId: ").append(toIndentedString(eventTypeId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleteStatus: ").append(toIndentedString(deleteStatus)).append("\n");
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

