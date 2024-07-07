package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * A permission object of an inventory role.
 */

@JsonTypeName("inventoryRolePermission")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class InventoryRolePermission {

  private Integer id;

  /**
   * The permission level.
   */
  public enum PermissionEnum {
    ADMIN("ADMIN"),

    READ("READ"),

    STAR("*");

    private String value;

    PermissionEnum(String value) {
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
    public static PermissionEnum fromValue(String value) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PermissionEnum permission;

  /**
   * The scope of this permission.
   */
  public enum ScopeEnum {
    ALARM("ALARM"),

    AUDIT("AUDIT"),

    EVENT("EVENT"),

    MANAGED_OBJECT("MANAGED_OBJECT"),

    MEASUREMENT("MEASUREMENT"),

    OPERATION("OPERATION"),

    STAR("*");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ScopeEnum scope;

  private String type;

  public InventoryRolePermission id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this permission.
   * 
   * @return id
   */

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InventoryRolePermission permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

  /**
   * The permission level.
   * 
   * @return permission
   */

  @JsonProperty("permission")
  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public InventoryRolePermission scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of this permission.
   * 
   * @return scope
   */

  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public InventoryRolePermission type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this permission. It can be the name of a fragment, for example,
   * `c8y_Restart`.
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
    InventoryRolePermission inventoryRolePermission = (InventoryRolePermission) o;
    return Objects.equals(this.id, inventoryRolePermission.id) &&
        Objects.equals(this.permission, inventoryRolePermission.permission) &&
        Objects.equals(this.scope, inventoryRolePermission.scope) &&
        Objects.equals(this.type, inventoryRolePermission.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission, scope, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryRolePermission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
