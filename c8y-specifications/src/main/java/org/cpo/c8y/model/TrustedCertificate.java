package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * TrustedCertificate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TrustedCertificate {

  private String algorithmName;

  private Boolean autoRegistrationEnabled = false;

  private String certInPemFormat;

  private String fingerprint;

  private String issuer;

  private String name;

  private OffsetDateTime notAfter;

  private OffsetDateTime notBefore;

  private Boolean proofOfPossessionValid;

  private String proofOfPossessionUnsignedVerificationCode;

  private OffsetDateTime proofOfPossessionVerificationCodeUsableUntil;

  private URI self;

  private String serialNumber;

  /**
   * Indicates if the certificate is active and can be used by the device to
   * establish a connection to the Cumulocity IoT platform.
   */
  public enum StatusEnum {
    ENABLED("ENABLED"),

    DISABLED("DISABLED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String subject;

  private Integer version;

  public TrustedCertificate algorithmName(String algorithmName) {
    this.algorithmName = algorithmName;
    return this;
  }

  /**
   * Algorithm used to decode/encode the certificate.
   * 
   * @return algorithmName
   */

  @JsonProperty("algorithmName")
  public String getAlgorithmName() {
    return algorithmName;
  }

  public void setAlgorithmName(String algorithmName) {
    this.algorithmName = algorithmName;
  }

  public TrustedCertificate autoRegistrationEnabled(Boolean autoRegistrationEnabled) {
    this.autoRegistrationEnabled = autoRegistrationEnabled;
    return this;
  }

  /**
   * Indicates whether the automatic device registration is enabled or not.
   * 
   * @return autoRegistrationEnabled
   */

  @JsonProperty("autoRegistrationEnabled")
  public Boolean getAutoRegistrationEnabled() {
    return autoRegistrationEnabled;
  }

  public void setAutoRegistrationEnabled(Boolean autoRegistrationEnabled) {
    this.autoRegistrationEnabled = autoRegistrationEnabled;
  }

  public TrustedCertificate certInPemFormat(String certInPemFormat) {
    this.certInPemFormat = certInPemFormat;
    return this;
  }

  /**
   * Trusted certificate in PEM format.
   * 
   * @return certInPemFormat
   */

  @JsonProperty("certInPemFormat")
  public String getCertInPemFormat() {
    return certInPemFormat;
  }

  public void setCertInPemFormat(String certInPemFormat) {
    this.certInPemFormat = certInPemFormat;
  }

  public TrustedCertificate fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Unique identifier of the trusted certificate.
   * 
   * @return fingerprint
   */

  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public TrustedCertificate issuer(String issuer) {
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

  public TrustedCertificate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the certificate.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrustedCertificate notAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * The end date and time of the certificate's validity.
   * 
   * @return notAfter
   */

  @JsonProperty("notAfter")
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }

  public TrustedCertificate notBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * The start date and time of the certificate's validity.
   * 
   * @return notBefore
   */

  @JsonProperty("notBefore")
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }

  public TrustedCertificate proofOfPossessionValid(Boolean proofOfPossessionValid) {
    this.proofOfPossessionValid = proofOfPossessionValid;
    return this;
  }

  /**
   * Indicates whether the proof of possession for the certificate was provided.
   * 
   * @return proofOfPossessionValid
   */

  @JsonProperty("proofOfPossessionValid")
  public Boolean getProofOfPossessionValid() {
    return proofOfPossessionValid;
  }

  public void setProofOfPossessionValid(Boolean proofOfPossessionValid) {
    this.proofOfPossessionValid = proofOfPossessionValid;
  }

  public TrustedCertificate proofOfPossessionUnsignedVerificationCode(
      String proofOfPossessionUnsignedVerificationCode) {
    this.proofOfPossessionUnsignedVerificationCode = proofOfPossessionUnsignedVerificationCode;
    return this;
  }

  /**
   * An unsigned verification code that provides proof of possession for the
   * certificate after signing.
   * 
   * @return proofOfPossessionUnsignedVerificationCode
   */

  @JsonProperty("proofOfPossessionUnsignedVerificationCode")
  public String getProofOfPossessionUnsignedVerificationCode() {
    return proofOfPossessionUnsignedVerificationCode;
  }

  public void setProofOfPossessionUnsignedVerificationCode(String proofOfPossessionUnsignedVerificationCode) {
    this.proofOfPossessionUnsignedVerificationCode = proofOfPossessionUnsignedVerificationCode;
  }

  public TrustedCertificate proofOfPossessionVerificationCodeUsableUntil(
      OffsetDateTime proofOfPossessionVerificationCodeUsableUntil) {
    this.proofOfPossessionVerificationCodeUsableUntil = proofOfPossessionVerificationCodeUsableUntil;
    return this;
  }

  /**
   * Validity of the verification code.
   * 
   * @return proofOfPossessionVerificationCodeUsableUntil
   */

  @JsonProperty("proofOfPossessionVerificationCodeUsableUntil")
  public OffsetDateTime getProofOfPossessionVerificationCodeUsableUntil() {
    return proofOfPossessionVerificationCodeUsableUntil;
  }

  public void setProofOfPossessionVerificationCodeUsableUntil(
      OffsetDateTime proofOfPossessionVerificationCodeUsableUntil) {
    this.proofOfPossessionVerificationCodeUsableUntil = proofOfPossessionVerificationCodeUsableUntil;
  }

  public TrustedCertificate self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
   * 
   * @return self
   */

  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public TrustedCertificate serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The certificate's serial number.
   * 
   * @return serialNumber
   */

  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public TrustedCertificate status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates if the certificate is active and can be used by the device to
   * establish a connection to the Cumulocity IoT platform.
   * 
   * @return status
   */

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TrustedCertificate subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Name of the organization to which the certificate belongs.
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

  public TrustedCertificate version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the X.509 certificate standard.
   * 
   * @return version
   */

  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedCertificate trustedCertificate = (TrustedCertificate) o;
    return Objects.equals(this.algorithmName, trustedCertificate.algorithmName) &&
        Objects.equals(this.autoRegistrationEnabled, trustedCertificate.autoRegistrationEnabled) &&
        Objects.equals(this.certInPemFormat, trustedCertificate.certInPemFormat) &&
        Objects.equals(this.fingerprint, trustedCertificate.fingerprint) &&
        Objects.equals(this.issuer, trustedCertificate.issuer) &&
        Objects.equals(this.name, trustedCertificate.name) &&
        Objects.equals(this.notAfter, trustedCertificate.notAfter) &&
        Objects.equals(this.notBefore, trustedCertificate.notBefore) &&
        Objects.equals(this.proofOfPossessionValid, trustedCertificate.proofOfPossessionValid) &&
        Objects.equals(this.proofOfPossessionUnsignedVerificationCode,
            trustedCertificate.proofOfPossessionUnsignedVerificationCode)
        &&
        Objects.equals(this.proofOfPossessionVerificationCodeUsableUntil,
            trustedCertificate.proofOfPossessionVerificationCodeUsableUntil)
        &&
        Objects.equals(this.self, trustedCertificate.self) &&
        Objects.equals(this.serialNumber, trustedCertificate.serialNumber) &&
        Objects.equals(this.status, trustedCertificate.status) &&
        Objects.equals(this.subject, trustedCertificate.subject) &&
        Objects.equals(this.version, trustedCertificate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithmName, autoRegistrationEnabled, certInPemFormat, fingerprint, issuer, name, notAfter,
        notBefore, proofOfPossessionValid, proofOfPossessionUnsignedVerificationCode,
        proofOfPossessionVerificationCodeUsableUntil, self, serialNumber, status, subject, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedCertificate {\n");
    sb.append("    algorithmName: ").append(toIndentedString(algorithmName)).append("\n");
    sb.append("    autoRegistrationEnabled: ").append(toIndentedString(autoRegistrationEnabled)).append("\n");
    sb.append("    certInPemFormat: ").append(toIndentedString(certInPemFormat)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    proofOfPossessionValid: ").append(toIndentedString(proofOfPossessionValid)).append("\n");
    sb.append("    proofOfPossessionUnsignedVerificationCode: ")
        .append(toIndentedString(proofOfPossessionUnsignedVerificationCode)).append("\n");
    sb.append("    proofOfPossessionVerificationCodeUsableUntil: ")
        .append(toIndentedString(proofOfPossessionVerificationCodeUsableUntil)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
