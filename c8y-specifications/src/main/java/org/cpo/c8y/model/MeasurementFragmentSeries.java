package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * MeasurementFragmentSeries
 */

@JsonTypeName("measurementFragmentSeries")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementFragmentSeries {

  private String unit;

  private String name;

  private String type;

  public MeasurementFragmentSeries unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit of the measurement.
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

  public MeasurementFragmentSeries name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the measurement.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MeasurementFragmentSeries type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of measurement.
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
    MeasurementFragmentSeries measurementFragmentSeries = (MeasurementFragmentSeries) o;
    return Objects.equals(this.unit, measurementFragmentSeries.unit) &&
        Objects.equals(this.name, measurementFragmentSeries.name) &&
        Objects.equals(this.type, measurementFragmentSeries.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementFragmentSeries {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
