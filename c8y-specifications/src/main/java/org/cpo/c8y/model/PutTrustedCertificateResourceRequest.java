package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * PutTrustedCertificateResourceRequest
 */

@JsonTypeName("putTrustedCertificateResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PutTrustedCertificateResourceRequest {

  private String algorithmName;

  private Boolean autoRegistrationEnabled = false;

  private JsonNullable<Object> certInPemFormat = JsonNullable.<Object>undefined();

  private String fingerprint;

  private String issuer;

  private String name;

  private OffsetDateTime notAfter;

  private OffsetDateTime notBefore;

  private JsonNullable<Object> proofOfPossessionValid = JsonNullable.<Object>undefined();

  private JsonNullable<Object> proofOfPossessionUnsignedVerificationCode = JsonNullable.<Object>undefined();

  private JsonNullable<Object> proofOfPossessionVerificationCodeUsableUntil = JsonNullable.<Object>undefined();

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

  public PutTrustedCertificateResourceRequest algorithmName(String algorithmName) {
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

  public PutTrustedCertificateResourceRequest autoRegistrationEnabled(Boolean autoRegistrationEnabled) {
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

  public PutTrustedCertificateResourceRequest certInPemFormat(Object certInPemFormat) {
    this.certInPemFormat = JsonNullable.of(certInPemFormat);
    return this;
  }

  /**
   * Get certInPemFormat
   * 
   * @return certInPemFormat
   */

  @JsonProperty("certInPemFormat")
  public JsonNullable<Object> getCertInPemFormat() {
    return certInPemFormat;
  }

  public void setCertInPemFormat(JsonNullable<Object> certInPemFormat) {
    this.certInPemFormat = certInPemFormat;
  }

  public PutTrustedCertificateResourceRequest fingerprint(String fingerprint) {
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

  public PutTrustedCertificateResourceRequest issuer(String issuer) {
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

  public PutTrustedCertificateResourceRequest name(String name) {
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

  public PutTrustedCertificateResourceRequest notAfter(OffsetDateTime notAfter) {
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

  public PutTrustedCertificateResourceRequest notBefore(OffsetDateTime notBefore) {
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

  public PutTrustedCertificateResourceRequest proofOfPossessionValid(Object proofOfPossessionValid) {
    this.proofOfPossessionValid = JsonNullable.of(proofOfPossessionValid);
    return this;
  }

  /**
   * Get proofOfPossessionValid
   * 
   * @return proofOfPossessionValid
   */

  @JsonProperty("proofOfPossessionValid")
  public JsonNullable<Object> getProofOfPossessionValid() {
    return proofOfPossessionValid;
  }

  public void setProofOfPossessionValid(JsonNullable<Object> proofOfPossessionValid) {
    this.proofOfPossessionValid = proofOfPossessionValid;
  }

  public PutTrustedCertificateResourceRequest proofOfPossessionUnsignedVerificationCode(
      Object proofOfPossessionUnsignedVerificationCode) {
    this.proofOfPossessionUnsignedVerificationCode = JsonNullable.of(proofOfPossessionUnsignedVerificationCode);
    return this;
  }

  /**
   * Get proofOfPossessionUnsignedVerificationCode
   * 
   * @return proofOfPossessionUnsignedVerificationCode
   */

  @JsonProperty("proofOfPossessionUnsignedVerificationCode")
  public JsonNullable<Object> getProofOfPossessionUnsignedVerificationCode() {
    return proofOfPossessionUnsignedVerificationCode;
  }

  public void setProofOfPossessionUnsignedVerificationCode(
      JsonNullable<Object> proofOfPossessionUnsignedVerificationCode) {
    this.proofOfPossessionUnsignedVerificationCode = proofOfPossessionUnsignedVerificationCode;
  }

  public PutTrustedCertificateResourceRequest proofOfPossessionVerificationCodeUsableUntil(
      Object proofOfPossessionVerificationCodeUsableUntil) {
    this.proofOfPossessionVerificationCodeUsableUntil = JsonNullable.of(proofOfPossessionVerificationCodeUsableUntil);
    return this;
  }

  /**
   * Get proofOfPossessionVerificationCodeUsableUntil
   * 
   * @return proofOfPossessionVerificationCodeUsableUntil
   */

  @JsonProperty("proofOfPossessionVerificationCodeUsableUntil")
  public JsonNullable<Object> getProofOfPossessionVerificationCodeUsableUntil() {
    return proofOfPossessionVerificationCodeUsableUntil;
  }

  public void setProofOfPossessionVerificationCodeUsableUntil(
      JsonNullable<Object> proofOfPossessionVerificationCodeUsableUntil) {
    this.proofOfPossessionVerificationCodeUsableUntil = proofOfPossessionVerificationCodeUsableUntil;
  }

  public PutTrustedCertificateResourceRequest self(URI self) {
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

  public PutTrustedCertificateResourceRequest serialNumber(String serialNumber) {
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

  public PutTrustedCertificateResourceRequest status(StatusEnum status) {
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

  public PutTrustedCertificateResourceRequest subject(String subject) {
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

  public PutTrustedCertificateResourceRequest version(Integer version) {
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PutTrustedCertificateResourceRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTrustedCertificateResourceRequest putTrustedCertificateResourceRequest = (PutTrustedCertificateResourceRequest) o;
    return Objects.equals(this.algorithmName, putTrustedCertificateResourceRequest.algorithmName) &&
        Objects.equals(this.autoRegistrationEnabled, putTrustedCertificateResourceRequest.autoRegistrationEnabled) &&
        equalsNullable(this.certInPemFormat, putTrustedCertificateResourceRequest.certInPemFormat) &&
        Objects.equals(this.fingerprint, putTrustedCertificateResourceRequest.fingerprint) &&
        Objects.equals(this.issuer, putTrustedCertificateResourceRequest.issuer) &&
        Objects.equals(this.name, putTrustedCertificateResourceRequest.name) &&
        Objects.equals(this.notAfter, putTrustedCertificateResourceRequest.notAfter) &&
        Objects.equals(this.notBefore, putTrustedCertificateResourceRequest.notBefore) &&
        equalsNullable(this.proofOfPossessionValid, putTrustedCertificateResourceRequest.proofOfPossessionValid) &&
        equalsNullable(this.proofOfPossessionUnsignedVerificationCode,
            putTrustedCertificateResourceRequest.proofOfPossessionUnsignedVerificationCode)
        &&
        equalsNullable(this.proofOfPossessionVerificationCodeUsableUntil,
            putTrustedCertificateResourceRequest.proofOfPossessionVerificationCodeUsableUntil)
        &&
        Objects.equals(this.self, putTrustedCertificateResourceRequest.self) &&
        Objects.equals(this.serialNumber, putTrustedCertificateResourceRequest.serialNumber) &&
        Objects.equals(this.status, putTrustedCertificateResourceRequest.status) &&
        Objects.equals(this.subject, putTrustedCertificateResourceRequest.subject) &&
        Objects.equals(this.version, putTrustedCertificateResourceRequest.version) &&
        Objects.equals(this.additionalProperties, putTrustedCertificateResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithmName, autoRegistrationEnabled, hashCodeNullable(certInPemFormat), fingerprint, issuer,
        name, notAfter, notBefore, hashCodeNullable(proofOfPossessionValid),
        hashCodeNullable(proofOfPossessionUnsignedVerificationCode),
        hashCodeNullable(proofOfPossessionVerificationCodeUsableUntil), self, serialNumber, status, subject, version,
        additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTrustedCertificateResourceRequest {\n");
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

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
