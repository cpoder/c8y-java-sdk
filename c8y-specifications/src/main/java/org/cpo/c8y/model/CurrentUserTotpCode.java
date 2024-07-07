package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * CurrentUserTotpCode
 */

@JsonTypeName("currentUserTotpCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentUserTotpCode {

  private String code;

  public CurrentUserTotpCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CurrentUserTotpCode(String code) {
    this.code = code;
  }

  public CurrentUserTotpCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Two-factor authentication code entered by the user to log in to the platform.
   * 
   * @return code
   */
  @NotNull

  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserTotpCode currentUserTotpCode = (CurrentUserTotpCode) o;
    return Objects.equals(this.code, currentUserTotpCode.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserTotpCode {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
