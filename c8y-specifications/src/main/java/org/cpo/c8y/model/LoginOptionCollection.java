package org.cpo.c8y.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * All available login options of the tenant.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class LoginOptionCollection {

  private List<LoginOption> loginOptions = new ArrayList<>();

  private URI self;

  public LoginOptionCollection loginOptions(List<LoginOption> loginOptions) {
    this.loginOptions = loginOptions;
    return this;
  }

  public LoginOptionCollection addLoginOptionsItem(LoginOption loginOptionsItem) {
    if (this.loginOptions == null) {
      this.loginOptions = new ArrayList<>();
    }
    this.loginOptions.add(loginOptionsItem);
    return this;
  }

  /**
   * An array containing the available login options.
   * 
   * @return loginOptions
   */

  @JsonProperty("loginOptions")
  public List<LoginOption> getLoginOptions() {
    return loginOptions;
  }

  public void setLoginOptions(List<LoginOption> loginOptions) {
    this.loginOptions = loginOptions;
  }

  public LoginOptionCollection self(URI self) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginOptionCollection loginOptionCollection = (LoginOptionCollection) o;
    return Objects.equals(this.loginOptions, loginOptionCollection.loginOptions) &&
        Objects.equals(this.self, loginOptionCollection.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginOptions, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginOptionCollection {\n");
    sb.append("    loginOptions: ").append(toIndentedString(loginOptions)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
