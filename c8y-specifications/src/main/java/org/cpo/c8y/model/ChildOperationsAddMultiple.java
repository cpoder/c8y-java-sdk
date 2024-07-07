package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * ChildOperationsAddMultiple
 */

@JsonTypeName("childOperationsAddMultiple")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ChildOperationsAddMultiple {

  private List<ChildOperationsAddMultipleReferencesInner> references = new ArrayList<>();

  public ChildOperationsAddMultiple() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChildOperationsAddMultiple(List<ChildOperationsAddMultipleReferencesInner> references) {
    this.references = references;
  }

  public ChildOperationsAddMultiple references(List<ChildOperationsAddMultipleReferencesInner> references) {
    this.references = references;
    return this;
  }

  public ChildOperationsAddMultiple addReferencesItem(ChildOperationsAddMultipleReferencesInner referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array containing the IDs of the managed objects (children).
   * 
   * @return references
   */
  @NotNull

  @JsonProperty("references")
  public List<ChildOperationsAddMultipleReferencesInner> getReferences() {
    return references;
  }

  public void setReferences(List<ChildOperationsAddMultipleReferencesInner> references) {
    this.references = references;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildOperationsAddMultiple childOperationsAddMultiple = (ChildOperationsAddMultiple) o;
    return Objects.equals(this.references, childOperationsAddMultiple.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildOperationsAddMultiple {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
