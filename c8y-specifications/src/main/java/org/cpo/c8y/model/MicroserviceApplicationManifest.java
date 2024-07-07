package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * The manifest of the microservice application.
 */

@JsonTypeName("microservice_application_manifest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MicroserviceApplicationManifest implements ApplicationManifest {

  private String apiVersion;

  /**
   * The billing mode of the application. In case of RESOURCES, the number of
   * resources used is exposed for billing calculation per usage. In case of
   * SUBSCRIPTION, all resources usage is counted for the microservice owner and
   * the subtenant is charged for subscription.
   */
  public enum BillingModeEnum {
    RESOURCES("RESOURCES"),

    SUBSCRIPTION("SUBSCRIPTION");

    private String value;

    BillingModeEnum(String value) {
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
    public static BillingModeEnum fromValue(String value) {
      for (BillingModeEnum b : BillingModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BillingModeEnum billingMode = BillingModeEnum.RESOURCES;

  private String contextPath;

  private List<MicroserviceApplicationManifestExtensionsInner> extensions = new ArrayList<>();

  /**
   * Deployment isolation. In case of PER_TENANT, there is a separate instance for
   * each tenant. Otherwise, there is one single instance for all subscribed
   * tenants. This will affect billing.
   */
  public enum IsolationEnum {
    MULTI_TENANT("MULTI_TENANT"),

    PER_TENANT("PER_TENANT");

    private String value;

    IsolationEnum(String value) {
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
    public static IsolationEnum fromValue(String value) {
      for (IsolationEnum b : IsolationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IsolationEnum isolation;

  private MicroserviceApplicationManifestLivenessProbe livenessProbe;

  private MicroserviceApplicationManifestProvider provider;

  private MicroserviceApplicationManifestReadinessProbe readinessProbe;

  private MicroserviceApplicationManifestRequestResources requestResources;

  private MicroserviceApplicationManifestResources resources;

  private List<String> roles = new ArrayList<>();

  private List<String> requiredRoles = new ArrayList<>();

  /**
   * Allows to configure a microservice auto scaling policy. If the microservice
   * uses a lot of CPU resources, a second instance will be created automatically
   * when this is set to `AUTO`. The default is `NONE`, meaning auto scaling will
   * not happen.
   */
  public enum ScaleEnum {
    NONE("NONE"),

    AUTO("AUTO");

    private String value;

    ScaleEnum(String value) {
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
    public static ScaleEnum fromValue(String value) {
      for (ScaleEnum b : ScaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ScaleEnum scale = ScaleEnum.NONE;

  private List<ApplicationSettingsInner> settings = new ArrayList<>();

  private String settingsCategory;

  private String version;

  public MicroserviceApplicationManifest apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Document type format discriminator, for future changes in format.
   * 
   * @return apiVersion
   */

  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public MicroserviceApplicationManifest billingMode(BillingModeEnum billingMode) {
    this.billingMode = billingMode;
    return this;
  }

  /**
   * The billing mode of the application. In case of RESOURCES, the number of
   * resources used is exposed for billing calculation per usage. In case of
   * SUBSCRIPTION, all resources usage is counted for the microservice owner and
   * the subtenant is charged for subscription.
   * 
   * @return billingMode
   */

  @JsonProperty("billingMode")
  public BillingModeEnum getBillingMode() {
    return billingMode;
  }

  public void setBillingMode(BillingModeEnum billingMode) {
    this.billingMode = billingMode;
  }

  public MicroserviceApplicationManifest contextPath(String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * The context path in the URL makes the application accessible.
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

  public MicroserviceApplicationManifest extensions(List<MicroserviceApplicationManifestExtensionsInner> extensions) {
    this.extensions = extensions;
    return this;
  }

  public MicroserviceApplicationManifest addExtensionsItem(
      MicroserviceApplicationManifestExtensionsInner extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * A list of URL extensions for this microservice application.
   * 
   * @return extensions
   */

  @JsonProperty("extensions")
  public List<MicroserviceApplicationManifestExtensionsInner> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<MicroserviceApplicationManifestExtensionsInner> extensions) {
    this.extensions = extensions;
  }

  public MicroserviceApplicationManifest isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  /**
   * Deployment isolation. In case of PER_TENANT, there is a separate instance for
   * each tenant. Otherwise, there is one single instance for all subscribed
   * tenants. This will affect billing.
   * 
   * @return isolation
   */

  @JsonProperty("isolation")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public MicroserviceApplicationManifest livenessProbe(MicroserviceApplicationManifestLivenessProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Get livenessProbe
   * 
   * @return livenessProbe
   */

  @JsonProperty("livenessProbe")
  public MicroserviceApplicationManifestLivenessProbe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(MicroserviceApplicationManifestLivenessProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public MicroserviceApplicationManifest provider(MicroserviceApplicationManifestProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * 
   * @return provider
   */

  @JsonProperty("provider")
  public MicroserviceApplicationManifestProvider getProvider() {
    return provider;
  }

  public void setProvider(MicroserviceApplicationManifestProvider provider) {
    this.provider = provider;
  }

  public MicroserviceApplicationManifest readinessProbe(MicroserviceApplicationManifestReadinessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  /**
   * Get readinessProbe
   * 
   * @return readinessProbe
   */

  @JsonProperty("readinessProbe")
  public MicroserviceApplicationManifestReadinessProbe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(MicroserviceApplicationManifestReadinessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public MicroserviceApplicationManifest requestResources(
      MicroserviceApplicationManifestRequestResources requestResources) {
    this.requestResources = requestResources;
    return this;
  }

  /**
   * Get requestResources
   * 
   * @return requestResources
   */

  @JsonProperty("requestResources")
  public MicroserviceApplicationManifestRequestResources getRequestResources() {
    return requestResources;
  }

  public void setRequestResources(MicroserviceApplicationManifestRequestResources requestResources) {
    this.requestResources = requestResources;
  }

  public MicroserviceApplicationManifest resources(MicroserviceApplicationManifestResources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * 
   * @return resources
   */

  @JsonProperty("resources")
  public MicroserviceApplicationManifestResources getResources() {
    return resources;
  }

  public void setResources(MicroserviceApplicationManifestResources resources) {
    this.resources = resources;
  }

  public MicroserviceApplicationManifest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public MicroserviceApplicationManifest addRolesItem(String rolesItem) {
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

  public MicroserviceApplicationManifest requiredRoles(List<String> requiredRoles) {
    this.requiredRoles = requiredRoles;
    return this;
  }

  public MicroserviceApplicationManifest addRequiredRolesItem(String requiredRolesItem) {
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

  public MicroserviceApplicationManifest scale(ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Allows to configure a microservice auto scaling policy. If the microservice
   * uses a lot of CPU resources, a second instance will be created automatically
   * when this is set to `AUTO`. The default is `NONE`, meaning auto scaling will
   * not happen.
   * 
   * @return scale
   */

  @JsonProperty("scale")
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(ScaleEnum scale) {
    this.scale = scale;
  }

  public MicroserviceApplicationManifest settings(List<ApplicationSettingsInner> settings) {
    this.settings = settings;
    return this;
  }

  public MicroserviceApplicationManifest addSettingsItem(ApplicationSettingsInner settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * A list of settings objects for this microservice application.
   * 
   * @return settings
   */

  @JsonProperty("settings")
  public List<ApplicationSettingsInner> getSettings() {
    return settings;
  }

  public void setSettings(List<ApplicationSettingsInner> settings) {
    this.settings = settings;
  }

  public MicroserviceApplicationManifest settingsCategory(String settingsCategory) {
    this.settingsCategory = settingsCategory;
    return this;
  }

  /**
   * Allows to specify a custom category for microservice settings. By default,
   * `contextPath` is used.
   * 
   * @return settingsCategory
   */

  @JsonProperty("settingsCategory")
  public String getSettingsCategory() {
    return settingsCategory;
  }

  public void setSettingsCategory(String settingsCategory) {
    this.settingsCategory = settingsCategory;
  }

  public MicroserviceApplicationManifest version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Application version. Must be a correct [SemVer](https://semver.org/) value
   * but the \"+\" sign is disallowed.
   * 
   * @return version
   */

  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroserviceApplicationManifest microserviceApplicationManifest = (MicroserviceApplicationManifest) o;
    return Objects.equals(this.apiVersion, microserviceApplicationManifest.apiVersion) &&
        Objects.equals(this.billingMode, microserviceApplicationManifest.billingMode) &&
        Objects.equals(this.contextPath, microserviceApplicationManifest.contextPath) &&
        Objects.equals(this.extensions, microserviceApplicationManifest.extensions) &&
        Objects.equals(this.isolation, microserviceApplicationManifest.isolation) &&
        Objects.equals(this.livenessProbe, microserviceApplicationManifest.livenessProbe) &&
        Objects.equals(this.provider, microserviceApplicationManifest.provider) &&
        Objects.equals(this.readinessProbe, microserviceApplicationManifest.readinessProbe) &&
        Objects.equals(this.requestResources, microserviceApplicationManifest.requestResources) &&
        Objects.equals(this.resources, microserviceApplicationManifest.resources) &&
        Objects.equals(this.roles, microserviceApplicationManifest.roles) &&
        Objects.equals(this.requiredRoles, microserviceApplicationManifest.requiredRoles) &&
        Objects.equals(this.scale, microserviceApplicationManifest.scale) &&
        Objects.equals(this.settings, microserviceApplicationManifest.settings) &&
        Objects.equals(this.settingsCategory, microserviceApplicationManifest.settingsCategory) &&
        Objects.equals(this.version, microserviceApplicationManifest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, billingMode, contextPath, extensions, isolation, livenessProbe, provider,
        readinessProbe, requestResources, resources, roles, requiredRoles, scale, settings, settingsCategory, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroserviceApplicationManifest {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    requestResources: ").append(toIndentedString(requestResources)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    requiredRoles: ").append(toIndentedString(requiredRoles)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    settingsCategory: ").append(toIndentedString(settingsCategory)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
