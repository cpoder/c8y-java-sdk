package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.PlatformApiResource;

import feign.Headers;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface PlatformApiApi extends ApiClient.Api {

  /**
   * Retrieve URIs to collection platform objects
   * Retrieve URIs and URI templates to collections of platform objects.
   * 
   * @return PlatformApiResource
   */
  @RequestLine("GET /platform")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.platformapi+json",
  })
  PlatformApiResource getPlatformApiResource();

  /**
   * Retrieve URIs to collection platform objects
   * Similar to <code>getPlatformApiResource</code> but it also returns the http
   * response headers .
   * Retrieve URIs and URI templates to collections of platform objects.
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /platform")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.platformapi+json",
  })
  ApiResponse<PlatformApiResource> getPlatformApiResourceWithHttpInfo();

}
