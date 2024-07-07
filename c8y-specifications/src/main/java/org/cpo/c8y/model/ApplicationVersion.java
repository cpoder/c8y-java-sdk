package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ApplicationVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationVersion {

  private String version;

  private String binaryId;

  private List<String> tag = new ArrayList<>();

  public ApplicationVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Unique identifier of the version.
   * 
   * @return version
   */

  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ApplicationVersion binaryId(String binaryId) {
    this.binaryId = binaryId;
    return this;
  }

  /**
   * Unique identifier of the binary file assigned to the version.
   * 
   * @return binaryId
   */

  @JsonProperty("binaryId")
  public String getBinaryId() {
    return binaryId;
  }

  public void setBinaryId(String binaryId) {
    this.binaryId = binaryId;
  }

  public ApplicationVersion tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public ApplicationVersion addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * Tag assigned to the version. Version tags must be unique across all versions
   * and version fields of application versions.
   * 
   * @return tag
   */

  @JsonProperty("tag")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVersion applicationVersion = (ApplicationVersion) o;
    return Objects.equals(this.version, applicationVersion.version) &&
        Objects.equals(this.binaryId, applicationVersion.binaryId) &&
        Objects.equals(this.tag, applicationVersion.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, binaryId, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVersion {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    binaryId: ").append(toIndentedString(binaryId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
