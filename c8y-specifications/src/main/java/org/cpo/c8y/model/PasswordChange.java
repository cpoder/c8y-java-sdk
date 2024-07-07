package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PasswordChange
 */

@JsonTypeName("passwordChange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PasswordChange {

  private String currentUserPassword;

  private String newPassword;

  public PasswordChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PasswordChange(String currentUserPassword, String newPassword) {
    this.currentUserPassword = currentUserPassword;
    this.newPassword = newPassword;
  }

  public PasswordChange currentUserPassword(String currentUserPassword) {
    this.currentUserPassword = currentUserPassword;
    return this;
  }

  /**
   * The current password of the user performing the request.
   * 
   * @return currentUserPassword
   */
  @NotNull

  @JsonProperty("currentUserPassword")
  public String getCurrentUserPassword() {
    return currentUserPassword;
  }

  public void setCurrentUserPassword(String currentUserPassword) {
    this.currentUserPassword = currentUserPassword;
  }

  public PasswordChange newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The new password to be set for the user performing the request.
   * 
   * @return newPassword
   */
  @NotNull

  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChange passwordChange = (PasswordChange) o;
    return Objects.equals(this.currentUserPassword, passwordChange.currentUserPassword) &&
        Objects.equals(this.newPassword, passwordChange.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUserPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChange {\n");
    sb.append("    currentUserPassword: ").append("*").append("\n");
    sb.append("    newPassword: ").append("*").append("\n");
    sb.append("}");
    return sb.toString();
  }
}
