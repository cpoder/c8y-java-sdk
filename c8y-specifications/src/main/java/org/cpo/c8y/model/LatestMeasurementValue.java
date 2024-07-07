package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * The read only fragment which contains the latest measurements series values
 * reported by the device. &gt; **⚠️ Feature Preview:** The feature is part of
 * the Latest Measurement feature which is still under public feature preview.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class LatestMeasurementValue {

  private String unit;

  private OffsetDateTime time;

  private BigDecimal value;

  public LatestMeasurementValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LatestMeasurementValue(BigDecimal value) {
    this.value = value;
  }

  public LatestMeasurementValue unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit of the measurement series.
   * 
   * @return unit
   */

  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public LatestMeasurementValue time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The time of the measurement series.
   * 
   * @return time
   */

  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public LatestMeasurementValue value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the individual measurement.
   * 
   * @return value
   */
  @NotNull

  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatestMeasurementValue latestMeasurementValue = (LatestMeasurementValue) o;
    return Objects.equals(this.unit, latestMeasurementValue.unit) &&
        Objects.equals(this.time, latestMeasurementValue.time) &&
        Objects.equals(this.value, latestMeasurementValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatestMeasurementValue {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
