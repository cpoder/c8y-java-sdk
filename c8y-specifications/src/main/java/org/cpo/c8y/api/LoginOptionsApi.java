package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.AuthConfig;
import org.cpo.c8y.model.AuthConfigAccess;
import org.cpo.c8y.model.LoginOptionCollection;
import org.cpo.c8y.model.PostLoginOptionCollectionResourceRequest;
import org.cpo.c8y.model.PutLoginOptionResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface LoginOptionsApi extends ApiClient.Api {

    /**
     * Delete a specific login option
     * Delete a specific login option in the tenant by a given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN) &lt;b&gt;AND&lt;/b&gt;
     * tenant access to login option is not restricted by management tenant)
     * &lt;/section&gt;
     * 
     * @param typeOrId The type or ID of the login option. The type&#39;s value is
     *                 case insensitive and can be &#x60;OAUTH2&#x60;,
     *                 &#x60;OAUTH2_INTERNAL&#x60; or &#x60;BASIC&#x60;. (required)
     */
    @RequestLine("DELETE /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteLoginOptionResource(@Param("typeOrId") String typeOrId);

    /**
     * Delete a specific login option
     * Similar to <code>deleteLoginOptionResource</code> but it also returns the
     * http response headers .
     * Delete a specific login option in the tenant by a given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN) &lt;b&gt;AND&lt;/b&gt;
     * tenant access to login option is not restricted by management tenant)
     * &lt;/section&gt;
     * 
     * @param typeOrId The type or ID of the login option. The type&#39;s value is
     *                 case insensitive and can be &#x60;OAUTH2&#x60;,
     *                 &#x60;OAUTH2_INTERNAL&#x60; or &#x60;BASIC&#x60;. (required)
     */
    @RequestLine("DELETE /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteLoginOptionResourceWithHttpInfo(@Param("typeOrId") String typeOrId);

    /**
     * Retrieve all login options
     * Retrieve all login options available in the tenant.
     * 
     * @param management If this is set to &#x60;true&#x60;, the management tenant
     *                   login options will be returned. &gt; **&amp;#9432; Info:**
     *                   The &#x60;tenantId&#x60; parameter must not be present in
     *                   the request when using the &#x60;management&#x60;
     *                   parameter, otherwise it will cause an error. (optional,
     *                   default to false)
     * @param tenantId   Unique identifier of a Cumulocity IoT tenant. (optional)
     * @return LoginOptionCollection
     */
    @RequestLine("GET /tenant/loginOptions?management={management}&tenantId={tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.loginoptioncollection+json",
    })
    LoginOptionCollection getLoginOptionCollectionResource(@Param("management") Boolean management,
            @Param("tenantId") String tenantId);

    /**
     * Retrieve all login options
     * Similar to <code>getLoginOptionCollectionResource</code> but it also returns
     * the http response headers .
     * Retrieve all login options available in the tenant.
     * 
     * @param management If this is set to &#x60;true&#x60;, the management tenant
     *                   login options will be returned. &gt; **&amp;#9432; Info:**
     *                   The &#x60;tenantId&#x60; parameter must not be present in
     *                   the request when using the &#x60;management&#x60;
     *                   parameter, otherwise it will cause an error. (optional,
     *                   default to false)
     * @param tenantId   Unique identifier of a Cumulocity IoT tenant. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/loginOptions?management={management}&tenantId={tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.loginoptioncollection+json",
    })
    ApiResponse<LoginOptionCollection> getLoginOptionCollectionResourceWithHttpInfo(
            @Param("management") Boolean management, @Param("tenantId") String tenantId);

    /**
     * Retrieve all login options
     * Retrieve all login options available in the tenant.
     * Note, this is equivalent to the other
     * <code>getLoginOptionCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetLoginOptionCollectionResourceQueryParams} class that
     * allows for
     * building up this map in a fluent style.
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>management - If this is set to &#x60;true&#x60;, the
     *                    management tenant login options will be returned. &gt;
     *                    **&amp;#9432; Info:** The &#x60;tenantId&#x60; parameter
     *                    must not be present in the request when using the
     *                    &#x60;management&#x60; parameter, otherwise it will cause
     *                    an error. (optional, default to false)</li>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. (optional)</li>
     *                    </ul>
     * @return LoginOptionCollection
     */
    @RequestLine("GET /tenant/loginOptions?management={management}&tenantId={tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.loginoptioncollection+json",
    })
    LoginOptionCollection getLoginOptionCollectionResource(
            @QueryMap(encoded = true) GetLoginOptionCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all login options
     * Retrieve all login options available in the tenant.
     * Note, this is equivalent to the other
     * <code>getLoginOptionCollectionResource</code> that receives the query
     * parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>management - If this is set to &#x60;true&#x60;, the
     *                    management tenant login options will be returned. &gt;
     *                    **&amp;#9432; Info:** The &#x60;tenantId&#x60; parameter
     *                    must not be present in the request when using the
     *                    &#x60;management&#x60; parameter, otherwise it will cause
     *                    an error. (optional, default to false)</li>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. (optional)</li>
     *                    </ul>
     * @return LoginOptionCollection
     */
    @RequestLine("GET /tenant/loginOptions?management={management}&tenantId={tenantId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.loginoptioncollection+json",
    })
    ApiResponse<LoginOptionCollection> getLoginOptionCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetLoginOptionCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getLoginOptionCollectionResource</code> method in a fluent style.
     */
    public static class GetLoginOptionCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetLoginOptionCollectionResourceQueryParams management(final Boolean value) {
            put("management", EncodingUtils.encode(value));
            return this;
        }

        public GetLoginOptionCollectionResourceQueryParams tenantId(final String value) {
            put("tenantId", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific login option
     * Retrieve a specific login option in the tenant by the given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE) &lt;b&gt;AND&lt;/b&gt; tenant access to login
     * option is not restricted by management tenant) &lt;/section&gt;
     * 
     * @param typeOrId The type or ID of the login option. The type&#39;s value is
     *                 case insensitive and can be &#x60;OAUTH2&#x60;,
     *                 &#x60;OAUTH2_INTERNAL&#x60; or &#x60;BASIC&#x60;. (required)
     * @param accept   Advertises which content types, expressed as MIME types, the
     *                 client is able to understand. (optional)
     * @return AuthConfig
     */
    @RequestLine("GET /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.authConfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AuthConfig getLoginOptionResource(@Param("typeOrId") String typeOrId, @Param("accept") String accept);

    /**
     * Retrieve a specific login option
     * Similar to <code>getLoginOptionResource</code> but it also returns the http
     * response headers .
     * Retrieve a specific login option in the tenant by the given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE) &lt;b&gt;AND&lt;/b&gt; tenant access to login
     * option is not restricted by management tenant) &lt;/section&gt;
     * 
     * @param typeOrId The type or ID of the login option. The type&#39;s value is
     *                 case insensitive and can be &#x60;OAUTH2&#x60;,
     *                 &#x60;OAUTH2_INTERNAL&#x60; or &#x60;BASIC&#x60;. (required)
     * @param accept   Advertises which content types, expressed as MIME types, the
     *                 client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.authConfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AuthConfig> getLoginOptionResourceWithHttpInfo(@Param("typeOrId") String typeOrId,
            @Param("accept") String accept);

    /**
     * Create a login option
     * Create an authentication configuration on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postLoginOptionCollectionResourceRequest (required)
     * @param accept                                   Advertises which content
     *                                                 types, expressed as MIME
     *                                                 types, the client is able to
     *                                                 understand. (optional)
     * @return AuthConfig
     */
    @RequestLine("POST /tenant/loginOptions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.authconfig+json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AuthConfig postLoginOptionCollectionResource(
            PostLoginOptionCollectionResourceRequest postLoginOptionCollectionResourceRequest,
            @Param("accept") String accept);

    /**
     * Create a login option
     * Similar to <code>postLoginOptionCollectionResource</code> but it also returns
     * the http response headers .
     * Create an authentication configuration on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postLoginOptionCollectionResourceRequest (required)
     * @param accept                                   Advertises which content
     *                                                 types, expressed as MIME
     *                                                 types, the client is able to
     *                                                 understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /tenant/loginOptions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.authconfig+json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AuthConfig> postLoginOptionCollectionResourceWithHttpInfo(
            PostLoginOptionCollectionResourceRequest postLoginOptionCollectionResourceRequest,
            @Param("accept") String accept);

    /**
     * Update a tenant&#39;s access to the login option
     * Update the tenant&#39;s access to the authentication configuration.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * 
     * @param typeOrId         The type or ID of the login option. The type&#39;s
     *                         value is case insensitive and can be
     *                         &#x60;OAUTH2&#x60;, &#x60;OAUTH2_INTERNAL&#x60; or
     *                         &#x60;BASIC&#x60;. (required)
     * @param targetTenant     Unique identifier of a Cumulocity IoT tenant.
     *                         (required)
     * @param authConfigAccess (required)
     * @param accept           Advertises which content types, expressed as MIME
     *                         types, the client is able to understand. (optional)
     * @return AuthConfig
     */
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}/restrict?targetTenant={targetTenant}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AuthConfig putAccessLoginOptionResource(@Param("typeOrId") String typeOrId,
            @Param("targetTenant") String targetTenant, AuthConfigAccess authConfigAccess,
            @Param("accept") String accept);

    /**
     * Update a tenant&#39;s access to the login option
     * Similar to <code>putAccessLoginOptionResource</code> but it also returns the
     * http response headers .
     * Update the tenant&#39;s access to the authentication configuration.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * 
     * @param typeOrId         The type or ID of the login option. The type&#39;s
     *                         value is case insensitive and can be
     *                         &#x60;OAUTH2&#x60;, &#x60;OAUTH2_INTERNAL&#x60; or
     *                         &#x60;BASIC&#x60;. (required)
     * @param targetTenant     Unique identifier of a Cumulocity IoT tenant.
     *                         (required)
     * @param authConfigAccess (required)
     * @param accept           Advertises which content types, expressed as MIME
     *                         types, the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}/restrict?targetTenant={targetTenant}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AuthConfig> putAccessLoginOptionResourceWithHttpInfo(@Param("typeOrId") String typeOrId,
            @Param("targetTenant") String targetTenant, AuthConfigAccess authConfigAccess,
            @Param("accept") String accept);

    /**
     * Update a tenant&#39;s access to the login option
     * Update the tenant&#39;s access to the authentication configuration.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>putAccessLoginOptionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PutAccessLoginOptionResourceQueryParams} class that
     * allows for
     * building up this map in a fluent style.
     * 
     * @param typeOrId         The type or ID of the login option. The type&#39;s
     *                         value is case insensitive and can be
     *                         &#x60;OAUTH2&#x60;, &#x60;OAUTH2_INTERNAL&#x60; or
     *                         &#x60;BASIC&#x60;. (required)
     * @param authConfigAccess (required)
     * @param accept           Advertises which content types, expressed as MIME
     *                         types, the client is able to understand. (optional)
     * @param queryParams      Map of query parameters as name-value pairs
     *                         <p>
     *                         The following elements may be specified in the query
     *                         map:
     *                         </p>
     *                         <ul>
     *                         <li>targetTenant - Unique identifier of a Cumulocity
     *                         IoT tenant. (required)</li>
     *                         </ul>
     * @return AuthConfig
     */
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}/restrict?targetTenant={targetTenant}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AuthConfig putAccessLoginOptionResource(@Param("typeOrId") String typeOrId, AuthConfigAccess authConfigAccess,
            @Param("accept") String accept,
            @QueryMap(encoded = true) PutAccessLoginOptionResourceQueryParams queryParams);

    /**
     * Update a tenant&#39;s access to the login option
     * Update the tenant&#39;s access to the authentication configuration.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the management tenant
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>putAccessLoginOptionResource</code> that receives the query parameters
     * as a map,
     * but this one also exposes the Http response headers
     * 
     * @param typeOrId         The type or ID of the login option. The type&#39;s
     *                         value is case insensitive and can be
     *                         &#x60;OAUTH2&#x60;, &#x60;OAUTH2_INTERNAL&#x60; or
     *                         &#x60;BASIC&#x60;. (required)
     * @param authConfigAccess (required)
     * @param accept           Advertises which content types, expressed as MIME
     *                         types, the client is able to understand. (optional)
     * @param queryParams      Map of query parameters as name-value pairs
     *                         <p>
     *                         The following elements may be specified in the query
     *                         map:
     *                         </p>
     *                         <ul>
     *                         <li>targetTenant - Unique identifier of a Cumulocity
     *                         IoT tenant. (required)</li>
     *                         </ul>
     * @return AuthConfig
     */
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}/restrict?targetTenant={targetTenant}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AuthConfig> putAccessLoginOptionResourceWithHttpInfo(@Param("typeOrId") String typeOrId,
            AuthConfigAccess authConfigAccess, @Param("accept") String accept,
            @QueryMap(encoded = true) PutAccessLoginOptionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>putAccessLoginOptionResource</code> method in a fluent style.
     */
    public static class PutAccessLoginOptionResourceQueryParams extends HashMap<String, Object> {
        public PutAccessLoginOptionResourceQueryParams targetTenant(final String value) {
            put("targetTenant", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Update a specific login option
     * Update a specific login option in the tenant by a given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN) &lt;b&gt;AND&lt;/b&gt;
     * tenant access to login option is not restricted by management tenant)
     * &lt;/section&gt;
     * 
     * @param typeOrId                      The type or ID of the login option. The
     *                                      type&#39;s value is case insensitive and
     *                                      can be &#x60;OAUTH2&#x60;,
     *                                      &#x60;OAUTH2_INTERNAL&#x60; or
     *                                      &#x60;BASIC&#x60;. (required)
     * @param putLoginOptionResourceRequest (required)
     * @param accept                        Advertises which content types,
     *                                      expressed as MIME types, the client is
     *                                      able to understand. (optional)
     * @param xCumulocityProcessingMode     Used to explicitly control the
     *                                      processing mode of the request. See
     *                                      [Processing mode](#processing-mode) for
     *                                      more details. (optional, default to
     *                                      PERSISTENT)
     * @return AuthConfig
     */
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.authconfig+json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    AuthConfig putLoginOptionResource(@Param("typeOrId") String typeOrId,
            PutLoginOptionResourceRequest putLoginOptionResourceRequest, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Update a specific login option
     * Similar to <code>putLoginOptionResource</code> but it also returns the http
     * response headers .
     * Update a specific login option in the tenant by a given type or ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ((ROLE_TENANT_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_MANAGEMENT_ADMIN) &lt;b&gt;AND&lt;/b&gt;
     * tenant access to login option is not restricted by management tenant)
     * &lt;/section&gt;
     * 
     * @param typeOrId                      The type or ID of the login option. The
     *                                      type&#39;s value is case insensitive and
     *                                      can be &#x60;OAUTH2&#x60;,
     *                                      &#x60;OAUTH2_INTERNAL&#x60; or
     *                                      &#x60;BASIC&#x60;. (required)
     * @param putLoginOptionResourceRequest (required)
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
    @RequestLine("PUT /tenant/loginOptions/{typeOrId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.authconfig+json",
            "Accept: application/vnd.com.nsn.cumulocity.authconfig+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<AuthConfig> putLoginOptionResourceWithHttpInfo(@Param("typeOrId") String typeOrId,
            PutLoginOptionResourceRequest putLoginOptionResourceRequest, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
