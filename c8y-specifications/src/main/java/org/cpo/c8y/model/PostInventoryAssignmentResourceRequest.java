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
 * PostInventoryAssignmentResourceRequest
 */

@JsonTypeName("postInventoryAssignmentResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostInventoryAssignmentResourceRequest {

  private Integer id;

  private String managedObject;

  private List<PostInventoryAssignmentResourceRequestAllOfRolesInner> roles = new ArrayList<>();

  private URI self;

  public PostInventoryAssignmentResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostInventoryAssignmentResourceRequest(String managedObject,
      List<PostInventoryAssignmentResourceRequestAllOfRolesInner> roles) {
    this.managedObject = managedObject;
    this.roles = roles;
  }

  public PostInventoryAssignmentResourceRequest id(Integer id) {
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

  public PostInventoryAssignmentResourceRequest managedObject(String managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * A unique identifier for the managed object for which the roles are assigned.
   * 
   * @return managedObject
   */
  @NotNull

  @JsonProperty("managedObject")
  public String getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(String managedObject) {
    this.managedObject = managedObject;
  }

  public PostInventoryAssignmentResourceRequest roles(
      List<PostInventoryAssignmentResourceRequestAllOfRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public PostInventoryAssignmentResourceRequest addRolesItem(
      PostInventoryAssignmentResourceRequestAllOfRolesInner rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * 
   * @return roles
   */
  @NotNull

  @JsonProperty("roles")
  public List<PostInventoryAssignmentResourceRequestAllOfRolesInner> getRoles() {
    return roles;
  }

  public void setRoles(List<PostInventoryAssignmentResourceRequestAllOfRolesInner> roles) {
    this.roles = roles;
  }

  public PostInventoryAssignmentResourceRequest self(URI self) {
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
  public PostInventoryAssignmentResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostInventoryAssignmentResourceRequest postInventoryAssignmentResourceRequest = (PostInventoryAssignmentResourceRequest) o;
    return Objects.equals(this.id, postInventoryAssignmentResourceRequest.id) &&
        Objects.equals(this.managedObject, postInventoryAssignmentResourceRequest.managedObject) &&
        Objects.equals(this.roles, postInventoryAssignmentResourceRequest.roles) &&
        Objects.equals(this.self, postInventoryAssignmentResourceRequest.self) &&
        Objects.equals(this.additionalProperties, postInventoryAssignmentResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managedObject, roles, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInventoryAssignmentResourceRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
