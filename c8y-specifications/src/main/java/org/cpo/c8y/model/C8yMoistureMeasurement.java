package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * There are three main measurements of moisture; absolute, relative and
 * specific. Absolute moisture is the absolute water content of a substance.
 * Relative moisture, expressed as a percentage, measures the current absolute
 * moisture relative to the maximum for that temperature. Specific humidity is a
 * ratio of the water vapour content of the mixture to the total substance
 * content on a mass basis.
 */

@JsonTypeName("c8y_MoistureMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yMoistureMeasurement {

  private C8yMoistureMeasurementMoisture moisture;

  public C8yMoistureMeasurement moisture(C8yMoistureMeasurementMoisture moisture) {
    this.moisture = moisture;
    return this;
  }

  /**
   * Get moisture
   * 
   * @return moisture
   */

  @JsonProperty("moisture")
  public C8yMoistureMeasurementMoisture getMoisture() {
    return moisture;
  }

  public void setMoisture(C8yMoistureMeasurementMoisture moisture) {
    this.moisture = moisture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yMoistureMeasurement c8yMoistureMeasurement = (C8yMoistureMeasurement) o;
    return Objects.equals(this.moisture, c8yMoistureMeasurement.moisture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moisture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yMoistureMeasurement {\n");
    sb.append("    moisture: ").append(toIndentedString(moisture)).append("\n");
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
