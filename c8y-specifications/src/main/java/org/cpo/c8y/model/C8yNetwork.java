package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Device capability to either display or display and manage the WAN, LAN, and
 * DHCP settings.
 */

@JsonTypeName("c8y_Network")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yNetwork {

  private C8yNetworkC8yLAN c8yLAN;

  private C8yNetworkC8yWAN c8yWAN;

  private C8yNetworkC8yDHCP c8yDHCP;

  public C8yNetwork c8yLAN(C8yNetworkC8yLAN c8yLAN) {
    this.c8yLAN = c8yLAN;
    return this;
  }

  /**
   * Get c8yLAN
   * 
   * @return c8yLAN
   */

  @JsonProperty("c8y_LAN")
  public C8yNetworkC8yLAN getC8yLAN() {
    return c8yLAN;
  }

  public void setC8yLAN(C8yNetworkC8yLAN c8yLAN) {
    this.c8yLAN = c8yLAN;
  }

  public C8yNetwork c8yWAN(C8yNetworkC8yWAN c8yWAN) {
    this.c8yWAN = c8yWAN;
    return this;
  }

  /**
   * Get c8yWAN
   * 
   * @return c8yWAN
   */

  @JsonProperty("c8y_WAN")
  public C8yNetworkC8yWAN getC8yWAN() {
    return c8yWAN;
  }

  public void setC8yWAN(C8yNetworkC8yWAN c8yWAN) {
    this.c8yWAN = c8yWAN;
  }

  public C8yNetwork c8yDHCP(C8yNetworkC8yDHCP c8yDHCP) {
    this.c8yDHCP = c8yDHCP;
    return this;
  }

  /**
   * Get c8yDHCP
   * 
   * @return c8yDHCP
   */

  @JsonProperty("c8y_DHCP")
  public C8yNetworkC8yDHCP getC8yDHCP() {
    return c8yDHCP;
  }

  public void setC8yDHCP(C8yNetworkC8yDHCP c8yDHCP) {
    this.c8yDHCP = c8yDHCP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yNetwork c8yNetwork = (C8yNetwork) o;
    return Objects.equals(this.c8yLAN, c8yNetwork.c8yLAN) &&
        Objects.equals(this.c8yWAN, c8yNetwork.c8yWAN) &&
        Objects.equals(this.c8yDHCP, c8yNetwork.c8yDHCP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c8yLAN, c8yWAN, c8yDHCP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yNetwork {\n");
    sb.append("    c8yLAN: ").append(toIndentedString(c8yLAN)).append("\n");
    sb.append("    c8yWAN: ").append(toIndentedString(c8yWAN)).append("\n");
    sb.append("    c8yDHCP: ").append(toIndentedString(c8yDHCP)).append("\n");
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
