package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * A list of device permissions.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DevicePermissionOwners {

  private List<User> users = new ArrayList<>();

  private List<Group> groups = new ArrayList<>();

  public DevicePermissionOwners users(List<User> users) {
    this.users = users;
    return this;
  }

  public DevicePermissionOwners addUsersItem(User usersItem) {
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
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public DevicePermissionOwners groups(List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public DevicePermissionOwners addGroupsItem(Group groupsItem) {
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
  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
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
    DevicePermissionOwners devicePermissionOwners = (DevicePermissionOwners) o;
    return Objects.equals(this.users, devicePermissionOwners.users) &&
        Objects.equals(this.groups, devicePermissionOwners.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicePermissionOwners {\n");
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
