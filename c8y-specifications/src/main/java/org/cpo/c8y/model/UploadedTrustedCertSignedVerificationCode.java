package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * The signed verification code to prove the user&#39;s possession of the
 * certificate.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UploadedTrustedCertSignedVerificationCode {

  private String proofOfPossessionSignedVerificationCode;

  public UploadedTrustedCertSignedVerificationCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadedTrustedCertSignedVerificationCode(String proofOfPossessionSignedVerificationCode) {
    this.proofOfPossessionSignedVerificationCode = proofOfPossessionSignedVerificationCode;
  }

  public UploadedTrustedCertSignedVerificationCode proofOfPossessionSignedVerificationCode(
      String proofOfPossessionSignedVerificationCode) {
    this.proofOfPossessionSignedVerificationCode = proofOfPossessionSignedVerificationCode;
    return this;
  }

  /**
   * A signed verification code that proves the right to use the certificate.
   * 
   * @return proofOfPossessionSignedVerificationCode
   */
  @NotNull

  @JsonProperty("proofOfPossessionSignedVerificationCode")
  public String getProofOfPossessionSignedVerificationCode() {
    return proofOfPossessionSignedVerificationCode;
  }

  public void setProofOfPossessionSignedVerificationCode(String proofOfPossessionSignedVerificationCode) {
    this.proofOfPossessionSignedVerificationCode = proofOfPossessionSignedVerificationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedTrustedCertSignedVerificationCode uploadedTrustedCertSignedVerificationCode = (UploadedTrustedCertSignedVerificationCode) o;
    return Objects.equals(this.proofOfPossessionSignedVerificationCode,
        uploadedTrustedCertSignedVerificationCode.proofOfPossessionSignedVerificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proofOfPossessionSignedVerificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedTrustedCertSignedVerificationCode {\n");
    sb.append("    proofOfPossessionSignedVerificationCode: ")
        .append(toIndentedString(proofOfPossessionSignedVerificationCode)).append("\n");
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
