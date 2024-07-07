package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of all events
 */

@JsonTypeName("eventsApiResource_events")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class EventsApiResourceEvents {

  private URI self;

  private JsonNullable<List<Event>> events = JsonNullable.<List<Event>>undefined();

  public EventsApiResourceEvents self(URI self) {
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

  public EventsApiResourceEvents events(List<Event> events) {
    this.events = JsonNullable.of(events);
    return this;
  }

  public EventsApiResourceEvents addEventsItem(Event eventsItem) {
    if (this.events == null || !this.events.isPresent()) {
      this.events = JsonNullable.of(new ArrayList<>());
    }
    this.events.get().add(eventsItem);
    return this;
  }

  /**
   * Get events
   * 
   * @return events
   */

  @JsonProperty("events")
  public JsonNullable<List<Event>> getEvents() {
    return events;
  }

  public void setEvents(JsonNullable<List<Event>> events) {
    this.events = events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsApiResourceEvents eventsApiResourceEvents = (EventsApiResourceEvents) o;
    return Objects.equals(this.self, eventsApiResourceEvents.self) &&
        equalsNullable(this.events, eventsApiResourceEvents.events);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(events));
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
    sb.append("class EventsApiResourceEvents {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
