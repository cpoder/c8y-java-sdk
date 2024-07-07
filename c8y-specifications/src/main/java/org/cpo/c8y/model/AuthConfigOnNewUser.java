package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * SSO specific. Describes the process of internal user creation during login
 * with the external authorization server.
 */

@JsonTypeName("authConfig_onNewUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUser {

  private AuthConfigOnNewUserDynamicMapping dynamicMapping;

  public AuthConfigOnNewUser dynamicMapping(AuthConfigOnNewUserDynamicMapping dynamicMapping) {
    this.dynamicMapping = dynamicMapping;
    return this;
  }

  /**
   * Get dynamicMapping
   * 
   * @return dynamicMapping
   */

  @JsonProperty("dynamicMapping")
  public AuthConfigOnNewUserDynamicMapping getDynamicMapping() {
    return dynamicMapping;
  }

  public void setDynamicMapping(AuthConfigOnNewUserDynamicMapping dynamicMapping) {
    this.dynamicMapping = dynamicMapping;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUser authConfigOnNewUser = (AuthConfigOnNewUser) o;
    return Objects.equals(this.dynamicMapping, authConfigOnNewUser.dynamicMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUser {\n");
    sb.append("    dynamicMapping: ").append(toIndentedString(dynamicMapping)).append("\n");
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
