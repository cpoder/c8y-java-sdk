package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * SummaryAllTenantsUsageStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SummaryAllTenantsUsageStatistics {

  private Integer alarmsCreatedCount;

  private Integer alarmsUpdatedCount;

  private OffsetDateTime creationTime;

  private Integer deviceCount;

  private Integer deviceEndpointCount;

  private Integer deviceRequestCount;

  private Integer deviceWithChildrenCount;

  private String externalReference;

  private Integer eventsCreatedCount;

  private Integer eventsUpdatedCount;

  private Integer inventoriesCreatedCount;

  private Integer inventoriesUpdatedCount;

  private Integer measurementsCreatedCount;

  private String parentTenantId;

  private Integer peakDeviceCount;

  private Integer peakDeviceWithChildrenCount;

  private Integer peakStorageSize;

  private Integer requestCount;

  private UsageStatisticsResources resources;

  private Integer storageSize;

  private List<String> subscribedApplications = new ArrayList<>();

  private String tenantCompany;

  private CustomProperties tenantCustomProperties;

  private String tenantDomain;

  private String tenantId;

  private Integer totalResourceCreateAndUpdateCount;

  public SummaryAllTenantsUsageStatistics alarmsCreatedCount(Integer alarmsCreatedCount) {
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

  public SummaryAllTenantsUsageStatistics alarmsUpdatedCount(Integer alarmsUpdatedCount) {
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

  public SummaryAllTenantsUsageStatistics creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Date and time of the tenant's creation.
   * 
   * @return creationTime
   */

  @JsonProperty("creationTime")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public SummaryAllTenantsUsageStatistics deviceCount(Integer deviceCount) {
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

  public SummaryAllTenantsUsageStatistics deviceEndpointCount(Integer deviceEndpointCount) {
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

  public SummaryAllTenantsUsageStatistics deviceRequestCount(Integer deviceRequestCount) {
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

  public SummaryAllTenantsUsageStatistics deviceWithChildrenCount(Integer deviceWithChildrenCount) {
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

  public SummaryAllTenantsUsageStatistics externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Tenant external reference.
   * 
   * @return externalReference
   */

  @JsonProperty("externalReference")
  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SummaryAllTenantsUsageStatistics eventsCreatedCount(Integer eventsCreatedCount) {
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

  public SummaryAllTenantsUsageStatistics eventsUpdatedCount(Integer eventsUpdatedCount) {
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

  public SummaryAllTenantsUsageStatistics inventoriesCreatedCount(Integer inventoriesCreatedCount) {
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

  public SummaryAllTenantsUsageStatistics inventoriesUpdatedCount(Integer inventoriesUpdatedCount) {
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

  public SummaryAllTenantsUsageStatistics measurementsCreatedCount(Integer measurementsCreatedCount) {
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

  public SummaryAllTenantsUsageStatistics parentTenantId(String parentTenantId) {
    this.parentTenantId = parentTenantId;
    return this;
  }

  /**
   * ID of the parent tenant.
   * 
   * @return parentTenantId
   */

  @JsonProperty("parentTenantId")
  public String getParentTenantId() {
    return parentTenantId;
  }

  public void setParentTenantId(String parentTenantId) {
    this.parentTenantId = parentTenantId;
  }

  public SummaryAllTenantsUsageStatistics peakDeviceCount(Integer peakDeviceCount) {
    this.peakDeviceCount = peakDeviceCount;
    return this;
  }

  /**
   * Peak value of `deviceCount` calculated for the requested time period of the
   * summary.
   * 
   * @return peakDeviceCount
   */

  @JsonProperty("peakDeviceCount")
  public Integer getPeakDeviceCount() {
    return peakDeviceCount;
  }

  public void setPeakDeviceCount(Integer peakDeviceCount) {
    this.peakDeviceCount = peakDeviceCount;
  }

  public SummaryAllTenantsUsageStatistics peakDeviceWithChildrenCount(Integer peakDeviceWithChildrenCount) {
    this.peakDeviceWithChildrenCount = peakDeviceWithChildrenCount;
    return this;
  }

  /**
   * Peak value of `deviceWithChildrenCount` calculated for the requested time
   * period of the summary.
   * 
   * @return peakDeviceWithChildrenCount
   */

  @JsonProperty("peakDeviceWithChildrenCount")
  public Integer getPeakDeviceWithChildrenCount() {
    return peakDeviceWithChildrenCount;
  }

  public void setPeakDeviceWithChildrenCount(Integer peakDeviceWithChildrenCount) {
    this.peakDeviceWithChildrenCount = peakDeviceWithChildrenCount;
  }

  public SummaryAllTenantsUsageStatistics peakStorageSize(Integer peakStorageSize) {
    this.peakStorageSize = peakStorageSize;
    return this;
  }

  /**
   * Peak value of used storage size in bytes, calculated for the requested time
   * period of the summary.
   * 
   * @return peakStorageSize
   */

  @JsonProperty("peakStorageSize")
  public Integer getPeakStorageSize() {
    return peakStorageSize;
  }

  public void setPeakStorageSize(Integer peakStorageSize) {
    this.peakStorageSize = peakStorageSize;
  }

  public SummaryAllTenantsUsageStatistics requestCount(Integer requestCount) {
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

  public SummaryAllTenantsUsageStatistics resources(UsageStatisticsResources resources) {
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

  public SummaryAllTenantsUsageStatistics storageSize(Integer storageSize) {
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

  public SummaryAllTenantsUsageStatistics subscribedApplications(List<String> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
    return this;
  }

  public SummaryAllTenantsUsageStatistics addSubscribedApplicationsItem(String subscribedApplicationsItem) {
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

  public SummaryAllTenantsUsageStatistics tenantCompany(String tenantCompany) {
    this.tenantCompany = tenantCompany;
    return this;
  }

  /**
   * The tenant's company name.
   * 
   * @return tenantCompany
   */

  @JsonProperty("tenantCompany")
  public String getTenantCompany() {
    return tenantCompany;
  }

  public void setTenantCompany(String tenantCompany) {
    this.tenantCompany = tenantCompany;
  }

  public SummaryAllTenantsUsageStatistics tenantCustomProperties(CustomProperties tenantCustomProperties) {
    this.tenantCustomProperties = tenantCustomProperties;
    return this;
  }

  /**
   * Get tenantCustomProperties
   * 
   * @return tenantCustomProperties
   */

  @JsonProperty("tenantCustomProperties")
  public CustomProperties getTenantCustomProperties() {
    return tenantCustomProperties;
  }

  public void setTenantCustomProperties(CustomProperties tenantCustomProperties) {
    this.tenantCustomProperties = tenantCustomProperties;
  }

  public SummaryAllTenantsUsageStatistics tenantDomain(String tenantDomain) {
    this.tenantDomain = tenantDomain;
    return this;
  }

  /**
   * URL of the tenant's domain. The domain name permits only the use of
   * alphanumeric characters separated by dots `.`, hyphens `-` and underscores
   * `_`.
   * 
   * @return tenantDomain
   */

  @JsonProperty("tenantDomain")
  public String getTenantDomain() {
    return tenantDomain;
  }

  public void setTenantDomain(String tenantDomain) {
    this.tenantDomain = tenantDomain;
  }

  public SummaryAllTenantsUsageStatistics tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Unique identifier of a Cumulocity IoT tenant.
   * 
   * @return tenantId
   */

  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public SummaryAllTenantsUsageStatistics totalResourceCreateAndUpdateCount(Integer totalResourceCreateAndUpdateCount) {
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
    SummaryAllTenantsUsageStatistics summaryAllTenantsUsageStatistics = (SummaryAllTenantsUsageStatistics) o;
    return Objects.equals(this.alarmsCreatedCount, summaryAllTenantsUsageStatistics.alarmsCreatedCount) &&
        Objects.equals(this.alarmsUpdatedCount, summaryAllTenantsUsageStatistics.alarmsUpdatedCount) &&
        Objects.equals(this.creationTime, summaryAllTenantsUsageStatistics.creationTime) &&
        Objects.equals(this.deviceCount, summaryAllTenantsUsageStatistics.deviceCount) &&
        Objects.equals(this.deviceEndpointCount, summaryAllTenantsUsageStatistics.deviceEndpointCount) &&
        Objects.equals(this.deviceRequestCount, summaryAllTenantsUsageStatistics.deviceRequestCount) &&
        Objects.equals(this.deviceWithChildrenCount, summaryAllTenantsUsageStatistics.deviceWithChildrenCount) &&
        Objects.equals(this.externalReference, summaryAllTenantsUsageStatistics.externalReference) &&
        Objects.equals(this.eventsCreatedCount, summaryAllTenantsUsageStatistics.eventsCreatedCount) &&
        Objects.equals(this.eventsUpdatedCount, summaryAllTenantsUsageStatistics.eventsUpdatedCount) &&
        Objects.equals(this.inventoriesCreatedCount, summaryAllTenantsUsageStatistics.inventoriesCreatedCount) &&
        Objects.equals(this.inventoriesUpdatedCount, summaryAllTenantsUsageStatistics.inventoriesUpdatedCount) &&
        Objects.equals(this.measurementsCreatedCount, summaryAllTenantsUsageStatistics.measurementsCreatedCount) &&
        Objects.equals(this.parentTenantId, summaryAllTenantsUsageStatistics.parentTenantId) &&
        Objects.equals(this.peakDeviceCount, summaryAllTenantsUsageStatistics.peakDeviceCount) &&
        Objects.equals(this.peakDeviceWithChildrenCount, summaryAllTenantsUsageStatistics.peakDeviceWithChildrenCount)
        &&
        Objects.equals(this.peakStorageSize, summaryAllTenantsUsageStatistics.peakStorageSize) &&
        Objects.equals(this.requestCount, summaryAllTenantsUsageStatistics.requestCount) &&
        Objects.equals(this.resources, summaryAllTenantsUsageStatistics.resources) &&
        Objects.equals(this.storageSize, summaryAllTenantsUsageStatistics.storageSize) &&
        Objects.equals(this.subscribedApplications, summaryAllTenantsUsageStatistics.subscribedApplications) &&
        Objects.equals(this.tenantCompany, summaryAllTenantsUsageStatistics.tenantCompany) &&
        Objects.equals(this.tenantCustomProperties, summaryAllTenantsUsageStatistics.tenantCustomProperties) &&
        Objects.equals(this.tenantDomain, summaryAllTenantsUsageStatistics.tenantDomain) &&
        Objects.equals(this.tenantId, summaryAllTenantsUsageStatistics.tenantId) &&
        Objects.equals(this.totalResourceCreateAndUpdateCount,
            summaryAllTenantsUsageStatistics.totalResourceCreateAndUpdateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmsCreatedCount, alarmsUpdatedCount, creationTime, deviceCount, deviceEndpointCount,
        deviceRequestCount, deviceWithChildrenCount, externalReference, eventsCreatedCount, eventsUpdatedCount,
        inventoriesCreatedCount, inventoriesUpdatedCount, measurementsCreatedCount, parentTenantId, peakDeviceCount,
        peakDeviceWithChildrenCount, peakStorageSize, requestCount, resources, storageSize, subscribedApplications,
        tenantCompany, tenantCustomProperties, tenantDomain, tenantId, totalResourceCreateAndUpdateCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryAllTenantsUsageStatistics {\n");
    sb.append("    alarmsCreatedCount: ").append(toIndentedString(alarmsCreatedCount)).append("\n");
    sb.append("    alarmsUpdatedCount: ").append(toIndentedString(alarmsUpdatedCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    deviceEndpointCount: ").append(toIndentedString(deviceEndpointCount)).append("\n");
    sb.append("    deviceRequestCount: ").append(toIndentedString(deviceRequestCount)).append("\n");
    sb.append("    deviceWithChildrenCount: ").append(toIndentedString(deviceWithChildrenCount)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    eventsCreatedCount: ").append(toIndentedString(eventsCreatedCount)).append("\n");
    sb.append("    eventsUpdatedCount: ").append(toIndentedString(eventsUpdatedCount)).append("\n");
    sb.append("    inventoriesCreatedCount: ").append(toIndentedString(inventoriesCreatedCount)).append("\n");
    sb.append("    inventoriesUpdatedCount: ").append(toIndentedString(inventoriesUpdatedCount)).append("\n");
    sb.append("    measurementsCreatedCount: ").append(toIndentedString(measurementsCreatedCount)).append("\n");
    sb.append("    parentTenantId: ").append(toIndentedString(parentTenantId)).append("\n");
    sb.append("    peakDeviceCount: ").append(toIndentedString(peakDeviceCount)).append("\n");
    sb.append("    peakDeviceWithChildrenCount: ").append(toIndentedString(peakDeviceWithChildrenCount)).append("\n");
    sb.append("    peakStorageSize: ").append(toIndentedString(peakStorageSize)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    subscribedApplications: ").append(toIndentedString(subscribedApplications)).append("\n");
    sb.append("    tenantCompany: ").append(toIndentedString(tenantCompany)).append("\n");
    sb.append("    tenantCustomProperties: ").append(toIndentedString(tenantCustomProperties)).append("\n");
    sb.append("    tenantDomain: ").append(toIndentedString(tenantDomain)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
