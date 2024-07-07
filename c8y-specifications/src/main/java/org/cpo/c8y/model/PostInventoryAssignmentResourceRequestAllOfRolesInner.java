package org.cpo.c8y.model;

import java.util.Arrays;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * PostInventoryAssignmentResourceRequestAllOfRolesInner
 */

@JsonTypeName("postInventoryAssignmentResource_request_allOf_roles_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class PostInventoryAssignmentResourceRequestAllOfRolesInner {

  private JsonNullable<Object> description = JsonNullable.<Object>undefined();

  private JsonNullable<Object> permissions = JsonNullable.<Object>undefined();

  public PostInventoryAssignmentResourceRequestAllOfRolesInner description(Object description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * 
   * @return description
   */

  @JsonProperty("description")
  public JsonNullable<Object> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<Object> description) {
    this.description = description;
  }

  public PostInventoryAssignmentResourceRequestAllOfRolesInner permissions(Object permissions) {
    this.permissions = JsonNullable.of(permissions);
    return this;
  }

  /**
   * Get permissions
   * 
   * @return permissions
   */

  @JsonProperty("permissions")
  public JsonNullable<Object> getPermissions() {
    return permissions;
  }

  public void setPermissions(JsonNullable<Object> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInventoryAssignmentResourceRequestAllOfRolesInner postInventoryAssignmentResourceRequestAllOfRolesInner = (PostInventoryAssignmentResourceRequestAllOfRolesInner) o;
    return equalsNullable(this.description, postInventoryAssignmentResourceRequestAllOfRolesInner.description) &&
        equalsNullable(this.permissions, postInventoryAssignmentResourceRequestAllOfRolesInner.permissions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), hashCodeNullable(permissions));
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
    sb.append("class PostInventoryAssignmentResourceRequestAllOfRolesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
