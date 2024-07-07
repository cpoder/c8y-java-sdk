package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The list of users in this group.
 */

@JsonTypeName("group_users")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GroupUsers {

  private URI self;

  private List<User> references = new ArrayList<>();

  public GroupUsers self(URI self) {
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

  public GroupUsers references(List<User> references) {
    this.references = references;
    return this;
  }

  public GroupUsers addReferencesItem(User referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * The list of users in this group.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<User> getReferences() {
    return references;
  }

  public void setReferences(List<User> references) {
    this.references = references;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupUsers groupUsers = (GroupUsers) o;
    return Objects.equals(this.self, groupUsers.self) &&
        Objects.equals(this.references, groupUsers.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUsers {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
