package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * C8ySteamTemperature
 */

@JsonTypeName("c8y_Steam_Temperature")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8ySteamTemperature {

  private String unit;

  private BigDecimal value;

  public C8ySteamTemperature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public C8ySteamTemperature(BigDecimal value) {
    this.value = value;
  }

  public C8ySteamTemperature unit(String unit) {
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

  public C8ySteamTemperature value(BigDecimal value) {
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
    C8ySteamTemperature c8ySteamTemperature = (C8ySteamTemperature) o;
    return Objects.equals(this.unit, c8ySteamTemperature.unit) &&
        Objects.equals(this.value, c8ySteamTemperature.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8ySteamTemperature {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
