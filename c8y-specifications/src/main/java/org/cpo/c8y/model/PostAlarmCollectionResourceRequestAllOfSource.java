package org.cpo.c8y.model;

import java.util.Arrays;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * PostAlarmCollectionResourceRequestAllOfSource
 */

@JsonTypeName("postAlarmCollectionResource_request_allOf_source")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostAlarmCollectionResourceRequestAllOfSource {

  private JsonNullable<Object> name = JsonNullable.<Object>undefined();

  public PostAlarmCollectionResourceRequestAllOfSource name(Object name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   */

  @JsonProperty("name")
  public JsonNullable<Object> getName() {
    return name;
  }

  public void setName(JsonNullable<Object> name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAlarmCollectionResourceRequestAllOfSource postAlarmCollectionResourceRequestAllOfSource = (PostAlarmCollectionResourceRequestAllOfSource) o;
    return equalsNullable(this.name, postAlarmCollectionResourceRequestAllOfSource.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name));
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
    sb.append("class PostAlarmCollectionResourceRequestAllOfSource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
