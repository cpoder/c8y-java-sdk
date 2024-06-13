package org.cpo.c8y.api;

import java.util.HashMap;
import java.util.Map;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.CategoryKeyOption;
import org.cpo.c8y.model.Option;
import org.cpo.c8y.model.OptionCollection;
import org.cpo.c8y.model.PostOptionCollectionResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface OptionsApi extends ApiClient.Api {

  /**
   * Remove a specific option
   * Remove a specific option (by a given category and key) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @param key      The key of an option. (required)
   */
  @RequestLine("DELETE /tenant/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteOptionResource(@Param("category") String category, @Param("key") String key);

  /**
   * Remove a specific option
   * Similar to <code>deleteOptionResource</code> but it also returns the http
   * response headers .
   * Remove a specific option (by a given category and key) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @param key      The key of an option. (required)
   */
  @RequestLine("DELETE /tenant/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteOptionResourceWithHttpInfo(@Param("category") String category, @Param("key") String key);

  /**
   * Retrieve all options by category
   * Retrieve all the options (by a specified category) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /tenant/options/{category}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  Map<String, Object> getCategoryOptionResource(@Param("category") String category);

  /**
   * Retrieve all options by category
   * Similar to <code>getCategoryOptionResource</code> but it also returns the
   * http response headers .
   * Retrieve all the options (by a specified category) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/options/{category}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  ApiResponse<Map<String, Object>> getCategoryOptionResourceWithHttpInfo(@Param("category") String category);

  /**
   * Retrieve all options
   * Retrieve all the options available on the tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return OptionCollection
   */
  @RequestLine("GET /tenant/options?currentPage={currentPage}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  OptionCollection getOptionCollectionResource(@Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all options
   * Similar to <code>getOptionCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve all the options available on the tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/options?currentPage={currentPage}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  ApiResponse<OptionCollection> getOptionCollectionResourceWithHttpInfo(@Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all options
   * Retrieve all the options available on the tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getOptionCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOptionCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return OptionCollection
   */
  @RequestLine("GET /tenant/options?currentPage={currentPage}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  OptionCollection getOptionCollectionResource(
      @QueryMap(encoded = true) GetOptionCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all options
   * Retrieve all the options available on the tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getOptionCollectionResource</code> that receives the query parameters
   * as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return OptionCollection
   */
  @RequestLine("GET /tenant/options?currentPage={currentPage}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.optioncollection+json",
  })
  ApiResponse<OptionCollection> getOptionCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetOptionCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getOptionCollectionResource</code> method in a fluent style.
   */
  public static class GetOptionCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetOptionCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetOptionCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetOptionCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific option
   * Retrieve a specific option (by a given category and key) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @param key      The key of an option. (required)
   * @return Option
   */
  @RequestLine("GET /tenant/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  Option getOptionResource(@Param("category") String category, @Param("key") String key);

  /**
   * Retrieve a specific option
   * Similar to <code>getOptionResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific option (by a given category and key) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param category The category of the options. (required)
   * @param key      The key of an option. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/options/{category}/{key}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
  })
  ApiResponse<Option> getOptionResourceWithHttpInfo(@Param("category") String category, @Param("key") String key);

  /**
   * Create an option
   * Create an option on your tenant. Options are category-key-value tuples which
   * store tenant configurations. Some categories of options allow the creation of
   * new ones, while others are limited to predefined set of keys. Any option of
   * any tenant can be defined as \&quot;non-editable\&quot; by the
   * \&quot;management\&quot; tenant; once done, any PUT or DELETE requests made
   * on that option by the tenant owner will result in a 403 error (Unauthorized).
   * ### Default option categories **access.control** | Key | Default value |
   * Predefined | Description | |--|--|--|--| | allow.origin | * | Yes | Comma
   * separated list of domains allowed for execution of CORS. Wildcards are
   * allowed (for example, &#x60;*.cumulocity.com&#x60;) | **alarm.type.mapping**
   * | Key | Predefined | Description | |--|--|--| | &amp;lt;ALARM_TYPE&gt; | No |
   * Overrides the severity and alarm text for the alarm with type
   * &amp;lt;ALARM_TYPE&gt;. The severity and text are specified as
   * &#x60;&lt;ALARM_SEVERITY&gt;\\|&lt;ALARM_TEXT&gt;&#x60;. If either part is
   * empty, the value will not be overridden. If the severity is NONE, the alarm
   * will be suppressed. Example: &#x60;\&quot;CRITICAL\\|temperature too
   * high\&quot;&#x60;| ### Encrypted credentials Adding a
   * \&quot;credentials.\&quot; prefix to the &#x60;key&#x60; will make the
   * &#x60;value&#x60; of the option encrypted. When the option is sent to a
   * microservice, the \&quot;credentials.\&quot; prefix is removed and the
   * &#x60;value&#x60; is decrypted. For example: &#x60;&#x60;&#x60;json {
   * \&quot;category\&quot;: \&quot;secrets\&quot;, \&quot;key\&quot;:
   * \&quot;credentials.mykey\&quot;, \&quot;value\&quot;: \&quot;myvalue\&quot; }
   * &#x60;&#x60;&#x60; In that particular example, the request will contain an
   * additional header &#x60;\&quot;Mykey\&quot;: \&quot;myvalue\&quot;&#x60;.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param postOptionCollectionResourceRequest (required)
   * @param accept                              Advertises which content types,
   *                                            expressed as MIME types, the
   *                                            client is able to understand.
   *                                            (optional)
   * @return Option
   */
  @RequestLine("POST /tenant/options")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.option+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  Option postOptionCollectionResource(PostOptionCollectionResourceRequest postOptionCollectionResourceRequest,
      @Param("accept") String accept);

  /**
   * Create an option
   * Similar to <code>postOptionCollectionResource</code> but it also returns the
   * http response headers .
   * Create an option on your tenant. Options are category-key-value tuples which
   * store tenant configurations. Some categories of options allow the creation of
   * new ones, while others are limited to predefined set of keys. Any option of
   * any tenant can be defined as \&quot;non-editable\&quot; by the
   * \&quot;management\&quot; tenant; once done, any PUT or DELETE requests made
   * on that option by the tenant owner will result in a 403 error (Unauthorized).
   * ### Default option categories **access.control** | Key | Default value |
   * Predefined | Description | |--|--|--|--| | allow.origin | * | Yes | Comma
   * separated list of domains allowed for execution of CORS. Wildcards are
   * allowed (for example, &#x60;*.cumulocity.com&#x60;) | **alarm.type.mapping**
   * | Key | Predefined | Description | |--|--|--| | &amp;lt;ALARM_TYPE&gt; | No |
   * Overrides the severity and alarm text for the alarm with type
   * &amp;lt;ALARM_TYPE&gt;. The severity and text are specified as
   * &#x60;&lt;ALARM_SEVERITY&gt;\\|&lt;ALARM_TEXT&gt;&#x60;. If either part is
   * empty, the value will not be overridden. If the severity is NONE, the alarm
   * will be suppressed. Example: &#x60;\&quot;CRITICAL\\|temperature too
   * high\&quot;&#x60;| ### Encrypted credentials Adding a
   * \&quot;credentials.\&quot; prefix to the &#x60;key&#x60; will make the
   * &#x60;value&#x60; of the option encrypted. When the option is sent to a
   * microservice, the \&quot;credentials.\&quot; prefix is removed and the
   * &#x60;value&#x60; is decrypted. For example: &#x60;&#x60;&#x60;json {
   * \&quot;category\&quot;: \&quot;secrets\&quot;, \&quot;key\&quot;:
   * \&quot;credentials.mykey\&quot;, \&quot;value\&quot;: \&quot;myvalue\&quot; }
   * &#x60;&#x60;&#x60; In that particular example, the request will contain an
   * additional header &#x60;\&quot;Mykey\&quot;: \&quot;myvalue\&quot;&#x60;.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param postOptionCollectionResourceRequest (required)
   * @param accept                              Advertises which content types,
   *                                            expressed as MIME types, the
   *                                            client is able to understand.
   *                                            (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/options")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.option+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  ApiResponse<Option> postOptionCollectionResourceWithHttpInfo(
      PostOptionCollectionResourceRequest postOptionCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Update options by category
   * Update one or more options (by a specified category) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category    The category of the options. (required)
   * @param requestBody (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("PUT /tenant/options/{category}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  Map<String, Object> putCategoryOptionResource(@Param("category") String category, Map<String, Object> requestBody,
      @Param("accept") String accept);

  /**
   * Update options by category
   * Similar to <code>putCategoryOptionResource</code> but it also returns the
   * http response headers .
   * Update one or more options (by a specified category) on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param category    The category of the options. (required)
   * @param requestBody (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /tenant/options/{category}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  ApiResponse<Map<String, Object>> putCategoryOptionResourceWithHttpInfo(@Param("category") String category,
      Map<String, Object> requestBody, @Param("accept") String accept);

  /**
   * Update a specific option
   * Update the value of a specific option (by a given category and key) on your
   * tenant. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; the option is editable
   * &lt;/section&gt;
   * 
   * @param category          The category of the options. (required)
   * @param key               The key of an option. (required)
   * @param categoryKeyOption (required)
   * @param accept            Advertises which content types, expressed as MIME
   *                          types, the client is able to understand. (optional)
   * @return Option
   */
  @RequestLine("PUT /tenant/options/{category}/{key}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  Option putOptionResource(@Param("category") String category, @Param("key") String key,
      CategoryKeyOption categoryKeyOption, @Param("accept") String accept);

  /**
   * Update a specific option
   * Similar to <code>putOptionResource</code> but it also returns the http
   * response headers .
   * Update the value of a specific option (by a given category and key) on your
   * tenant. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_OPTION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; the option is editable
   * &lt;/section&gt;
   * 
   * @param category          The category of the options. (required)
   * @param key               The key of an option. (required)
   * @param categoryKeyOption (required)
   * @param accept            Advertises which content types, expressed as MIME
   *                          types, the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /tenant/options/{category}/{key}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.option+json",
      "Accept: {accept}"
  })
  ApiResponse<Option> putOptionResourceWithHttpInfo(@Param("category") String category, @Param("key") String key,
      CategoryKeyOption categoryKeyOption, @Param("accept") String accept);

}
