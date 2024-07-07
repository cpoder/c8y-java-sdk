package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Operation
 */

@JsonTypeName("operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Operation {

  private String bulkOperationId;

  private OffsetDateTime creationTime;

  private String deviceId;

  private ExternalIds deviceExternalIDs;

  private String failureReason;

  private String id;

  private URI self;

  /**
   * The status of the operation.
   */
  public enum StatusEnum {
    SUCCESSFUL("SUCCESSFUL"),

    FAILED("FAILED"),

    EXECUTING("EXECUTING"),

    PENDING("PENDING");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public Operation bulkOperationId(String bulkOperationId) {
    this.bulkOperationId = bulkOperationId;
    return this;
  }

  /**
   * Reference to a bulk operation ID if this operation was scheduled from a bulk
   * operation.
   * 
   * @return bulkOperationId
   */

  @JsonProperty("bulkOperationId")
  public String getBulkOperationId() {
    return bulkOperationId;
  }

  public void setBulkOperationId(String bulkOperationId) {
    this.bulkOperationId = bulkOperationId;
  }

  public Operation creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Date and time when the operation was created in the database.
   * 
   * @return creationTime
   */

  @JsonProperty("creationTime")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public Operation deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Identifier of the target device where the operation should be performed.
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

  public Operation deviceExternalIDs(ExternalIds deviceExternalIDs) {
    this.deviceExternalIDs = deviceExternalIDs;
    return this;
  }

  /**
   * Get deviceExternalIDs
   * 
   * @return deviceExternalIDs
   */

  @JsonProperty("deviceExternalIDs")
  public ExternalIds getDeviceExternalIDs() {
    return deviceExternalIDs;
  }

  public void setDeviceExternalIDs(ExternalIds deviceExternalIDs) {
    this.deviceExternalIDs = deviceExternalIDs;
  }

  public Operation failureReason(String failureReason) {
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

  public Operation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this operation.
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

  public Operation self(URI self) {
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

  public Operation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the operation.
   * 
   * @return status
   */

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Operation putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.bulkOperationId, operation.bulkOperationId) &&
        Objects.equals(this.creationTime, operation.creationTime) &&
        Objects.equals(this.deviceId, operation.deviceId) &&
        Objects.equals(this.deviceExternalIDs, operation.deviceExternalIDs) &&
        Objects.equals(this.failureReason, operation.failureReason) &&
        Objects.equals(this.id, operation.id) &&
        Objects.equals(this.self, operation.self) &&
        Objects.equals(this.status, operation.status) &&
        Objects.equals(this.additionalProperties, operation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOperationId, creationTime, deviceId, deviceExternalIDs, failureReason, id, self, status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    sb.append("    bulkOperationId: ").append(toIndentedString(bulkOperationId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceExternalIDs: ").append(toIndentedString(deviceExternalIDs)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
