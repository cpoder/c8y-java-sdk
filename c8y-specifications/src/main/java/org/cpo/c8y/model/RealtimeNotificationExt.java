package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Authentication object passed to handshake (only over WebSockets).
 */

@JsonTypeName("realtimeNotification_ext")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RealtimeNotificationExt {

  private RealtimeNotificationExtComCumulocityAuthn comCumulocityAuthn;

  /**
   * The system of units to use.
   */
  public enum SystemOfUnitsEnum {
    IMPERIAL("imperial"),

    METRIC("metric");

    private String value;

    SystemOfUnitsEnum(String value) {
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
    public static SystemOfUnitsEnum fromValue(String value) {
      for (SystemOfUnitsEnum b : SystemOfUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SystemOfUnitsEnum systemOfUnits;

  public RealtimeNotificationExt comCumulocityAuthn(RealtimeNotificationExtComCumulocityAuthn comCumulocityAuthn) {
    this.comCumulocityAuthn = comCumulocityAuthn;
    return this;
  }

  /**
   * Get comCumulocityAuthn
   * 
   * @return comCumulocityAuthn
   */

  @JsonProperty("com.cumulocity.authn")
  public RealtimeNotificationExtComCumulocityAuthn getComCumulocityAuthn() {
    return comCumulocityAuthn;
  }

  public void setComCumulocityAuthn(RealtimeNotificationExtComCumulocityAuthn comCumulocityAuthn) {
    this.comCumulocityAuthn = comCumulocityAuthn;
  }

  public RealtimeNotificationExt systemOfUnits(SystemOfUnitsEnum systemOfUnits) {
    this.systemOfUnits = systemOfUnits;
    return this;
  }

  /**
   * The system of units to use.
   * 
   * @return systemOfUnits
   */

  @JsonProperty("systemOfUnits")
  public SystemOfUnitsEnum getSystemOfUnits() {
    return systemOfUnits;
  }

  public void setSystemOfUnits(SystemOfUnitsEnum systemOfUnits) {
    this.systemOfUnits = systemOfUnits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeNotificationExt realtimeNotificationExt = (RealtimeNotificationExt) o;
    return Objects.equals(this.comCumulocityAuthn, realtimeNotificationExt.comCumulocityAuthn) &&
        Objects.equals(this.systemOfUnits, realtimeNotificationExt.systemOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comCumulocityAuthn, systemOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeNotificationExt {\n");
    sb.append("    comCumulocityAuthn: ").append(toIndentedString(comCumulocityAuthn)).append("\n");
    sb.append("    systemOfUnits: ").append(toIndentedString(systemOfUnits)).append("\n");
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
