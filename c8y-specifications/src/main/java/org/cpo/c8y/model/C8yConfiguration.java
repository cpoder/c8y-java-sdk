package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Text configuration fragment that allows you to configure parameters and
 * initial settings of your device. In the inventory,
 * &#x60;c8y_Configuration&#x60; represents the currently active configuration
 * on the device. As part of an operation, &#x60;c8y_Configuration&#x60;
 * requests the device to switch the transmitted configuration to the currently
 * active one. To enable configuration through the user interface, add
 * &#x60;c8y_Configuration&#x60; to the list of supported operations.
 */

@JsonTypeName("c8y_Configuration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yConfiguration {

  private String config;

  public C8yConfiguration config(String config) {
    this.config = config;
    return this;
  }

  /**
   * A text in a device-specific format, representing the configuration of the
   * device.
   * 
   * @return config
   */

  @JsonProperty("config")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yConfiguration c8yConfiguration = (C8yConfiguration) o;
    return Objects.equals(this.config, c8yConfiguration.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yConfiguration {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
