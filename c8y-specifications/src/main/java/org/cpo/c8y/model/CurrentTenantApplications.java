package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of the subscribed applications.
 */

@JsonTypeName("CurrentTenant_applications")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentTenantApplications {

  private List<Application> references = new ArrayList<>();

  public CurrentTenantApplications references(List<Application> references) {
    this.references = references;
    return this;
  }

  public CurrentTenantApplications addReferencesItem(Application referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array containing all subscribed applications.
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<Application> getReferences() {
    return references;
  }

  public void setReferences(List<Application> references) {
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
    CurrentTenantApplications currentTenantApplications = (CurrentTenantApplications) o;
    return Objects.equals(this.references, currentTenantApplications.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentTenantApplications {\n");
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
