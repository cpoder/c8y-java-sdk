package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
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

/**
 * PutTenantResourceRequest
 */

@JsonTypeName("putTenantResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PutTenantResourceRequest {

  private String adminEmail;

  private JsonNullable<Object> adminName = JsonNullable.<Object>undefined();

  private String adminPass;

  private Boolean allowCreateTenants = false;

  private TenantApplications applications;

  private String company;

  private String contactName;

  private String contactPhone;

  private OffsetDateTime creationTime;

  private CustomProperties customProperties;

  private String domain;

  private String id;

  private TenantOwnedApplications ownedApplications;

  private String parent;

  private URI self;

  /**
   * Current status of the tenant.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    SUSPENDED("SUSPENDED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status = StatusEnum.ACTIVE;

  public PutTenantResourceRequest adminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
    return this;
  }

  /**
   * Email address of the tenant's administrator.
   * 
   * @return adminEmail
   */

  @JsonProperty("adminEmail")
  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  public PutTenantResourceRequest adminName(Object adminName) {
    this.adminName = JsonNullable.of(adminName);
    return this;
  }

  /**
   * Get adminName
   * 
   * @return adminName
   */

  @JsonProperty("adminName")
  public JsonNullable<Object> getAdminName() {
    return adminName;
  }

  public void setAdminName(JsonNullable<Object> adminName) {
    this.adminName = adminName;
  }

  public PutTenantResourceRequest adminPass(String adminPass) {
    this.adminPass = adminPass;
    return this;
  }

  /**
   * Password of the tenant's administrator.
   * 
   * @return adminPass
   */

  @JsonProperty("adminPass")
  public String getAdminPass() {
    return adminPass;
  }

  public void setAdminPass(String adminPass) {
    this.adminPass = adminPass;
  }

  public PutTenantResourceRequest allowCreateTenants(Boolean allowCreateTenants) {
    this.allowCreateTenants = allowCreateTenants;
    return this;
  }

  /**
   * Indicates if this tenant can create subtenants.
   * 
   * @return allowCreateTenants
   */

  @JsonProperty("allowCreateTenants")
  public Boolean getAllowCreateTenants() {
    return allowCreateTenants;
  }

  public void setAllowCreateTenants(Boolean allowCreateTenants) {
    this.allowCreateTenants = allowCreateTenants;
  }

  public PutTenantResourceRequest applications(TenantApplications applications) {
    this.applications = applications;
    return this;
  }

  /**
   * Get applications
   * 
   * @return applications
   */

  @JsonProperty("applications")
  public TenantApplications getApplications() {
    return applications;
  }

  public void setApplications(TenantApplications applications) {
    this.applications = applications;
  }

  public PutTenantResourceRequest company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Tenant's company name.
   * 
   * @return company
   */

  @JsonProperty("company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public PutTenantResourceRequest contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Name of the contact person.
   * 
   * @return contactName
   */

  @JsonProperty("contactName")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public PutTenantResourceRequest contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Phone number of the contact person, provided in the international format, for
   * example, +48 123 456 7890.
   * 
   * @return contactPhone
   */

  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public PutTenantResourceRequest creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the tenant was created.
   * 
   * @return creationTime
   */

  @JsonProperty("creationTime")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public PutTenantResourceRequest customProperties(CustomProperties customProperties) {
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

  public PutTenantResourceRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * URL of the tenant's domain. The domain name permits only the use of
   * alphanumeric characters separated by dots `.` and hyphens `-`.
   * 
   * @return domain
   */

  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public PutTenantResourceRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a Cumulocity IoT tenant.
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

  public PutTenantResourceRequest ownedApplications(TenantOwnedApplications ownedApplications) {
    this.ownedApplications = ownedApplications;
    return this;
  }

  /**
   * Get ownedApplications
   * 
   * @return ownedApplications
   */

  @JsonProperty("ownedApplications")
  public TenantOwnedApplications getOwnedApplications() {
    return ownedApplications;
  }

  public void setOwnedApplications(TenantOwnedApplications ownedApplications) {
    this.ownedApplications = ownedApplications;
  }

  public PutTenantResourceRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * ID of the parent tenant.
   * 
   * @return parent
   */

  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public PutTenantResourceRequest self(URI self) {
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

  public PutTenantResourceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the tenant.
   * 
   * @return status
   */

  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
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
  public PutTenantResourceRequest putAdditionalProperty(String key, Object value) {
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
    PutTenantResourceRequest putTenantResourceRequest = (PutTenantResourceRequest) o;
    return Objects.equals(this.adminEmail, putTenantResourceRequest.adminEmail) &&
        equalsNullable(this.adminName, putTenantResourceRequest.adminName) &&
        Objects.equals(this.adminPass, putTenantResourceRequest.adminPass) &&
        Objects.equals(this.allowCreateTenants, putTenantResourceRequest.allowCreateTenants) &&
        Objects.equals(this.applications, putTenantResourceRequest.applications) &&
        Objects.equals(this.company, putTenantResourceRequest.company) &&
        Objects.equals(this.contactName, putTenantResourceRequest.contactName) &&
        Objects.equals(this.contactPhone, putTenantResourceRequest.contactPhone) &&
        Objects.equals(this.creationTime, putTenantResourceRequest.creationTime) &&
        Objects.equals(this.customProperties, putTenantResourceRequest.customProperties) &&
        Objects.equals(this.domain, putTenantResourceRequest.domain) &&
        Objects.equals(this.id, putTenantResourceRequest.id) &&
        Objects.equals(this.ownedApplications, putTenantResourceRequest.ownedApplications) &&
        Objects.equals(this.parent, putTenantResourceRequest.parent) &&
        Objects.equals(this.self, putTenantResourceRequest.self) &&
        Objects.equals(this.status, putTenantResourceRequest.status) &&
        Objects.equals(this.additionalProperties, putTenantResourceRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEmail, hashCodeNullable(adminName), adminPass, allowCreateTenants, applications, company,
        contactName, contactPhone, creationTime, customProperties, domain, id, ownedApplications, parent, self, status,
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
    sb.append("class PutTenantResourceRequest {\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    adminPass: ").append("*").append("\n");
    sb.append("    allowCreateTenants: ").append(toIndentedString(allowCreateTenants)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownedApplications: ").append(toIndentedString(ownedApplications)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");

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
