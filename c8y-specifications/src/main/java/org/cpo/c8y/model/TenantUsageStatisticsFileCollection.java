package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * Statistics files metadata.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantUsageStatisticsFileCollection {

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  private List<StatisticsFile> statisticsFiles = new ArrayList<>();

  public TenantUsageStatisticsFileCollection next(String next) {
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

  public TenantUsageStatisticsFileCollection prev(String prev) {
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

  public TenantUsageStatisticsFileCollection self(URI self) {
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

  public TenantUsageStatisticsFileCollection statistics(PageStatistics statistics) {
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

  public TenantUsageStatisticsFileCollection statisticsFiles(List<StatisticsFile> statisticsFiles) {
    this.statisticsFiles = statisticsFiles;
    return this;
  }

  public TenantUsageStatisticsFileCollection addStatisticsFilesItem(StatisticsFile statisticsFilesItem) {
    if (this.statisticsFiles == null) {
      this.statisticsFiles = new ArrayList<>();
    }
    this.statisticsFiles.add(statisticsFilesItem);
    return this;
  }

  /**
   * An array containing the usage statistics files metadata.
   * 
   * @return statisticsFiles
   */

  @JsonProperty("statisticsFiles")
  public List<StatisticsFile> getStatisticsFiles() {
    return statisticsFiles;
  }

  public void setStatisticsFiles(List<StatisticsFile> statisticsFiles) {
    this.statisticsFiles = statisticsFiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantUsageStatisticsFileCollection tenantUsageStatisticsFileCollection = (TenantUsageStatisticsFileCollection) o;
    return Objects.equals(this.next, tenantUsageStatisticsFileCollection.next) &&
        Objects.equals(this.prev, tenantUsageStatisticsFileCollection.prev) &&
        Objects.equals(this.self, tenantUsageStatisticsFileCollection.self) &&
        Objects.equals(this.statistics, tenantUsageStatisticsFileCollection.statistics) &&
        Objects.equals(this.statisticsFiles, tenantUsageStatisticsFileCollection.statisticsFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self, statistics, statisticsFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantUsageStatisticsFileCollection {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    statisticsFiles: ").append(toIndentedString(statisticsFiles)).append("\n");
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
