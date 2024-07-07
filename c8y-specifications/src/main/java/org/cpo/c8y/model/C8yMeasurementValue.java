package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A measurement is a value with a unit.
 */

@JsonTypeName("c8y_MeasurementValue")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yMeasurementValue {

  private BigDecimal value;

  private String unit;

  public C8yMeasurementValue value(BigDecimal value) {
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

  public C8yMeasurementValue unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yMeasurementValue c8yMeasurementValue = (C8yMeasurementValue) o;
    return Objects.equals(this.value, c8yMeasurementValue.value) &&
        Objects.equals(this.unit, c8yMeasurementValue.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yMeasurementValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
