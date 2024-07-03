package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.InventoryAssignment;
import org.cpo.c8y.model.InventoryAssignmentCollection;
import org.cpo.c8y.model.InventoryAssignmentReference;
import org.cpo.c8y.model.InventoryRole;
import org.cpo.c8y.model.InventoryRoleCollection;
import org.cpo.c8y.model.PostInventoryAssignmentResourceRequest;
import org.cpo.c8y.model.PostInventoryRoleResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface InventoryRolesApi extends ApiClient.Api {

    /**
     * Remove a specific inventory role assigned to a user
     * Remove a specific inventory role (by a given ID) assigned to a specific user
     * (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; (is not in user hierarchy &lt;b&gt;OR&lt;/b&gt; is
     * root in the user hierarchy) &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; is in user hiararchy &lt;b&gt;AND&lt;/b&gt; has parent
     * access to inventory assignments &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
     * &lt;b&gt;AND&lt;/b&gt; is not the current user &lt;b&gt;AND&lt;/b&gt; has
     * current user access to inventory assignments &lt;b&gt;AND&lt;/b&gt; has
     * parent access to inventory assignments &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param id       Unique identifier of the inventory assignment. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteInventoryAssignmentResourceById(@Param("tenantId") String tenantId, @Param("userId") String userId,
            @Param("id") Integer id);

    /**
     * Remove a specific inventory role assigned to a user
     * Similar to <code>deleteInventoryAssignmentResourceById</code> but it also
     * returns the http response headers .
     * Remove a specific inventory role (by a given ID) assigned to a specific user
     * (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; (is not in user hierarchy &lt;b&gt;OR&lt;/b&gt; is
     * root in the user hierarchy) &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; is in user hiararchy &lt;b&gt;AND&lt;/b&gt; has parent
     * access to inventory assignments &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
     * &lt;b&gt;AND&lt;/b&gt; is not the current user &lt;b&gt;AND&lt;/b&gt; has
     * current user access to inventory assignments &lt;b&gt;AND&lt;/b&gt; has
     * parent access to inventory assignments &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param id       Unique identifier of the inventory assignment. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteInventoryAssignmentResourceByIdWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("id") Integer id);

    /**
     * Remove a specific inventory role
     * Remove a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the inventory role. (required)
     */
    @RequestLine("DELETE /user/inventoryroles/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteInventoryRoleResourceId(@Param("id") Integer id);

    /**
     * Remove a specific inventory role
     * Similar to <code>deleteInventoryRoleResourceId</code> but it also returns the
     * http response headers .
     * Remove a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the inventory role. (required)
     */
    @RequestLine("DELETE /user/inventoryroles/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteInventoryRoleResourceIdWithHttpInfo(@Param("id") Integer id);

    /**
     * Retrieve all inventory roles assigned to a user
     * Retrieve all inventory roles assigned to a specific user (by a given user ID)
     * in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * the parent of the user &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @return InventoryAssignmentCollection
     */
    @RequestLine("GET /user/{tenantId}/users/{userId}/roles/inventory")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignmentcollection+json",
    })
    InventoryAssignmentCollection getInventoryAssignmentResource(@Param("tenantId") String tenantId,
            @Param("userId") String userId);

    /**
     * Retrieve all inventory roles assigned to a user
     * Similar to <code>getInventoryAssignmentResource</code> but it also returns
     * the http response headers .
     * Retrieve all inventory roles assigned to a specific user (by a given user ID)
     * in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * the parent of the user &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/{tenantId}/users/{userId}/roles/inventory")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignmentcollection+json",
    })
    ApiResponse<InventoryAssignmentCollection> getInventoryAssignmentResourceWithHttpInfo(
            @Param("tenantId") String tenantId, @Param("userId") String userId);

    /**
     * Retrieve a specific inventory role assigned to a user
     * Retrieve a specific inventory role (by a given ID) assigned to a specific
     * user (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * the parent of the user &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param id       Unique identifier of the inventory assignment. (required)
     * @return InventoryAssignment
     */
    @RequestLine("GET /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
    })
    InventoryAssignment getInventoryAssignmentResourceById(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("id") Integer id);

    /**
     * Retrieve a specific inventory role assigned to a user
     * Similar to <code>getInventoryAssignmentResourceById</code> but it also
     * returns the http response headers .
     * Retrieve a specific inventory role (by a given ID) assigned to a specific
     * user (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * the parent of the user &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param id       Unique identifier of the inventory assignment. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
    })
    ApiResponse<InventoryAssignment> getInventoryAssignmentResourceByIdWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("id") Integer id);

    /**
     * Retrieve all inventory roles
     * Retrieve all inventory roles. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
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
     * @return InventoryRoleCollection
     */
    @RequestLine("GET /user/inventoryroles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrolecollection+json",
    })
    InventoryRoleCollection getInventoryRoleResource(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements);

    /**
     * Retrieve all inventory roles
     * Similar to <code>getInventoryRoleResource</code> but it also returns the http
     * response headers .
     * Retrieve all inventory roles. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
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
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/inventoryroles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrolecollection+json",
    })
    ApiResponse<InventoryRoleCollection> getInventoryRoleResourceWithHttpInfo(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements);

    /**
     * Retrieve all inventory roles
     * Retrieve all inventory roles. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
     * Note, this is equivalent to the other <code>getInventoryRoleResource</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetInventoryRoleResourceQueryParams} class that allows
     * for
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
     *                    </ul>
     * @return InventoryRoleCollection
     */
    @RequestLine("GET /user/inventoryroles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrolecollection+json",
    })
    InventoryRoleCollection getInventoryRoleResource(
            @QueryMap(encoded = true) GetInventoryRoleResourceQueryParams queryParams);

    /**
     * Retrieve all inventory roles
     * Retrieve all inventory roles. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
     * Note, this is equivalent to the other <code>getInventoryRoleResource</code>
     * that receives the query parameters as a map,
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
     *                    </ul>
     * @return InventoryRoleCollection
     */
    @RequestLine("GET /user/inventoryroles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrolecollection+json",
    })
    ApiResponse<InventoryRoleCollection> getInventoryRoleResourceWithHttpInfo(
            @QueryMap(encoded = true) GetInventoryRoleResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getInventoryRoleResource</code> method in a fluent style.
     */
    public static class GetInventoryRoleResourceQueryParams extends HashMap<String, Object> {
        public GetInventoryRoleResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetInventoryRoleResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetInventoryRoleResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific inventory role
     * Retrieve a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has
     * access to the inventory role &lt;/section&gt;
     * 
     * @param id Unique identifier of the inventory role. (required)
     * @return InventoryRole
     */
    @RequestLine("GET /user/inventoryroles/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
    })
    InventoryRole getInventoryRoleResourceId(@Param("id") Integer id);

    /**
     * Retrieve a specific inventory role
     * Similar to <code>getInventoryRoleResourceId</code> but it also returns the
     * http response headers .
     * Retrieve a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has
     * access to the inventory role &lt;/section&gt;
     * 
     * @param id Unique identifier of the inventory role. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/inventoryroles/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
    })
    ApiResponse<InventoryRole> getInventoryRoleResourceIdWithHttpInfo(@Param("id") Integer id);

    /**
     * Assign an inventory role to a user
     * Assign an existing inventory role to a specific user (by a given user ID) in
     * a specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN to assign any inventory role to
     * root users in a user hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in
     * any hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign inventory roles
     * accessible by the parent of the assigned user to non-root users in a user
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_CREATE to assign inventory roles
     * accessible by the current user &lt;b&gt;AND&lt;/b&gt; accessible by the
     * parent of the assigned user to the descendants of the current user in a user
     * hierarchy &lt;/section&gt;
     * 
     * @param tenantId                               Unique identifier of a
     *                                               Cumulocity IoT tenant.
     *                                               (required)
     * @param userId                                 Unique identifier of the a
     *                                               user. (required)
     * @param postInventoryAssignmentResourceRequest (required)
     * @param accept                                 Advertises which content types,
     *                                               expressed as MIME types, the
     *                                               client is able to understand.
     *                                               (optional)
     * @return InventoryAssignment
     */
    @RequestLine("POST /user/{tenantId}/users/{userId}/roles/inventory")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: {accept}"
    })
    InventoryAssignment postInventoryAssignmentResource(@Param("tenantId") String tenantId,
            @Param("userId") String userId,
            PostInventoryAssignmentResourceRequest postInventoryAssignmentResourceRequest,
            @Param("accept") String accept);

    /**
     * Assign an inventory role to a user
     * Similar to <code>postInventoryAssignmentResource</code> but it also returns
     * the http response headers .
     * Assign an existing inventory role to a specific user (by a given user ID) in
     * a specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN to assign any inventory role to
     * root users in a user hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in
     * any hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign inventory roles
     * accessible by the parent of the assigned user to non-root users in a user
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_CREATE to assign inventory roles
     * accessible by the current user &lt;b&gt;AND&lt;/b&gt; accessible by the
     * parent of the assigned user to the descendants of the current user in a user
     * hierarchy &lt;/section&gt;
     * 
     * @param tenantId                               Unique identifier of a
     *                                               Cumulocity IoT tenant.
     *                                               (required)
     * @param userId                                 Unique identifier of the a
     *                                               user. (required)
     * @param postInventoryAssignmentResourceRequest (required)
     * @param accept                                 Advertises which content types,
     *                                               expressed as MIME types, the
     *                                               client is able to understand.
     *                                               (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /user/{tenantId}/users/{userId}/roles/inventory")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: {accept}"
    })
    ApiResponse<InventoryAssignment> postInventoryAssignmentResourceWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId,
            PostInventoryAssignmentResourceRequest postInventoryAssignmentResourceRequest,
            @Param("accept") String accept);

    /**
     * Create an inventory role
     * Create an inventory role. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postInventoryRoleResourceRequest (required)
     * @param accept                           Advertises which content types,
     *                                         expressed as MIME types, the client
     *                                         is able to understand. (optional)
     * @return InventoryRole
     */
    @RequestLine("POST /user/inventoryroles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: {accept}"
    })
    InventoryRole postInventoryRoleResource(PostInventoryRoleResourceRequest postInventoryRoleResourceRequest,
            @Param("accept") String accept);

    /**
     * Create an inventory role
     * Similar to <code>postInventoryRoleResource</code> but it also returns the
     * http response headers .
     * Create an inventory role. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param postInventoryRoleResourceRequest (required)
     * @param accept                           Advertises which content types,
     *                                         expressed as MIME types, the client
     *                                         is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /user/inventoryroles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: {accept}"
    })
    ApiResponse<InventoryRole> postInventoryRoleResourceWithHttpInfo(
            PostInventoryRoleResourceRequest postInventoryRoleResourceRequest, @Param("accept") String accept);

    /**
     * Update a specific inventory role assigned to a user
     * Update a specific inventory role (by a given ID) assigned to a specific user
     * (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * to update the assignment of any inventory roles to root users in a user
     * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to update the assignment of
     * inventory roles accessible by the assigned user parent, to non-root users in
     * a user hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_CREATE to update the
     * assignment of inventory roles accessible by the current user
     * &lt;b&gt;AND&lt;/b&gt; the parent of the assigned user to the descendants of
     * the current user in the user hierarchy &lt;/section&gt;
     * 
     * @param tenantId                     Unique identifier of a Cumulocity IoT
     *                                     tenant. (required)
     * @param userId                       Unique identifier of the a user.
     *                                     (required)
     * @param id                           Unique identifier of the inventory
     *                                     assignment. (required)
     * @param inventoryAssignmentReference (required)
     * @param accept                       Advertises which content types, expressed
     *                                     as MIME types, the client is able to
     *                                     understand. (optional)
     * @return InventoryAssignment
     */
    @RequestLine("PUT /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: {accept}"
    })
    InventoryAssignment putInventoryAssignmentResourceById(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("id") Integer id,
            InventoryAssignmentReference inventoryAssignmentReference, @Param("accept") String accept);

    /**
     * Update a specific inventory role assigned to a user
     * Similar to <code>putInventoryAssignmentResourceById</code> but it also
     * returns the http response headers .
     * Update a specific inventory role (by a given ID) assigned to a specific user
     * (by a given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * to update the assignment of any inventory roles to root users in a user
     * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to update the assignment of
     * inventory roles accessible by the assigned user parent, to non-root users in
     * a user hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_CREATE to update the
     * assignment of inventory roles accessible by the current user
     * &lt;b&gt;AND&lt;/b&gt; the parent of the assigned user to the descendants of
     * the current user in the user hierarchy &lt;/section&gt;
     * 
     * @param tenantId                     Unique identifier of a Cumulocity IoT
     *                                     tenant. (required)
     * @param userId                       Unique identifier of the a user.
     *                                     (required)
     * @param id                           Unique identifier of the inventory
     *                                     assignment. (required)
     * @param inventoryAssignmentReference (required)
     * @param accept                       Advertises which content types, expressed
     *                                     as MIME types, the client is able to
     *                                     understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /user/{tenantId}/users/{userId}/roles/inventory/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryassignment+json",
            "Accept: {accept}"
    })
    ApiResponse<InventoryAssignment> putInventoryAssignmentResourceByIdWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("id") Integer id,
            InventoryAssignmentReference inventoryAssignmentReference, @Param("accept") String accept);

    /**
     * Update a specific inventory role
     * Update a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id            Unique identifier of the inventory role. (required)
     * @param inventoryRole (required)
     * @param accept        Advertises which content types, expressed as MIME types,
     *                      the client is able to understand. (optional)
     * @return InventoryRole
     */
    @RequestLine("PUT /user/inventoryroles/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: {accept}"
    })
    InventoryRole putInventoryRoleResourceId(@Param("id") Integer id, InventoryRole inventoryRole,
            @Param("accept") String accept);

    /**
     * Update a specific inventory role
     * Similar to <code>putInventoryRoleResourceId</code> but it also returns the
     * http response headers .
     * Update a specific inventory role (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param id            Unique identifier of the inventory role. (required)
     * @param inventoryRole (required)
     * @param accept        Advertises which content types, expressed as MIME types,
     *                      the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /user/inventoryroles/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.inventoryrole+json",
            "Accept: {accept}"
    })
    ApiResponse<InventoryRole> putInventoryRoleResourceIdWithHttpInfo(@Param("id") Integer id,
            InventoryRole inventoryRole, @Param("accept") String accept);

}
