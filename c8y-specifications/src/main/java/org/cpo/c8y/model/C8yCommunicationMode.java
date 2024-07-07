package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * In order to send commands as text messages to devices, the devices must be
 * put into SMS mode. To indicate that it supports SMS mode, a device needs to
 * add the fragment &#x60;c8y_CommunicationMode&#x60; with a mode property of
 * &#x60;SMS&#x60;.
 */

@JsonTypeName("c8y_CommunicationMode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yCommunicationMode {

  private String mode;

  public C8yCommunicationMode mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * 
   * @return mode
   */

  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yCommunicationMode c8yCommunicationMode = (C8yCommunicationMode) o;
    return Objects.equals(this.mode, c8yCommunicationMode.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yCommunicationMode {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
