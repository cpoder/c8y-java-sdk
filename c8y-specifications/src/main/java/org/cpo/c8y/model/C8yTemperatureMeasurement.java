package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Measurement of the temperature.
 */

@JsonTypeName("c8y_TemperatureMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yTemperatureMeasurement {

  private C8yTemperatureMeasurementT T;

  public C8yTemperatureMeasurement T(C8yTemperatureMeasurementT T) {
    this.T = T;
    return this;
  }

  /**
   * Get T
   * 
   * @return T
   */

  @JsonProperty("T")
  public C8yTemperatureMeasurementT getT() {
    return T;
  }

  public void setT(C8yTemperatureMeasurementT T) {
    this.T = T;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yTemperatureMeasurement c8yTemperatureMeasurement = (C8yTemperatureMeasurement) o;
    return Objects.equals(this.T, c8yTemperatureMeasurement.T);
  }

  @Override
  public int hashCode() {
    return Objects.hash(T);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yTemperatureMeasurement {\n");
    sb.append("    T: ").append(toIndentedString(T)).append("\n");
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
