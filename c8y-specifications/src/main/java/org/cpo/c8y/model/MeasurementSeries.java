package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * MeasurementSeries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementSeries {

  private Object values;

  private List<MeasurementFragmentSeries> series = new ArrayList<>();

  private Boolean truncated;

  public MeasurementSeries values(Object values) {
    this.values = values;
    return this;
  }

  /**
   * Each property contained here is a date taken from the measurement and it
   * contains an array of objects specifying `min` and `max` pair of values. Each
   * pair corresponds to a single series object in the `series` array. If there is
   * no aggregation used, `min` is equal to `max` in every pair.
   * 
   * @return values
   */

  @JsonProperty("values")
  public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }

  public MeasurementSeries series(List<MeasurementFragmentSeries> series) {
    this.series = series;
    return this;
  }

  public MeasurementSeries addSeriesItem(MeasurementFragmentSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    return this;
  }

  /**
   * An array containing the type of series and units.
   * 
   * @return series
   */

  @JsonProperty("series")
  public List<MeasurementFragmentSeries> getSeries() {
    return series;
  }

  public void setSeries(List<MeasurementFragmentSeries> series) {
    this.series = series;
  }

  public MeasurementSeries truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * If there were more than 5000 values, the final result was truncated.
   * 
   * @return truncated
   */

  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSeries measurementSeries = (MeasurementSeries) o;
    return Objects.equals(this.values, measurementSeries.values) &&
        Objects.equals(this.series, measurementSeries.series) &&
        Objects.equals(this.truncated, measurementSeries.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, series, truncated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSeries {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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
