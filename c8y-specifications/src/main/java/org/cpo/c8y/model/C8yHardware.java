package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Contains basic hardware information for a device, such as make and serial
 * number. Often, the hardware serial number is printed on the board of the
 * device or on an asset tag on the device to uniquely identify the device
 * within all devices of the same make.
 */

@JsonTypeName("c8y_Hardware")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yHardware {

  private String model;

  private String revision;

  private String serialNumber;

  public C8yHardware model(String model) {
    this.model = model;
    return this;
  }

  /**
   * A text identifier of the device's hardware model.
   * 
   * @return model
   */

  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public C8yHardware revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * A text identifier of the hardware revision.
   * 
   * @return revision
   */

  @JsonProperty("revision")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public C8yHardware serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The hardware serial number of the device.
   * 
   * @return serialNumber
   */

  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yHardware c8yHardware = (C8yHardware) o;
    return Objects.equals(this.model, c8yHardware.model) &&
        Objects.equals(this.revision, c8yHardware.revision) &&
        Objects.equals(this.serialNumber, c8yHardware.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, revision, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yHardware {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
