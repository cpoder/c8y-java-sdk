package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * The session configuration properties are only available for OAuth internal.
 * See [Administration &gt; Changing settings &gt; OAuth
 * internal](https://cumulocity.com/guides/10.11.0/users-guide/administration/#oauth-internal)
 * in the *10.11.0 user guide* for more details.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class OAuthSessionConfiguration {

  private Integer absoluteTimeoutMillis;

  private Integer maximumNumberOfParallelSessions;

  private Integer renewalTimeoutMillis;

  private Boolean userAgentValidationRequired;

  public OAuthSessionConfiguration absoluteTimeoutMillis(Integer absoluteTimeoutMillis) {
    this.absoluteTimeoutMillis = absoluteTimeoutMillis;
    return this;
  }

  /**
   * Maximum session duration (in milliseconds) during which a user does not have
   * to login again.
   * 
   * @return absoluteTimeoutMillis
   */

  @JsonProperty("absoluteTimeoutMillis")
  public Integer getAbsoluteTimeoutMillis() {
    return absoluteTimeoutMillis;
  }

  public void setAbsoluteTimeoutMillis(Integer absoluteTimeoutMillis) {
    this.absoluteTimeoutMillis = absoluteTimeoutMillis;
  }

  public OAuthSessionConfiguration maximumNumberOfParallelSessions(Integer maximumNumberOfParallelSessions) {
    this.maximumNumberOfParallelSessions = maximumNumberOfParallelSessions;
    return this;
  }

  /**
   * Maximum number of parallel sessions for one user.
   * 
   * @return maximumNumberOfParallelSessions
   */

  @JsonProperty("maximumNumberOfParallelSessions")
  public Integer getMaximumNumberOfParallelSessions() {
    return maximumNumberOfParallelSessions;
  }

  public void setMaximumNumberOfParallelSessions(Integer maximumNumberOfParallelSessions) {
    this.maximumNumberOfParallelSessions = maximumNumberOfParallelSessions;
  }

  public OAuthSessionConfiguration renewalTimeoutMillis(Integer renewalTimeoutMillis) {
    this.renewalTimeoutMillis = renewalTimeoutMillis;
    return this;
  }

  /**
   * Amount of time before a token expires (in milliseconds) during which the
   * token may be renewed.
   * 
   * @return renewalTimeoutMillis
   */

  @JsonProperty("renewalTimeoutMillis")
  public Integer getRenewalTimeoutMillis() {
    return renewalTimeoutMillis;
  }

  public void setRenewalTimeoutMillis(Integer renewalTimeoutMillis) {
    this.renewalTimeoutMillis = renewalTimeoutMillis;
  }

  public OAuthSessionConfiguration userAgentValidationRequired(Boolean userAgentValidationRequired) {
    this.userAgentValidationRequired = userAgentValidationRequired;
    return this;
  }

  /**
   * Switch to turn additional user agent verification on or off during the
   * session.
   * 
   * @return userAgentValidationRequired
   */

  @JsonProperty("userAgentValidationRequired")
  public Boolean getUserAgentValidationRequired() {
    return userAgentValidationRequired;
  }

  public void setUserAgentValidationRequired(Boolean userAgentValidationRequired) {
    this.userAgentValidationRequired = userAgentValidationRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthSessionConfiguration oauthSessionConfiguration = (OAuthSessionConfiguration) o;
    return Objects.equals(this.absoluteTimeoutMillis, oauthSessionConfiguration.absoluteTimeoutMillis) &&
        Objects.equals(this.maximumNumberOfParallelSessions, oauthSessionConfiguration.maximumNumberOfParallelSessions)
        &&
        Objects.equals(this.renewalTimeoutMillis, oauthSessionConfiguration.renewalTimeoutMillis) &&
        Objects.equals(this.userAgentValidationRequired, oauthSessionConfiguration.userAgentValidationRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteTimeoutMillis, maximumNumberOfParallelSessions, renewalTimeoutMillis,
        userAgentValidationRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthSessionConfiguration {\n");
    sb.append("    absoluteTimeoutMillis: ").append(toIndentedString(absoluteTimeoutMillis)).append("\n");
    sb.append("    maximumNumberOfParallelSessions: ").append(toIndentedString(maximumNumberOfParallelSessions))
        .append("\n");
    sb.append("    renewalTimeoutMillis: ").append(toIndentedString(renewalTimeoutMillis)).append("\n");
    sb.append("    userAgentValidationRequired: ").append(toIndentedString(userAgentValidationRequired)).append("\n");
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
