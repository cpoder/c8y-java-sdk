package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * SubscribedApplicationReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class SubscribedApplicationReference {

  private SubscribedApplicationReferenceApplication application;

  public SubscribedApplicationReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscribedApplicationReference(SubscribedApplicationReferenceApplication application) {
    this.application = application;
  }

  public SubscribedApplicationReference application(SubscribedApplicationReferenceApplication application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * 
   * @return application
   */
  @NotNull

  @JsonProperty("application")
  public SubscribedApplicationReferenceApplication getApplication() {
    return application;
  }

  public void setApplication(SubscribedApplicationReferenceApplication application) {
    this.application = application;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribedApplicationReference subscribedApplicationReference = (SubscribedApplicationReference) o;
    return Objects.equals(this.application, subscribedApplicationReference.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribedApplicationReference {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
