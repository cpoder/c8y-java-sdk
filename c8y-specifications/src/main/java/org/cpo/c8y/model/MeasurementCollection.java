package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * MeasurementCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementCollection {

  private List<Measurement> measurements = new ArrayList<>();

  private String next;

  private String prev;

  private URI self;

  private MeasurementCollectionStatistics statistics;

  public MeasurementCollection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeasurementCollection(List<Measurement> measurements) {
    this.measurements = measurements;
  }

  public MeasurementCollection measurements(List<Measurement> measurements) {
    this.measurements = measurements;
    return this;
  }

  public MeasurementCollection addMeasurementsItem(Measurement measurementsItem) {
    if (this.measurements == null) {
      this.measurements = new ArrayList<>();
    }
    this.measurements.add(measurementsItem);
    return this;
  }

  /**
   * An array containing the measurements of the request.
   * 
   * @return measurements
   */
  @NotNull

  @JsonProperty("measurements")
  public List<Measurement> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(List<Measurement> measurements) {
    this.measurements = measurements;
  }

  public MeasurementCollection next(String next) {
    this.next = next;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential next page of managed objects.
   * 
   * @return next
   */

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public MeasurementCollection prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential previous page of managed objects.
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public MeasurementCollection self(URI self) {
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

  public MeasurementCollection statistics(MeasurementCollectionStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public MeasurementCollectionStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(MeasurementCollectionStatistics statistics) {
    this.statistics = statistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementCollection measurementCollection = (MeasurementCollection) o;
    return Objects.equals(this.measurements, measurementCollection.measurements) &&
        Objects.equals(this.next, measurementCollection.next) &&
        Objects.equals(this.prev, measurementCollection.prev) &&
        Objects.equals(this.self, measurementCollection.self) &&
        Objects.equals(this.statistics, measurementCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurements, next, prev, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollection {\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
