package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.SystemOption;
import org.cpo.c8y.model.SystemOptionCollection;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface SystemOptionsApi extends ApiClient.Api {

  /**
   * Retrieve all system options
   * Retrieve all the system options available on the tenant. &gt; **⚠️
   * Important:** Note that it is possible to call this endpoint without the
   * ROLE_OPTION_MANAGEMENT_ADMIN role, but options that are considered secured
   * (see the list of options above) will be obfuscated with a constant value
   * &#x60;\&quot;&lt;&lt;Encrypted&gt;&gt;\&quot;&#x60;.
   * 
   * @return SystemOptionCollection
   */
  @RequestLine("GET /tenant/system/options")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  SystemOptionCollection getSystemOptionCollectionResource();

  /**
   * Retrieve all system options
   * Similar to <code>getSystemOptionCollectionResource</code> but it also returns
   * the http response headers .
   * Retrieve all the system options available on the tenant. &gt; **⚠️
   * Important:** Note that it is possible to call this endpoint without the
   * ROLE_OPTION_MANAGEMENT_ADMIN role, but options that are considered secured
   * (see the list of options above) will be obfuscated with a constant value
   * &#x60;\&quot;&lt;&lt;Encrypted&gt;&gt;\&quot;&#x60;.
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/system/options")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  ApiResponse<SystemOptionCollection> getSystemOptionCollectionResourceWithHttpInfo();

  /**
   * Retrieve a specific system option
   * Retrieve a specific system option (by a given category and key) on your
   * tenant. &gt; **⚠️ Important:** Note that it is possible to call this endpoint
   * without the ROLE_OPTION_MANAGEMENT_ADMIN role, but only the options that are
   * considered not secured (see the list of options above) will be returned.
   * Otherwise, if the option is considered secured and the user does not have the
   * required role, an HTTP response 403 will be returned.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category The category of the system options. (required)
   * @param key      The key of a system option. (required)
   * @return SystemOption
   */
  @RequestLine("GET /tenant/system/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  SystemOption getSystemOptionResource(@Param("category") String category, @Param("key") String key);

  /**
   * Retrieve a specific system option
   * Similar to <code>getSystemOptionResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific system option (by a given category and key) on your
   * tenant. &gt; **⚠️ Important:** Note that it is possible to call this endpoint
   * without the ROLE_OPTION_MANAGEMENT_ADMIN role, but only the options that are
   * considered not secured (see the list of options above) will be returned.
   * Otherwise, if the option is considered secured and the user does not have the
   * required role, an HTTP response 403 will be returned.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category The category of the system options. (required)
   * @param key      The key of a system option. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/system/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  ApiResponse<SystemOption> getSystemOptionResourceWithHttpInfo(@Param("category") String category,
      @Param("key") String key);

}
