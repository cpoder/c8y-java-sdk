package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ManagedObjectReferenceTuple
 */

@JsonTypeName("managedObjectReferenceTuple")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ManagedObjectReferenceTuple {

  private ManagedObjectReferenceTupleManagedObject managedObject;

  private URI self;

  public ManagedObjectReferenceTuple managedObject(ManagedObjectReferenceTupleManagedObject managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * Get managedObject
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public ManagedObjectReferenceTupleManagedObject getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(ManagedObjectReferenceTupleManagedObject managedObject) {
    this.managedObject = managedObject;
  }

  public ManagedObjectReferenceTuple self(URI self) {
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
    ManagedObjectReferenceTuple managedObjectReferenceTuple = (ManagedObjectReferenceTuple) o;
    return Objects.equals(this.managedObject, managedObjectReferenceTuple.managedObject) &&
        Objects.equals(this.self, managedObjectReferenceTuple.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObject, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedObjectReferenceTuple {\n");
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
