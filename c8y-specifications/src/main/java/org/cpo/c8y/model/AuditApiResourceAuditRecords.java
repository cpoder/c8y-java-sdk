package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of audit records
 */

@JsonTypeName("auditApiResource_auditRecords")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuditApiResourceAuditRecords {

  private URI self;

  private JsonNullable<List<AuditRecord>> auditRecords = JsonNullable.<List<AuditRecord>>undefined();

  public AuditApiResourceAuditRecords self(URI self) {
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

  public AuditApiResourceAuditRecords auditRecords(List<AuditRecord> auditRecords) {
    this.auditRecords = JsonNullable.of(auditRecords);
    return this;
  }

  public AuditApiResourceAuditRecords addAuditRecordsItem(AuditRecord auditRecordsItem) {
    if (this.auditRecords == null || !this.auditRecords.isPresent()) {
      this.auditRecords = JsonNullable.of(new ArrayList<>());
    }
    this.auditRecords.get().add(auditRecordsItem);
    return this;
  }

  /**
   * Get auditRecords
   * 
   * @return auditRecords
   */

  @JsonProperty("auditRecords")
  public JsonNullable<List<AuditRecord>> getAuditRecords() {
    return auditRecords;
  }

  public void setAuditRecords(JsonNullable<List<AuditRecord>> auditRecords) {
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
    AuditApiResourceAuditRecords auditApiResourceAuditRecords = (AuditApiResourceAuditRecords) o;
    return Objects.equals(this.self, auditApiResourceAuditRecords.self) &&
        equalsNullable(this.auditRecords, auditApiResourceAuditRecords.auditRecords);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(auditRecords));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApiResourceAuditRecords {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
