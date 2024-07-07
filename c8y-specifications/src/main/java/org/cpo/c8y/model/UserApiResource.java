package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * UserApiResource
 */

@JsonTypeName("userApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UserApiResource {

  private URI self;

  private String users;

  private String userByName;

  private String currentUser;

  private String groups;

  private String groupByName;

  private String roles;

  public UserApiResource self(URI self) {
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

  public UserApiResource users(String users) {
    this.users = users;
    return this;
  }

  /**
   * Collection of all users belonging to a given tenant.
   * 
   * @return users
   */

  @JsonProperty("users")
  public String getUsers() {
    return users;
  }

  public void setUsers(String users) {
    this.users = users;
  }

  public UserApiResource userByName(String userByName) {
    this.userByName = userByName;
    return this;
  }

  /**
   * Reference to a resource of type user.
   * 
   * @return userByName
   */

  @JsonProperty("userByName")
  public String getUserByName() {
    return userByName;
  }

  public void setUserByName(String userByName) {
    this.userByName = userByName;
  }

  public UserApiResource currentUser(String currentUser) {
    this.currentUser = currentUser;
    return this;
  }

  /**
   * Reference to the resource of the logged in user.
   * 
   * @return currentUser
   */

  @JsonProperty("currentUser")
  public String getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(String currentUser) {
    this.currentUser = currentUser;
  }

  public UserApiResource groups(String groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Collection of all users belonging to a given tenant.
   * 
   * @return groups
   */

  @JsonProperty("groups")
  public String getGroups() {
    return groups;
  }

  public void setGroups(String groups) {
    this.groups = groups;
  }

  public UserApiResource groupByName(String groupByName) {
    this.groupByName = groupByName;
    return this;
  }

  /**
   * Reference to a resource of type group.
   * 
   * @return groupByName
   */

  @JsonProperty("groupByName")
  public String getGroupByName() {
    return groupByName;
  }

  public void setGroupByName(String groupByName) {
    this.groupByName = groupByName;
  }

  public UserApiResource roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Collection of all roles.
   * 
   * @return roles
   */

  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
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
    UserApiResource userApiResource = (UserApiResource) o;
    return Objects.equals(this.self, userApiResource.self) &&
        Objects.equals(this.users, userApiResource.users) &&
        Objects.equals(this.userByName, userApiResource.userByName) &&
        Objects.equals(this.currentUser, userApiResource.currentUser) &&
        Objects.equals(this.groups, userApiResource.groups) &&
        Objects.equals(this.groupByName, userApiResource.groupByName) &&
        Objects.equals(this.roles, userApiResource.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, users, userByName, currentUser, groups, groupByName, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserApiResource {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userByName: ").append(toIndentedString(userByName)).append("\n");
    sb.append("    currentUser: ").append(toIndentedString(currentUser)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    groupByName: ").append(toIndentedString(groupByName)).append("\n");
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
