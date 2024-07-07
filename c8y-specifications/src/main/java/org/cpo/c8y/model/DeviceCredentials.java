package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * DeviceCredentials
 */

@JsonTypeName("deviceCredentials")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DeviceCredentials {

  private String id;

  private String password;

  private URI self;

  private String tenantId;

  private String username;

  private String securityToken;

  public DeviceCredentials id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The external ID of the device.
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

  public DeviceCredentials password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of these device credentials.
   * 
   * @return password
   */

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DeviceCredentials self(URI self) {
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

  public DeviceCredentials tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant ID for these device credentials.
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

  public DeviceCredentials username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of these device credentials.
   * 
   * @return username
   */

  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DeviceCredentials securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  /**
   * Security token which is required and verified against during device request
   * acceptance. See [Security token
   * policy](https://cumulocity.com/docs/device-management-application/registering-devices/#security-token-policy)
   * for more details on configuration. See [Update specific new device request
   * status](/#operation/putNewDeviceRequestResource) for details on submitting
   * token upon device acceptance.
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
    DeviceCredentials deviceCredentials = (DeviceCredentials) o;
    return Objects.equals(this.id, deviceCredentials.id) &&
        Objects.equals(this.password, deviceCredentials.password) &&
        Objects.equals(this.self, deviceCredentials.self) &&
        Objects.equals(this.tenantId, deviceCredentials.tenantId) &&
        Objects.equals(this.username, deviceCredentials.username) &&
        Objects.equals(this.securityToken, deviceCredentials.securityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, self, tenantId, username, securityToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCredentials {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
