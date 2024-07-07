package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * Summary of the usage statistics.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SummaryTenantUsageStatistics {

  private Integer alarmsCreatedCount;

  private Integer alarmsUpdatedCount;

  private OffsetDateTime day;

  private Integer deviceCount;

  private Integer deviceEndpointCount;

  private Integer deviceRequestCount;

  private Integer deviceWithChildrenCount;

  private Integer eventsCreatedCount;

  private Integer eventsUpdatedCount;

  private Integer inventoriesCreatedCount;

  private Integer inventoriesUpdatedCount;

  private Integer measurementsCreatedCount;

  private Integer requestCount;

  private UsageStatisticsResources resources;

  private Integer storageSize;

  private List<String> subscribedApplications = new ArrayList<>();

  private Integer totalResourceCreateAndUpdateCount;

  public SummaryTenantUsageStatistics alarmsCreatedCount(Integer alarmsCreatedCount) {
    this.alarmsCreatedCount = alarmsCreatedCount;
    return this;
  }

  /**
   * Number of created alarms.
   * minimum: 0
   * 
   * @return alarmsCreatedCount
   */

  @JsonProperty("alarmsCreatedCount")
  public Integer getAlarmsCreatedCount() {
    return alarmsCreatedCount;
  }

  public void setAlarmsCreatedCount(Integer alarmsCreatedCount) {
    this.alarmsCreatedCount = alarmsCreatedCount;
  }

  public SummaryTenantUsageStatistics alarmsUpdatedCount(Integer alarmsUpdatedCount) {
    this.alarmsUpdatedCount = alarmsUpdatedCount;
    return this;
  }

  /**
   * Number of updates made to the alarms.
   * minimum: 0
   * 
   * @return alarmsUpdatedCount
   */

  @JsonProperty("alarmsUpdatedCount")
  public Integer getAlarmsUpdatedCount() {
    return alarmsUpdatedCount;
  }

  public void setAlarmsUpdatedCount(Integer alarmsUpdatedCount) {
    this.alarmsUpdatedCount = alarmsUpdatedCount;
  }

  public SummaryTenantUsageStatistics day(OffsetDateTime day) {
    this.day = day;
    return this;
  }

  /**
   * Date of this usage statistics summary.
   * 
   * @return day
   */

  @JsonProperty("day")
  public OffsetDateTime getDay() {
    return day;
  }

  public void setDay(OffsetDateTime day) {
    this.day = day;
  }

  public SummaryTenantUsageStatistics deviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
    return this;
  }

  /**
   * Number of devices in the tenant identified by the fragment `c8y_IsDevice`.
   * Updated only three times a day starting at 8:57, 16:57 and 23:57.
   * minimum: 0
   * 
   * @return deviceCount
   */

  @JsonProperty("deviceCount")
  public Integer getDeviceCount() {
    return deviceCount;
  }

  public void setDeviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
  }

  public SummaryTenantUsageStatistics deviceEndpointCount(Integer deviceEndpointCount) {
    this.deviceEndpointCount = deviceEndpointCount;
    return this;
  }

  /**
   * Number of devices which do not have child devices. Updated only three times a
   * day starting at 8:57, 16:57 and 23:57.
   * minimum: 0
   * 
   * @return deviceEndpointCount
   */

  @JsonProperty("deviceEndpointCount")
  public Integer getDeviceEndpointCount() {
    return deviceEndpointCount;
  }

  public void setDeviceEndpointCount(Integer deviceEndpointCount) {
    this.deviceEndpointCount = deviceEndpointCount;
  }

  public SummaryTenantUsageStatistics deviceRequestCount(Integer deviceRequestCount) {
    this.deviceRequestCount = deviceRequestCount;
    return this;
  }

  /**
   * Number of requests that were issued only by devices against the tenant.
   * Updated every 5 minutes. The following requests are not included: * Requests
   * made to <kbd>/user</kbd>, <kbd>/tenant</kbd> and <kbd>/application</kbd> APIs
   * * Application related requests (with `X-Cumulocity-Application-Key` header)
   * minimum: 0
   * 
   * @return deviceRequestCount
   */

  @JsonProperty("deviceRequestCount")
  public Integer getDeviceRequestCount() {
    return deviceRequestCount;
  }

  public void setDeviceRequestCount(Integer deviceRequestCount) {
    this.deviceRequestCount = deviceRequestCount;
  }

  public SummaryTenantUsageStatistics deviceWithChildrenCount(Integer deviceWithChildrenCount) {
    this.deviceWithChildrenCount = deviceWithChildrenCount;
    return this;
  }

  /**
   * Number of devices with children. Updated only three times a day starting at
   * 8:57, 16:57 and 23:57.
   * minimum: 0
   * 
   * @return deviceWithChildrenCount
   */

  @JsonProperty("deviceWithChildrenCount")
  public Integer getDeviceWithChildrenCount() {
    return deviceWithChildrenCount;
  }

  public void setDeviceWithChildrenCount(Integer deviceWithChildrenCount) {
    this.deviceWithChildrenCount = deviceWithChildrenCount;
  }

  public SummaryTenantUsageStatistics eventsCreatedCount(Integer eventsCreatedCount) {
    this.eventsCreatedCount = eventsCreatedCount;
    return this;
  }

  /**
   * Number of created events.
   * minimum: 0
   * 
   * @return eventsCreatedCount
   */

  @JsonProperty("eventsCreatedCount")
  public Integer getEventsCreatedCount() {
    return eventsCreatedCount;
  }

  public void setEventsCreatedCount(Integer eventsCreatedCount) {
    this.eventsCreatedCount = eventsCreatedCount;
  }

  public SummaryTenantUsageStatistics eventsUpdatedCount(Integer eventsUpdatedCount) {
    this.eventsUpdatedCount = eventsUpdatedCount;
    return this;
  }

  /**
   * Number of updates made to the events.
   * minimum: 0
   * 
   * @return eventsUpdatedCount
   */

  @JsonProperty("eventsUpdatedCount")
  public Integer getEventsUpdatedCount() {
    return eventsUpdatedCount;
  }

  public void setEventsUpdatedCount(Integer eventsUpdatedCount) {
    this.eventsUpdatedCount = eventsUpdatedCount;
  }

  public SummaryTenantUsageStatistics inventoriesCreatedCount(Integer inventoriesCreatedCount) {
    this.inventoriesCreatedCount = inventoriesCreatedCount;
    return this;
  }

  /**
   * Number of created managed objects.
   * minimum: 0
   * 
   * @return inventoriesCreatedCount
   */

  @JsonProperty("inventoriesCreatedCount")
  public Integer getInventoriesCreatedCount() {
    return inventoriesCreatedCount;
  }

  public void setInventoriesCreatedCount(Integer inventoriesCreatedCount) {
    this.inventoriesCreatedCount = inventoriesCreatedCount;
  }

  public SummaryTenantUsageStatistics inventoriesUpdatedCount(Integer inventoriesUpdatedCount) {
    this.inventoriesUpdatedCount = inventoriesUpdatedCount;
    return this;
  }

  /**
   * Number of updates made to the managed objects.
   * minimum: 0
   * 
   * @return inventoriesUpdatedCount
   */

  @JsonProperty("inventoriesUpdatedCount")
  public Integer getInventoriesUpdatedCount() {
    return inventoriesUpdatedCount;
  }

  public void setInventoriesUpdatedCount(Integer inventoriesUpdatedCount) {
    this.inventoriesUpdatedCount = inventoriesUpdatedCount;
  }

  public SummaryTenantUsageStatistics measurementsCreatedCount(Integer measurementsCreatedCount) {
    this.measurementsCreatedCount = measurementsCreatedCount;
    return this;
  }

  /**
   * Number of created measurements. > **&#9432; Info:** Bulk creation of
   * measurements is handled in a way that each measurement is counted
   * individually.
   * minimum: 0
   * 
   * @return measurementsCreatedCount
   */

  @JsonProperty("measurementsCreatedCount")
  public Integer getMeasurementsCreatedCount() {
    return measurementsCreatedCount;
  }

  public void setMeasurementsCreatedCount(Integer measurementsCreatedCount) {
    this.measurementsCreatedCount = measurementsCreatedCount;
  }

  public SummaryTenantUsageStatistics requestCount(Integer requestCount) {
    this.requestCount = requestCount;
    return this;
  }

  /**
   * Number of requests that were made against the tenant. Updated every 5
   * minutes. The following requests are not included: * Internal SmartREST
   * requests used to resolve templates * Internal SLA monitoring requests * Calls
   * to any <kbd>/health</kbd> endpoint * Device bootstrap process requests
   * related to configuring and retrieving device credentials * Microservice SDK
   * internal calls for applications and subscriptions
   * minimum: 0
   * 
   * @return requestCount
   */

  @JsonProperty("requestCount")
  public Integer getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Integer requestCount) {
    this.requestCount = requestCount;
  }

  public SummaryTenantUsageStatistics resources(UsageStatisticsResources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * 
   * @return resources
   */

  @JsonProperty("resources")
  public UsageStatisticsResources getResources() {
    return resources;
  }

  public void setResources(UsageStatisticsResources resources) {
    this.resources = resources;
  }

  public SummaryTenantUsageStatistics storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

  /**
   * Database storage in use, specified in bytes. It is affected by your retention
   * rules and by the regularly running database optimization functions in
   * Cumulocity IoT. If the size decreases, it does not necessarily mean that data
   * was deleted. Updated only three times a day starting at 8:57, 16:57 and
   * 23:57.
   * minimum: 0
   * 
   * @return storageSize
   */

  @JsonProperty("storageSize")
  public Integer getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

  public SummaryTenantUsageStatistics subscribedApplications(List<String> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
    return this;
  }

  public SummaryTenantUsageStatistics addSubscribedApplicationsItem(String subscribedApplicationsItem) {
    if (this.subscribedApplications == null) {
      this.subscribedApplications = new ArrayList<>();
    }
    this.subscribedApplications.add(subscribedApplicationsItem);
    return this;
  }

  /**
   * Names of the tenant subscribed applications. Updated only three times a day
   * starting at 8:57, 16:57 and 23:57.
   * 
   * @return subscribedApplications
   */

  @JsonProperty("subscribedApplications")
  public List<String> getSubscribedApplications() {
    return subscribedApplications;
  }

  public void setSubscribedApplications(List<String> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
  }

  public SummaryTenantUsageStatistics totalResourceCreateAndUpdateCount(Integer totalResourceCreateAndUpdateCount) {
    this.totalResourceCreateAndUpdateCount = totalResourceCreateAndUpdateCount;
    return this;
  }

  /**
   * Sum of all inbound transfers.
   * minimum: 0
   * 
   * @return totalResourceCreateAndUpdateCount
   */

  @JsonProperty("totalResourceCreateAndUpdateCount")
  public Integer getTotalResourceCreateAndUpdateCount() {
    return totalResourceCreateAndUpdateCount;
  }

  public void setTotalResourceCreateAndUpdateCount(Integer totalResourceCreateAndUpdateCount) {
    this.totalResourceCreateAndUpdateCount = totalResourceCreateAndUpdateCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryTenantUsageStatistics summaryTenantUsageStatistics = (SummaryTenantUsageStatistics) o;
    return Objects.equals(this.alarmsCreatedCount, summaryTenantUsageStatistics.alarmsCreatedCount) &&
        Objects.equals(this.alarmsUpdatedCount, summaryTenantUsageStatistics.alarmsUpdatedCount) &&
        Objects.equals(this.day, summaryTenantUsageStatistics.day) &&
        Objects.equals(this.deviceCount, summaryTenantUsageStatistics.deviceCount) &&
        Objects.equals(this.deviceEndpointCount, summaryTenantUsageStatistics.deviceEndpointCount) &&
        Objects.equals(this.deviceRequestCount, summaryTenantUsageStatistics.deviceRequestCount) &&
        Objects.equals(this.deviceWithChildrenCount, summaryTenantUsageStatistics.deviceWithChildrenCount) &&
        Objects.equals(this.eventsCreatedCount, summaryTenantUsageStatistics.eventsCreatedCount) &&
        Objects.equals(this.eventsUpdatedCount, summaryTenantUsageStatistics.eventsUpdatedCount) &&
        Objects.equals(this.inventoriesCreatedCount, summaryTenantUsageStatistics.inventoriesCreatedCount) &&
        Objects.equals(this.inventoriesUpdatedCount, summaryTenantUsageStatistics.inventoriesUpdatedCount) &&
        Objects.equals(this.measurementsCreatedCount, summaryTenantUsageStatistics.measurementsCreatedCount) &&
        Objects.equals(this.requestCount, summaryTenantUsageStatistics.requestCount) &&
        Objects.equals(this.resources, summaryTenantUsageStatistics.resources) &&
        Objects.equals(this.storageSize, summaryTenantUsageStatistics.storageSize) &&
        Objects.equals(this.subscribedApplications, summaryTenantUsageStatistics.subscribedApplications) &&
        Objects.equals(this.totalResourceCreateAndUpdateCount,
            summaryTenantUsageStatistics.totalResourceCreateAndUpdateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmsCreatedCount, alarmsUpdatedCount, day, deviceCount, deviceEndpointCount,
        deviceRequestCount, deviceWithChildrenCount, eventsCreatedCount, eventsUpdatedCount, inventoriesCreatedCount,
        inventoriesUpdatedCount, measurementsCreatedCount, requestCount, resources, storageSize, subscribedApplications,
        totalResourceCreateAndUpdateCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryTenantUsageStatistics {\n");
    sb.append("    alarmsCreatedCount: ").append(toIndentedString(alarmsCreatedCount)).append("\n");
    sb.append("    alarmsUpdatedCount: ").append(toIndentedString(alarmsUpdatedCount)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    deviceEndpointCount: ").append(toIndentedString(deviceEndpointCount)).append("\n");
    sb.append("    deviceRequestCount: ").append(toIndentedString(deviceRequestCount)).append("\n");
    sb.append("    deviceWithChildrenCount: ").append(toIndentedString(deviceWithChildrenCount)).append("\n");
    sb.append("    eventsCreatedCount: ").append(toIndentedString(eventsCreatedCount)).append("\n");
    sb.append("    eventsUpdatedCount: ").append(toIndentedString(eventsUpdatedCount)).append("\n");
    sb.append("    inventoriesCreatedCount: ").append(toIndentedString(inventoriesCreatedCount)).append("\n");
    sb.append("    inventoriesUpdatedCount: ").append(toIndentedString(inventoriesUpdatedCount)).append("\n");
    sb.append("    measurementsCreatedCount: ").append(toIndentedString(measurementsCreatedCount)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    subscribedApplications: ").append(toIndentedString(subscribedApplications)).append("\n");
    sb.append("    totalResourceCreateAndUpdateCount: ").append(toIndentedString(totalResourceCreateAndUpdateCount))
        .append("\n");
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
