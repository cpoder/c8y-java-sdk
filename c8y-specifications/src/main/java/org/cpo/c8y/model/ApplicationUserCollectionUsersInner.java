package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A user who is subscribed to the current application.
 */

@JsonTypeName("ApplicationUserCollection_users_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationUserCollectionUsersInner {

  private String name;

  private String password;

  private String tenant;

  public ApplicationUserCollectionUsersInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The username.
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

  public ApplicationUserCollectionUsersInner password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user password.
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

  public ApplicationUserCollectionUsersInner tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * The user tenant.
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
    ApplicationUserCollectionUsersInner applicationUserCollectionUsersInner = (ApplicationUserCollectionUsersInner) o;
    return Objects.equals(this.name, applicationUserCollectionUsersInner.name) &&
        Objects.equals(this.password, applicationUserCollectionUsersInner.password) &&
        Objects.equals(this.tenant, applicationUserCollectionUsersInner.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, tenant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUserCollectionUsersInner {\n");
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
