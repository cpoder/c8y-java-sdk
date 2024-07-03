package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Role;
import org.cpo.c8y.model.RoleReference;
import org.cpo.c8y.model.RoleReferenceCollection;
import org.cpo.c8y.model.SubscribedRole;
import org.cpo.c8y.model.UserRoleCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface RolesApi extends ApiClient.Api {

    /**
     * Unassign a specific role for a specific user group in a specific tenant
     * Unassign a specific role (given by a role ID) for a specific user group (by a
     * given user group ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId  Unique identifier of the user group. (required)
     * @param roleId   Unique identifier of the user role. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/groups/{groupId}/roles/{roleId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteGroupRoleReferenceResource(@Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
            @Param("roleId") String roleId);

    /**
     * Unassign a specific role for a specific user group in a specific tenant
     * Similar to <code>deleteGroupRoleReferenceResource</code> but it also returns
     * the http response headers .
     * Unassign a specific role (given by a role ID) for a specific user group (by a
     * given user group ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId  Unique identifier of the user group. (required)
     * @param roleId   Unique identifier of the user role. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/groups/{groupId}/roles/{roleId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteGroupRoleReferenceResourceWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("groupId") Integer groupId, @Param("roleId") String roleId);

    /**
     * Unassign a specific role from a specific user in a specific tenant
     * Unassign a specific role (by a given role ID) from a specific user (by a
     * given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * parent of the user &lt;b&gt;AND&lt;/b&gt; has access to roles
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param roleId   Unique identifier of the user role. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/users/{userId}/roles/{roleId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteUserRoleReferenceResource(@Param("tenantId") String tenantId, @Param("userId") String userId,
            @Param("roleId") String roleId);

    /**
     * Unassign a specific role from a specific user in a specific tenant
     * Similar to <code>deleteUserRoleReferenceResource</code> but it also returns
     * the http response headers .
     * Unassign a specific role (by a given role ID) from a specific user (by a
     * given user ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
     * parent of the user &lt;b&gt;AND&lt;/b&gt; has access to roles
     * &lt;/section&gt;
     * 
     * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
     * @param userId   Unique identifier of the a user. (required)
     * @param roleId   Unique identifier of the user role. (required)
     */
    @RequestLine("DELETE /user/{tenantId}/users/{userId}/roles/{roleId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteUserRoleReferenceResourceWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId, @Param("roleId") String roleId);

    /**
     * Retrieve all roles assigned to a specific user group in a specific tenant
     * Retrieve all roles assigned to a specific user group (by a given user group
     * ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;/section&gt;
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId     Unique identifier of the user group. (required)
     * @param currentPage The current page of the paginated results. (optional,
     *                    default to 1)
     * @param pageSize    Indicates how many entries of the collection shall be
     *                    returned. The upper limit for one page is 2,000 objects.
     *                    (optional, default to 5)
     * @return RoleReferenceCollection
     */
    @RequestLine("GET /user/{tenantId}/groups/{groupId}/roles?currentPage={currentPage}&pageSize={pageSize}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereferencecollection+json",
    })
    RoleReferenceCollection getGroupsRoleReferenceCollectionResource(@Param("tenantId") String tenantId,
            @Param("groupId") Integer groupId, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize);

    /**
     * Retrieve all roles assigned to a specific user group in a specific tenant
     * Similar to <code>getGroupsRoleReferenceCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve all roles assigned to a specific user group (by a given user group
     * ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;/section&gt;
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId     Unique identifier of the user group. (required)
     * @param currentPage The current page of the paginated results. (optional,
     *                    default to 1)
     * @param pageSize    Indicates how many entries of the collection shall be
     *                    returned. The upper limit for one page is 2,000 objects.
     *                    (optional, default to 5)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/{tenantId}/groups/{groupId}/roles?currentPage={currentPage}&pageSize={pageSize}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereferencecollection+json",
    })
    ApiResponse<RoleReferenceCollection> getGroupsRoleReferenceCollectionResourceWithHttpInfo(
            @Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
            @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize);

    /**
     * Retrieve all roles assigned to a specific user group in a specific tenant
     * Retrieve all roles assigned to a specific user group (by a given user group
     * ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getGroupsRoleReferenceCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetGroupsRoleReferenceCollectionResourceQueryParams}
     * class that allows for
     * building up this map in a fluent style.
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId     Unique identifier of the user group. (required)
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
     *                    </ul>
     * @return RoleReferenceCollection
     */
    @RequestLine("GET /user/{tenantId}/groups/{groupId}/roles?currentPage={currentPage}&pageSize={pageSize}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereferencecollection+json",
    })
    RoleReferenceCollection getGroupsRoleReferenceCollectionResource(@Param("tenantId") String tenantId,
            @Param("groupId") Integer groupId,
            @QueryMap(encoded = true) GetGroupsRoleReferenceCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all roles assigned to a specific user group in a specific tenant
     * Retrieve all roles assigned to a specific user group (by a given user group
     * ID) in a specific tenant (by a given tenant ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getGroupsRoleReferenceCollectionResource</code> that receives the query
     * parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
     * @param groupId     Unique identifier of the user group. (required)
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
     *                    </ul>
     * @return RoleReferenceCollection
     */
    @RequestLine("GET /user/{tenantId}/groups/{groupId}/roles?currentPage={currentPage}&pageSize={pageSize}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereferencecollection+json",
    })
    ApiResponse<RoleReferenceCollection> getGroupsRoleReferenceCollectionResourceWithHttpInfo(
            @Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
            @QueryMap(encoded = true) GetGroupsRoleReferenceCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getGroupsRoleReferenceCollectionResource</code> method in a fluent
     * style.
     */
    public static class GetGroupsRoleReferenceCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetGroupsRoleReferenceCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetGroupsRoleReferenceCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve all user roles
     * Retrieve all user roles. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
     * &lt;b&gt;AND&lt;/b&gt; has access to the user role &lt;/section&gt;
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
     * @return UserRoleCollection
     */
    @RequestLine("GET /user/roles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolecollection+json",
    })
    UserRoleCollection getRoleCollectionResource(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all user roles
     * Similar to <code>getRoleCollectionResource</code> but it also returns the
     * http response headers .
     * Retrieve all user roles. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
     * &lt;b&gt;AND&lt;/b&gt; has access to the user role &lt;/section&gt;
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
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/roles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolecollection+json",
    })
    ApiResponse<UserRoleCollection> getRoleCollectionResourceWithHttpInfo(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all user roles
     * Retrieve all user roles. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
     * &lt;b&gt;AND&lt;/b&gt; has access to the user role &lt;/section&gt;
     * Note, this is equivalent to the other <code>getRoleCollectionResource</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetRoleCollectionResourceQueryParams} class that allows
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
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return UserRoleCollection
     */
    @RequestLine("GET /user/roles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolecollection+json",
    })
    UserRoleCollection getRoleCollectionResource(
            @QueryMap(encoded = true) GetRoleCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all user roles
     * Retrieve all user roles. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
     * &lt;b&gt;AND&lt;/b&gt; has access to the user role &lt;/section&gt;
     * Note, this is equivalent to the other <code>getRoleCollectionResource</code>
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
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return UserRoleCollection
     */
    @RequestLine("GET /user/roles?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolecollection+json",
    })
    ApiResponse<UserRoleCollection> getRoleCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetRoleCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getRoleCollectionResource</code> method in a fluent style.
     */
    public static class GetRoleCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetRoleCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetRoleCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetRoleCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetRoleCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a user role by name
     * Retrieve a user role by name. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; current user has access to
     * the role with this name &lt;/section&gt;
     * 
     * @param name The name of the user role. (required)
     * @return Role
     */
    @RequestLine("GET /user/roles/{name}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.role+json",
    })
    Role getRoleCollectionResourceByName(@Param("name") String name);

    /**
     * Retrieve a user role by name
     * Similar to <code>getRoleCollectionResourceByName</code> but it also returns
     * the http response headers .
     * Retrieve a user role by name. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; current user has access to
     * the role with this name &lt;/section&gt;
     * 
     * @param name The name of the user role. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/roles/{name}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.role+json",
    })
    ApiResponse<Role> getRoleCollectionResourceByNameWithHttpInfo(@Param("name") String name);

    /**
     * Assign a role to a specific user group in a specific tenant
     * Assign a role to a specific user group (by a given user group ID) in a
     * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
     *                       (required)
     * @param groupId        Unique identifier of the user group. (required)
     * @param subscribedRole (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     * @return RoleReference
     */
    @RequestLine("POST /user/{tenantId}/groups/{groupId}/roles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: {accept}"
    })
    RoleReference postGroupsRoleReferenceCollectionResource(@Param("tenantId") String tenantId,
            @Param("groupId") Integer groupId, SubscribedRole subscribedRole, @Param("accept") String accept);

    /**
     * Assign a role to a specific user group in a specific tenant
     * Similar to <code>postGroupsRoleReferenceCollectionResource</code> but it also
     * returns the http response headers .
     * Assign a role to a specific user group (by a given user group ID) in a
     * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
     *                       (required)
     * @param groupId        Unique identifier of the user group. (required)
     * @param subscribedRole (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /user/{tenantId}/groups/{groupId}/roles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: {accept}"
    })
    ApiResponse<RoleReference> postGroupsRoleReferenceCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("groupId") Integer groupId, SubscribedRole subscribedRole, @Param("accept") String accept);

    /**
     * Assign a role to specific user in a specific tenant
     * Assign a role to a specific user (by a given user ID) in a specific tenant
     * (by a given tenant ID). When a role is assigned to a user, a corresponding
     * audit record is created with type \&quot;User\&quot; and activity \&quot;User
     * updated\&quot;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_ADMIN to assign any role to root users in a user
     * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign roles accessible by
     * the parent of assigned user to non-root users in a user hierarchy&lt;br/&gt;
     * ROLE_USER_MANAGEMENT_CREATE to assign roles accessible by the current user
     * &lt;b&gt;AND&lt;/b&gt; accessible by the parent of the assigned user to the
     * descendants of the current user in a user hierarchy &lt;/section&gt;
     * 
     * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
     *                       (required)
     * @param userId         Unique identifier of the a user. (required)
     * @param subscribedRole (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     * @return RoleReference
     */
    @RequestLine("POST /user/{tenantId}/users/{userId}/roles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: {accept}"
    })
    RoleReference postUsersRoleReferenceCollectionResource(@Param("tenantId") String tenantId,
            @Param("userId") String userId, SubscribedRole subscribedRole, @Param("accept") String accept);

    /**
     * Assign a role to specific user in a specific tenant
     * Similar to <code>postUsersRoleReferenceCollectionResource</code> but it also
     * returns the http response headers .
     * Assign a role to a specific user (by a given user ID) in a specific tenant
     * (by a given tenant ID). When a role is assigned to a user, a corresponding
     * audit record is created with type \&quot;User\&quot; and activity \&quot;User
     * updated\&quot;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_ADMIN to assign any role to root users in a user
     * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any
     * hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign roles accessible by
     * the parent of assigned user to non-root users in a user hierarchy&lt;br/&gt;
     * ROLE_USER_MANAGEMENT_CREATE to assign roles accessible by the current user
     * &lt;b&gt;AND&lt;/b&gt; accessible by the parent of the assigned user to the
     * descendants of the current user in a user hierarchy &lt;/section&gt;
     * 
     * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
     *                       (required)
     * @param userId         Unique identifier of the a user. (required)
     * @param subscribedRole (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /user/{tenantId}/users/{userId}/roles")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.rolereference+json",
            "Accept: {accept}"
    })
    ApiResponse<RoleReference> postUsersRoleReferenceCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("userId") String userId, SubscribedRole subscribedRole, @Param("accept") String accept);

}
