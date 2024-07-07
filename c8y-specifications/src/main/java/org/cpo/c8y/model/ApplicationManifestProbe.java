package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ApplicationManifestProbe
 */

@JsonTypeName("application_manifest_probe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationManifestProbe {

  private Integer failureThreshold;

  private Integer periodSeconds;

  private Integer timeoutSeconds;

  private Integer successThreshold;

  private Integer initialDelaySeconds;

  private ApplicationManifestProbeHttpGet httpGet;

  public ApplicationManifestProbe failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

  /**
   * The probe failure threshold.
   * 
   * @return failureThreshold
   */

  @JsonProperty("failureThreshold")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public ApplicationManifestProbe periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * The probe period in seconds.
   * 
   * @return periodSeconds
   */

  @JsonProperty("periodSeconds")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public ApplicationManifestProbe timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * The probe timeout in seconds.
   * 
   * @return timeoutSeconds
   */

  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public ApplicationManifestProbe successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

  /**
   * The probe success threshold.
   * 
   * @return successThreshold
   */

  @JsonProperty("successThreshold")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public ApplicationManifestProbe initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  /**
   * The probe's initial delay in seconds.
   * 
   * @return initialDelaySeconds
   */

  @JsonProperty("initialDelaySeconds")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public ApplicationManifestProbe httpGet(ApplicationManifestProbeHttpGet httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  /**
   * Get httpGet
   * 
   * @return httpGet
   */

  @JsonProperty("httpGet")
  public ApplicationManifestProbeHttpGet getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(ApplicationManifestProbeHttpGet httpGet) {
    this.httpGet = httpGet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationManifestProbe applicationManifestProbe = (ApplicationManifestProbe) o;
    return Objects.equals(this.failureThreshold, applicationManifestProbe.failureThreshold) &&
        Objects.equals(this.periodSeconds, applicationManifestProbe.periodSeconds) &&
        Objects.equals(this.timeoutSeconds, applicationManifestProbe.timeoutSeconds) &&
        Objects.equals(this.successThreshold, applicationManifestProbe.successThreshold) &&
        Objects.equals(this.initialDelaySeconds, applicationManifestProbe.initialDelaySeconds) &&
        Objects.equals(this.httpGet, applicationManifestProbe.httpGet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureThreshold, periodSeconds, timeoutSeconds, successThreshold, initialDelaySeconds,
        httpGet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationManifestProbe {\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
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
