package org.cpo.c8y.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Detailed information about a neighbouring cell tower.
 */

@JsonTypeName("c8y_CellTower")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yCellTower {

  private String radioType;

  private BigDecimal mobileCountryCode;

  private BigDecimal mobileNetworkCode;

  private BigDecimal locationAreaCode;

  private BigDecimal cellId;

  private BigDecimal timingAdvance;

  private BigDecimal signalStrength;

  private BigDecimal primaryScramblingCode;

  private BigDecimal serving;

  public C8yCellTower() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public C8yCellTower(BigDecimal mobileCountryCode, BigDecimal mobileNetworkCode, BigDecimal locationAreaCode,
      BigDecimal cellId) {
    this.mobileCountryCode = mobileCountryCode;
    this.mobileNetworkCode = mobileNetworkCode;
    this.locationAreaCode = locationAreaCode;
    this.cellId = cellId;
  }

  public C8yCellTower radioType(String radioType) {
    this.radioType = radioType;
    return this;
  }

  /**
   * The radio type of this cell tower. Can also be put directly in root JSON
   * element if all cellTowers have same radioType.
   * 
   * @return radioType
   */

  @JsonProperty("radioType")
  public String getRadioType() {
    return radioType;
  }

  public void setRadioType(String radioType) {
    this.radioType = radioType;
  }

  public C8yCellTower mobileCountryCode(BigDecimal mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
    return this;
  }

  /**
   * The Mobile Country Code (MCC).
   * 
   * @return mobileCountryCode
   */
  @NotNull

  @JsonProperty("mobileCountryCode")
  public BigDecimal getMobileCountryCode() {
    return mobileCountryCode;
  }

  public void setMobileCountryCode(BigDecimal mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
  }

  public C8yCellTower mobileNetworkCode(BigDecimal mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
    return this;
  }

  /**
   * The Mobile Network Code (MNC) for GSM, WCDMA and LTE. The SystemID (sid) for
   * CDMA.
   * 
   * @return mobileNetworkCode
   */
  @NotNull

  @JsonProperty("mobileNetworkCode")
  public BigDecimal getMobileNetworkCode() {
    return mobileNetworkCode;
  }

  public void setMobileNetworkCode(BigDecimal mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
  }

  public C8yCellTower locationAreaCode(BigDecimal locationAreaCode) {
    this.locationAreaCode = locationAreaCode;
    return this;
  }

  /**
   * The Location Area Code (LAC) for GSM, WCDMA and LTE. The Network ID for CDMA.
   * 
   * @return locationAreaCode
   */
  @NotNull

  @JsonProperty("locationAreaCode")
  public BigDecimal getLocationAreaCode() {
    return locationAreaCode;
  }

  public void setLocationAreaCode(BigDecimal locationAreaCode) {
    this.locationAreaCode = locationAreaCode;
  }

  public C8yCellTower cellId(BigDecimal cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * The Cell ID (CID) for GSM, WCDMA and LTE. The base station ID for CDMA.
   * 
   * @return cellId
   */
  @NotNull

  @JsonProperty("cellId")
  public BigDecimal getCellId() {
    return cellId;
  }

  public void setCellId(BigDecimal cellId) {
    this.cellId = cellId;
  }

  public C8yCellTower timingAdvance(BigDecimal timingAdvance) {
    this.timingAdvance = timingAdvance;
    return this;
  }

  /**
   * The timing advance value for this cell tower when available.
   * 
   * @return timingAdvance
   */

  @JsonProperty("timingAdvance")
  public BigDecimal getTimingAdvance() {
    return timingAdvance;
  }

  public void setTimingAdvance(BigDecimal timingAdvance) {
    this.timingAdvance = timingAdvance;
  }

  public C8yCellTower signalStrength(BigDecimal signalStrength) {
    this.signalStrength = signalStrength;
    return this;
  }

  /**
   * The signal strength for this cell tower in dBm.
   * 
   * @return signalStrength
   */

  @JsonProperty("signalStrength")
  public BigDecimal getSignalStrength() {
    return signalStrength;
  }

  public void setSignalStrength(BigDecimal signalStrength) {
    this.signalStrength = signalStrength;
  }

  public C8yCellTower primaryScramblingCode(BigDecimal primaryScramblingCode) {
    this.primaryScramblingCode = primaryScramblingCode;
    return this;
  }

  /**
   * The primary scrambling code for WCDMA and physical CellId for LTE.
   * 
   * @return primaryScramblingCode
   */

  @JsonProperty("primaryScramblingCode")
  public BigDecimal getPrimaryScramblingCode() {
    return primaryScramblingCode;
  }

  public void setPrimaryScramblingCode(BigDecimal primaryScramblingCode) {
    this.primaryScramblingCode = primaryScramblingCode;
  }

  public C8yCellTower serving(BigDecimal serving) {
    this.serving = serving;
    return this;
  }

  /**
   * Specify with 0/1 if the cell is serving or not. If not specified, the first
   * cell is assumed to be serving.
   * 
   * @return serving
   */

  @JsonProperty("serving")
  public BigDecimal getServing() {
    return serving;
  }

  public void setServing(BigDecimal serving) {
    this.serving = serving;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yCellTower c8yCellTower = (C8yCellTower) o;
    return Objects.equals(this.radioType, c8yCellTower.radioType) &&
        Objects.equals(this.mobileCountryCode, c8yCellTower.mobileCountryCode) &&
        Objects.equals(this.mobileNetworkCode, c8yCellTower.mobileNetworkCode) &&
        Objects.equals(this.locationAreaCode, c8yCellTower.locationAreaCode) &&
        Objects.equals(this.cellId, c8yCellTower.cellId) &&
        Objects.equals(this.timingAdvance, c8yCellTower.timingAdvance) &&
        Objects.equals(this.signalStrength, c8yCellTower.signalStrength) &&
        Objects.equals(this.primaryScramblingCode, c8yCellTower.primaryScramblingCode) &&
        Objects.equals(this.serving, c8yCellTower.serving);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radioType, mobileCountryCode, mobileNetworkCode, locationAreaCode, cellId, timingAdvance,
        signalStrength, primaryScramblingCode, serving);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yCellTower {\n");
    sb.append("    radioType: ").append(toIndentedString(radioType)).append("\n");
    sb.append("    mobileCountryCode: ").append(toIndentedString(mobileCountryCode)).append("\n");
    sb.append("    mobileNetworkCode: ").append(toIndentedString(mobileNetworkCode)).append("\n");
    sb.append("    locationAreaCode: ").append(toIndentedString(locationAreaCode)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    timingAdvance: ").append(toIndentedString(timingAdvance)).append("\n");
    sb.append("    signalStrength: ").append(toIndentedString(signalStrength)).append("\n");
    sb.append("    primaryScramblingCode: ").append(toIndentedString(primaryScramblingCode)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
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
