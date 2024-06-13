package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Group;
import org.cpo.c8y.model.GroupReferenceCollection;
import org.cpo.c8y.model.PostGroupCollectionResourceRequest;
import org.cpo.c8y.model.UserGroupCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface GroupsApi extends ApiClient.Api {

  /**
   * Delete a specific user group for a specific tenant
   * Delete a specific user group (by a given user group ID) for a specific tenant
   * (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteGroupByIdResource(@Param("tenantId") String tenantId, @Param("groupId") Integer groupId);

  /**
   * Delete a specific user group for a specific tenant
   * Similar to <code>deleteGroupByIdResource</code> but it also returns the http
   * response headers .
   * Delete a specific user group (by a given user group ID) for a specific tenant
   * (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteGroupByIdResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId);

  /**
   * Retrieve a specific user group for a specific tenant
   * Retrieve a specific user group (by a given user group ID) for a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;b&gt;AND&lt;/b&gt; is not the current user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   * @return Group
   */
  @RequestLine("GET /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
  })
  Group getGroupByIdResource(@Param("tenantId") String tenantId, @Param("groupId") Integer groupId);

  /**
   * Retrieve a specific user group for a specific tenant
   * Similar to <code>getGroupByIdResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific user group (by a given user group ID) for a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;b&gt;AND&lt;/b&gt; is not the current user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
  })
  ApiResponse<Group> getGroupByIdResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId);

  /**
   * Retrieve a user group by group name for a specific tenant
   * Retrieve a user group by group name for a specific tenant (by a given tenant
   * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;b&gt;AND&lt;/b&gt; has access to groups &lt;/section&gt;
   * 
   * @param tenantId  Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupName The name of the user group. (required)
   * @return Group
   */
  @RequestLine("GET /user/{tenantId}/groupByName/{groupName}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
  })
  Group getGroupByNameResource(@Param("tenantId") String tenantId, @Param("groupName") String groupName);

  /**
   * Retrieve a user group by group name for a specific tenant
   * Similar to <code>getGroupByNameResource</code> but it also returns the http
   * response headers .
   * Retrieve a user group by group name for a specific tenant (by a given tenant
   * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;b&gt;AND&lt;/b&gt; has access to groups &lt;/section&gt;
   * 
   * @param tenantId  Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupName The name of the user group. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/{tenantId}/groupByName/{groupName}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
  })
  ApiResponse<Group> getGroupByNameResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupName") String groupName);

  /**
   * Retrieve all user groups of a specific tenant
   * Retrieve all user groups of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
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
   * @return UserGroupCollection
   */
  @RequestLine("GET /user/{tenantId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupcollection+json",
  })
  UserGroupCollection getGroupCollectionResource(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all user groups of a specific tenant
   * Similar to <code>getGroupCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve all user groups of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
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
  @RequestLine("GET /user/{tenantId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupcollection+json",
  })
  ApiResponse<UserGroupCollection> getGroupCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all user groups of a specific tenant
   * Retrieve all user groups of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * Note, this is equivalent to the other <code>getGroupCollectionResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGroupCollectionResourceQueryParams} class that allows
   * for
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
   * @return UserGroupCollection
   */
  @RequestLine("GET /user/{tenantId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupcollection+json",
  })
  UserGroupCollection getGroupCollectionResource(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetGroupCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all user groups of a specific tenant
   * Retrieve all user groups of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * Note, this is equivalent to the other <code>getGroupCollectionResource</code>
   * that receives the query parameters as a map,
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
   * @return UserGroupCollection
   */
  @RequestLine("GET /user/{tenantId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupcollection+json",
  })
  ApiResponse<UserGroupCollection> getGroupCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetGroupCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getGroupCollectionResource</code> method in a fluent style.
   */
  public static class GetGroupCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetGroupCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all user groups for specific user in a specific tenant
   * Get all user groups for a specific user (by a given user ID) in a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param userId            Unique identifier of the a user. (required)
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
   * @return GroupReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupreferencecollection+json",
  })
  GroupReferenceCollection getGroupReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("userId") String userId, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Get all user groups for specific user in a specific tenant
   * Similar to <code>getGroupReferenceCollectionResource</code> but it also
   * returns the http response headers .
   * Get all user groups for a specific user (by a given user ID) in a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param userId            Unique identifier of the a user. (required)
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
  @RequestLine("GET /user/{tenantId}/users/{userId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupreferencecollection+json",
  })
  ApiResponse<GroupReferenceCollection> getGroupReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("userId") String userId, @Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Get all user groups for specific user in a specific tenant
   * Get all user groups for a specific user (by a given user ID) in a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getGroupReferenceCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGroupReferenceCollectionResourceQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId      Unique identifier of the a user. (required)
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
   * @return GroupReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupreferencecollection+json",
  })
  GroupReferenceCollection getGroupReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("userId") String userId,
      @QueryMap(encoded = true) GetGroupReferenceCollectionResourceQueryParams queryParams);

  /**
   * Get all user groups for specific user in a specific tenant
   * Get all user groups for a specific user (by a given user ID) in a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getGroupReferenceCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId      Unique identifier of the a user. (required)
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
   * @return GroupReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}/groups?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.groupreferencecollection+json",
  })
  ApiResponse<GroupReferenceCollection> getGroupReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("userId") String userId,
      @QueryMap(encoded = true) GetGroupReferenceCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getGroupReferenceCollectionResource</code> method in a fluent style.
   */
  public static class GetGroupReferenceCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetGroupReferenceCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupReferenceCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupReferenceCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetGroupReferenceCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create a user group for a specific tenant
   * Create a user group for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;/section&gt;
   * 
   * @param tenantId                           Unique identifier of a Cumulocity
   *                                           IoT tenant. (required)
   * @param postGroupCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @return Group
   */
  @RequestLine("POST /user/{tenantId}/groups")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.group+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
      "Accept: {accept}"
  })
  Group postGroupCollectionResource(@Param("tenantId") String tenantId,
      PostGroupCollectionResourceRequest postGroupCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Create a user group for a specific tenant
   * Similar to <code>postGroupCollectionResource</code> but it also returns the
   * http response headers .
   * Create a user group for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;/section&gt;
   * 
   * @param tenantId                           Unique identifier of a Cumulocity
   *                                           IoT tenant. (required)
   * @param postGroupCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /user/{tenantId}/groups")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.group+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
      "Accept: {accept}"
  })
  ApiResponse<Group> postGroupCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      PostGroupCollectionResourceRequest postGroupCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Update a specific user group for a specific tenant
   * Update a specific user group (by a given user group ID) for a specific tenant
   * (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param tenantId                           Unique identifier of a Cumulocity
   *                                           IoT tenant. (required)
   * @param groupId                            Unique identifier of the user
   *                                           group. (required)
   * @param postGroupCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @return Group
   */
  @RequestLine("PUT /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.group+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
      "Accept: {accept}"
  })
  Group putGroupByIdResource(@Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
      PostGroupCollectionResourceRequest postGroupCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Update a specific user group for a specific tenant
   * Similar to <code>putGroupByIdResource</code> but it also returns the http
   * response headers .
   * Update a specific user group (by a given user group ID) for a specific tenant
   * (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param tenantId                           Unique identifier of a Cumulocity
   *                                           IoT tenant. (required)
   * @param groupId                            Unique identifier of the user
   *                                           group. (required)
   * @param postGroupCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /user/{tenantId}/groups/{groupId}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.group+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.group+json",
      "Accept: {accept}"
  })
  ApiResponse<Group> putGroupByIdResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId, PostGroupCollectionResourceRequest postGroupCollectionResourceRequest,
      @Param("accept") String accept);

}
