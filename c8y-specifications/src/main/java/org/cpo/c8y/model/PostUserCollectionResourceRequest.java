package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostUserCollectionResourceRequest
 */

@JsonTypeName("postUserCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostUserCollectionResourceRequest {

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

  private JsonNullable<Object> devicePermissions = JsonNullable.<Object>undefined();

  public PostUserCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostUserCollectionResourceRequest(String email, String userName) {
    this.email = email;
    this.userName = userName;
  }

  public PostUserCollectionResourceRequest applications(List<Application> applications) {
    this.applications = applications;
    return this;
  }

  public PostUserCollectionResourceRequest addApplicationsItem(Application applicationsItem) {
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

  public PostUserCollectionResourceRequest customProperties(CustomProperties customProperties) {
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

  public PostUserCollectionResourceRequest displayName(String displayName) {
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

  public PostUserCollectionResourceRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email address.
   * 
   * @return email
   */
  @NotNull

  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PostUserCollectionResourceRequest enabled(Boolean enabled) {
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

  public PostUserCollectionResourceRequest firstName(String firstName) {
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

  public PostUserCollectionResourceRequest groups(UserGroups groups) {
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

  public PostUserCollectionResourceRequest id(String id) {
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

  public PostUserCollectionResourceRequest lastName(String lastName) {
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

  public PostUserCollectionResourceRequest lastPasswordChange(OffsetDateTime lastPasswordChange) {
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

  public PostUserCollectionResourceRequest newsletter(Boolean newsletter) {
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

  public PostUserCollectionResourceRequest owner(String owner) {
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

  public PostUserCollectionResourceRequest password(String password) {
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

  public PostUserCollectionResourceRequest passwordStrength(PasswordStrengthEnum passwordStrength) {
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

  public PostUserCollectionResourceRequest phone(String phone) {
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

  public PostUserCollectionResourceRequest roles(UserRoles roles) {
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

  public PostUserCollectionResourceRequest self(URI self) {
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

  public PostUserCollectionResourceRequest sendPasswordResetEmail(Boolean sendPasswordResetEmail) {
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

  public PostUserCollectionResourceRequest shouldResetPassword(Boolean shouldResetPassword) {
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

  public PostUserCollectionResourceRequest twoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
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

  public PostUserCollectionResourceRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The user's username. It can have a maximum of 1000 characters.
   * 
   * @return userName
   */
  @NotNull

  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public PostUserCollectionResourceRequest devicePermissions(Object devicePermissions) {
    this.devicePermissions = JsonNullable.of(devicePermissions);
    return this;
  }

  /**
   * Get devicePermissions
   * 
   * @return devicePermissions
   */

  @JsonProperty("devicePermissions")
  public JsonNullable<Object> getDevicePermissions() {
    return devicePermissions;
  }

  public void setDevicePermissions(JsonNullable<Object> devicePermissions) {
    this.devicePermissions = devicePermissions;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public PostUserCollectionResourceRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUserCollectionResourceRequest postUserCollectionResourceRequest = (PostUserCollectionResourceRequest) o;
    return Objects.equals(this.applications, postUserCollectionResourceRequest.applications) &&
        Objects.equals(this.customProperties, postUserCollectionResourceRequest.customProperties) &&
        Objects.equals(this.displayName, postUserCollectionResourceRequest.displayName) &&
        Objects.equals(this.email, postUserCollectionResourceRequest.email) &&
        Objects.equals(this.enabled, postUserCollectionResourceRequest.enabled) &&
        Objects.equals(this.firstName, postUserCollectionResourceRequest.firstName) &&
        Objects.equals(this.groups, postUserCollectionResourceRequest.groups) &&
        Objects.equals(this.id, postUserCollectionResourceRequest.id) &&
        Objects.equals(this.lastName, postUserCollectionResourceRequest.lastName) &&
        Objects.equals(this.lastPasswordChange, postUserCollectionResourceRequest.lastPasswordChange) &&
        Objects.equals(this.newsletter, postUserCollectionResourceRequest.newsletter) &&
        Objects.equals(this.owner, postUserCollectionResourceRequest.owner) &&
        Objects.equals(this.password, postUserCollectionResourceRequest.password) &&
        Objects.equals(this.passwordStrength, postUserCollectionResourceRequest.passwordStrength) &&
        Objects.equals(this.phone, postUserCollectionResourceRequest.phone) &&
        Objects.equals(this.roles, postUserCollectionResourceRequest.roles) &&
        Objects.equals(this.self, postUserCollectionResourceRequest.self) &&
        Objects.equals(this.sendPasswordResetEmail, postUserCollectionResourceRequest.sendPasswordResetEmail) &&
        Objects.equals(this.shouldResetPassword, postUserCollectionResourceRequest.shouldResetPassword) &&
        Objects.equals(this.twoFactorAuthenticationEnabled,
            postUserCollectionResourceRequest.twoFactorAuthenticationEnabled)
        &&
        Objects.equals(this.userName, postUserCollectionResourceRequest.userName) &&
        equalsNullable(this.devicePermissions, postUserCollectionResourceRequest.devicePermissions) &&
        Objects.equals(this.additionalProperties, postUserCollectionResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, customProperties, displayName, email, enabled, firstName, groups, id, lastName,
        lastPasswordChange, newsletter, owner, password, passwordStrength, phone, roles, self, sendPasswordResetEmail,
        shouldResetPassword, twoFactorAuthenticationEnabled, userName, hashCodeNullable(devicePermissions),
        additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUserCollectionResourceRequest {\n");
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

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
