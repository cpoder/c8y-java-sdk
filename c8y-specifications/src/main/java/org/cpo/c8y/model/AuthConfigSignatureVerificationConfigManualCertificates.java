package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Details of the certificates.
 */

@JsonTypeName("authConfig_signatureVerificationConfig_manual_certificates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigSignatureVerificationConfigManualCertificates {

  /**
   * The signing algorithm of the JWT access token.
   */
  public enum AlgEnum {
    RSA("RSA"),

    PCKS("PCKS");

    private String value;

    AlgEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AlgEnum fromValue(String value) {
      for (AlgEnum b : AlgEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AlgEnum alg;

  private String publicKey;

  private OffsetDateTime validFrom;

  private OffsetDateTime validTill;

  public AuthConfigSignatureVerificationConfigManualCertificates alg(AlgEnum alg) {
    this.alg = alg;
    return this;
  }

  /**
   * The signing algorithm of the JWT access token.
   * 
   * @return alg
   */

  @JsonProperty("alg")
  public AlgEnum getAlg() {
    return alg;
  }

  public void setAlg(AlgEnum alg) {
    this.alg = alg;
  }

  public AuthConfigSignatureVerificationConfigManualCertificates publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * The public key certificate.
   * 
   * @return publicKey
   */

  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public AuthConfigSignatureVerificationConfigManualCertificates validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The validity start date of the certificate.
   * 
   * @return validFrom
   */

  @JsonProperty("validFrom")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public AuthConfigSignatureVerificationConfigManualCertificates validTill(OffsetDateTime validTill) {
    this.validTill = validTill;
    return this;
  }

  /**
   * The expiry date of the certificate.
   * 
   * @return validTill
   */

  @JsonProperty("validTill")
  public OffsetDateTime getValidTill() {
    return validTill;
  }

  public void setValidTill(OffsetDateTime validTill) {
    this.validTill = validTill;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigSignatureVerificationConfigManualCertificates authConfigSignatureVerificationConfigManualCertificates = (AuthConfigSignatureVerificationConfigManualCertificates) o;
    return Objects.equals(this.alg, authConfigSignatureVerificationConfigManualCertificates.alg) &&
        Objects.equals(this.publicKey, authConfigSignatureVerificationConfigManualCertificates.publicKey) &&
        Objects.equals(this.validFrom, authConfigSignatureVerificationConfigManualCertificates.validFrom) &&
        Objects.equals(this.validTill, authConfigSignatureVerificationConfigManualCertificates.validTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, publicKey, validFrom, validTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigSignatureVerificationConfigManualCertificates {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
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
