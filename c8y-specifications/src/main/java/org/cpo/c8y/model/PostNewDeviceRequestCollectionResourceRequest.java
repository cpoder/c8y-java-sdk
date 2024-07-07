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
 * PostNewDeviceRequestCollectionResourceRequest
 */

@JsonTypeName("postNewDeviceRequestCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostNewDeviceRequestCollectionResourceRequest {

  private String id;

  private JsonNullable<Object> groupId = JsonNullable.<Object>undefined();

  private JsonNullable<Object> type = JsonNullable.<Object>undefined();

  private String tenantId;

  private URI self;

  private JsonNullable<Object> status = JsonNullable.<Object>undefined();

  private String owner;

  private OffsetDateTime creationTime;

  private JsonNullable<Object> securityToken = JsonNullable.<Object>undefined();

  public PostNewDeviceRequestCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostNewDeviceRequestCollectionResourceRequest(String id) {
    this.id = id;
  }

  public PostNewDeviceRequestCollectionResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * External ID of the device.
   * 
   * @return id
   */
  @NotNull

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostNewDeviceRequestCollectionResourceRequest groupId(Object groupId) {
    this.groupId = JsonNullable.of(groupId);
    return this;
  }

  /**
   * Get groupId
   * 
   * @return groupId
   */

  @JsonProperty("groupId")
  public JsonNullable<Object> getGroupId() {
    return groupId;
  }

  public void setGroupId(JsonNullable<Object> groupId) {
    this.groupId = groupId;
  }

  public PostNewDeviceRequestCollectionResourceRequest type(Object type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */

  @JsonProperty("type")
  public JsonNullable<Object> getType() {
    return type;
  }

  public void setType(JsonNullable<Object> type) {
    this.type = type;
  }

  public PostNewDeviceRequestCollectionResourceRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant who owns the device.
   * 
   * @return tenantId
   */

  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public PostNewDeviceRequestCollectionResourceRequest self(URI self) {
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

  public PostNewDeviceRequestCollectionResourceRequest status(Object status) {
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

  public PostNewDeviceRequestCollectionResourceRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner of the device.
   * 
   * @return owner
   */

  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public PostNewDeviceRequestCollectionResourceRequest creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Date and time when the device was created in the database.
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

  public PostNewDeviceRequestCollectionResourceRequest securityToken(Object securityToken) {
    this.securityToken = JsonNullable.of(securityToken);
    return this;
  }

  /**
   * Get securityToken
   * 
   * @return securityToken
   */

  @JsonProperty("securityToken")
  public JsonNullable<Object> getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(JsonNullable<Object> securityToken) {
    this.securityToken = securityToken;
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
  public PostNewDeviceRequestCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostNewDeviceRequestCollectionResourceRequest postNewDeviceRequestCollectionResourceRequest = (PostNewDeviceRequestCollectionResourceRequest) o;
    return Objects.equals(this.id, postNewDeviceRequestCollectionResourceRequest.id) &&
        equalsNullable(this.groupId, postNewDeviceRequestCollectionResourceRequest.groupId) &&
        equalsNullable(this.type, postNewDeviceRequestCollectionResourceRequest.type) &&
        Objects.equals(this.tenantId, postNewDeviceRequestCollectionResourceRequest.tenantId) &&
        Objects.equals(this.self, postNewDeviceRequestCollectionResourceRequest.self) &&
        equalsNullable(this.status, postNewDeviceRequestCollectionResourceRequest.status) &&
        Objects.equals(this.owner, postNewDeviceRequestCollectionResourceRequest.owner) &&
        Objects.equals(this.creationTime, postNewDeviceRequestCollectionResourceRequest.creationTime) &&
        equalsNullable(this.securityToken, postNewDeviceRequestCollectionResourceRequest.securityToken) &&
        Objects.equals(this.additionalProperties, postNewDeviceRequestCollectionResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(groupId), hashCodeNullable(type), tenantId, self, hashCodeNullable(status),
        owner, creationTime, hashCodeNullable(securityToken), additionalProperties);
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
    sb.append("class PostNewDeviceRequestCollectionResourceRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");

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
