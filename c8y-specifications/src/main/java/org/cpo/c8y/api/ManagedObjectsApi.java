package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.ManagedObject;
import org.cpo.c8y.model.ManagedObjectCollection;
import org.cpo.c8y.model.ManagedObjectUser;
import org.cpo.c8y.model.SupportedMeasurements;
import org.cpo.c8y.model.SupportedSeries;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ManagedObjectsApi extends ApiClient.Api {

  /**
   * Remove a specific managed object
   * Remove a specific managed object (for example, device) by a given ID. &gt;
   * **&amp;#9432; Info:** Inventory DELETE requests are not synchronous. The
   * response could be returned before the delete request has been completed. This
   * may happen especially when the deleted managed object has a lot of associated
   * data. After sending the request, the platform starts deleting the associated
   * data in an asynchronous way. Finally, the requested managed object is deleted
   * after all associated data has been deleted. &gt; **&amp;#9432; Info:** By
   * default, the delete operation is always propagated to the subgroups, but only
   * if the deleted object is a group. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param cascade                   When set to &#x60;true&#x60; and the managed
   *                                  object is a device or group, all the
   *                                  hierarchy will be deleted. (optional,
   *                                  default to false)
   * @param forceCascade              When set to &#x60;true&#x60; all the
   *                                  hierarchy will be deleted without checking
   *                                  the type of managed object. It takes
   *                                  precedence over the parameter
   *                                  &#x60;cascade&#x60;. (optional, default to
   *                                  false)
   * @param withDeviceUser            When set to &#x60;true&#x60; and the managed
   *                                  object is a device, it deletes the
   *                                  associated device user (credentials).
   *                                  (optional, default to false)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}?cascade={cascade}&forceCascade={forceCascade}&withDeviceUser={withDeviceUser}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectResource(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("cascade") Boolean cascade,
      @Param("forceCascade") Boolean forceCascade, @Param("withDeviceUser") Boolean withDeviceUser);

  /**
   * Remove a specific managed object
   * Similar to <code>deleteManagedObjectResource</code> but it also returns the
   * http response headers .
   * Remove a specific managed object (for example, device) by a given ID. &gt;
   * **&amp;#9432; Info:** Inventory DELETE requests are not synchronous. The
   * response could be returned before the delete request has been completed. This
   * may happen especially when the deleted managed object has a lot of associated
   * data. After sending the request, the platform starts deleting the associated
   * data in an asynchronous way. Finally, the requested managed object is deleted
   * after all associated data has been deleted. &gt; **&amp;#9432; Info:** By
   * default, the delete operation is always propagated to the subgroups, but only
   * if the deleted object is a group. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param cascade                   When set to &#x60;true&#x60; and the managed
   *                                  object is a device or group, all the
   *                                  hierarchy will be deleted. (optional,
   *                                  default to false)
   * @param forceCascade              When set to &#x60;true&#x60; all the
   *                                  hierarchy will be deleted without checking
   *                                  the type of managed object. It takes
   *                                  precedence over the parameter
   *                                  &#x60;cascade&#x60;. (optional, default to
   *                                  false)
   * @param withDeviceUser            When set to &#x60;true&#x60; and the managed
   *                                  object is a device, it deletes the
   *                                  associated device user (credentials).
   *                                  (optional, default to false)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}?cascade={cascade}&forceCascade={forceCascade}&withDeviceUser={withDeviceUser}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectResourceWithHttpInfo(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("cascade") Boolean cascade,
      @Param("forceCascade") Boolean forceCascade, @Param("withDeviceUser") Boolean withDeviceUser);

  /**
   * Remove a specific managed object
   * Remove a specific managed object (for example, device) by a given ID. &gt;
   * **&amp;#9432; Info:** Inventory DELETE requests are not synchronous. The
   * response could be returned before the delete request has been completed. This
   * may happen especially when the deleted managed object has a lot of associated
   * data. After sending the request, the platform starts deleting the associated
   * data in an asynchronous way. Finally, the requested managed object is deleted
   * after all associated data has been deleted. &gt; **&amp;#9432; Info:** By
   * default, the delete operation is always propagated to the subgroups, but only
   * if the deleted object is a group. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteManagedObjectResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteManagedObjectResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param id                        Unique identifier of the managed object.
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
   *                                  <li>cascade - When set to &#x60;true&#x60;
   *                                  and the managed object is a device or group,
   *                                  all the hierarchy will be deleted.
   *                                  (optional, default to false)</li>
   *                                  <li>forceCascade - When set to
   *                                  &#x60;true&#x60; all the hierarchy will be
   *                                  deleted without checking the type of managed
   *                                  object. It takes precedence over the
   *                                  parameter &#x60;cascade&#x60;. (optional,
   *                                  default to false)</li>
   *                                  <li>withDeviceUser - When set to
   *                                  &#x60;true&#x60; and the managed object is a
   *                                  device, it deletes the associated device
   *                                  user (credentials). (optional, default to
   *                                  false)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}?cascade={cascade}&forceCascade={forceCascade}&withDeviceUser={withDeviceUser}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectResource(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteManagedObjectResourceQueryParams queryParams);

  /**
   * Remove a specific managed object
   * Remove a specific managed object (for example, device) by a given ID. &gt;
   * **&amp;#9432; Info:** Inventory DELETE requests are not synchronous. The
   * response could be returned before the delete request has been completed. This
   * may happen especially when the deleted managed object has a lot of associated
   * data. After sending the request, the platform starts deleting the associated
   * data in an asynchronous way. Finally, the requested managed object is deleted
   * after all associated data has been deleted. &gt; **&amp;#9432; Info:** By
   * default, the delete operation is always propagated to the subgroups, but only
   * if the deleted object is a group. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteManagedObjectResource</code> that receives the query parameters
   * as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id                        Unique identifier of the managed object.
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
   *                                  <li>cascade - When set to &#x60;true&#x60;
   *                                  and the managed object is a device or group,
   *                                  all the hierarchy will be deleted.
   *                                  (optional, default to false)</li>
   *                                  <li>forceCascade - When set to
   *                                  &#x60;true&#x60; all the hierarchy will be
   *                                  deleted without checking the type of managed
   *                                  object. It takes precedence over the
   *                                  parameter &#x60;cascade&#x60;. (optional,
   *                                  default to false)</li>
   *                                  <li>withDeviceUser - When set to
   *                                  &#x60;true&#x60; and the managed object is a
   *                                  device, it deletes the associated device
   *                                  user (credentials). (optional, default to
   *                                  false)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}?cascade={cascade}&forceCascade={forceCascade}&withDeviceUser={withDeviceUser}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectResourceWithHttpInfo(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteManagedObjectResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteManagedObjectResource</code> method in a fluent style.
   */
  public static class DeleteManagedObjectResourceQueryParams extends HashMap<String, Object> {
    public DeleteManagedObjectResourceQueryParams cascade(final Boolean value) {
      put("cascade", EncodingUtils.encode(value));
      return this;
    }

    public DeleteManagedObjectResourceQueryParams forceCascade(final Boolean value) {
      put("forceCascade", EncodingUtils.encode(value));
      return this;
    }

    public DeleteManagedObjectResourceQueryParams withDeviceUser(final Boolean value) {
      put("withDeviceUser", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve the latest availability date of a specific managed object
   * Retrieve the date when a specific managed object (by a given ID) sent the
   * last message to Cumulocity IoT. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return OffsetDateTime
   */
  @RequestLine("GET /inventory/managedObjects/{id}/availability")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  OffsetDateTime getLastAvailabilityManagedObjectResource(@Param("id") String id);

  /**
   * Retrieve the latest availability date of a specific managed object
   * Similar to <code>getLastAvailabilityManagedObjectResource</code> but it also
   * returns the http response headers .
   * Retrieve the date when a specific managed object (by a given ID) sent the
   * last message to Cumulocity IoT. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/availability")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  ApiResponse<OffsetDateTime> getLastAvailabilityManagedObjectResourceWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve all managed objects
   * Retrieve all managed objects (for example, devices, assets, etc.) registered
   * in your tenant, or a subset based on queries.
   * 
   * @param childAdditionId   Search for a specific child addition and list all
   *                          the groups to which it belongs. (optional)
   * @param childAssetId      Search for a specific child asset and list all the
   *                          groups to which it belongs. (optional)
   * @param childDeviceId     Search for a specific child device and list all the
   *                          groups to which it belongs. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param fragmentType      A characteristic which identifies a managed object
   *                          or event, for example, geolocation, electricity
   *                          sensor, relay state. (optional)
   * @param ids               The managed object IDs to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          IDs at once, comma-separate the values. (optional)
   * @param onlyRoots         When set to &#x60;true&#x60; it returns managed
   *                          objects which don&#39;t have any parent. If the
   *                          current user doesn&#39;t have access to the parent,
   *                          this is also root for the user. (optional, default
   *                          to false)
   * @param owner             Username of the owner of the managed objects.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param q                 Similar to the parameter &#x60;query&#x60;, but it
   *                          assumes that this is a device query request and it
   *                          adds automatically the search criteria
   *                          &#x60;fragmentType&#x3D;c8y_IsDevice&#x60;.
   *                          (optional)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
   * @param skipChildrenNames When set to &#x60;true&#x60;, the returned
   *                          references of child devices won&#39;t contain their
   *                          names. (optional, default to false)
   * @param text              Search for managed objects where a property value is
   *                          equal to the given one. The following properties are
   *                          examined: &#x60;id, type, name, owner,
   *                          externalIds&#x60;. (optional)
   * @param type              The type of managed object to search for. (optional)
   * @param withChildren      Determines if children with ID and name should be
   *                          returned when fetching the managed object. Set it to
   *                          &#x60;false&#x60; to improve query performance.
   *                          (optional, default to true)
   * @param withChildrenCount When set to &#x60;true&#x60;, the returned result
   *                          will contain the total number of children in the
   *                          respective objects (&#x60;childAdditions&#x60;,
   *                          &#x60;childAssets&#x60; and
   *                          &#x60;childDevices&#x60;). (optional, default to
   *                          false)
   * @param withGroups        When set to &#x60;true&#x60; it returns additional
   *                          information about the groups to which the searched
   *                          managed object belongs. This results in setting the
   *                          &#x60;assetParents&#x60; property with additional
   *                          information about the groups. (optional, default to
   *                          false)
   * @param withParents       When set to &#x60;true&#x60;, the returned
   *                          references of child parents will return the
   *                          device&#39;s parents (if any). Otherwise, it will be
   *                          an empty array. (optional, default to false)
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
   * @param withLatestValues  If set to true the platform returns managed objects
   *                          with the fragment &#x60;c8y_LatestMeasurements,
   *                          which contains the latest measurement values
   *                          reported by the device to the platform. &gt; **⚠️
   *                          Feature Preview:** The parameter is a part of the
   *                          Latest Measurement feature which is still under
   *                          public preview. (optional, default to false)
   * @return ManagedObjectCollection
   */
  @RequestLine("GET /inventory/managedObjects?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&fragmentType={fragmentType}&ids={ids}&onlyRoots={onlyRoots}&owner={owner}&pageSize={pageSize}&q={q}&query={query}&skipChildrenNames={skipChildrenNames}&text={text}&type={type}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withGroups={withGroups}&withParents={withParents}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ManagedObjectCollection getManagedObjectCollectionResource(@Param("childAdditionId") String childAdditionId,
      @Param("childAssetId") String childAssetId, @Param("childDeviceId") String childDeviceId,
      @Param("currentPage") Integer currentPage, @Param("fragmentType") String fragmentType,
      @Param("ids") List<String> ids, @Param("onlyRoots") Boolean onlyRoots, @Param("owner") String owner,
      @Param("pageSize") Integer pageSize, @Param("q") String q, @Param("query") String query,
      @Param("skipChildrenNames") Boolean skipChildrenNames, @Param("text") String text, @Param("type") String type,
      @Param("withChildren") Boolean withChildren, @Param("withChildrenCount") Boolean withChildrenCount,
      @Param("withGroups") Boolean withGroups, @Param("withParents") Boolean withParents,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages,
      @Param("withLatestValues") Boolean withLatestValues);

  /**
   * Retrieve all managed objects
   * Similar to <code>getManagedObjectCollectionResource</code> but it also
   * returns the http response headers .
   * Retrieve all managed objects (for example, devices, assets, etc.) registered
   * in your tenant, or a subset based on queries.
   * 
   * @param childAdditionId   Search for a specific child addition and list all
   *                          the groups to which it belongs. (optional)
   * @param childAssetId      Search for a specific child asset and list all the
   *                          groups to which it belongs. (optional)
   * @param childDeviceId     Search for a specific child device and list all the
   *                          groups to which it belongs. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param fragmentType      A characteristic which identifies a managed object
   *                          or event, for example, geolocation, electricity
   *                          sensor, relay state. (optional)
   * @param ids               The managed object IDs to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          IDs at once, comma-separate the values. (optional)
   * @param onlyRoots         When set to &#x60;true&#x60; it returns managed
   *                          objects which don&#39;t have any parent. If the
   *                          current user doesn&#39;t have access to the parent,
   *                          this is also root for the user. (optional, default
   *                          to false)
   * @param owner             Username of the owner of the managed objects.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param q                 Similar to the parameter &#x60;query&#x60;, but it
   *                          assumes that this is a device query request and it
   *                          adds automatically the search criteria
   *                          &#x60;fragmentType&#x3D;c8y_IsDevice&#x60;.
   *                          (optional)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
   * @param skipChildrenNames When set to &#x60;true&#x60;, the returned
   *                          references of child devices won&#39;t contain their
   *                          names. (optional, default to false)
   * @param text              Search for managed objects where a property value is
   *                          equal to the given one. The following properties are
   *                          examined: &#x60;id, type, name, owner,
   *                          externalIds&#x60;. (optional)
   * @param type              The type of managed object to search for. (optional)
   * @param withChildren      Determines if children with ID and name should be
   *                          returned when fetching the managed object. Set it to
   *                          &#x60;false&#x60; to improve query performance.
   *                          (optional, default to true)
   * @param withChildrenCount When set to &#x60;true&#x60;, the returned result
   *                          will contain the total number of children in the
   *                          respective objects (&#x60;childAdditions&#x60;,
   *                          &#x60;childAssets&#x60; and
   *                          &#x60;childDevices&#x60;). (optional, default to
   *                          false)
   * @param withGroups        When set to &#x60;true&#x60; it returns additional
   *                          information about the groups to which the searched
   *                          managed object belongs. This results in setting the
   *                          &#x60;assetParents&#x60; property with additional
   *                          information about the groups. (optional, default to
   *                          false)
   * @param withParents       When set to &#x60;true&#x60;, the returned
   *                          references of child parents will return the
   *                          device&#39;s parents (if any). Otherwise, it will be
   *                          an empty array. (optional, default to false)
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
   * @param withLatestValues  If set to true the platform returns managed objects
   *                          with the fragment &#x60;c8y_LatestMeasurements,
   *                          which contains the latest measurement values
   *                          reported by the device to the platform. &gt; **⚠️
   *                          Feature Preview:** The parameter is a part of the
   *                          Latest Measurement feature which is still under
   *                          public preview. (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&fragmentType={fragmentType}&ids={ids}&onlyRoots={onlyRoots}&owner={owner}&pageSize={pageSize}&q={q}&query={query}&skipChildrenNames={skipChildrenNames}&text={text}&type={type}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withGroups={withGroups}&withParents={withParents}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ApiResponse<ManagedObjectCollection> getManagedObjectCollectionResourceWithHttpInfo(
      @Param("childAdditionId") String childAdditionId, @Param("childAssetId") String childAssetId,
      @Param("childDeviceId") String childDeviceId, @Param("currentPage") Integer currentPage,
      @Param("fragmentType") String fragmentType, @Param("ids") List<String> ids, @Param("onlyRoots") Boolean onlyRoots,
      @Param("owner") String owner, @Param("pageSize") Integer pageSize, @Param("q") String q,
      @Param("query") String query, @Param("skipChildrenNames") Boolean skipChildrenNames, @Param("text") String text,
      @Param("type") String type, @Param("withChildren") Boolean withChildren,
      @Param("withChildrenCount") Boolean withChildrenCount, @Param("withGroups") Boolean withGroups,
      @Param("withParents") Boolean withParents, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages, @Param("withLatestValues") Boolean withLatestValues);

  /**
   * Retrieve all managed objects
   * Retrieve all managed objects (for example, devices, assets, etc.) registered
   * in your tenant, or a subset based on queries.
   * Note, this is equivalent to the other
   * <code>getManagedObjectCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetManagedObjectCollectionResourceQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>childAdditionId - Search for a specific child addition
   *                    and list all the groups to which it belongs.
   *                    (optional)</li>
   *                    <li>childAssetId - Search for a specific child asset and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>childDeviceId - Search for a specific child device and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>fragmentType - A characteristic which identifies a
   *                    managed object or event, for example, geolocation,
   *                    electricity sensor, relay state. (optional)</li>
   *                    <li>ids - The managed object IDs to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple IDs at
   *                    once, comma-separate the values. (optional)</li>
   *                    <li>onlyRoots - When set to &#x60;true&#x60; it returns
   *                    managed objects which don&#39;t have any parent. If the
   *                    current user doesn&#39;t have access to the parent, this
   *                    is also root for the user. (optional, default to
   *                    false)</li>
   *                    <li>owner - Username of the owner of the managed objects.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>q - Similar to the parameter &#x60;query&#x60;, but it
   *                    assumes that this is a device query request and it adds
   *                    automatically the search criteria
   *                    &#x60;fragmentType&#x3D;c8y_IsDevice&#x60;.
   *                    (optional)</li>
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>skipChildrenNames - When set to &#x60;true&#x60;, the
   *                    returned references of child devices won&#39;t contain
   *                    their names. (optional, default to false)</li>
   *                    <li>text - Search for managed objects where a property
   *                    value is equal to the given one. The following properties
   *                    are examined: &#x60;id, type, name, owner,
   *                    externalIds&#x60;. (optional)</li>
   *                    <li>type - The type of managed object to search for.
   *                    (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
   *                    <li>withGroups - When set to &#x60;true&#x60; it returns
   *                    additional information about the groups to which the
   *                    searched managed object belongs. This results in setting
   *                    the &#x60;assetParents&#x60; property with additional
   *                    information about the groups. (optional, default to
   *                    false)</li>
   *                    <li>withParents - When set to &#x60;true&#x60;, the
   *                    returned references of child parents will return the
   *                    device&#39;s parents (if any). Otherwise, it will be an
   *                    empty array. (optional, default to false)</li>
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
   *                    <li>withLatestValues - If set to true the platform returns
   *                    managed objects with the fragment
   *                    &#x60;c8y_LatestMeasurements, which contains the latest
   *                    measurement values reported by the device to the platform.
   *                    &gt; **⚠️ Feature Preview:** The parameter is a part of
   *                    the Latest Measurement feature which is still under public
   *                    preview. (optional, default to false)</li>
   *                    </ul>
   * @return ManagedObjectCollection
   */
  @RequestLine("GET /inventory/managedObjects?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&fragmentType={fragmentType}&ids={ids}&onlyRoots={onlyRoots}&owner={owner}&pageSize={pageSize}&q={q}&query={query}&skipChildrenNames={skipChildrenNames}&text={text}&type={type}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withGroups={withGroups}&withParents={withParents}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ManagedObjectCollection getManagedObjectCollectionResource(
      @QueryMap(encoded = true) GetManagedObjectCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all managed objects
   * Retrieve all managed objects (for example, devices, assets, etc.) registered
   * in your tenant, or a subset based on queries.
   * Note, this is equivalent to the other
   * <code>getManagedObjectCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>childAdditionId - Search for a specific child addition
   *                    and list all the groups to which it belongs.
   *                    (optional)</li>
   *                    <li>childAssetId - Search for a specific child asset and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>childDeviceId - Search for a specific child device and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>fragmentType - A characteristic which identifies a
   *                    managed object or event, for example, geolocation,
   *                    electricity sensor, relay state. (optional)</li>
   *                    <li>ids - The managed object IDs to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple IDs at
   *                    once, comma-separate the values. (optional)</li>
   *                    <li>onlyRoots - When set to &#x60;true&#x60; it returns
   *                    managed objects which don&#39;t have any parent. If the
   *                    current user doesn&#39;t have access to the parent, this
   *                    is also root for the user. (optional, default to
   *                    false)</li>
   *                    <li>owner - Username of the owner of the managed objects.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>q - Similar to the parameter &#x60;query&#x60;, but it
   *                    assumes that this is a device query request and it adds
   *                    automatically the search criteria
   *                    &#x60;fragmentType&#x3D;c8y_IsDevice&#x60;.
   *                    (optional)</li>
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>skipChildrenNames - When set to &#x60;true&#x60;, the
   *                    returned references of child devices won&#39;t contain
   *                    their names. (optional, default to false)</li>
   *                    <li>text - Search for managed objects where a property
   *                    value is equal to the given one. The following properties
   *                    are examined: &#x60;id, type, name, owner,
   *                    externalIds&#x60;. (optional)</li>
   *                    <li>type - The type of managed object to search for.
   *                    (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
   *                    <li>withGroups - When set to &#x60;true&#x60; it returns
   *                    additional information about the groups to which the
   *                    searched managed object belongs. This results in setting
   *                    the &#x60;assetParents&#x60; property with additional
   *                    information about the groups. (optional, default to
   *                    false)</li>
   *                    <li>withParents - When set to &#x60;true&#x60;, the
   *                    returned references of child parents will return the
   *                    device&#39;s parents (if any). Otherwise, it will be an
   *                    empty array. (optional, default to false)</li>
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
   *                    <li>withLatestValues - If set to true the platform returns
   *                    managed objects with the fragment
   *                    &#x60;c8y_LatestMeasurements, which contains the latest
   *                    measurement values reported by the device to the platform.
   *                    &gt; **⚠️ Feature Preview:** The parameter is a part of
   *                    the Latest Measurement feature which is still under public
   *                    preview. (optional, default to false)</li>
   *                    </ul>
   * @return ManagedObjectCollection
   */
  @RequestLine("GET /inventory/managedObjects?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&fragmentType={fragmentType}&ids={ids}&onlyRoots={onlyRoots}&owner={owner}&pageSize={pageSize}&q={q}&query={query}&skipChildrenNames={skipChildrenNames}&text={text}&type={type}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withGroups={withGroups}&withParents={withParents}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ApiResponse<ManagedObjectCollection> getManagedObjectCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetManagedObjectCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getManagedObjectCollectionResource</code> method in a fluent style.
   */
  public static class GetManagedObjectCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetManagedObjectCollectionResourceQueryParams childAdditionId(final String value) {
      put("childAdditionId", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams childAssetId(final String value) {
      put("childAssetId", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams childDeviceId(final String value) {
      put("childDeviceId", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams fragmentType(final String value) {
      put("fragmentType", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams ids(final List<String> value) {
      put("ids", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams onlyRoots(final Boolean value) {
      put("onlyRoots", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams owner(final String value) {
      put("owner", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams q(final String value) {
      put("q", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams skipChildrenNames(final Boolean value) {
      put("skipChildrenNames", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams text(final String value) {
      put("text", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withChildren(final Boolean value) {
      put("withChildren", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withChildrenCount(final Boolean value) {
      put("withChildrenCount", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withGroups(final Boolean value) {
      put("withGroups", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withParents(final Boolean value) {
      put("withParents", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectCollectionResourceQueryParams withLatestValues(final Boolean value) {
      put("withLatestValues", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific managed object
   * Retrieve a specific managed object (for example, device, group, template) by
   * a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param skipChildrenNames When set to &#x60;true&#x60;, the returned
   *                          references of child devices won&#39;t contain their
   *                          names. (optional, default to false)
   * @param withChildren      Determines if children with ID and name should be
   *                          returned when fetching the managed object. Set it to
   *                          &#x60;false&#x60; to improve query performance.
   *                          (optional, default to true)
   * @param withChildrenCount When set to &#x60;true&#x60;, the returned result
   *                          will contain the total number of children in the
   *                          respective objects (&#x60;childAdditions&#x60;,
   *                          &#x60;childAssets&#x60; and
   *                          &#x60;childDevices&#x60;). (optional, default to
   *                          false)
   * @param withParents       When set to &#x60;true&#x60;, the returned
   *                          references of child parents will return the
   *                          device&#39;s parents (if any). Otherwise, it will be
   *                          an empty array. (optional, default to false)
   * @param withLatestValues  If set to true the platform returns managed objects
   *                          with the fragment &#x60;c8y_LatestMeasurements,
   *                          which contains the latest measurement values
   *                          reported by the device to the platform. &gt; **⚠️
   *                          Feature Preview:** The parameter is a part of the
   *                          Latest Measurement feature which is still under
   *                          public preview. (optional, default to false)
   * @return ManagedObject
   */
  @RequestLine("GET /inventory/managedObjects/{id}?skipChildrenNames={skipChildrenNames}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withParents={withParents}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ManagedObject getManagedObjectResource(@Param("id") String id, @Param("skipChildrenNames") Boolean skipChildrenNames,
      @Param("withChildren") Boolean withChildren, @Param("withChildrenCount") Boolean withChildrenCount,
      @Param("withParents") Boolean withParents, @Param("withLatestValues") Boolean withLatestValues);

  /**
   * Retrieve a specific managed object
   * Similar to <code>getManagedObjectResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific managed object (for example, device, group, template) by
   * a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param skipChildrenNames When set to &#x60;true&#x60;, the returned
   *                          references of child devices won&#39;t contain their
   *                          names. (optional, default to false)
   * @param withChildren      Determines if children with ID and name should be
   *                          returned when fetching the managed object. Set it to
   *                          &#x60;false&#x60; to improve query performance.
   *                          (optional, default to true)
   * @param withChildrenCount When set to &#x60;true&#x60;, the returned result
   *                          will contain the total number of children in the
   *                          respective objects (&#x60;childAdditions&#x60;,
   *                          &#x60;childAssets&#x60; and
   *                          &#x60;childDevices&#x60;). (optional, default to
   *                          false)
   * @param withParents       When set to &#x60;true&#x60;, the returned
   *                          references of child parents will return the
   *                          device&#39;s parents (if any). Otherwise, it will be
   *                          an empty array. (optional, default to false)
   * @param withLatestValues  If set to true the platform returns managed objects
   *                          with the fragment &#x60;c8y_LatestMeasurements,
   *                          which contains the latest measurement values
   *                          reported by the device to the platform. &gt; **⚠️
   *                          Feature Preview:** The parameter is a part of the
   *                          Latest Measurement feature which is still under
   *                          public preview. (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}?skipChildrenNames={skipChildrenNames}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withParents={withParents}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ApiResponse<ManagedObject> getManagedObjectResourceWithHttpInfo(@Param("id") String id,
      @Param("skipChildrenNames") Boolean skipChildrenNames, @Param("withChildren") Boolean withChildren,
      @Param("withChildrenCount") Boolean withChildrenCount, @Param("withParents") Boolean withParents,
      @Param("withLatestValues") Boolean withLatestValues);

  /**
   * Retrieve a specific managed object
   * Retrieve a specific managed object (for example, device, group, template) by
   * a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other <code>getManagedObjectResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetManagedObjectResourceQueryParams} class that allows
   * for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the managed object. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>skipChildrenNames - When set to &#x60;true&#x60;, the
   *                    returned references of child devices won&#39;t contain
   *                    their names. (optional, default to false)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
   *                    <li>withParents - When set to &#x60;true&#x60;, the
   *                    returned references of child parents will return the
   *                    device&#39;s parents (if any). Otherwise, it will be an
   *                    empty array. (optional, default to false)</li>
   *                    <li>withLatestValues - If set to true the platform returns
   *                    managed objects with the fragment
   *                    &#x60;c8y_LatestMeasurements, which contains the latest
   *                    measurement values reported by the device to the platform.
   *                    &gt; **⚠️ Feature Preview:** The parameter is a part of
   *                    the Latest Measurement feature which is still under public
   *                    preview. (optional, default to false)</li>
   *                    </ul>
   * @return ManagedObject
   */
  @RequestLine("GET /inventory/managedObjects/{id}?skipChildrenNames={skipChildrenNames}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withParents={withParents}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ManagedObject getManagedObjectResource(@Param("id") String id,
      @QueryMap(encoded = true) GetManagedObjectResourceQueryParams queryParams);

  /**
   * Retrieve a specific managed object
   * Retrieve a specific managed object (for example, device, group, template) by
   * a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other <code>getManagedObjectResource</code>
   * that receives the query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the managed object. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>skipChildrenNames - When set to &#x60;true&#x60;, the
   *                    returned references of child devices won&#39;t contain
   *                    their names. (optional, default to false)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
   *                    <li>withParents - When set to &#x60;true&#x60;, the
   *                    returned references of child parents will return the
   *                    device&#39;s parents (if any). Otherwise, it will be an
   *                    empty array. (optional, default to false)</li>
   *                    <li>withLatestValues - If set to true the platform returns
   *                    managed objects with the fragment
   *                    &#x60;c8y_LatestMeasurements, which contains the latest
   *                    measurement values reported by the device to the platform.
   *                    &gt; **⚠️ Feature Preview:** The parameter is a part of
   *                    the Latest Measurement feature which is still under public
   *                    preview. (optional, default to false)</li>
   *                    </ul>
   * @return ManagedObject
   */
  @RequestLine("GET /inventory/managedObjects/{id}?skipChildrenNames={skipChildrenNames}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withParents={withParents}&withLatestValues={withLatestValues}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ApiResponse<ManagedObject> getManagedObjectResourceWithHttpInfo(@Param("id") String id,
      @QueryMap(encoded = true) GetManagedObjectResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getManagedObjectResource</code> method in a fluent style.
   */
  public static class GetManagedObjectResourceQueryParams extends HashMap<String, Object> {
    public GetManagedObjectResourceQueryParams skipChildrenNames(final Boolean value) {
      put("skipChildrenNames", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectResourceQueryParams withChildren(final Boolean value) {
      put("withChildren", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectResourceQueryParams withChildrenCount(final Boolean value) {
      put("withChildrenCount", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectResourceQueryParams withParents(final Boolean value) {
      put("withParents", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectResourceQueryParams withLatestValues(final Boolean value) {
      put("withLatestValues", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve the username and state of a specific managed object
   * Retrieve the device owner&#39;s username and state (enabled or disabled) of a
   * specific managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return ManagedObjectUser
   */
  @RequestLine("GET /inventory/managedObjects/{id}/user")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectuser+json",
  })
  ManagedObjectUser getManagedObjectUserResource(@Param("id") String id);

  /**
   * Retrieve the username and state of a specific managed object
   * Similar to <code>getManagedObjectUserResource</code> but it also returns the
   * http response headers .
   * Retrieve the device owner&#39;s username and state (enabled or disabled) of a
   * specific managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/user")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectuser+json",
  })
  ApiResponse<ManagedObjectUser> getManagedObjectUserResourceWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve all supported measurement fragments of a specific managed object
   * Retrieve all measurement types of a specific managed object by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; owner of
   * the source &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return SupportedMeasurements
   */
  @RequestLine("GET /inventory/managedObjects/{id}/supportedMeasurements")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  SupportedMeasurements getSupportedMeasurementsManagedObjectResource(@Param("id") String id);

  /**
   * Retrieve all supported measurement fragments of a specific managed object
   * Similar to <code>getSupportedMeasurementsManagedObjectResource</code> but it
   * also returns the http response headers .
   * Retrieve all measurement types of a specific managed object by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; owner of
   * the source &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/supportedMeasurements")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<SupportedMeasurements> getSupportedMeasurementsManagedObjectResourceWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve all supported measurement fragments and series of a specific managed
   * object
   * Retrieve all supported measurement fragments and series of a specific managed
   * object by a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return SupportedSeries
   */
  @RequestLine("GET /inventory/managedObjects/{id}/supportedSeries")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  SupportedSeries getSupportedSeriesManagedObjectResource(@Param("id") String id);

  /**
   * Retrieve all supported measurement fragments and series of a specific managed
   * object
   * Similar to <code>getSupportedSeriesManagedObjectResource</code> but it also
   * returns the http response headers .
   * Retrieve all supported measurement fragments and series of a specific managed
   * object by a given ID. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/supportedSeries")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<SupportedSeries> getSupportedSeriesManagedObjectResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create a managed object
   * Create a managed object, for example, a device with temperature measurements
   * support or a binary switch.&lt;br&gt; In general, each managed object may
   * consist of: * A unique identifier that references the object. * The name of
   * the object. * The most specific type of the managed object. * A time stamp
   * showing the last update. * Fragments with specific meanings, for example,
   * &#x60;c8y_IsDevice&#x60;, &#x60;c8y_SupportedOperations&#x60;. * Any
   * additional custom fragments. Imagine, for example, that you want to describe
   * electric meters from different vendors. Depending on the make of the meter,
   * one may have a relay and one may be capable to measure a single phase or
   * three phases (for example, a three-phase electricity sensor). A fragment
   * &#x60;c8y_ThreePhaseElectricitySensor&#x60; would identify such an electric
   * meter. Devices&#39; characteristics are identified by storing fragments for
   * each of them. &gt; **&amp;#9432; Info:** For more details about fragments
   * with specific meanings, review the sections [Device management
   * library](#section/Device-management-library) and [Sensor
   * library](#section/Sensor-library). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_INVENTORY_CREATE &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_CREATE &lt;/section&gt;
   * 
   * @param managedObject             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return ManagedObject
   */
  @RequestLine("POST /inventory/managedObjects")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ManagedObject postManagedObjectCollectionResource(ManagedObject managedObject, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create a managed object
   * Similar to <code>postManagedObjectCollectionResource</code> but it also
   * returns the http response headers .
   * Create a managed object, for example, a device with temperature measurements
   * support or a binary switch.&lt;br&gt; In general, each managed object may
   * consist of: * A unique identifier that references the object. * The name of
   * the object. * The most specific type of the managed object. * A time stamp
   * showing the last update. * Fragments with specific meanings, for example,
   * &#x60;c8y_IsDevice&#x60;, &#x60;c8y_SupportedOperations&#x60;. * Any
   * additional custom fragments. Imagine, for example, that you want to describe
   * electric meters from different vendors. Depending on the make of the meter,
   * one may have a relay and one may be capable to measure a single phase or
   * three phases (for example, a three-phase electricity sensor). A fragment
   * &#x60;c8y_ThreePhaseElectricitySensor&#x60; would identify such an electric
   * meter. Devices&#39; characteristics are identified by storing fragments for
   * each of them. &gt; **&amp;#9432; Info:** For more details about fragments
   * with specific meanings, review the sections [Device management
   * library](#section/Device-management-library) and [Sensor
   * library](#section/Sensor-library). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_INVENTORY_CREATE &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_CREATE &lt;/section&gt;
   * 
   * @param managedObject             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /inventory/managedObjects")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<ManagedObject> postManagedObjectCollectionResourceWithHttpInfo(ManagedObject managedObject,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific managed object
   * Update a specific managed object (for example, device) by a given ID. For
   * example, if you want to specify that your managed object is a device, you
   * must add the fragment &#x60;c8y_IsDevice&#x60;. The endpoint can also be used
   * as a device availability heartbeat. If you only specifiy the &#x60;id&#x60;,
   * it updates the date when the last message was received and no other property.
   * The response then only contains the &#x60;id&#x60; instead of the full
   * managed object. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param managedObject             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return ManagedObject
   */
  @RequestLine("PUT /inventory/managedObjects/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ManagedObject putManagedObjectResource(@Param("id") String id, ManagedObject managedObject,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific managed object
   * Similar to <code>putManagedObjectResource</code> but it also returns the http
   * response headers .
   * Update a specific managed object (for example, device) by a given ID. For
   * example, if you want to specify that your managed object is a device, you
   * must add the fragment &#x60;c8y_IsDevice&#x60;. The endpoint can also be used
   * as a device availability heartbeat. If you only specifiy the &#x60;id&#x60;,
   * it updates the date when the last message was received and no other property.
   * The response then only contains the &#x60;id&#x60; instead of the full
   * managed object. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param managedObject             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /inventory/managedObjects/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<ManagedObject> putManagedObjectResourceWithHttpInfo(@Param("id") String id, ManagedObject managedObject,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update the user&#39;s details of a specific managed object
   * Update the device owner&#39;s state (enabled or disabled) of a specific
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param managedObjectUser         (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return ManagedObjectUser
   */
  @RequestLine("PUT /inventory/managedObjects/{id}/user")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectuser+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectuser+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ManagedObjectUser putManagedObjectUserResource(@Param("id") String id, ManagedObjectUser managedObjectUser,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update the user&#39;s details of a specific managed object
   * Similar to <code>putManagedObjectUserResource</code> but it also returns the
   * http response headers .
   * Update the device owner&#39;s state (enabled or disabled) of a specific
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param managedObjectUser         (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /inventory/managedObjects/{id}/user")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectuser+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectuser+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<ManagedObjectUser> putManagedObjectUserResourceWithHttpInfo(@Param("id") String id,
      ManagedObjectUser managedObjectUser, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
