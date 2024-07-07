package org.cpo.c8y.model;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
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
 * PostLoginOptionCollectionResourceRequest
 */

@JsonTypeName("postLoginOptionCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostLoginOptionCollectionResourceRequest {

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

  private JsonNullable<Object> id = JsonNullable.<Object>undefined();

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

  public PostLoginOptionCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostLoginOptionCollectionResourceRequest(String providerName, TypeEnum type) {
    this.providerName = providerName;
    this.type = type;
  }

  public PostLoginOptionCollectionResourceRequest accessTokenToUserDataMapping(
      AuthConfigAccessTokenToUserDataMapping accessTokenToUserDataMapping) {
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

  public PostLoginOptionCollectionResourceRequest audience(URI audience) {
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

  public PostLoginOptionCollectionResourceRequest authorizationRequest(
      AuthConfigAuthorizationRequest authorizationRequest) {
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

  public PostLoginOptionCollectionResourceRequest authenticationRestrictions(
      BasicAuthenticationRestrictions authenticationRestrictions) {
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

  public PostLoginOptionCollectionResourceRequest buttonName(String buttonName) {
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

  public PostLoginOptionCollectionResourceRequest clientId(String clientId) {
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

  public PostLoginOptionCollectionResourceRequest grantType(GrantTypeEnum grantType) {
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

  public PostLoginOptionCollectionResourceRequest id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * 
   * @return id
   */

  @JsonProperty("id")
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public PostLoginOptionCollectionResourceRequest issuer(URI issuer) {
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

  public PostLoginOptionCollectionResourceRequest logoutRequest(AuthConfigLogoutRequest logoutRequest) {
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

  public PostLoginOptionCollectionResourceRequest onlyManagementTenantAccess(Boolean onlyManagementTenantAccess) {
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

  public PostLoginOptionCollectionResourceRequest onNewUser(AuthConfigOnNewUser onNewUser) {
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

  public PostLoginOptionCollectionResourceRequest providerName(String providerName) {
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

  public PostLoginOptionCollectionResourceRequest redirectToPlatform(URI redirectToPlatform) {
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

  public PostLoginOptionCollectionResourceRequest refreshRequest(AuthConfigRefreshRequest refreshRequest) {
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

  public PostLoginOptionCollectionResourceRequest self(URI self) {
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

  public PostLoginOptionCollectionResourceRequest sessionConfiguration(OAuthSessionConfiguration sessionConfiguration) {
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

  public PostLoginOptionCollectionResourceRequest signatureVerificationConfig(
      AuthConfigSignatureVerificationConfig signatureVerificationConfig) {
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

  public PostLoginOptionCollectionResourceRequest template(String template) {
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

  public PostLoginOptionCollectionResourceRequest tokenRequest(AuthConfigTokenRequest tokenRequest) {
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

  public PostLoginOptionCollectionResourceRequest type(TypeEnum type) {
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

  public PostLoginOptionCollectionResourceRequest userIdConfig(AuthConfigUserIdConfig userIdConfig) {
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

  public PostLoginOptionCollectionResourceRequest userManagementSource(UserManagementSourceEnum userManagementSource) {
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

  public PostLoginOptionCollectionResourceRequest visibleOnLoginPage(Boolean visibleOnLoginPage) {
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

  public PostLoginOptionCollectionResourceRequest externalTokenConfig(
      AuthConfigExternalTokenConfig externalTokenConfig) {
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
  public PostLoginOptionCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostLoginOptionCollectionResourceRequest postLoginOptionCollectionResourceRequest = (PostLoginOptionCollectionResourceRequest) o;
    return Objects.equals(this.accessTokenToUserDataMapping,
        postLoginOptionCollectionResourceRequest.accessTokenToUserDataMapping) &&
        Objects.equals(this.audience, postLoginOptionCollectionResourceRequest.audience) &&
        Objects.equals(this.authorizationRequest, postLoginOptionCollectionResourceRequest.authorizationRequest) &&
        Objects.equals(this.authenticationRestrictions,
            postLoginOptionCollectionResourceRequest.authenticationRestrictions)
        &&
        Objects.equals(this.buttonName, postLoginOptionCollectionResourceRequest.buttonName) &&
        Objects.equals(this.clientId, postLoginOptionCollectionResourceRequest.clientId) &&
        Objects.equals(this.grantType, postLoginOptionCollectionResourceRequest.grantType) &&
        equalsNullable(this.id, postLoginOptionCollectionResourceRequest.id) &&
        Objects.equals(this.issuer, postLoginOptionCollectionResourceRequest.issuer) &&
        Objects.equals(this.logoutRequest, postLoginOptionCollectionResourceRequest.logoutRequest) &&
        Objects.equals(this.onlyManagementTenantAccess,
            postLoginOptionCollectionResourceRequest.onlyManagementTenantAccess)
        &&
        Objects.equals(this.onNewUser, postLoginOptionCollectionResourceRequest.onNewUser) &&
        Objects.equals(this.providerName, postLoginOptionCollectionResourceRequest.providerName) &&
        Objects.equals(this.redirectToPlatform, postLoginOptionCollectionResourceRequest.redirectToPlatform) &&
        Objects.equals(this.refreshRequest, postLoginOptionCollectionResourceRequest.refreshRequest) &&
        Objects.equals(this.self, postLoginOptionCollectionResourceRequest.self) &&
        Objects.equals(this.sessionConfiguration, postLoginOptionCollectionResourceRequest.sessionConfiguration) &&
        Objects.equals(this.signatureVerificationConfig,
            postLoginOptionCollectionResourceRequest.signatureVerificationConfig)
        &&
        Objects.equals(this.template, postLoginOptionCollectionResourceRequest.template) &&
        Objects.equals(this.tokenRequest, postLoginOptionCollectionResourceRequest.tokenRequest) &&
        Objects.equals(this.type, postLoginOptionCollectionResourceRequest.type) &&
        Objects.equals(this.userIdConfig, postLoginOptionCollectionResourceRequest.userIdConfig) &&
        Objects.equals(this.userManagementSource, postLoginOptionCollectionResourceRequest.userManagementSource) &&
        Objects.equals(this.visibleOnLoginPage, postLoginOptionCollectionResourceRequest.visibleOnLoginPage) &&
        Objects.equals(this.externalTokenConfig, postLoginOptionCollectionResourceRequest.externalTokenConfig) &&
        Objects.equals(this.additionalProperties, postLoginOptionCollectionResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenToUserDataMapping, audience, authorizationRequest, authenticationRestrictions,
        buttonName, clientId, grantType, hashCodeNullable(id), issuer, logoutRequest, onlyManagementTenantAccess,
        onNewUser, providerName, redirectToPlatform, refreshRequest, self, sessionConfiguration,
        signatureVerificationConfig, template, tokenRequest, type, userIdConfig, userManagementSource,
        visibleOnLoginPage, externalTokenConfig, additionalProperties);
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
    sb.append("class PostLoginOptionCollectionResourceRequest {\n");
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
