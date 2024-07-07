package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Current measurement.
 */

@JsonTypeName("c8y_CurrentMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yCurrentMeasurement {

  private C8yCurrentMeasurementCurrent current;

  public C8yCurrentMeasurement current(C8yCurrentMeasurementCurrent current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * 
   * @return current
   */

  @JsonProperty("current")
  public C8yCurrentMeasurementCurrent getCurrent() {
    return current;
  }

  public void setCurrent(C8yCurrentMeasurementCurrent current) {
    this.current = current;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yCurrentMeasurement c8yCurrentMeasurement = (C8yCurrentMeasurement) o;
    return Objects.equals(this.current, c8yCurrentMeasurement.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yCurrentMeasurement {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
