package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Contains information on a device&#39;s firmware. In the inventory,
 * &#x60;c8y_Firmware&#x60; represents the currently installed firmware on the
 * device. As part of an operation, &#x60;c8y_Firmware&#x60; requests the device
 * to install the indicated firmware. To enable firmware installation through
 * the user interface, add &#x60;c8y_Firmware&#x60; to the list of supported
 * operations.
 */

@JsonTypeName("c8y_Firmware")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yFirmware {

  private String name;

  private String version;

  private URI url;

  public C8yFirmware name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the firmware.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public C8yFirmware version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A version identifier of the firmware.
   * 
   * @return version
   */

  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public C8yFirmware url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * A URI linking to the location to download the firmware from.
   * 
   * @return url
   */

  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yFirmware c8yFirmware = (C8yFirmware) o;
    return Objects.equals(this.name, c8yFirmware.name) &&
        Objects.equals(this.version, c8yFirmware.version) &&
        Objects.equals(this.url, c8yFirmware.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yFirmware {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
