package org.cpo.c8y.model;

import java.util.Arrays;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * AuditRecordChangesInner
 */

@JsonTypeName("auditRecord_changes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuditRecordChangesInner {

  private String attribute;

  /**
   * The type of change that was carried out.
   */
  public enum ChangeTypeEnum {
    ADDED("ADDED"),

    REPLACED("REPLACED");

    private String value;

    ChangeTypeEnum(String value) {
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
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ChangeTypeEnum changeType;

  private JsonNullable<AuditRecordChangesInnerNewValue> newValue = JsonNullable
      .<AuditRecordChangesInnerNewValue>undefined();

  private JsonNullable<AuditRecordChangesInnerPreviousValue> previousValue = JsonNullable
      .<AuditRecordChangesInnerPreviousValue>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public AuditRecordChangesInner attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The attribute that was changed.
   * 
   * @return attribute
   */

  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public AuditRecordChangesInner changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * The type of change that was carried out.
   * 
   * @return changeType
   */

  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public AuditRecordChangesInner newValue(AuditRecordChangesInnerNewValue newValue) {
    this.newValue = JsonNullable.of(newValue);
    return this;
  }

  /**
   * Get newValue
   * 
   * @return newValue
   */

  @JsonProperty("newValue")
  public JsonNullable<AuditRecordChangesInnerNewValue> getNewValue() {
    return newValue;
  }

  public void setNewValue(JsonNullable<AuditRecordChangesInnerNewValue> newValue) {
    this.newValue = newValue;
  }

  public AuditRecordChangesInner previousValue(AuditRecordChangesInnerPreviousValue previousValue) {
    this.previousValue = JsonNullable.of(previousValue);
    return this;
  }

  /**
   * Get previousValue
   * 
   * @return previousValue
   */

  @JsonProperty("previousValue")
  public JsonNullable<AuditRecordChangesInnerPreviousValue> getPreviousValue() {
    return previousValue;
  }

  public void setPreviousValue(JsonNullable<AuditRecordChangesInnerPreviousValue> previousValue) {
    this.previousValue = previousValue;
  }

  public AuditRecordChangesInner type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * The type of the object.
   * 
   * @return type
   */

  @JsonProperty("type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecordChangesInner auditRecordChangesInner = (AuditRecordChangesInner) o;
    return Objects.equals(this.attribute, auditRecordChangesInner.attribute) &&
        Objects.equals(this.changeType, auditRecordChangesInner.changeType) &&
        equalsNullable(this.newValue, auditRecordChangesInner.newValue) &&
        equalsNullable(this.previousValue, auditRecordChangesInner.previousValue) &&
        equalsNullable(this.type, auditRecordChangesInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, changeType, hashCodeNullable(newValue), hashCodeNullable(previousValue),
        hashCodeNullable(type));
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
    sb.append("class AuditRecordChangesInner {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
