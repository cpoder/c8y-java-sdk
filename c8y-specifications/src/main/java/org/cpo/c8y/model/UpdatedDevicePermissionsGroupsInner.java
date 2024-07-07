package org.cpo.c8y.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * UpdatedDevicePermissionsGroupsInner
 */

@JsonTypeName("UpdatedDevicePermissions_groups_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UpdatedDevicePermissionsGroupsInner {

  private String id;

  @Deprecated

  private Map<String, List<String>> devicePermissions = new HashMap<>();

  public UpdatedDevicePermissionsGroupsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * 
   * @return id
   */

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatedDevicePermissionsGroupsInner devicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
    return this;
  }

  public UpdatedDevicePermissionsGroupsInner putDevicePermissionsItem(String key, List<String> devicePermissionsItem) {
    if (this.devicePermissions == null) {
      this.devicePermissions = new HashMap<>();
    }
    this.devicePermissions.put(key, devicePermissionsItem);
    return this;
  }

  /**
   * An object with a list of the user's device permissions.
   * 
   * @return devicePermissions
   * @deprecated
   */

  @JsonProperty("devicePermissions")
  @Deprecated
  public Map<String, List<String>> getDevicePermissions() {
    return devicePermissions;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setDevicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedDevicePermissionsGroupsInner updatedDevicePermissionsGroupsInner = (UpdatedDevicePermissionsGroupsInner) o;
    return Objects.equals(this.id, updatedDevicePermissionsGroupsInner.id) &&
        Objects.equals(this.devicePermissions, updatedDevicePermissionsGroupsInner.devicePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, devicePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedDevicePermissionsGroupsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    devicePermissions: ").append(toIndentedString(devicePermissions)).append("\n");
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
