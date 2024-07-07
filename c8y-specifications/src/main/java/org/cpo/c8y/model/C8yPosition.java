package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Reports the geographical location of an asset in terms of latitude, longitude
 * and altitude. Altitude is given in meters. To report the current location of
 * an asset or a device, &#x60;c8y_Position&#x60; is added to the managed object
 * representing the asset or device. To trace the position of an asset or a
 * device, &#x60;c8y_Position&#x60; is sent as part of an event of type
 * &#x60;c8y_LocationUpdate&#x60;.
 */

@JsonTypeName("c8y_Position")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yPosition {

  private BigDecimal alt;

  private BigDecimal lng;

  private BigDecimal lat;

  private String trackingProtocol;

  private String reportReason;

  public C8yPosition alt(BigDecimal alt) {
    this.alt = alt;
    return this;
  }

  /**
   * In meters.
   * 
   * @return alt
   */

  @JsonProperty("alt")
  public BigDecimal getAlt() {
    return alt;
  }

  public void setAlt(BigDecimal alt) {
    this.alt = alt;
  }

  public C8yPosition lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Get lng
   * 
   * @return lng
   */

  @JsonProperty("lng")
  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public C8yPosition lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * 
   * @return lat
   */

  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public C8yPosition trackingProtocol(String trackingProtocol) {
    this.trackingProtocol = trackingProtocol;
    return this;
  }

  /**
   * Describes in which protocol the tracking context of a positioning report was
   * sent.
   * 
   * @return trackingProtocol
   */

  @JsonProperty("trackingProtocol")
  public String getTrackingProtocol() {
    return trackingProtocol;
  }

  public void setTrackingProtocol(String trackingProtocol) {
    this.trackingProtocol = trackingProtocol;
  }

  public C8yPosition reportReason(String reportReason) {
    this.reportReason = reportReason;
    return this;
  }

  /**
   * Describes why the tracking context of a positioning report was sent.
   * 
   * @return reportReason
   */

  @JsonProperty("reportReason")
  public String getReportReason() {
    return reportReason;
  }

  public void setReportReason(String reportReason) {
    this.reportReason = reportReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yPosition c8yPosition = (C8yPosition) o;
    return Objects.equals(this.alt, c8yPosition.alt) &&
        Objects.equals(this.lng, c8yPosition.lng) &&
        Objects.equals(this.lat, c8yPosition.lat) &&
        Objects.equals(this.trackingProtocol, c8yPosition.trackingProtocol) &&
        Objects.equals(this.reportReason, c8yPosition.reportReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, lng, lat, trackingProtocol, reportReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yPosition {\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    trackingProtocol: ").append(toIndentedString(trackingProtocol)).append("\n");
    sb.append("    reportReason: ").append(toIndentedString(reportReason)).append("\n");
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
