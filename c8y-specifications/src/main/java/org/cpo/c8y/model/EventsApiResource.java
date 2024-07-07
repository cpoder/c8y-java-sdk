package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * EventsApiResource
 */

@JsonTypeName("eventsApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class EventsApiResource {

  private EventsApiResourceEvents events;

  private String eventsForSource;

  private String eventsForSourceAndType;

  private String eventsForType;

  private String eventsForFragmentType;

  private String eventsForTime;

  private String eventsForSourceAndTime;

  private URI self;

  public EventsApiResource events(EventsApiResourceEvents events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * 
   * @return events
   */

  @JsonProperty("events")
  public EventsApiResourceEvents getEvents() {
    return events;
  }

  public void setEvents(EventsApiResourceEvents events) {
    this.events = events;
  }

  public EventsApiResource eventsForSource(String eventsForSource) {
    this.eventsForSource = eventsForSource;
    return this;
  }

  /**
   * Read-only collection of all events for a specific source object. The
   * placeholder {source} must be a unique ID of an object in the inventory.
   * 
   * @return eventsForSource
   */

  @JsonProperty("eventsForSource")
  public String getEventsForSource() {
    return eventsForSource;
  }

  public void setEventsForSource(String eventsForSource) {
    this.eventsForSource = eventsForSource;
  }

  public EventsApiResource eventsForSourceAndType(String eventsForSourceAndType) {
    this.eventsForSourceAndType = eventsForSourceAndType;
    return this;
  }

  /**
   * Read-only collection of all events of a particular type and a specific source
   * object.
   * 
   * @return eventsForSourceAndType
   */

  @JsonProperty("eventsForSourceAndType")
  public String getEventsForSourceAndType() {
    return eventsForSourceAndType;
  }

  public void setEventsForSourceAndType(String eventsForSourceAndType) {
    this.eventsForSourceAndType = eventsForSourceAndType;
  }

  public EventsApiResource eventsForType(String eventsForType) {
    this.eventsForType = eventsForType;
    return this;
  }

  /**
   * Read-only collection of all events of a particular type.
   * 
   * @return eventsForType
   */

  @JsonProperty("eventsForType")
  public String getEventsForType() {
    return eventsForType;
  }

  public void setEventsForType(String eventsForType) {
    this.eventsForType = eventsForType;
  }

  public EventsApiResource eventsForFragmentType(String eventsForFragmentType) {
    this.eventsForFragmentType = eventsForFragmentType;
    return this;
  }

  /**
   * Read-only collection of all events containing a particular fragment type.
   * 
   * @return eventsForFragmentType
   */

  @JsonProperty("eventsForFragmentType")
  public String getEventsForFragmentType() {
    return eventsForFragmentType;
  }

  public void setEventsForFragmentType(String eventsForFragmentType) {
    this.eventsForFragmentType = eventsForFragmentType;
  }

  public EventsApiResource eventsForTime(String eventsForTime) {
    this.eventsForTime = eventsForTime;
    return this;
  }

  /**
   * Read-only collection of all events for a particular time range.
   * 
   * @return eventsForTime
   */

  @JsonProperty("eventsForTime")
  public String getEventsForTime() {
    return eventsForTime;
  }

  public void setEventsForTime(String eventsForTime) {
    this.eventsForTime = eventsForTime;
  }

  public EventsApiResource eventsForSourceAndTime(String eventsForSourceAndTime) {
    this.eventsForSourceAndTime = eventsForSourceAndTime;
    return this;
  }

  /**
   * Read-only collection of all events for a specific source object in a
   * particular time range.
   * 
   * @return eventsForSourceAndTime
   */

  @JsonProperty("eventsForSourceAndTime")
  public String getEventsForSourceAndTime() {
    return eventsForSourceAndTime;
  }

  public void setEventsForSourceAndTime(String eventsForSourceAndTime) {
    this.eventsForSourceAndTime = eventsForSourceAndTime;
  }

  public EventsApiResource self(URI self) {
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
    EventsApiResource eventsApiResource = (EventsApiResource) o;
    return Objects.equals(this.events, eventsApiResource.events) &&
        Objects.equals(this.eventsForSource, eventsApiResource.eventsForSource) &&
        Objects.equals(this.eventsForSourceAndType, eventsApiResource.eventsForSourceAndType) &&
        Objects.equals(this.eventsForType, eventsApiResource.eventsForType) &&
        Objects.equals(this.eventsForFragmentType, eventsApiResource.eventsForFragmentType) &&
        Objects.equals(this.eventsForTime, eventsApiResource.eventsForTime) &&
        Objects.equals(this.eventsForSourceAndTime, eventsApiResource.eventsForSourceAndTime) &&
        Objects.equals(this.self, eventsApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, eventsForSource, eventsForSourceAndType, eventsForType, eventsForFragmentType,
        eventsForTime, eventsForSourceAndTime, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsApiResource {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    eventsForSource: ").append(toIndentedString(eventsForSource)).append("\n");
    sb.append("    eventsForSourceAndType: ").append(toIndentedString(eventsForSourceAndType)).append("\n");
    sb.append("    eventsForType: ").append(toIndentedString(eventsForType)).append("\n");
    sb.append("    eventsForFragmentType: ").append(toIndentedString(eventsForFragmentType)).append("\n");
    sb.append("    eventsForTime: ").append(toIndentedString(eventsForTime)).append("\n");
    sb.append("    eventsForSourceAndTime: ").append(toIndentedString(eventsForSourceAndTime)).append("\n");
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
