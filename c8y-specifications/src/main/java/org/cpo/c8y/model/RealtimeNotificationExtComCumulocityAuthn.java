package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * RealtimeNotificationExtComCumulocityAuthn
 */

@JsonTypeName("realtimeNotification_ext_com_cumulocity_authn")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RealtimeNotificationExtComCumulocityAuthn {

  private String token;

  private String tfa;

  private String xsrfToken;

  public RealtimeNotificationExtComCumulocityAuthn token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Base64 encoded credentials.
   * 
   * @return token
   */

  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public RealtimeNotificationExtComCumulocityAuthn tfa(String tfa) {
    this.tfa = tfa;
    return this;
  }

  /**
   * Optional two factor authentication token.
   * 
   * @return tfa
   */

  @JsonProperty("tfa")
  public String getTfa() {
    return tfa;
  }

  public void setTfa(String tfa) {
    this.tfa = tfa;
  }

  public RealtimeNotificationExtComCumulocityAuthn xsrfToken(String xsrfToken) {
    this.xsrfToken = xsrfToken;
    return this;
  }

  /**
   * Required for OAuth authentication.
   * 
   * @return xsrfToken
   */

  @JsonProperty("xsrfToken")
  public String getXsrfToken() {
    return xsrfToken;
  }

  public void setXsrfToken(String xsrfToken) {
    this.xsrfToken = xsrfToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeNotificationExtComCumulocityAuthn realtimeNotificationExtComCumulocityAuthn = (RealtimeNotificationExtComCumulocityAuthn) o;
    return Objects.equals(this.token, realtimeNotificationExtComCumulocityAuthn.token) &&
        Objects.equals(this.tfa, realtimeNotificationExtComCumulocityAuthn.tfa) &&
        Objects.equals(this.xsrfToken, realtimeNotificationExtComCumulocityAuthn.xsrfToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tfa, xsrfToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeNotificationExtComCumulocityAuthn {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tfa: ").append(toIndentedString(tfa)).append("\n");
    sb.append("    xsrfToken: ").append(toIndentedString(xsrfToken)).append("\n");
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
