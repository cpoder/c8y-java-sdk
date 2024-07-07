package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * GetApplicationsByTenantCollectionResource200Response
 */

@JsonTypeName("getApplicationsByTenantCollectionResource_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GetApplicationsByTenantCollectionResource200Response {

  private List<Application> applications = new ArrayList<>();

  private GetApplicationsByTenantCollectionResource200ResponseAllOfNext next;

  private GetApplicationsByTenantCollectionResource200ResponseAllOfPrev prev;

  private GetApplicationsByTenantCollectionResource200ResponseAllOfSelf self;

  private PageStatistics statistics;

  public GetApplicationsByTenantCollectionResource200Response applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public GetApplicationsByTenantCollectionResource200Response addApplicationsItem(Application applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * An array of applications.
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  public GetApplicationsByTenantCollectionResource200Response next(
      GetApplicationsByTenantCollectionResource200ResponseAllOfNext next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * 
   * @return next
   */

  @JsonProperty("next")
  public GetApplicationsByTenantCollectionResource200ResponseAllOfNext getNext() {
    return next;
  }

  public void setNext(GetApplicationsByTenantCollectionResource200ResponseAllOfNext next) {
    this.next = next;
  }

  public GetApplicationsByTenantCollectionResource200Response prev(
      GetApplicationsByTenantCollectionResource200ResponseAllOfPrev prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public GetApplicationsByTenantCollectionResource200ResponseAllOfPrev getPrev() {
    return prev;
  }

  public void setPrev(GetApplicationsByTenantCollectionResource200ResponseAllOfPrev prev) {
    this.prev = prev;
  }

  public GetApplicationsByTenantCollectionResource200Response self(
      GetApplicationsByTenantCollectionResource200ResponseAllOfSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * 
   * @return self
   */

  @JsonProperty("self")
  public GetApplicationsByTenantCollectionResource200ResponseAllOfSelf getSelf() {
    return self;
  }

  public void setSelf(GetApplicationsByTenantCollectionResource200ResponseAllOfSelf self) {
    this.self = self;
  }

  public GetApplicationsByTenantCollectionResource200Response statistics(PageStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public PageStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(PageStatistics statistics) {
    this.statistics = statistics;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public GetApplicationsByTenantCollectionResource200Response putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApplicationsByTenantCollectionResource200Response getApplicationsByTenantCollectionResource200Response = (GetApplicationsByTenantCollectionResource200Response) o;
    return Objects.equals(this.applications, getApplicationsByTenantCollectionResource200Response.applications) &&
        Objects.equals(this.next, getApplicationsByTenantCollectionResource200Response.next) &&
        Objects.equals(this.prev, getApplicationsByTenantCollectionResource200Response.prev) &&
        Objects.equals(this.self, getApplicationsByTenantCollectionResource200Response.self) &&
        Objects.equals(this.statistics, getApplicationsByTenantCollectionResource200Response.statistics) &&
        Objects.equals(this.additionalProperties,
            getApplicationsByTenantCollectionResource200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, next, prev, self, statistics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApplicationsByTenantCollectionResource200Response {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
