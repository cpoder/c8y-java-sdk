package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * An inventory assignment.
 */

@JsonTypeName("inventoryAssignment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryAssignment {

  private Integer id;

  private String managedObject;

  private List<InventoryRole> roles = new ArrayList<>();

  private URI self;

  public InventoryAssignment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this inventory assignment.
   * 
   * @return id
   */

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InventoryAssignment managedObject(String managedObject) {
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

  public InventoryAssignment roles(List<InventoryRole> roles) {
    this.roles = roles;
    return this;
  }

  public InventoryAssignment addRolesItem(InventoryRole rolesItem) {
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
  public List<InventoryRole> getRoles() {
    return roles;
  }

  public void setRoles(List<InventoryRole> roles) {
    this.roles = roles;
  }

  public InventoryAssignment self(URI self) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAssignment inventoryAssignment = (InventoryAssignment) o;
    return Objects.equals(this.id, inventoryAssignment.id) &&
        Objects.equals(this.managedObject, inventoryAssignment.managedObject) &&
        Objects.equals(this.roles, inventoryAssignment.roles) &&
        Objects.equals(this.self, inventoryAssignment.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managedObject, roles, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
