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
import java.util.UUID;

/**
 * EventSubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class EventSubscriptionResponse {
  public static final String SERIALIZED_NAME_EVENT_TYPE_ID = "eventTypeId";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE_ID)
  private String eventTypeId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private UUID applicationId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private Notification notification;

  public EventSubscriptionResponse() { 
  }

  public EventSubscriptionResponse eventTypeId(String eventTypeId) {
    
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


  public EventSubscriptionResponse applicationId(UUID applicationId) {
    
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


  public EventSubscriptionResponse created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Creation date of event subscription.
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "28-07-2021 15:47:03", required = true, value = "Creation date of event subscription.")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public EventSubscriptionResponse notification(Notification notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Notification getNotification() {
    return notification;
  }


  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscriptionResponse eventSubscriptionResponse = (EventSubscriptionResponse) o;
    return Objects.equals(this.eventTypeId, eventSubscriptionResponse.eventTypeId) &&
        Objects.equals(this.applicationId, eventSubscriptionResponse.applicationId) &&
        Objects.equals(this.created, eventSubscriptionResponse.created) &&
        Objects.equals(this.notification, eventSubscriptionResponse.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTypeId, applicationId, created, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionResponse {\n");
    sb.append("    eventTypeId: ").append(toIndentedString(eventTypeId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

