package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * AuditApiResource
 */

@JsonTypeName("auditApiResource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuditApiResource {

  private AuditApiResourceAuditRecords auditRecords;

  private String auditRecordsForApplication;

  private String auditRecordsForType;

  private String auditRecordsForUser;

  private String auditRecordsForTypeAndApplication;

  private String auditRecordsForTypeAndUserAndApplication;

  private String auditRecordsForUserAndApplication;

  private String auditRecordsForUserAndType;

  private URI self;

  public AuditApiResource auditRecords(AuditApiResourceAuditRecords auditRecords) {
    this.auditRecords = auditRecords;
    return this;
  }

  /**
   * Get auditRecords
   * 
   * @return auditRecords
   */

  @JsonProperty("auditRecords")
  public AuditApiResourceAuditRecords getAuditRecords() {
    return auditRecords;
  }

  public void setAuditRecords(AuditApiResourceAuditRecords auditRecords) {
    this.auditRecords = auditRecords;
  }

  public AuditApiResource auditRecordsForApplication(String auditRecordsForApplication) {
    this.auditRecordsForApplication = auditRecordsForApplication;
    return this;
  }

  /**
   * Read-only collection of audit records for a specific application. The
   * placeholder {application} must be the name of a registered application.
   * 
   * @return auditRecordsForApplication
   */

  @JsonProperty("auditRecordsForApplication")
  public String getAuditRecordsForApplication() {
    return auditRecordsForApplication;
  }

  public void setAuditRecordsForApplication(String auditRecordsForApplication) {
    this.auditRecordsForApplication = auditRecordsForApplication;
  }

  public AuditApiResource auditRecordsForType(String auditRecordsForType) {
    this.auditRecordsForType = auditRecordsForType;
    return this;
  }

  /**
   * Read-only collection of audit records for a specific type.
   * 
   * @return auditRecordsForType
   */

  @JsonProperty("auditRecordsForType")
  public String getAuditRecordsForType() {
    return auditRecordsForType;
  }

  public void setAuditRecordsForType(String auditRecordsForType) {
    this.auditRecordsForType = auditRecordsForType;
  }

  public AuditApiResource auditRecordsForUser(String auditRecordsForUser) {
    this.auditRecordsForUser = auditRecordsForUser;
    return this;
  }

  /**
   * Read-only collection of audit records for a specific user. The placeholder
   * {user} must be a username of a registered user.
   * 
   * @return auditRecordsForUser
   */

  @JsonProperty("auditRecordsForUser")
  public String getAuditRecordsForUser() {
    return auditRecordsForUser;
  }

  public void setAuditRecordsForUser(String auditRecordsForUser) {
    this.auditRecordsForUser = auditRecordsForUser;
  }

  public AuditApiResource auditRecordsForTypeAndApplication(String auditRecordsForTypeAndApplication) {
    this.auditRecordsForTypeAndApplication = auditRecordsForTypeAndApplication;
    return this;
  }

  /**
   * Read-only collection of audit records for specific type and application.
   * 
   * @return auditRecordsForTypeAndApplication
   */

  @JsonProperty("auditRecordsForTypeAndApplication")
  public String getAuditRecordsForTypeAndApplication() {
    return auditRecordsForTypeAndApplication;
  }

  public void setAuditRecordsForTypeAndApplication(String auditRecordsForTypeAndApplication) {
    this.auditRecordsForTypeAndApplication = auditRecordsForTypeAndApplication;
  }

  public AuditApiResource auditRecordsForTypeAndUserAndApplication(String auditRecordsForTypeAndUserAndApplication) {
    this.auditRecordsForTypeAndUserAndApplication = auditRecordsForTypeAndUserAndApplication;
    return this;
  }

  /**
   * Read-only collection of audit records for specific type, user and
   * application.
   * 
   * @return auditRecordsForTypeAndUserAndApplication
   */

  @JsonProperty("auditRecordsForTypeAndUserAndApplication")
  public String getAuditRecordsForTypeAndUserAndApplication() {
    return auditRecordsForTypeAndUserAndApplication;
  }

  public void setAuditRecordsForTypeAndUserAndApplication(String auditRecordsForTypeAndUserAndApplication) {
    this.auditRecordsForTypeAndUserAndApplication = auditRecordsForTypeAndUserAndApplication;
  }

  public AuditApiResource auditRecordsForUserAndApplication(String auditRecordsForUserAndApplication) {
    this.auditRecordsForUserAndApplication = auditRecordsForUserAndApplication;
    return this;
  }

  /**
   * Read-only collection of audit records for specific user and application.
   * 
   * @return auditRecordsForUserAndApplication
   */

  @JsonProperty("auditRecordsForUserAndApplication")
  public String getAuditRecordsForUserAndApplication() {
    return auditRecordsForUserAndApplication;
  }

  public void setAuditRecordsForUserAndApplication(String auditRecordsForUserAndApplication) {
    this.auditRecordsForUserAndApplication = auditRecordsForUserAndApplication;
  }

  public AuditApiResource auditRecordsForUserAndType(String auditRecordsForUserAndType) {
    this.auditRecordsForUserAndType = auditRecordsForUserAndType;
    return this;
  }

  /**
   * Read-only collection of audit records for specific user and type.
   * 
   * @return auditRecordsForUserAndType
   */

  @JsonProperty("auditRecordsForUserAndType")
  public String getAuditRecordsForUserAndType() {
    return auditRecordsForUserAndType;
  }

  public void setAuditRecordsForUserAndType(String auditRecordsForUserAndType) {
    this.auditRecordsForUserAndType = auditRecordsForUserAndType;
  }

  public AuditApiResource self(URI self) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditApiResource auditApiResource = (AuditApiResource) o;
    return Objects.equals(this.auditRecords, auditApiResource.auditRecords) &&
        Objects.equals(this.auditRecordsForApplication, auditApiResource.auditRecordsForApplication) &&
        Objects.equals(this.auditRecordsForType, auditApiResource.auditRecordsForType) &&
        Objects.equals(this.auditRecordsForUser, auditApiResource.auditRecordsForUser) &&
        Objects.equals(this.auditRecordsForTypeAndApplication, auditApiResource.auditRecordsForTypeAndApplication) &&
        Objects.equals(this.auditRecordsForTypeAndUserAndApplication,
            auditApiResource.auditRecordsForTypeAndUserAndApplication)
        &&
        Objects.equals(this.auditRecordsForUserAndApplication, auditApiResource.auditRecordsForUserAndApplication) &&
        Objects.equals(this.auditRecordsForUserAndType, auditApiResource.auditRecordsForUserAndType) &&
        Objects.equals(this.self, auditApiResource.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditRecords, auditRecordsForApplication, auditRecordsForType, auditRecordsForUser,
        auditRecordsForTypeAndApplication, auditRecordsForTypeAndUserAndApplication, auditRecordsForUserAndApplication,
        auditRecordsForUserAndType, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApiResource {\n");
    sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
    sb.append("    auditRecordsForApplication: ").append(toIndentedString(auditRecordsForApplication)).append("\n");
    sb.append("    auditRecordsForType: ").append(toIndentedString(auditRecordsForType)).append("\n");
    sb.append("    auditRecordsForUser: ").append(toIndentedString(auditRecordsForUser)).append("\n");
    sb.append("    auditRecordsForTypeAndApplication: ").append(toIndentedString(auditRecordsForTypeAndApplication))
        .append("\n");
    sb.append("    auditRecordsForTypeAndUserAndApplication: ")
        .append(toIndentedString(auditRecordsForTypeAndUserAndApplication)).append("\n");
    sb.append("    auditRecordsForUserAndApplication: ").append(toIndentedString(auditRecordsForUserAndApplication))
        .append("\n");
    sb.append("    auditRecordsForUserAndType: ").append(toIndentedString(auditRecordsForUserAndType)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
