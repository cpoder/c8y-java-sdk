package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostOperationCollectionResourceRequest
 */

@JsonTypeName("postOperationCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostOperationCollectionResourceRequest {

  private String bulkOperationId;

  private OffsetDateTime creationTime;

  private String deviceId;

  private ExternalIds deviceExternalIDs;

  private JsonNullable<Object> failureReason = JsonNullable.<Object>undefined();

  private String id;

  private URI self;

  private JsonNullable<Object> status = JsonNullable.<Object>undefined();

  public PostOperationCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostOperationCollectionResourceRequest(String deviceId) {
    this.deviceId = deviceId;
  }

  public PostOperationCollectionResourceRequest bulkOperationId(String bulkOperationId) {
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

  public PostOperationCollectionResourceRequest creationTime(OffsetDateTime creationTime) {
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

  public PostOperationCollectionResourceRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Identifier of the target device where the operation should be performed.
   * 
   * @return deviceId
   */
  @NotNull

  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public PostOperationCollectionResourceRequest deviceExternalIDs(ExternalIds deviceExternalIDs) {
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

  public PostOperationCollectionResourceRequest failureReason(Object failureReason) {
    this.failureReason = JsonNullable.of(failureReason);
    return this;
  }

  /**
   * Get failureReason
   * 
   * @return failureReason
   */

  @JsonProperty("failureReason")
  public JsonNullable<Object> getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(JsonNullable<Object> failureReason) {
    this.failureReason = failureReason;
  }

  public PostOperationCollectionResourceRequest id(String id) {
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

  public PostOperationCollectionResourceRequest self(URI self) {
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

  public PostOperationCollectionResourceRequest status(Object status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */

  @JsonProperty("status")
  public JsonNullable<Object> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<Object> status) {
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
  public PostOperationCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostOperationCollectionResourceRequest postOperationCollectionResourceRequest = (PostOperationCollectionResourceRequest) o;
    return Objects.equals(this.bulkOperationId, postOperationCollectionResourceRequest.bulkOperationId) &&
        Objects.equals(this.creationTime, postOperationCollectionResourceRequest.creationTime) &&
        Objects.equals(this.deviceId, postOperationCollectionResourceRequest.deviceId) &&
        Objects.equals(this.deviceExternalIDs, postOperationCollectionResourceRequest.deviceExternalIDs) &&
        equalsNullable(this.failureReason, postOperationCollectionResourceRequest.failureReason) &&
        Objects.equals(this.id, postOperationCollectionResourceRequest.id) &&
        Objects.equals(this.self, postOperationCollectionResourceRequest.self) &&
        equalsNullable(this.status, postOperationCollectionResourceRequest.status) &&
        Objects.equals(this.additionalProperties, postOperationCollectionResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOperationId, creationTime, deviceId, deviceExternalIDs, hashCodeNullable(failureReason), id,
        self, hashCodeNullable(status), additionalProperties);
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
    sb.append("class PostOperationCollectionResourceRequest {\n");
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
