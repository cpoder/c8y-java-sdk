package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * RetentionRuleCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RetentionRuleCollection {

  private String next;

  private String prev;

  private List<RetentionRule> retentionRules = new ArrayList<>();

  private URI self;

  private PageStatistics statistics;

  public RetentionRuleCollection next(String next) {
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

  public RetentionRuleCollection prev(String prev) {
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

  public RetentionRuleCollection retentionRules(List<RetentionRule> retentionRules) {
    this.retentionRules = retentionRules;
    return this;
  }

  public RetentionRuleCollection addRetentionRulesItem(RetentionRule retentionRulesItem) {
    if (this.retentionRules == null) {
      this.retentionRules = new ArrayList<>();
    }
    this.retentionRules.add(retentionRulesItem);
    return this;
  }

  /**
   * An array containing the results (retention rules) of the request.
   * 
   * @return retentionRules
   */

  @JsonProperty("retentionRules")
  public List<RetentionRule> getRetentionRules() {
    return retentionRules;
  }

  public void setRetentionRules(List<RetentionRule> retentionRules) {
    this.retentionRules = retentionRules;
  }

  public RetentionRuleCollection self(URI self) {
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

  public RetentionRuleCollection statistics(PageStatistics statistics) {
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
    RetentionRuleCollection retentionRuleCollection = (RetentionRuleCollection) o;
    return Objects.equals(this.next, retentionRuleCollection.next) &&
        Objects.equals(this.prev, retentionRuleCollection.prev) &&
        Objects.equals(this.retentionRules, retentionRuleCollection.retentionRules) &&
        Objects.equals(this.self, retentionRuleCollection.self) &&
        Objects.equals(this.statistics, retentionRuleCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, retentionRules, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionRuleCollection {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    retentionRules: ").append(toIndentedString(retentionRules)).append("\n");
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
