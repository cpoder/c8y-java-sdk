package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * NotificationApiResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationApiResource {

  private URI self;

  private NotificationApiResourceNotificationSubscriptions notificationSubscriptions;

  private String notificationSubscriptionsBySource;

  private String notificationSubscriptionsBySourceAndContext;

  private String notificationSubscriptionsByContext;

  public NotificationApiResource self(URI self) {
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

  public NotificationApiResource notificationSubscriptions(
      NotificationApiResourceNotificationSubscriptions notificationSubscriptions) {
    this.notificationSubscriptions = notificationSubscriptions;
    return this;
  }

  /**
   * Get notificationSubscriptions
   * 
   * @return notificationSubscriptions
   */

  @JsonProperty("notificationSubscriptions")
  public NotificationApiResourceNotificationSubscriptions getNotificationSubscriptions() {
    return notificationSubscriptions;
  }

  public void setNotificationSubscriptions(NotificationApiResourceNotificationSubscriptions notificationSubscriptions) {
    this.notificationSubscriptions = notificationSubscriptions;
  }

  public NotificationApiResource notificationSubscriptionsBySource(String notificationSubscriptionsBySource) {
    this.notificationSubscriptionsBySource = notificationSubscriptionsBySource;
    return this;
  }

  /**
   * Read-only collection of all notification subscriptions for a specific source
   * object. The placeholder {source} must be a unique ID of an object in the
   * inventory.
   * 
   * @return notificationSubscriptionsBySource
   */

  @JsonProperty("notificationSubscriptionsBySource")
  public String getNotificationSubscriptionsBySource() {
    return notificationSubscriptionsBySource;
  }

  public void setNotificationSubscriptionsBySource(String notificationSubscriptionsBySource) {
    this.notificationSubscriptionsBySource = notificationSubscriptionsBySource;
  }

  public NotificationApiResource notificationSubscriptionsBySourceAndContext(
      String notificationSubscriptionsBySourceAndContext) {
    this.notificationSubscriptionsBySourceAndContext = notificationSubscriptionsBySourceAndContext;
    return this;
  }

  /**
   * Read-only collection of all notification subscriptions of a particular
   * context and a specific source object.
   * 
   * @return notificationSubscriptionsBySourceAndContext
   */

  @JsonProperty("notificationSubscriptionsBySourceAndContext")
  public String getNotificationSubscriptionsBySourceAndContext() {
    return notificationSubscriptionsBySourceAndContext;
  }

  public void setNotificationSubscriptionsBySourceAndContext(String notificationSubscriptionsBySourceAndContext) {
    this.notificationSubscriptionsBySourceAndContext = notificationSubscriptionsBySourceAndContext;
  }

  public NotificationApiResource notificationSubscriptionsByContext(String notificationSubscriptionsByContext) {
    this.notificationSubscriptionsByContext = notificationSubscriptionsByContext;
    return this;
  }

  /**
   * Read-only collection of all notification subscriptions of a particular
   * context.
   * 
   * @return notificationSubscriptionsByContext
   */

  @JsonProperty("notificationSubscriptionsByContext")
  public String getNotificationSubscriptionsByContext() {
    return notificationSubscriptionsByContext;
  }

  public void setNotificationSubscriptionsByContext(String notificationSubscriptionsByContext) {
    this.notificationSubscriptionsByContext = notificationSubscriptionsByContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationApiResource notificationApiResource = (NotificationApiResource) o;
    return Objects.equals(this.self, notificationApiResource.self) &&
        Objects.equals(this.notificationSubscriptions, notificationApiResource.notificationSubscriptions) &&
        Objects
            .equals(this.notificationSubscriptionsBySource, notificationApiResource.notificationSubscriptionsBySource)
        &&
        Objects.equals(this.notificationSubscriptionsBySourceAndContext,
            notificationApiResource.notificationSubscriptionsBySourceAndContext)
        &&
        Objects.equals(this.notificationSubscriptionsByContext,
            notificationApiResource.notificationSubscriptionsByContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, notificationSubscriptions, notificationSubscriptionsBySource,
        notificationSubscriptionsBySourceAndContext, notificationSubscriptionsByContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationApiResource {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    notificationSubscriptions: ").append(toIndentedString(notificationSubscriptions)).append("\n");
    sb.append("    notificationSubscriptionsBySource: ").append(toIndentedString(notificationSubscriptionsBySource))
        .append("\n");
    sb.append("    notificationSubscriptionsBySourceAndContext: ")
        .append(toIndentedString(notificationSubscriptionsBySourceAndContext)).append("\n");
    sb.append("    notificationSubscriptionsByContext: ").append(toIndentedString(notificationSubscriptionsByContext))
        .append("\n");
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
