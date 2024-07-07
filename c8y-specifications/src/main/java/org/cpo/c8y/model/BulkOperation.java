package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * BulkOperation
 */

@JsonTypeName("bulkOperation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BulkOperation {

  private URI self;

  private String id;

  private String groupId;

  private String failedParentId;

  private OffsetDateTime startDate;

  private Float creationRamp;

  private Object operationPrototype;

  /**
   * The status of this bulk operation, in context of the execution of all its
   * single operations.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    IN_PROGRESS("IN_PROGRESS"),

    COMPLETED("COMPLETED"),

    DELETED("DELETED");

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

  private StatusEnum status;

  /**
   * The general status of this bulk operation. The general status is visible for
   * end users and they can filter and evaluate bulk operations by this status.
   */
  public enum GeneralStatusEnum {
    SCHEDULED("SCHEDULED"),

    EXECUTING("EXECUTING"),

    EXECUTING_WITH_ERRORS("EXECUTING_WITH_ERRORS"),

    SUCCESSFUL("SUCCESSFUL"),

    FAILED("FAILED"),

    CANCELED("CANCELED");

    private String value;

    GeneralStatusEnum(String value) {
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
    public static GeneralStatusEnum fromValue(String value) {
      for (GeneralStatusEnum b : GeneralStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GeneralStatusEnum generalStatus;

  private BulkOperationProgress progress;

  public BulkOperation self(URI self) {
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

  public BulkOperation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this bulk operation.
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

  public BulkOperation groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Identifies the target group on which this operation should be performed.
   * >**&#9432; Info:** `groupId` and `failedParentId` are mutually exclusive. Use
   * only one of them in your request.
   * 
   * @return groupId
   */

  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public BulkOperation failedParentId(String failedParentId) {
    this.failedParentId = failedParentId;
    return this;
  }

  /**
   * Identifies the failed bulk operation from which the failed operations should
   * be rescheduled. >**&#9432; Info:** `groupId` and `failedParentId` are
   * mutually exclusive. Use only one of them in your request.
   * 
   * @return failedParentId
   */

  @JsonProperty("failedParentId")
  public String getFailedParentId() {
    return failedParentId;
  }

  public void setFailedParentId(String failedParentId) {
    this.failedParentId = failedParentId;
  }

  public BulkOperation startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date and time when the operations of this bulk operation should be created.
   * 
   * @return startDate
   */

  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public BulkOperation creationRamp(Float creationRamp) {
    this.creationRamp = creationRamp;
    return this;
  }

  /**
   * Delay between every operation creation in seconds.
   * 
   * @return creationRamp
   */

  @JsonProperty("creationRamp")
  public Float getCreationRamp() {
    return creationRamp;
  }

  public void setCreationRamp(Float creationRamp) {
    this.creationRamp = creationRamp;
  }

  public BulkOperation operationPrototype(Object operationPrototype) {
    this.operationPrototype = operationPrototype;
    return this;
  }

  /**
   * Operation to be executed for every device in a group.
   * 
   * @return operationPrototype
   */

  @JsonProperty("operationPrototype")
  public Object getOperationPrototype() {
    return operationPrototype;
  }

  public void setOperationPrototype(Object operationPrototype) {
    this.operationPrototype = operationPrototype;
  }

  public BulkOperation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of this bulk operation, in context of the execution of all its
   * single operations.
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

  public BulkOperation generalStatus(GeneralStatusEnum generalStatus) {
    this.generalStatus = generalStatus;
    return this;
  }

  /**
   * The general status of this bulk operation. The general status is visible for
   * end users and they can filter and evaluate bulk operations by this status.
   * 
   * @return generalStatus
   */

  @JsonProperty("generalStatus")
  public GeneralStatusEnum getGeneralStatus() {
    return generalStatus;
  }

  public void setGeneralStatus(GeneralStatusEnum generalStatus) {
    this.generalStatus = generalStatus;
  }

  public BulkOperation progress(BulkOperationProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * 
   * @return progress
   */

  @JsonProperty("progress")
  public BulkOperationProgress getProgress() {
    return progress;
  }

  public void setProgress(BulkOperationProgress progress) {
    this.progress = progress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperation bulkOperation = (BulkOperation) o;
    return Objects.equals(this.self, bulkOperation.self) &&
        Objects.equals(this.id, bulkOperation.id) &&
        Objects.equals(this.groupId, bulkOperation.groupId) &&
        Objects.equals(this.failedParentId, bulkOperation.failedParentId) &&
        Objects.equals(this.startDate, bulkOperation.startDate) &&
        Objects.equals(this.creationRamp, bulkOperation.creationRamp) &&
        Objects.equals(this.operationPrototype, bulkOperation.operationPrototype) &&
        Objects.equals(this.status, bulkOperation.status) &&
        Objects.equals(this.generalStatus, bulkOperation.generalStatus) &&
        Objects.equals(this.progress, bulkOperation.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, groupId, failedParentId, startDate, creationRamp, operationPrototype, status,
        generalStatus, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperation {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    failedParentId: ").append(toIndentedString(failedParentId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    creationRamp: ").append(toIndentedString(creationRamp)).append("\n");
    sb.append("    operationPrototype: ").append(toIndentedString(operationPrototype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    generalStatus: ").append(toIndentedString(generalStatus)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
