package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * SSO specific and authorization server dependent. Describes the method of
 * access token signature verification on the Cumulocity IoT platform.
 */

@JsonTypeName("authConfig_signatureVerificationConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfig {

  private AuthConfigSignatureVerificationConfigAad aad;

  private AuthConfigSignatureVerificationConfigAdfsManifest adfsManifest;

  private AuthConfigSignatureVerificationConfigJwks jwks;

  private AuthConfigSignatureVerificationConfigManual manual;

  public AuthConfigSignatureVerificationConfig aad(AuthConfigSignatureVerificationConfigAad aad) {
    this.aad = aad;
    return this;
  }

  /**
   * Get aad
   * 
   * @return aad
   */

  @JsonProperty("aad")
  public AuthConfigSignatureVerificationConfigAad getAad() {
    return aad;
  }

  public void setAad(AuthConfigSignatureVerificationConfigAad aad) {
    this.aad = aad;
  }

  public AuthConfigSignatureVerificationConfig adfsManifest(
      AuthConfigSignatureVerificationConfigAdfsManifest adfsManifest) {
    this.adfsManifest = adfsManifest;
    return this;
  }

  /**
   * Get adfsManifest
   * 
   * @return adfsManifest
   */

  @JsonProperty("adfsManifest")
  public AuthConfigSignatureVerificationConfigAdfsManifest getAdfsManifest() {
    return adfsManifest;
  }

  public void setAdfsManifest(AuthConfigSignatureVerificationConfigAdfsManifest adfsManifest) {
    this.adfsManifest = adfsManifest;
  }

  public AuthConfigSignatureVerificationConfig jwks(AuthConfigSignatureVerificationConfigJwks jwks) {
    this.jwks = jwks;
    return this;
  }

  /**
   * Get jwks
   * 
   * @return jwks
   */

  @JsonProperty("jwks")
  public AuthConfigSignatureVerificationConfigJwks getJwks() {
    return jwks;
  }

  public void setJwks(AuthConfigSignatureVerificationConfigJwks jwks) {
    this.jwks = jwks;
  }

  public AuthConfigSignatureVerificationConfig manual(AuthConfigSignatureVerificationConfigManual manual) {
    this.manual = manual;
    return this;
  }

  /**
   * Get manual
   * 
   * @return manual
   */

  @JsonProperty("manual")
  public AuthConfigSignatureVerificationConfigManual getManual() {
    return manual;
  }

  public void setManual(AuthConfigSignatureVerificationConfigManual manual) {
    this.manual = manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfig authConfigSignatureVerificationConfig = (AuthConfigSignatureVerificationConfig) o;
    return Objects.equals(this.aad, authConfigSignatureVerificationConfig.aad) &&
        Objects.equals(this.adfsManifest, authConfigSignatureVerificationConfig.adfsManifest) &&
        Objects.equals(this.jwks, authConfigSignatureVerificationConfig.jwks) &&
        Objects.equals(this.manual, authConfigSignatureVerificationConfig.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aad, adfsManifest, jwks, manual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfig {\n");
    sb.append("    aad: ").append(toIndentedString(aad)).append("\n");
    sb.append("    adfsManifest: ").append(toIndentedString(adfsManifest)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
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
