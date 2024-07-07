package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * UploadedTrustedCertificate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UploadedTrustedCertificate {

  private Boolean autoRegistrationEnabled = false;

  private String certInPemFormat;

  private String name;

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

  public UploadedTrustedCertificate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadedTrustedCertificate(String certInPemFormat, StatusEnum status) {
    this.certInPemFormat = certInPemFormat;
    this.status = status;
  }

  public UploadedTrustedCertificate autoRegistrationEnabled(Boolean autoRegistrationEnabled) {
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

  public UploadedTrustedCertificate certInPemFormat(String certInPemFormat) {
    this.certInPemFormat = certInPemFormat;
    return this;
  }

  /**
   * Trusted certificate in PEM format.
   * 
   * @return certInPemFormat
   */
  @NotNull

  @JsonProperty("certInPemFormat")
  public String getCertInPemFormat() {
    return certInPemFormat;
  }

  public void setCertInPemFormat(String certInPemFormat) {
    this.certInPemFormat = certInPemFormat;
  }

  public UploadedTrustedCertificate name(String name) {
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

  public UploadedTrustedCertificate status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates if the certificate is active and can be used by the device to
   * establish a connection to the Cumulocity IoT platform.
   * 
   * @return status
   */
  @NotNull

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedTrustedCertificate uploadedTrustedCertificate = (UploadedTrustedCertificate) o;
    return Objects.equals(this.autoRegistrationEnabled, uploadedTrustedCertificate.autoRegistrationEnabled) &&
        Objects.equals(this.certInPemFormat, uploadedTrustedCertificate.certInPemFormat) &&
        Objects.equals(this.name, uploadedTrustedCertificate.name) &&
        Objects.equals(this.status, uploadedTrustedCertificate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRegistrationEnabled, certInPemFormat, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedTrustedCertificate {\n");
    sb.append("    autoRegistrationEnabled: ").append(toIndentedString(autoRegistrationEnabled)).append("\n");
    sb.append("    certInPemFormat: ").append(toIndentedString(certInPemFormat)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
