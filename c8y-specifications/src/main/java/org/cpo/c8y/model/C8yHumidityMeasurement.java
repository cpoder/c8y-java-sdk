package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * There are three main measurements of humidity; absolute, relative and
 * specific. Absolute humidity is the water content of air. Relative humidity,
 * expressed as a percentage, measures the current absolute humidity relative to
 * the maximum for that temperature. Specific humidity is a ratio of the water
 * vapour content of the mixture to the total air content on a mass basis.
 */

@JsonTypeName("c8y_HumidityMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yHumidityMeasurement {

  private C8yHumidityMeasurementH h;

  public C8yHumidityMeasurement h(C8yHumidityMeasurementH h) {
    this.h = h;
    return this;
  }

  /**
   * Get h
   * 
   * @return h
   */

  @JsonProperty("h")
  public C8yHumidityMeasurementH getH() {
    return h;
  }

  public void setH(C8yHumidityMeasurementH h) {
    this.h = h;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yHumidityMeasurement c8yHumidityMeasurement = (C8yHumidityMeasurement) o;
    return Objects.equals(this.h, c8yHumidityMeasurement.h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yHumidityMeasurement {\n");
    sb.append("    h: ").append(toIndentedString(h)).append("\n");
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
