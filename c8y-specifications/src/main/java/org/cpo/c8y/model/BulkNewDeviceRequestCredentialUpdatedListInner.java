package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * BulkNewDeviceRequestCredentialUpdatedListInner
 */

@JsonTypeName("bulkNewDeviceRequest_credentialUpdatedList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BulkNewDeviceRequestCredentialUpdatedListInner {

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

  public BulkNewDeviceRequestCredentialUpdatedListInner bulkNewDeviceStatus(
      BulkNewDeviceStatusEnum bulkNewDeviceStatus) {
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

  public BulkNewDeviceRequestCredentialUpdatedListInner deviceId(String deviceId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkNewDeviceRequestCredentialUpdatedListInner bulkNewDeviceRequestCredentialUpdatedListInner = (BulkNewDeviceRequestCredentialUpdatedListInner) o;
    return Objects.equals(this.bulkNewDeviceStatus, bulkNewDeviceRequestCredentialUpdatedListInner.bulkNewDeviceStatus)
        &&
        Objects.equals(this.deviceId, bulkNewDeviceRequestCredentialUpdatedListInner.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkNewDeviceStatus, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkNewDeviceRequestCredentialUpdatedListInner {\n");
    sb.append("    bulkNewDeviceStatus: ").append(toIndentedString(bulkNewDeviceStatus)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
