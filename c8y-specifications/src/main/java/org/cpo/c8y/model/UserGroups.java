package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * An object with a list of user groups.
 */

@JsonTypeName("user_groups")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UserGroups {

  private URI self;

  private List<GroupReference> references = new ArrayList<>();

  private PageStatistics statistics;

  public UserGroups self(URI self) {
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

  public UserGroups references(List<GroupReference> references) {
    this.references = references;
    return this;
  }

  public UserGroups addReferencesItem(GroupReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * A list of user group references.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<GroupReference> getReferences() {
    return references;
  }

  public void setReferences(List<GroupReference> references) {
    this.references = references;
  }

  public UserGroups statistics(PageStatistics statistics) {
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
    UserGroups userGroups = (UserGroups) o;
    return Objects.equals(this.self, userGroups.self) &&
        Objects.equals(this.references, userGroups.references) &&
        Objects.equals(this.statistics, userGroups.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, references, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroups {\n");
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
