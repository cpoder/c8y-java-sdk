package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ManagedObject
 */

@JsonTypeName("managedObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ManagedObject {

  private OffsetDateTime creationTime;

  private String id;

  private OffsetDateTime lastUpdated;

  private String name;

  private String owner;

  private URI self;

  private String type;

  private ObjectChildAdditions childAdditions;

  private ObjectChildAssets childAssets;

  private ObjectChildDevices childDevices;

  private ObjectAdditionParents additionParents;

  private ObjectAssetParents assetParents;

  private ObjectDeviceParents deviceParents;

  private Object c8yIsDevice;

  private Map<String, Map<String, LatestMeasurementValue>> c8yLatestMeasurements = new HashMap<>();

  private Object c8yIsDeviceGroup;

  private List<String> c8yDeviceTypes = new ArrayList<>();

  private List<String> c8ySupportedOperations = new ArrayList<>();

  public ManagedObject creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the object was created.
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

  public ManagedObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the object.
   * 
   * @return id
   */

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ManagedObject lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time when the object was updated for the last time.
   * 
   * @return lastUpdated
   */

  @JsonProperty("lastUpdated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ManagedObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name that is used for representing the object in user
   * interfaces.
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

  public ManagedObject owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Username of the device's owner.
   * 
   * @return owner
   */

  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ManagedObject self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
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

  public ManagedObject type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The fragment type can be interpreted as _device class_, this means, devices
   * with the same type can receive the same types of configuration, software,
   * firmware and operations. The type value is indexed and is therefore used for
   * queries.
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

  public ManagedObject childAdditions(ObjectChildAdditions childAdditions) {
    this.childAdditions = childAdditions;
    return this;
  }

  /**
   * Get childAdditions
   * 
   * @return childAdditions
   */

  @JsonProperty("childAdditions")
  public ObjectChildAdditions getChildAdditions() {
    return childAdditions;
  }

  public void setChildAdditions(ObjectChildAdditions childAdditions) {
    this.childAdditions = childAdditions;
  }

  public ManagedObject childAssets(ObjectChildAssets childAssets) {
    this.childAssets = childAssets;
    return this;
  }

  /**
   * Get childAssets
   * 
   * @return childAssets
   */

  @JsonProperty("childAssets")
  public ObjectChildAssets getChildAssets() {
    return childAssets;
  }

  public void setChildAssets(ObjectChildAssets childAssets) {
    this.childAssets = childAssets;
  }

  public ManagedObject childDevices(ObjectChildDevices childDevices) {
    this.childDevices = childDevices;
    return this;
  }

  /**
   * Get childDevices
   * 
   * @return childDevices
   */

  @JsonProperty("childDevices")
  public ObjectChildDevices getChildDevices() {
    return childDevices;
  }

  public void setChildDevices(ObjectChildDevices childDevices) {
    this.childDevices = childDevices;
  }

  public ManagedObject additionParents(ObjectAdditionParents additionParents) {
    this.additionParents = additionParents;
    return this;
  }

  /**
   * Get additionParents
   * 
   * @return additionParents
   */

  @JsonProperty("additionParents")
  public ObjectAdditionParents getAdditionParents() {
    return additionParents;
  }

  public void setAdditionParents(ObjectAdditionParents additionParents) {
    this.additionParents = additionParents;
  }

  public ManagedObject assetParents(ObjectAssetParents assetParents) {
    this.assetParents = assetParents;
    return this;
  }

  /**
   * Get assetParents
   * 
   * @return assetParents
   */

  @JsonProperty("assetParents")
  public ObjectAssetParents getAssetParents() {
    return assetParents;
  }

  public void setAssetParents(ObjectAssetParents assetParents) {
    this.assetParents = assetParents;
  }

  public ManagedObject deviceParents(ObjectDeviceParents deviceParents) {
    this.deviceParents = deviceParents;
    return this;
  }

  /**
   * Get deviceParents
   * 
   * @return deviceParents
   */

  @JsonProperty("deviceParents")
  public ObjectDeviceParents getDeviceParents() {
    return deviceParents;
  }

  public void setDeviceParents(ObjectDeviceParents deviceParents) {
    this.deviceParents = deviceParents;
  }

  public ManagedObject c8yIsDevice(Object c8yIsDevice) {
    this.c8yIsDevice = c8yIsDevice;
    return this;
  }

  /**
   * A fragment which identifies this managed object as a device.
   * 
   * @return c8yIsDevice
   */

  @JsonProperty("c8y_IsDevice")
  public Object getC8yIsDevice() {
    return c8yIsDevice;
  }

  public void setC8yIsDevice(Object c8yIsDevice) {
    this.c8yIsDevice = c8yIsDevice;
  }

  public ManagedObject c8yLatestMeasurements(Map<String, Map<String, LatestMeasurementValue>> c8yLatestMeasurements) {
    this.c8yLatestMeasurements = c8yLatestMeasurements;
    return this;
  }

  public ManagedObject putC8yLatestMeasurementsItem(String key,
      Map<String, LatestMeasurementValue> c8yLatestMeasurementsItem) {
    if (this.c8yLatestMeasurements == null) {
      this.c8yLatestMeasurements = new HashMap<>();
    }
    this.c8yLatestMeasurements.put(key, c8yLatestMeasurementsItem);
    return this;
  }

  /**
   * The read only fragment which contains the latest measurements reported by the
   * device. The returned optionally only if the query parameter
   * `withLatestValues=true` is used. > **⚠️ Feature Preview:** The feature is
   * part of the Latest Measurement feature which is still under public feature
   * preview.
   * 
   * @return c8yLatestMeasurements
   */

  @JsonProperty("c8y_LatestMeasurements")
  public Map<String, Map<String, LatestMeasurementValue>> getC8yLatestMeasurements() {
    return c8yLatestMeasurements;
  }

  public void setC8yLatestMeasurements(Map<String, Map<String, LatestMeasurementValue>> c8yLatestMeasurements) {
    this.c8yLatestMeasurements = c8yLatestMeasurements;
  }

  public ManagedObject c8yIsDeviceGroup(Object c8yIsDeviceGroup) {
    this.c8yIsDeviceGroup = c8yIsDeviceGroup;
    return this;
  }

  /**
   * A fragment which identifies this managed object as a device group.
   * 
   * @return c8yIsDeviceGroup
   */

  @JsonProperty("c8y_IsDeviceGroup")
  public Object getC8yIsDeviceGroup() {
    return c8yIsDeviceGroup;
  }

  public void setC8yIsDeviceGroup(Object c8yIsDeviceGroup) {
    this.c8yIsDeviceGroup = c8yIsDeviceGroup;
  }

  public ManagedObject c8yDeviceTypes(List<String> c8yDeviceTypes) {
    this.c8yDeviceTypes = c8yDeviceTypes;
    return this;
  }

  public ManagedObject addC8yDeviceTypesItem(String c8yDeviceTypesItem) {
    if (this.c8yDeviceTypes == null) {
      this.c8yDeviceTypes = new ArrayList<>();
    }
    this.c8yDeviceTypes.add(c8yDeviceTypesItem);
    return this;
  }

  /**
   * This fragment must be added in order to publish sample commands for a subset
   * of devices sharing the same device type. If the fragment is present, the list
   * of sample commands for a device type will be extended with the sample
   * commands for the `c8y_DeviceTypes`. New sample commands created from the user
   * interface will be created in the context of the `c8y_DeviceTypes`.
   * 
   * @return c8yDeviceTypes
   */

  @JsonProperty("c8y_DeviceTypes")
  public List<String> getC8yDeviceTypes() {
    return c8yDeviceTypes;
  }

  public void setC8yDeviceTypes(List<String> c8yDeviceTypes) {
    this.c8yDeviceTypes = c8yDeviceTypes;
  }

  public ManagedObject c8ySupportedOperations(List<String> c8ySupportedOperations) {
    this.c8ySupportedOperations = c8ySupportedOperations;
    return this;
  }

  public ManagedObject addC8ySupportedOperationsItem(String c8ySupportedOperationsItem) {
    if (this.c8ySupportedOperations == null) {
      this.c8ySupportedOperations = new ArrayList<>();
    }
    this.c8ySupportedOperations.add(c8ySupportedOperationsItem);
    return this;
  }

  /**
   * Lists the operations that are available for a particular device, so that
   * applications can trigger the operations.
   * 
   * @return c8ySupportedOperations
   */

  @JsonProperty("c8y_SupportedOperations")
  public List<String> getC8ySupportedOperations() {
    return c8ySupportedOperations;
  }

  public void setC8ySupportedOperations(List<String> c8ySupportedOperations) {
    this.c8ySupportedOperations = c8ySupportedOperations;
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
  public ManagedObject putAdditionalProperty(String key, Object value) {
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
    ManagedObject managedObject = (ManagedObject) o;
    return Objects.equals(this.creationTime, managedObject.creationTime) &&
        Objects.equals(this.id, managedObject.id) &&
        Objects.equals(this.lastUpdated, managedObject.lastUpdated) &&
        Objects.equals(this.name, managedObject.name) &&
        Objects.equals(this.owner, managedObject.owner) &&
        Objects.equals(this.self, managedObject.self) &&
        Objects.equals(this.type, managedObject.type) &&
        Objects.equals(this.childAdditions, managedObject.childAdditions) &&
        Objects.equals(this.childAssets, managedObject.childAssets) &&
        Objects.equals(this.childDevices, managedObject.childDevices) &&
        Objects.equals(this.additionParents, managedObject.additionParents) &&
        Objects.equals(this.assetParents, managedObject.assetParents) &&
        Objects.equals(this.deviceParents, managedObject.deviceParents) &&
        Objects.equals(this.c8yIsDevice, managedObject.c8yIsDevice) &&
        Objects.equals(this.c8yLatestMeasurements, managedObject.c8yLatestMeasurements) &&
        Objects.equals(this.c8yIsDeviceGroup, managedObject.c8yIsDeviceGroup) &&
        Objects.equals(this.c8yDeviceTypes, managedObject.c8yDeviceTypes) &&
        Objects.equals(this.c8ySupportedOperations, managedObject.c8ySupportedOperations) &&
        Objects.equals(this.additionalProperties, managedObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, id, lastUpdated, name, owner, self, type, childAdditions, childAssets,
        childDevices, additionParents, assetParents, deviceParents, c8yIsDevice, c8yLatestMeasurements,
        c8yIsDeviceGroup, c8yDeviceTypes, c8ySupportedOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedObject {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    childAdditions: ").append(toIndentedString(childAdditions)).append("\n");
    sb.append("    childAssets: ").append(toIndentedString(childAssets)).append("\n");
    sb.append("    childDevices: ").append(toIndentedString(childDevices)).append("\n");
    sb.append("    additionParents: ").append(toIndentedString(additionParents)).append("\n");
    sb.append("    assetParents: ").append(toIndentedString(assetParents)).append("\n");
    sb.append("    deviceParents: ").append(toIndentedString(deviceParents)).append("\n");
    sb.append("    c8yIsDevice: ").append(toIndentedString(c8yIsDevice)).append("\n");
    sb.append("    c8yLatestMeasurements: ").append(toIndentedString(c8yLatestMeasurements)).append("\n");
    sb.append("    c8yIsDeviceGroup: ").append(toIndentedString(c8yIsDeviceGroup)).append("\n");
    sb.append("    c8yDeviceTypes: ").append(toIndentedString(c8yDeviceTypes)).append("\n");
    sb.append("    c8ySupportedOperations: ").append(toIndentedString(c8ySupportedOperations)).append("\n");

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
