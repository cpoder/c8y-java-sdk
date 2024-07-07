package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Information for DHCP server status.
 */

@JsonTypeName("c8y_Network_c8y_DHCP")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yNetworkC8yDHCP {

  private String dns1;

  private String dns2;

  private String domainName;

  private C8yNetworkC8yDHCPAddressRange addressRange;

  private Integer enabled;

  public C8yNetworkC8yDHCP dns1(String dns1) {
    this.dns1 = dns1;
    return this;
  }

  /**
   * First configured DNS server.
   * 
   * @return dns1
   */

  @JsonProperty("dns1")
  public String getDns1() {
    return dns1;
  }

  public void setDns1(String dns1) {
    this.dns1 = dns1;
  }

  public C8yNetworkC8yDHCP dns2(String dns2) {
    this.dns2 = dns2;
    return this;
  }

  /**
   * Second configured DNS server.
   * 
   * @return dns2
   */

  @JsonProperty("dns2")
  public String getDns2() {
    return dns2;
  }

  public void setDns2(String dns2) {
    this.dns2 = dns2;
  }

  public C8yNetworkC8yDHCP domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Domain name configured for the device.
   * 
   * @return domainName
   */

  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public C8yNetworkC8yDHCP addressRange(C8yNetworkC8yDHCPAddressRange addressRange) {
    this.addressRange = addressRange;
    return this;
  }

  /**
   * Get addressRange
   * 
   * @return addressRange
   */

  @JsonProperty("addressRange")
  public C8yNetworkC8yDHCPAddressRange getAddressRange() {
    return addressRange;
  }

  public void setAddressRange(C8yNetworkC8yDHCPAddressRange addressRange) {
    this.addressRange = addressRange;
  }

  public C8yNetworkC8yDHCP enabled(Integer enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicator showing if the DHCP server is enabled.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yNetworkC8yDHCP c8yNetworkC8yDHCP = (C8yNetworkC8yDHCP) o;
    return Objects.equals(this.dns1, c8yNetworkC8yDHCP.dns1) &&
        Objects.equals(this.dns2, c8yNetworkC8yDHCP.dns2) &&
        Objects.equals(this.domainName, c8yNetworkC8yDHCP.domainName) &&
        Objects.equals(this.addressRange, c8yNetworkC8yDHCP.addressRange) &&
        Objects.equals(this.enabled, c8yNetworkC8yDHCP.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns1, dns2, domainName, addressRange, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yNetworkC8yDHCP {\n");
    sb.append("    dns1: ").append(toIndentedString(dns1)).append("\n");
    sb.append("    dns2: ").append(toIndentedString(dns2)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    addressRange: ").append(toIndentedString(addressRange)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
