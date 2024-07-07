package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A collection of references to child assets.
 */

@JsonTypeName("objectChildAssets")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ObjectChildAssets {

  private Integer count;

  private List<ManagedObjectReferenceTuple> references = new ArrayList<>();

  private String self;

  public ObjectChildAssets count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of child assets. Only present if the value is greater than
   * 0.
   * 
   * @return count
   */

  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ObjectChildAssets references(List<ManagedObjectReferenceTuple> references) {
    this.references = references;
    return this;
  }

  public ObjectChildAssets addReferencesItem(ManagedObjectReferenceTuple referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array with the references to child assets.
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

  public ObjectChildAssets self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to this resource's child assets.
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
    ObjectChildAssets objectChildAssets = (ObjectChildAssets) o;
    return Objects.equals(this.count, objectChildAssets.count) &&
        Objects.equals(this.references, objectChildAssets.references) &&
        Objects.equals(this.self, objectChildAssets.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, references, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectChildAssets {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
