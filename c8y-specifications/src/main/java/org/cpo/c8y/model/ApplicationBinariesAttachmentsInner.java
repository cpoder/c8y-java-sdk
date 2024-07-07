package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ApplicationBinariesAttachmentsInner
 */

@JsonTypeName("ApplicationBinaries_attachments_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationBinariesAttachmentsInner {

  private String contextPath;

  private OffsetDateTime created;

  private String description;

  private String downloadUrl;

  private String id;

  private Integer length;

  private String name;

  public ApplicationBinariesAttachmentsInner contextPath(String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * The application context path.
   * 
   * @return contextPath
   */

  @JsonProperty("contextPath")
  public String getContextPath() {
    return contextPath;
  }

  public void setContextPath(String contextPath) {
    this.contextPath = contextPath;
  }

  public ApplicationBinariesAttachmentsInner created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date and time when the attachment was created.
   * 
   * @return created
   */

  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ApplicationBinariesAttachmentsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the attachment.
   * 
   * @return description
   */

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationBinariesAttachmentsInner downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * A download URL for the attachment.
   * 
   * @return downloadUrl
   */

  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public ApplicationBinariesAttachmentsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the attachment.
   * 
   * @return id
   */

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationBinariesAttachmentsInner length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * The length of the attachment, in bytes.
   * 
   * @return length
   */

  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public ApplicationBinariesAttachmentsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the attachment.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationBinariesAttachmentsInner applicationBinariesAttachmentsInner = (ApplicationBinariesAttachmentsInner) o;
    return Objects.equals(this.contextPath, applicationBinariesAttachmentsInner.contextPath) &&
        Objects.equals(this.created, applicationBinariesAttachmentsInner.created) &&
        Objects.equals(this.description, applicationBinariesAttachmentsInner.description) &&
        Objects.equals(this.downloadUrl, applicationBinariesAttachmentsInner.downloadUrl) &&
        Objects.equals(this.id, applicationBinariesAttachmentsInner.id) &&
        Objects.equals(this.length, applicationBinariesAttachmentsInner.length) &&
        Objects.equals(this.name, applicationBinariesAttachmentsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextPath, created, description, downloadUrl, id, length, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationBinariesAttachmentsInner {\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
