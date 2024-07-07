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
 * Collection of all alarms
 */

@JsonTypeName("alarmsApiResource_alarms")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AlarmsApiResourceAlarms {

  private URI self;

  private JsonNullable<List<Alarm>> alarms = JsonNullable.<List<Alarm>>undefined();

  public AlarmsApiResourceAlarms self(URI self) {
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

  public AlarmsApiResourceAlarms alarms(List<Alarm> alarms) {
    this.alarms = JsonNullable.of(alarms);
    return this;
  }

  public AlarmsApiResourceAlarms addAlarmsItem(Alarm alarmsItem) {
    if (this.alarms == null || !this.alarms.isPresent()) {
      this.alarms = JsonNullable.of(new ArrayList<>());
    }
    this.alarms.get().add(alarmsItem);
    return this;
  }

  /**
   * Get alarms
   * 
   * @return alarms
   */

  @JsonProperty("alarms")
  public JsonNullable<List<Alarm>> getAlarms() {
    return alarms;
  }

  public void setAlarms(JsonNullable<List<Alarm>> alarms) {
    this.alarms = alarms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmsApiResourceAlarms alarmsApiResourceAlarms = (AlarmsApiResourceAlarms) o;
    return Objects.equals(this.self, alarmsApiResourceAlarms.self) &&
        equalsNullable(this.alarms, alarmsApiResourceAlarms.alarms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(alarms));
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
    sb.append("class AlarmsApiResourceAlarms {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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
