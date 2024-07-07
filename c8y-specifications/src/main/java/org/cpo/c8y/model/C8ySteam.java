package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A type of measurement fragment.
 */

@JsonTypeName("c8y_Steam")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8ySteam {

  private C8ySteamTemperature temperature;

  public C8ySteam temperature(C8ySteamTemperature temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * 
   * @return temperature
   */

  @JsonProperty("Temperature")
  public C8ySteamTemperature getTemperature() {
    return temperature;
  }

  public void setTemperature(C8ySteamTemperature temperature) {
    this.temperature = temperature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8ySteam c8ySteam = (C8ySteam) o;
    return Objects.equals(this.temperature, c8ySteam.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8ySteam {\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
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
