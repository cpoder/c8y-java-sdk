package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * MeasurementApiResource
 */

@JsonTypeName("measurementApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementApiResource {

  private MeasurementApiResourceMeasurements measurements;

  private String measurementsForSource;

  private String measurementsForSourceAndType;

  private String measurementsForType;

  private String measurementsForValueFragmentType;

  private String measurementsForDate;

  private String measurementsForSourceAndDate;

  private String measurementsForDateAndFragmentType;

  private String measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries;

  private URI self;

  public MeasurementApiResource measurements(MeasurementApiResourceMeasurements measurements) {
    this.measurements = measurements;
    return this;
  }

  /**
   * Get measurements
   * 
   * @return measurements
   */

  @JsonProperty("measurements")
  public MeasurementApiResourceMeasurements getMeasurements() {
    return measurements;
  }

  public void setMeasurements(MeasurementApiResourceMeasurements measurements) {
    this.measurements = measurements;
  }

  public MeasurementApiResource measurementsForSource(String measurementsForSource) {
    this.measurementsForSource = measurementsForSource;
    return this;
  }

  /**
   * Read-only collection of all measurements for a specific source object. The
   * placeholder {source} must be a unique ID of an object in the inventory.
   * 
   * @return measurementsForSource
   */

  @JsonProperty("measurementsForSource")
  public String getMeasurementsForSource() {
    return measurementsForSource;
  }

  public void setMeasurementsForSource(String measurementsForSource) {
    this.measurementsForSource = measurementsForSource;
  }

  public MeasurementApiResource measurementsForSourceAndType(String measurementsForSourceAndType) {
    this.measurementsForSourceAndType = measurementsForSourceAndType;
    return this;
  }

  /**
   * Read-only collection of all measurements of a particular type and a specific
   * source object.
   * 
   * @return measurementsForSourceAndType
   */

  @JsonProperty("measurementsForSourceAndType")
  public String getMeasurementsForSourceAndType() {
    return measurementsForSourceAndType;
  }

  public void setMeasurementsForSourceAndType(String measurementsForSourceAndType) {
    this.measurementsForSourceAndType = measurementsForSourceAndType;
  }

  public MeasurementApiResource measurementsForType(String measurementsForType) {
    this.measurementsForType = measurementsForType;
    return this;
  }

  /**
   * Read-only collection of all measurements of a particular type.
   * 
   * @return measurementsForType
   */

  @JsonProperty("measurementsForType")
  public String getMeasurementsForType() {
    return measurementsForType;
  }

  public void setMeasurementsForType(String measurementsForType) {
    this.measurementsForType = measurementsForType;
  }

  public MeasurementApiResource measurementsForValueFragmentType(String measurementsForValueFragmentType) {
    this.measurementsForValueFragmentType = measurementsForValueFragmentType;
    return this;
  }

  /**
   * Read-only collection of all measurements containing a particular fragment
   * type.
   * 
   * @return measurementsForValueFragmentType
   */

  @JsonProperty("measurementsForValueFragmentType")
  public String getMeasurementsForValueFragmentType() {
    return measurementsForValueFragmentType;
  }

  public void setMeasurementsForValueFragmentType(String measurementsForValueFragmentType) {
    this.measurementsForValueFragmentType = measurementsForValueFragmentType;
  }

  public MeasurementApiResource measurementsForDate(String measurementsForDate) {
    this.measurementsForDate = measurementsForDate;
    return this;
  }

  /**
   * Read-only collection of all measurements for a particular time range.
   * 
   * @return measurementsForDate
   */

  @JsonProperty("measurementsForDate")
  public String getMeasurementsForDate() {
    return measurementsForDate;
  }

  public void setMeasurementsForDate(String measurementsForDate) {
    this.measurementsForDate = measurementsForDate;
  }

  public MeasurementApiResource measurementsForSourceAndDate(String measurementsForSourceAndDate) {
    this.measurementsForSourceAndDate = measurementsForSourceAndDate;
    return this;
  }

  /**
   * Read-only collection of all measurements for a specific source object in a
   * particular time range.
   * 
   * @return measurementsForSourceAndDate
   */

  @JsonProperty("measurementsForSourceAndDate")
  public String getMeasurementsForSourceAndDate() {
    return measurementsForSourceAndDate;
  }

  public void setMeasurementsForSourceAndDate(String measurementsForSourceAndDate) {
    this.measurementsForSourceAndDate = measurementsForSourceAndDate;
  }

  public MeasurementApiResource measurementsForDateAndFragmentType(String measurementsForDateAndFragmentType) {
    this.measurementsForDateAndFragmentType = measurementsForDateAndFragmentType;
    return this;
  }

  /**
   * Read-only collection of all measurements for a specific fragment type and a
   * particular time range.
   * 
   * @return measurementsForDateAndFragmentType
   */

  @JsonProperty("measurementsForDateAndFragmentType")
  public String getMeasurementsForDateAndFragmentType() {
    return measurementsForDateAndFragmentType;
  }

  public void setMeasurementsForDateAndFragmentType(String measurementsForDateAndFragmentType) {
    this.measurementsForDateAndFragmentType = measurementsForDateAndFragmentType;
  }

  public MeasurementApiResource measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries(
      String measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries) {
    this.measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries = measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries;
    return this;
  }

  /**
   * Read-only collection of all measurements for a specific source object,
   * particular fragment type and series, and an event type.
   * 
   * @return measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries
   */

  @JsonProperty("measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries")
  public String getMeasurementsForSourceAndValueFragmentTypeAndValueFragmentSeries() {
    return measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries;
  }

  public void setMeasurementsForSourceAndValueFragmentTypeAndValueFragmentSeries(
      String measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries) {
    this.measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries = measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries;
  }

  public MeasurementApiResource self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
   * 
   * @return self
   */

  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementApiResource measurementApiResource = (MeasurementApiResource) o;
    return Objects.equals(this.measurements, measurementApiResource.measurements) &&
        Objects.equals(this.measurementsForSource, measurementApiResource.measurementsForSource) &&
        Objects.equals(this.measurementsForSourceAndType, measurementApiResource.measurementsForSourceAndType) &&
        Objects.equals(this.measurementsForType, measurementApiResource.measurementsForType) &&
        Objects.equals(this.measurementsForValueFragmentType, measurementApiResource.measurementsForValueFragmentType)
        &&
        Objects.equals(this.measurementsForDate, measurementApiResource.measurementsForDate) &&
        Objects.equals(this.measurementsForSourceAndDate, measurementApiResource.measurementsForSourceAndDate) &&
        Objects
            .equals(this.measurementsForDateAndFragmentType, measurementApiResource.measurementsForDateAndFragmentType)
        &&
        Objects.equals(this.measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries,
            measurementApiResource.measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries)
        &&
        Objects.equals(this.self, measurementApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurements, measurementsForSource, measurementsForSourceAndType, measurementsForType,
        measurementsForValueFragmentType, measurementsForDate, measurementsForSourceAndDate,
        measurementsForDateAndFragmentType, measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementApiResource {\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    measurementsForSource: ").append(toIndentedString(measurementsForSource)).append("\n");
    sb.append("    measurementsForSourceAndType: ").append(toIndentedString(measurementsForSourceAndType)).append("\n");
    sb.append("    measurementsForType: ").append(toIndentedString(measurementsForType)).append("\n");
    sb.append("    measurementsForValueFragmentType: ").append(toIndentedString(measurementsForValueFragmentType))
        .append("\n");
    sb.append("    measurementsForDate: ").append(toIndentedString(measurementsForDate)).append("\n");
    sb.append("    measurementsForSourceAndDate: ").append(toIndentedString(measurementsForSourceAndDate)).append("\n");
    sb.append("    measurementsForDateAndFragmentType: ").append(toIndentedString(measurementsForDateAndFragmentType))
        .append("\n");
    sb.append("    measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries: ")
        .append(toIndentedString(measurementsForSourceAndValueFragmentTypeAndValueFragmentSeries)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
