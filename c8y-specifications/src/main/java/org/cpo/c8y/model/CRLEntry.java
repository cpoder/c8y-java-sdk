package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * CRLEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CRLEntry {

  private String serialNumberInHex;

  private OffsetDateTime revocationDate;

  public CRLEntry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CRLEntry(String serialNumberInHex) {
    this.serialNumberInHex = serialNumberInHex;
  }

  public CRLEntry serialNumberInHex(String serialNumberInHex) {
    this.serialNumberInHex = serialNumberInHex;
    return this;
  }

  /**
   * Revoked certificate serial number in hexadecimal.
   * 
   * @return serialNumberInHex
   */
  @NotNull

  @JsonProperty("serialNumberInHex")
  public String getSerialNumberInHex() {
    return serialNumberInHex;
  }

  public void setSerialNumberInHex(String serialNumberInHex) {
    this.serialNumberInHex = serialNumberInHex;
  }

  public CRLEntry revocationDate(OffsetDateTime revocationDate) {
    this.revocationDate = revocationDate;
    return this;
  }

  /**
   * Date and time when the certificate is revoked.
   * 
   * @return revocationDate
   */

  @JsonProperty("revocationDate")
  public OffsetDateTime getRevocationDate() {
    return revocationDate;
  }

  public void setRevocationDate(OffsetDateTime revocationDate) {
    this.revocationDate = revocationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRLEntry crLEntry = (CRLEntry) o;
    return Objects.equals(this.serialNumberInHex, crLEntry.serialNumberInHex) &&
        Objects.equals(this.revocationDate, crLEntry.revocationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumberInHex, revocationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRLEntry {\n");
    sb.append("    serialNumberInHex: ").append(toIndentedString(serialNumberInHex)).append("\n");
    sb.append("    revocationDate: ").append(toIndentedString(revocationDate)).append("\n");
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
