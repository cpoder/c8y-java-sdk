package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * UserTfaData
 */

@JsonTypeName("userTfaData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UserTfaData {

  private OffsetDateTime lastTfaRequestTime;

  /**
   * Two-factor authentication strategy.
   */
  public enum StrategyEnum {
    SMS("SMS"),

    TOTP("TOTP");

    private String value;

    StrategyEnum(String value) {
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
    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StrategyEnum strategy;

  private Boolean tfaEnabled;

  private Boolean tfaEnforced;

  public UserTfaData lastTfaRequestTime(OffsetDateTime lastTfaRequestTime) {
    this.lastTfaRequestTime = lastTfaRequestTime;
    return this;
  }

  /**
   * Latest date and time when the user has used two-factor authentication to log
   * in.
   * 
   * @return lastTfaRequestTime
   */

  @JsonProperty("lastTfaRequestTime")
  public OffsetDateTime getLastTfaRequestTime() {
    return lastTfaRequestTime;
  }

  public void setLastTfaRequestTime(OffsetDateTime lastTfaRequestTime) {
    this.lastTfaRequestTime = lastTfaRequestTime;
  }

  public UserTfaData strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Two-factor authentication strategy.
   * 
   * @return strategy
   */

  @JsonProperty("strategy")
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }

  public UserTfaData tfaEnabled(Boolean tfaEnabled) {
    this.tfaEnabled = tfaEnabled;
    return this;
  }

  /**
   * Indicates whether the user has enabled two-factor authentication or not.
   * 
   * @return tfaEnabled
   */

  @JsonProperty("tfaEnabled")
  public Boolean getTfaEnabled() {
    return tfaEnabled;
  }

  public void setTfaEnabled(Boolean tfaEnabled) {
    this.tfaEnabled = tfaEnabled;
  }

  public UserTfaData tfaEnforced(Boolean tfaEnforced) {
    this.tfaEnforced = tfaEnforced;
    return this;
  }

  /**
   * Indicates whether two-factor authentication is enforced by the tenant admin
   * or not.
   * 
   * @return tfaEnforced
   */

  @JsonProperty("tfaEnforced")
  public Boolean getTfaEnforced() {
    return tfaEnforced;
  }

  public void setTfaEnforced(Boolean tfaEnforced) {
    this.tfaEnforced = tfaEnforced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTfaData userTfaData = (UserTfaData) o;
    return Objects.equals(this.lastTfaRequestTime, userTfaData.lastTfaRequestTime) &&
        Objects.equals(this.strategy, userTfaData.strategy) &&
        Objects.equals(this.tfaEnabled, userTfaData.tfaEnabled) &&
        Objects.equals(this.tfaEnforced, userTfaData.tfaEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTfaRequestTime, strategy, tfaEnabled, tfaEnforced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTfaData {\n");
    sb.append("    lastTfaRequestTime: ").append(toIndentedString(lastTfaRequestTime)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    tfaEnabled: ").append(toIndentedString(tfaEnabled)).append("\n");
    sb.append("    tfaEnforced: ").append(toIndentedString(tfaEnforced)).append("\n");
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
