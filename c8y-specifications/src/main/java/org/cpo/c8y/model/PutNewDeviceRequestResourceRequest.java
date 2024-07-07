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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PutNewDeviceRequestResourceRequest
 */

@JsonTypeName("putNewDeviceRequestResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PutNewDeviceRequestResourceRequest {

  private JsonNullable<Object> id = JsonNullable.<Object>undefined();

  private JsonNullable<Object> groupId = JsonNullable.<Object>undefined();

  private JsonNullable<Object> type = JsonNullable.<Object>undefined();

  private String tenantId;

  private URI self;

  /**
   * Status of this new device request.
   */
  public enum StatusEnum {
    WAITING_FOR_CONNECTION("WAITING_FOR_CONNECTION"),

    PENDING_ACCEPTANCE("PENDING_ACCEPTANCE"),

    ACCEPTED("ACCEPTED");

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

  private String owner;

  private OffsetDateTime creationTime;

  private String securityToken;

  public PutNewDeviceRequestResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PutNewDeviceRequestResourceRequest(StatusEnum status) {
    this.status = status;
  }

  public PutNewDeviceRequestResourceRequest id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * 
   * @return id
   */

  @JsonProperty("id")
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public PutNewDeviceRequestResourceRequest groupId(Object groupId) {
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

  public PutNewDeviceRequestResourceRequest type(Object type) {
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

  public PutNewDeviceRequestResourceRequest tenantId(String tenantId) {
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

  public PutNewDeviceRequestResourceRequest self(URI self) {
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

  public PutNewDeviceRequestResourceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of this new device request.
   * 
   * @return status
   */
  @NotNull

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PutNewDeviceRequestResourceRequest owner(String owner) {
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

  public PutNewDeviceRequestResourceRequest creationTime(OffsetDateTime creationTime) {
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

  public PutNewDeviceRequestResourceRequest securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  /**
   * When accepting a device request, the security token is verified against the
   * token submitted by the device when requesting credentials. See [Security
   * token
   * policy](https://cumulocity.com/docs/device-management-application/registering-devices/#security-token-policy)
   * for details on configuration. See [Create device
   * credentials](/#operation/postDeviceCredentialsCollectionResource) for details
   * on creating token for device registration. `securityToken` parameter can be
   * added only when submitting `ACCEPTED` status.
   * 
   * @return securityToken
   */

  @JsonProperty("securityToken")
  public String getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(String securityToken) {
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
  public PutNewDeviceRequestResourceRequest putAdditionalProperty(String key, Object value) {
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
    PutNewDeviceRequestResourceRequest putNewDeviceRequestResourceRequest = (PutNewDeviceRequestResourceRequest) o;
    return equalsNullable(this.id, putNewDeviceRequestResourceRequest.id) &&
        equalsNullable(this.groupId, putNewDeviceRequestResourceRequest.groupId) &&
        equalsNullable(this.type, putNewDeviceRequestResourceRequest.type) &&
        Objects.equals(this.tenantId, putNewDeviceRequestResourceRequest.tenantId) &&
        Objects.equals(this.self, putNewDeviceRequestResourceRequest.self) &&
        Objects.equals(this.status, putNewDeviceRequestResourceRequest.status) &&
        Objects.equals(this.owner, putNewDeviceRequestResourceRequest.owner) &&
        Objects.equals(this.creationTime, putNewDeviceRequestResourceRequest.creationTime) &&
        Objects.equals(this.securityToken, putNewDeviceRequestResourceRequest.securityToken) &&
        Objects.equals(this.additionalProperties, putNewDeviceRequestResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(groupId), hashCodeNullable(type), tenantId, self, status,
        owner, creationTime, securityToken, additionalProperties);
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
    sb.append("class PutNewDeviceRequestResourceRequest {\n");
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
