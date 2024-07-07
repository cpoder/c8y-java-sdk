package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * For basic authentication case only.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BasicAuthenticationRestrictions {

  private List<String> forbiddenClients = new ArrayList<>();

  private List<String> forbiddenUserAgents = new ArrayList<>();

  private List<String> trustedUserAgents = new ArrayList<>();

  public BasicAuthenticationRestrictions forbiddenClients(List<String> forbiddenClients) {
    this.forbiddenClients = forbiddenClients;
    return this;
  }

  public BasicAuthenticationRestrictions addForbiddenClientsItem(String forbiddenClientsItem) {
    if (this.forbiddenClients == null) {
      this.forbiddenClients = new ArrayList<>();
    }
    this.forbiddenClients.add(forbiddenClientsItem);
    return this;
  }

  /**
   * List of types of clients which are not allowed to use basic authentication.
   * Currently the only supported option is WEB_BROWSERS.
   * 
   * @return forbiddenClients
   */

  @JsonProperty("forbiddenClients")
  public List<String> getForbiddenClients() {
    return forbiddenClients;
  }

  public void setForbiddenClients(List<String> forbiddenClients) {
    this.forbiddenClients = forbiddenClients;
  }

  public BasicAuthenticationRestrictions forbiddenUserAgents(List<String> forbiddenUserAgents) {
    this.forbiddenUserAgents = forbiddenUserAgents;
    return this;
  }

  public BasicAuthenticationRestrictions addForbiddenUserAgentsItem(String forbiddenUserAgentsItem) {
    if (this.forbiddenUserAgents == null) {
      this.forbiddenUserAgents = new ArrayList<>();
    }
    this.forbiddenUserAgents.add(forbiddenUserAgentsItem);
    return this;
  }

  /**
   * List of user agents, passed in `User-Agent` HTTP header, which are blocked if
   * basic authentication is used.
   * 
   * @return forbiddenUserAgents
   */

  @JsonProperty("forbiddenUserAgents")
  public List<String> getForbiddenUserAgents() {
    return forbiddenUserAgents;
  }

  public void setForbiddenUserAgents(List<String> forbiddenUserAgents) {
    this.forbiddenUserAgents = forbiddenUserAgents;
  }

  public BasicAuthenticationRestrictions trustedUserAgents(List<String> trustedUserAgents) {
    this.trustedUserAgents = trustedUserAgents;
    return this;
  }

  public BasicAuthenticationRestrictions addTrustedUserAgentsItem(String trustedUserAgentsItem) {
    if (this.trustedUserAgents == null) {
      this.trustedUserAgents = new ArrayList<>();
    }
    this.trustedUserAgents.add(trustedUserAgentsItem);
    return this;
  }

  /**
   * List of user agents, passed in `User-Agent` HTTP header, which are allowed to
   * use basic authentication.
   * 
   * @return trustedUserAgents
   */

  @JsonProperty("trustedUserAgents")
  public List<String> getTrustedUserAgents() {
    return trustedUserAgents;
  }

  public void setTrustedUserAgents(List<String> trustedUserAgents) {
    this.trustedUserAgents = trustedUserAgents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicAuthenticationRestrictions basicAuthenticationRestrictions = (BasicAuthenticationRestrictions) o;
    return Objects.equals(this.forbiddenClients, basicAuthenticationRestrictions.forbiddenClients) &&
        Objects.equals(this.forbiddenUserAgents, basicAuthenticationRestrictions.forbiddenUserAgents) &&
        Objects.equals(this.trustedUserAgents, basicAuthenticationRestrictions.trustedUserAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenClients, forbiddenUserAgents, trustedUserAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicAuthenticationRestrictions {\n");
    sb.append("    forbiddenClients: ").append(toIndentedString(forbiddenClients)).append("\n");
    sb.append("    forbiddenUserAgents: ").append(toIndentedString(forbiddenUserAgents)).append("\n");
    sb.append("    trustedUserAgents: ").append(toIndentedString(trustedUserAgents)).append("\n");
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
