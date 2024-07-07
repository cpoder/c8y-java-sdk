package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
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
 * AuditRecord
 */

@JsonTypeName("auditRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuditRecord {

  private String activity;

  private String application;

  private AuditRecordC8yMetadata c8yMetadata;

  private List<AuditRecordChangesInner> changes = new ArrayList<>();

  private OffsetDateTime creationTime;

  private String id;

  private URI self;

  /**
   * The severity of the audit action.
   */
  public enum SeverityEnum {
    CRITICAL("CRITICAL"),

    MAJOR("MAJOR"),

    MINOR("MINOR"),

    WARNING("WARNING"),

    INFORMATION("INFORMATION");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SeverityEnum severity;

  private AuditRecordSource source;

  private String text;

  private OffsetDateTime time;

  /**
   * Identifies the platform component of the audit.
   */
  public enum TypeEnum {
    ALARM("Alarm"),

    APPLICATION("Application"),

    BULK_OPERATION("BulkOperation"),

    CEP_MODULE("CepModule"),

    CONNECTOR("Connector"),

    EVENT("Event"),

    GROUP("Group"),

    INVENTORY("Inventory"),

    INVENTORY_ROLE("InventoryRole"),

    OPERATION("Operation"),

    OPTION("Option"),

    REPORT("Report"),

    SINGLE_SIGN_ON("SingleSignOn"),

    SMART_RULE("SmartRule"),

    SYSTEM("SYSTEM"),

    TENANT("Tenant"),

    TENANT_AUTH_CONFIG("TenantAuthConfig"),

    TRUSTED_CERTIFICATES("TrustedCertificates"),

    USER("User"),

    USER_AUTHENTICATION("UserAuthentication");

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

  private String user;

  public AuditRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuditRecord(String activity, AuditRecordSource source, String text, OffsetDateTime time, TypeEnum type) {
    this.activity = activity;
    this.source = source;
    this.text = text;
    this.time = time;
    this.type = type;
  }

  public AuditRecord activity(String activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Summary of the action that was carried out.
   * 
   * @return activity
   */
  @NotNull

  @JsonProperty("activity")
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public AuditRecord application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Name of the application that performed the action.
   * 
   * @return application
   */

  @JsonProperty("application")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public AuditRecord c8yMetadata(AuditRecordC8yMetadata c8yMetadata) {
    this.c8yMetadata = c8yMetadata;
    return this;
  }

  /**
   * Get c8yMetadata
   * 
   * @return c8yMetadata
   */

  @JsonProperty("c8y_Metadata")
  public AuditRecordC8yMetadata getC8yMetadata() {
    return c8yMetadata;
  }

  public void setC8yMetadata(AuditRecordC8yMetadata c8yMetadata) {
    this.c8yMetadata = c8yMetadata;
  }

  public AuditRecord changes(List<AuditRecordChangesInner> changes) {
    this.changes = changes;
    return this;
  }

  public AuditRecord addChangesItem(AuditRecordChangesInner changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * Collection of objects describing the changes that were carried out.
   * 
   * @return changes
   */

  @JsonProperty("changes")
  public List<AuditRecordChangesInner> getChanges() {
    return changes;
  }

  public void setChanges(List<AuditRecordChangesInner> changes) {
    this.changes = changes;
  }

  public AuditRecord creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the audit record was created.
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

  public AuditRecord id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the audit record.
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

  public AuditRecord self(URI self) {
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

  public AuditRecord severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the audit action.
   * 
   * @return severity
   */

  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public AuditRecord source(AuditRecordSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * 
   * @return source
   */
  @NotNull

  @JsonProperty("source")
  public AuditRecordSource getSource() {
    return source;
  }

  public void setSource(AuditRecordSource source) {
    this.source = source;
  }

  public AuditRecord text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Details of the action that was carried out.
   * 
   * @return text
   */
  @NotNull

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AuditRecord time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The date and time when the audit is updated.
   * 
   * @return time
   */
  @NotNull

  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public AuditRecord type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Identifies the platform component of the audit.
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

  public AuditRecord user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The user who carried out the activity.
   * 
   * @return user
   */

  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
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
  public AuditRecord putAdditionalProperty(String key, Object value) {
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
    AuditRecord auditRecord = (AuditRecord) o;
    return Objects.equals(this.activity, auditRecord.activity) &&
        Objects.equals(this.application, auditRecord.application) &&
        Objects.equals(this.c8yMetadata, auditRecord.c8yMetadata) &&
        Objects.equals(this.changes, auditRecord.changes) &&
        Objects.equals(this.creationTime, auditRecord.creationTime) &&
        Objects.equals(this.id, auditRecord.id) &&
        Objects.equals(this.self, auditRecord.self) &&
        Objects.equals(this.severity, auditRecord.severity) &&
        Objects.equals(this.source, auditRecord.source) &&
        Objects.equals(this.text, auditRecord.text) &&
        Objects.equals(this.time, auditRecord.time) &&
        Objects.equals(this.type, auditRecord.type) &&
        Objects.equals(this.user, auditRecord.user) &&
        Objects.equals(this.additionalProperties, auditRecord.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, application, c8yMetadata, changes, creationTime, id, self, severity, source, text,
        time, type, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecord {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    c8yMetadata: ").append(toIndentedString(c8yMetadata)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");

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
