package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The address of the endpoint which is used to retrieve the public key used to
 * verify the JWT access token signature.
 */

@JsonTypeName("authConfig_signatureVerificationConfig_jwks")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfigJwks {

  private URI jwksUrl;

  public AuthConfigSignatureVerificationConfigJwks jwksUrl(URI jwksUrl) {
    this.jwksUrl = jwksUrl;
    return this;
  }

  /**
   * The URI to the public key resource.
   * 
   * @return jwksUrl
   */

  @JsonProperty("jwksUrl")
  public URI getJwksUrl() {
    return jwksUrl;
  }

  public void setJwksUrl(URI jwksUrl) {
    this.jwksUrl = jwksUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfigJwks authConfigSignatureVerificationConfigJwks = (AuthConfigSignatureVerificationConfigJwks) o;
    return Objects.equals(this.jwksUrl, authConfigSignatureVerificationConfigJwks.jwksUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwksUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfigJwks {\n");
    sb.append("    jwksUrl: ").append(toIndentedString(jwksUrl)).append("\n");
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
