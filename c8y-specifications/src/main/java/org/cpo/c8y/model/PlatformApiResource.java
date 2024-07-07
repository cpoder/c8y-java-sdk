package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * PlatformApiResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PlatformApiResource {

  private URI self;

  private AlarmsApiResource alarm;

  private AuditApiResource audit;

  private DeviceControlApiResource deviceControl;

  private EventsApiResource event;

  private IdentityApiResource identity;

  private InventoryApiResource inventory;

  private MeasurementApiResource measurement;

  private TenantApiResource tenant;

  private UserApiResource user;

  public PlatformApiResource self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * 
   * @return self
   */

  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public PlatformApiResource alarm(AlarmsApiResource alarm) {
    this.alarm = alarm;
    return this;
  }

  /**
   * Get alarm
   * 
   * @return alarm
   */

  @JsonProperty("alarm")
  public AlarmsApiResource getAlarm() {
    return alarm;
  }

  public void setAlarm(AlarmsApiResource alarm) {
    this.alarm = alarm;
  }

  public PlatformApiResource audit(AuditApiResource audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * 
   * @return audit
   */

  @JsonProperty("audit")
  public AuditApiResource getAudit() {
    return audit;
  }

  public void setAudit(AuditApiResource audit) {
    this.audit = audit;
  }

  public PlatformApiResource deviceControl(DeviceControlApiResource deviceControl) {
    this.deviceControl = deviceControl;
    return this;
  }

  /**
   * Get deviceControl
   * 
   * @return deviceControl
   */

  @JsonProperty("deviceControl")
  public DeviceControlApiResource getDeviceControl() {
    return deviceControl;
  }

  public void setDeviceControl(DeviceControlApiResource deviceControl) {
    this.deviceControl = deviceControl;
  }

  public PlatformApiResource event(EventsApiResource event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * 
   * @return event
   */

  @JsonProperty("event")
  public EventsApiResource getEvent() {
    return event;
  }

  public void setEvent(EventsApiResource event) {
    this.event = event;
  }

  public PlatformApiResource identity(IdentityApiResource identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * 
   * @return identity
   */

  @JsonProperty("identity")
  public IdentityApiResource getIdentity() {
    return identity;
  }

  public void setIdentity(IdentityApiResource identity) {
    this.identity = identity;
  }

  public PlatformApiResource inventory(InventoryApiResource inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * 
   * @return inventory
   */

  @JsonProperty("inventory")
  public InventoryApiResource getInventory() {
    return inventory;
  }

  public void setInventory(InventoryApiResource inventory) {
    this.inventory = inventory;
  }

  public PlatformApiResource measurement(MeasurementApiResource measurement) {
    this.measurement = measurement;
    return this;
  }

  /**
   * Get measurement
   * 
   * @return measurement
   */

  @JsonProperty("measurement")
  public MeasurementApiResource getMeasurement() {
    return measurement;
  }

  public void setMeasurement(MeasurementApiResource measurement) {
    this.measurement = measurement;
  }

  public PlatformApiResource tenant(TenantApiResource tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * 
   * @return tenant
   */

  @JsonProperty("tenant")
  public TenantApiResource getTenant() {
    return tenant;
  }

  public void setTenant(TenantApiResource tenant) {
    this.tenant = tenant;
  }

  public PlatformApiResource user(UserApiResource user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * 
   * @return user
   */

  @JsonProperty("user")
  public UserApiResource getUser() {
    return user;
  }

  public void setUser(UserApiResource user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformApiResource platformApiResource = (PlatformApiResource) o;
    return Objects.equals(this.self, platformApiResource.self) &&
        Objects.equals(this.alarm, platformApiResource.alarm) &&
        Objects.equals(this.audit, platformApiResource.audit) &&
        Objects.equals(this.deviceControl, platformApiResource.deviceControl) &&
        Objects.equals(this.event, platformApiResource.event) &&
        Objects.equals(this.identity, platformApiResource.identity) &&
        Objects.equals(this.inventory, platformApiResource.inventory) &&
        Objects.equals(this.measurement, platformApiResource.measurement) &&
        Objects.equals(this.tenant, platformApiResource.tenant) &&
        Objects.equals(this.user, platformApiResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, alarm, audit, deviceControl, event, identity, inventory, measurement, tenant, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformApiResource {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    deviceControl: ").append(toIndentedString(deviceControl)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
