package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The probe&#39;s HTTP GET method information.
 */

@JsonTypeName("application_manifest_probe_httpGet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationManifestProbeHttpGet {

  private String path;

  private Integer port;

  public ApplicationManifestProbeHttpGet path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The HTTP path.
   * 
   * @return path
   */

  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ApplicationManifestProbeHttpGet port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * The HTTP port.
   * 
   * @return port
   */

  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationManifestProbeHttpGet applicationManifestProbeHttpGet = (ApplicationManifestProbeHttpGet) o;
    return Objects.equals(this.path, applicationManifestProbeHttpGet.path) &&
        Objects.equals(this.port, applicationManifestProbeHttpGet.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationManifestProbeHttpGet {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
