package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * BulkNewDeviceRequestFailedCreationListInner
 */

@JsonTypeName("bulkNewDeviceRequest_failedCreationList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BulkNewDeviceRequestFailedCreationListInner {

  /**
   * The device credentials creation status.
   */
  public enum BulkNewDeviceStatusEnum {
    CREATED("CREATED"),

    FAILED("FAILED"),

    CREDENTIAL_UPDATED("CREDENTIAL_UPDATED");

    private String value;

    BulkNewDeviceStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BulkNewDeviceStatusEnum fromValue(String value) {
      for (BulkNewDeviceStatusEnum b : BulkNewDeviceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BulkNewDeviceStatusEnum bulkNewDeviceStatus;

  private String deviceId;

  private String failureReason;

  private String line;

  public BulkNewDeviceRequestFailedCreationListInner bulkNewDeviceStatus(BulkNewDeviceStatusEnum bulkNewDeviceStatus) {
    this.bulkNewDeviceStatus = bulkNewDeviceStatus;
    return this;
  }

  /**
   * The device credentials creation status.
   * 
   * @return bulkNewDeviceStatus
   */

  @JsonProperty("bulkNewDeviceStatus")
  public BulkNewDeviceStatusEnum getBulkNewDeviceStatus() {
    return bulkNewDeviceStatus;
  }

  public void setBulkNewDeviceStatus(BulkNewDeviceStatusEnum bulkNewDeviceStatus) {
    this.bulkNewDeviceStatus = bulkNewDeviceStatus;
  }

  public BulkNewDeviceRequestFailedCreationListInner deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Unique identifier of the device.
   * 
   * @return deviceId
   */

  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public BulkNewDeviceRequestFailedCreationListInner failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Reason for the failure.
   * 
   * @return failureReason
   */

  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public BulkNewDeviceRequestFailedCreationListInner line(String line) {
    this.line = line;
    return this;
  }

  /**
   * Line where the failure occurred.
   * 
   * @return line
   */

  @JsonProperty("line")
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkNewDeviceRequestFailedCreationListInner bulkNewDeviceRequestFailedCreationListInner = (BulkNewDeviceRequestFailedCreationListInner) o;
    return Objects.equals(this.bulkNewDeviceStatus, bulkNewDeviceRequestFailedCreationListInner.bulkNewDeviceStatus) &&
        Objects.equals(this.deviceId, bulkNewDeviceRequestFailedCreationListInner.deviceId) &&
        Objects.equals(this.failureReason, bulkNewDeviceRequestFailedCreationListInner.failureReason) &&
        Objects.equals(this.line, bulkNewDeviceRequestFailedCreationListInner.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkNewDeviceStatus, deviceId, failureReason, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkNewDeviceRequestFailedCreationListInner {\n");
    sb.append("    bulkNewDeviceStatus: ").append(toIndentedString(bulkNewDeviceStatus)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
