package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * NewDeviceRequestCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NewDeviceRequestCollection {

  private List<NewDeviceRequest> newDeviceRequests = new ArrayList<>();

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  public NewDeviceRequestCollection newDeviceRequests(List<NewDeviceRequest> newDeviceRequests) {
    this.newDeviceRequests = newDeviceRequests;
    return this;
  }

  public NewDeviceRequestCollection addNewDeviceRequestsItem(NewDeviceRequest newDeviceRequestsItem) {
    if (this.newDeviceRequests == null) {
      this.newDeviceRequests = new ArrayList<>();
    }
    this.newDeviceRequests.add(newDeviceRequestsItem);
    return this;
  }

  /**
   * An array of new device requests.
   * 
   * @return newDeviceRequests
   */

  @JsonProperty("newDeviceRequests")
  public List<NewDeviceRequest> getNewDeviceRequests() {
    return newDeviceRequests;
  }

  public void setNewDeviceRequests(List<NewDeviceRequest> newDeviceRequests) {
    this.newDeviceRequests = newDeviceRequests;
  }

  public NewDeviceRequestCollection next(String next) {
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

  public NewDeviceRequestCollection prev(String prev) {
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

  public NewDeviceRequestCollection self(URI self) {
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

  public NewDeviceRequestCollection statistics(PageStatistics statistics) {
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
    NewDeviceRequestCollection newDeviceRequestCollection = (NewDeviceRequestCollection) o;
    return Objects.equals(this.newDeviceRequests, newDeviceRequestCollection.newDeviceRequests) &&
        Objects.equals(this.next, newDeviceRequestCollection.next) &&
        Objects.equals(this.prev, newDeviceRequestCollection.prev) &&
        Objects.equals(this.self, newDeviceRequestCollection.self) &&
        Objects.equals(this.statistics, newDeviceRequestCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDeviceRequests, next, prev, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewDeviceRequestCollection {\n");
    sb.append("    newDeviceRequests: ").append(toIndentedString(newDeviceRequests)).append("\n");
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
