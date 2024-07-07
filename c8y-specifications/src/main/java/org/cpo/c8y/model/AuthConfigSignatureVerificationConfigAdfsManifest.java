package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ADFS manifest signature verification configuration.
 */

@JsonTypeName("authConfig_signatureVerificationConfig_adfsManifest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfigAdfsManifest {

  private URI manifestUrl;

  public AuthConfigSignatureVerificationConfigAdfsManifest manifestUrl(URI manifestUrl) {
    this.manifestUrl = manifestUrl;
    return this;
  }

  /**
   * The URI to the manifest resource.
   * 
   * @return manifestUrl
   */

  @JsonProperty("manifestUrl")
  public URI getManifestUrl() {
    return manifestUrl;
  }

  public void setManifestUrl(URI manifestUrl) {
    this.manifestUrl = manifestUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfigAdfsManifest authConfigSignatureVerificationConfigAdfsManifest = (AuthConfigSignatureVerificationConfigAdfsManifest) o;
    return Objects.equals(this.manifestUrl, authConfigSignatureVerificationConfigAdfsManifest.manifestUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfigAdfsManifest {\n");
    sb.append("    manifestUrl: ").append(toIndentedString(manifestUrl)).append("\n");
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
