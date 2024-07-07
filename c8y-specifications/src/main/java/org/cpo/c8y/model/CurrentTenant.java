package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * CurrentTenant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentTenant {

  private Boolean allowCreateTenants = false;

  private CurrentTenantApplications applications;

  private CustomProperties customProperties;

  private String domainName;

  private String name;

  private String parent;

  private URI self;

  public CurrentTenant allowCreateTenants(Boolean allowCreateTenants) {
    this.allowCreateTenants = allowCreateTenants;
    return this;
  }

  /**
   * Indicates if this tenant can create subtenants.
   * 
   * @return allowCreateTenants
   */

  @JsonProperty("allowCreateTenants")
  public Boolean getAllowCreateTenants() {
    return allowCreateTenants;
  }

  public void setAllowCreateTenants(Boolean allowCreateTenants) {
    this.allowCreateTenants = allowCreateTenants;
  }

  public CurrentTenant applications(CurrentTenantApplications applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public CurrentTenantApplications getApplications() {
    return applications;
  }

  public void setApplications(CurrentTenantApplications applications) {
    this.applications = applications;
  }

  public CurrentTenant customProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  /**
   * Get customProperties
   * 
   * @return customProperties
   */

  @JsonProperty("customProperties")
  public CustomProperties getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
  }

  public CurrentTenant domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * URL of the tenant's domain. The domain name permits only the use of
   * alphanumeric characters separated by dots `.`, hyphens `-` and underscores
   * `_`.
   * 
   * @return domainName
   */

  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public CurrentTenant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique identifier of a Cumulocity IoT tenant.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrentTenant parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * ID of the parent tenant.
   * 
   * @return parent
   */

  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public CurrentTenant self(URI self) {
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
    CurrentTenant currentTenant = (CurrentTenant) o;
    return Objects.equals(this.allowCreateTenants, currentTenant.allowCreateTenants) &&
        Objects.equals(this.applications, currentTenant.applications) &&
        Objects.equals(this.customProperties, currentTenant.customProperties) &&
        Objects.equals(this.domainName, currentTenant.domainName) &&
        Objects.equals(this.name, currentTenant.name) &&
        Objects.equals(this.parent, currentTenant.parent) &&
        Objects.equals(this.self, currentTenant.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCreateTenants, applications, customProperties, domainName, name, parent, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentTenant {\n");
    sb.append("    allowCreateTenants: ").append(toIndentedString(allowCreateTenants)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
