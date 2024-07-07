package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Collection of subtenants
 */

@JsonTypeName("tenantApiResource_tenants")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantApiResourceTenants {

  private URI self;

  private JsonNullable<List<Tenant>> tenants = JsonNullable.<List<Tenant>>undefined();

  public TenantApiResourceTenants self(URI self) {
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

  public TenantApiResourceTenants tenants(List<Tenant> tenants) {
    this.tenants = JsonNullable.of(tenants);
    return this;
  }

  public TenantApiResourceTenants addTenantsItem(Tenant tenantsItem) {
    if (this.tenants == null || !this.tenants.isPresent()) {
      this.tenants = JsonNullable.of(new ArrayList<>());
    }
    this.tenants.get().add(tenantsItem);
    return this;
  }

  /**
   * Get tenants
   * 
   * @return tenants
   */

  @JsonProperty("tenants")
  public JsonNullable<List<Tenant>> getTenants() {
    return tenants;
  }

  public void setTenants(JsonNullable<List<Tenant>> tenants) {
    this.tenants = tenants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantApiResourceTenants tenantApiResourceTenants = (TenantApiResourceTenants) o;
    return Objects.equals(this.self, tenantApiResourceTenants.self) &&
        equalsNullable(this.tenants, tenantApiResourceTenants.tenants);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(tenants));
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
    sb.append("class TenantApiResourceTenants {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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
