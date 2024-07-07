package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ChildOperationsAddMultipleReferencesInner
 */

@JsonTypeName("childOperationsAddMultiple_references_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ChildOperationsAddMultipleReferencesInner {

  private ChildOperationsAddMultipleReferencesInnerManagedObject managedObject;

  public ChildOperationsAddMultipleReferencesInner managedObject(
      ChildOperationsAddMultipleReferencesInnerManagedObject managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * Get managedObject
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public ChildOperationsAddMultipleReferencesInnerManagedObject getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(ChildOperationsAddMultipleReferencesInnerManagedObject managedObject) {
    this.managedObject = managedObject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildOperationsAddMultipleReferencesInner childOperationsAddMultipleReferencesInner = (ChildOperationsAddMultipleReferencesInner) o;
    return Objects.equals(this.managedObject, childOperationsAddMultipleReferencesInner.managedObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildOperationsAddMultipleReferencesInner {\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
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
