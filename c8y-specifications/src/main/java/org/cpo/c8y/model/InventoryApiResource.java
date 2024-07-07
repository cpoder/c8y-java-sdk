package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * InventoryApiResource
 */

@JsonTypeName("inventoryApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryApiResource {

  private String managedObjectsForFragmentType;

  private String managedObjectsForType;

  private String managedObjectsForListOfIds;

  private InventoryApiResourceManagedObjects managedObjects;

  private URI self;

  public InventoryApiResource managedObjectsForFragmentType(String managedObjectsForFragmentType) {
    this.managedObjectsForFragmentType = managedObjectsForFragmentType;
    return this;
  }

  /**
   * Read-only collection of all managed objects with a particular fragment type
   * or capability (placeholder {fragmentType}).
   * 
   * @return managedObjectsForFragmentType
   */

  @JsonProperty("managedObjectsForFragmentType")
  public String getManagedObjectsForFragmentType() {
    return managedObjectsForFragmentType;
  }

  public void setManagedObjectsForFragmentType(String managedObjectsForFragmentType) {
    this.managedObjectsForFragmentType = managedObjectsForFragmentType;
  }

  public InventoryApiResource managedObjectsForType(String managedObjectsForType) {
    this.managedObjectsForType = managedObjectsForType;
    return this;
  }

  /**
   * Read-only collection of all managed objects of a particular type (placeholder
   * {type}).
   * 
   * @return managedObjectsForType
   */

  @JsonProperty("managedObjectsForType")
  public String getManagedObjectsForType() {
    return managedObjectsForType;
  }

  public void setManagedObjectsForType(String managedObjectsForType) {
    this.managedObjectsForType = managedObjectsForType;
  }

  public InventoryApiResource managedObjectsForListOfIds(String managedObjectsForListOfIds) {
    this.managedObjectsForListOfIds = managedObjectsForListOfIds;
    return this;
  }

  /**
   * Read-only collection of managed objects fetched for a given list of ids, for
   * example, “ids=41,43,68”.
   * 
   * @return managedObjectsForListOfIds
   */

  @JsonProperty("managedObjectsForListOfIds")
  public String getManagedObjectsForListOfIds() {
    return managedObjectsForListOfIds;
  }

  public void setManagedObjectsForListOfIds(String managedObjectsForListOfIds) {
    this.managedObjectsForListOfIds = managedObjectsForListOfIds;
  }

  public InventoryApiResource managedObjects(InventoryApiResourceManagedObjects managedObjects) {
    this.managedObjects = managedObjects;
    return this;
  }

  /**
   * Get managedObjects
   * 
   * @return managedObjects
   */

  @JsonProperty("managedObjects")
  public InventoryApiResourceManagedObjects getManagedObjects() {
    return managedObjects;
  }

  public void setManagedObjects(InventoryApiResourceManagedObjects managedObjects) {
    this.managedObjects = managedObjects;
  }

  public InventoryApiResource self(URI self) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryApiResource inventoryApiResource = (InventoryApiResource) o;
    return Objects.equals(this.managedObjectsForFragmentType, inventoryApiResource.managedObjectsForFragmentType) &&
        Objects.equals(this.managedObjectsForType, inventoryApiResource.managedObjectsForType) &&
        Objects.equals(this.managedObjectsForListOfIds, inventoryApiResource.managedObjectsForListOfIds) &&
        Objects.equals(this.managedObjects, inventoryApiResource.managedObjects) &&
        Objects.equals(this.self, inventoryApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObjectsForFragmentType, managedObjectsForType, managedObjectsForListOfIds,
        managedObjects, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiResource {\n");
    sb.append("    managedObjectsForFragmentType: ").append(toIndentedString(managedObjectsForFragmentType))
        .append("\n");
    sb.append("    managedObjectsForType: ").append(toIndentedString(managedObjectsForType)).append("\n");
    sb.append("    managedObjectsForListOfIds: ").append(toIndentedString(managedObjectsForListOfIds)).append("\n");
    sb.append("    managedObjects: ").append(toIndentedString(managedObjects)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
