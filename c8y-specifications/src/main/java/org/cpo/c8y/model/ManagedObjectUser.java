package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ManagedObjectUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ManagedObjectUser {

  private Boolean enabled;

  private URI self;

  private String userName;

  public ManagedObjectUser enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the device's owner is enabled or not.
   * 
   * @return enabled
   */

  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ManagedObjectUser self(URI self) {
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

  public ManagedObjectUser userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the device's owner.
   * 
   * @return userName
   */

  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedObjectUser managedObjectUser = (ManagedObjectUser) o;
    return Objects.equals(this.enabled, managedObjectUser.enabled) &&
        Objects.equals(this.self, managedObjectUser.self) &&
        Objects.equals(this.userName, managedObjectUser.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, self, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedObjectUser {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
