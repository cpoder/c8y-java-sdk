package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * SupportedMeasurements
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SupportedMeasurements {

  private List<String> c8ySupportedMeasurements = new ArrayList<>();

  public SupportedMeasurements c8ySupportedMeasurements(List<String> c8ySupportedMeasurements) {
    this.c8ySupportedMeasurements = c8ySupportedMeasurements;
    return this;
  }

  public SupportedMeasurements addC8ySupportedMeasurementsItem(String c8ySupportedMeasurementsItem) {
    if (this.c8ySupportedMeasurements == null) {
      this.c8ySupportedMeasurements = new ArrayList<>();
    }
    this.c8ySupportedMeasurements.add(c8ySupportedMeasurementsItem);
    return this;
  }

  /**
   * An array containing all supported measurements of the specified managed
   * object.
   * 
   * @return c8ySupportedMeasurements
   */

  @JsonProperty("c8y_SupportedMeasurements")
  public List<String> getC8ySupportedMeasurements() {
    return c8ySupportedMeasurements;
  }

  public void setC8ySupportedMeasurements(List<String> c8ySupportedMeasurements) {
    this.c8ySupportedMeasurements = c8ySupportedMeasurements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedMeasurements supportedMeasurements = (SupportedMeasurements) o;
    return Objects.equals(this.c8ySupportedMeasurements, supportedMeasurements.c8ySupportedMeasurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c8ySupportedMeasurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedMeasurements {\n");
    sb.append("    c8ySupportedMeasurements: ").append(toIndentedString(c8ySupportedMeasurements)).append("\n");
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
