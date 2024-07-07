package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * ChildOperationsAddOneManagedObject
 */

@JsonTypeName("childOperationsAddOne_managedObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ChildOperationsAddOneManagedObject {

  private String id;

  public ChildOperationsAddOneManagedObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChildOperationsAddOneManagedObject(String id) {
    this.id = id;
  }

  public ChildOperationsAddOneManagedObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the object.
   * 
   * @return id
   */
  @NotNull

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildOperationsAddOneManagedObject childOperationsAddOneManagedObject = (ChildOperationsAddOneManagedObject) o;
    return Objects.equals(this.id, childOperationsAddOneManagedObject.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildOperationsAddOneManagedObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
