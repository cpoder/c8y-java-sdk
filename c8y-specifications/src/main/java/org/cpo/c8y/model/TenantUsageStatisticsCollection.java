package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * TenantUsageStatisticsCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantUsageStatisticsCollection {

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  private List<DailyUsageStatistics> usageStatistics = new ArrayList<>();

  public TenantUsageStatisticsCollection next(String next) {
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

  public TenantUsageStatisticsCollection prev(String prev) {
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

  public TenantUsageStatisticsCollection self(URI self) {
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

  public TenantUsageStatisticsCollection statistics(PageStatistics statistics) {
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

  public TenantUsageStatisticsCollection usageStatistics(List<DailyUsageStatistics> usageStatistics) {
    this.usageStatistics = usageStatistics;
    return this;
  }

  public TenantUsageStatisticsCollection addUsageStatisticsItem(DailyUsageStatistics usageStatisticsItem) {
    if (this.usageStatistics == null) {
      this.usageStatistics = new ArrayList<>();
    }
    this.usageStatistics.add(usageStatisticsItem);
    return this;
  }

  /**
   * An array containing the tenant usage statistics.
   * 
   * @return usageStatistics
   */

  @JsonProperty("usageStatistics")
  public List<DailyUsageStatistics> getUsageStatistics() {
    return usageStatistics;
  }

  public void setUsageStatistics(List<DailyUsageStatistics> usageStatistics) {
    this.usageStatistics = usageStatistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantUsageStatisticsCollection tenantUsageStatisticsCollection = (TenantUsageStatisticsCollection) o;
    return Objects.equals(this.next, tenantUsageStatisticsCollection.next) &&
        Objects.equals(this.prev, tenantUsageStatisticsCollection.prev) &&
        Objects.equals(this.self, tenantUsageStatisticsCollection.self) &&
        Objects.equals(this.statistics, tenantUsageStatisticsCollection.statistics) &&
        Objects.equals(this.usageStatistics, tenantUsageStatisticsCollection.usageStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self, statistics, usageStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantUsageStatisticsCollection {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    usageStatistics: ").append(toIndentedString(usageStatistics)).append("\n");
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
