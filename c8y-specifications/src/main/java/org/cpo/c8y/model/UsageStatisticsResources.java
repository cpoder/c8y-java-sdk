package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * Resources usage for each subscribed microservice application.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UsageStatisticsResources {

  private Integer cpu;

  private Integer memory;

  private List<UsageStatisticsResourcesUsedBy> usedBy = new ArrayList<>();

  public UsageStatisticsResources cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Total number of CPU usage for tenant microservices, specified in CPU
   * milliseconds (1000m = 1 CPU).
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

  public UsageStatisticsResources memory(Integer memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Total number of memory usage for tenant microservices, specified in MB.
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

  public UsageStatisticsResources usedBy(List<UsageStatisticsResourcesUsedBy> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  public UsageStatisticsResources addUsedByItem(UsageStatisticsResourcesUsedBy usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

  /**
   * Collection of resources usage for each microservice.
   * 
   * @return usedBy
   */

  @JsonProperty("usedBy")
  public List<UsageStatisticsResourcesUsedBy> getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(List<UsageStatisticsResourcesUsedBy> usedBy) {
    this.usedBy = usedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageStatisticsResources usageStatisticsResources = (UsageStatisticsResources) o;
    return Objects.equals(this.cpu, usageStatisticsResources.cpu) &&
        Objects.equals(this.memory, usageStatisticsResources.memory) &&
        Objects.equals(this.usedBy, usageStatisticsResources.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, usedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageStatisticsResources {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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
