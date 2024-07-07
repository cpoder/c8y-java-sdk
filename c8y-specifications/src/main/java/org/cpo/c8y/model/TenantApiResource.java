package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * TenantApiResource
 */

@JsonTypeName("tenantApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantApiResource {

  private TenantApiResourceOptions options;

  private URI self;

  private TenantApiResourceTenants tenants;

  private String tenantApplications;

  private String tenantApplicationForId;

  private String tenantForId;

  private String tenantOptionsForCategory;

  private String tenantOptionForCategoryAndKey;

  private String tenantSystemOptions;

  private String tenantSystemOptionsForCategoryAndKey;

  public TenantApiResource options(TenantApiResourceOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * 
   * @return options
   */

  @JsonProperty("options")
  public TenantApiResourceOptions getOptions() {
    return options;
  }

  public void setOptions(TenantApiResourceOptions options) {
    this.options = options;
  }

  public TenantApiResource self(URI self) {
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

  public TenantApiResource tenants(TenantApiResourceTenants tenants) {
    this.tenants = tenants;
    return this;
  }

  /**
   * Get tenants
   * 
   * @return tenants
   */

  @JsonProperty("tenants")
  public TenantApiResourceTenants getTenants() {
    return tenants;
  }

  public void setTenants(TenantApiResourceTenants tenants) {
    this.tenants = tenants;
  }

  public TenantApiResource tenantApplications(String tenantApplications) {
    this.tenantApplications = tenantApplications;
    return this;
  }

  /**
   * Retrieves subscribed applications.
   * 
   * @return tenantApplications
   */

  @JsonProperty("tenantApplications")
  public String getTenantApplications() {
    return tenantApplications;
  }

  public void setTenantApplications(String tenantApplications) {
    this.tenantApplications = tenantApplications;
  }

  public TenantApiResource tenantApplicationForId(String tenantApplicationForId) {
    this.tenantApplicationForId = tenantApplicationForId;
    return this;
  }

  /**
   * Represents an individual application reference that can be viewed.
   * 
   * @return tenantApplicationForId
   */

  @JsonProperty("tenantApplicationForId")
  public String getTenantApplicationForId() {
    return tenantApplicationForId;
  }

  public void setTenantApplicationForId(String tenantApplicationForId) {
    this.tenantApplicationForId = tenantApplicationForId;
  }

  public TenantApiResource tenantForId(String tenantForId) {
    this.tenantForId = tenantForId;
    return this;
  }

  /**
   * Represents an individual tenant that can be viewed.
   * 
   * @return tenantForId
   */

  @JsonProperty("tenantForId")
  public String getTenantForId() {
    return tenantForId;
  }

  public void setTenantForId(String tenantForId) {
    this.tenantForId = tenantForId;
  }

  public TenantApiResource tenantOptionsForCategory(String tenantOptionsForCategory) {
    this.tenantOptionsForCategory = tenantOptionsForCategory;
    return this;
  }

  /**
   * Represents a category of tenant options.
   * 
   * @return tenantOptionsForCategory
   */

  @JsonProperty("tenantOptionsForCategory")
  public String getTenantOptionsForCategory() {
    return tenantOptionsForCategory;
  }

  public void setTenantOptionsForCategory(String tenantOptionsForCategory) {
    this.tenantOptionsForCategory = tenantOptionsForCategory;
  }

  public TenantApiResource tenantOptionForCategoryAndKey(String tenantOptionForCategoryAndKey) {
    this.tenantOptionForCategoryAndKey = tenantOptionForCategoryAndKey;
    return this;
  }

  /**
   * Retrieves a key of the category of tenant options.
   * 
   * @return tenantOptionForCategoryAndKey
   */

  @JsonProperty("tenantOptionForCategoryAndKey")
  public String getTenantOptionForCategoryAndKey() {
    return tenantOptionForCategoryAndKey;
  }

  public void setTenantOptionForCategoryAndKey(String tenantOptionForCategoryAndKey) {
    this.tenantOptionForCategoryAndKey = tenantOptionForCategoryAndKey;
  }

  public TenantApiResource tenantSystemOptions(String tenantSystemOptions) {
    this.tenantSystemOptions = tenantSystemOptions;
    return this;
  }

  /**
   * Retrieves the tenant system options.
   * 
   * @return tenantSystemOptions
   */

  @JsonProperty("tenantSystemOptions")
  public String getTenantSystemOptions() {
    return tenantSystemOptions;
  }

  public void setTenantSystemOptions(String tenantSystemOptions) {
    this.tenantSystemOptions = tenantSystemOptions;
  }

  public TenantApiResource tenantSystemOptionsForCategoryAndKey(String tenantSystemOptionsForCategoryAndKey) {
    this.tenantSystemOptionsForCategoryAndKey = tenantSystemOptionsForCategoryAndKey;
    return this;
  }

  /**
   * Retrieves the tenant system options based on category and key.
   * 
   * @return tenantSystemOptionsForCategoryAndKey
   */

  @JsonProperty("tenantSystemOptionsForCategoryAndKey")
  public String getTenantSystemOptionsForCategoryAndKey() {
    return tenantSystemOptionsForCategoryAndKey;
  }

  public void setTenantSystemOptionsForCategoryAndKey(String tenantSystemOptionsForCategoryAndKey) {
    this.tenantSystemOptionsForCategoryAndKey = tenantSystemOptionsForCategoryAndKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantApiResource tenantApiResource = (TenantApiResource) o;
    return Objects.equals(this.options, tenantApiResource.options) &&
        Objects.equals(this.self, tenantApiResource.self) &&
        Objects.equals(this.tenants, tenantApiResource.tenants) &&
        Objects.equals(this.tenantApplications, tenantApiResource.tenantApplications) &&
        Objects.equals(this.tenantApplicationForId, tenantApiResource.tenantApplicationForId) &&
        Objects.equals(this.tenantForId, tenantApiResource.tenantForId) &&
        Objects.equals(this.tenantOptionsForCategory, tenantApiResource.tenantOptionsForCategory) &&
        Objects.equals(this.tenantOptionForCategoryAndKey, tenantApiResource.tenantOptionForCategoryAndKey) &&
        Objects.equals(this.tenantSystemOptions, tenantApiResource.tenantSystemOptions) &&
        Objects.equals(this.tenantSystemOptionsForCategoryAndKey,
            tenantApiResource.tenantSystemOptionsForCategoryAndKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, self, tenants, tenantApplications, tenantApplicationForId, tenantForId,
        tenantOptionsForCategory, tenantOptionForCategoryAndKey, tenantSystemOptions,
        tenantSystemOptionsForCategoryAndKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantApiResource {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    tenantApplications: ").append(toIndentedString(tenantApplications)).append("\n");
    sb.append("    tenantApplicationForId: ").append(toIndentedString(tenantApplicationForId)).append("\n");
    sb.append("    tenantForId: ").append(toIndentedString(tenantForId)).append("\n");
    sb.append("    tenantOptionsForCategory: ").append(toIndentedString(tenantOptionsForCategory)).append("\n");
    sb.append("    tenantOptionForCategoryAndKey: ").append(toIndentedString(tenantOptionForCategoryAndKey))
        .append("\n");
    sb.append("    tenantSystemOptions: ").append(toIndentedString(tenantSystemOptions)).append("\n");
    sb.append("    tenantSystemOptionsForCategoryAndKey: ")
        .append(toIndentedString(tenantSystemOptionsForCategoryAndKey)).append("\n");
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
