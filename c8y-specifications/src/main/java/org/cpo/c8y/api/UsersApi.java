package org.cpo.c8y.api;

import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.PostUserCollectionResourceRequest;
import org.cpo.c8y.model.PutUserResourceRequest;
import org.cpo.c8y.model.SubscribedUser;
import org.cpo.c8y.model.User;
import org.cpo.c8y.model.UserCollection;
import org.cpo.c8y.model.UserReference;
import org.cpo.c8y.model.UserReferenceCollection;
import org.cpo.c8y.model.UserTfaData;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface UsersApi extends ApiClient.Api {

  /**
   * Remove a specific user from a specific user group of a specific tenant
   * Remove a specific user (by a given user ID) from a specific user group (by a
   * given user group ID) of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user &lt;b&gt;AND&lt;/b&gt; is not the current user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   * @param userId   Unique identifier of the a user. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/groups/{groupId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteUserReferenceResource(@Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
      @Param("userId") String userId);

  /**
   * Remove a specific user from a specific user group of a specific tenant
   * Similar to <code>deleteUserReferenceResource</code> but it also returns the
   * http response headers .
   * Remove a specific user (by a given user ID) from a specific user group (by a
   * given user group ID) of a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user &lt;b&gt;AND&lt;/b&gt; is not the current user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param groupId  Unique identifier of the user group. (required)
   * @param userId   Unique identifier of the a user. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/groups/{groupId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteUserReferenceResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId, @Param("userId") String userId);

  /**
   * Delete a specific user for a specific tenant
   * Delete a specific user (by a given user ID) for a specific tenant (by a given
   * tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;b&gt;AND&lt;/b&gt; is parent of the user &lt;b&gt;AND&lt;/b&gt; not the
   * current user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteUserResource(@Param("tenantId") String tenantId, @Param("userId") String userId);

  /**
   * Delete a specific user for a specific tenant
   * Similar to <code>deleteUserResource</code> but it also returns the http
   * response headers .
   * Delete a specific user (by a given user ID) for a specific tenant (by a given
   * tenant ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;b&gt;AND&lt;/b&gt; is parent of the user &lt;b&gt;AND&lt;/b&gt; not the
   * current user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   */
  @RequestLine("DELETE /user/{tenantId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteUserResourceWithHttpInfo(@Param("tenantId") String tenantId, @Param("userId") String userId);

  /**
   * Retrieve all users for a specific tenant
   * Retrieve all users for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param groups            Numeric group identifiers. The response will contain
   *                          only users which belong to at least one of the
   *                          specified groups. &gt;**&amp;#9432; Info:** If you
   *                          query for multiple user groups at once,
   *                          comma-separate the values. (optional)
   * @param onlyDevices       If set to &#x60;true&#x60;, the response will only
   *                          contain users created during bootstrap process
   *                          (starting with “device_”). If the flag is absent or
   *                          &#x60;false&#x60; the result will not contain
   *                          “device_” users. (optional, default to false)
   * @param owner             Exact username of the owner of the user (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param username          Prefix or full username (optional)
   * @param withSubusersCount If set to &#x60;true&#x60;, then each of returned
   *                          user will contain an additional field
   *                          “subusersCount”. It is the number of direct subusers
   *                          (users with corresponding “owner”). (optional,
   *                          default to false)
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
   * @return UserCollection
   */
  @RequestLine("GET /user/{tenantId}/users?currentPage={currentPage}&groups={groups}&onlyDevices={onlyDevices}&owner={owner}&pageSize={pageSize}&username={username}&withSubusersCount={withSubusersCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.usercollection+json",
  })
  UserCollection getUserCollectionResource(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("groups") List<String> groups,
      @Param("onlyDevices") Boolean onlyDevices, @Param("owner") String owner, @Param("pageSize") Integer pageSize,
      @Param("username") String username, @Param("withSubusersCount") Boolean withSubusersCount,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all users for a specific tenant
   * Similar to <code>getUserCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve all users for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param groups            Numeric group identifiers. The response will contain
   *                          only users which belong to at least one of the
   *                          specified groups. &gt;**&amp;#9432; Info:** If you
   *                          query for multiple user groups at once,
   *                          comma-separate the values. (optional)
   * @param onlyDevices       If set to &#x60;true&#x60;, the response will only
   *                          contain users created during bootstrap process
   *                          (starting with “device_”). If the flag is absent or
   *                          &#x60;false&#x60; the result will not contain
   *                          “device_” users. (optional, default to false)
   * @param owner             Exact username of the owner of the user (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param username          Prefix or full username (optional)
   * @param withSubusersCount If set to &#x60;true&#x60;, then each of returned
   *                          user will contain an additional field
   *                          “subusersCount”. It is the number of direct subusers
   *                          (users with corresponding “owner”). (optional,
   *                          default to false)
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
  @RequestLine("GET /user/{tenantId}/users?currentPage={currentPage}&groups={groups}&onlyDevices={onlyDevices}&owner={owner}&pageSize={pageSize}&username={username}&withSubusersCount={withSubusersCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.usercollection+json",
  })
  ApiResponse<UserCollection> getUserCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("groups") List<String> groups,
      @Param("onlyDevices") Boolean onlyDevices, @Param("owner") String owner, @Param("pageSize") Integer pageSize,
      @Param("username") String username, @Param("withSubusersCount") Boolean withSubusersCount,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all users for a specific tenant
   * Retrieve all users for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * Note, this is equivalent to the other <code>getUserCollectionResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserCollectionResourceQueryParams} class that allows
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
   *                    <li>groups - Numeric group identifiers. The response will
   *                    contain only users which belong to at least one of the
   *                    specified groups. &gt;**&amp;#9432; Info:** If you query
   *                    for multiple user groups at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>onlyDevices - If set to &#x60;true&#x60;, the response
   *                    will only contain users created during bootstrap process
   *                    (starting with “device_”). If the flag is absent or
   *                    &#x60;false&#x60; the result will not contain “device_”
   *                    users. (optional, default to false)</li>
   *                    <li>owner - Exact username of the owner of the user
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>username - Prefix or full username (optional)</li>
   *                    <li>withSubusersCount - If set to &#x60;true&#x60;, then
   *                    each of returned user will contain an additional field
   *                    “subusersCount”. It is the number of direct subusers
   *                    (users with corresponding “owner”). (optional, default to
   *                    false)</li>
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
   * @return UserCollection
   */
  @RequestLine("GET /user/{tenantId}/users?currentPage={currentPage}&groups={groups}&onlyDevices={onlyDevices}&owner={owner}&pageSize={pageSize}&username={username}&withSubusersCount={withSubusersCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.usercollection+json",
  })
  UserCollection getUserCollectionResource(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetUserCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all users for a specific tenant
   * Retrieve all users for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * Note, this is equivalent to the other <code>getUserCollectionResource</code>
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
   *                    <li>groups - Numeric group identifiers. The response will
   *                    contain only users which belong to at least one of the
   *                    specified groups. &gt;**&amp;#9432; Info:** If you query
   *                    for multiple user groups at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>onlyDevices - If set to &#x60;true&#x60;, the response
   *                    will only contain users created during bootstrap process
   *                    (starting with “device_”). If the flag is absent or
   *                    &#x60;false&#x60; the result will not contain “device_”
   *                    users. (optional, default to false)</li>
   *                    <li>owner - Exact username of the owner of the user
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>username - Prefix or full username (optional)</li>
   *                    <li>withSubusersCount - If set to &#x60;true&#x60;, then
   *                    each of returned user will contain an additional field
   *                    “subusersCount”. It is the number of direct subusers
   *                    (users with corresponding “owner”). (optional, default to
   *                    false)</li>
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
   * @return UserCollection
   */
  @RequestLine("GET /user/{tenantId}/users?currentPage={currentPage}&groups={groups}&onlyDevices={onlyDevices}&owner={owner}&pageSize={pageSize}&username={username}&withSubusersCount={withSubusersCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.usercollection+json",
  })
  ApiResponse<UserCollection> getUserCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetUserCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getUserCollectionResource</code> method in a fluent style.
   */
  public static class GetUserCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetUserCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams groups(final List<String> value) {
      put("groups", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetUserCollectionResourceQueryParams onlyDevices(final Boolean value) {
      put("onlyDevices", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams owner(final String value) {
      put("owner", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams username(final String value) {
      put("username", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams withSubusersCount(final Boolean value) {
      put("withSubusersCount", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetUserCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve the users of a specific user group of a specific tenant
   * Retrieve the users of a specific user group (by a given user group ID) of a
   * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has access to the user
   * group) &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param groupId           Unique identifier of the user group. (required)
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
   * @return UserReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/groups/{groupId}/users?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreferencecollection+json",
  })
  UserReferenceCollection getUserReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements);

  /**
   * Retrieve the users of a specific user group of a specific tenant
   * Similar to <code>getUserReferenceCollectionResource</code> but it also
   * returns the http response headers .
   * Retrieve the users of a specific user group (by a given user group ID) of a
   * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has access to the user
   * group) &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
   * @param groupId           Unique identifier of the user group. (required)
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
  @RequestLine("GET /user/{tenantId}/groups/{groupId}/users?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreferencecollection+json",
  })
  ApiResponse<UserReferenceCollection> getUserReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("groupId") Integer groupId, @Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements);

  /**
   * Retrieve the users of a specific user group of a specific tenant
   * Retrieve the users of a specific user group (by a given user group ID) of a
   * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has access to the user
   * group) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getUserReferenceCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserReferenceCollectionResourceQueryParams} class
   * that allows for
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
   *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of elements. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return UserReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/groups/{groupId}/users?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreferencecollection+json",
  })
  UserReferenceCollection getUserReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId,
      @QueryMap(encoded = true) GetUserReferenceCollectionResourceQueryParams queryParams);

  /**
   * Retrieve the users of a specific user group of a specific tenant
   * Retrieve the users of a specific user group (by a given user group ID) of a
   * specific tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has access to the user
   * group) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getUserReferenceCollectionResource</code> that receives the query
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
   *                    <li>withTotalElements - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of elements. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return UserReferenceCollection
   */
  @RequestLine("GET /user/{tenantId}/groups/{groupId}/users?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreferencecollection+json",
  })
  ApiResponse<UserReferenceCollection> getUserReferenceCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("groupId") Integer groupId,
      @QueryMap(encoded = true) GetUserReferenceCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getUserReferenceCollectionResource</code> method in a fluent style.
   */
  public static class GetUserReferenceCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetUserReferenceCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetUserReferenceCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetUserReferenceCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific user for a specific tenant
   * Retrieve a specific user (by a given user ID) for a specific tenant (by a
   * given tenant ID). Users in the response are sorted by username in ascending
   * order. Only objects which the user is allowed to see are returned to the
   * user. The user password is never returned in a GET response. Authentication
   * mechanism is provided by another interface. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   * @return User
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  User getUserResource(@Param("tenantId") String tenantId, @Param("userId") String userId);

  /**
   * Retrieve a specific user for a specific tenant
   * Similar to <code>getUserResource</code> but it also returns the http response
   * headers .
   * Retrieve a specific user (by a given user ID) for a specific tenant (by a
   * given tenant ID). Users in the response are sorted by username in ascending
   * order. Only objects which the user is allowed to see are returned to the
   * user. The user password is never returned in a GET response. Authentication
   * mechanism is provided by another interface. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is parent of the user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  ApiResponse<User> getUserResourceWithHttpInfo(@Param("tenantId") String tenantId, @Param("userId") String userId);

  /**
   * Retrieve a user by username in a specific tenant
   * Retrieve a user by username in a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param username The username of the a user. (required)
   * @return User
   */
  @RequestLine("GET /user/{tenantId}/userByName/{username}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  User getUsersByNameResource(@Param("tenantId") String tenantId, @Param("username") String username);

  /**
   * Retrieve a user by username in a specific tenant
   * Similar to <code>getUsersByNameResource</code> but it also returns the http
   * response headers .
   * Retrieve a user by username in a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param username The username of the a user. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/{tenantId}/userByName/{username}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
  })
  ApiResponse<User> getUsersByNameResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("username") String username);

  /**
   * Retrieve the TFA settings of a specific user
   * Retrieve the two-factor authentication settings for the specified user.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user) &lt;b&gt;OR&lt;/b&gt; is the current user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   * @return UserTfaData
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}/tfa")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  UserTfaData getUsersTfaResource(@Param("tenantId") String tenantId, @Param("userId") String userId);

  /**
   * Retrieve the TFA settings of a specific user
   * Similar to <code>getUsersTfaResource</code> but it also returns the http
   * response headers .
   * Retrieve the two-factor authentication settings for the specified user.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_READ
   * &lt;b&gt;OR&lt;/b&gt; (ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; is
   * parent of the user) &lt;b&gt;OR&lt;/b&gt; is the current user
   * &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   * @param userId   Unique identifier of the a user. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/{tenantId}/users/{userId}/tfa")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<UserTfaData> getUsersTfaResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("userId") String userId);

  /**
   * Terminate all tenant users&#39; sessions and invalidate tokens
   * The user with the role ROLE_USER_MANAGEMENT_ADMIN is authorized to log out
   * all tenant users with a toked based access. The request is responsible for
   * terminating all tenant users&#39; toked based sessions and invalidating
   * internal platform access tokens. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the
   * current tenant &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   */
  @RequestLine("POST /user/logout/{tenantId}/allUsers")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void postLogoutAllTenantUsers(@Param("tenantId") String tenantId);

  /**
   * Terminate all tenant users&#39; sessions and invalidate tokens
   * Similar to <code>postLogoutAllTenantUsers</code> but it also returns the http
   * response headers .
   * The user with the role ROLE_USER_MANAGEMENT_ADMIN is authorized to log out
   * all tenant users with a toked based access. The request is responsible for
   * terminating all tenant users&#39; toked based sessions and invalidating
   * internal platform access tokens. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; is the
   * current tenant &lt;/section&gt;
   * 
   * @param tenantId Unique identifier of a Cumulocity IoT tenant. (required)
   */
  @RequestLine("POST /user/logout/{tenantId}/allUsers")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> postLogoutAllTenantUsersWithHttpInfo(@Param("tenantId") String tenantId);

  /**
   * Terminate a user&#39;s session
   * After logging out, a user has to enter valid credentials again to get access
   * to the platform. The request is responsible for removing cookies from the
   * browser and invalidating internal platform access tokens.
   * 
   * @param cookie       The authorization cookie storing the access token of the
   *                     user. This parameter is specific to OAI-Secure
   *                     authentication. (optional)
   * @param X_XSRF_TOKEN Prevents XRSF attack of the authenticated user. This
   *                     parameter is specific to OAI-Secure authentication.
   *                     (optional)
   */
  @RequestLine("POST /user/logout")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Cookie: {cookie}",

      "X-XSRF-TOKEN: {X_XSRF_TOKEN}"
  })
  void postLogoutUser(@Param("cookie") String cookie, @Param("X_XSRF_TOKEN") String X_XSRF_TOKEN);

  /**
   * Terminate a user&#39;s session
   * Similar to <code>postLogoutUser</code> but it also returns the http response
   * headers .
   * After logging out, a user has to enter valid credentials again to get access
   * to the platform. The request is responsible for removing cookies from the
   * browser and invalidating internal platform access tokens.
   * 
   * @param cookie       The authorization cookie storing the access token of the
   *                     user. This parameter is specific to OAI-Secure
   *                     authentication. (optional)
   * @param X_XSRF_TOKEN Prevents XRSF attack of the authenticated user. This
   *                     parameter is specific to OAI-Secure authentication.
   *                     (optional)
   */
  @RequestLine("POST /user/logout")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Cookie: {cookie}",

      "X-XSRF-TOKEN: {X_XSRF_TOKEN}"
  })
  ApiResponse<Void> postLogoutUserWithHttpInfo(@Param("cookie") String cookie,
      @Param("X_XSRF_TOKEN") String X_XSRF_TOKEN);

  /**
   * Create a user for a specific tenant
   * Create a user for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has
   * access to roles, groups, device permissions and applications &lt;/section&gt;
   * 
   * @param tenantId                          Unique identifier of a Cumulocity
   *                                          IoT tenant. (required)
   * @param postUserCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @return User
   */
  @RequestLine("POST /user/{tenantId}/users")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.user+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
      "Accept: {accept}"
  })
  User postUserCollectionResource(@Param("tenantId") String tenantId,
      PostUserCollectionResourceRequest postUserCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Create a user for a specific tenant
   * Similar to <code>postUserCollectionResource</code> but it also returns the
   * http response headers .
   * Create a user for a specific tenant (by a given tenant ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;b&gt;AND&lt;/b&gt; has
   * access to roles, groups, device permissions and applications &lt;/section&gt;
   * 
   * @param tenantId                          Unique identifier of a Cumulocity
   *                                          IoT tenant. (required)
   * @param postUserCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /user/{tenantId}/users")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.user+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
      "Accept: {accept}"
  })
  ApiResponse<User> postUserCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      PostUserCollectionResourceRequest postUserCollectionResourceRequest, @Param("accept") String accept);

  /**
   * Add a user to a specific user group of a specific tenant
   * Add a user to a specific user group (by a given user group ID) of a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN to assign root users in a user
   * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any hierarchy to any
   * group&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign non-root users in a
   * user hierarchy to groups accessible by the parent of assigned user&lt;br/&gt;
   * ROLE_USER_MANAGEMENT_CREATE to assign descendants of the current user in a
   * user hierarchy to groups accessible by current user &lt;b&gt;AND&lt;/b&gt;
   * accessible by the parent of assigned user &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param groupId        Unique identifier of the user group. (required)
   * @param subscribedUser (required)
   * @param accept         Advertises which content types, expressed as MIME
   *                       types, the client is able to understand. (optional)
   * @return UserReference
   */
  @RequestLine("POST /user/{tenantId}/groups/{groupId}/users")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.userreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreference+json",
      "Accept: {accept}"
  })
  UserReference postUserReferenceCollectionResource(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId, SubscribedUser subscribedUser, @Param("accept") String accept);

  /**
   * Add a user to a specific user group of a specific tenant
   * Similar to <code>postUserReferenceCollectionResource</code> but it also
   * returns the http response headers .
   * Add a user to a specific user group (by a given user group ID) of a specific
   * tenant (by a given tenant ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN to assign root users in a user
   * hierarchy &lt;b&gt;OR&lt;/b&gt; users that are not in any hierarchy to any
   * group&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to assign non-root users in a
   * user hierarchy to groups accessible by the parent of assigned user&lt;br/&gt;
   * ROLE_USER_MANAGEMENT_CREATE to assign descendants of the current user in a
   * user hierarchy to groups accessible by current user &lt;b&gt;AND&lt;/b&gt;
   * accessible by the parent of assigned user &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param groupId        Unique identifier of the user group. (required)
   * @param subscribedUser (required)
   * @param accept         Advertises which content types, expressed as MIME
   *                       types, the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /user/{tenantId}/groups/{groupId}/users")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.userreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.userreference+json",
      "Accept: {accept}"
  })
  ApiResponse<UserReference> postUserReferenceCollectionResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("groupId") Integer groupId, SubscribedUser subscribedUser, @Param("accept") String accept);

  /**
   * Update a specific user for a specific tenant
   * Update a specific user (by a given user ID) for a specific tenant (by a given
   * tenant ID). Any change in user&#39;s roles, device permissions and groups
   * creates corresponding audit records with type \&quot;User\&quot; and activity
   * \&quot;User updated\&quot; with information which properties have been
   * changed. When the user is updated with changed permissions or groups, a
   * corresponding audit record is created with type \&quot;User\&quot; and
   * activity \&quot;User updated\&quot;. Note that you cannot update the password
   * or email of another user, they can only be updated for the current user.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * to update root users in a user hierarchy &lt;b&gt;OR&lt;/b&gt; users that are
   * not in any hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to update non-root
   * users in a user hierarchy &lt;b&gt;AND&lt;/b&gt; whose parents have access to
   * roles, groups, device permissions and applications being assigned&lt;br/&gt;
   * ROLE_USER_MANAGEMENT_CREATE to update descendants of the current user in a
   * user hierarchy &lt;b&gt;AND&lt;/b&gt; whose parents have access to roles,
   * groups, device permissions and applications being assigned &lt;/section&gt;
   * 
   * @param tenantId               Unique identifier of a Cumulocity IoT tenant.
   *                               (required)
   * @param userId                 Unique identifier of the a user. (required)
   * @param putUserResourceRequest (required)
   * @param accept                 Advertises which content types, expressed as
   *                               MIME types, the client is able to understand.
   *                               (optional)
   * @return User
   */
  @RequestLine("PUT /user/{tenantId}/users/{userId}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.user+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
      "Accept: {accept}"
  })
  User putUserResource(@Param("tenantId") String tenantId, @Param("userId") String userId,
      PutUserResourceRequest putUserResourceRequest, @Param("accept") String accept);

  /**
   * Update a specific user for a specific tenant
   * Similar to <code>putUserResource</code> but it also returns the http response
   * headers .
   * Update a specific user (by a given user ID) for a specific tenant (by a given
   * tenant ID). Any change in user&#39;s roles, device permissions and groups
   * creates corresponding audit records with type \&quot;User\&quot; and activity
   * \&quot;User updated\&quot; with information which properties have been
   * changed. When the user is updated with changed permissions or groups, a
   * corresponding audit record is created with type \&quot;User\&quot; and
   * activity \&quot;User updated\&quot;. Note that you cannot update the password
   * or email of another user, they can only be updated for the current user.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * to update root users in a user hierarchy &lt;b&gt;OR&lt;/b&gt; users that are
   * not in any hierarchy&lt;br/&gt; ROLE_USER_MANAGEMENT_ADMIN to update non-root
   * users in a user hierarchy &lt;b&gt;AND&lt;/b&gt; whose parents have access to
   * roles, groups, device permissions and applications being assigned&lt;br/&gt;
   * ROLE_USER_MANAGEMENT_CREATE to update descendants of the current user in a
   * user hierarchy &lt;b&gt;AND&lt;/b&gt; whose parents have access to roles,
   * groups, device permissions and applications being assigned &lt;/section&gt;
   * 
   * @param tenantId               Unique identifier of a Cumulocity IoT tenant.
   *                               (required)
   * @param userId                 Unique identifier of the a user. (required)
   * @param putUserResourceRequest (required)
   * @param accept                 Advertises which content types, expressed as
   *                               MIME types, the client is able to understand.
   *                               (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /user/{tenantId}/users/{userId}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.user+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
      "Accept: {accept}"
  })
  ApiResponse<User> putUserResourceWithHttpInfo(@Param("tenantId") String tenantId, @Param("userId") String userId,
      PutUserResourceRequest putUserResourceRequest, @Param("accept") String accept);

}
