package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * TenantTfaData
 */

@JsonTypeName("tenantTfaData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantTfaData {

  private Boolean enabledOnSystemLevel;

  private Boolean enabledOnTenantLevel;

  private Boolean enforcedOnSystemLevel;

  private String enforcedUsersGroup;

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

  private Boolean totpEnforcedOnTenantLevel;

  public TenantTfaData enabledOnSystemLevel(Boolean enabledOnSystemLevel) {
    this.enabledOnSystemLevel = enabledOnSystemLevel;
    return this;
  }

  /**
   * Indicates whether two-factor authentication is enabled on system level or
   * not.
   * 
   * @return enabledOnSystemLevel
   */

  @JsonProperty("enabledOnSystemLevel")
  public Boolean getEnabledOnSystemLevel() {
    return enabledOnSystemLevel;
  }

  public void setEnabledOnSystemLevel(Boolean enabledOnSystemLevel) {
    this.enabledOnSystemLevel = enabledOnSystemLevel;
  }

  public TenantTfaData enabledOnTenantLevel(Boolean enabledOnTenantLevel) {
    this.enabledOnTenantLevel = enabledOnTenantLevel;
    return this;
  }

  /**
   * Indicates whether two-factor authentication is enabled on tenant level or
   * not.
   * 
   * @return enabledOnTenantLevel
   */

  @JsonProperty("enabledOnTenantLevel")
  public Boolean getEnabledOnTenantLevel() {
    return enabledOnTenantLevel;
  }

  public void setEnabledOnTenantLevel(Boolean enabledOnTenantLevel) {
    this.enabledOnTenantLevel = enabledOnTenantLevel;
  }

  public TenantTfaData enforcedOnSystemLevel(Boolean enforcedOnSystemLevel) {
    this.enforcedOnSystemLevel = enforcedOnSystemLevel;
    return this;
  }

  /**
   * Indicates whether two-factor authentication is enforced on system level or
   * not.
   * 
   * @return enforcedOnSystemLevel
   */

  @JsonProperty("enforcedOnSystemLevel")
  public Boolean getEnforcedOnSystemLevel() {
    return enforcedOnSystemLevel;
  }

  public void setEnforcedOnSystemLevel(Boolean enforcedOnSystemLevel) {
    this.enforcedOnSystemLevel = enforcedOnSystemLevel;
  }

  public TenantTfaData enforcedUsersGroup(String enforcedUsersGroup) {
    this.enforcedUsersGroup = enforcedUsersGroup;
    return this;
  }

  /**
   * Two-factor authentication is enforced for the specified group.
   * 
   * @return enforcedUsersGroup
   */

  @JsonProperty("enforcedUsersGroup")
  public String getEnforcedUsersGroup() {
    return enforcedUsersGroup;
  }

  public void setEnforcedUsersGroup(String enforcedUsersGroup) {
    this.enforcedUsersGroup = enforcedUsersGroup;
  }

  public TenantTfaData strategy(StrategyEnum strategy) {
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

  public TenantTfaData totpEnforcedOnTenantLevel(Boolean totpEnforcedOnTenantLevel) {
    this.totpEnforcedOnTenantLevel = totpEnforcedOnTenantLevel;
    return this;
  }

  /**
   * Indicates whether two-factor authentication is enforced on tenant level or
   * not.
   * 
   * @return totpEnforcedOnTenantLevel
   */

  @JsonProperty("totpEnforcedOnTenantLevel")
  public Boolean getTotpEnforcedOnTenantLevel() {
    return totpEnforcedOnTenantLevel;
  }

  public void setTotpEnforcedOnTenantLevel(Boolean totpEnforcedOnTenantLevel) {
    this.totpEnforcedOnTenantLevel = totpEnforcedOnTenantLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantTfaData tenantTfaData = (TenantTfaData) o;
    return Objects.equals(this.enabledOnSystemLevel, tenantTfaData.enabledOnSystemLevel) &&
        Objects.equals(this.enabledOnTenantLevel, tenantTfaData.enabledOnTenantLevel) &&
        Objects.equals(this.enforcedOnSystemLevel, tenantTfaData.enforcedOnSystemLevel) &&
        Objects.equals(this.enforcedUsersGroup, tenantTfaData.enforcedUsersGroup) &&
        Objects.equals(this.strategy, tenantTfaData.strategy) &&
        Objects.equals(this.totpEnforcedOnTenantLevel, tenantTfaData.totpEnforcedOnTenantLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledOnSystemLevel, enabledOnTenantLevel, enforcedOnSystemLevel, enforcedUsersGroup, strategy,
        totpEnforcedOnTenantLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantTfaData {\n");
    sb.append("    enabledOnSystemLevel: ").append(toIndentedString(enabledOnSystemLevel)).append("\n");
    sb.append("    enabledOnTenantLevel: ").append(toIndentedString(enabledOnTenantLevel)).append("\n");
    sb.append("    enforcedOnSystemLevel: ").append(toIndentedString(enforcedOnSystemLevel)).append("\n");
    sb.append("    enforcedUsersGroup: ").append(toIndentedString(enforcedUsersGroup)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    totpEnforcedOnTenantLevel: ").append(toIndentedString(totpEnforcedOnTenantLevel)).append("\n");
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
