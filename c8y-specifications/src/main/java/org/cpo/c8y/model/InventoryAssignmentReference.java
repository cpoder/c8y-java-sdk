package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * An inventory role reference.
 */

@JsonTypeName("inventoryAssignmentReference")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryAssignmentReference {

  private List<InventoryAssignmentReferenceRolesInner> roles = new ArrayList<>();

  public InventoryAssignmentReference roles(List<InventoryAssignmentReferenceRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public InventoryAssignmentReference addRolesItem(InventoryAssignmentReferenceRolesInner rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * An array of roles that are assigned to the managed object for the user.
   * 
   * @return roles
   */

  @JsonProperty("roles")
  public List<InventoryAssignmentReferenceRolesInner> getRoles() {
    return roles;
  }

  public void setRoles(List<InventoryAssignmentReferenceRolesInner> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAssignmentReference inventoryAssignmentReference = (InventoryAssignmentReference) o;
    return Objects.equals(this.roles, inventoryAssignmentReference.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAssignmentReference {\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
