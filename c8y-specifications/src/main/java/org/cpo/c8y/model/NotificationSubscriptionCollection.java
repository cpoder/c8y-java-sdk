package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * NotificationSubscriptionCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationSubscriptionCollection {

  private String next;

  private String prev;

  private URI self;

  private PageStatistics statistics;

  private List<NotificationSubscription> subscriptions = new ArrayList<>();

  public NotificationSubscriptionCollection next(String next) {
    this.next = next;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential next page of managed objects.
   * 
   * @return next
   */

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public NotificationSubscriptionCollection prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] to a
   * potential previous page of managed objects.
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public NotificationSubscriptionCollection self(URI self) {
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

  public NotificationSubscriptionCollection statistics(PageStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public PageStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(PageStatistics statistics) {
    this.statistics = statistics;
  }

  public NotificationSubscriptionCollection subscriptions(List<NotificationSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public NotificationSubscriptionCollection addSubscriptionsItem(NotificationSubscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * An array containing the subscriptions of the request.
   * 
   * @return subscriptions
   */

  @JsonProperty("subscriptions")
  public List<NotificationSubscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<NotificationSubscription> subscriptions) {
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
    NotificationSubscriptionCollection notificationSubscriptionCollection = (NotificationSubscriptionCollection) o;
    return Objects.equals(this.next, notificationSubscriptionCollection.next) &&
        Objects.equals(this.prev, notificationSubscriptionCollection.prev) &&
        Objects.equals(this.self, notificationSubscriptionCollection.self) &&
        Objects.equals(this.statistics, notificationSubscriptionCollection.statistics) &&
        Objects.equals(this.subscriptions, notificationSubscriptionCollection.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self, statistics, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubscriptionCollection {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
