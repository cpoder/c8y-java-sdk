package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * Statistics of a specific device (identified by an ID).
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DeviceStatistics {

  private Integer count;

  private String deviceId;

  private JsonNullable<List<String>> deviceParents = JsonNullable.<List<String>>undefined();

  private String deviceType;

  public DeviceStatistics count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Sum of measurements, events and alarms created and updated for the specified
   * device.
   * minimum: 0
   * 
   * @return count
   */

  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DeviceStatistics deviceId(String deviceId) {
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

  public DeviceStatistics deviceParents(List<String> deviceParents) {
    this.deviceParents = JsonNullable.of(deviceParents);
    return this;
  }

  public DeviceStatistics addDeviceParentsItem(String deviceParentsItem) {
    if (this.deviceParents == null || !this.deviceParents.isPresent()) {
      this.deviceParents = JsonNullable.of(new ArrayList<>());
    }
    this.deviceParents.get().add(deviceParentsItem);
    return this;
  }

  /**
   * List of unique identifiers of parents for the corresponding device. Available
   * only with monthly data.
   * 
   * @return deviceParents
   */

  @JsonProperty("deviceParents")
  public JsonNullable<List<String>> getDeviceParents() {
    return deviceParents;
  }

  public void setDeviceParents(JsonNullable<List<String>> deviceParents) {
    this.deviceParents = deviceParents;
  }

  public DeviceStatistics deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Value of the `type` field from the corresponding device. Available only with
   * monthly data.
   * 
   * @return deviceType
   */

  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceStatistics deviceStatistics = (DeviceStatistics) o;
    return Objects.equals(this.count, deviceStatistics.count) &&
        Objects.equals(this.deviceId, deviceStatistics.deviceId) &&
        equalsNullable(this.deviceParents, deviceStatistics.deviceParents) &&
        Objects.equals(this.deviceType, deviceStatistics.deviceType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, deviceId, hashCodeNullable(deviceParents), deviceType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceStatistics {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceParents: ").append(toIndentedString(deviceParents)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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
