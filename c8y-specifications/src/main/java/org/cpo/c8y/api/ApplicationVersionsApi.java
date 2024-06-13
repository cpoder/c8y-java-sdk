package org.cpo.c8y.api;

import java.io.File;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.ApplicationVersion;
import org.cpo.c8y.model.ApplicationVersionCollection;
import org.cpo.c8y.model.ApplicationVersionTag;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ApplicationVersionsApi extends ApiClient.Api {

  /**
   * Delete a specific version of an application
   * Delete a specific version of an application in your tenant, by a given tag or
   * version. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id      Unique identifier of the application. (required)
   * @param version The version field of the application version. (optional)
   * @param tag     The tag of the application version. (optional)
   */
  @RequestLine("DELETE /application/applications/{id}/versions?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteApplicationVersionResource(@Param("id") String id, @Param("version") String version,
      @Param("tag") String tag);

  /**
   * Delete a specific version of an application
   * Similar to <code>deleteApplicationVersionResource</code> but it also returns
   * the http response headers .
   * Delete a specific version of an application in your tenant, by a given tag or
   * version. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id      Unique identifier of the application. (required)
   * @param version The version field of the application version. (optional)
   * @param tag     The tag of the application version. (optional)
   */
  @RequestLine("DELETE /application/applications/{id}/versions?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @Param("version") String version, @Param("tag") String tag);

  /**
   * Delete a specific version of an application
   * Delete a specific version of an application in your tenant, by a given tag or
   * version. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteApplicationVersionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteApplicationVersionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the application. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>version - The version field of the application
   *                    version. (optional)</li>
   *                    <li>tag - The tag of the application version.
   *                    (optional)</li>
   *                    </ul>
   */
  @RequestLine("DELETE /application/applications/{id}/versions?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteApplicationVersionResource(@Param("id") String id,
      @QueryMap(encoded = true) DeleteApplicationVersionResourceQueryParams queryParams);

  /**
   * Delete a specific version of an application
   * Delete a specific version of an application in your tenant, by a given tag or
   * version. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteApplicationVersionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the application. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>version - The version field of the application
   *                    version. (optional)</li>
   *                    <li>tag - The tag of the application version.
   *                    (optional)</li>
   *                    </ul>
   */
  @RequestLine("DELETE /application/applications/{id}/versions?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @QueryMap(encoded = true) DeleteApplicationVersionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteApplicationVersionResource</code> method in a fluent style.
   */
  public static class DeleteApplicationVersionResourceQueryParams extends HashMap<String, Object> {
    public DeleteApplicationVersionResourceQueryParams version(final String value) {
      put("version", EncodingUtils.encode(value));
      return this;
    }

    public DeleteApplicationVersionResourceQueryParams tag(final String value) {
      put("tag", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve all versions of an application
   * Retrieve all versions of an application in your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id     Unique identifier of the application. (required)
   * @param accept Advertises which content types, expressed as MIME types, the
   *               client is able to understand. (optional)
   * @return ApplicationVersionCollection
   */
  @RequestLine("GET /application/applications/{id}/versions")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersionCollection+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationVersionCollection getApplicationVersionCollectionResource(@Param("id") String id,
      @Param("accept") String accept);

  /**
   * Retrieve all versions of an application
   * Similar to <code>getApplicationVersionCollectionResource</code> but it also
   * returns the http response headers .
   * Retrieve all versions of an application in your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id     Unique identifier of the application. (required)
   * @param accept Advertises which content types, expressed as MIME types, the
   *               client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /application/applications/{id}/versions")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersionCollection+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationVersionCollection> getApplicationVersionCollectionResourceWithHttpInfo(@Param("id") String id,
      @Param("accept") String accept);

  /**
   * Retrieve a specific version of an application
   * Retrieve the selected version of an application in your tenant. To select the
   * version, use only the version or only the tag query parameter.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id      Unique identifier of the application. (required)
   * @param accept  The header is required to access this endpoint. (required)
   * @param version The version field of the application version. (optional)
   * @param tag     The tag of the application version. (optional)
   * @return ApplicationVersion
   */
  @RequestLine("GET /application/applications/{id}/versions?version=1.0?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationVersion getApplicationVersionResource(@Param("id") String id, @Param("accept") String accept,
      @Param("version") String version, @Param("tag") String tag);

  /**
   * Retrieve a specific version of an application
   * Similar to <code>getApplicationVersionResource</code> but it also returns the
   * http response headers .
   * Retrieve the selected version of an application in your tenant. To select the
   * version, use only the version or only the tag query parameter.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param id      Unique identifier of the application. (required)
   * @param accept  The header is required to access this endpoint. (required)
   * @param version The version field of the application version. (optional)
   * @param tag     The tag of the application version. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /application/applications/{id}/versions?version=1.0?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationVersion> getApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @Param("accept") String accept, @Param("version") String version, @Param("tag") String tag);

  /**
   * Retrieve a specific version of an application
   * Retrieve the selected version of an application in your tenant. To select the
   * version, use only the version or only the tag query parameter.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getApplicationVersionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetApplicationVersionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the application. (required)
   * @param accept      The header is required to access this endpoint. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>version - The version field of the application
   *                    version. (optional)</li>
   *                    <li>tag - The tag of the application version.
   *                    (optional)</li>
   *                    </ul>
   * @return ApplicationVersion
   */
  @RequestLine("GET /application/applications/{id}/versions?version=1.0?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationVersion getApplicationVersionResource(@Param("id") String id, @Param("accept") String accept,
      @QueryMap(encoded = true) GetApplicationVersionResourceQueryParams queryParams);

  /**
   * Retrieve a specific version of an application
   * Retrieve the selected version of an application in your tenant. To select the
   * version, use only the version or only the tag query parameter.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getApplicationVersionResource</code> that receives the query parameters
   * as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the application. (required)
   * @param accept      The header is required to access this endpoint. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>version - The version field of the application
   *                    version. (optional)</li>
   *                    <li>tag - The tag of the application version.
   *                    (optional)</li>
   *                    </ul>
   * @return ApplicationVersion
   */
  @RequestLine("GET /application/applications/{id}/versions?version=1.0?version={version}&tag={tag}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationVersion> getApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @Param("accept") String accept, @QueryMap(encoded = true) GetApplicationVersionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getApplicationVersionResource</code> method in a fluent style.
   */
  public static class GetApplicationVersionResourceQueryParams extends HashMap<String, Object> {
    public GetApplicationVersionResourceQueryParams version(final String value) {
      put("version", EncodingUtils.encode(value));
      return this;
    }

    public GetApplicationVersionResourceQueryParams tag(final String value) {
      put("tag", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create an application version
   * Create an application version in your tenant. Uploaded version and tags can
   * only contain upper and lower case letters, integers and &#x60;.&#x60;,&#x60;
   * + &#x60;,&#x60; -&#x60;. Other characters are prohibited.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id                 Unique identifier of the application. (required)
   * @param applicationBinary  The ZIP file to be uploaded. (required)
   * @param applicationVersion The JSON file with version information. (required)
   * @param accept             Advertises which content types, expressed as MIME
   *                           types, the client is able to understand. (optional)
   * @return ApplicationVersion
   */
  @RequestLine("POST /application/applications/{id}/versions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationVersion postApplicationVersionResource(@Param("id") String id,
      @Param("applicationBinary") File applicationBinary, @Param("applicationVersion") String applicationVersion,
      @Param("accept") String accept);

  /**
   * Create an application version
   * Similar to <code>postApplicationVersionResource</code> but it also returns
   * the http response headers .
   * Create an application version in your tenant. Uploaded version and tags can
   * only contain upper and lower case letters, integers and &#x60;.&#x60;,&#x60;
   * + &#x60;,&#x60; -&#x60;. Other characters are prohibited.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id                 Unique identifier of the application. (required)
   * @param applicationBinary  The ZIP file to be uploaded. (required)
   * @param applicationVersion The JSON file with version information. (required)
   * @param accept             Advertises which content types, expressed as MIME
   *                           types, the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /application/applications/{id}/versions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationVersion> postApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @Param("applicationBinary") File applicationBinary, @Param("applicationVersion") String applicationVersion,
      @Param("accept") String accept);

  /**
   * Replace an application version&#39;s tags
   * Replaces the tags of a given application version in your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id                    Unique identifier of the application. (required)
   * @param version               Version of the application. (required)
   * @param applicationVersionTag (required)
   * @param accept                Advertises which content types, expressed as
   *                              MIME types, the client is able to understand.
   *                              (optional)
   * @return ApplicationVersion
   */
  @RequestLine("PUT /application/applications/{id}/versions/{version}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationVersion putApplicationVersionResource(@Param("id") String id, @Param("version") String version,
      ApplicationVersionTag applicationVersionTag, @Param("accept") String accept);

  /**
   * Replace an application version&#39;s tags
   * Similar to <code>putApplicationVersionResource</code> but it also returns the
   * http response headers .
   * Replaces the tags of a given application version in your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id                    Unique identifier of the application. (required)
   * @param version               Version of the application. (required)
   * @param applicationVersionTag (required)
   * @param accept                Advertises which content types, expressed as
   *                              MIME types, the client is able to understand.
   *                              (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /application/applications/{id}/versions/{version}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.applicationVersion+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationVersion> putApplicationVersionResourceWithHttpInfo(@Param("id") String id,
      @Param("version") String version, ApplicationVersionTag applicationVersionTag, @Param("accept") String accept);

}
