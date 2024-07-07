package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostInventoryRoleResourceRequest
 */

@JsonTypeName("postInventoryRoleResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostInventoryRoleResourceRequest {

  private String description;

  private Integer id;

  private String name;

  private List<InventoryRolePermission> permissions = new ArrayList<>();

  private URI self;

  public PostInventoryRoleResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostInventoryRoleResourceRequest(String description, String name, List<InventoryRolePermission> permissions) {
    this.description = description;
    this.name = name;
    this.permissions = permissions;
  }

  public PostInventoryRoleResourceRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for this inventory role.
   * 
   * @return description
   */
  @NotNull

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostInventoryRoleResourceRequest id(Integer id) {
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

  public PostInventoryRoleResourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this inventory role.
   * 
   * @return name
   */
  @NotNull

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostInventoryRoleResourceRequest permissions(List<InventoryRolePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PostInventoryRoleResourceRequest addPermissionsItem(InventoryRolePermission permissionsItem) {
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
  @NotNull

  @JsonProperty("permissions")
  public List<InventoryRolePermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<InventoryRolePermission> permissions) {
    this.permissions = permissions;
  }

  public PostInventoryRoleResourceRequest self(URI self) {
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PostInventoryRoleResourceRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInventoryRoleResourceRequest postInventoryRoleResourceRequest = (PostInventoryRoleResourceRequest) o;
    return Objects.equals(this.description, postInventoryRoleResourceRequest.description) &&
        Objects.equals(this.id, postInventoryRoleResourceRequest.id) &&
        Objects.equals(this.name, postInventoryRoleResourceRequest.name) &&
        Objects.equals(this.permissions, postInventoryRoleResourceRequest.permissions) &&
        Objects.equals(this.self, postInventoryRoleResourceRequest.self) &&
        Objects.equals(this.additionalProperties, postInventoryRoleResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, permissions, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInventoryRoleResourceRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
