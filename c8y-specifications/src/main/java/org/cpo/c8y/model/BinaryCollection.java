package org.cpo.c8y.model;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * BinaryCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BinaryCollection {

  private List<File> managedObjects = new ArrayList<>();

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  public BinaryCollection managedObjects(List<File> managedObjects) {
    this.managedObjects = managedObjects;
    return this;
  }

  public BinaryCollection addManagedObjectsItem(File managedObjectsItem) {
    if (this.managedObjects == null) {
      this.managedObjects = new ArrayList<>();
    }
    this.managedObjects.add(managedObjectsItem);
    return this;
  }

  /**
   * An array containing the results (managed objects) of the request.
   * 
   * @return managedObjects
   */

  @JsonProperty("managedObjects")
  public List<File> getManagedObjects() {
    return managedObjects;
  }

  public void setManagedObjects(List<File> managedObjects) {
    this.managedObjects = managedObjects;
  }

  public BinaryCollection next(String next) {
    this.next = next;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential next page of managed objects.
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

  public BinaryCollection prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential previous page of managed objects.
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

  public BinaryCollection self(URI self) {
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

  public BinaryCollection statistics(PageStatistics statistics) {
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
    BinaryCollection binaryCollection = (BinaryCollection) o;
    return Objects.equals(this.managedObjects, binaryCollection.managedObjects) &&
        Objects.equals(this.next, binaryCollection.next) &&
        Objects.equals(this.prev, binaryCollection.prev) &&
        Objects.equals(this.self, binaryCollection.self) &&
        Objects.equals(this.statistics, binaryCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObjects, next, prev, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryCollection {\n");
    sb.append("    managedObjects: ").append(toIndentedString(managedObjects)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
