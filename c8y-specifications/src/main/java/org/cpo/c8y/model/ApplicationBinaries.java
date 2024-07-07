package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * ApplicationBinaries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationBinaries {

  private List<ApplicationBinariesAttachmentsInner> attachments = new ArrayList<>();

  public ApplicationBinaries attachments(List<ApplicationBinariesAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ApplicationBinaries addAttachmentsItem(ApplicationBinariesAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * An array of attachments.
   * 
   * @return attachments
   */

  @JsonProperty("attachments")
  public List<ApplicationBinariesAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<ApplicationBinariesAttachmentsInner> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationBinaries applicationBinaries = (ApplicationBinaries) o;
    return Objects.equals(this.attachments, applicationBinaries.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationBinaries {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
