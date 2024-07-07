package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * NotificationTokenClaims
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationTokenClaims {

  private Integer expiresInMinutes = 1440;

  private String subscriber;

  private String subscription;

  /**
   * The subscription type. Currently the only supported type is `notification`
   * .Other types may be added in future.
   */
  public enum TypeEnum {
    NOTIFICATION("notification");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type = TypeEnum.NOTIFICATION;

  private Boolean signed = true;

  private Boolean shared = false;

  private Boolean nonPersistent = false;

  public NotificationTokenClaims() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationTokenClaims(String subscriber, String subscription) {
    this.subscriber = subscriber;
    this.subscription = subscription;
  }

  public NotificationTokenClaims expiresInMinutes(Integer expiresInMinutes) {
    this.expiresInMinutes = expiresInMinutes;
    return this;
  }

  /**
   * The token expiration duration.
   * 
   * @return expiresInMinutes
   */

  @JsonProperty("expiresInMinutes")
  public Integer getExpiresInMinutes() {
    return expiresInMinutes;
  }

  public void setExpiresInMinutes(Integer expiresInMinutes) {
    this.expiresInMinutes = expiresInMinutes;
  }

  public NotificationTokenClaims subscriber(String subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  /**
   * The subscriber name which the client wishes to be identified with.
   * 
   * @return subscriber
   */
  @NotNull

  @JsonProperty("subscriber")
  public String getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(String subscriber) {
    this.subscriber = subscriber;
  }

  public NotificationTokenClaims subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * The subscription name. This value must match the same that was used when the
   * subscription was created.
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

  public NotificationTokenClaims type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The subscription type. Currently the only supported type is `notification`
   * .Other types may be added in future.
   * 
   * @return type
   */

  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NotificationTokenClaims signed(Boolean signed) {
    this.signed = signed;
    return this;
  }

  /**
   * If `true`, the token will be securely signed by the Cumulocity IoT platform.
   * 
   * @return signed
   */

  @JsonProperty("signed")
  public Boolean getSigned() {
    return signed;
  }

  public void setSigned(Boolean signed) {
    this.signed = signed;
  }

  public NotificationTokenClaims shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

  /**
   * If `true`, indicates that the token is used to create a shared consumer on
   * the subscription.
   * 
   * @return shared
   */

  @JsonProperty("shared")
  public Boolean getShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public NotificationTokenClaims nonPersistent(Boolean nonPersistent) {
    this.nonPersistent = nonPersistent;
    return this;
  }

  /**
   * If `true`, indicates that the created token refers to the non-persistent
   * variant of the named subscription.
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
    NotificationTokenClaims notificationTokenClaims = (NotificationTokenClaims) o;
    return Objects.equals(this.expiresInMinutes, notificationTokenClaims.expiresInMinutes) &&
        Objects.equals(this.subscriber, notificationTokenClaims.subscriber) &&
        Objects.equals(this.subscription, notificationTokenClaims.subscription) &&
        Objects.equals(this.type, notificationTokenClaims.type) &&
        Objects.equals(this.signed, notificationTokenClaims.signed) &&
        Objects.equals(this.shared, notificationTokenClaims.shared) &&
        Objects.equals(this.nonPersistent, notificationTokenClaims.nonPersistent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresInMinutes, subscriber, subscription, type, signed, shared, nonPersistent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTokenClaims {\n");
    sb.append("    expiresInMinutes: ").append(toIndentedString(expiresInMinutes)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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
