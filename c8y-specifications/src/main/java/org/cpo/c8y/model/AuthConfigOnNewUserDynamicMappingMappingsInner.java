package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Represents information of mapping access to groups and applications.
 */

@JsonTypeName("authConfig_onNewUser_dynamicMapping_mappings_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigOnNewUserDynamicMappingMappingsInner {

  private JSONPredicateRepresentation when;

  private List<Integer> thenApplications = new ArrayList<>();

  private List<Integer> thenGroups = new ArrayList<>();

  public AuthConfigOnNewUserDynamicMappingMappingsInner when(JSONPredicateRepresentation when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * 
   * @return when
   */

  @JsonProperty("when")
  public JSONPredicateRepresentation getWhen() {
    return when;
  }

  public void setWhen(JSONPredicateRepresentation when) {
    this.when = when;
  }

  public AuthConfigOnNewUserDynamicMappingMappingsInner thenApplications(List<Integer> thenApplications) {
    this.thenApplications = thenApplications;
    return this;
  }

  public AuthConfigOnNewUserDynamicMappingMappingsInner addThenApplicationsItem(Integer thenApplicationsItem) {
    if (this.thenApplications == null) {
      this.thenApplications = new ArrayList<>();
    }
    this.thenApplications.add(thenApplicationsItem);
    return this;
  }

  /**
   * List of the applications' identifiers.
   * 
   * @return thenApplications
   */

  @JsonProperty("thenApplications")
  public List<Integer> getThenApplications() {
    return thenApplications;
  }

  public void setThenApplications(List<Integer> thenApplications) {
    this.thenApplications = thenApplications;
  }

  public AuthConfigOnNewUserDynamicMappingMappingsInner thenGroups(List<Integer> thenGroups) {
    this.thenGroups = thenGroups;
    return this;
  }

  public AuthConfigOnNewUserDynamicMappingMappingsInner addThenGroupsItem(Integer thenGroupsItem) {
    if (this.thenGroups == null) {
      this.thenGroups = new ArrayList<>();
    }
    this.thenGroups.add(thenGroupsItem);
    return this;
  }

  /**
   * List of the groups' identifiers.
   * 
   * @return thenGroups
   */

  @JsonProperty("thenGroups")
  public List<Integer> getThenGroups() {
    return thenGroups;
  }

  public void setThenGroups(List<Integer> thenGroups) {
    this.thenGroups = thenGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigOnNewUserDynamicMappingMappingsInner authConfigOnNewUserDynamicMappingMappingsInner = (AuthConfigOnNewUserDynamicMappingMappingsInner) o;
    return Objects.equals(this.when, authConfigOnNewUserDynamicMappingMappingsInner.when) &&
        Objects.equals(this.thenApplications, authConfigOnNewUserDynamicMappingMappingsInner.thenApplications) &&
        Objects.equals(this.thenGroups, authConfigOnNewUserDynamicMappingMappingsInner.thenGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, thenApplications, thenGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigOnNewUserDynamicMappingMappingsInner {\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    thenApplications: ").append(toIndentedString(thenApplications)).append("\n");
    sb.append("    thenGroups: ").append(toIndentedString(thenGroups)).append("\n");
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
