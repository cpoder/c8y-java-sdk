package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * The term \&quot;agent\&quot; refers to the piece of software that connects a
 * device with Cumulocity IoT.
 */

@JsonTypeName("c8y_Agent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yAgent {

  private String name;

  private String version;

  private URI url;

  public C8yAgent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public C8yAgent(String name, String version) {
    this.name = name;
    this.version = version;
  }

  public C8yAgent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the agent.
   * 
   * @return name
   */
  @NotNull

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public C8yAgent version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the agent.
   * 
   * @return version
   */
  @NotNull

  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public C8yAgent url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the agent, for example, its code repository.
   * 
   * @return url
   */

  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yAgent c8yAgent = (C8yAgent) o;
    return Objects.equals(this.name, c8yAgent.name) &&
        Objects.equals(this.version, c8yAgent.version) &&
        Objects.equals(this.url, c8yAgent.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yAgent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
