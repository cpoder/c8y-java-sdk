package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Application;
import org.cpo.c8y.model.ApplicationCollection;
import org.cpo.c8y.model.GetApplicationsByNameCollectionResource200Response;
import org.cpo.c8y.model.GetApplicationsByOwnerCollectionResource200Response;
import org.cpo.c8y.model.GetApplicationsByTenantCollectionResource200Response;
import org.cpo.c8y.model.GetApplicationsByUserCollectionResource200Response;
import org.cpo.c8y.model.PostApplicationCollectionResourceRequest;
import org.cpo.c8y.model.PutApplicationResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ApplicationsApi extends ApiClient.Api {

    /**
     * Delete an application
     * Delete an application (by a given ID). This method is not supported by
     * microservice applications. &gt; **&amp;#9432; Info:** With regards to a
     * hosted application, there is a caching mechanism in place that keeps the
     * information about the placement of application files (html, javascript, css,
     * fonts, etc.). Removing a hosted application, in normal circumstances, will
     * cause the subsequent requests for application files to fail with an HTTP 404
     * error because the application is removed synchronously, its files are
     * immediately removed on the node serving the request and at the same time the
     * information is propagated to other nodes – but in rare cases there might be a
     * delay with this propagation. In such situations, the files of the removed
     * application can be served from those nodes up until the aforementioned cache
     * expires. For the same reason, the cache can also cause HTTP 404 errors when
     * the application is updated as it will keep the path to the files of the old
     * version of the application. The cache is filled on demand, so there should
     * not be issues if application files were not accessed prior to the delete
     * request. The expiration delay of the cache can differ, but should not take
     * more than one minute. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param force                     Force deletion by unsubscribing all tenants
     *                                  from the application first and then deleting
     *                                  the application itself. (optional, default
     *                                  to false)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     */
    @RequestLine("DELETE /application/applications/{id}?force={force}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    void deleteApplicationResource(@Param("id") String id, @Param("force") Boolean force,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Delete an application
     * Similar to <code>deleteApplicationResource</code> but it also returns the
     * http response headers .
     * Delete an application (by a given ID). This method is not supported by
     * microservice applications. &gt; **&amp;#9432; Info:** With regards to a
     * hosted application, there is a caching mechanism in place that keeps the
     * information about the placement of application files (html, javascript, css,
     * fonts, etc.). Removing a hosted application, in normal circumstances, will
     * cause the subsequent requests for application files to fail with an HTTP 404
     * error because the application is removed synchronously, its files are
     * immediately removed on the node serving the request and at the same time the
     * information is propagated to other nodes – but in rare cases there might be a
     * delay with this propagation. In such situations, the files of the removed
     * application can be served from those nodes up until the aforementioned cache
     * expires. For the same reason, the cache can also cause HTTP 404 errors when
     * the application is updated as it will keep the path to the files of the old
     * version of the application. The cache is filled on demand, so there should
     * not be issues if application files were not accessed prior to the delete
     * request. The expiration delay of the cache can differ, but should not take
     * more than one minute. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param force                     Force deletion by unsubscribing all tenants
     *                                  from the application first and then deleting
     *                                  the application itself. (optional, default
     *                                  to false)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     */
    @RequestLine("DELETE /application/applications/{id}?force={force}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Void> deleteApplicationResourceWithHttpInfo(@Param("id") String id, @Param("force") Boolean force,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Delete an application
     * Delete an application (by a given ID). This method is not supported by
     * microservice applications. &gt; **&amp;#9432; Info:** With regards to a
     * hosted application, there is a caching mechanism in place that keeps the
     * information about the placement of application files (html, javascript, css,
     * fonts, etc.). Removing a hosted application, in normal circumstances, will
     * cause the subsequent requests for application files to fail with an HTTP 404
     * error because the application is removed synchronously, its files are
     * immediately removed on the node serving the request and at the same time the
     * information is propagated to other nodes – but in rare cases there might be a
     * delay with this propagation. In such situations, the files of the removed
     * application can be served from those nodes up until the aforementioned cache
     * expires. For the same reason, the cache can also cause HTTP 404 errors when
     * the application is updated as it will keep the path to the files of the old
     * version of the application. The cache is filled on demand, so there should
     * not be issues if application files were not accessed prior to the delete
     * request. The expiration delay of the cache can differ, but should not take
     * more than one minute. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * Note, this is equivalent to the other <code>deleteApplicationResource</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link DeleteApplicationResourceQueryParams} class that allows
     * for
     * building up this map in a fluent style.
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param queryParams               Map of query parameters as name-value pairs
     *                                  <p>
     *                                  The following elements may be specified in
     *                                  the query map:
     *                                  </p>
     *                                  <ul>
     *                                  <li>force - Force deletion by unsubscribing
     *                                  all tenants from the application first and
     *                                  then deleting the application itself.
     *                                  (optional, default to false)</li>
     *                                  </ul>
     */
    @RequestLine("DELETE /application/applications/{id}?force={force}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    void deleteApplicationResource(@Param("id") String id,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) DeleteApplicationResourceQueryParams queryParams);

    /**
     * Delete an application
     * Delete an application (by a given ID). This method is not supported by
     * microservice applications. &gt; **&amp;#9432; Info:** With regards to a
     * hosted application, there is a caching mechanism in place that keeps the
     * information about the placement of application files (html, javascript, css,
     * fonts, etc.). Removing a hosted application, in normal circumstances, will
     * cause the subsequent requests for application files to fail with an HTTP 404
     * error because the application is removed synchronously, its files are
     * immediately removed on the node serving the request and at the same time the
     * information is propagated to other nodes – but in rare cases there might be a
     * delay with this propagation. In such situations, the files of the removed
     * application can be served from those nodes up until the aforementioned cache
     * expires. For the same reason, the cache can also cause HTTP 404 errors when
     * the application is updated as it will keep the path to the files of the old
     * version of the application. The cache is filled on demand, so there should
     * not be issues if application files were not accessed prior to the delete
     * request. The expiration delay of the cache can differ, but should not take
     * more than one minute. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * Note, this is equivalent to the other <code>deleteApplicationResource</code>
     * that receives the query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param queryParams               Map of query parameters as name-value pairs
     *                                  <p>
     *                                  The following elements may be specified in
     *                                  the query map:
     *                                  </p>
     *                                  <ul>
     *                                  <li>force - Force deletion by unsubscribing
     *                                  all tenants from the application first and
     *                                  then deleting the application itself.
     *                                  (optional, default to false)</li>
     *                                  </ul>
     */
    @RequestLine("DELETE /application/applications/{id}?force={force}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Void> deleteApplicationResourceWithHttpInfo(@Param("id") String id,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) DeleteApplicationResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>deleteApplicationResource</code> method in a fluent style.
     */
    public static class DeleteApplicationResourceQueryParams extends HashMap<String, Object> {
        public DeleteApplicationResourceQueryParams force(final Boolean value) {
            put("force", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve all applications
     * Retrieve all applications on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param name              The name of the application. (optional)
     * @param owner             The ID of the tenant that owns the applications.
     *                          (optional)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param providedFor       The ID of a tenant that is subscribed to the
     *                          applications but doesn&#39;t own them. (optional)
     * @param subscriber        The ID of a tenant that is subscribed to the
     *                          applications. (optional)
     * @param tenant            The ID of a tenant that either owns the application
     *                          or is subscribed to the applications. (optional)
     * @param type              The type of the application. It is possible to use
     *                          multiple values separated by a comma. For example,
     *                          &#x60;EXTERNAL,HOSTED&#x60; will return only
     *                          applications with type &#x60;EXTERNAL&#x60; or
     *                          &#x60;HOSTED&#x60;. (optional)
     * @param user              The ID of a user that has access to the
     *                          applications. (optional)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param hasVersions       When set to &#x60;true&#x60;, the returned result
     *                          contains applications with an
     *                          &#x60;applicationVersions&#x60; field that is not
     *                          empty. When set to &#x60;false&#x60;, the result
     *                          will contain applications with an empty
     *                          &#x60;applicationVersions&#x60; field. (optional)
     * @return ApplicationCollection
     */
    @RequestLine("GET /application/applications?currentPage={currentPage}&name={name}&owner={owner}&pageSize={pageSize}&providedFor={providedFor}&subscriber={subscriber}&tenant={tenant}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&hasVersions={hasVersions}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApplicationCollection getAbstractApplicationCollectionResource(@Param("currentPage") Integer currentPage,
            @Param("name") String name, @Param("owner") String owner, @Param("pageSize") Integer pageSize,
            @Param("providedFor") String providedFor, @Param("subscriber") String subscriber,
            @Param("tenant") String tenant,
            @Param("type") String type, @Param("user") String user,
            @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages, @Param("hasVersions") Boolean hasVersions);

    /**
     * Retrieve all applications
     * Similar to <code>getAbstractApplicationCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve all applications on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param name              The name of the application. (optional)
     * @param owner             The ID of the tenant that owns the applications.
     *                          (optional)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param providedFor       The ID of a tenant that is subscribed to the
     *                          applications but doesn&#39;t own them. (optional)
     * @param subscriber        The ID of a tenant that is subscribed to the
     *                          applications. (optional)
     * @param tenant            The ID of a tenant that either owns the application
     *                          or is subscribed to the applications. (optional)
     * @param type              The type of the application. It is possible to use
     *                          multiple values separated by a comma. For example,
     *                          &#x60;EXTERNAL,HOSTED&#x60; will return only
     *                          applications with type &#x60;EXTERNAL&#x60; or
     *                          &#x60;HOSTED&#x60;. (optional)
     * @param user              The ID of a user that has access to the
     *                          applications. (optional)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param hasVersions       When set to &#x60;true&#x60;, the returned result
     *                          contains applications with an
     *                          &#x60;applicationVersions&#x60; field that is not
     *                          empty. When set to &#x60;false&#x60;, the result
     *                          will contain applications with an empty
     *                          &#x60;applicationVersions&#x60; field. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applications?currentPage={currentPage}&name={name}&owner={owner}&pageSize={pageSize}&providedFor={providedFor}&subscriber={subscriber}&tenant={tenant}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&hasVersions={hasVersions}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<ApplicationCollection> getAbstractApplicationCollectionResourceWithHttpInfo(
            @Param("currentPage") Integer currentPage, @Param("name") String name, @Param("owner") String owner,
            @Param("pageSize") Integer pageSize, @Param("providedFor") String providedFor,
            @Param("subscriber") String subscriber, @Param("tenant") String tenant, @Param("type") String type,
            @Param("user") String user, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages, @Param("hasVersions") Boolean hasVersions);

    /**
     * Retrieve all applications
     * Retrieve all applications on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getAbstractApplicationCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetAbstractApplicationCollectionResourceQueryParams}
     * class that allows for
     * building up this map in a fluent style.
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>currentPage - The current page of the paginated
     *                    results. (optional, default to 1)</li>
     *                    <li>name - The name of the application. (optional)</li>
     *                    <li>owner - The ID of the tenant that owns the
     *                    applications. (optional)</li>
     *                    <li>pageSize - Indicates how many entries of the
     *                    collection shall be returned. The upper limit for one page
     *                    is 2,000 objects. (optional, default to 5)</li>
     *                    <li>providedFor - The ID of a tenant that is subscribed to
     *                    the applications but doesn&#39;t own them. (optional)</li>
     *                    <li>subscriber - The ID of a tenant that is subscribed to
     *                    the applications. (optional)</li>
     *                    <li>tenant - The ID of a tenant that either owns the
     *                    application or is subscribed to the applications.
     *                    (optional)</li>
     *                    <li>type - The type of the application. It is possible to
     *                    use multiple values separated by a comma. For example,
     *                    &#x60;EXTERNAL,HOSTED&#x60; will return only applications
     *                    with type &#x60;EXTERNAL&#x60; or &#x60;HOSTED&#x60;.
     *                    (optional)</li>
     *                    <li>user - The ID of a user that has access to the
     *                    applications. (optional)</li>
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>hasVersions - When set to &#x60;true&#x60;, the
     *                    returned result contains applications with an
     *                    &#x60;applicationVersions&#x60; field that is not empty.
     *                    When set to &#x60;false&#x60;, the result will contain
     *                    applications with an empty &#x60;applicationVersions&#x60;
     *                    field. (optional)</li>
     *                    </ul>
     * @return ApplicationCollection
     */
    @RequestLine("GET /application/applications?currentPage={currentPage}&name={name}&owner={owner}&pageSize={pageSize}&providedFor={providedFor}&subscriber={subscriber}&tenant={tenant}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&hasVersions={hasVersions}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApplicationCollection getAbstractApplicationCollectionResource(
            @QueryMap(encoded = true) GetAbstractApplicationCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all applications
     * Retrieve all applications on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getAbstractApplicationCollectionResource</code> that receives the query
     * parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>currentPage - The current page of the paginated
     *                    results. (optional, default to 1)</li>
     *                    <li>name - The name of the application. (optional)</li>
     *                    <li>owner - The ID of the tenant that owns the
     *                    applications. (optional)</li>
     *                    <li>pageSize - Indicates how many entries of the
     *                    collection shall be returned. The upper limit for one page
     *                    is 2,000 objects. (optional, default to 5)</li>
     *                    <li>providedFor - The ID of a tenant that is subscribed to
     *                    the applications but doesn&#39;t own them. (optional)</li>
     *                    <li>subscriber - The ID of a tenant that is subscribed to
     *                    the applications. (optional)</li>
     *                    <li>tenant - The ID of a tenant that either owns the
     *                    application or is subscribed to the applications.
     *                    (optional)</li>
     *                    <li>type - The type of the application. It is possible to
     *                    use multiple values separated by a comma. For example,
     *                    &#x60;EXTERNAL,HOSTED&#x60; will return only applications
     *                    with type &#x60;EXTERNAL&#x60; or &#x60;HOSTED&#x60;.
     *                    (optional)</li>
     *                    <li>user - The ID of a user that has access to the
     *                    applications. (optional)</li>
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>hasVersions - When set to &#x60;true&#x60;, the
     *                    returned result contains applications with an
     *                    &#x60;applicationVersions&#x60; field that is not empty.
     *                    When set to &#x60;false&#x60;, the result will contain
     *                    applications with an empty &#x60;applicationVersions&#x60;
     *                    field. (optional)</li>
     *                    </ul>
     * @return ApplicationCollection
     */
    @RequestLine("GET /application/applications?currentPage={currentPage}&name={name}&owner={owner}&pageSize={pageSize}&providedFor={providedFor}&subscriber={subscriber}&tenant={tenant}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&hasVersions={hasVersions}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<ApplicationCollection> getAbstractApplicationCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetAbstractApplicationCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getAbstractApplicationCollectionResource</code> method in a fluent
     * style.
     */
    public static class GetAbstractApplicationCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetAbstractApplicationCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams name(final String value) {
            put("name", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams owner(final String value) {
            put("owner", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams providedFor(final String value) {
            put("providedFor", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams subscriber(final String value) {
            put("subscriber", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams tenant(final String value) {
            put("tenant", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams type(final String value) {
            put("type", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams user(final String value) {
            put("user", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }

        public GetAbstractApplicationCollectionResourceQueryParams hasVersions(final Boolean value) {
            put("hasVersions", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific application
     * Retrieve a specific application (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; current user has
     * explicit access to the application &lt;/section&gt;
     * 
     * @param id Unique identifier of the application. (required)
     * @return Application
     */
    @RequestLine("GET /application/applications/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    Application getApplicationResource(@Param("id") String id);

    /**
     * Retrieve a specific application
     * Similar to <code>getApplicationResource</code> but it also returns the http
     * response headers .
     * Retrieve a specific application (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; current user has
     * explicit access to the application &lt;/section&gt;
     * 
     * @param id Unique identifier of the application. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applications/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Application> getApplicationResourceWithHttpInfo(@Param("id") String id);

    /**
     * Retrieve applications by name
     * Retrieve applications by name. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param name The name of the application. (required)
     * @return GetApplicationsByNameCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByName/{name}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByNameCollectionResource200Response getApplicationsByNameCollectionResource(
            @Param("name") String name);

    /**
     * Retrieve applications by name
     * Similar to <code>getApplicationsByNameCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve applications by name. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param name The name of the application. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applicationsByName/{name}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByNameCollectionResource200Response> getApplicationsByNameCollectionResourceWithHttpInfo(
            @Param("name") String name);

    /**
     * Retrieve applications by owner
     * Retrieve all applications owned by a particular tenant (by a given tenant
     * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
     *                          (required)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @return GetApplicationsByOwnerCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByOwner/{tenantId}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByOwnerCollectionResource200Response getApplicationsByOwnerCollectionResource(
            @Param("tenantId") String tenantId, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve applications by owner
     * Similar to <code>getApplicationsByOwnerCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve all applications owned by a particular tenant (by a given tenant
     * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
     *                          (required)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applicationsByOwner/{tenantId}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByOwnerCollectionResource200Response> getApplicationsByOwnerCollectionResourceWithHttpInfo(
            @Param("tenantId") String tenantId, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve applications by owner
     * Retrieve all applications owned by a particular tenant (by a given tenant
     * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getApplicationsByOwnerCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetApplicationsByOwnerCollectionResourceQueryParams}
     * class that allows for
     * building up this map in a fluent style.
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
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
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return GetApplicationsByOwnerCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByOwner/{tenantId}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByOwnerCollectionResource200Response getApplicationsByOwnerCollectionResource(
            @Param("tenantId") String tenantId,
            @QueryMap(encoded = true) GetApplicationsByOwnerCollectionResourceQueryParams queryParams);

    /**
     * Retrieve applications by owner
     * Retrieve all applications owned by a particular tenant (by a given tenant
     * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getApplicationsByOwnerCollectionResource</code> that receives the query
     * parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
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
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return GetApplicationsByOwnerCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByOwner/{tenantId}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByOwnerCollectionResource200Response> getApplicationsByOwnerCollectionResourceWithHttpInfo(
            @Param("tenantId") String tenantId,
            @QueryMap(encoded = true) GetApplicationsByOwnerCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getApplicationsByOwnerCollectionResource</code> method in a fluent
     * style.
     */
    public static class GetApplicationsByOwnerCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetApplicationsByOwnerCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByOwnerCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByOwnerCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByOwnerCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve applications by tenant
     * Retrieve applications subscribed or owned by a particular tenant (by a given
     * tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return GetApplicationsByTenantCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByTenant/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByTenantCollectionResource200Response getApplicationsByTenantCollectionResource(
            @Param("tenantId") String tenantId);

    /**
     * Retrieve applications by tenant
     * Similar to <code>getApplicationsByTenantCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve applications subscribed or owned by a particular tenant (by a given
     * tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applicationsByTenant/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByTenantCollectionResource200Response> getApplicationsByTenantCollectionResourceWithHttpInfo(
            @Param("tenantId") String tenantId);

    /**
     * Retrieve applications by user
     * Retrieve all applications for a particular user (by a given username).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * (ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;AND&lt;/b&gt; is the current user)
     * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ) &lt;/section&gt;
     * 
     * @param username          The username of the a user. (required)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @return GetApplicationsByUserCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByUser/{username}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByUserCollectionResource200Response getApplicationsByUserCollectionResource(
            @Param("username") String username, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve applications by user
     * Similar to <code>getApplicationsByUserCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve all applications for a particular user (by a given username).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * (ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;AND&lt;/b&gt; is the current user)
     * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ) &lt;/section&gt;
     * 
     * @param username          The username of the a user. (required)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param withTotalElements When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of elements. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @param withTotalPages    When set to &#x60;true&#x60;, the returned result
     *                          will contain in the statistics object the total
     *                          number of pages. Only applicable on [range
     *                          queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                          (optional, default to false)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applicationsByUser/{username}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByUserCollectionResource200Response> getApplicationsByUserCollectionResourceWithHttpInfo(
            @Param("username") String username, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve applications by user
     * Retrieve all applications for a particular user (by a given username).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * (ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;AND&lt;/b&gt; is the current user)
     * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ) &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getApplicationsByUserCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetApplicationsByUserCollectionResourceQueryParams}
     * class that allows for
     * building up this map in a fluent style.
     * 
     * @param username    The username of the a user. (required)
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
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return GetApplicationsByUserCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByUser/{username}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    GetApplicationsByUserCollectionResource200Response getApplicationsByUserCollectionResource(
            @Param("username") String username,
            @QueryMap(encoded = true) GetApplicationsByUserCollectionResourceQueryParams queryParams);

    /**
     * Retrieve applications by user
     * Retrieve all applications for a particular user (by a given username).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * (ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;AND&lt;/b&gt; is the current user)
     * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt;
     * ROLE_APPLICATION_MANAGEMENT_READ) &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getApplicationsByUserCollectionResource</code> that receives the query
     * parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param username    The username of the a user. (required)
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
     *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of elements. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return GetApplicationsByUserCollectionResource200Response
     */
    @RequestLine("GET /application/applicationsByUser/{username}?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<GetApplicationsByUserCollectionResource200Response> getApplicationsByUserCollectionResourceWithHttpInfo(
            @Param("username") String username,
            @QueryMap(encoded = true) GetApplicationsByUserCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getApplicationsByUserCollectionResource</code> method in a fluent
     * style.
     */
    public static class GetApplicationsByUserCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetApplicationsByUserCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByUserCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByUserCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetApplicationsByUserCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Create an application
     * Create an application on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postApplicationCollectionResourceRequest (required)
     * @param accept                                   Advertises which content
     *                                                 types, expressed as MIME
     *                                                 types, the client is able to
     *                                                 understand. (optional)
     * @param xCumulocityProcessingMode                Used to explicitly control
     *                                                 the processing mode of the
     *                                                 request. See [Processing
     *                                                 mode](#processing-mode) for
     *                                                 more details. (optional,
     *                                                 default to PERSISTENT)
     * @return Application
     */
    @RequestLine("POST /application/applications")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    Application postApplicationCollectionResource(
            PostApplicationCollectionResourceRequest postApplicationCollectionResourceRequest,
            @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Create an application
     * Similar to <code>postApplicationCollectionResource</code> but it also returns
     * the http response headers .
     * Create an application on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postApplicationCollectionResourceRequest (required)
     * @param accept                                   Advertises which content
     *                                                 types, expressed as MIME
     *                                                 types, the client is able to
     *                                                 understand. (optional)
     * @param xCumulocityProcessingMode                Used to explicitly control
     *                                                 the processing mode of the
     *                                                 request. See [Processing
     *                                                 mode](#processing-mode) for
     *                                                 more details. (optional,
     *                                                 default to PERSISTENT)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /application/applications")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Application> postApplicationCollectionResourceWithHttpInfo(
            PostApplicationCollectionResourceRequest postApplicationCollectionResourceRequest,
            @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Copy an application
     * Copy an application (by a given ID). This method is not supported by
     * microservice applications. A request to the \&quot;clone\&quot; resource
     * creates a new application based on an already existing one. The properties
     * are copied to the newly created application and the prefix
     * \&quot;clone\&quot; is added to the properties &#x60;name&#x60;,
     * &#x60;key&#x60; and &#x60;contextPath&#x60; in order to be unique. If the
     * target application is hosted and has an active version, the new application
     * will have the active version with the same content. If the original
     * application is hosted with versions, then only one binary version is cloned.
     * By default it is a version with the \&quot;latest\&quot; tag. You can also
     * specify a target version directly by using exactly one of the query
     * parameters &#x60;version&#x60; or &#x60;tag&#x60;.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param version                   The version field of the application
     *                                  version. (optional)
     * @param tag                       The tag of the application version.
     *                                  (optional)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @return Application
     */
    @RequestLine("POST /application/applications/{id}/clone?version={version}&tag={tag}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    Application postApplicationResource(@Param("id") String id, @Param("version") String version,
            @Param("tag") String tag, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Copy an application
     * Similar to <code>postApplicationResource</code> but it also returns the http
     * response headers .
     * Copy an application (by a given ID). This method is not supported by
     * microservice applications. A request to the \&quot;clone\&quot; resource
     * creates a new application based on an already existing one. The properties
     * are copied to the newly created application and the prefix
     * \&quot;clone\&quot; is added to the properties &#x60;name&#x60;,
     * &#x60;key&#x60; and &#x60;contextPath&#x60; in order to be unique. If the
     * target application is hosted and has an active version, the new application
     * will have the active version with the same content. If the original
     * application is hosted with versions, then only one binary version is cloned.
     * By default it is a version with the \&quot;latest\&quot; tag. You can also
     * specify a target version directly by using exactly one of the query
     * parameters &#x60;version&#x60; or &#x60;tag&#x60;.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param version                   The version field of the application
     *                                  version. (optional)
     * @param tag                       The tag of the application version.
     *                                  (optional)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /application/applications/{id}/clone?version={version}&tag={tag}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Application> postApplicationResourceWithHttpInfo(@Param("id") String id,
            @Param("version") String version,
            @Param("tag") String tag, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Copy an application
     * Copy an application (by a given ID). This method is not supported by
     * microservice applications. A request to the \&quot;clone\&quot; resource
     * creates a new application based on an already existing one. The properties
     * are copied to the newly created application and the prefix
     * \&quot;clone\&quot; is added to the properties &#x60;name&#x60;,
     * &#x60;key&#x60; and &#x60;contextPath&#x60; in order to be unique. If the
     * target application is hosted and has an active version, the new application
     * will have the active version with the same content. If the original
     * application is hosted with versions, then only one binary version is cloned.
     * By default it is a version with the \&quot;latest\&quot; tag. You can also
     * specify a target version directly by using exactly one of the query
     * parameters &#x60;version&#x60; or &#x60;tag&#x60;.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other <code>postApplicationResource</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PostApplicationResourceQueryParams} class that allows
     * for
     * building up this map in a fluent style.
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param queryParams               Map of query parameters as name-value pairs
     *                                  <p>
     *                                  The following elements may be specified in
     *                                  the query map:
     *                                  </p>
     *                                  <ul>
     *                                  <li>version - The version field of the
     *                                  application version. (optional)</li>
     *                                  <li>tag - The tag of the application
     *                                  version. (optional)</li>
     *                                  </ul>
     * @return Application
     */
    @RequestLine("POST /application/applications/{id}/clone?version={version}&tag={tag}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    Application postApplicationResource(@Param("id") String id, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) PostApplicationResourceQueryParams queryParams);

    /**
     * Copy an application
     * Copy an application (by a given ID). This method is not supported by
     * microservice applications. A request to the \&quot;clone\&quot; resource
     * creates a new application based on an already existing one. The properties
     * are copied to the newly created application and the prefix
     * \&quot;clone\&quot; is added to the properties &#x60;name&#x60;,
     * &#x60;key&#x60; and &#x60;contextPath&#x60; in order to be unique. If the
     * target application is hosted and has an active version, the new application
     * will have the active version with the same content. If the original
     * application is hosted with versions, then only one binary version is cloned.
     * By default it is a version with the \&quot;latest\&quot; tag. You can also
     * specify a target version directly by using exactly one of the query
     * parameters &#x60;version&#x60; or &#x60;tag&#x60;.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other <code>postApplicationResource</code>
     * that receives the query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param id                        Unique identifier of the application.
     *                                  (required)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param queryParams               Map of query parameters as name-value pairs
     *                                  <p>
     *                                  The following elements may be specified in
     *                                  the query map:
     *                                  </p>
     *                                  <ul>
     *                                  <li>version - The version field of the
     *                                  application version. (optional)</li>
     *                                  <li>tag - The tag of the application
     *                                  version. (optional)</li>
     *                                  </ul>
     * @return Application
     */
    @RequestLine("POST /application/applications/{id}/clone?version={version}&tag={tag}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Application> postApplicationResourceWithHttpInfo(@Param("id") String id, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) PostApplicationResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postApplicationResource</code> method in a fluent style.
     */
    public static class PostApplicationResourceQueryParams extends HashMap<String, Object> {
        public PostApplicationResourceQueryParams version(final String value) {
            put("version", EncodingUtils.encode(value));
            return this;
        }

        public PostApplicationResourceQueryParams tag(final String value) {
            put("tag", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Update a specific application
     * Update a specific application (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id                            Unique identifier of the application.
     *                                      (required)
     * @param putApplicationResourceRequest (required)
     * @param accept                        Advertises which content types,
     *                                      expressed as MIME types, the client is
     *                                      able to understand. (optional)
     * @param xCumulocityProcessingMode     Used to explicitly control the
     *                                      processing mode of the request. See
     *                                      [Processing mode](#processing-mode) for
     *                                      more details. (optional, default to
     *                                      PERSISTENT)
     * @return Application
     */
    @RequestLine("PUT /application/applications/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    Application putApplicationResource(@Param("id") String id,
            PutApplicationResourceRequest putApplicationResourceRequest, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Update a specific application
     * Similar to <code>putApplicationResource</code> but it also returns the http
     * response headers .
     * Update a specific application (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id                            Unique identifier of the application.
     *                                      (required)
     * @param putApplicationResourceRequest (required)
     * @param accept                        Advertises which content types,
     *                                      expressed as MIME types, the client is
     *                                      able to understand. (optional)
     * @param xCumulocityProcessingMode     Used to explicitly control the
     *                                      processing mode of the request. See
     *                                      [Processing mode](#processing-mode) for
     *                                      more details. (optional, default to
     *                                      PERSISTENT)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /application/applications/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Application> putApplicationResourceWithHttpInfo(@Param("id") String id,
            PutApplicationResourceRequest putApplicationResourceRequest, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
