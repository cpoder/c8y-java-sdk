package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostEventCollectionResourceRequest
 */

@JsonTypeName("postEventCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostEventCollectionResourceRequest {

  private OffsetDateTime creationTime;

  private OffsetDateTime lastUpdated;

  private String id;

  private URI self;

  private JsonNullable<Object> source = JsonNullable.<Object>undefined();

  private String text;

  private OffsetDateTime time;

  private String type;

  public PostEventCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostEventCollectionResourceRequest(Object source, String text, OffsetDateTime time, String type) {
    this.source = JsonNullable.of(source);
    this.text = text;
    this.time = time;
    this.type = type;
  }

  public PostEventCollectionResourceRequest creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the event was created.
   * 
   * @return creationTime
   */

  @JsonProperty("creationTime")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public PostEventCollectionResourceRequest lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time when the event was last updated.
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

  public PostEventCollectionResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the event.
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

  public PostEventCollectionResourceRequest self(URI self) {
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

  public PostEventCollectionResourceRequest source(Object source) {
    this.source = JsonNullable.of(source);
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */
  @NotNull

  @JsonProperty("source")
  public JsonNullable<Object> getSource() {
    return source;
  }

  public void setSource(JsonNullable<Object> source) {
    this.source = source;
  }

  public PostEventCollectionResourceRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Description of the event.
   * 
   * @return text
   */
  @NotNull

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PostEventCollectionResourceRequest time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The date and time when the event is updated.
   * 
   * @return time
   */
  @NotNull

  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public PostEventCollectionResourceRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Identifies the type of this event.
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PostEventCollectionResourceRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostEventCollectionResourceRequest postEventCollectionResourceRequest = (PostEventCollectionResourceRequest) o;
    return Objects.equals(this.creationTime, postEventCollectionResourceRequest.creationTime) &&
        Objects.equals(this.lastUpdated, postEventCollectionResourceRequest.lastUpdated) &&
        Objects.equals(this.id, postEventCollectionResourceRequest.id) &&
        Objects.equals(this.self, postEventCollectionResourceRequest.self) &&
        Objects.equals(this.source, postEventCollectionResourceRequest.source) &&
        Objects.equals(this.text, postEventCollectionResourceRequest.text) &&
        Objects.equals(this.time, postEventCollectionResourceRequest.time) &&
        Objects.equals(this.type, postEventCollectionResourceRequest.type) &&
        Objects.equals(this.additionalProperties, postEventCollectionResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, lastUpdated, id, self, source, text, time, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostEventCollectionResourceRequest {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
