package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ManagedObjectReferenceCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ManagedObjectReferenceCollection {

  private String prev;

  private URI self;

  private String next;

  private List<ManagedObjectReferenceCollectionReferencesInner> references = new ArrayList<>();

  private PageStatistics statistics;

  public ManagedObjectReferenceCollection prev(String prev) {
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

  public ManagedObjectReferenceCollection self(URI self) {
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

  public ManagedObjectReferenceCollection next(String next) {
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

  public ManagedObjectReferenceCollection references(List<ManagedObjectReferenceCollectionReferencesInner> references) {
    this.references = references;
    return this;
  }

  public ManagedObjectReferenceCollection addReferencesItem(
      ManagedObjectReferenceCollectionReferencesInner referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array containing the details of all children (if any).
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<ManagedObjectReferenceCollectionReferencesInner> getReferences() {
    return references;
  }

  public void setReferences(List<ManagedObjectReferenceCollectionReferencesInner> references) {
    this.references = references;
  }

  public ManagedObjectReferenceCollection statistics(PageStatistics statistics) {
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
    ManagedObjectReferenceCollection managedObjectReferenceCollection = (ManagedObjectReferenceCollection) o;
    return Objects.equals(this.prev, managedObjectReferenceCollection.prev) &&
        Objects.equals(this.self, managedObjectReferenceCollection.self) &&
        Objects.equals(this.next, managedObjectReferenceCollection.next) &&
        Objects.equals(this.references, managedObjectReferenceCollection.references) &&
        Objects.equals(this.statistics, managedObjectReferenceCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prev, self, next, references, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedObjectReferenceCollection {\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
