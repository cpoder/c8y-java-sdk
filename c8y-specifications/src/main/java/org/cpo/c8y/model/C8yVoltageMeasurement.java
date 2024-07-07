package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A voltage sensor measures the voltage difference between two points in an
 * electric circuit.
 */

@JsonTypeName("c8y_VoltageMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yVoltageMeasurement {

  private C8yVoltageMeasurementVoltage voltage;

  public C8yVoltageMeasurement voltage(C8yVoltageMeasurementVoltage voltage) {
    this.voltage = voltage;
    return this;
  }

  /**
   * Get voltage
   * 
   * @return voltage
   */

  @JsonProperty("voltage")
  public C8yVoltageMeasurementVoltage getVoltage() {
    return voltage;
  }

  public void setVoltage(C8yVoltageMeasurementVoltage voltage) {
    this.voltage = voltage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yVoltageMeasurement c8yVoltageMeasurement = (C8yVoltageMeasurement) o;
    return Objects.equals(this.voltage, c8yVoltageMeasurement.voltage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voltage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yVoltageMeasurement {\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
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
