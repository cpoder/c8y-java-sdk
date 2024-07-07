package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Reference to the tenant owning this application. The default value is a
 * reference to the current tenant.
 */

@JsonTypeName("application_owner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationOwner {

  private URI self;

  private ApplicationOwnerTenant tenant;

  public ApplicationOwner self(URI self) {
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

  public ApplicationOwner tenant(ApplicationOwnerTenant tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * 
   * @return tenant
   */

  @JsonProperty("tenant")
  public ApplicationOwnerTenant getTenant() {
    return tenant;
  }

  public void setTenant(ApplicationOwnerTenant tenant) {
    this.tenant = tenant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationOwner applicationOwner = (ApplicationOwner) o;
    return Objects.equals(this.self, applicationOwner.self) &&
        Objects.equals(this.tenant, applicationOwner.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, tenant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationOwner {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
