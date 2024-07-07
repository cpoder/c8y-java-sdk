package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Measurement of the motion sensor.
 */

@JsonTypeName("c8y_MotionMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yMotionMeasurement {

  private C8yMotionMeasurementMotionDetected motionDetected;

  private C8yMotionMeasurementSpeed speed;

  public C8yMotionMeasurement motionDetected(C8yMotionMeasurementMotionDetected motionDetected) {
    this.motionDetected = motionDetected;
    return this;
  }

  /**
   * Get motionDetected
   * 
   * @return motionDetected
   */

  @JsonProperty("motionDetected")
  public C8yMotionMeasurementMotionDetected getMotionDetected() {
    return motionDetected;
  }

  public void setMotionDetected(C8yMotionMeasurementMotionDetected motionDetected) {
    this.motionDetected = motionDetected;
  }

  public C8yMotionMeasurement speed(C8yMotionMeasurementSpeed speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * 
   * @return speed
   */

  @JsonProperty("speed")
  public C8yMotionMeasurementSpeed getSpeed() {
    return speed;
  }

  public void setSpeed(C8yMotionMeasurementSpeed speed) {
    this.speed = speed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yMotionMeasurement c8yMotionMeasurement = (C8yMotionMeasurement) o;
    return Objects.equals(this.motionDetected, c8yMotionMeasurement.motionDetected) &&
        Objects.equals(this.speed, c8yMotionMeasurement.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motionDetected, speed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yMotionMeasurement {\n");
    sb.append("    motionDetected: ").append(toIndentedString(motionDetected)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
