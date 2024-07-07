package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * DeviceControlApiResource
 */

@JsonTypeName("deviceControlApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DeviceControlApiResource {

  private DeviceControlApiResourceOperations operations;

  private String operationsByStatus;

  private String operationsByAgentId;

  private String operationsByAgentIdAndStatus;

  private String operationsByDeviceId;

  private String operationsByDeviceIdAndStatus;

  private URI self;

  public DeviceControlApiResource operations(DeviceControlApiResourceOperations operations) {
    this.operations = operations;
    return this;
  }

  /**
   * Get operations
   * 
   * @return operations
   */

  @JsonProperty("operations")
  public DeviceControlApiResourceOperations getOperations() {
    return operations;
  }

  public void setOperations(DeviceControlApiResourceOperations operations) {
    this.operations = operations;
  }

  public DeviceControlApiResource operationsByStatus(String operationsByStatus) {
    this.operationsByStatus = operationsByStatus;
    return this;
  }

  /**
   * Read-only collection of all operations with a particular status.
   * 
   * @return operationsByStatus
   */

  @JsonProperty("operationsByStatus")
  public String getOperationsByStatus() {
    return operationsByStatus;
  }

  public void setOperationsByStatus(String operationsByStatus) {
    this.operationsByStatus = operationsByStatus;
  }

  public DeviceControlApiResource operationsByAgentId(String operationsByAgentId) {
    this.operationsByAgentId = operationsByAgentId;
    return this;
  }

  /**
   * Read-only collection of all operations targeting a particular agent.
   * 
   * @return operationsByAgentId
   */

  @JsonProperty("operationsByAgentId")
  public String getOperationsByAgentId() {
    return operationsByAgentId;
  }

  public void setOperationsByAgentId(String operationsByAgentId) {
    this.operationsByAgentId = operationsByAgentId;
  }

  public DeviceControlApiResource operationsByAgentIdAndStatus(String operationsByAgentIdAndStatus) {
    this.operationsByAgentIdAndStatus = operationsByAgentIdAndStatus;
    return this;
  }

  /**
   * Read-only collection of all operations targeting a particular agent and with
   * a particular status.
   * 
   * @return operationsByAgentIdAndStatus
   */

  @JsonProperty("operationsByAgentIdAndStatus")
  public String getOperationsByAgentIdAndStatus() {
    return operationsByAgentIdAndStatus;
  }

  public void setOperationsByAgentIdAndStatus(String operationsByAgentIdAndStatus) {
    this.operationsByAgentIdAndStatus = operationsByAgentIdAndStatus;
  }

  public DeviceControlApiResource operationsByDeviceId(String operationsByDeviceId) {
    this.operationsByDeviceId = operationsByDeviceId;
    return this;
  }

  /**
   * Read-only collection of all operations to be executed on a particular device.
   * 
   * @return operationsByDeviceId
   */

  @JsonProperty("operationsByDeviceId")
  public String getOperationsByDeviceId() {
    return operationsByDeviceId;
  }

  public void setOperationsByDeviceId(String operationsByDeviceId) {
    this.operationsByDeviceId = operationsByDeviceId;
  }

  public DeviceControlApiResource operationsByDeviceIdAndStatus(String operationsByDeviceIdAndStatus) {
    this.operationsByDeviceIdAndStatus = operationsByDeviceIdAndStatus;
    return this;
  }

  /**
   * Read-only collection of all operations with a particular status, that should
   * be executed on a particular device.
   * 
   * @return operationsByDeviceIdAndStatus
   */

  @JsonProperty("operationsByDeviceIdAndStatus")
  public String getOperationsByDeviceIdAndStatus() {
    return operationsByDeviceIdAndStatus;
  }

  public void setOperationsByDeviceIdAndStatus(String operationsByDeviceIdAndStatus) {
    this.operationsByDeviceIdAndStatus = operationsByDeviceIdAndStatus;
  }

  public DeviceControlApiResource self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
   * 
   * @return self
   */

  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceControlApiResource deviceControlApiResource = (DeviceControlApiResource) o;
    return Objects.equals(this.operations, deviceControlApiResource.operations) &&
        Objects.equals(this.operationsByStatus, deviceControlApiResource.operationsByStatus) &&
        Objects.equals(this.operationsByAgentId, deviceControlApiResource.operationsByAgentId) &&
        Objects.equals(this.operationsByAgentIdAndStatus, deviceControlApiResource.operationsByAgentIdAndStatus) &&
        Objects.equals(this.operationsByDeviceId, deviceControlApiResource.operationsByDeviceId) &&
        Objects.equals(this.operationsByDeviceIdAndStatus, deviceControlApiResource.operationsByDeviceIdAndStatus) &&
        Objects.equals(this.self, deviceControlApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, operationsByStatus, operationsByAgentId, operationsByAgentIdAndStatus,
        operationsByDeviceId, operationsByDeviceIdAndStatus, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceControlApiResource {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    operationsByStatus: ").append(toIndentedString(operationsByStatus)).append("\n");
    sb.append("    operationsByAgentId: ").append(toIndentedString(operationsByAgentId)).append("\n");
    sb.append("    operationsByAgentIdAndStatus: ").append(toIndentedString(operationsByAgentIdAndStatus)).append("\n");
    sb.append("    operationsByDeviceId: ").append(toIndentedString(operationsByDeviceId)).append("\n");
    sb.append("    operationsByDeviceIdAndStatus: ").append(toIndentedString(operationsByDeviceIdAndStatus))
        .append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
