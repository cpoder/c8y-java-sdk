package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The current user.
 */

@JsonTypeName("currentUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class CurrentUser {

  private List<Role> effectiveRoles = new ArrayList<>();

  private String email;

  private String firstName;

  private String id;

  private String lastName;

  private OffsetDateTime lastPasswordChange;

  private String password;

  private String phone;

  private URI self;

  private Boolean shouldResetPassword;

  private Boolean twoFactorAuthenticationEnabled = false;

  private String userName;

  @Deprecated

  private Map<String, List<String>> devicePermissions = new HashMap<>();

  public CurrentUser effectiveRoles(List<Role> effectiveRoles) {
    this.effectiveRoles = effectiveRoles;
    return this;
  }

  public CurrentUser addEffectiveRolesItem(Role effectiveRolesItem) {
    if (this.effectiveRoles == null) {
      this.effectiveRoles = new ArrayList<>();
    }
    this.effectiveRoles.add(effectiveRolesItem);
    return this;
  }

  /**
   * A list of user roles.
   * 
   * @return effectiveRoles
   */

  @JsonProperty("effectiveRoles")
  public List<Role> getEffectiveRoles() {
    return effectiveRoles;
  }

  public void setEffectiveRoles(List<Role> effectiveRoles) {
    this.effectiveRoles = effectiveRoles;
  }

  public CurrentUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email address.
   * 
   * @return email
   */

  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CurrentUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.
   * 
   * @return firstName
   */

  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CurrentUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this user.
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

  public CurrentUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The user's last name.
   * 
   * @return lastName
   */

  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CurrentUser lastPasswordChange(OffsetDateTime lastPasswordChange) {
    this.lastPasswordChange = lastPasswordChange;
    return this;
  }

  /**
   * The date and time when the user's password was last changed, in [ISO 8601
   * datetime format](https://www.w3.org/TR/NOTE-datetime).
   * 
   * @return lastPasswordChange
   */

  @JsonProperty("lastPasswordChange")
  public OffsetDateTime getLastPasswordChange() {
    return lastPasswordChange;
  }

  public void setLastPasswordChange(OffsetDateTime lastPasswordChange) {
    this.lastPasswordChange = lastPasswordChange;
  }

  public CurrentUser password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user's password. Only Latin1 characters are allowed.
   * 
   * @return password
   */

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CurrentUser phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The user's phone number.
   * 
   * @return phone
   */

  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CurrentUser self(URI self) {
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

  public CurrentUser shouldResetPassword(Boolean shouldResetPassword) {
    this.shouldResetPassword = shouldResetPassword;
    return this;
  }

  /**
   * Indicates if the user should reset the password on the next login.
   * 
   * @return shouldResetPassword
   */

  @JsonProperty("shouldResetPassword")
  public Boolean getShouldResetPassword() {
    return shouldResetPassword;
  }

  public void setShouldResetPassword(Boolean shouldResetPassword) {
    this.shouldResetPassword = shouldResetPassword;
  }

  public CurrentUser twoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
    this.twoFactorAuthenticationEnabled = twoFactorAuthenticationEnabled;
    return this;
  }

  /**
   * Indicates if the user has to use two-factor authentication to log in.
   * 
   * @return twoFactorAuthenticationEnabled
   */

  @JsonProperty("twoFactorAuthenticationEnabled")
  public Boolean getTwoFactorAuthenticationEnabled() {
    return twoFactorAuthenticationEnabled;
  }

  public void setTwoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
    this.twoFactorAuthenticationEnabled = twoFactorAuthenticationEnabled;
  }

  public CurrentUser userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The user's username. It can have a maximum of 1000 characters.
   * 
   * @return userName
   */

  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CurrentUser devicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
    return this;
  }

  public CurrentUser putDevicePermissionsItem(String key, List<String> devicePermissionsItem) {
    if (this.devicePermissions == null) {
      this.devicePermissions = new HashMap<>();
    }
    this.devicePermissions.put(key, devicePermissionsItem);
    return this;
  }

  /**
   * An object with a list of the user's device permissions.
   * 
   * @return devicePermissions
   * @deprecated
   */

  @JsonProperty("devicePermissions")
  @Deprecated
  public Map<String, List<String>> getDevicePermissions() {
    return devicePermissions;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setDevicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUser currentUser = (CurrentUser) o;
    return Objects.equals(this.effectiveRoles, currentUser.effectiveRoles) &&
        Objects.equals(this.email, currentUser.email) &&
        Objects.equals(this.firstName, currentUser.firstName) &&
        Objects.equals(this.id, currentUser.id) &&
        Objects.equals(this.lastName, currentUser.lastName) &&
        Objects.equals(this.lastPasswordChange, currentUser.lastPasswordChange) &&
        Objects.equals(this.password, currentUser.password) &&
        Objects.equals(this.phone, currentUser.phone) &&
        Objects.equals(this.self, currentUser.self) &&
        Objects.equals(this.shouldResetPassword, currentUser.shouldResetPassword) &&
        Objects.equals(this.twoFactorAuthenticationEnabled, currentUser.twoFactorAuthenticationEnabled) &&
        Objects.equals(this.userName, currentUser.userName) &&
        Objects.equals(this.devicePermissions, currentUser.devicePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveRoles, email, firstName, id, lastName, lastPasswordChange, password, phone, self,
        shouldResetPassword, twoFactorAuthenticationEnabled, userName, devicePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUser {\n");
    sb.append("    effectiveRoles: ").append(toIndentedString(effectiveRoles)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastPasswordChange: ").append(toIndentedString(lastPasswordChange)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    shouldResetPassword: ").append(toIndentedString(shouldResetPassword)).append("\n");
    sb.append("    twoFactorAuthenticationEnabled: ").append(toIndentedString(twoFactorAuthenticationEnabled))
        .append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    devicePermissions: ").append(toIndentedString(devicePermissions)).append("\n");
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
