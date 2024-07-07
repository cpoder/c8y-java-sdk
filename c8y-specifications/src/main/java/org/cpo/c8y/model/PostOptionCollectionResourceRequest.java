package org.cpo.c8y.model;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * PostOptionCollectionResourceRequest
 */

@JsonTypeName("postOptionCollectionResource_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostOptionCollectionResourceRequest {

  private String category;

  private String key;

  private String value;

  private URI self;

  public PostOptionCollectionResourceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostOptionCollectionResourceRequest(String category, String key) {
    this.category = category;
    this.key = key;
  }

  public PostOptionCollectionResourceRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Name of the option category.
   * 
   * @return category
   */
  @NotNull

  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PostOptionCollectionResourceRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A unique identifier for this option.
   * 
   * @return key
   */
  @NotNull

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostOptionCollectionResourceRequest value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of this option.
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

  public PostOptionCollectionResourceRequest self(URI self) {
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
  public PostOptionCollectionResourceRequest putAdditionalProperty(String key, Object value) {
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
    PostOptionCollectionResourceRequest postOptionCollectionResourceRequest = (PostOptionCollectionResourceRequest) o;
    return Objects.equals(this.category, postOptionCollectionResourceRequest.category) &&
        Objects.equals(this.key, postOptionCollectionResourceRequest.key) &&
        Objects.equals(this.value, postOptionCollectionResourceRequest.value) &&
        Objects.equals(this.self, postOptionCollectionResourceRequest.self) &&
        Objects.equals(this.additionalProperties, postOptionCollectionResourceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, key, value, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionCollectionResourceRequest {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");

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
