package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * UserGroupCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UserGroupCollection {

  private URI self;

  private List<Group> groups = new ArrayList<>();

  private String prev;

  private String next;

  private PageStatistics statistics;

  public UserGroupCollection self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
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

  public UserGroupCollection groups(List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public UserGroupCollection addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * An array of user groups.
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

  public UserGroupCollection prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public UserGroupCollection next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * 
   * @return next
   */

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public UserGroupCollection statistics(PageStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public PageStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(PageStatistics statistics) {
    this.statistics = statistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupCollection userGroupCollection = (UserGroupCollection) o;
    return Objects.equals(this.self, userGroupCollection.self) &&
        Objects.equals(this.groups, userGroupCollection.groups) &&
        Objects.equals(this.prev, userGroupCollection.prev) &&
        Objects.equals(this.next, userGroupCollection.next) &&
        Objects.equals(this.statistics, userGroupCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, groups, prev, next, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupCollection {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
