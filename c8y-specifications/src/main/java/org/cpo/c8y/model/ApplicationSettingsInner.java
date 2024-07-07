package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * ApplicationSettingsInner
 */

@JsonTypeName("application_settings_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class ApplicationSettingsInner {

  private String key;

  private ApplicationSettingsInnerValueSchema valueSchema;

  private String defaultValue;

  private Boolean editable;

  private Boolean inheritFromOwner;

  public ApplicationSettingsInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of the setting.
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

  public ApplicationSettingsInner valueSchema(ApplicationSettingsInnerValueSchema valueSchema) {
    this.valueSchema = valueSchema;
    return this;
  }

  /**
   * Get valueSchema
   * 
   * @return valueSchema
   */

  @JsonProperty("valueSchema")
  public ApplicationSettingsInnerValueSchema getValueSchema() {
    return valueSchema;
  }

  public void setValueSchema(ApplicationSettingsInnerValueSchema valueSchema) {
    this.valueSchema = valueSchema;
  }

  public ApplicationSettingsInner defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value.
   * 
   * @return defaultValue
   */

  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ApplicationSettingsInner editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Indicates if the value is editable.
   * 
   * @return editable
   */

  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ApplicationSettingsInner inheritFromOwner(Boolean inheritFromOwner) {
    this.inheritFromOwner = inheritFromOwner;
    return this;
  }

  /**
   * Indicated wether this setting is inherited.
   * 
   * @return inheritFromOwner
   */

  @JsonProperty("inheritFromOwner")
  public Boolean getInheritFromOwner() {
    return inheritFromOwner;
  }

  public void setInheritFromOwner(Boolean inheritFromOwner) {
    this.inheritFromOwner = inheritFromOwner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSettingsInner applicationSettingsInner = (ApplicationSettingsInner) o;
    return Objects.equals(this.key, applicationSettingsInner.key) &&
        Objects.equals(this.valueSchema, applicationSettingsInner.valueSchema) &&
        Objects.equals(this.defaultValue, applicationSettingsInner.defaultValue) &&
        Objects.equals(this.editable, applicationSettingsInner.editable) &&
        Objects.equals(this.inheritFromOwner, applicationSettingsInner.inheritFromOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, valueSchema, defaultValue, editable, inheritFromOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettingsInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueSchema: ").append(toIndentedString(valueSchema)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    inheritFromOwner: ").append(toIndentedString(inheritFromOwner)).append("\n");
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
