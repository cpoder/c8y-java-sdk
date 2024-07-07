package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Points to the claim of the access token from the authorization server that
 * must be used as the username in the Cumulocity IoT platform.
 */

@JsonTypeName("authConfig_externalTokenConfig_userOrAppIdConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigExternalTokenConfigUserOrAppIdConfig {

  private String constantValue;

  private String jwtField;

  private Boolean useConstantValue;

  public AuthConfigExternalTokenConfigUserOrAppIdConfig constantValue(String constantValue) {
    this.constantValue = constantValue;
    return this;
  }

  /**
   * Used only if `useConstantValue` is set to `true`.
   * 
   * @return constantValue
   */

  @JsonProperty("constantValue")
  public String getConstantValue() {
    return constantValue;
  }

  public void setConstantValue(String constantValue) {
    this.constantValue = constantValue;
  }

  public AuthConfigExternalTokenConfigUserOrAppIdConfig jwtField(String jwtField) {
    this.jwtField = jwtField;
    return this;
  }

  /**
   * The name of the field containing the JWT.
   * 
   * @return jwtField
   */

  @JsonProperty("jwtField")
  public String getJwtField() {
    return jwtField;
  }

  public void setJwtField(String jwtField) {
    this.jwtField = jwtField;
  }

  public AuthConfigExternalTokenConfigUserOrAppIdConfig useConstantValue(Boolean useConstantValue) {
    this.useConstantValue = useConstantValue;
    return this;
  }

  /**
   * Not recommended. If set to `true`, all users share a single account in the
   * Cumulocity IoT platform.
   * 
   * @return useConstantValue
   */

  @JsonProperty("useConstantValue")
  public Boolean getUseConstantValue() {
    return useConstantValue;
  }

  public void setUseConstantValue(Boolean useConstantValue) {
    this.useConstantValue = useConstantValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigExternalTokenConfigUserOrAppIdConfig authConfigExternalTokenConfigUserOrAppIdConfig = (AuthConfigExternalTokenConfigUserOrAppIdConfig) o;
    return Objects.equals(this.constantValue, authConfigExternalTokenConfigUserOrAppIdConfig.constantValue) &&
        Objects.equals(this.jwtField, authConfigExternalTokenConfigUserOrAppIdConfig.jwtField) &&
        Objects.equals(this.useConstantValue, authConfigExternalTokenConfigUserOrAppIdConfig.useConstantValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constantValue, jwtField, useConstantValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigExternalTokenConfigUserOrAppIdConfig {\n");
    sb.append("    constantValue: ").append(toIndentedString(constantValue)).append("\n");
    sb.append("    jwtField: ").append(toIndentedString(jwtField)).append("\n");
    sb.append("    useConstantValue: ").append(toIndentedString(useConstantValue)).append("\n");
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
