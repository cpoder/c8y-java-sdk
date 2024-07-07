package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * MicroserviceApplicationManifestExtensionsInner
 */

@JsonTypeName("microservice_application_manifest_extensions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MicroserviceApplicationManifestExtensionsInner {

  private String path;

  private String type;

  public MicroserviceApplicationManifestExtensionsInner path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The relative path in Cumulocity IoT for this microservice application.
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

  public MicroserviceApplicationManifestExtensionsInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this extension.
   * 
   * @return type
   */

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroserviceApplicationManifestExtensionsInner microserviceApplicationManifestExtensionsInner = (MicroserviceApplicationManifestExtensionsInner) o;
    return Objects.equals(this.path, microserviceApplicationManifestExtensionsInner.path) &&
        Objects.equals(this.type, microserviceApplicationManifestExtensionsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroserviceApplicationManifestExtensionsInner {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
