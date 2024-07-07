package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * AuthConfigAccess
 */

@JsonTypeName("authConfigAccess")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigAccess {

  private Boolean onlyManagementTenantAccess = false;

  public AuthConfigAccess onlyManagementTenantAccess(Boolean onlyManagementTenantAccess) {
    this.onlyManagementTenantAccess = onlyManagementTenantAccess;
    return this;
  }

  /**
   * Indicates whether the configuration is only accessible to the management
   * tenant.
   * 
   * @return onlyManagementTenantAccess
   */

  @JsonProperty("onlyManagementTenantAccess")
  public Boolean getOnlyManagementTenantAccess() {
    return onlyManagementTenantAccess;
  }

  public void setOnlyManagementTenantAccess(Boolean onlyManagementTenantAccess) {
    this.onlyManagementTenantAccess = onlyManagementTenantAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigAccess authConfigAccess = (AuthConfigAccess) o;
    return Objects.equals(this.onlyManagementTenantAccess, authConfigAccess.onlyManagementTenantAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyManagementTenantAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigAccess {\n");
    sb.append("    onlyManagementTenantAccess: ").append(toIndentedString(onlyManagementTenantAccess)).append("\n");
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
