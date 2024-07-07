package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of all managed objects
 */

@JsonTypeName("inventoryApiResource_managedObjects")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryApiResourceManagedObjects {

  private List<ManagedObject> references = new ArrayList<>();

  private URI self;

  public InventoryApiResourceManagedObjects references(List<ManagedObject> references) {
    this.references = references;
    return this;
  }

  public InventoryApiResourceManagedObjects addReferencesItem(ManagedObject referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array containing the referenced managed objects.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<ManagedObject> getReferences() {
    return references;
  }

  public void setReferences(List<ManagedObject> references) {
    this.references = references;
  }

  public InventoryApiResourceManagedObjects self(URI self) {
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
    InventoryApiResourceManagedObjects inventoryApiResourceManagedObjects = (InventoryApiResourceManagedObjects) o;
    return Objects.equals(this.references, inventoryApiResourceManagedObjects.references) &&
        Objects.equals(this.self, inventoryApiResourceManagedObjects.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiResourceManagedObjects {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
