package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Configuration of the mapping.
 */

@JsonTypeName("authConfig_onNewUser_dynamicMapping_configuration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUserDynamicMappingConfiguration {

  private Boolean mapRolesOnlyForNewUser;

  private Boolean manageRolesOnlyFromAccessMapping;

  public AuthConfigOnNewUserDynamicMappingConfiguration mapRolesOnlyForNewUser(Boolean mapRolesOnlyForNewUser) {
    this.mapRolesOnlyForNewUser = mapRolesOnlyForNewUser;
    return this;
  }

  /**
   * Indicates whether the mapping should be evaluated always or only during the
   * first external login when the internal user is created.
   * 
   * @return mapRolesOnlyForNewUser
   */

  @JsonProperty("mapRolesOnlyForNewUser")
  public Boolean getMapRolesOnlyForNewUser() {
    return mapRolesOnlyForNewUser;
  }

  public void setMapRolesOnlyForNewUser(Boolean mapRolesOnlyForNewUser) {
    this.mapRolesOnlyForNewUser = mapRolesOnlyForNewUser;
  }

  public AuthConfigOnNewUserDynamicMappingConfiguration manageRolesOnlyFromAccessMapping(
      Boolean manageRolesOnlyFromAccessMapping) {
    this.manageRolesOnlyFromAccessMapping = manageRolesOnlyFromAccessMapping;
    return this;
  }

  /**
   * If set to `true`, dynamic access mapping is only managed for global roles,
   * applications and inventory roles which are listed in the configuration.
   * Others remain unchanged.
   * 
   * @return manageRolesOnlyFromAccessMapping
   */

  @JsonProperty("manageRolesOnlyFromAccessMapping")
  public Boolean getManageRolesOnlyFromAccessMapping() {
    return manageRolesOnlyFromAccessMapping;
  }

  public void setManageRolesOnlyFromAccessMapping(Boolean manageRolesOnlyFromAccessMapping) {
    this.manageRolesOnlyFromAccessMapping = manageRolesOnlyFromAccessMapping;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUserDynamicMappingConfiguration authConfigOnNewUserDynamicMappingConfiguration = (AuthConfigOnNewUserDynamicMappingConfiguration) o;
    return Objects.equals(this.mapRolesOnlyForNewUser,
        authConfigOnNewUserDynamicMappingConfiguration.mapRolesOnlyForNewUser) &&
        Objects.equals(this.manageRolesOnlyFromAccessMapping,
            authConfigOnNewUserDynamicMappingConfiguration.manageRolesOnlyFromAccessMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapRolesOnlyForNewUser, manageRolesOnlyFromAccessMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUserDynamicMappingConfiguration {\n");
    sb.append("    mapRolesOnlyForNewUser: ").append(toIndentedString(mapRolesOnlyForNewUser)).append("\n");
    sb.append("    manageRolesOnlyFromAccessMapping: ").append(toIndentedString(manageRolesOnlyFromAccessMapping))
        .append("\n");
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
