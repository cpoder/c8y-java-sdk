package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Alarm
 */

@JsonTypeName("alarm")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Alarm {

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

  private AlarmSource source;

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

  private OffsetDateTime time;

  private String type;

  public Alarm count(Integer count) {
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

  public Alarm creationTime(OffsetDateTime creationTime) {
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

  public Alarm firstOccurrenceTime(OffsetDateTime firstOccurrenceTime) {
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

  public Alarm id(String id) {
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

  public Alarm lastUpdated(OffsetDateTime lastUpdated) {
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

  public Alarm self(URI self) {
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

  public Alarm severity(SeverityEnum severity) {
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

  public Alarm source(AlarmSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */

  @JsonProperty("source")
  public AlarmSource getSource() {
    return source;
  }

  public void setSource(AlarmSource source) {
    this.source = source;
  }

  public Alarm status(StatusEnum status) {
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

  public Alarm text(String text) {
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

  public Alarm time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The date and time when the alarm is triggered.
   * 
   * @return time
   */

  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Alarm type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Identifies the type of this alarm.
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
  public Alarm putAdditionalProperty(String key, Object value) {
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
    Alarm alarm = (Alarm) o;
    return Objects.equals(this.count, alarm.count) &&
        Objects.equals(this.creationTime, alarm.creationTime) &&
        Objects.equals(this.firstOccurrenceTime, alarm.firstOccurrenceTime) &&
        Objects.equals(this.id, alarm.id) &&
        Objects.equals(this.lastUpdated, alarm.lastUpdated) &&
        Objects.equals(this.self, alarm.self) &&
        Objects.equals(this.severity, alarm.severity) &&
        Objects.equals(this.source, alarm.source) &&
        Objects.equals(this.status, alarm.status) &&
        Objects.equals(this.text, alarm.text) &&
        Objects.equals(this.time, alarm.time) &&
        Objects.equals(this.type, alarm.type) &&
        Objects.equals(this.additionalProperties, alarm.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, creationTime, firstOccurrenceTime, id, lastUpdated, self, severity, source, status, text,
        time, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alarm {\n");
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
