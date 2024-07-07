package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostGroupCollectionResourceRequest
 */

@JsonTypeName("postGroupCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostGroupCollectionResourceRequest {

  private List<Application> applications = new ArrayList<>();

  private CustomProperties customProperties;

  private String description;

  private JsonNullable<Object> devicePermissions = JsonNullable.<Object>undefined();

  private Integer id;

  private String name;

  private GroupRoles roles;

  private URI self;

  private GroupUsers users;

  public PostGroupCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostGroupCollectionResourceRequest(String name) {
    this.name = name;
  }

  public PostGroupCollectionResourceRequest applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public PostGroupCollectionResourceRequest addApplicationsItem(Application applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * A list of applications.
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  public PostGroupCollectionResourceRequest customProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  /**
   * Get customProperties
   * 
   * @return customProperties
   */

  @JsonProperty("customProperties")
  public CustomProperties getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
  }

  public PostGroupCollectionResourceRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the group.
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

  public PostGroupCollectionResourceRequest devicePermissions(Object devicePermissions) {
    this.devicePermissions = JsonNullable.of(devicePermissions);
    return this;
  }

  /**
   * Get devicePermissions
   * 
   * @return devicePermissions
   */

  @JsonProperty("devicePermissions")
  public JsonNullable<Object> getDevicePermissions() {
    return devicePermissions;
  }

  public void setDevicePermissions(JsonNullable<Object> devicePermissions) {
    this.devicePermissions = devicePermissions;
  }

  public PostGroupCollectionResourceRequest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this group.
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

  public PostGroupCollectionResourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group.
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

  public PostGroupCollectionResourceRequest roles(GroupRoles roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * 
   * @return roles
   */

  @JsonProperty("roles")
  public GroupRoles getRoles() {
    return roles;
  }

  public void setRoles(GroupRoles roles) {
    this.roles = roles;
  }

  public PostGroupCollectionResourceRequest self(URI self) {
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

  public PostGroupCollectionResourceRequest users(GroupUsers users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * 
   * @return users
   */

  @JsonProperty("users")
  public GroupUsers getUsers() {
    return users;
  }

  public void setUsers(GroupUsers users) {
    this.users = users;
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
  public PostGroupCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostGroupCollectionResourceRequest postGroupCollectionResourceRequest = (PostGroupCollectionResourceRequest) o;
    return Objects.equals(this.applications, postGroupCollectionResourceRequest.applications) &&
        Objects.equals(this.customProperties, postGroupCollectionResourceRequest.customProperties) &&
        Objects.equals(this.description, postGroupCollectionResourceRequest.description) &&
        equalsNullable(this.devicePermissions, postGroupCollectionResourceRequest.devicePermissions) &&
        Objects.equals(this.id, postGroupCollectionResourceRequest.id) &&
        Objects.equals(this.name, postGroupCollectionResourceRequest.name) &&
        Objects.equals(this.roles, postGroupCollectionResourceRequest.roles) &&
        Objects.equals(this.self, postGroupCollectionResourceRequest.self) &&
        Objects.equals(this.users, postGroupCollectionResourceRequest.users) &&
        Objects.equals(this.additionalProperties, postGroupCollectionResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, customProperties, description, hashCodeNullable(devicePermissions), id, name,
        roles, self, users, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupCollectionResourceRequest {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    devicePermissions: ").append(toIndentedString(devicePermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");

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
