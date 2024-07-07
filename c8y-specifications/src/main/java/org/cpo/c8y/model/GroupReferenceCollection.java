package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * GroupReferenceCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GroupReferenceCollection {

  private URI self;

  private List<GroupReference> references = new ArrayList<>();

  private String prev;

  private String next;

  private PageStatistics statistics;

  public GroupReferenceCollection self(URI self) {
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

  public GroupReferenceCollection references(List<GroupReference> references) {
    this.references = references;
    return this;
  }

  public GroupReferenceCollection addReferencesItem(GroupReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array of group references.
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

  public GroupReferenceCollection prev(String prev) {
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

  public GroupReferenceCollection next(String next) {
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

  public GroupReferenceCollection statistics(PageStatistics statistics) {
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
    GroupReferenceCollection groupReferenceCollection = (GroupReferenceCollection) o;
    return Objects.equals(this.self, groupReferenceCollection.self) &&
        Objects.equals(this.references, groupReferenceCollection.references) &&
        Objects.equals(this.prev, groupReferenceCollection.prev) &&
        Objects.equals(this.next, groupReferenceCollection.next) &&
        Objects.equals(this.statistics, groupReferenceCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, references, prev, next, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReferenceCollection {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
