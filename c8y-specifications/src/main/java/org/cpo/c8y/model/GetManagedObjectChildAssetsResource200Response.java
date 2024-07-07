package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * GetManagedObjectChildAssetsResource200Response
 */

@JsonTypeName("getManagedObjectChildAssetsResource_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GetManagedObjectChildAssetsResource200Response {

  private JsonNullable<Object> prev = JsonNullable.<Object>undefined();

  private JsonNullable<Object> self = JsonNullable.<Object>undefined();

  private JsonNullable<Object> next = JsonNullable.<Object>undefined();

  private List<ManagedObjectReferenceCollectionReferencesInner> references = new ArrayList<>();

  private PageStatistics statistics;

  public GetManagedObjectChildAssetsResource200Response prev(Object prev) {
    this.prev = JsonNullable.of(prev);
    return this;
  }

  /**
   * Get prev
   * 
   * @return prev
   */

  @JsonProperty("prev")
  public JsonNullable<Object> getPrev() {
    return prev;
  }

  public void setPrev(JsonNullable<Object> prev) {
    this.prev = prev;
  }

  public GetManagedObjectChildAssetsResource200Response self(Object self) {
    this.self = JsonNullable.of(self);
    return this;
  }

  /**
   * Get self
   * 
   * @return self
   */

  @JsonProperty("self")
  public JsonNullable<Object> getSelf() {
    return self;
  }

  public void setSelf(JsonNullable<Object> self) {
    this.self = self;
  }

  public GetManagedObjectChildAssetsResource200Response next(Object next) {
    this.next = JsonNullable.of(next);
    return this;
  }

  /**
   * Get next
   * 
   * @return next
   */

  @JsonProperty("next")
  public JsonNullable<Object> getNext() {
    return next;
  }

  public void setNext(JsonNullable<Object> next) {
    this.next = next;
  }

  public GetManagedObjectChildAssetsResource200Response references(
      List<ManagedObjectReferenceCollectionReferencesInner> references) {
    this.references = references;
    return this;
  }

  public GetManagedObjectChildAssetsResource200Response addReferencesItem(
      ManagedObjectReferenceCollectionReferencesInner referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * An array containing the details of all children (if any).
   * 
   * @return references
   */

  @JsonProperty("references")
  public List<ManagedObjectReferenceCollectionReferencesInner> getReferences() {
    return references;
  }

  public void setReferences(List<ManagedObjectReferenceCollectionReferencesInner> references) {
    this.references = references;
  }

  public GetManagedObjectChildAssetsResource200Response statistics(PageStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * 
   * @return statistics
   */

  @JsonProperty("statistics")
  public PageStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(PageStatistics statistics) {
    this.statistics = statistics;
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
  public GetManagedObjectChildAssetsResource200Response putAdditionalProperty(String key, Object value) {
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
    GetManagedObjectChildAssetsResource200Response getManagedObjectChildAssetsResource200Response = (GetManagedObjectChildAssetsResource200Response) o;
    return equalsNullable(this.prev, getManagedObjectChildAssetsResource200Response.prev) &&
        equalsNullable(this.self, getManagedObjectChildAssetsResource200Response.self) &&
        equalsNullable(this.next, getManagedObjectChildAssetsResource200Response.next) &&
        Objects.equals(this.references, getManagedObjectChildAssetsResource200Response.references) &&
        Objects.equals(this.statistics, getManagedObjectChildAssetsResource200Response.statistics) &&
        Objects.equals(this.additionalProperties, getManagedObjectChildAssetsResource200Response.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(prev), hashCodeNullable(self), hashCodeNullable(next), references, statistics,
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
    sb.append("class GetManagedObjectChildAssetsResource200Response {\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");

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
