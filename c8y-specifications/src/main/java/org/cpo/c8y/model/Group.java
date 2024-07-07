package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Group
 */

@JsonTypeName("group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Group {

  private List<Application> applications = new ArrayList<>();

  private CustomProperties customProperties;

  private String description;

  @Deprecated

  private Map<String, List<String>> devicePermissions = new HashMap<>();

  private Integer id;

  private String name;

  private GroupRoles roles;

  private URI self;

  private GroupUsers users;

  public Group() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Group(String name) {
    this.name = name;
  }

  public Group applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public Group addApplicationsItem(Application applicationsItem) {
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

  public Group customProperties(CustomProperties customProperties) {
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

  public Group description(String description) {
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

  public Group devicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
    return this;
  }

  public Group putDevicePermissionsItem(String key, List<String> devicePermissionsItem) {
    if (this.devicePermissions == null) {
      this.devicePermissions = new HashMap<>();
    }
    this.devicePermissions.put(key, devicePermissionsItem);
    return this;
  }

  /**
   * An object with a list of the user's device permissions.
   * 
   * @return devicePermissions
   * @deprecated
   */

  @JsonProperty("devicePermissions")
  @Deprecated
  public Map<String, List<String>> getDevicePermissions() {
    return devicePermissions;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setDevicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
  }

  public Group id(Integer id) {
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

  public Group name(String name) {
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

  public Group roles(GroupRoles roles) {
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

  public Group self(URI self) {
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

  public Group users(GroupUsers users) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.applications, group.applications) &&
        Objects.equals(this.customProperties, group.customProperties) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.devicePermissions, group.devicePermissions) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.roles, group.roles) &&
        Objects.equals(this.self, group.self) &&
        Objects.equals(this.users, group.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, customProperties, description, devicePermissions, id, name, roles, self, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    devicePermissions: ").append(toIndentedString(devicePermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
