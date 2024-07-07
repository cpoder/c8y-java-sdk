package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * NotificationSubscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationSubscription {

  /**
   * The context within which the subscription is to be processed. > **&#9432;
   * Info:** If the value is `mo` (managed object), then `source` must also be
   * provided in the request body.
   */
  public enum ContextEnum {
    MO("mo"),

    TENANT("tenant");

    private String value;

    ContextEnum(String value) {
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
    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContextEnum context;

  private List<String> fragmentsToCopy = new ArrayList<>();

  private String id;

  private URI self;

  private NotificationSubscriptionSource source;

  private String subscription;

  private NotificationSubscriptionSubscriptionFilter subscriptionFilter;

  private Boolean nonPersistent = false;

  public NotificationSubscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationSubscription(ContextEnum context, String subscription) {
    this.context = context;
    this.subscription = subscription;
  }

  public NotificationSubscription context(ContextEnum context) {
    this.context = context;
    return this;
  }

  /**
   * The context within which the subscription is to be processed. > **&#9432;
   * Info:** If the value is `mo` (managed object), then `source` must also be
   * provided in the request body.
   * 
   * @return context
   */
  @NotNull

  @JsonProperty("context")
  public ContextEnum getContext() {
    return context;
  }

  public void setContext(ContextEnum context) {
    this.context = context;
  }

  public NotificationSubscription fragmentsToCopy(List<String> fragmentsToCopy) {
    this.fragmentsToCopy = fragmentsToCopy;
    return this;
  }

  public NotificationSubscription addFragmentsToCopyItem(String fragmentsToCopyItem) {
    if (this.fragmentsToCopy == null) {
      this.fragmentsToCopy = new ArrayList<>();
    }
    this.fragmentsToCopy.add(fragmentsToCopyItem);
    return this;
  }

  /**
   * Transforms the data to *only* include specified custom fragments. Each custom
   * fragment is identified by a unique name. If nothing is specified here, the
   * data is forwarded as-is.
   * 
   * @return fragmentsToCopy
   */

  @JsonProperty("fragmentsToCopy")
  public List<String> getFragmentsToCopy() {
    return fragmentsToCopy;
  }

  public void setFragmentsToCopy(List<String> fragmentsToCopy) {
    this.fragmentsToCopy = fragmentsToCopy;
  }

  public NotificationSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the subscription.
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

  public NotificationSubscription self(URI self) {
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

  public NotificationSubscription source(NotificationSubscriptionSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */

  @JsonProperty("source")
  public NotificationSubscriptionSource getSource() {
    return source;
  }

  public void setSource(NotificationSubscriptionSource source) {
    this.source = source;
  }

  public NotificationSubscription subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * The subscription name. Each subscription is identified by a unique name
   * within a specific context.
   * 
   * @return subscription
   */
  @NotNull

  @JsonProperty("subscription")
  public String getSubscription() {
    return subscription;
  }

  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }

  public NotificationSubscription subscriptionFilter(NotificationSubscriptionSubscriptionFilter subscriptionFilter) {
    this.subscriptionFilter = subscriptionFilter;
    return this;
  }

  /**
   * Get subscriptionFilter
   * 
   * @return subscriptionFilter
   */

  @JsonProperty("subscriptionFilter")
  public NotificationSubscriptionSubscriptionFilter getSubscriptionFilter() {
    return subscriptionFilter;
  }

  public void setSubscriptionFilter(NotificationSubscriptionSubscriptionFilter subscriptionFilter) {
    this.subscriptionFilter = subscriptionFilter;
  }

  public NotificationSubscription nonPersistent(Boolean nonPersistent) {
    this.nonPersistent = nonPersistent;
    return this;
  }

  /**
   * Indicates whether the messages for this subscription are persistent or
   * non-persistent, meaning they can be lost if consumer is not connected.
   * 
   * @return nonPersistent
   */

  @JsonProperty("nonPersistent")
  public Boolean getNonPersistent() {
    return nonPersistent;
  }

  public void setNonPersistent(Boolean nonPersistent) {
    this.nonPersistent = nonPersistent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSubscription notificationSubscription = (NotificationSubscription) o;
    return Objects.equals(this.context, notificationSubscription.context) &&
        Objects.equals(this.fragmentsToCopy, notificationSubscription.fragmentsToCopy) &&
        Objects.equals(this.id, notificationSubscription.id) &&
        Objects.equals(this.self, notificationSubscription.self) &&
        Objects.equals(this.source, notificationSubscription.source) &&
        Objects.equals(this.subscription, notificationSubscription.subscription) &&
        Objects.equals(this.subscriptionFilter, notificationSubscription.subscriptionFilter) &&
        Objects.equals(this.nonPersistent, notificationSubscription.nonPersistent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, fragmentsToCopy, id, self, source, subscription, subscriptionFilter, nonPersistent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubscription {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    fragmentsToCopy: ").append(toIndentedString(fragmentsToCopy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    subscriptionFilter: ").append(toIndentedString(subscriptionFilter)).append("\n");
    sb.append("    nonPersistent: ").append(toIndentedString(nonPersistent)).append("\n");
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
