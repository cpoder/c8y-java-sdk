package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.ApplicationReference;
import org.cpo.c8y.model.ApplicationReferenceCollection;
import org.cpo.c8y.model.SubscribedApplicationReference;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface TenantApplicationsApi extends ApiClient.Api {

  /**
   * Unsubscribe from an application
   * Unsubscribe a tenant (by a given tenant ID) from an application (by a given
   * application ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the application
   * owner &lt;b&gt;AND&lt;/b&gt; is the current tenant)
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; ((ROLE_TENANT_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_UPDATE) &lt;b&gt;AND&lt;/b&gt;
   * (the current tenant is its parent &lt;b&gt;OR&lt;/b&gt; is the management
   * tenant)) &lt;/section&gt;
   * 
   * @param tenantId      Unique identifier of a Cumulocity IoT tenant. (required)
   * @param applicationId Unique identifier of the application. (required)
   */
  @RequestLine("DELETE /tenant/tenants/{tenantId}/applications/{applicationId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteTenantApplicationReferenceResource(@Param("tenantId") String tenantId,
      @Param("applicationId") String applicationId);

  /**
   * Unsubscribe from an application
   * Similar to <code>deleteTenantApplicationReferenceResource</code> but it also
   * returns the http response headers .
   * Unsubscribe a tenant (by a given tenant ID) from an application (by a given
   * application ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the application
   * owner &lt;b&gt;AND&lt;/b&gt; is the current tenant)
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; ((ROLE_TENANT_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_UPDATE) &lt;b&gt;AND&lt;/b&gt;
   * (the current tenant is its parent &lt;b&gt;OR&lt;/b&gt; is the management
   * tenant)) &lt;/section&gt;
   * 
   * @param tenantId      Unique identifier of a Cumulocity IoT tenant. (required)
   * @param applicationId Unique identifier of the application. (required)
   */
  @RequestLine("DELETE /tenant/tenants/{tenantId}/applications/{applicationId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteTenantApplicationReferenceResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("applicationId") String applicationId);

  /**
   * Retrieve subscribed applications
   * Retrieve the tenant subscribed applications by a given tenant ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (the current tenant is its parent
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
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
   * @return ApplicationReferenceCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/applications?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationreferencecollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApplicationReferenceCollection getTenantApplicationReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve subscribed applications
   * Similar to <code>getTenantApplicationReferenceCollectionResource</code> but
   * it also returns the http response headers .
   * Retrieve the tenant subscribed applications by a given tenant ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (the current tenant is its parent
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
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
  @RequestLine("GET /tenant/tenants/{tenantId}/applications?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationreferencecollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<ApplicationReferenceCollection> getTenantApplicationReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve subscribed applications
   * Retrieve the tenant subscribed applications by a given tenant ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (the current tenant is its parent
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantApplicationReferenceCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the
   * {@link GetTenantApplicationReferenceCollectionResourceQueryParams} class that
   * allows for
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
   * @return ApplicationReferenceCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/applications?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationreferencecollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApplicationReferenceCollection getTenantApplicationReferenceCollectionResource(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetTenantApplicationReferenceCollectionResourceQueryParams queryParams);

  /**
   * Retrieve subscribed applications
   * Retrieve the tenant subscribed applications by a given tenant ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (the current tenant is its parent
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantApplicationReferenceCollectionResource</code> that receives
   * the query parameters as a map,
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
   * @return ApplicationReferenceCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/applications?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.applicationreferencecollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<ApplicationReferenceCollection> getTenantApplicationReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetTenantApplicationReferenceCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTenantApplicationReferenceCollectionResource</code> method in a
   * fluent style.
   */
  public static class GetTenantApplicationReferenceCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetTenantApplicationReferenceCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantApplicationReferenceCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantApplicationReferenceCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantApplicationReferenceCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Subscribe to an application
   * Subscribe a tenant (by a given ID) to an application.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; 1. the current tenant is
   * application owner and has the role ROLE_APPLICATION_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; 2. for applications that are not
   * microservices, the current tenant is the management tenant or the parent of
   * the application owner tenant, and the user has one of the follwoing roles:
   * ROLE_TENANT_MANAGEMENT_ADMIN, ROLE_TENANT_MANAGEMENT_UPDATE
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; 3. for microservices, the current tenant is
   * the management tenant or the parent of the application owner tenant, and the
   * user has the role ROLE_TENANT_MANAGEMENT_ADMIN OR
   * ROLE_TENANT_MANAGEMENT_UPDATE and one of following conditions is
   * met:&lt;br&gt; * the microservice has no manifest&lt;br&gt; * the
   * microservice version is supported&lt;br&gt; * the current tenant is
   * subscribed to &#39;feature-privileged-microservice-hosting&#39;
   * &lt;/section&gt;
   * 
   * @param tenantId                       Unique identifier of a Cumulocity IoT
   *                                       tenant. (required)
   * @param subscribedApplicationReference (required)
   * @param accept                         Advertises which content types,
   *                                       expressed as MIME types, the client is
   *                                       able to understand. (optional)
   * @return ApplicationReference
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/applications")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.applicationreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.applicationreference+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApplicationReference postTenantApplicationReferenceCollectionResource(@Param("tenantId") String tenantId,
      SubscribedApplicationReference subscribedApplicationReference, @Param("accept") String accept);

  /**
   * Subscribe to an application
   * Similar to <code>postTenantApplicationReferenceCollectionResource</code> but
   * it also returns the http response headers .
   * Subscribe a tenant (by a given ID) to an application.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; 1. the current tenant is
   * application owner and has the role ROLE_APPLICATION_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; 2. for applications that are not
   * microservices, the current tenant is the management tenant or the parent of
   * the application owner tenant, and the user has one of the follwoing roles:
   * ROLE_TENANT_MANAGEMENT_ADMIN, ROLE_TENANT_MANAGEMENT_UPDATE
   * &lt;b&gt;OR&lt;/b&gt;&lt;br&gt; 3. for microservices, the current tenant is
   * the management tenant or the parent of the application owner tenant, and the
   * user has the role ROLE_TENANT_MANAGEMENT_ADMIN OR
   * ROLE_TENANT_MANAGEMENT_UPDATE and one of following conditions is
   * met:&lt;br&gt; * the microservice has no manifest&lt;br&gt; * the
   * microservice version is supported&lt;br&gt; * the current tenant is
   * subscribed to &#39;feature-privileged-microservice-hosting&#39;
   * &lt;/section&gt;
   * 
   * @param tenantId                       Unique identifier of a Cumulocity IoT
   *                                       tenant. (required)
   * @param subscribedApplicationReference (required)
   * @param accept                         Advertises which content types,
   *                                       expressed as MIME types, the client is
   *                                       able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/applications")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.applicationreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.applicationreference+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<ApplicationReference> postTenantApplicationReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, SubscribedApplicationReference subscribedApplicationReference,
      @Param("accept") String accept);

}
