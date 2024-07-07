package org.cpo.c8y.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * GetManagedObjectChildDeviceResource200Response
 */

@JsonTypeName("getManagedObjectChildDeviceResource_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class GetManagedObjectChildDeviceResource200Response {

  private ManagedObject managedObject;

  private JsonNullable<Object> self = JsonNullable.<Object>undefined();

  public GetManagedObjectChildDeviceResource200Response managedObject(ManagedObject managedObject) {
    this.managedObject = managedObject;
    return this;
  }

  /**
   * Get managedObject
   * 
   * @return managedObject
   */

  @JsonProperty("managedObject")
  public ManagedObject getManagedObject() {
    return managedObject;
  }

  public void setManagedObject(ManagedObject managedObject) {
    this.managedObject = managedObject;
  }

  public GetManagedObjectChildDeviceResource200Response self(Object self) {
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
  public GetManagedObjectChildDeviceResource200Response putAdditionalProperty(String key, Object value) {
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
    GetManagedObjectChildDeviceResource200Response getManagedObjectChildDeviceResource200Response = (GetManagedObjectChildDeviceResource200Response) o;
    return Objects.equals(this.managedObject, getManagedObjectChildDeviceResource200Response.managedObject) &&
        equalsNullable(this.self, getManagedObjectChildDeviceResource200Response.self) &&
        Objects.equals(this.additionalProperties, getManagedObjectChildDeviceResource200Response.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedObject, hashCodeNullable(self), additionalProperties);
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
    sb.append("class GetManagedObjectChildDeviceResource200Response {\n");
    sb.append("    managedObject: ").append(toIndentedString(managedObject)).append("\n");
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
