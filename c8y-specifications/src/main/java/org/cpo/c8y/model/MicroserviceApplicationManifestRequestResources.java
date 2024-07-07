package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The minimum required resources for the microservice application.
 */

@JsonTypeName("microservice_application_manifest_requestResources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MicroserviceApplicationManifestRequestResources {

  private String cpu;

  private String memory;

  public MicroserviceApplicationManifestRequestResources cpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * The required CPU resource for this microservice application.
   * 
   * @return cpu
   */

  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public MicroserviceApplicationManifestRequestResources memory(String memory) {
    this.memory = memory;
    return this;
  }

  /**
   * The required memory resource for this microservice application.
   * 
   * @return memory
   */

  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroserviceApplicationManifestRequestResources microserviceApplicationManifestRequestResources = (MicroserviceApplicationManifestRequestResources) o;
    return Objects.equals(this.cpu, microserviceApplicationManifestRequestResources.cpu) &&
        Objects.equals(this.memory, microserviceApplicationManifestRequestResources.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroserviceApplicationManifestRequestResources {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
