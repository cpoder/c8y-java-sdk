package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * EventBinary
 */

@JsonTypeName("eventBinary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class EventBinary {

  private String name;

  private URI self;

  private String source;

  private String type;

  public EventBinary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the attachment. If it is not provided in the request, it will be set
   * as the event ID.
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

  public EventBinary self(URI self) {
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

  public EventBinary source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Unique identifier of the event.
   * 
   * @return source
   */

  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EventBinary type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Media type of the attachment.
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
    EventBinary eventBinary = (EventBinary) o;
    return Objects.equals(this.name, eventBinary.name) &&
        Objects.equals(this.self, eventBinary.self) &&
        Objects.equals(this.source, eventBinary.source) &&
        Objects.equals(this.type, eventBinary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, self, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBinary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
