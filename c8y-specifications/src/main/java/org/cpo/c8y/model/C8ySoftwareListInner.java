package org.cpo.c8y.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Details of the installed software.
 */

@JsonTypeName("c8y_SoftwareList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8ySoftwareListInner {

  private String name;

  private String version;

  private URI url;

  public C8ySoftwareListInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the software.
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public C8ySoftwareListInner version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the software.
   * 
   * @return version
   */

  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public C8ySoftwareListInner url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the software, for example, its code repository.
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
    C8ySoftwareListInner c8ySoftwareListInner = (C8ySoftwareListInner) o;
    return Objects.equals(this.name, c8ySoftwareListInner.name) &&
        Objects.equals(this.version, c8ySoftwareListInner.version) &&
        Objects.equals(this.url, c8ySoftwareListInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8ySoftwareListInner {\n");
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
