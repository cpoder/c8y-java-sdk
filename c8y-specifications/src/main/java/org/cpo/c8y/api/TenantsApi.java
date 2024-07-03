package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.CurrentTenant;
import org.cpo.c8y.model.PostTenantCollectionResourceRequest;
import org.cpo.c8y.model.PutTenantResourceRequest;
import org.cpo.c8y.model.Tenant;
import org.cpo.c8y.model.TenantCollection;
import org.cpo.c8y.model.TenantTfaData;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface TenantsApi extends ApiClient.Api {

    /**
     * Remove a specific tenant
     * Remove a specific tenant by a given ID. &gt; **⚠️ Important:** Deleting a
     * subtenant cannot be reverted. For security reasons, it is therefore only
     * available in the management tenant. You cannot delete tenants from any tenant
     * but the management tenant. &gt; &gt; Administrators in Enterprise Tenants are
     * only allowed to suspend active subtenants, but not to delete them.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     */
    @RequestLine("DELETE /tenant/tenants/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteTenantResource(@Param("tenantId") String tenantId);

    /**
     * Remove a specific tenant
     * Similar to <code>deleteTenantResource</code> but it also returns the http
     * response headers .
     * Remove a specific tenant by a given ID. &gt; **⚠️ Important:** Deleting a
     * subtenant cannot be reverted. For security reasons, it is therefore only
     * available in the management tenant. You cannot delete tenants from any tenant
     * but the management tenant. &gt; &gt; Administrators in Enterprise Tenants are
     * only allowed to suspend active subtenants, but not to delete them.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     */
    @RequestLine("DELETE /tenant/tenants/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteTenantResourceWithHttpInfo(@Param("tenantId") String tenantId);

    /**
     * Retrieve the current tenant
     * Retrieve information about the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * 
     * @param withParent When set to &#x60;true&#x60;, the returned result will
     *                   contain the parent of the current tenant. (optional,
     *                   default to false)
     * @return CurrentTenant
     */
    @RequestLine("GET /tenant/currentTenant?withParent={withParent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currenttenant+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    CurrentTenant getCurrentTenantResource(@Param("withParent") Boolean withParent);

    /**
     * Retrieve the current tenant
     * Similar to <code>getCurrentTenantResource</code> but it also returns the http
     * response headers .
     * Retrieve information about the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * 
     * @param withParent When set to &#x60;true&#x60;, the returned result will
     *                   contain the parent of the current tenant. (optional,
     *                   default to false)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/currentTenant?withParent={withParent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currenttenant+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<CurrentTenant> getCurrentTenantResourceWithHttpInfo(@Param("withParent") Boolean withParent);

    /**
     * Retrieve the current tenant
     * Retrieve information about the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * Note, this is equivalent to the other <code>getCurrentTenantResource</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetCurrentTenantResourceQueryParams} class that allows
     * for
     * building up this map in a fluent style.
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>withParent - When set to &#x60;true&#x60;, the
     *                    returned result will contain the parent of the current
     *                    tenant. (optional, default to false)</li>
     *                    </ul>
     * @return CurrentTenant
     */
    @RequestLine("GET /tenant/currentTenant?withParent={withParent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currenttenant+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    CurrentTenant getCurrentTenantResource(@QueryMap(encoded = true) GetCurrentTenantResourceQueryParams queryParams);

    /**
     * Retrieve the current tenant
     * Retrieve information about the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * Note, this is equivalent to the other <code>getCurrentTenantResource</code>
     * that receives the query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>withParent - When set to &#x60;true&#x60;, the
     *                    returned result will contain the parent of the current
     *                    tenant. (optional, default to false)</li>
     *                    </ul>
     * @return CurrentTenant
     */
    @RequestLine("GET /tenant/currentTenant?withParent={withParent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currenttenant+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<CurrentTenant> getCurrentTenantResourceWithHttpInfo(
            @QueryMap(encoded = true) GetCurrentTenantResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getCurrentTenantResource</code> method in a fluent style.
     */
    public static class GetCurrentTenantResourceQueryParams extends HashMap<String, Object> {
        public GetCurrentTenantResourceQueryParams withParent(final Boolean value) {
            put("withParent", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve all subtenants
     * Retrieve all subtenants of the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
     * 
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
     * @param company           Company name associated with the Cumulocity IoT
     *                          tenant. (optional)
     * @param domain            Domain name of the Cumulocity IoT tenant. (optional)
     * @param parent            Identifier of the Cumulocity IoT tenant&#39;s
     *                          parent. (optional)
     * @return TenantCollection
     */
    @RequestLine("GET /tenant/tenants?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&company={company}&domain={domain}&parent={parent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantcollection+json",
    })
    TenantCollection getTenantCollectionResource(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages, @Param("company") String company,
            @Param("domain") String domain,
            @Param("parent") String parent);

    /**
     * Retrieve all subtenants
     * Similar to <code>getTenantCollectionResource</code> but it also returns the
     * http response headers .
     * Retrieve all subtenants of the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
     * 
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
     * @param company           Company name associated with the Cumulocity IoT
     *                          tenant. (optional)
     * @param domain            Domain name of the Cumulocity IoT tenant. (optional)
     * @param parent            Identifier of the Cumulocity IoT tenant&#39;s
     *                          parent. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/tenants?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&company={company}&domain={domain}&parent={parent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantcollection+json",
    })
    ApiResponse<TenantCollection> getTenantCollectionResourceWithHttpInfo(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages, @Param("company") String company,
            @Param("domain") String domain,
            @Param("parent") String parent);

    /**
     * Retrieve all subtenants
     * Retrieve all subtenants of the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getTenantCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetTenantCollectionResourceQueryParams} class that
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
     *                    <li>company - Company name associated with the Cumulocity
     *                    IoT tenant. (optional)</li>
     *                    <li>domain - Domain name of the Cumulocity IoT tenant.
     *                    (optional)</li>
     *                    <li>parent - Identifier of the Cumulocity IoT tenant&#39;s
     *                    parent. (optional)</li>
     *                    </ul>
     * @return TenantCollection
     */
    @RequestLine("GET /tenant/tenants?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&company={company}&domain={domain}&parent={parent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantcollection+json",
    })
    TenantCollection getTenantCollectionResource(
            @QueryMap(encoded = true) GetTenantCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all subtenants
     * Retrieve all subtenants of the current tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getTenantCollectionResource</code> that receives the query parameters
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
     *                    <li>company - Company name associated with the Cumulocity
     *                    IoT tenant. (optional)</li>
     *                    <li>domain - Domain name of the Cumulocity IoT tenant.
     *                    (optional)</li>
     *                    <li>parent - Identifier of the Cumulocity IoT tenant&#39;s
     *                    parent. (optional)</li>
     *                    </ul>
     * @return TenantCollection
     */
    @RequestLine("GET /tenant/tenants?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&company={company}&domain={domain}&parent={parent}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantcollection+json",
    })
    ApiResponse<TenantCollection> getTenantCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetTenantCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getTenantCollectionResource</code> method in a fluent style.
     */
    public static class GetTenantCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetTenantCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams company(final String value) {
            put("company", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams domain(final String value) {
            put("domain", EncodingUtils.encode(value));
            return this;
        }

        public GetTenantCollectionResourceQueryParams parent(final String value) {
            put("parent", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific tenant
     * Retrieve a specific tenant by a given ID. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt; (the
     * current tenant is its parent &lt;b&gt;OR&lt;/b&gt; is the management tenant)
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return Tenant
     */
    @RequestLine("GET /tenant/tenants/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
    })
    Tenant getTenantResource(@Param("tenantId") String tenantId);

    /**
     * Retrieve a specific tenant
     * Similar to <code>getTenantResource</code> but it also returns the http
     * response headers .
     * Retrieve a specific tenant by a given ID. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;AND&lt;/b&gt; (the
     * current tenant is its parent &lt;b&gt;OR&lt;/b&gt; is the management tenant)
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/tenants/{tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
    })
    ApiResponse<Tenant> getTenantResourceWithHttpInfo(@Param("tenantId") String tenantId);

    /**
     * Retrieve TFA settings of a specific tenant
     * Retrieve the two-factor authentication settings of a specific tenant by a
     * given tenant ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ((ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_READ) &lt;b&gt;AND&lt;/b&gt; (the current tenant is its
     * parent &lt;b&gt;OR&lt;/b&gt; is the management tenant &lt;b&gt;OR&lt;/b&gt;
     * the current user belongs to the tenant)) &lt;b&gt;OR&lt;/b&gt; (the user
     * belongs to the tenant &lt;b&gt;AND&lt;/b&gt; ROLE_USER_MANAGEMENT_OWN_READ)
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return TenantTfaData
     */
    @RequestLine("GET /tenant/tenants/{tenantId}/tfa")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
    })
    TenantTfaData getTenantsTfaResourceTfa(@Param("tenantId") String tenantId);

    /**
     * Retrieve TFA settings of a specific tenant
     * Similar to <code>getTenantsTfaResourceTfa</code> but it also returns the http
     * response headers .
     * Retrieve the two-factor authentication settings of a specific tenant by a
     * given tenant ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ((ROLE_TENANT_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_READ) &lt;b&gt;AND&lt;/b&gt; (the current tenant is its
     * parent &lt;b&gt;OR&lt;/b&gt; is the management tenant &lt;b&gt;OR&lt;/b&gt;
     * the current user belongs to the tenant)) &lt;b&gt;OR&lt;/b&gt; (the user
     * belongs to the tenant &lt;b&gt;AND&lt;/b&gt; ROLE_USER_MANAGEMENT_OWN_READ)
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/tenants/{tenantId}/tfa")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<TenantTfaData> getTenantsTfaResourceTfaWithHttpInfo(@Param("tenantId") String tenantId);

    /**
     * Create a tenant
     * Create a subtenant for the current tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_TENANT_MANAGEMENT_CREATE) &lt;b&gt;AND&lt;/b&gt; the current tenant is
     * allowed to create subtenants &lt;/section&gt;
     * 
     * @param postTenantCollectionResourceRequest (required)
     * @param accept                              Advertises which content types,
     *                                            expressed as MIME types, the
     *                                            client is able to understand.
     *                                            (optional)
     * @return Tenant
     */
    @RequestLine("POST /tenant/tenants")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: {accept}"
    })
    Tenant postTenantCollectionResource(PostTenantCollectionResourceRequest postTenantCollectionResourceRequest,
            @Param("accept") String accept);

    /**
     * Create a tenant
     * Similar to <code>postTenantCollectionResource</code> but it also returns the
     * http response headers .
     * Create a subtenant for the current tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_TENANT_MANAGEMENT_CREATE) &lt;b&gt;AND&lt;/b&gt; the current tenant is
     * allowed to create subtenants &lt;/section&gt;
     * 
     * @param postTenantCollectionResourceRequest (required)
     * @param accept                              Advertises which content types,
     *                                            expressed as MIME types, the
     *                                            client is able to understand.
     *                                            (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /tenant/tenants")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: {accept}"
    })
    ApiResponse<Tenant> postTenantCollectionResourceWithHttpInfo(
            PostTenantCollectionResourceRequest postTenantCollectionResourceRequest, @Param("accept") String accept);

    /**
     * Update a specific tenant
     * Update a specific tenant by a given ID. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_TENANT_MANAGEMENT_UPDATE) &lt;b&gt;AND&lt;/b&gt;&lt;br&gt; ((the current
     * tenant is its parent &lt;b&gt;AND&lt;/b&gt; the current tenant is allowed to
     * create subtenants) &lt;b&gt;OR&lt;/b&gt; is the management tenant)
     * &lt;/section&gt;
     * 
     * @param tenantId                 Unique identifier of a Cumulocity IoT tenant.
     *                                 (required)
     * @param putTenantResourceRequest (required)
     * @param accept                   Advertises which content types, expressed as
     *                                 MIME types, the client is able to understand.
     *                                 (optional)
     * @return Tenant
     */
    @RequestLine("PUT /tenant/tenants/{tenantId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: {accept}"
    })
    Tenant putTenantResource(@Param("tenantId") String tenantId, PutTenantResourceRequest putTenantResourceRequest,
            @Param("accept") String accept);

    /**
     * Update a specific tenant
     * Similar to <code>putTenantResource</code> but it also returns the http
     * response headers .
     * Update a specific tenant by a given ID. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_TENANT_MANAGEMENT_UPDATE) &lt;b&gt;AND&lt;/b&gt;&lt;br&gt; ((the current
     * tenant is its parent &lt;b&gt;AND&lt;/b&gt; the current tenant is allowed to
     * create subtenants) &lt;b&gt;OR&lt;/b&gt; is the management tenant)
     * &lt;/section&gt;
     * 
     * @param tenantId                 Unique identifier of a Cumulocity IoT tenant.
     *                                 (required)
     * @param putTenantResourceRequest (required)
     * @param accept                   Advertises which content types, expressed as
     *                                 MIME types, the client is able to understand.
     *                                 (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /tenant/tenants/{tenantId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenant+json",
            "Accept: {accept}"
    })
    ApiResponse<Tenant> putTenantResourceWithHttpInfo(@Param("tenantId") String tenantId,
            PutTenantResourceRequest putTenantResourceRequest, @Param("accept") String accept);

}
