package org.cpo.c8y.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Holds basic connectivity-related information, such as the equipment
 * identifier of the modem (IMEI) in the device. This identifier is globally
 * unique and often used to identify a mobile device.
 */

@JsonTypeName("c8y_Mobile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yMobile {

  private String imei;

  private String cellId;

  private String iccid;

  public C8yMobile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public C8yMobile(String imei, String cellId, String iccid) {
    this.imei = imei;
    this.cellId = cellId;
    this.iccid = iccid;
  }

  public C8yMobile imei(String imei) {
    this.imei = imei;
    return this;
  }

  /**
   * The equipment identifier (IMEI) of the modem in the device.
   * 
   * @return imei
   */
  @NotNull

  @JsonProperty("imei")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public C8yMobile cellId(String cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * The identifier of the cell in the mobile network that the device is currently
   * connected with.
   * 
   * @return cellId
   */
  @NotNull

  @JsonProperty("cellId")
  public String getCellId() {
    return cellId;
  }

  public void setCellId(String cellId) {
    this.cellId = cellId;
  }

  public C8yMobile iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

  /**
   * The identifier of the SIM card that is currently in the device (often printed
   * on the card).
   * 
   * @return iccid
   */
  @NotNull

  @JsonProperty("iccid")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, String> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public C8yMobile putAdditionalProperty(String key, String value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, String>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public String getAdditionalProperty(String key) {
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
    C8yMobile c8yMobile = (C8yMobile) o;
    return Objects.equals(this.imei, c8yMobile.imei) &&
        Objects.equals(this.cellId, c8yMobile.cellId) &&
        Objects.equals(this.iccid, c8yMobile.iccid) &&
        Objects.equals(this.additionalProperties, c8yMobile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imei, cellId, iccid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yMobile {\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");

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
