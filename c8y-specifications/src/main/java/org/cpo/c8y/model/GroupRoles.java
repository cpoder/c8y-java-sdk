package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * An object containing user roles for this group.
 */

@JsonTypeName("group_roles")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GroupRoles {

  private URI self;

  private List<RoleReference> references = new ArrayList<>();

  private PageStatistics statistics;

  public GroupRoles self(URI self) {
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

  public GroupRoles references(List<RoleReference> references) {
    this.references = references;
    return this;
  }

  public GroupRoles addReferencesItem(RoleReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * A list of user role references.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<RoleReference> getReferences() {
    return references;
  }

  public void setReferences(List<RoleReference> references) {
    this.references = references;
  }

  public GroupRoles statistics(PageStatistics statistics) {
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
    GroupRoles groupRoles = (GroupRoles) o;
    return Objects.equals(this.self, groupRoles.self) &&
        Objects.equals(this.references, groupRoles.references) &&
        Objects.equals(this.statistics, groupRoles.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, references, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRoles {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
