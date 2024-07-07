package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * A configuration for authentication with an access token from the
 * authorization server.
 */

@JsonTypeName("authConfig_externalTokenConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigExternalTokenConfig {

  private Boolean enabled;

  private AuthConfigExternalTokenConfigUserOrAppIdConfig userOrAppIdConfig;

  private Boolean validationRequired;

  /**
   * The method of validation of the access token.
   */
  public enum ValidationMethodEnum {
    INTROSPECTION("INTROSPECTION"),

    USERINFO("USERINFO");

    private String value;

    ValidationMethodEnum(String value) {
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
    public static ValidationMethodEnum fromValue(String value) {
      for (ValidationMethodEnum b : ValidationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValidationMethodEnum validationMethod;

  private RequestRepresentation tokenValidationRequest;

  private Integer accessTokenValidityCheckIntervalInMinutes;

  public AuthConfigExternalTokenConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether authentication is enabled or disabled.
   * 
   * @return enabled
   */

  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AuthConfigExternalTokenConfig userOrAppIdConfig(
      AuthConfigExternalTokenConfigUserOrAppIdConfig userOrAppIdConfig) {
    this.userOrAppIdConfig = userOrAppIdConfig;
    return this;
  }

  /**
   * Get userOrAppIdConfig
   * 
   * @return userOrAppIdConfig
   */

  @JsonProperty("userOrAppIdConfig")
  public AuthConfigExternalTokenConfigUserOrAppIdConfig getUserOrAppIdConfig() {
    return userOrAppIdConfig;
  }

  public void setUserOrAppIdConfig(AuthConfigExternalTokenConfigUserOrAppIdConfig userOrAppIdConfig) {
    this.userOrAppIdConfig = userOrAppIdConfig;
  }

  public AuthConfigExternalTokenConfig validationRequired(Boolean validationRequired) {
    this.validationRequired = validationRequired;
    return this;
  }

  /**
   * If set to `true`, the access token is validated against the authorization
   * server by way of introspection or user info request.
   * 
   * @return validationRequired
   */

  @JsonProperty("validationRequired")
  public Boolean getValidationRequired() {
    return validationRequired;
  }

  public void setValidationRequired(Boolean validationRequired) {
    this.validationRequired = validationRequired;
  }

  public AuthConfigExternalTokenConfig validationMethod(ValidationMethodEnum validationMethod) {
    this.validationMethod = validationMethod;
    return this;
  }

  /**
   * The method of validation of the access token.
   * 
   * @return validationMethod
   */

  @JsonProperty("validationMethod")
  public ValidationMethodEnum getValidationMethod() {
    return validationMethod;
  }

  public void setValidationMethod(ValidationMethodEnum validationMethod) {
    this.validationMethod = validationMethod;
  }

  public AuthConfigExternalTokenConfig tokenValidationRequest(RequestRepresentation tokenValidationRequest) {
    this.tokenValidationRequest = tokenValidationRequest;
    return this;
  }

  /**
   * Get tokenValidationRequest
   * 
   * @return tokenValidationRequest
   */

  @JsonProperty("tokenValidationRequest")
  public RequestRepresentation getTokenValidationRequest() {
    return tokenValidationRequest;
  }

  public void setTokenValidationRequest(RequestRepresentation tokenValidationRequest) {
    this.tokenValidationRequest = tokenValidationRequest;
  }

  public AuthConfigExternalTokenConfig accessTokenValidityCheckIntervalInMinutes(
      Integer accessTokenValidityCheckIntervalInMinutes) {
    this.accessTokenValidityCheckIntervalInMinutes = accessTokenValidityCheckIntervalInMinutes;
    return this;
  }

  /**
   * The frequency (in Minutes) in which Cumulocity sends a validation request to
   * authorization server. The recommended frequency is 1 minute.
   * 
   * @return accessTokenValidityCheckIntervalInMinutes
   */

  @JsonProperty("accessTokenValidityCheckIntervalInMinutes")
  public Integer getAccessTokenValidityCheckIntervalInMinutes() {
    return accessTokenValidityCheckIntervalInMinutes;
  }

  public void setAccessTokenValidityCheckIntervalInMinutes(Integer accessTokenValidityCheckIntervalInMinutes) {
    this.accessTokenValidityCheckIntervalInMinutes = accessTokenValidityCheckIntervalInMinutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigExternalTokenConfig authConfigExternalTokenConfig = (AuthConfigExternalTokenConfig) o;
    return Objects.equals(this.enabled, authConfigExternalTokenConfig.enabled) &&
        Objects.equals(this.userOrAppIdConfig, authConfigExternalTokenConfig.userOrAppIdConfig) &&
        Objects.equals(this.validationRequired, authConfigExternalTokenConfig.validationRequired) &&
        Objects.equals(this.validationMethod, authConfigExternalTokenConfig.validationMethod) &&
        Objects.equals(this.tokenValidationRequest, authConfigExternalTokenConfig.tokenValidationRequest) &&
        Objects.equals(this.accessTokenValidityCheckIntervalInMinutes,
            authConfigExternalTokenConfig.accessTokenValidityCheckIntervalInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, userOrAppIdConfig, validationRequired, validationMethod, tokenValidationRequest,
        accessTokenValidityCheckIntervalInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigExternalTokenConfig {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userOrAppIdConfig: ").append(toIndentedString(userOrAppIdConfig)).append("\n");
    sb.append("    validationRequired: ").append(toIndentedString(validationRequired)).append("\n");
    sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
    sb.append("    tokenValidationRequest: ").append(toIndentedString(tokenValidationRequest)).append("\n");
    sb.append("    accessTokenValidityCheckIntervalInMinutes: ")
        .append(toIndentedString(accessTokenValidityCheckIntervalInMinutes)).append("\n");
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
