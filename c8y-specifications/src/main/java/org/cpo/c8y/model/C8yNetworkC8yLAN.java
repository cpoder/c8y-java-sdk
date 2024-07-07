package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Local network information.
 */

@JsonTypeName("c8y_Network_c8y_LAN")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yNetworkC8yLAN {

  private String netmask;

  private String ip;

  private String name;

  private Integer enabled;

  private String mac;

  public C8yNetworkC8yLAN netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }

  /**
   * Subnet mask configured for the network interface.
   * 
   * @return netmask
   */

  @JsonProperty("netmask")
  public String getNetmask() {
    return netmask;
  }

  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  public C8yNetworkC8yLAN ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IP address configured for the network interface.
   * 
   * @return ip
   */

  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public C8yNetworkC8yLAN name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Identifier for the network interface.
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

  public C8yNetworkC8yLAN enabled(Integer enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicator showing if the interface is enabled.
   * 
   * @return enabled
   */

  @JsonProperty("enabled")
  public Integer getEnabled() {
    return enabled;
  }

  public void setEnabled(Integer enabled) {
    this.enabled = enabled;
  }

  public C8yNetworkC8yLAN mac(String mac) {
    this.mac = mac;
    return this;
  }

  /**
   * MAC address of the network interface.
   * 
   * @return mac
   */

  @JsonProperty("mac")
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yNetworkC8yLAN c8yNetworkC8yLAN = (C8yNetworkC8yLAN) o;
    return Objects.equals(this.netmask, c8yNetworkC8yLAN.netmask) &&
        Objects.equals(this.ip, c8yNetworkC8yLAN.ip) &&
        Objects.equals(this.name, c8yNetworkC8yLAN.name) &&
        Objects.equals(this.enabled, c8yNetworkC8yLAN.enabled) &&
        Objects.equals(this.mac, c8yNetworkC8yLAN.mac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netmask, ip, name, enabled, mac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yNetworkC8yLAN {\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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
