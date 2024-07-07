package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * A tuple storing tenant configuration.
 */

@JsonTypeName("systemOption")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SystemOption {

  private String category;

  private String key;

  private String value;

  public SystemOption category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Name of the system option category.
   * 
   * @return category
   */

  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public SystemOption key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A unique identifier for this system option.
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

  public SystemOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of this system option.
   * 
   * @return value
   */

  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemOption systemOption = (SystemOption) o;
    return Objects.equals(this.category, systemOption.category) &&
        Objects.equals(this.key, systemOption.key) &&
        Objects.equals(this.value, systemOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemOption {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
