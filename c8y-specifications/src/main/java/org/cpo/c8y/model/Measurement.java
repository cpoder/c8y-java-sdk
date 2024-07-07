package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Measurement
 */

@JsonTypeName("measurement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Measurement {

  private String id;

  private URI self;

  private MeasurementSource source;

  private OffsetDateTime time;

  private String type;

  private C8ySteam c8ySteam;

  public Measurement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Measurement(MeasurementSource source, OffsetDateTime time, String type) {
    this.source = source;
    this.time = time;
    this.type = type;
  }

  public Measurement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the measurement.
   * 
   * @return id
   */

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Measurement self(URI self) {
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

  public Measurement source(MeasurementSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */
  @NotNull

  @JsonProperty("source")
  public MeasurementSource getSource() {
    return source;
  }

  public void setSource(MeasurementSource source) {
    this.source = source;
  }

  public Measurement time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The date and time when the measurement is created.
   * 
   * @return time
   */
  @NotNull

  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Measurement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Identifies the type of this measurement.
   * 
   * @return type
   */
  @NotNull

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Measurement c8ySteam(C8ySteam c8ySteam) {
    this.c8ySteam = c8ySteam;
    return this;
  }

  /**
   * Get c8ySteam
   * 
   * @return c8ySteam
   */

  @JsonProperty("c8y_Steam")
  public C8ySteam getC8ySteam() {
    return c8ySteam;
  }

  public void setC8ySteam(C8ySteam c8ySteam) {
    this.c8ySteam = c8ySteam;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Measurement putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.id, measurement.id) &&
        Objects.equals(this.self, measurement.self) &&
        Objects.equals(this.source, measurement.source) &&
        Objects.equals(this.time, measurement.time) &&
        Objects.equals(this.type, measurement.type) &&
        Objects.equals(this.c8ySteam, measurement.c8ySteam) &&
        Objects.equals(this.additionalProperties, measurement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, source, time, type, c8ySteam, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    c8ySteam: ").append(toIndentedString(c8ySteam)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
