package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The managed object to which the subscription is associated.
 */

@JsonTypeName("NotificationSubscription_source")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationSubscriptionSource {

  private String id;

  private String name;

  private URI self;

  public NotificationSubscriptionSource id(String id) {
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

  public NotificationSubscriptionSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name that is used for representing the object in user
   * interfaces.
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

  public NotificationSubscriptionSource self(URI self) {
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
    NotificationSubscriptionSource notificationSubscriptionSource = (NotificationSubscriptionSource) o;
    return Objects.equals(this.id, notificationSubscriptionSource.id) &&
        Objects.equals(this.name, notificationSubscriptionSource.name) &&
        Objects.equals(this.self, notificationSubscriptionSource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubscriptionSource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
