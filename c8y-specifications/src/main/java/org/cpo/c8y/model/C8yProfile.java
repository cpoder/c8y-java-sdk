package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Device capability to manage device profiles. Device profiles represent a
 * combination of a firmware version, one or multiple software packages and one
 * or multiple configuration files which can be deployed on a device.
 */

@JsonTypeName("c8y_Profile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yProfile {

  private String profileName;

  private String profileId;

  private Boolean profileExecuted;

  public C8yProfile profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * The name of the profile.
   * 
   * @return profileName
   */

  @JsonProperty("profileName")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public C8yProfile profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The ID of the profile.
   * 
   * @return profileId
   */

  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public C8yProfile profileExecuted(Boolean profileExecuted) {
    this.profileExecuted = profileExecuted;
    return this;
  }

  /**
   * Indicates whether the profile has been executed.
   * 
   * @return profileExecuted
   */

  @JsonProperty("profileExecuted")
  public Boolean getProfileExecuted() {
    return profileExecuted;
  }

  public void setProfileExecuted(Boolean profileExecuted) {
    this.profileExecuted = profileExecuted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yProfile c8yProfile = (C8yProfile) o;
    return Objects.equals(this.profileName, c8yProfile.profileName) &&
        Objects.equals(this.profileId, c8yProfile.profileId) &&
        Objects.equals(this.profileExecuted, c8yProfile.profileExecuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileName, profileId, profileExecuted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yProfile {\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileExecuted: ").append(toIndentedString(profileExecuted)).append("\n");
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
