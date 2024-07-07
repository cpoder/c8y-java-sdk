package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Represents information of mapping access to inventory roles.
 */

@JsonTypeName("authConfig_onNewUser_dynamicMapping_inventoryMappings_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUserDynamicMappingInventoryMappingsInner {

  private JSONPredicateRepresentation when;

  private List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner> thenInventoryRoles = new ArrayList<>();

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInner when(JSONPredicateRepresentation when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * 
   * @return when
   */

  @JsonProperty("when")
  public JSONPredicateRepresentation getWhen() {
    return when;
  }

  public void setWhen(JSONPredicateRepresentation when) {
    this.when = when;
  }

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInner thenInventoryRoles(
      List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner> thenInventoryRoles) {
    this.thenInventoryRoles = thenInventoryRoles;
    return this;
  }

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInner addThenInventoryRolesItem(
      AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner thenInventoryRolesItem) {
    if (this.thenInventoryRoles == null) {
      this.thenInventoryRoles = new ArrayList<>();
    }
    this.thenInventoryRoles.add(thenInventoryRolesItem);
    return this;
  }

  /**
   * List of the OAuth inventory assignments.
   * 
   * @return thenInventoryRoles
   */

  @JsonProperty("thenInventoryRoles")
  public List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner> getThenInventoryRoles() {
    return thenInventoryRoles;
  }

  public void setThenInventoryRoles(
      List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner> thenInventoryRoles) {
    this.thenInventoryRoles = thenInventoryRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUserDynamicMappingInventoryMappingsInner authConfigOnNewUserDynamicMappingInventoryMappingsInner = (AuthConfigOnNewUserDynamicMappingInventoryMappingsInner) o;
    return Objects.equals(this.when, authConfigOnNewUserDynamicMappingInventoryMappingsInner.when) &&
        Objects.equals(this.thenInventoryRoles,
            authConfigOnNewUserDynamicMappingInventoryMappingsInner.thenInventoryRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, thenInventoryRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUserDynamicMappingInventoryMappingsInner {\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    thenInventoryRoles: ").append(toIndentedString(thenInventoryRoles)).append("\n");
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
