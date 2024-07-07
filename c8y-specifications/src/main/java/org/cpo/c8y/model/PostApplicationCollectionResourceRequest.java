package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostApplicationCollectionResourceRequest
 */

@JsonTypeName("postApplicationCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostApplicationCollectionResourceRequest {

  /**
   * Application access level for other tenants.
   */
  public enum AvailabilityEnum {
    MARKET("MARKET"),

    PRIVATE("PRIVATE");

    private String value;

    AvailabilityEnum(String value) {
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
    public static AvailabilityEnum fromValue(String value) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AvailabilityEnum availability = AvailabilityEnum.PRIVATE;

  private String contextPath;

  private String description;

  private String id;

  private String key;

  private String name;

  private ApplicationOwner owner;

  private URI self;

  /**
   * The type of the application.
   */
  public enum TypeEnum {
    EXTERNAL("EXTERNAL"),

    HOSTED("HOSTED"),

    MICROSERVICE("MICROSERVICE");

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

  private ApplicationManifest manifest;

  private List<String> roles = new ArrayList<>();

  private List<String> requiredRoles = new ArrayList<>();

  private Boolean breadcrumbs;

  private String contentSecurityPolicy;

  private String dynamicOptionsUrl;

  private String globalTitle;

  private Boolean legacy;

  private Boolean rightDrawer;

  private Boolean upgrade;

  private String activeVersionId;

  @Deprecated
  private String resourcesUrl;

  public PostApplicationCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostApplicationCollectionResourceRequest(String key, String name, TypeEnum type) {
    this.key = key;
    this.name = name;
    this.type = type;
  }

  public PostApplicationCollectionResourceRequest availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Application access level for other tenants.
   * 
   * @return availability
   */

  @JsonProperty("availability")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public PostApplicationCollectionResourceRequest contextPath(String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * The context path in the URL makes the application accessible. Mandatory when
   * the type of the application is `HOSTED`.
   * 
   * @return contextPath
   */

  @JsonProperty("contextPath")
  public String getContextPath() {
    return contextPath;
  }

  public void setContextPath(String contextPath) {
    this.contextPath = contextPath;
  }

  public PostApplicationCollectionResourceRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the application.
   * 
   * @return description
   */

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostApplicationCollectionResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the application.
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

  public PostApplicationCollectionResourceRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Applications, regardless of their form, are identified by an application key.
   * 
   * @return key
   */
  @NotNull

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostApplicationCollectionResourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the application.
   * 
   * @return name
   */
  @NotNull

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostApplicationCollectionResourceRequest owner(ApplicationOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * 
   * @return owner
   */

  @JsonProperty("owner")
  public ApplicationOwner getOwner() {
    return owner;
  }

  public void setOwner(ApplicationOwner owner) {
    this.owner = owner;
  }

  public PostApplicationCollectionResourceRequest self(URI self) {
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

  public PostApplicationCollectionResourceRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the application.
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

  public PostApplicationCollectionResourceRequest manifest(ApplicationManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Get manifest
   * 
   * @return manifest
   */

  @JsonProperty("manifest")
  public ApplicationManifest getManifest() {
    return manifest;
  }

  public void setManifest(ApplicationManifest manifest) {
    this.manifest = manifest;
  }

  public PostApplicationCollectionResourceRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public PostApplicationCollectionResourceRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Roles provided by the microservice.
   * 
   * @return roles
   */

  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public PostApplicationCollectionResourceRequest requiredRoles(List<String> requiredRoles) {
    this.requiredRoles = requiredRoles;
    return this;
  }

  public PostApplicationCollectionResourceRequest addRequiredRolesItem(String requiredRolesItem) {
    if (this.requiredRoles == null) {
      this.requiredRoles = new ArrayList<>();
    }
    this.requiredRoles.add(requiredRolesItem);
    return this;
  }

  /**
   * List of permissions required by a microservice to work.
   * 
   * @return requiredRoles
   */

  @JsonProperty("requiredRoles")
  public List<String> getRequiredRoles() {
    return requiredRoles;
  }

  public void setRequiredRoles(List<String> requiredRoles) {
    this.requiredRoles = requiredRoles;
  }

  public PostApplicationCollectionResourceRequest breadcrumbs(Boolean breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  /**
   * A flag to indicate if the application has a breadcrumbs navigation on the UI.
   * > **&#9432; Info:** This property is specific to the web application type.
   * 
   * @return breadcrumbs
   */

  @JsonProperty("breadcrumbs")
  public Boolean getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(Boolean breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }

  public PostApplicationCollectionResourceRequest contentSecurityPolicy(String contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
    return this;
  }

  /**
   * The content security policy of the application. > **&#9432; Info:** This
   * property is specific to the web application type.
   * 
   * @return contentSecurityPolicy
   */

  @JsonProperty("contentSecurityPolicy")
  public String getContentSecurityPolicy() {
    return contentSecurityPolicy;
  }

  public void setContentSecurityPolicy(String contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
  }

  public PostApplicationCollectionResourceRequest dynamicOptionsUrl(String dynamicOptionsUrl) {
    this.dynamicOptionsUrl = dynamicOptionsUrl;
    return this;
  }

  /**
   * A URL to a JSON object with dynamic content options. > **&#9432; Info:** This
   * property is specific to the web application type.
   * 
   * @return dynamicOptionsUrl
   */

  @JsonProperty("dynamicOptionsUrl")
  public String getDynamicOptionsUrl() {
    return dynamicOptionsUrl;
  }

  public void setDynamicOptionsUrl(String dynamicOptionsUrl) {
    this.dynamicOptionsUrl = dynamicOptionsUrl;
  }

  public PostApplicationCollectionResourceRequest globalTitle(String globalTitle) {
    this.globalTitle = globalTitle;
    return this;
  }

  /**
   * The global title of the application. > **&#9432; Info:** This property is
   * specific to the web application type.
   * 
   * @return globalTitle
   */

  @JsonProperty("globalTitle")
  public String getGlobalTitle() {
    return globalTitle;
  }

  public void setGlobalTitle(String globalTitle) {
    this.globalTitle = globalTitle;
  }

  public PostApplicationCollectionResourceRequest legacy(Boolean legacy) {
    this.legacy = legacy;
    return this;
  }

  /**
   * A flag that shows if the application is a legacy application or not. >
   * **&#9432; Info:** This property is specific to the web application type.
   * 
   * @return legacy
   */

  @JsonProperty("legacy")
  public Boolean getLegacy() {
    return legacy;
  }

  public void setLegacy(Boolean legacy) {
    this.legacy = legacy;
  }

  public PostApplicationCollectionResourceRequest rightDrawer(Boolean rightDrawer) {
    this.rightDrawer = rightDrawer;
    return this;
  }

  /**
   * A flag to indicate if the application uses the UI context menu on the right
   * side. > **&#9432; Info:** This property is specific to the web application
   * type.
   * 
   * @return rightDrawer
   */

  @JsonProperty("rightDrawer")
  public Boolean getRightDrawer() {
    return rightDrawer;
  }

  public void setRightDrawer(Boolean rightDrawer) {
    this.rightDrawer = rightDrawer;
  }

  public PostApplicationCollectionResourceRequest upgrade(Boolean upgrade) {
    this.upgrade = upgrade;
    return this;
  }

  /**
   * A flag that shows if the application is hybrid and using Angular and
   * AngularJS simultaneously. > **&#9432; Info:** This property is specific to
   * the web application type.
   * 
   * @return upgrade
   */

  @JsonProperty("upgrade")
  public Boolean getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(Boolean upgrade) {
    this.upgrade = upgrade;
  }

  public PostApplicationCollectionResourceRequest activeVersionId(String activeVersionId) {
    this.activeVersionId = activeVersionId;
    return this;
  }

  /**
   * The active version ID of the application. For microservice applications the
   * active version ID is the microservice manifest version ID.
   * 
   * @return activeVersionId
   */

  @JsonProperty("activeVersionId")
  public String getActiveVersionId() {
    return activeVersionId;
  }

  public void setActiveVersionId(String activeVersionId) {
    this.activeVersionId = activeVersionId;
  }

  public PostApplicationCollectionResourceRequest resourcesUrl(String resourcesUrl) {
    this.resourcesUrl = resourcesUrl;
    return this;
  }

  /**
   * URL to the application base directory hosted on an external server. Only
   * present in legacy hosted applications.
   * 
   * @return resourcesUrl
   * @deprecated
   */

  @JsonProperty("resourcesUrl")
  @Deprecated
  public String getResourcesUrl() {
    return resourcesUrl;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setResourcesUrl(String resourcesUrl) {
    this.resourcesUrl = resourcesUrl;
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
  public PostApplicationCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostApplicationCollectionResourceRequest postApplicationCollectionResourceRequest = (PostApplicationCollectionResourceRequest) o;
    return Objects.equals(this.availability, postApplicationCollectionResourceRequest.availability) &&
        Objects.equals(this.contextPath, postApplicationCollectionResourceRequest.contextPath) &&
        Objects.equals(this.description, postApplicationCollectionResourceRequest.description) &&
        Objects.equals(this.id, postApplicationCollectionResourceRequest.id) &&
        Objects.equals(this.key, postApplicationCollectionResourceRequest.key) &&
        Objects.equals(this.name, postApplicationCollectionResourceRequest.name) &&
        Objects.equals(this.owner, postApplicationCollectionResourceRequest.owner) &&
        Objects.equals(this.self, postApplicationCollectionResourceRequest.self) &&
        Objects.equals(this.type, postApplicationCollectionResourceRequest.type) &&
        Objects.equals(this.manifest, postApplicationCollectionResourceRequest.manifest) &&
        Objects.equals(this.roles, postApplicationCollectionResourceRequest.roles) &&
        Objects.equals(this.requiredRoles, postApplicationCollectionResourceRequest.requiredRoles) &&
        Objects.equals(this.breadcrumbs, postApplicationCollectionResourceRequest.breadcrumbs) &&
        Objects.equals(this.contentSecurityPolicy, postApplicationCollectionResourceRequest.contentSecurityPolicy) &&
        Objects.equals(this.dynamicOptionsUrl, postApplicationCollectionResourceRequest.dynamicOptionsUrl) &&
        Objects.equals(this.globalTitle, postApplicationCollectionResourceRequest.globalTitle) &&
        Objects.equals(this.legacy, postApplicationCollectionResourceRequest.legacy) &&
        Objects.equals(this.rightDrawer, postApplicationCollectionResourceRequest.rightDrawer) &&
        Objects.equals(this.upgrade, postApplicationCollectionResourceRequest.upgrade) &&
        Objects.equals(this.activeVersionId, postApplicationCollectionResourceRequest.activeVersionId) &&
        Objects.equals(this.resourcesUrl, postApplicationCollectionResourceRequest.resourcesUrl) &&
        Objects.equals(this.additionalProperties, postApplicationCollectionResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, contextPath, description, id, key, name, owner, self, type, manifest, roles,
        requiredRoles, breadcrumbs, contentSecurityPolicy, dynamicOptionsUrl, globalTitle, legacy, rightDrawer, upgrade,
        activeVersionId, resourcesUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApplicationCollectionResourceRequest {\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    requiredRoles: ").append(toIndentedString(requiredRoles)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    contentSecurityPolicy: ").append(toIndentedString(contentSecurityPolicy)).append("\n");
    sb.append("    dynamicOptionsUrl: ").append(toIndentedString(dynamicOptionsUrl)).append("\n");
    sb.append("    globalTitle: ").append(toIndentedString(globalTitle)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
    sb.append("    rightDrawer: ").append(toIndentedString(rightDrawer)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
    sb.append("    activeVersionId: ").append(toIndentedString(activeVersionId)).append("\n");
    sb.append("    resourcesUrl: ").append(toIndentedString(resourcesUrl)).append("\n");

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
