package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * OperationReference
 */

@JsonTypeName("operationReference")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class OperationReference {

  private OperationReferenceOperation operation;

  private URI self;

  public OperationReference operation(OperationReferenceOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * 
   * @return operation
   */

  @JsonProperty("operation")
  public OperationReferenceOperation getOperation() {
    return operation;
  }

  public void setOperation(OperationReferenceOperation operation) {
    this.operation = operation;
  }

  public OperationReference self(URI self) {
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
    OperationReference operationReference = (OperationReference) o;
    return Objects.equals(this.operation, operationReference.operation) &&
        Objects.equals(this.self, operationReference.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationReference {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
