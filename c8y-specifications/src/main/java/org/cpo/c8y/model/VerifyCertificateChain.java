package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * VerifyCertificateChain
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class VerifyCertificateChain {

  private Boolean successfullyValidated;

  private String tenantId;

  private String issuer;

  private String subject;

  public VerifyCertificateChain successfullyValidated(Boolean successfullyValidated) {
    this.successfullyValidated = successfullyValidated;
    return this;
  }

  /**
   * The result of validating the certificate chain.
   * 
   * @return successfullyValidated
   */

  @JsonProperty("successfullyValidated")
  public Boolean getSuccessfullyValidated() {
    return successfullyValidated;
  }

  public void setSuccessfullyValidated(Boolean successfullyValidated) {
    this.successfullyValidated = successfullyValidated;
  }

  public VerifyCertificateChain tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID used for validation.
   * 
   * @return tenantId
   */

  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public VerifyCertificateChain issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The name of the organization which signed the certificate.
   * 
   * @return issuer
   */

  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public VerifyCertificateChain subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The name of the organization to which the certificate belongs.
   * 
   * @return subject
   */

  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCertificateChain verifyCertificateChain = (VerifyCertificateChain) o;
    return Objects.equals(this.successfullyValidated, verifyCertificateChain.successfullyValidated) &&
        Objects.equals(this.tenantId, verifyCertificateChain.tenantId) &&
        Objects.equals(this.issuer, verifyCertificateChain.issuer) &&
        Objects.equals(this.subject, verifyCertificateChain.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfullyValidated, tenantId, issuer, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCertificateChain {\n");
    sb.append("    successfullyValidated: ").append(toIndentedString(successfullyValidated)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
