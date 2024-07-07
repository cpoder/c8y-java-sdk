package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * A list of device permissions.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UpdatedDevicePermissions {

  private List<UpdatedDevicePermissionsUsersInner> users = new ArrayList<>();

  private List<UpdatedDevicePermissionsGroupsInner> groups = new ArrayList<>();

  public UpdatedDevicePermissions users(List<UpdatedDevicePermissionsUsersInner> users) {
    this.users = users;
    return this;
  }

  public UpdatedDevicePermissions addUsersItem(UpdatedDevicePermissionsUsersInner usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * 
   * @return users
   */

  @JsonProperty("users")
  public List<UpdatedDevicePermissionsUsersInner> getUsers() {
    return users;
  }

  public void setUsers(List<UpdatedDevicePermissionsUsersInner> users) {
    this.users = users;
  }

  public UpdatedDevicePermissions groups(List<UpdatedDevicePermissionsGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public UpdatedDevicePermissions addGroupsItem(UpdatedDevicePermissionsGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * 
   * @return groups
   */

  @JsonProperty("groups")
  public List<UpdatedDevicePermissionsGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(List<UpdatedDevicePermissionsGroupsInner> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedDevicePermissions updatedDevicePermissions = (UpdatedDevicePermissions) o;
    return Objects.equals(this.users, updatedDevicePermissions.users) &&
        Objects.equals(this.groups, updatedDevicePermissions.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedDevicePermissions {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
