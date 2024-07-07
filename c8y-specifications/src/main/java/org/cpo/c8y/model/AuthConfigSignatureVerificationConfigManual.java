package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Describes the process of verification of JWT access token with the public
 * keys embedded in the provided X.509 certificates.
 */

@JsonTypeName("authConfig_signatureVerificationConfig_manual")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfigManual {

  private String certIdField;

  private Boolean certIdFromField;

  private AuthConfigSignatureVerificationConfigManualCertificates certificates;

  public AuthConfigSignatureVerificationConfigManual certIdField(String certIdField) {
    this.certIdField = certIdField;
    return this;
  }

  /**
   * The name of the field in the JWT access token containing the certificate
   * identifier.
   * 
   * @return certIdField
   */

  @JsonProperty("certIdField")
  public String getCertIdField() {
    return certIdField;
  }

  public void setCertIdField(String certIdField) {
    this.certIdField = certIdField;
  }

  public AuthConfigSignatureVerificationConfigManual certIdFromField(Boolean certIdFromField) {
    this.certIdFromField = certIdFromField;
    return this;
  }

  /**
   * Indicates whether the certificate identifier should be read from the JWT
   * access token.
   * 
   * @return certIdFromField
   */

  @JsonProperty("certIdFromField")
  public Boolean getCertIdFromField() {
    return certIdFromField;
  }

  public void setCertIdFromField(Boolean certIdFromField) {
    this.certIdFromField = certIdFromField;
  }

  public AuthConfigSignatureVerificationConfigManual certificates(
      AuthConfigSignatureVerificationConfigManualCertificates certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Get certificates
   * 
   * @return certificates
   */

  @JsonProperty("certificates")
  public AuthConfigSignatureVerificationConfigManualCertificates getCertificates() {
    return certificates;
  }

  public void setCertificates(AuthConfigSignatureVerificationConfigManualCertificates certificates) {
    this.certificates = certificates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfigManual authConfigSignatureVerificationConfigManual = (AuthConfigSignatureVerificationConfigManual) o;
    return Objects.equals(this.certIdField, authConfigSignatureVerificationConfigManual.certIdField) &&
        Objects.equals(this.certIdFromField, authConfigSignatureVerificationConfigManual.certIdFromField) &&
        Objects.equals(this.certificates, authConfigSignatureVerificationConfigManual.certificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certIdField, certIdFromField, certificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfigManual {\n");
    sb.append("    certIdField: ").append(toIndentedString(certIdField)).append("\n");
    sb.append("    certIdFromField: ").append(toIndentedString(certIdFromField)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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
