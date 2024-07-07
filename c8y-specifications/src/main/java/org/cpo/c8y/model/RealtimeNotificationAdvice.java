package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Configuration parameters for the current connect message.
 */

@JsonTypeName("realtimeNotification_advice")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RealtimeNotificationAdvice {

  private Integer interval;

  private Integer timeout;

  public RealtimeNotificationAdvice interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Period (milliseconds) after which the server will close the session, if it
   * doesn't received the next connect message from the client. Overrides server
   * default settings for current request-response conversation.
   * minimum: 0
   * 
   * @return interval
   */

  @JsonProperty("interval")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public RealtimeNotificationAdvice timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Interval (milliseconds) between the sending of the connect message and the
   * response from the server. Overrides server default settings for the current
   * request-response conversation.
   * minimum: 0
   * 
   * @return timeout
   */

  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeNotificationAdvice realtimeNotificationAdvice = (RealtimeNotificationAdvice) o;
    return Objects.equals(this.interval, realtimeNotificationAdvice.interval) &&
        Objects.equals(this.timeout, realtimeNotificationAdvice.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeNotificationAdvice {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
