package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * SupportedSeries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SupportedSeries {

  private List<String> c8ySupportedSeries = new ArrayList<>();

  public SupportedSeries c8ySupportedSeries(List<String> c8ySupportedSeries) {
    this.c8ySupportedSeries = c8ySupportedSeries;
    return this;
  }

  public SupportedSeries addC8ySupportedSeriesItem(String c8ySupportedSeriesItem) {
    if (this.c8ySupportedSeries == null) {
      this.c8ySupportedSeries = new ArrayList<>();
    }
    this.c8ySupportedSeries.add(c8ySupportedSeriesItem);
    return this;
  }

  /**
   * An array containing all supported measurement series of the specified device.
   * 
   * @return c8ySupportedSeries
   */

  @JsonProperty("c8y_SupportedSeries")
  public List<String> getC8ySupportedSeries() {
    return c8ySupportedSeries;
  }

  public void setC8ySupportedSeries(List<String> c8ySupportedSeries) {
    this.c8ySupportedSeries = c8ySupportedSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedSeries supportedSeries = (SupportedSeries) o;
    return Objects.equals(this.c8ySupportedSeries, supportedSeries.c8ySupportedSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c8ySupportedSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedSeries {\n");
    sb.append("    c8ySupportedSeries: ").append(toIndentedString(c8ySupportedSeries)).append("\n");
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
