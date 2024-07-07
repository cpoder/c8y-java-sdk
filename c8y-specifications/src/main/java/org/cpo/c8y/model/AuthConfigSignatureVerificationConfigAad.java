package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * AAD signature verification configuration.
 */

@JsonTypeName("authConfig_signatureVerificationConfig_aad")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfigAad {

  private URI publicKeyDiscoveryUrl;

  public AuthConfigSignatureVerificationConfigAad publicKeyDiscoveryUrl(URI publicKeyDiscoveryUrl) {
    this.publicKeyDiscoveryUrl = publicKeyDiscoveryUrl;
    return this;
  }

  /**
   * URL used to retrieve the public key used for signature verification.
   * 
   * @return publicKeyDiscoveryUrl
   */

  @JsonProperty("publicKeyDiscoveryUrl")
  public URI getPublicKeyDiscoveryUrl() {
    return publicKeyDiscoveryUrl;
  }

  public void setPublicKeyDiscoveryUrl(URI publicKeyDiscoveryUrl) {
    this.publicKeyDiscoveryUrl = publicKeyDiscoveryUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfigAad authConfigSignatureVerificationConfigAad = (AuthConfigSignatureVerificationConfigAad) o;
    return Objects.equals(this.publicKeyDiscoveryUrl, authConfigSignatureVerificationConfigAad.publicKeyDiscoveryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKeyDiscoveryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfigAad {\n");
    sb.append("    publicKeyDiscoveryUrl: ").append(toIndentedString(publicKeyDiscoveryUrl)).append("\n");
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
