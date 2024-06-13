package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.BootstrapUser;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface BootstrapUserApi extends ApiClient.Api {

  /**
   * Retrieve the bootstrap user for a specific application
   * Retrieve the bootstrap user for a specific application (by a given ID). This
   * only works for microservice applications. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id Unique identifier of the application. (required)
   * @return BootstrapUser
   */
  @RequestLine("GET /application/applications/{id}/bootstrapUser")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  BootstrapUser getApplicationUserRepresentation(@Param("id") String id);

  /**
   * Retrieve the bootstrap user for a specific application
   * Similar to <code>getApplicationUserRepresentation</code> but it also returns
   * the http response headers .
   * Retrieve the bootstrap user for a specific application (by a given ID). This
   * only works for microservice applications. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id Unique identifier of the application. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /application/applications/{id}/bootstrapUser")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  ApiResponse<BootstrapUser> getApplicationUserRepresentationWithHttpInfo(@Param("id") String id);

}
