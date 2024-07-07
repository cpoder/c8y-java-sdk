package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ManagedObjectReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ManagedObjectReference {

  private ManagedObject managedObject;

  private URI self;

  public ManagedObjectReference managedObject(ManagedObject managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * Get managedObject
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public ManagedObject getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(ManagedObject managedObject) {
    this.managedObject = managedObject;
  }

  public ManagedObjectReference self(URI self) {
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
    ManagedObjectReference managedObjectReference = (ManagedObjectReference) o;
    return Objects.equals(this.managedObject, managedObjectReference.managedObject) &&
        Objects.equals(this.self, managedObjectReference.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObject, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedObjectReference {\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
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
