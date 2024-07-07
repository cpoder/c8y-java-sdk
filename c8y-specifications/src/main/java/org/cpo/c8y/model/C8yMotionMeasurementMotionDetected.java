package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Boolean value indicating if motion has been detected (non-zero value) or not
 * (zero value).
 */

@JsonTypeName("c8y_MotionMeasurement_motionDetected")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yMotionMeasurementMotionDetected {

  private BigDecimal value;

  private String type;

  public C8yMotionMeasurementMotionDetected value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * 
   * @return value
   */

  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public C8yMotionMeasurementMotionDetected type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yMotionMeasurementMotionDetected c8yMotionMeasurementMotionDetected = (C8yMotionMeasurementMotionDetected) o;
    return Objects.equals(this.value, c8yMotionMeasurementMotionDetected.value) &&
        Objects.equals(this.type, c8yMotionMeasurementMotionDetected.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yMotionMeasurementMotionDetected {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
