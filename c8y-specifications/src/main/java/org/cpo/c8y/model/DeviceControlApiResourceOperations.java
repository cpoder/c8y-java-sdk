package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of all operations.
 */

@JsonTypeName("deviceControlApiResource_operations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class DeviceControlApiResourceOperations {

  private URI self;

  private JsonNullable<List<OperationReference>> operations = JsonNullable.<List<OperationReference>>undefined();

  public DeviceControlApiResourceOperations self(URI self) {
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

  public DeviceControlApiResourceOperations operations(List<OperationReference> operations) {
    this.operations = JsonNullable.of(operations);
    return this;
  }

  public DeviceControlApiResourceOperations addOperationsItem(OperationReference operationsItem) {
    if (this.operations == null || !this.operations.isPresent()) {
      this.operations = JsonNullable.of(new ArrayList<>());
    }
    this.operations.get().add(operationsItem);
    return this;
  }

  /**
   * An array containing the registered operations.
   * 
   * @return operations
   */

  @JsonProperty("operations")
  public JsonNullable<List<OperationReference>> getOperations() {
    return operations;
  }

  public void setOperations(JsonNullable<List<OperationReference>> operations) {
    this.operations = operations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceControlApiResourceOperations deviceControlApiResourceOperations = (DeviceControlApiResourceOperations) o;
    return Objects.equals(this.self, deviceControlApiResourceOperations.self) &&
        equalsNullable(this.operations, deviceControlApiResourceOperations.operations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(operations));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceControlApiResourceOperations {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
