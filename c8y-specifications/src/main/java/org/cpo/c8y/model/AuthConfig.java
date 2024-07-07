package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Parameters determining the authentication process.
 */

@JsonTypeName("authConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfig {

  private AuthConfigAccessTokenToUserDataMapping accessTokenToUserDataMapping;

  private URI audience;

  private AuthConfigAuthorizationRequest authorizationRequest;

  private BasicAuthenticationRestrictions authenticationRestrictions;

  private String buttonName;

  private String clientId;

  /**
   * The authentication configuration grant type identifier.
   */
  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("AUTHORIZATION_CODE"),

    PASSWORD("PASSWORD");

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

  private String id;

  private URI issuer;

  private AuthConfigLogoutRequest logoutRequest;

  private Boolean onlyManagementTenantAccess;

  private AuthConfigOnNewUser onNewUser;

  private String providerName;

  private URI redirectToPlatform;

  private AuthConfigRefreshRequest refreshRequest;

  private URI self;

  private OAuthSessionConfiguration sessionConfiguration;

  private AuthConfigSignatureVerificationConfig signatureVerificationConfig;

  private String template;

  private AuthConfigTokenRequest tokenRequest;

  /**
   * The authentication configuration type. Note that the value is case
   * insensitive.
   */
  public enum TypeEnum {
    BASIC("BASIC"),

    OAUTH2("OAUTH2"),

    OAUTH2_INTERNAL("OAUTH2_INTERNAL");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private AuthConfigUserIdConfig userIdConfig;

  /**
   * Indicates whether user data are managed internally by the Cumulocity IoT
   * platform or by an external server. Note that the value is case insensitive.
   */
  public enum UserManagementSourceEnum {
    INTERNAL("INTERNAL"),

    REMOTE("REMOTE");

    private String value;

    UserManagementSourceEnum(String value) {
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
    public static UserManagementSourceEnum fromValue(String value) {
      for (UserManagementSourceEnum b : UserManagementSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UserManagementSourceEnum userManagementSource;

  private Boolean visibleOnLoginPage;

  private AuthConfigExternalTokenConfig externalTokenConfig;

  public AuthConfig() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthConfig(String providerName, TypeEnum type) {
    this.providerName = providerName;
    this.type = type;
  }

  public AuthConfig accessTokenToUserDataMapping(AuthConfigAccessTokenToUserDataMapping accessTokenToUserDataMapping) {
    this.accessTokenToUserDataMapping = accessTokenToUserDataMapping;
    return this;
  }

  /**
   * Get accessTokenToUserDataMapping
   * 
   * @return accessTokenToUserDataMapping
   */

  @JsonProperty("accessTokenToUserDataMapping")
  public AuthConfigAccessTokenToUserDataMapping getAccessTokenToUserDataMapping() {
    return accessTokenToUserDataMapping;
  }

  public void setAccessTokenToUserDataMapping(AuthConfigAccessTokenToUserDataMapping accessTokenToUserDataMapping) {
    this.accessTokenToUserDataMapping = accessTokenToUserDataMapping;
  }

  public AuthConfig audience(URI audience) {
    this.audience = audience;
    return this;
  }

  /**
   * SSO specific. Token audience.
   * 
   * @return audience
   */

  @JsonProperty("audience")
  public URI getAudience() {
    return audience;
  }

  public void setAudience(URI audience) {
    this.audience = audience;
  }

  public AuthConfig authorizationRequest(AuthConfigAuthorizationRequest authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
    return this;
  }

  /**
   * Get authorizationRequest
   * 
   * @return authorizationRequest
   */

  @JsonProperty("authorizationRequest")
  public AuthConfigAuthorizationRequest getAuthorizationRequest() {
    return authorizationRequest;
  }

  public void setAuthorizationRequest(AuthConfigAuthorizationRequest authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
  }

  public AuthConfig authenticationRestrictions(BasicAuthenticationRestrictions authenticationRestrictions) {
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

  public AuthConfig buttonName(String buttonName) {
    this.buttonName = buttonName;
    return this;
  }

  /**
   * SSO specific. Information for the UI about the name displayed on the external
   * server login button.
   * 
   * @return buttonName
   */

  @JsonProperty("buttonName")
  public String getButtonName() {
    return buttonName;
  }

  public void setButtonName(String buttonName) {
    this.buttonName = buttonName;
  }

  public AuthConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * SSO specific. The identifier of the Cumulocity IoT tenant on the external
   * authorization server.
   * 
   * @return clientId
   */

  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AuthConfig grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * The authentication configuration grant type identifier.
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

  public AuthConfig id(String id) {
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

  public AuthConfig issuer(URI issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * SSO specific. External token issuer.
   * 
   * @return issuer
   */

  @JsonProperty("issuer")
  public URI getIssuer() {
    return issuer;
  }

  public void setIssuer(URI issuer) {
    this.issuer = issuer;
  }

  public AuthConfig logoutRequest(AuthConfigLogoutRequest logoutRequest) {
    this.logoutRequest = logoutRequest;
    return this;
  }

  /**
   * Get logoutRequest
   * 
   * @return logoutRequest
   */

  @JsonProperty("logoutRequest")
  public AuthConfigLogoutRequest getLogoutRequest() {
    return logoutRequest;
  }

  public void setLogoutRequest(AuthConfigLogoutRequest logoutRequest) {
    this.logoutRequest = logoutRequest;
  }

  public AuthConfig onlyManagementTenantAccess(Boolean onlyManagementTenantAccess) {
    this.onlyManagementTenantAccess = onlyManagementTenantAccess;
    return this;
  }

  /**
   * Indicates whether the configuration is only accessible to the management
   * tenant.
   * 
   * @return onlyManagementTenantAccess
   */

  @JsonProperty("onlyManagementTenantAccess")
  public Boolean getOnlyManagementTenantAccess() {
    return onlyManagementTenantAccess;
  }

  public void setOnlyManagementTenantAccess(Boolean onlyManagementTenantAccess) {
    this.onlyManagementTenantAccess = onlyManagementTenantAccess;
  }

  public AuthConfig onNewUser(AuthConfigOnNewUser onNewUser) {
    this.onNewUser = onNewUser;
    return this;
  }

  /**
   * Get onNewUser
   * 
   * @return onNewUser
   */

  @JsonProperty("onNewUser")
  public AuthConfigOnNewUser getOnNewUser() {
    return onNewUser;
  }

  public void setOnNewUser(AuthConfigOnNewUser onNewUser) {
    this.onNewUser = onNewUser;
  }

  public AuthConfig providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The name of the authentication provider.
   * 
   * @return providerName
   */
  @NotNull

  @JsonProperty("providerName")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public AuthConfig redirectToPlatform(URI redirectToPlatform) {
    this.redirectToPlatform = redirectToPlatform;
    return this;
  }

  /**
   * SSO specific. URL used for redirecting to the Cumulocity IoT platform.
   * 
   * @return redirectToPlatform
   */

  @JsonProperty("redirectToPlatform")
  public URI getRedirectToPlatform() {
    return redirectToPlatform;
  }

  public void setRedirectToPlatform(URI redirectToPlatform) {
    this.redirectToPlatform = redirectToPlatform;
  }

  public AuthConfig refreshRequest(AuthConfigRefreshRequest refreshRequest) {
    this.refreshRequest = refreshRequest;
    return this;
  }

  /**
   * Get refreshRequest
   * 
   * @return refreshRequest
   */

  @JsonProperty("refreshRequest")
  public AuthConfigRefreshRequest getRefreshRequest() {
    return refreshRequest;
  }

  public void setRefreshRequest(AuthConfigRefreshRequest refreshRequest) {
    this.refreshRequest = refreshRequest;
  }

  public AuthConfig self(URI self) {
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

  public AuthConfig sessionConfiguration(OAuthSessionConfiguration sessionConfiguration) {
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

  public AuthConfig signatureVerificationConfig(AuthConfigSignatureVerificationConfig signatureVerificationConfig) {
    this.signatureVerificationConfig = signatureVerificationConfig;
    return this;
  }

  /**
   * Get signatureVerificationConfig
   * 
   * @return signatureVerificationConfig
   */

  @JsonProperty("signatureVerificationConfig")
  public AuthConfigSignatureVerificationConfig getSignatureVerificationConfig() {
    return signatureVerificationConfig;
  }

  public void setSignatureVerificationConfig(AuthConfigSignatureVerificationConfig signatureVerificationConfig) {
    this.signatureVerificationConfig = signatureVerificationConfig;
  }

  public AuthConfig template(String template) {
    this.template = template;
    return this;
  }

  /**
   * SSO specific. Template name used by the UI.
   * 
   * @return template
   */

  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public AuthConfig tokenRequest(AuthConfigTokenRequest tokenRequest) {
    this.tokenRequest = tokenRequest;
    return this;
  }

  /**
   * Get tokenRequest
   * 
   * @return tokenRequest
   */

  @JsonProperty("tokenRequest")
  public AuthConfigTokenRequest getTokenRequest() {
    return tokenRequest;
  }

  public void setTokenRequest(AuthConfigTokenRequest tokenRequest) {
    this.tokenRequest = tokenRequest;
  }

  public AuthConfig type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The authentication configuration type. Note that the value is case
   * insensitive.
   * 
   * @return type
   */
  @NotNull

  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AuthConfig userIdConfig(AuthConfigUserIdConfig userIdConfig) {
    this.userIdConfig = userIdConfig;
    return this;
  }

  /**
   * Get userIdConfig
   * 
   * @return userIdConfig
   */

  @JsonProperty("userIdConfig")
  public AuthConfigUserIdConfig getUserIdConfig() {
    return userIdConfig;
  }

  public void setUserIdConfig(AuthConfigUserIdConfig userIdConfig) {
    this.userIdConfig = userIdConfig;
  }

  public AuthConfig userManagementSource(UserManagementSourceEnum userManagementSource) {
    this.userManagementSource = userManagementSource;
    return this;
  }

  /**
   * Indicates whether user data are managed internally by the Cumulocity IoT
   * platform or by an external server. Note that the value is case insensitive.
   * 
   * @return userManagementSource
   */

  @JsonProperty("userManagementSource")
  public UserManagementSourceEnum getUserManagementSource() {
    return userManagementSource;
  }

  public void setUserManagementSource(UserManagementSourceEnum userManagementSource) {
    this.userManagementSource = userManagementSource;
  }

  public AuthConfig visibleOnLoginPage(Boolean visibleOnLoginPage) {
    this.visibleOnLoginPage = visibleOnLoginPage;
    return this;
  }

  /**
   * Information for the UI if the respective authentication form should be
   * visible for the user.
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

  public AuthConfig externalTokenConfig(AuthConfigExternalTokenConfig externalTokenConfig) {
    this.externalTokenConfig = externalTokenConfig;
    return this;
  }

  /**
   * Get externalTokenConfig
   * 
   * @return externalTokenConfig
   */

  @JsonProperty("externalTokenConfig")
  public AuthConfigExternalTokenConfig getExternalTokenConfig() {
    return externalTokenConfig;
  }

  public void setExternalTokenConfig(AuthConfigExternalTokenConfig externalTokenConfig) {
    this.externalTokenConfig = externalTokenConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfig authConfig = (AuthConfig) o;
    return Objects.equals(this.accessTokenToUserDataMapping, authConfig.accessTokenToUserDataMapping) &&
        Objects.equals(this.audience, authConfig.audience) &&
        Objects.equals(this.authorizationRequest, authConfig.authorizationRequest) &&
        Objects.equals(this.authenticationRestrictions, authConfig.authenticationRestrictions) &&
        Objects.equals(this.buttonName, authConfig.buttonName) &&
        Objects.equals(this.clientId, authConfig.clientId) &&
        Objects.equals(this.grantType, authConfig.grantType) &&
        Objects.equals(this.id, authConfig.id) &&
        Objects.equals(this.issuer, authConfig.issuer) &&
        Objects.equals(this.logoutRequest, authConfig.logoutRequest) &&
        Objects.equals(this.onlyManagementTenantAccess, authConfig.onlyManagementTenantAccess) &&
        Objects.equals(this.onNewUser, authConfig.onNewUser) &&
        Objects.equals(this.providerName, authConfig.providerName) &&
        Objects.equals(this.redirectToPlatform, authConfig.redirectToPlatform) &&
        Objects.equals(this.refreshRequest, authConfig.refreshRequest) &&
        Objects.equals(this.self, authConfig.self) &&
        Objects.equals(this.sessionConfiguration, authConfig.sessionConfiguration) &&
        Objects.equals(this.signatureVerificationConfig, authConfig.signatureVerificationConfig) &&
        Objects.equals(this.template, authConfig.template) &&
        Objects.equals(this.tokenRequest, authConfig.tokenRequest) &&
        Objects.equals(this.type, authConfig.type) &&
        Objects.equals(this.userIdConfig, authConfig.userIdConfig) &&
        Objects.equals(this.userManagementSource, authConfig.userManagementSource) &&
        Objects.equals(this.visibleOnLoginPage, authConfig.visibleOnLoginPage) &&
        Objects.equals(this.externalTokenConfig, authConfig.externalTokenConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenToUserDataMapping, audience, authorizationRequest, authenticationRestrictions,
        buttonName, clientId, grantType, id, issuer, logoutRequest, onlyManagementTenantAccess, onNewUser, providerName,
        redirectToPlatform, refreshRequest, self, sessionConfiguration, signatureVerificationConfig, template,
        tokenRequest, type, userIdConfig, userManagementSource, visibleOnLoginPage, externalTokenConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfig {\n");
    sb.append("    accessTokenToUserDataMapping: ").append(toIndentedString(accessTokenToUserDataMapping)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    authorizationRequest: ").append(toIndentedString(authorizationRequest)).append("\n");
    sb.append("    authenticationRestrictions: ").append(toIndentedString(authenticationRestrictions)).append("\n");
    sb.append("    buttonName: ").append(toIndentedString(buttonName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    logoutRequest: ").append(toIndentedString(logoutRequest)).append("\n");
    sb.append("    onlyManagementTenantAccess: ").append(toIndentedString(onlyManagementTenantAccess)).append("\n");
    sb.append("    onNewUser: ").append(toIndentedString(onNewUser)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    redirectToPlatform: ").append(toIndentedString(redirectToPlatform)).append("\n");
    sb.append("    refreshRequest: ").append(toIndentedString(refreshRequest)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sessionConfiguration: ").append(toIndentedString(sessionConfiguration)).append("\n");
    sb.append("    signatureVerificationConfig: ").append(toIndentedString(signatureVerificationConfig)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    tokenRequest: ").append(toIndentedString(tokenRequest)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userIdConfig: ").append(toIndentedString(userIdConfig)).append("\n");
    sb.append("    userManagementSource: ").append(toIndentedString(userManagementSource)).append("\n");
    sb.append("    visibleOnLoginPage: ").append(toIndentedString(visibleOnLoginPage)).append("\n");
    sb.append("    externalTokenConfig: ").append(toIndentedString(externalTokenConfig)).append("\n");
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
