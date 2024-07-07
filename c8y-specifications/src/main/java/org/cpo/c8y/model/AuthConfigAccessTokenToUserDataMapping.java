package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * SSO specific. Describes the fields in the access token from the external
 * server containing user information.
 */

@JsonTypeName("authConfig_accessTokenToUserDataMapping")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigAccessTokenToUserDataMapping {

  private String emailClaimName;

  private String firstNameClaimName;

  private String lastNameClaimName;

  private String phoneNumberClaimName;

  public AuthConfigAccessTokenToUserDataMapping emailClaimName(String emailClaimName) {
    this.emailClaimName = emailClaimName;
    return this;
  }

  /**
   * The name of the field containing the user's email.
   * 
   * @return emailClaimName
   */

  @JsonProperty("emailClaimName")
  public String getEmailClaimName() {
    return emailClaimName;
  }

  public void setEmailClaimName(String emailClaimName) {
    this.emailClaimName = emailClaimName;
  }

  public AuthConfigAccessTokenToUserDataMapping firstNameClaimName(String firstNameClaimName) {
    this.firstNameClaimName = firstNameClaimName;
    return this;
  }

  /**
   * The name of the field containing the user's first name.
   * 
   * @return firstNameClaimName
   */

  @JsonProperty("firstNameClaimName")
  public String getFirstNameClaimName() {
    return firstNameClaimName;
  }

  public void setFirstNameClaimName(String firstNameClaimName) {
    this.firstNameClaimName = firstNameClaimName;
  }

  public AuthConfigAccessTokenToUserDataMapping lastNameClaimName(String lastNameClaimName) {
    this.lastNameClaimName = lastNameClaimName;
    return this;
  }

  /**
   * The name of the field containing the user's last name.
   * 
   * @return lastNameClaimName
   */

  @JsonProperty("lastNameClaimName")
  public String getLastNameClaimName() {
    return lastNameClaimName;
  }

  public void setLastNameClaimName(String lastNameClaimName) {
    this.lastNameClaimName = lastNameClaimName;
  }

  public AuthConfigAccessTokenToUserDataMapping phoneNumberClaimName(String phoneNumberClaimName) {
    this.phoneNumberClaimName = phoneNumberClaimName;
    return this;
  }

  /**
   * The name of the field containing the user's phone number.
   * 
   * @return phoneNumberClaimName
   */

  @JsonProperty("phoneNumberClaimName")
  public String getPhoneNumberClaimName() {
    return phoneNumberClaimName;
  }

  public void setPhoneNumberClaimName(String phoneNumberClaimName) {
    this.phoneNumberClaimName = phoneNumberClaimName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigAccessTokenToUserDataMapping authConfigAccessTokenToUserDataMapping = (AuthConfigAccessTokenToUserDataMapping) o;
    return Objects.equals(this.emailClaimName, authConfigAccessTokenToUserDataMapping.emailClaimName) &&
        Objects.equals(this.firstNameClaimName, authConfigAccessTokenToUserDataMapping.firstNameClaimName) &&
        Objects.equals(this.lastNameClaimName, authConfigAccessTokenToUserDataMapping.lastNameClaimName) &&
        Objects.equals(this.phoneNumberClaimName, authConfigAccessTokenToUserDataMapping.phoneNumberClaimName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailClaimName, firstNameClaimName, lastNameClaimName, phoneNumberClaimName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigAccessTokenToUserDataMapping {\n");
    sb.append("    emailClaimName: ").append(toIndentedString(emailClaimName)).append("\n");
    sb.append("    firstNameClaimName: ").append(toIndentedString(firstNameClaimName)).append("\n");
    sb.append("    lastNameClaimName: ").append(toIndentedString(lastNameClaimName)).append("\n");
    sb.append("    phoneNumberClaimName: ").append(toIndentedString(phoneNumberClaimName)).append("\n");
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
