package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Application
 */

@JsonTypeName("application")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class Application {

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

  public Application availability(AvailabilityEnum availability) {
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

  public Application contextPath(String contextPath) {
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

  public Application description(String description) {
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

  public Application id(String id) {
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

  public Application key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Applications, regardless of their form, are identified by an application key.
   * 
   * @return key
   */

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Application name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the application.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Application owner(ApplicationOwner owner) {
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

  public Application self(URI self) {
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

  public Application type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the application.
   * 
   * @return type
   */

  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Application manifest(ApplicationManifest manifest) {
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

  public Application roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Application addRolesItem(String rolesItem) {
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

  public Application requiredRoles(List<String> requiredRoles) {
    this.requiredRoles = requiredRoles;
    return this;
  }

  public Application addRequiredRolesItem(String requiredRolesItem) {
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

  public Application breadcrumbs(Boolean breadcrumbs) {
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

  public Application contentSecurityPolicy(String contentSecurityPolicy) {
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

  public Application dynamicOptionsUrl(String dynamicOptionsUrl) {
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

  public Application globalTitle(String globalTitle) {
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

  public Application legacy(Boolean legacy) {
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

  public Application rightDrawer(Boolean rightDrawer) {
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

  public Application upgrade(Boolean upgrade) {
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

  public Application activeVersionId(String activeVersionId) {
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

  public Application resourcesUrl(String resourcesUrl) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.availability, application.availability) &&
        Objects.equals(this.contextPath, application.contextPath) &&
        Objects.equals(this.description, application.description) &&
        Objects.equals(this.id, application.id) &&
        Objects.equals(this.key, application.key) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.owner, application.owner) &&
        Objects.equals(this.self, application.self) &&
        Objects.equals(this.type, application.type) &&
        Objects.equals(this.manifest, application.manifest) &&
        Objects.equals(this.roles, application.roles) &&
        Objects.equals(this.requiredRoles, application.requiredRoles) &&
        Objects.equals(this.breadcrumbs, application.breadcrumbs) &&
        Objects.equals(this.contentSecurityPolicy, application.contentSecurityPolicy) &&
        Objects.equals(this.dynamicOptionsUrl, application.dynamicOptionsUrl) &&
        Objects.equals(this.globalTitle, application.globalTitle) &&
        Objects.equals(this.legacy, application.legacy) &&
        Objects.equals(this.rightDrawer, application.rightDrawer) &&
        Objects.equals(this.upgrade, application.upgrade) &&
        Objects.equals(this.activeVersionId, application.activeVersionId) &&
        Objects.equals(this.resourcesUrl, application.resourcesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, contextPath, description, id, key, name, owner, self, type, manifest, roles,
        requiredRoles, breadcrumbs, contentSecurityPolicy, dynamicOptionsUrl, globalTitle, legacy, rightDrawer, upgrade,
        activeVersionId, resourcesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
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
