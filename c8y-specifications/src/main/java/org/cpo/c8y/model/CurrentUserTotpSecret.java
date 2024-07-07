package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * CurrentUserTotpSecret
 */

@JsonTypeName("currentUserTotpSecret")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentUserTotpSecret {

  private String rawSecret;

  private URI secretQrUrl;

  public CurrentUserTotpSecret rawSecret(String rawSecret) {
    this.rawSecret = rawSecret;
    return this;
  }

  /**
   * Secret used by two-factor authentication applications to generate the TFA
   * codes.
   * 
   * @return rawSecret
   */

  @JsonProperty("rawSecret")
  public String getRawSecret() {
    return rawSecret;
  }

  public void setRawSecret(String rawSecret) {
    this.rawSecret = rawSecret;
  }

  public CurrentUserTotpSecret secretQrUrl(URI secretQrUrl) {
    this.secretQrUrl = secretQrUrl;
    return this;
  }

  /**
   * URL used to set the two-factor authentication secret for the TFA application.
   * 
   * @return secretQrUrl
   */

  @JsonProperty("secretQrUrl")
  public URI getSecretQrUrl() {
    return secretQrUrl;
  }

  public void setSecretQrUrl(URI secretQrUrl) {
    this.secretQrUrl = secretQrUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserTotpSecret currentUserTotpSecret = (CurrentUserTotpSecret) o;
    return Objects.equals(this.rawSecret, currentUserTotpSecret.rawSecret) &&
        Objects.equals(this.secretQrUrl, currentUserTotpSecret.secretQrUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawSecret, secretQrUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserTotpSecret {\n");
    sb.append("    rawSecret: ").append(toIndentedString(rawSecret)).append("\n");
    sb.append("    secretQrUrl: ").append(toIndentedString(secretQrUrl)).append("\n");
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
