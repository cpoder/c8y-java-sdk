package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * NewDeviceRequest
 */

@JsonTypeName("newDeviceRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NewDeviceRequest {

  private String id;

  private String groupId;

  private String type;

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

  public NewDeviceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * External ID of the device.
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

  public NewDeviceRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * ID of the group to which the device will be assigned.
   * 
   * @return groupId
   */

  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public NewDeviceRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the device.
   * 
   * @return type
   */

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NewDeviceRequest tenantId(String tenantId) {
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

  public NewDeviceRequest self(URI self) {
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

  public NewDeviceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of this new device request.
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

  public NewDeviceRequest owner(String owner) {
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

  public NewDeviceRequest creationTime(OffsetDateTime creationTime) {
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

  public NewDeviceRequest securityToken(String securityToken) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewDeviceRequest newDeviceRequest = (NewDeviceRequest) o;
    return Objects.equals(this.id, newDeviceRequest.id) &&
        Objects.equals(this.groupId, newDeviceRequest.groupId) &&
        Objects.equals(this.type, newDeviceRequest.type) &&
        Objects.equals(this.tenantId, newDeviceRequest.tenantId) &&
        Objects.equals(this.self, newDeviceRequest.self) &&
        Objects.equals(this.status, newDeviceRequest.status) &&
        Objects.equals(this.owner, newDeviceRequest.owner) &&
        Objects.equals(this.creationTime, newDeviceRequest.creationTime) &&
        Objects.equals(this.securityToken, newDeviceRequest.securityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, type, tenantId, self, status, owner, creationTime, securityToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewDeviceRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
