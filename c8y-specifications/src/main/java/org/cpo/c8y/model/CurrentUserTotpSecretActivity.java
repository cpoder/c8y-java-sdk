package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * CurrentUserTotpSecretActivity
 */

@JsonTypeName("currentUserTotpSecretActivity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentUserTotpSecretActivity {

  private Boolean isActive;

  public CurrentUserTotpSecretActivity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CurrentUserTotpSecretActivity(Boolean isActive) {
    this.isActive = isActive;
  }

  public CurrentUserTotpSecretActivity isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the two-factor authentication secret is active.
   * 
   * @return isActive
   */
  @NotNull

  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserTotpSecretActivity currentUserTotpSecretActivity = (CurrentUserTotpSecretActivity) o;
    return Objects.equals(this.isActive, currentUserTotpSecretActivity.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserTotpSecretActivity {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
