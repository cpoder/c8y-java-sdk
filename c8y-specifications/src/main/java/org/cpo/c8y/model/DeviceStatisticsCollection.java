package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * Statistics of the tenant devices.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DeviceStatisticsCollection {

  private String next;

  private String prev;

  private URI self;

  private List<DeviceStatistics> statistics = new ArrayList<>();

  public DeviceStatisticsCollection next(String next) {
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

  public DeviceStatisticsCollection prev(String prev) {
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

  public DeviceStatisticsCollection self(URI self) {
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

  public DeviceStatisticsCollection statistics(List<DeviceStatistics> statistics) {
    this.statistics = statistics;
    return this;
  }

  public DeviceStatisticsCollection addStatisticsItem(DeviceStatistics statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

  /**
   * An array containing the tenant device statistics.
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public List<DeviceStatistics> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<DeviceStatistics> statistics) {
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
    DeviceStatisticsCollection deviceStatisticsCollection = (DeviceStatisticsCollection) o;
    return Objects.equals(this.next, deviceStatisticsCollection.next) &&
        Objects.equals(this.prev, deviceStatisticsCollection.prev) &&
        Objects.equals(this.self, deviceStatisticsCollection.self) &&
        Objects.equals(this.statistics, deviceStatisticsCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceStatisticsCollection {\n");
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
