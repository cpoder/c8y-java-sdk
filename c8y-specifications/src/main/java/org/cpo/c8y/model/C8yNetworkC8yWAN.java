package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Mobile internet connectivity interface status.
 */

@JsonTypeName("c8y_Network_c8y_WAN")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yNetworkC8yWAN {

  private String password;

  private String simStatus;

  private String authType;

  private String apn;

  private String username;

  public C8yNetworkC8yWAN password(String password) {
    this.password = password;
    return this;
  }

  /**
   * SIM connectivity password.
   * 
   * @return password
   */

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public C8yNetworkC8yWAN simStatus(String simStatus) {
    this.simStatus = simStatus;
    return this;
  }

  /**
   * SIM connection status.
   * 
   * @return simStatus
   */

  @JsonProperty("simStatus")
  public String getSimStatus() {
    return simStatus;
  }

  public void setSimStatus(String simStatus) {
    this.simStatus = simStatus;
  }

  public C8yNetworkC8yWAN authType(String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Authentication type used by the SIM connectivity.
   * 
   * @return authType
   */

  @JsonProperty("authType")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public C8yNetworkC8yWAN apn(String apn) {
    this.apn = apn;
    return this;
  }

  /**
   * APN used for internet access.
   * 
   * @return apn
   */

  @JsonProperty("apn")
  public String getApn() {
    return apn;
  }

  public void setApn(String apn) {
    this.apn = apn;
  }

  public C8yNetworkC8yWAN username(String username) {
    this.username = username;
    return this;
  }

  /**
   * SIM connectivity username.
   * 
   * @return username
   */

  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yNetworkC8yWAN c8yNetworkC8yWAN = (C8yNetworkC8yWAN) o;
    return Objects.equals(this.password, c8yNetworkC8yWAN.password) &&
        Objects.equals(this.simStatus, c8yNetworkC8yWAN.simStatus) &&
        Objects.equals(this.authType, c8yNetworkC8yWAN.authType) &&
        Objects.equals(this.apn, c8yNetworkC8yWAN.apn) &&
        Objects.equals(this.username, c8yNetworkC8yWAN.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, simStatus, authType, apn, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yNetworkC8yWAN {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    apn: ").append(toIndentedString(apn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
