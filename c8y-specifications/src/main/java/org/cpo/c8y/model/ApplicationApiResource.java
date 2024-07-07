package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ApplicationApiResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationApiResource {

  private String applications;

  private String applicationById;

  private String applicationsByName;

  private String applicationsByTenant;

  private String applicationsByOwner;

  private String applicationsByUser;

  private URI self;

  public ApplicationApiResource applications(String applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Collection of all applications..
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public String getApplications() {
    return applications;
  }

  public void setApplications(String applications) {
    this.applications = applications;
  }

  public ApplicationApiResource applicationById(String applicationById) {
    this.applicationById = applicationById;
    return this;
  }

  /**
   * A reference to a resource of type Application.
   * 
   * @return applicationById
   */

  @JsonProperty("applicationById")
  public String getApplicationById() {
    return applicationById;
  }

  public void setApplicationById(String applicationById) {
    this.applicationById = applicationById;
  }

  public ApplicationApiResource applicationsByName(String applicationsByName) {
    this.applicationsByName = applicationsByName;
    return this;
  }

  /**
   * Read-only collection of all applications with a particular name.
   * 
   * @return applicationsByName
   */

  @JsonProperty("applicationsByName")
  public String getApplicationsByName() {
    return applicationsByName;
  }

  public void setApplicationsByName(String applicationsByName) {
    this.applicationsByName = applicationsByName;
  }

  public ApplicationApiResource applicationsByTenant(String applicationsByTenant) {
    this.applicationsByTenant = applicationsByTenant;
    return this;
  }

  /**
   * Read-only collection of all applications subscribed by a particular tenant.
   * 
   * @return applicationsByTenant
   */

  @JsonProperty("applicationsByTenant")
  public String getApplicationsByTenant() {
    return applicationsByTenant;
  }

  public void setApplicationsByTenant(String applicationsByTenant) {
    this.applicationsByTenant = applicationsByTenant;
  }

  public ApplicationApiResource applicationsByOwner(String applicationsByOwner) {
    this.applicationsByOwner = applicationsByOwner;
    return this;
  }

  /**
   * Read-only collection of all applications owned by a particular tenant.
   * 
   * @return applicationsByOwner
   */

  @JsonProperty("applicationsByOwner")
  public String getApplicationsByOwner() {
    return applicationsByOwner;
  }

  public void setApplicationsByOwner(String applicationsByOwner) {
    this.applicationsByOwner = applicationsByOwner;
  }

  public ApplicationApiResource applicationsByUser(String applicationsByUser) {
    this.applicationsByUser = applicationsByUser;
    return this;
  }

  /**
   * Read-only collection of all applications owned by a particular user.
   * 
   * @return applicationsByUser
   */

  @JsonProperty("applicationsByUser")
  public String getApplicationsByUser() {
    return applicationsByUser;
  }

  public void setApplicationsByUser(String applicationsByUser) {
    this.applicationsByUser = applicationsByUser;
  }

  public ApplicationApiResource self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
   * 
   * @return self
   */

  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApiResource applicationApiResource = (ApplicationApiResource) o;
    return Objects.equals(this.applications, applicationApiResource.applications) &&
        Objects.equals(this.applicationById, applicationApiResource.applicationById) &&
        Objects.equals(this.applicationsByName, applicationApiResource.applicationsByName) &&
        Objects.equals(this.applicationsByTenant, applicationApiResource.applicationsByTenant) &&
        Objects.equals(this.applicationsByOwner, applicationApiResource.applicationsByOwner) &&
        Objects.equals(this.applicationsByUser, applicationApiResource.applicationsByUser) &&
        Objects.equals(this.self, applicationApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, applicationById, applicationsByName, applicationsByTenant, applicationsByOwner,
        applicationsByUser, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApiResource {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    applicationById: ").append(toIndentedString(applicationById)).append("\n");
    sb.append("    applicationsByName: ").append(toIndentedString(applicationsByName)).append("\n");
    sb.append("    applicationsByTenant: ").append(toIndentedString(applicationsByTenant)).append("\n");
    sb.append("    applicationsByOwner: ").append(toIndentedString(applicationsByOwner)).append("\n");
    sb.append("    applicationsByUser: ").append(toIndentedString(applicationsByUser)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
