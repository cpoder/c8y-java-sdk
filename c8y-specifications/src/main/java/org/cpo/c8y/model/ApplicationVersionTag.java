package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * ApplicationVersionTag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationVersionTag {

  private List<String> tag = new ArrayList<>();

  public ApplicationVersionTag() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicationVersionTag(List<String> tag) {
    this.tag = tag;
  }

  public ApplicationVersionTag tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public ApplicationVersionTag addTagItem(String tagItem) {
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
  @NotNull

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
    ApplicationVersionTag applicationVersionTag = (ApplicationVersionTag) o;
    return Objects.equals(this.tag, applicationVersionTag.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVersionTag {\n");
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
