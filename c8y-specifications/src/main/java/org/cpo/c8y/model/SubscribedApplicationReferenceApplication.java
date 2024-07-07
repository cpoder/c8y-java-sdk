package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * The application to be subscribed to.
 */

@JsonTypeName("SubscribedApplicationReference_application")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SubscribedApplicationReferenceApplication {

  private String self;

  public SubscribedApplicationReferenceApplication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscribedApplicationReferenceApplication(String self) {
    this.self = self;
  }

  public SubscribedApplicationReferenceApplication self(String self) {
    this.self = self;
    return this;
  }

  /**
   * A URL linking to this resource.
   * 
   * @return self
   */
  @NotNull

  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
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
    SubscribedApplicationReferenceApplication subscribedApplicationReferenceApplication = (SubscribedApplicationReferenceApplication) o;
    return Objects.equals(this.self, subscribedApplicationReferenceApplication.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribedApplicationReferenceApplication {\n");
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
