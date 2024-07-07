package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Modern version of configuration of default groups and applications. This
 * ensures backward compatibility.
 */

@JsonTypeName("authConfig_onNewUser_dynamicMapping")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUserDynamicMapping {

  private AuthConfigOnNewUserDynamicMappingConfiguration _configuration;

  private List<AuthConfigOnNewUserDynamicMappingMappingsInner> mappings = new ArrayList<>();

  private List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInner> inventoryMappings = new ArrayList<>();

  public AuthConfigOnNewUserDynamicMapping _configuration(
      AuthConfigOnNewUserDynamicMappingConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * 
   * @return _configuration
   */

  @JsonProperty("configuration")
  public AuthConfigOnNewUserDynamicMappingConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(AuthConfigOnNewUserDynamicMappingConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public AuthConfigOnNewUserDynamicMapping mappings(List<AuthConfigOnNewUserDynamicMappingMappingsInner> mappings) {
    this.mappings = mappings;
    return this;
  }

  public AuthConfigOnNewUserDynamicMapping addMappingsItem(
      AuthConfigOnNewUserDynamicMappingMappingsInner mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

  /**
   * Represents rules used to assign groups and applications.
   * 
   * @return mappings
   */

  @JsonProperty("mappings")
  public List<AuthConfigOnNewUserDynamicMappingMappingsInner> getMappings() {
    return mappings;
  }

  public void setMappings(List<AuthConfigOnNewUserDynamicMappingMappingsInner> mappings) {
    this.mappings = mappings;
  }

  public AuthConfigOnNewUserDynamicMapping inventoryMappings(
      List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInner> inventoryMappings) {
    this.inventoryMappings = inventoryMappings;
    return this;
  }

  public AuthConfigOnNewUserDynamicMapping addInventoryMappingsItem(
      AuthConfigOnNewUserDynamicMappingInventoryMappingsInner inventoryMappingsItem) {
    if (this.inventoryMappings == null) {
      this.inventoryMappings = new ArrayList<>();
    }
    this.inventoryMappings.add(inventoryMappingsItem);
    return this;
  }

  /**
   * Represents rules used to assign inventory roles.
   * 
   * @return inventoryMappings
   */

  @JsonProperty("inventoryMappings")
  public List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInner> getInventoryMappings() {
    return inventoryMappings;
  }

  public void setInventoryMappings(List<AuthConfigOnNewUserDynamicMappingInventoryMappingsInner> inventoryMappings) {
    this.inventoryMappings = inventoryMappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUserDynamicMapping authConfigOnNewUserDynamicMapping = (AuthConfigOnNewUserDynamicMapping) o;
    return Objects.equals(this._configuration, authConfigOnNewUserDynamicMapping._configuration) &&
        Objects.equals(this.mappings, authConfigOnNewUserDynamicMapping.mappings) &&
        Objects.equals(this.inventoryMappings, authConfigOnNewUserDynamicMapping.inventoryMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, mappings, inventoryMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUserDynamicMapping {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    inventoryMappings: ").append(toIndentedString(inventoryMappings)).append("\n");
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
