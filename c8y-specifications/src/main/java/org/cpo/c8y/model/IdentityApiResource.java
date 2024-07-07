package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * IdentityApiResource
 */

@JsonTypeName("identityApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class IdentityApiResource {

  private URI externalId;

  private URI externalIdsOfGlobalId;

  private URI self;

  public IdentityApiResource externalId(URI externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Single external ID, represented by the type and the value of the external ID.
   * 
   * @return externalId
   */

  @JsonProperty("externalId")
  public URI getExternalId() {
    return externalId;
  }

  public void setExternalId(URI externalId) {
    this.externalId = externalId;
  }

  public IdentityApiResource externalIdsOfGlobalId(URI externalIdsOfGlobalId) {
    this.externalIdsOfGlobalId = externalIdsOfGlobalId;
    return this;
  }

  /**
   * Represents a collection of external IDs for a specified global ID.
   * 
   * @return externalIdsOfGlobalId
   */

  @JsonProperty("externalIdsOfGlobalId")
  public URI getExternalIdsOfGlobalId() {
    return externalIdsOfGlobalId;
  }

  public void setExternalIdsOfGlobalId(URI externalIdsOfGlobalId) {
    this.externalIdsOfGlobalId = externalIdsOfGlobalId;
  }

  public IdentityApiResource self(URI self) {
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
    IdentityApiResource identityApiResource = (IdentityApiResource) o;
    return Objects.equals(this.externalId, identityApiResource.externalId) &&
        Objects.equals(this.externalIdsOfGlobalId, identityApiResource.externalIdsOfGlobalId) &&
        Objects.equals(this.self, identityApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, externalIdsOfGlobalId, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityApiResource {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalIdsOfGlobalId: ").append(toIndentedString(externalIdsOfGlobalId)).append("\n");
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
