package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * ExternalId
 */

@JsonTypeName("externalId")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ExternalId {

  private String externalId;

  private ExternalIdManagedObject managedObject;

  private URI self;

  private String type;

  public ExternalId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExternalId(String externalId, String type) {
    this.externalId = externalId;
    this.type = type;
  }

  public ExternalId externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The identifier used in the external system that Cumulocity IoT interfaces
   * with.
   * 
   * @return externalId
   */
  @NotNull

  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ExternalId managedObject(ExternalIdManagedObject managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * Get managedObject
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public ExternalIdManagedObject getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(ExternalIdManagedObject managedObject) {
    this.managedObject = managedObject;
  }

  public ExternalId self(URI self) {
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

  public ExternalId type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the external identifier.
   * 
   * @return type
   */
  @NotNull

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalId externalId = (ExternalId) o;
    return Objects.equals(this.externalId, externalId.externalId) &&
        Objects.equals(this.managedObject, externalId.managedObject) &&
        Objects.equals(this.self, externalId.self) &&
        Objects.equals(this.type, externalId.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, managedObject, self, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalId {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
