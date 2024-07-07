package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Light is measured with two main alternative sets of units. Radiometry
 * consists of measurements of light power at all wavelengths, while photometry
 * measures light with wavelength weighted with respect to a standardized model
 * of human brightness perception. Photometry is useful, for example, to
 * quantify illumination (lighting) intended for human use.
 */

@JsonTypeName("c8y_LightMeasurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yLightMeasurement {

  private C8yLightMeasurementE e;

  public C8yLightMeasurement e(C8yLightMeasurementE e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * 
   * @return e
   */

  @JsonProperty("e")
  public C8yLightMeasurementE getE() {
    return e;
  }

  public void setE(C8yLightMeasurementE e) {
    this.e = e;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yLightMeasurement c8yLightMeasurement = (C8yLightMeasurement) o;
    return Objects.equals(this.e, c8yLightMeasurement.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yLightMeasurement {\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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
