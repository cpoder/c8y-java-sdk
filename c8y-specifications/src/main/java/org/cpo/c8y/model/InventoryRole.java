package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * An inventory role.
 */

@JsonTypeName("inventoryRole")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryRole {

  private String description;

  private Integer id;

  private String name;

  private List<InventoryRolePermission> permissions = new ArrayList<>();

  private URI self;

  public InventoryRole description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for this inventory role.
   * 
   * @return description
   */

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InventoryRole id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this inventory role.
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

  public InventoryRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this inventory role.
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

  public InventoryRole permissions(List<InventoryRolePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InventoryRole addPermissionsItem(InventoryRolePermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * A set of permissions for this inventory role.
   * 
   * @return permissions
   */

  @JsonProperty("permissions")
  public List<InventoryRolePermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<InventoryRolePermission> permissions) {
    this.permissions = permissions;
  }

  public InventoryRole self(URI self) {
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
    InventoryRole inventoryRole = (InventoryRole) o;
    return Objects.equals(this.description, inventoryRole.description) &&
        Objects.equals(this.id, inventoryRole.id) &&
        Objects.equals(this.name, inventoryRole.name) &&
        Objects.equals(this.permissions, inventoryRole.permissions) &&
        Objects.equals(this.self, inventoryRole.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, permissions, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryRole {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
