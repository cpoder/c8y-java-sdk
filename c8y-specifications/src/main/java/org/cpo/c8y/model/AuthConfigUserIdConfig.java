package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * SSO specific. Points to the field in the obtained JWT access token that
 * should be used as the username in the Cumulocity IoT platform.
 */

@JsonTypeName("authConfig_userIdConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigUserIdConfig {

  private String constantValue;

  private String jwtField;

  private Boolean useConstantValue;

  public AuthConfigUserIdConfig constantValue(String constantValue) {
    this.constantValue = constantValue;
    return this;
  }

  /**
   * Used only when `useConstantValue` is set to `true`.
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

  public AuthConfigUserIdConfig jwtField(String jwtField) {
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

  public AuthConfigUserIdConfig useConstantValue(Boolean useConstantValue) {
    this.useConstantValue = useConstantValue;
    return this;
  }

  /**
   * Not recommended. If set to `true`, all SSO users will share one account in
   * the Cumulocity IoT platform.
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
    AuthConfigUserIdConfig authConfigUserIdConfig = (AuthConfigUserIdConfig) o;
    return Objects.equals(this.constantValue, authConfigUserIdConfig.constantValue) &&
        Objects.equals(this.jwtField, authConfigUserIdConfig.jwtField) &&
        Objects.equals(this.useConstantValue, authConfigUserIdConfig.useConstantValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constantValue, jwtField, useConstantValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigUserIdConfig {\n");
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
