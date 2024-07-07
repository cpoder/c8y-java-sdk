package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The number of currently active and acknowledged alarms is stored in this
 * fragment.
 */

@JsonTypeName("c8y_ActiveAlarmsStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yActiveAlarmsStatus {

  private Integer critical;

  private Integer major;

  private Integer minor;

  private Integer warning;

  public C8yActiveAlarmsStatus critical(Integer critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Get critical
   * 
   * @return critical
   */

  @JsonProperty("critical")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }

  public C8yActiveAlarmsStatus major(Integer major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * 
   * @return major
   */

  @JsonProperty("major")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public C8yActiveAlarmsStatus minor(Integer minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor
   * 
   * @return minor
   */

  @JsonProperty("minor")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public C8yActiveAlarmsStatus warning(Integer warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * 
   * @return warning
   */

  @JsonProperty("warning")
  public Integer getWarning() {
    return warning;
  }

  public void setWarning(Integer warning) {
    this.warning = warning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yActiveAlarmsStatus c8yActiveAlarmsStatus = (C8yActiveAlarmsStatus) o;
    return Objects.equals(this.critical, c8yActiveAlarmsStatus.critical) &&
        Objects.equals(this.major, c8yActiveAlarmsStatus.major) &&
        Objects.equals(this.minor, c8yActiveAlarmsStatus.minor) &&
        Objects.equals(this.warning, c8yActiveAlarmsStatus.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, major, minor, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yActiveAlarmsStatus {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
