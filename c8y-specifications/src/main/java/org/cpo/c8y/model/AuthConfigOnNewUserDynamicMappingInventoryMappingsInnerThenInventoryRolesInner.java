package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Represents inventory roles for a specific device group.
 */

@JsonTypeName("authConfig_onNewUser_dynamicMapping_inventoryMappings_inner_thenInventoryRoles_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner {

  private String managedObject;

  private List<Integer> roleIds = new ArrayList<>();

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner managedObject(
      String managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * A unique identifier for the managed object for which the roles are assigned.
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public String getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(String managedObject) {
    this.managedObject = managedObject;
  }

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner roleIds(List<Integer> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner addRoleIdsItem(
      Integer roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * List of the inventory roles' identifiers.
   * 
   * @return roleIds
   */

  @JsonProperty("roleIds")
  public List<Integer> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<Integer> roleIds) {
    this.roleIds = roleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner authConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner = (AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner) o;
    return Objects.equals(this.managedObject,
        authConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner.managedObject) &&
        Objects.equals(this.roleIds,
            authConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObject, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUserDynamicMappingInventoryMappingsInnerThenInventoryRolesInner {\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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
