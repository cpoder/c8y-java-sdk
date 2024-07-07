package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Applicable filters to the subscription.
 */

@JsonTypeName("NotificationSubscription_subscriptionFilter")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class NotificationSubscriptionSubscriptionFilter {

  /**
   * Gets or Sets apis
   */
  public enum ApisEnum {
    ALARMS("alarms"),

    ALARMS_WITH_CHILDREN("alarmsWithChildren"),

    EVENTS("events"),

    EVENTS_WITH_CHILDREN("eventsWithChildren"),

    MANAGEDOBJECTS("managedobjects"),

    MEASUREMENTS("measurements"),

    OPERATIONS("operations"),

    STAR("*");

    private String value;

    ApisEnum(String value) {
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
    public static ApisEnum fromValue(String value) {
      for (ApisEnum b : ApisEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private List<ApisEnum> apis = new ArrayList<>();

  private String typeFilter;

  public NotificationSubscriptionSubscriptionFilter apis(List<ApisEnum> apis) {
    this.apis = apis;
    return this;
  }

  public NotificationSubscriptionSubscriptionFilter addApisItem(ApisEnum apisItem) {
    if (this.apis == null) {
      this.apis = new ArrayList<>();
    }
    this.apis.add(apisItem);
    return this;
  }

  /**
   * For the `mo` (managed object) context, notifications from the `alarms`,
   * `alarmsWithChildren`, `events`, `eventsWithChildren`, `managedobjects`
   * (Inventory), `measurements` and `operations` (Device control) APIs can be
   * subscribed to. The `alarmsWithChildren` and `eventsWithChildren` APIs
   * subscribe to alarms and events respectively from the managed object
   * identified by the `source.id` field, and all of its descendant managed
   * objects. For the `tenant` context, notifications from the `alarms`, `events`
   * and `managedobjects` (Inventory) APIs can be subscribed to. For all contexts,
   * the `*` (wildcard) value can be used to subscribe to notifications from all
   * of the available APIs in that context. > **&#9432; Info:** The wildcard `*`
   * cannot be used in conjunction with other values. > **&#9432; Info:** When
   * filtering Events in the `tenant` context it is required to also specify the
   * `typeFilter`.
   * 
   * @return apis
   */

  @JsonProperty("apis")
  public List<ApisEnum> getApis() {
    return apis;
  }

  public void setApis(List<ApisEnum> apis) {
    this.apis = apis;
  }

  public NotificationSubscriptionSubscriptionFilter typeFilter(String typeFilter) {
    this.typeFilter = typeFilter;
    return this;
  }

  /**
   * Used to match the `type` property of the data. This must either be a string
   * to match one specific type exactly, or be an `or` OData expression, allowing
   * the filter to match any one of a number of types. > **&#9432; Info:** The use
   * of a `type` attribute is assumed, for example when using only a string
   * literal `'c8y_Temperature'` (or using `c8y_Temperature`, as quotes can be
   * omitted when matching a single type) it is equivalent to a `type eq
   * 'c8y_Temperature'` OData expression. > **&#9432; Info:** Currently only the
   * `or` operator is allowed when using an OData expression. Example usage is
   * `'c8y_Temperature' or 'c8y_Pressure'` which will match all the data with
   * types `c8y_Temperature` or `c8y_Pressure`.
   * 
   * @return typeFilter
   */

  @JsonProperty("typeFilter")
  public String getTypeFilter() {
    return typeFilter;
  }

  public void setTypeFilter(String typeFilter) {
    this.typeFilter = typeFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSubscriptionSubscriptionFilter notificationSubscriptionSubscriptionFilter = (NotificationSubscriptionSubscriptionFilter) o;
    return Objects.equals(this.apis, notificationSubscriptionSubscriptionFilter.apis) &&
        Objects.equals(this.typeFilter, notificationSubscriptionSubscriptionFilter.typeFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apis, typeFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSubscriptionSubscriptionFilter {\n");
    sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
    sb.append("    typeFilter: ").append(toIndentedString(typeFilter)).append("\n");
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
