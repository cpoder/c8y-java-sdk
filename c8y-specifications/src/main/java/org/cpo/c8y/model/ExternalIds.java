package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ExternalIds
 */

@JsonTypeName("externalIds")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ExternalIds {

  private List<ExternalId> externalIds = new ArrayList<>();

  private URI self;

  public ExternalIds externalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public ExternalIds addExternalIdsItem(ExternalId externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new ArrayList<>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

  /**
   * An array containing the details of all external IDs (if any).
   * 
   * @return externalIds
   */

  @JsonProperty("externalIds")
  public List<ExternalId> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
  }

  public ExternalIds self(URI self) {
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
    ExternalIds externalIds = (ExternalIds) o;
    return Objects.equals(this.externalIds, externalIds.externalIds) &&
        Objects.equals(this.self, externalIds.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIds {\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
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
