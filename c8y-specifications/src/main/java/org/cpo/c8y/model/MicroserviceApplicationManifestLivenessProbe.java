package org.cpo.c8y.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * MicroserviceApplicationManifestLivenessProbe
 */

@JsonTypeName("microservice_application_manifest_livenessProbe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MicroserviceApplicationManifestLivenessProbe {

  private Integer failureThreshold;

  private Integer periodSeconds;

  private Integer timeoutSeconds;

  private Integer successThreshold;

  private Integer initialDelaySeconds;

  private ApplicationManifestProbeHttpGet httpGet;

  public MicroserviceApplicationManifestLivenessProbe failureThreshold(Integer failureThreshold) {
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

  public MicroserviceApplicationManifestLivenessProbe periodSeconds(Integer periodSeconds) {
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

  public MicroserviceApplicationManifestLivenessProbe timeoutSeconds(Integer timeoutSeconds) {
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

  public MicroserviceApplicationManifestLivenessProbe successThreshold(Integer successThreshold) {
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

  public MicroserviceApplicationManifestLivenessProbe initialDelaySeconds(Integer initialDelaySeconds) {
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

  public MicroserviceApplicationManifestLivenessProbe httpGet(ApplicationManifestProbeHttpGet httpGet) {
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public MicroserviceApplicationManifestLivenessProbe putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroserviceApplicationManifestLivenessProbe microserviceApplicationManifestLivenessProbe = (MicroserviceApplicationManifestLivenessProbe) o;
    return Objects.equals(this.failureThreshold, microserviceApplicationManifestLivenessProbe.failureThreshold) &&
        Objects.equals(this.periodSeconds, microserviceApplicationManifestLivenessProbe.periodSeconds) &&
        Objects.equals(this.timeoutSeconds, microserviceApplicationManifestLivenessProbe.timeoutSeconds) &&
        Objects.equals(this.successThreshold, microserviceApplicationManifestLivenessProbe.successThreshold) &&
        Objects.equals(this.initialDelaySeconds, microserviceApplicationManifestLivenessProbe.initialDelaySeconds) &&
        Objects.equals(this.httpGet, microserviceApplicationManifestLivenessProbe.httpGet) &&
        Objects.equals(this.additionalProperties, microserviceApplicationManifestLivenessProbe.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureThreshold, periodSeconds, timeoutSeconds, successThreshold, initialDelaySeconds, httpGet,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroserviceApplicationManifestLivenessProbe {\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
