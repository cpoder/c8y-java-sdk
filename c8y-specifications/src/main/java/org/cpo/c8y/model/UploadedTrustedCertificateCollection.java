package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * A collection of uploaded trusted certificates.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UploadedTrustedCertificateCollection {

  private List<UploadedTrustedCertificate> certificates = new ArrayList<>();

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  public UploadedTrustedCertificateCollection certificates(List<UploadedTrustedCertificate> certificates) {
    this.certificates = certificates;
    return this;
  }

  public UploadedTrustedCertificateCollection addCertificatesItem(UploadedTrustedCertificate certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

  /**
   * Get certificates
   * 
   * @return certificates
   */

  @JsonProperty("certificates")
  public List<UploadedTrustedCertificate> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<UploadedTrustedCertificate> certificates) {
    this.certificates = certificates;
  }

  public UploadedTrustedCertificateCollection next(String next) {
    this.next = next;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential next page of managed objects.
   * 
   * @return next
   */

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public UploadedTrustedCertificateCollection prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential previous page of managed objects.
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public UploadedTrustedCertificateCollection self(URI self) {
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

  public UploadedTrustedCertificateCollection statistics(PageStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public PageStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(PageStatistics statistics) {
    this.statistics = statistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedTrustedCertificateCollection uploadedTrustedCertificateCollection = (UploadedTrustedCertificateCollection) o;
    return Objects.equals(this.certificates, uploadedTrustedCertificateCollection.certificates) &&
        Objects.equals(this.next, uploadedTrustedCertificateCollection.next) &&
        Objects.equals(this.prev, uploadedTrustedCertificateCollection.prev) &&
        Objects.equals(this.self, uploadedTrustedCertificateCollection.self) &&
        Objects.equals(this.statistics, uploadedTrustedCertificateCollection.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, next, prev, self, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedTrustedCertificateCollection {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
