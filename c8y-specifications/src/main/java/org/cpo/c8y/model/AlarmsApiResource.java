package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * AlarmsApiResource
 */

@JsonTypeName("alarmsApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AlarmsApiResource {

  private AlarmsApiResourceAlarms alarms;

  private String alarmsForSource;

  private String alarmsForStatus;

  private String alarmsForSourceAndStatusAndTime;

  private String alarmsForStatusAndTime;

  private String alarmsForSourceAndTime;

  private String alarmsForTime;

  private String alarmsForSourceAndStatus;

  private URI self;

  public AlarmsApiResource alarms(AlarmsApiResourceAlarms alarms) {
    this.alarms = alarms;
    return this;
  }

  /**
   * Get alarms
   * 
   * @return alarms
   */

  @JsonProperty("alarms")
  public AlarmsApiResourceAlarms getAlarms() {
    return alarms;
  }

  public void setAlarms(AlarmsApiResourceAlarms alarms) {
    this.alarms = alarms;
  }

  public AlarmsApiResource alarmsForSource(String alarmsForSource) {
    this.alarmsForSource = alarmsForSource;
    return this;
  }

  /**
   * Read-only collection of all alarms for a specific source object. The
   * placeholder {source} must be a unique ID of an object in the inventory.
   * 
   * @return alarmsForSource
   */

  @JsonProperty("alarmsForSource")
  public String getAlarmsForSource() {
    return alarmsForSource;
  }

  public void setAlarmsForSource(String alarmsForSource) {
    this.alarmsForSource = alarmsForSource;
  }

  public AlarmsApiResource alarmsForStatus(String alarmsForStatus) {
    this.alarmsForStatus = alarmsForStatus;
    return this;
  }

  /**
   * Read-only collection of all alarms in a particular status. The placeholder
   * {status} can be one of the following values: ACTIVE, ACKNOWLEDGED or CLEARED
   * 
   * @return alarmsForStatus
   */

  @JsonProperty("alarmsForStatus")
  public String getAlarmsForStatus() {
    return alarmsForStatus;
  }

  public void setAlarmsForStatus(String alarmsForStatus) {
    this.alarmsForStatus = alarmsForStatus;
  }

  public AlarmsApiResource alarmsForSourceAndStatusAndTime(String alarmsForSourceAndStatusAndTime) {
    this.alarmsForSourceAndStatusAndTime = alarmsForSourceAndStatusAndTime;
    return this;
  }

  /**
   * Read-only collection of all alarms for a specific source, status and time
   * range.
   * 
   * @return alarmsForSourceAndStatusAndTime
   */

  @JsonProperty("alarmsForSourceAndStatusAndTime")
  public String getAlarmsForSourceAndStatusAndTime() {
    return alarmsForSourceAndStatusAndTime;
  }

  public void setAlarmsForSourceAndStatusAndTime(String alarmsForSourceAndStatusAndTime) {
    this.alarmsForSourceAndStatusAndTime = alarmsForSourceAndStatusAndTime;
  }

  public AlarmsApiResource alarmsForStatusAndTime(String alarmsForStatusAndTime) {
    this.alarmsForStatusAndTime = alarmsForStatusAndTime;
    return this;
  }

  /**
   * Read-only collection of all alarms for a particular status and time range.
   * 
   * @return alarmsForStatusAndTime
   */

  @JsonProperty("alarmsForStatusAndTime")
  public String getAlarmsForStatusAndTime() {
    return alarmsForStatusAndTime;
  }

  public void setAlarmsForStatusAndTime(String alarmsForStatusAndTime) {
    this.alarmsForStatusAndTime = alarmsForStatusAndTime;
  }

  public AlarmsApiResource alarmsForSourceAndTime(String alarmsForSourceAndTime) {
    this.alarmsForSourceAndTime = alarmsForSourceAndTime;
    return this;
  }

  /**
   * Read-only collection of all alarms for a specific source and time range.
   * 
   * @return alarmsForSourceAndTime
   */

  @JsonProperty("alarmsForSourceAndTime")
  public String getAlarmsForSourceAndTime() {
    return alarmsForSourceAndTime;
  }

  public void setAlarmsForSourceAndTime(String alarmsForSourceAndTime) {
    this.alarmsForSourceAndTime = alarmsForSourceAndTime;
  }

  public AlarmsApiResource alarmsForTime(String alarmsForTime) {
    this.alarmsForTime = alarmsForTime;
    return this;
  }

  /**
   * Read-only collection of all alarms for a particular time range.
   * 
   * @return alarmsForTime
   */

  @JsonProperty("alarmsForTime")
  public String getAlarmsForTime() {
    return alarmsForTime;
  }

  public void setAlarmsForTime(String alarmsForTime) {
    this.alarmsForTime = alarmsForTime;
  }

  public AlarmsApiResource alarmsForSourceAndStatus(String alarmsForSourceAndStatus) {
    this.alarmsForSourceAndStatus = alarmsForSourceAndStatus;
    return this;
  }

  /**
   * Read-only collection of all alarms for a specific source object in a
   * particular status.
   * 
   * @return alarmsForSourceAndStatus
   */

  @JsonProperty("alarmsForSourceAndStatus")
  public String getAlarmsForSourceAndStatus() {
    return alarmsForSourceAndStatus;
  }

  public void setAlarmsForSourceAndStatus(String alarmsForSourceAndStatus) {
    this.alarmsForSourceAndStatus = alarmsForSourceAndStatus;
  }

  public AlarmsApiResource self(URI self) {
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
    AlarmsApiResource alarmsApiResource = (AlarmsApiResource) o;
    return Objects.equals(this.alarms, alarmsApiResource.alarms) &&
        Objects.equals(this.alarmsForSource, alarmsApiResource.alarmsForSource) &&
        Objects.equals(this.alarmsForStatus, alarmsApiResource.alarmsForStatus) &&
        Objects.equals(this.alarmsForSourceAndStatusAndTime, alarmsApiResource.alarmsForSourceAndStatusAndTime) &&
        Objects.equals(this.alarmsForStatusAndTime, alarmsApiResource.alarmsForStatusAndTime) &&
        Objects.equals(this.alarmsForSourceAndTime, alarmsApiResource.alarmsForSourceAndTime) &&
        Objects.equals(this.alarmsForTime, alarmsApiResource.alarmsForTime) &&
        Objects.equals(this.alarmsForSourceAndStatus, alarmsApiResource.alarmsForSourceAndStatus) &&
        Objects.equals(this.self, alarmsApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarms, alarmsForSource, alarmsForStatus, alarmsForSourceAndStatusAndTime,
        alarmsForStatusAndTime, alarmsForSourceAndTime, alarmsForTime, alarmsForSourceAndStatus, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmsApiResource {\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
    sb.append("    alarmsForSource: ").append(toIndentedString(alarmsForSource)).append("\n");
    sb.append("    alarmsForStatus: ").append(toIndentedString(alarmsForStatus)).append("\n");
    sb.append("    alarmsForSourceAndStatusAndTime: ").append(toIndentedString(alarmsForSourceAndStatusAndTime))
        .append("\n");
    sb.append("    alarmsForStatusAndTime: ").append(toIndentedString(alarmsForStatusAndTime)).append("\n");
    sb.append("    alarmsForSourceAndTime: ").append(toIndentedString(alarmsForSourceAndTime)).append("\n");
    sb.append("    alarmsForTime: ").append(toIndentedString(alarmsForTime)).append("\n");
    sb.append("    alarmsForSourceAndStatus: ").append(toIndentedString(alarmsForSourceAndStatus)).append("\n");
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
