package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Login option properties.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class LoginOption {

  private BasicAuthenticationRestrictions authenticationRestrictions;

  private Boolean enforceStrength;

  /**
   * The grant type of the OAuth configuration.
   */
  public enum GrantTypeEnum {
    PASSWORD("PASSWORD"),

    AUTHORIZATION_CODE("AUTHORIZATION_CODE");

    private String value;

    GrantTypeEnum(String value) {
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
    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GrantTypeEnum grantType;

  private Integer greenMinLength;

  private String id;

  private String initRequest;

  private String loginRedirectDomain;

  private URI self;

  private OAuthSessionConfiguration sessionConfiguration;

  private Boolean strengthValidity;

  private String tfaStrategy;

  private String type;

  private String userManagementSource;

  private Boolean visibleOnLoginPage;

  @Deprecated
  private String underscoreType;

  public LoginOption authenticationRestrictions(BasicAuthenticationRestrictions authenticationRestrictions) {
    this.authenticationRestrictions = authenticationRestrictions;
    return this;
  }

  /**
   * Get authenticationRestrictions
   * 
   * @return authenticationRestrictions
   */

  @JsonProperty("authenticationRestrictions")
  public BasicAuthenticationRestrictions getAuthenticationRestrictions() {
    return authenticationRestrictions;
  }

  public void setAuthenticationRestrictions(BasicAuthenticationRestrictions authenticationRestrictions) {
    this.authenticationRestrictions = authenticationRestrictions;
  }

  public LoginOption enforceStrength(Boolean enforceStrength) {
    this.enforceStrength = enforceStrength;
    return this;
  }

  /**
   * Indicates if password strength is enforced.
   * 
   * @return enforceStrength
   */

  @JsonProperty("enforceStrength")
  public Boolean getEnforceStrength() {
    return enforceStrength;
  }

  public void setEnforceStrength(Boolean enforceStrength) {
    this.enforceStrength = enforceStrength;
  }

  public LoginOption grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * The grant type of the OAuth configuration.
   * 
   * @return grantType
   */

  @JsonProperty("grantType")
  public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public LoginOption greenMinLength(Integer greenMinLength) {
    this.greenMinLength = greenMinLength;
    return this;
  }

  /**
   * Minimum length for the password when the strength validation is enforced.
   * 
   * @return greenMinLength
   */

  @JsonProperty("greenMinLength")
  public Integer getGreenMinLength() {
    return greenMinLength;
  }

  public void setGreenMinLength(Integer greenMinLength) {
    this.greenMinLength = greenMinLength;
  }

  public LoginOption id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this login option.
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

  public LoginOption initRequest(String initRequest) {
    this.initRequest = initRequest;
    return this;
  }

  /**
   * A URL linking to the token generating endpoint.
   * 
   * @return initRequest
   */

  @JsonProperty("initRequest")
  public String getInitRequest() {
    return initRequest;
  }

  public void setInitRequest(String initRequest) {
    this.initRequest = initRequest;
  }

  public LoginOption loginRedirectDomain(String loginRedirectDomain) {
    this.loginRedirectDomain = loginRedirectDomain;
    return this;
  }

  /**
   * The tenant domain.
   * 
   * @return loginRedirectDomain
   */

  @JsonProperty("loginRedirectDomain")
  public String getLoginRedirectDomain() {
    return loginRedirectDomain;
  }

  public void setLoginRedirectDomain(String loginRedirectDomain) {
    this.loginRedirectDomain = loginRedirectDomain;
  }

  public LoginOption self(URI self) {
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

  public LoginOption sessionConfiguration(OAuthSessionConfiguration sessionConfiguration) {
    this.sessionConfiguration = sessionConfiguration;
    return this;
  }

  /**
   * Get sessionConfiguration
   * 
   * @return sessionConfiguration
   */

  @JsonProperty("sessionConfiguration")
  public OAuthSessionConfiguration getSessionConfiguration() {
    return sessionConfiguration;
  }

  public void setSessionConfiguration(OAuthSessionConfiguration sessionConfiguration) {
    this.sessionConfiguration = sessionConfiguration;
  }

  public LoginOption strengthValidity(Boolean strengthValidity) {
    this.strengthValidity = strengthValidity;
    return this;
  }

  /**
   * Enforce password strength validation on subtenant level. `enforceStrength`
   * enforces it on all tenants in the platform.
   * 
   * @return strengthValidity
   */

  @JsonProperty("strengthValidity")
  public Boolean getStrengthValidity() {
    return strengthValidity;
  }

  public void setStrengthValidity(Boolean strengthValidity) {
    this.strengthValidity = strengthValidity;
  }

  public LoginOption tfaStrategy(String tfaStrategy) {
    this.tfaStrategy = tfaStrategy;
    return this;
  }

  /**
   * Two-factor authentication being used by this login option. TFA supported: SMS
   * and TOTP.
   * 
   * @return tfaStrategy
   */

  @JsonProperty("tfaStrategy")
  public String getTfaStrategy() {
    return tfaStrategy;
  }

  public void setTfaStrategy(String tfaStrategy) {
    this.tfaStrategy = tfaStrategy;
  }

  public LoginOption type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of authentication. See [Authentication](#section/Authentication) for
   * more details.
   * 
   * @return type
   */

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LoginOption userManagementSource(String userManagementSource) {
    this.userManagementSource = userManagementSource;
    return this;
  }

  /**
   * Specifies if the users are managed internally by Cumulocity IoT (`INTERNAL`)
   * or if the users data are managed by a external system (`REMOTE`).
   * 
   * @return userManagementSource
   */

  @JsonProperty("userManagementSource")
  public String getUserManagementSource() {
    return userManagementSource;
  }

  public void setUserManagementSource(String userManagementSource) {
    this.userManagementSource = userManagementSource;
  }

  public LoginOption visibleOnLoginPage(Boolean visibleOnLoginPage) {
    this.visibleOnLoginPage = visibleOnLoginPage;
    return this;
  }

  /**
   * Indicates if this login option is available in the login page (only for SSO).
   * 
   * @return visibleOnLoginPage
   */

  @JsonProperty("visibleOnLoginPage")
  public Boolean getVisibleOnLoginPage() {
    return visibleOnLoginPage;
  }

  public void setVisibleOnLoginPage(Boolean visibleOnLoginPage) {
    this.visibleOnLoginPage = visibleOnLoginPage;
  }

  public LoginOption underscoreType(String underscoreType) {
    this.underscoreType = underscoreType;
    return this;
  }

  /**
   * The type of authentication.
   * 
   * @return underscoreType
   * @deprecated
   */

  @JsonProperty("_type")
  @Deprecated
  public String getUnderscoreType() {
    return underscoreType;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setUnderscoreType(String underscoreType) {
    this.underscoreType = underscoreType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginOption loginOption = (LoginOption) o;
    return Objects.equals(this.authenticationRestrictions, loginOption.authenticationRestrictions) &&
        Objects.equals(this.enforceStrength, loginOption.enforceStrength) &&
        Objects.equals(this.grantType, loginOption.grantType) &&
        Objects.equals(this.greenMinLength, loginOption.greenMinLength) &&
        Objects.equals(this.id, loginOption.id) &&
        Objects.equals(this.initRequest, loginOption.initRequest) &&
        Objects.equals(this.loginRedirectDomain, loginOption.loginRedirectDomain) &&
        Objects.equals(this.self, loginOption.self) &&
        Objects.equals(this.sessionConfiguration, loginOption.sessionConfiguration) &&
        Objects.equals(this.strengthValidity, loginOption.strengthValidity) &&
        Objects.equals(this.tfaStrategy, loginOption.tfaStrategy) &&
        Objects.equals(this.type, loginOption.type) &&
        Objects.equals(this.userManagementSource, loginOption.userManagementSource) &&
        Objects.equals(this.visibleOnLoginPage, loginOption.visibleOnLoginPage) &&
        Objects.equals(this.underscoreType, loginOption.underscoreType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationRestrictions, enforceStrength, grantType, greenMinLength, id, initRequest,
        loginRedirectDomain, self, sessionConfiguration, strengthValidity, tfaStrategy, type, userManagementSource,
        visibleOnLoginPage, underscoreType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginOption {\n");
    sb.append("    authenticationRestrictions: ").append(toIndentedString(authenticationRestrictions)).append("\n");
    sb.append("    enforceStrength: ").append(toIndentedString(enforceStrength)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    greenMinLength: ").append(toIndentedString(greenMinLength)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initRequest: ").append(toIndentedString(initRequest)).append("\n");
    sb.append("    loginRedirectDomain: ").append(toIndentedString(loginRedirectDomain)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sessionConfiguration: ").append(toIndentedString(sessionConfiguration)).append("\n");
    sb.append("    strengthValidity: ").append(toIndentedString(strengthValidity)).append("\n");
    sb.append("    tfaStrategy: ").append(toIndentedString(tfaStrategy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userManagementSource: ").append(toIndentedString(userManagementSource)).append("\n");
    sb.append("    visibleOnLoginPage: ").append(toIndentedString(visibleOnLoginPage)).append("\n");
    sb.append("    underscoreType: ").append(toIndentedString(underscoreType)).append("\n");
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
