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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A Balance Prediction profile for a User.
 */
@ApiModel(description = "A Balance Prediction profile for a User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class BalancePredictionProfile {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PROFILE_CONSENTS = "profileConsents";
  @SerializedName(SERIALIZED_NAME_PROFILE_CONSENTS)
  private List<ProfileConsent> profileConsents = null;

  public static final String SERIALIZED_NAME_ENRICHED_BALANCES = "enrichedBalances";
  @SerializedName(SERIALIZED_NAME_ENRICHED_BALANCES)
  private List<EnrichedBalances> enrichedBalances = null;

  public BalancePredictionProfile() { 
  }

  public BalancePredictionProfile status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status, will be COMPLETED which represents successful retreival of profile.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPLETED", value = "The status, will be COMPLETED which represents successful retreival of profile.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public BalancePredictionProfile profileConsents(List<ProfileConsent> profileConsents) {
    
    this.profileConsents = profileConsents;
    return this;
  }

  public BalancePredictionProfile addProfileConsentsItem(ProfileConsent profileConsentsItem) {
    if (this.profileConsents == null) {
      this.profileConsents = new ArrayList<ProfileConsent>();
    }
    this.profileConsents.add(profileConsentsItem);
    return this;
  }

   /**
   * A list of ProfileConsents used in the Balance Prediction profile.
   * @return profileConsents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of ProfileConsents used in the Balance Prediction profile.")

  public List<ProfileConsent> getProfileConsents() {
    return profileConsents;
  }


  public void setProfileConsents(List<ProfileConsent> profileConsents) {
    this.profileConsents = profileConsents;
  }


  public BalancePredictionProfile enrichedBalances(List<EnrichedBalances> enrichedBalances) {
    
    this.enrichedBalances = enrichedBalances;
    return this;
  }

  public BalancePredictionProfile addEnrichedBalancesItem(EnrichedBalances enrichedBalancesItem) {
    if (this.enrichedBalances == null) {
      this.enrichedBalances = new ArrayList<EnrichedBalances>();
    }
    this.enrichedBalances.add(enrichedBalancesItem);
    return this;
  }

   /**
   * A list of Balances returned by Balance Prediction profile.
   * @return enrichedBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Balances returned by Balance Prediction profile.")

  public List<EnrichedBalances> getEnrichedBalances() {
    return enrichedBalances;
  }


  public void setEnrichedBalances(List<EnrichedBalances> enrichedBalances) {
    this.enrichedBalances = enrichedBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePredictionProfile balancePredictionProfile = (BalancePredictionProfile) o;
    return Objects.equals(this.status, balancePredictionProfile.status) &&
        Objects.equals(this.profileConsents, balancePredictionProfile.profileConsents) &&
        Objects.equals(this.enrichedBalances, balancePredictionProfile.enrichedBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, profileConsents, enrichedBalances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePredictionProfile {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    profileConsents: ").append(toIndentedString(profileConsents)).append("\n");
    sb.append("    enrichedBalances: ").append(toIndentedString(enrichedBalances)).append("\n");
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

