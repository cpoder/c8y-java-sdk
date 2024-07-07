package org.cpo.c8y.model;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostDeviceCredentialsCollectionResourceRequest
 */

@JsonTypeName("postDeviceCredentialsCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostDeviceCredentialsCollectionResourceRequest {

  private String id;

  private String password;

  private URI self;

  private String tenantId;

  private String username;

  private String securityToken;

  public PostDeviceCredentialsCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostDeviceCredentialsCollectionResourceRequest(String id) {
    this.id = id;
  }

  public PostDeviceCredentialsCollectionResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The external ID of the device.
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

  public PostDeviceCredentialsCollectionResourceRequest password(String password) {
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

  public PostDeviceCredentialsCollectionResourceRequest self(URI self) {
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

  public PostDeviceCredentialsCollectionResourceRequest tenantId(String tenantId) {
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

  public PostDeviceCredentialsCollectionResourceRequest username(String username) {
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

  public PostDeviceCredentialsCollectionResourceRequest securityToken(String securityToken) {
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
  public PostDeviceCredentialsCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostDeviceCredentialsCollectionResourceRequest postDeviceCredentialsCollectionResourceRequest = (PostDeviceCredentialsCollectionResourceRequest) o;
    return Objects.equals(this.id, postDeviceCredentialsCollectionResourceRequest.id) &&
        Objects.equals(this.password, postDeviceCredentialsCollectionResourceRequest.password) &&
        Objects.equals(this.self, postDeviceCredentialsCollectionResourceRequest.self) &&
        Objects.equals(this.tenantId, postDeviceCredentialsCollectionResourceRequest.tenantId) &&
        Objects.equals(this.username, postDeviceCredentialsCollectionResourceRequest.username) &&
        Objects.equals(this.securityToken, postDeviceCredentialsCollectionResourceRequest.securityToken) &&
        Objects.equals(this.additionalProperties, postDeviceCredentialsCollectionResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, self, tenantId, username, securityToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDeviceCredentialsCollectionResourceRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
