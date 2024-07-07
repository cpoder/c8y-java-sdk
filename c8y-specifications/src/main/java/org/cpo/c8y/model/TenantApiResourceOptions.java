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
 * Collection of tenant options
 */

@JsonTypeName("tenantApiResource_options")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class TenantApiResourceOptions {

  private URI self;

  private JsonNullable<List<Option>> options = JsonNullable.<List<Option>>undefined();

  public TenantApiResourceOptions self(URI self) {
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

  public TenantApiResourceOptions options(List<Option> options) {
    this.options = JsonNullable.of(options);
    return this;
  }

  public TenantApiResourceOptions addOptionsItem(Option optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.of(new ArrayList<>());
    }
    this.options.get().add(optionsItem);
    return this;
  }

  /**
   * Get options
   * 
   * @return options
   */

  @JsonProperty("options")
  public JsonNullable<List<Option>> getOptions() {
    return options;
  }

  public void setOptions(JsonNullable<List<Option>> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantApiResourceOptions tenantApiResourceOptions = (TenantApiResourceOptions) o;
    return Objects.equals(this.self, tenantApiResourceOptions.self) &&
        equalsNullable(this.options, tenantApiResourceOptions.options);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hashCodeNullable(options));
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
    sb.append("class TenantApiResourceOptions {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
