package org.cpo.c8y.model;

import java.net.URI;
import java.util.HashMap;
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
 * PostRetentionRuleCollectionResourceRequest
 */

@JsonTypeName("postRetentionRuleCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostRetentionRuleCollectionResourceRequest {

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

  public PostRetentionRuleCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostRetentionRuleCollectionResourceRequest(Integer maximumAge) {
    this.maximumAge = maximumAge;
  }

  public PostRetentionRuleCollectionResourceRequest dataType(DataTypeEnum dataType) {
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

  public PostRetentionRuleCollectionResourceRequest editable(Boolean editable) {
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

  public PostRetentionRuleCollectionResourceRequest fragmentType(String fragmentType) {
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

  public PostRetentionRuleCollectionResourceRequest id(String id) {
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

  public PostRetentionRuleCollectionResourceRequest maximumAge(Integer maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

  /**
   * Maximum age expressed in number of days.
   * 
   * @return maximumAge
   */
  @NotNull

  @JsonProperty("maximumAge")
  public Integer getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Integer maximumAge) {
    this.maximumAge = maximumAge;
  }

  public PostRetentionRuleCollectionResourceRequest self(URI self) {
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

  public PostRetentionRuleCollectionResourceRequest source(String source) {
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

  public PostRetentionRuleCollectionResourceRequest type(String type) {
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
  public PostRetentionRuleCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostRetentionRuleCollectionResourceRequest postRetentionRuleCollectionResourceRequest = (PostRetentionRuleCollectionResourceRequest) o;
    return Objects.equals(this.dataType, postRetentionRuleCollectionResourceRequest.dataType) &&
        Objects.equals(this.editable, postRetentionRuleCollectionResourceRequest.editable) &&
        Objects.equals(this.fragmentType, postRetentionRuleCollectionResourceRequest.fragmentType) &&
        Objects.equals(this.id, postRetentionRuleCollectionResourceRequest.id) &&
        Objects.equals(this.maximumAge, postRetentionRuleCollectionResourceRequest.maximumAge) &&
        Objects.equals(this.self, postRetentionRuleCollectionResourceRequest.self) &&
        Objects.equals(this.source, postRetentionRuleCollectionResourceRequest.source) &&
        Objects.equals(this.type, postRetentionRuleCollectionResourceRequest.type) &&
        Objects.equals(this.additionalProperties, postRetentionRuleCollectionResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, editable, fragmentType, id, maximumAge, self, source, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRetentionRuleCollectionResourceRequest {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    fragmentType: ").append(toIndentedString(fragmentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");

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
