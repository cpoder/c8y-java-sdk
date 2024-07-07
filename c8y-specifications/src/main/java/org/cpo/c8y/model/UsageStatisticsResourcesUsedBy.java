package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * UsageStatisticsResourcesUsedBy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UsageStatisticsResourcesUsedBy {

  private String cause;

  private Integer cpu;

  private Integer memory;

  private String name;

  public UsageStatisticsResourcesUsedBy cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Reason for calculating statistics of the specified microservice.
   * 
   * @return cause
   */

  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public UsageStatisticsResourcesUsedBy cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Number of CPU usage for a single microservice.
   * minimum: 0
   * 
   * @return cpu
   */

  @JsonProperty("cpu")
  public Integer getCpu() {
    return cpu;
  }

  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  public UsageStatisticsResourcesUsedBy memory(Integer memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Number of memory usage for a single microservice.
   * minimum: 0
   * 
   * @return memory
   */

  @JsonProperty("memory")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public UsageStatisticsResourcesUsedBy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the microservice.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageStatisticsResourcesUsedBy usageStatisticsResourcesUsedBy = (UsageStatisticsResourcesUsedBy) o;
    return Objects.equals(this.cause, usageStatisticsResourcesUsedBy.cause) &&
        Objects.equals(this.cpu, usageStatisticsResourcesUsedBy.cpu) &&
        Objects.equals(this.memory, usageStatisticsResourcesUsedBy.memory) &&
        Objects.equals(this.name, usageStatisticsResourcesUsedBy.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, cpu, memory, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageStatisticsResourcesUsedBy {\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
