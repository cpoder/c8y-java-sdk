package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * IP address range.
 */

@JsonTypeName("c8y_Network_c8y_DHCP_addressRange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yNetworkC8yDHCPAddressRange {

  private String start;

  private String end;

  public C8yNetworkC8yDHCPAddressRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Start of address range assigned to DHCP clients.
   * 
   * @return start
   */

  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public C8yNetworkC8yDHCPAddressRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * End of address range assigned to DHCP clients.
   * 
   * @return end
   */

  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yNetworkC8yDHCPAddressRange c8yNetworkC8yDHCPAddressRange = (C8yNetworkC8yDHCPAddressRange) o;
    return Objects.equals(this.start, c8yNetworkC8yDHCPAddressRange.start) &&
        Objects.equals(this.end, c8yNetworkC8yDHCPAddressRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yNetworkC8yDHCPAddressRange {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
