package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Measurement of the acceleration sensor.
 */

@JsonTypeName("c8y_AccelerationMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yAccelerationMeasurement {

  private C8yAccelerationMeasurementAcceleration acceleration;

  public C8yAccelerationMeasurement acceleration(C8yAccelerationMeasurementAcceleration acceleration) {
    this.acceleration = acceleration;
    return this;
  }

  /**
   * Get acceleration
   * 
   * @return acceleration
   */

  @JsonProperty("acceleration")
  public C8yAccelerationMeasurementAcceleration getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(C8yAccelerationMeasurementAcceleration acceleration) {
    this.acceleration = acceleration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yAccelerationMeasurement c8yAccelerationMeasurement = (C8yAccelerationMeasurement) o;
    return Objects.equals(this.acceleration, c8yAccelerationMeasurement.acceleration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yAccelerationMeasurement {\n");
    sb.append("    acceleration: ").append(toIndentedString(acceleration)).append("\n");
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
