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
 * Collection of all notification subscriptions.
 */

@JsonTypeName("NotificationApiResource_notificationSubscriptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationApiResourceNotificationSubscriptions {

  private URI self;

  private JsonNullable<List<NotificationSubscription>> subscriptions = JsonNullable
      .<List<NotificationSubscription>>undefined();

  public NotificationApiResourceNotificationSubscriptions self(URI self) {
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

  public NotificationApiResourceNotificationSubscriptions subscriptions(List<NotificationSubscription> subscriptions) {
    this.subscriptions = JsonNullable.of(subscriptions);
    return this;
  }

  public NotificationApiResourceNotificationSubscriptions addSubscriptionsItem(
      NotificationSubscription subscriptionsItem) {
    if (this.subscriptions == null || !this.subscriptions.isPresent()) {
      this.subscriptions = JsonNullable.of(new ArrayList<>());
    }
    this.subscriptions.get().add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * 
   * @return subscriptions
   */

  @JsonProperty("subscriptions")
  public JsonNullable<List<NotificationSubscription>> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(JsonNullable<List<NotificationSubscription>> subscriptions) {
    this.subscriptions = subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationApiResourceNotificationSubscriptions notificationApiResourceNotificationSubscriptions = (NotificationApiResourceNotificationSubscriptions) o;
    return Objects.equals(this.self, notificationApiResourceNotificationSubscriptions.self) &&
        equalsNullable(this.subscriptions, notificationApiResourceNotificationSubscriptions.subscriptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(subscriptions));
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
    sb.append("class NotificationApiResourceNotificationSubscriptions {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
