package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * PutAlarmResourceRequest
 */

@JsonTypeName("putAlarmResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PutAlarmResourceRequest {

  private Integer count;

  private OffsetDateTime creationTime;

  private OffsetDateTime firstOccurrenceTime;

  private String id;

  private OffsetDateTime lastUpdated;

  private URI self;

  /**
   * The severity of the alarm.
   */
  public enum SeverityEnum {
    CRITICAL("CRITICAL"),

    MAJOR("MAJOR"),

    MINOR("MINOR"),

    WARNING("WARNING");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SeverityEnum severity;

  private JsonNullable<Object> source = JsonNullable.<Object>undefined();

  /**
   * The status of the alarm. If not specified, a new alarm will be created as
   * ACTIVE.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    ACKNOWLEDGED("ACKNOWLEDGED"),

    CLEARED("CLEARED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String text;

  private JsonNullable<Object> time = JsonNullable.<Object>undefined();

  private JsonNullable<Object> type = JsonNullable.<Object>undefined();

  public PutAlarmResourceRequest count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of times that this alarm has been triggered.
   * 
   * @return count
   */

  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PutAlarmResourceRequest creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the alarm was created.
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

  public PutAlarmResourceRequest firstOccurrenceTime(OffsetDateTime firstOccurrenceTime) {
    this.firstOccurrenceTime = firstOccurrenceTime;
    return this;
  }

  /**
   * The time at which the alarm occurred for the first time. Only present when
   * `count` is greater than 1.
   * 
   * @return firstOccurrenceTime
   */

  @JsonProperty("firstOccurrenceTime")
  public OffsetDateTime getFirstOccurrenceTime() {
    return firstOccurrenceTime;
  }

  public void setFirstOccurrenceTime(OffsetDateTime firstOccurrenceTime) {
    this.firstOccurrenceTime = firstOccurrenceTime;
  }

  public PutAlarmResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the alarm.
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

  public PutAlarmResourceRequest lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time when the alarm was last updated.
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

  public PutAlarmResourceRequest self(URI self) {
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

  public PutAlarmResourceRequest severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the alarm.
   * 
   * @return severity
   */

  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public PutAlarmResourceRequest source(Object source) {
    this.source = JsonNullable.of(source);
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */

  @JsonProperty("source")
  public JsonNullable<Object> getSource() {
    return source;
  }

  public void setSource(JsonNullable<Object> source) {
    this.source = source;
  }

  public PutAlarmResourceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the alarm. If not specified, a new alarm will be created as
   * ACTIVE.
   * 
   * @return status
   */

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PutAlarmResourceRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Description of the alarm.
   * 
   * @return text
   */

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PutAlarmResourceRequest time(Object time) {
    this.time = JsonNullable.of(time);
    return this;
  }

  /**
   * Get time
   * 
   * @return time
   */

  @JsonProperty("time")
  public JsonNullable<Object> getTime() {
    return time;
  }

  public void setTime(JsonNullable<Object> time) {
    this.time = time;
  }

  public PutAlarmResourceRequest type(Object type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */

  @JsonProperty("type")
  public JsonNullable<Object> getType() {
    return type;
  }

  public void setType(JsonNullable<Object> type) {
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
  public PutAlarmResourceRequest putAdditionalProperty(String key, Object value) {
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
    PutAlarmResourceRequest putAlarmResourceRequest = (PutAlarmResourceRequest) o;
    return Objects.equals(this.count, putAlarmResourceRequest.count) &&
        Objects.equals(this.creationTime, putAlarmResourceRequest.creationTime) &&
        Objects.equals(this.firstOccurrenceTime, putAlarmResourceRequest.firstOccurrenceTime) &&
        Objects.equals(this.id, putAlarmResourceRequest.id) &&
        Objects.equals(this.lastUpdated, putAlarmResourceRequest.lastUpdated) &&
        Objects.equals(this.self, putAlarmResourceRequest.self) &&
        Objects.equals(this.severity, putAlarmResourceRequest.severity) &&
        equalsNullable(this.source, putAlarmResourceRequest.source) &&
        Objects.equals(this.status, putAlarmResourceRequest.status) &&
        Objects.equals(this.text, putAlarmResourceRequest.text) &&
        equalsNullable(this.time, putAlarmResourceRequest.time) &&
        equalsNullable(this.type, putAlarmResourceRequest.type) &&
        Objects.equals(this.additionalProperties, putAlarmResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, creationTime, firstOccurrenceTime, id, lastUpdated, self, severity,
        hashCodeNullable(source), status, text, hashCodeNullable(time), hashCodeNullable(type), additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutAlarmResourceRequest {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    firstOccurrenceTime: ").append(toIndentedString(firstOccurrenceTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
