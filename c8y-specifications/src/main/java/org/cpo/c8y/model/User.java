package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * User
 */

@JsonTypeName("user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class User {

  private List<Application> applications = new ArrayList<>();

  private CustomProperties customProperties;

  private String displayName;

  private String email;

  private Boolean enabled = true;

  private String firstName;

  private UserGroups groups;

  private String id;

  private String lastName;

  private OffsetDateTime lastPasswordChange;

  private Boolean newsletter;

  private String owner;

  private String password;

  /**
   * Indicates the password strength. The value can be GREEN, YELLOW or RED for
   * decreasing password strengths.
   */
  public enum PasswordStrengthEnum {
    GREEN("GREEN"),

    YELLOW("YELLOW"),

    RED("RED");

    private String value;

    PasswordStrengthEnum(String value) {
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
    public static PasswordStrengthEnum fromValue(String value) {
      for (PasswordStrengthEnum b : PasswordStrengthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PasswordStrengthEnum passwordStrength;

  private String phone;

  private UserRoles roles;

  private URI self;

  private Boolean sendPasswordResetEmail;

  private Boolean shouldResetPassword;

  private Boolean twoFactorAuthenticationEnabled = false;

  private String userName;

  @Deprecated

  private Map<String, List<String>> devicePermissions = new HashMap<>();

  public User applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public User addApplicationsItem(Application applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * A list of applications for this user.
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  public User customProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  /**
   * Get customProperties
   * 
   * @return customProperties
   */

  @JsonProperty("customProperties")
  public CustomProperties getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(CustomProperties customProperties) {
    this.customProperties = customProperties;
  }

  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The user's display name in Cumulocity IoT.
   * 
   * @return displayName
   */

  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public User email(String email) {
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

  public User enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the user is enabled or not. Disabled users cannot log in or
   * perform API requests.
   * 
   * @return enabled
   */

  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public User firstName(String firstName) {
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

  public User groups(UserGroups groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Get groups
   * 
   * @return groups
   */

  @JsonProperty("groups")
  public UserGroups getGroups() {
    return groups;
  }

  public void setGroups(UserGroups groups) {
    this.groups = groups;
  }

  public User id(String id) {
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

  public User lastName(String lastName) {
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

  public User lastPasswordChange(OffsetDateTime lastPasswordChange) {
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

  public User newsletter(Boolean newsletter) {
    this.newsletter = newsletter;
    return this;
  }

  /**
   * Indicates whether the user is subscribed to the newsletter or not.
   * 
   * @return newsletter
   */

  @JsonProperty("newsletter")
  public Boolean getNewsletter() {
    return newsletter;
  }

  public void setNewsletter(Boolean newsletter) {
    this.newsletter = newsletter;
  }

  public User owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Identifier of the parent user. If present, indicates that a user belongs to a
   * user hierarchy by pointing to its direct ancestor. Can only be set by users
   * with role USER_MANAGEMENT_ADMIN during user creation. Otherwise it's assigned
   * automatically.
   * 
   * @return owner
   */

  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The user's password. Only Latin1 characters are allowed. If you do not
   * specify a password when creating a new user with a POST request, it must
   * contain the property `sendPasswordResetEmail` with a value of `true`.
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

  public User passwordStrength(PasswordStrengthEnum passwordStrength) {
    this.passwordStrength = passwordStrength;
    return this;
  }

  /**
   * Indicates the password strength. The value can be GREEN, YELLOW or RED for
   * decreasing password strengths.
   * 
   * @return passwordStrength
   */

  @JsonProperty("passwordStrength")
  public PasswordStrengthEnum getPasswordStrength() {
    return passwordStrength;
  }

  public void setPasswordStrength(PasswordStrengthEnum passwordStrength) {
    this.passwordStrength = passwordStrength;
  }

  public User phone(String phone) {
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

  public User roles(UserRoles roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * 
   * @return roles
   */

  @JsonProperty("roles")
  public UserRoles getRoles() {
    return roles;
  }

  public void setRoles(UserRoles roles) {
    this.roles = roles;
  }

  public User self(URI self) {
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

  public User sendPasswordResetEmail(Boolean sendPasswordResetEmail) {
    this.sendPasswordResetEmail = sendPasswordResetEmail;
    return this;
  }

  /**
   * When set to `true`, this field will cause Cumulocity IoT to send a password
   * reset email to the email address specified. If there is no password specified
   * when creating a new user with a POST request, this must be specified and it
   * must be set to `true`.
   * 
   * @return sendPasswordResetEmail
   */

  @JsonProperty("sendPasswordResetEmail")
  public Boolean getSendPasswordResetEmail() {
    return sendPasswordResetEmail;
  }

  public void setSendPasswordResetEmail(Boolean sendPasswordResetEmail) {
    this.sendPasswordResetEmail = sendPasswordResetEmail;
  }

  public User shouldResetPassword(Boolean shouldResetPassword) {
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

  public User twoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
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

  public User userName(String userName) {
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

  public User devicePermissions(Map<String, List<String>> devicePermissions) {
    this.devicePermissions = devicePermissions;
    return this;
  }

  public User putDevicePermissionsItem(String key, List<String> devicePermissionsItem) {
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
    User user = (User) o;
    return Objects.equals(this.applications, user.applications) &&
        Objects.equals(this.customProperties, user.customProperties) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.enabled, user.enabled) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.lastPasswordChange, user.lastPasswordChange) &&
        Objects.equals(this.newsletter, user.newsletter) &&
        Objects.equals(this.owner, user.owner) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.passwordStrength, user.passwordStrength) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.self, user.self) &&
        Objects.equals(this.sendPasswordResetEmail, user.sendPasswordResetEmail) &&
        Objects.equals(this.shouldResetPassword, user.shouldResetPassword) &&
        Objects.equals(this.twoFactorAuthenticationEnabled, user.twoFactorAuthenticationEnabled) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.devicePermissions, user.devicePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, customProperties, displayName, email, enabled, firstName, groups, id, lastName,
        lastPasswordChange, newsletter, owner, password, passwordStrength, phone, roles, self, sendPasswordResetEmail,
        shouldResetPassword, twoFactorAuthenticationEnabled, userName, devicePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastPasswordChange: ").append(toIndentedString(lastPasswordChange)).append("\n");
    sb.append("    newsletter: ").append(toIndentedString(newsletter)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    passwordStrength: ").append(toIndentedString(passwordStrength)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sendPasswordResetEmail: ").append(toIndentedString(sendPasswordResetEmail)).append("\n");
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
