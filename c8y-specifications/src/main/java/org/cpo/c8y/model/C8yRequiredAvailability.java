package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Devices can be monitored for availability by adding a
 * &#x60;c8y_RequiredAvailability&#x60; fragment to the device. Devices that
 * have not sent any message in the response interval are considered
 * disconnected. The response interval can have a value between
 * &#x60;-32768&#x60; and &#x60;32767&#x60; and any values out of range will be
 * shrunk to the range borders. Such devices are marked as unavailable and an
 * unavailability alarm is raised.
 */

@JsonTypeName("c8y_RequiredAvailability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yRequiredAvailability {

  private Integer responseInterval;

  public C8yRequiredAvailability responseInterval(Integer responseInterval) {
    this.responseInterval = responseInterval;
    return this;
  }

  /**
   * Get responseInterval
   * 
   * @return responseInterval
   */

  @JsonProperty("responseInterval")
  public Integer getResponseInterval() {
    return responseInterval;
  }

  public void setResponseInterval(Integer responseInterval) {
    this.responseInterval = responseInterval;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yRequiredAvailability c8yRequiredAvailability = (C8yRequiredAvailability) o;
    return Objects.equals(this.responseInterval, c8yRequiredAvailability.responseInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yRequiredAvailability {\n");
    sb.append("    responseInterval: ").append(toIndentedString(responseInterval)).append("\n");
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
