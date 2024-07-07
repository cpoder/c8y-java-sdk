package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of all measurements
 */

@JsonTypeName("measurementApiResource_measurements")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementApiResourceMeasurements {

  private JsonNullable<List<Measurement>> measurements = JsonNullable.<List<Measurement>>undefined();

  private URI self;

  public MeasurementApiResourceMeasurements measurements(List<Measurement> measurements) {
    this.measurements = JsonNullable.of(measurements);
    return this;
  }

  public MeasurementApiResourceMeasurements addMeasurementsItem(Measurement measurementsItem) {
    if (this.measurements == null || !this.measurements.isPresent()) {
      this.measurements = JsonNullable.of(new ArrayList<>());
    }
    this.measurements.get().add(measurementsItem);
    return this;
  }

  /**
   * Get measurements
   * 
   * @return measurements
   */

  @JsonProperty("measurements")
  public JsonNullable<List<Measurement>> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(JsonNullable<List<Measurement>> measurements) {
    this.measurements = measurements;
  }

  public MeasurementApiResourceMeasurements self(URI self) {
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
    MeasurementApiResourceMeasurements measurementApiResourceMeasurements = (MeasurementApiResourceMeasurements) o;
    return equalsNullable(this.measurements, measurementApiResourceMeasurements.measurements) &&
        Objects.equals(this.self, measurementApiResourceMeasurements.self);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(measurements), self);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementApiResourceMeasurements {\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
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
