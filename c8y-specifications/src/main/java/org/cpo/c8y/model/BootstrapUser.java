package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * BootstrapUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BootstrapUser {

  private String name;

  private String password;

  private String tenant;

  public BootstrapUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bootstrap user tenant username.
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

  public BootstrapUser password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The bootstrap user tenant password.
   * 
   * @return password
   */

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public BootstrapUser tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * The bootstrap user tenant ID.
   * 
   * @return tenant
   */

  @JsonProperty("tenant")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
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
    BootstrapUser bootstrapUser = (BootstrapUser) o;
    return Objects.equals(this.name, bootstrapUser.name) &&
        Objects.equals(this.password, bootstrapUser.password) &&
        Objects.equals(this.tenant, bootstrapUser.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, tenant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BootstrapUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append("*").append("\n");
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
