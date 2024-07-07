package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Binary
 */

@JsonTypeName("binary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Binary {

  private Object c8yIsBinary;

  private String contentType;

  private String id;

  private OffsetDateTime lastUpdated;

  private Integer length;

  private String name;

  private String owner;

  private URI self;

  private String type;

  public Binary c8yIsBinary(Object c8yIsBinary) {
    this.c8yIsBinary = c8yIsBinary;
    return this;
  }

  /**
   * Fragment to identify this managed object as a file.
   * 
   * @return c8yIsBinary
   */

  @JsonProperty("c8y_IsBinary")
  public Object getC8yIsBinary() {
    return c8yIsBinary;
  }

  public void setC8yIsBinary(Object c8yIsBinary) {
    this.c8yIsBinary = c8yIsBinary;
  }

  public Binary contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Media type of the file.
   * 
   * @return contentType
   */

  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Binary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the object.
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

  public Binary lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Date and time of the file's last update.
   * 
   * @return lastUpdated
   */

  @JsonProperty("lastUpdated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Binary length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Size of the file in bytes.
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

  public Binary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the managed object. It is set from the `object` contained in the
   * payload.
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

  public Binary owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Username of the owner of the file.
   * 
   * @return owner
   */

  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Binary self(URI self) {
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

  public Binary type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the managed object. It is set from the `object` contained in the
   * payload.
   * 
   * @return type
   */

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
    Binary binary = (Binary) o;
    return Objects.equals(this.c8yIsBinary, binary.c8yIsBinary) &&
        Objects.equals(this.contentType, binary.contentType) &&
        Objects.equals(this.id, binary.id) &&
        Objects.equals(this.lastUpdated, binary.lastUpdated) &&
        Objects.equals(this.length, binary.length) &&
        Objects.equals(this.name, binary.name) &&
        Objects.equals(this.owner, binary.owner) &&
        Objects.equals(this.self, binary.self) &&
        Objects.equals(this.type, binary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c8yIsBinary, contentType, id, lastUpdated, length, name, owner, self, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Binary {\n");
    sb.append("    c8yIsBinary: ").append(toIndentedString(c8yIsBinary)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
