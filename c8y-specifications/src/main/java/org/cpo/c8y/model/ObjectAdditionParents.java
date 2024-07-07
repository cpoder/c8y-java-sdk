package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A collection of references to addition parent objects.
 */

@JsonTypeName("objectAdditionParents")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ObjectAdditionParents {

  private List<ManagedObjectReferenceTuple> references = new ArrayList<>();

  private String self;

  public ObjectAdditionParents references(List<ManagedObjectReferenceTuple> references) {
    this.references = references;
    return this;
  }

  public ObjectAdditionParents addReferencesItem(ManagedObjectReferenceTuple referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array with the references to addition parent objects.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<ManagedObjectReferenceTuple> getReferences() {
    return references;
  }

  public void setReferences(List<ManagedObjectReferenceTuple> references) {
    this.references = references;
  }

  public ObjectAdditionParents self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to this resource's addition parent objects.
   * 
   * @return self
   */

  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
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
    ObjectAdditionParents objectAdditionParents = (ObjectAdditionParents) o;
    return Objects.equals(this.references, objectAdditionParents.references) &&
        Objects.equals(this.self, objectAdditionParents.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectAdditionParents {\n");
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
