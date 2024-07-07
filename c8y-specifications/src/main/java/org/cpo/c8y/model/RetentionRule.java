package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * RetentionRule
 */

@JsonTypeName("retentionRule")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RetentionRule {

  /**
   * The data type(s) to which the rule is applied.
   */
  public enum DataTypeEnum {
    ALARM("ALARM"),

    AUDIT("AUDIT"),

    BULK_OPERATION("BULK_OPERATION"),

    EVENT("EVENT"),

    MEASUREMENT("MEASUREMENT"),

    OPERATION("OPERATION"),

    STAR("*");

    private String value;

    DataTypeEnum(String value) {
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
    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataTypeEnum dataType = DataTypeEnum.STAR;

  private Boolean editable = true;

  private String fragmentType = "*";

  private String id;

  private Integer maximumAge;

  private URI self;

  private String source = "*";

  private String type = "*";

  public RetentionRule dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type(s) to which the rule is applied.
   * 
   * @return dataType
   */

  @JsonProperty("dataType")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public RetentionRule editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Indicates whether the rule is editable or not. It can be updated only by the
   * Management tenant.
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

  public RetentionRule fragmentType(String fragmentType) {
    this.fragmentType = fragmentType;
    return this;
  }

  /**
   * The fragment type(s) to which the rule is applied. Used by the data types
   * EVENT, MEASUREMENT, OPERATION and BULK_OPERATION.
   * 
   * @return fragmentType
   */

  @JsonProperty("fragmentType")
  public String getFragmentType() {
    return fragmentType;
  }

  public void setFragmentType(String fragmentType) {
    this.fragmentType = fragmentType;
  }

  public RetentionRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the retention rule.
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

  public RetentionRule maximumAge(Integer maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

  /**
   * Maximum age expressed in number of days.
   * 
   * @return maximumAge
   */

  @JsonProperty("maximumAge")
  public Integer getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Integer maximumAge) {
    this.maximumAge = maximumAge;
  }

  public RetentionRule self(URI self) {
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

  public RetentionRule source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source(s) to which the rule is applied. Used by all data types.
   * 
   * @return source
   */

  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RetentionRule type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type(s) to which the rule is applied. Used by the data types ALARM,
   * AUDIT, EVENT and MEASUREMENT.
   * 
   * @return type
   */

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    RetentionRule retentionRule = (RetentionRule) o;
    return Objects.equals(this.dataType, retentionRule.dataType) &&
        Objects.equals(this.editable, retentionRule.editable) &&
        Objects.equals(this.fragmentType, retentionRule.fragmentType) &&
        Objects.equals(this.id, retentionRule.id) &&
        Objects.equals(this.maximumAge, retentionRule.maximumAge) &&
        Objects.equals(this.self, retentionRule.self) &&
        Objects.equals(this.source, retentionRule.source) &&
        Objects.equals(this.type, retentionRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, editable, fragmentType, id, maximumAge, self, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionRule {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    fragmentType: ").append(toIndentedString(fragmentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
