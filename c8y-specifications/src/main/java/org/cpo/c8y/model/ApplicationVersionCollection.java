package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ApplicationVersionCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationVersionCollection {

  private List<ApplicationVersion> versions = new ArrayList<>();

  public ApplicationVersionCollection versions(List<ApplicationVersion> versions) {
    this.versions = versions;
    return this;
  }

  public ApplicationVersionCollection addVersionsItem(ApplicationVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * An array of application versions.
   * 
   * @return versions
   */

  @JsonProperty("versions")
  public List<ApplicationVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<ApplicationVersion> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVersionCollection applicationVersionCollection = (ApplicationVersionCollection) o;
    return Objects.equals(this.versions, applicationVersionCollection.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVersionCollection {\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
