package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The manifest of the web application.
 * 
 * @deprecated
 */

@Deprecated

@JsonTypeName("web_application_manifest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class WebApplicationManifest implements ApplicationManifest {

  @Deprecated
  private Boolean webpaas;

  private String contentSecurityPolicy;

  private Boolean noAppSwitcher;

  private Boolean tabsHorizontal;

  public WebApplicationManifest webpaas(Boolean webpaas) {
    this.webpaas = webpaas;
    return this;
  }

  /**
   * A legacy flag that identified a certain type of web application that would
   * control the behavior of plugin tab in the application details view. It is no
   * longer used.
   * 
   * @return webpaas
   * @deprecated
   */

  @JsonProperty("_webpaas")
  @Deprecated
  public Boolean getWebpaas() {
    return webpaas;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setWebpaas(Boolean webpaas) {
    this.webpaas = webpaas;
  }

  public WebApplicationManifest contentSecurityPolicy(String contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
    return this;
  }

  /**
   * The content security policy of the application.
   * 
   * @return contentSecurityPolicy
   */

  @JsonProperty("contentSecurityPolicy")
  public String getContentSecurityPolicy() {
    return contentSecurityPolicy;
  }

  public void setContentSecurityPolicy(String contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
  }

  public WebApplicationManifest noAppSwitcher(Boolean noAppSwitcher) {
    this.noAppSwitcher = noAppSwitcher;
    return this;
  }

  /**
   * A flag that decides if the application is shown in the app switcher on the
   * UI.
   * 
   * @return noAppSwitcher
   */

  @JsonProperty("noAppSwitcher")
  public Boolean getNoAppSwitcher() {
    return noAppSwitcher;
  }

  public void setNoAppSwitcher(Boolean noAppSwitcher) {
    this.noAppSwitcher = noAppSwitcher;
  }

  public WebApplicationManifest tabsHorizontal(Boolean tabsHorizontal) {
    this.tabsHorizontal = tabsHorizontal;
    return this;
  }

  /**
   * A flag that decides if the application tabs are displayed horizontally or
   * not.
   * 
   * @return tabsHorizontal
   */

  @JsonProperty("tabsHorizontal")
  public Boolean getTabsHorizontal() {
    return tabsHorizontal;
  }

  public void setTabsHorizontal(Boolean tabsHorizontal) {
    this.tabsHorizontal = tabsHorizontal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebApplicationManifest webApplicationManifest = (WebApplicationManifest) o;
    return Objects.equals(this.webpaas, webApplicationManifest.webpaas) &&
        Objects.equals(this.contentSecurityPolicy, webApplicationManifest.contentSecurityPolicy) &&
        Objects.equals(this.noAppSwitcher, webApplicationManifest.noAppSwitcher) &&
        Objects.equals(this.tabsHorizontal, webApplicationManifest.tabsHorizontal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webpaas, contentSecurityPolicy, noAppSwitcher, tabsHorizontal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApplicationManifest {\n");
    sb.append("    webpaas: ").append(toIndentedString(webpaas)).append("\n");
    sb.append("    contentSecurityPolicy: ").append(toIndentedString(contentSecurityPolicy)).append("\n");
    sb.append("    noAppSwitcher: ").append(toIndentedString(noAppSwitcher)).append("\n");
    sb.append("    tabsHorizontal: ").append(toIndentedString(tabsHorizontal)).append("\n");
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
