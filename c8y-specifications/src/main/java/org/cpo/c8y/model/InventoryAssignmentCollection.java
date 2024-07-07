package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * InventoryAssignmentCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryAssignmentCollection {

  private URI self;

  private List<InventoryAssignment> inventoryAssignments = new ArrayList<>();

  public InventoryAssignmentCollection self(URI self) {
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

  public InventoryAssignmentCollection inventoryAssignments(List<InventoryAssignment> inventoryAssignments) {
    this.inventoryAssignments = inventoryAssignments;
    return this;
  }

  public InventoryAssignmentCollection addInventoryAssignmentsItem(InventoryAssignment inventoryAssignmentsItem) {
    if (this.inventoryAssignments == null) {
      this.inventoryAssignments = new ArrayList<>();
    }
    this.inventoryAssignments.add(inventoryAssignmentsItem);
    return this;
  }

  /**
   * An array of inventory assignments.
   * 
   * @return inventoryAssignments
   */

  @JsonProperty("inventoryAssignments")
  public List<InventoryAssignment> getInventoryAssignments() {
    return inventoryAssignments;
  }

  public void setInventoryAssignments(List<InventoryAssignment> inventoryAssignments) {
    this.inventoryAssignments = inventoryAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAssignmentCollection inventoryAssignmentCollection = (InventoryAssignmentCollection) o;
    return Objects.equals(this.self, inventoryAssignmentCollection.self) &&
        Objects.equals(this.inventoryAssignments, inventoryAssignmentCollection.inventoryAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, inventoryAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAssignmentCollection {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    inventoryAssignments: ").append(toIndentedString(inventoryAssignments)).append("\n");
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
