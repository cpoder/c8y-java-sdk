package org.cpo.c8y.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * The current status, one of `AVAILABLE`, `CONNECTED`, `MAINTENANCE`,
 * `DISCONNECTED`.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public enum C8yAvailabilityStatus {

  AVAILABLE("AVAILABLE"),

  CONNECTED("CONNECTED"),

  MAINTENANCE("MAINTENANCE"),

  DISCONNECTED("DISCONNECTED");

  private String value;

  C8yAvailabilityStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static C8yAvailabilityStatus fromValue(String value) {
    for (C8yAvailabilityStatus b : C8yAvailabilityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
