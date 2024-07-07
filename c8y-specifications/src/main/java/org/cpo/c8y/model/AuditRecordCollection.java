package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * AuditRecordCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuditRecordCollection {

  private String prev;

  private URI self;

  private String next;

  private PageStatistics statistics;

  private List<AuditRecord> auditRecords = new ArrayList<>();

  public AuditRecordCollection prev(String prev) {
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

  public AuditRecordCollection self(URI self) {
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

  public AuditRecordCollection next(String next) {
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

  public AuditRecordCollection statistics(PageStatistics statistics) {
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

  public AuditRecordCollection auditRecords(List<AuditRecord> auditRecords) {
    this.auditRecords = auditRecords;
    return this;
  }

  public AuditRecordCollection addAuditRecordsItem(AuditRecord auditRecordsItem) {
    if (this.auditRecords == null) {
      this.auditRecords = new ArrayList<>();
    }
    this.auditRecords.add(auditRecordsItem);
    return this;
  }

  /**
   * An array containing the results of the request.
   * 
   * @return auditRecords
   */

  @JsonProperty("auditRecords")
  public List<AuditRecord> getAuditRecords() {
    return auditRecords;
  }

  public void setAuditRecords(List<AuditRecord> auditRecords) {
    this.auditRecords = auditRecords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecordCollection auditRecordCollection = (AuditRecordCollection) o;
    return Objects.equals(this.prev, auditRecordCollection.prev) &&
        Objects.equals(this.self, auditRecordCollection.self) &&
        Objects.equals(this.next, auditRecordCollection.next) &&
        Objects.equals(this.statistics, auditRecordCollection.statistics) &&
        Objects.equals(this.auditRecords, auditRecordCollection.auditRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prev, self, next, statistics, auditRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecordCollection {\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
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
