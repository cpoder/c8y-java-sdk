package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.ChildOperationsAddMultiple;
import org.cpo.c8y.model.ChildOperationsAddOne;
import org.cpo.c8y.model.GetManagedObjectChildAdditionResource200Response;
import org.cpo.c8y.model.GetManagedObjectChildAssetResource200Response;
import org.cpo.c8y.model.GetManagedObjectChildAssetsResource200Response;
import org.cpo.c8y.model.GetManagedObjectChildDeviceResource200Response;
import org.cpo.c8y.model.GetManagedObjectChildDevicesResource200Response;
import org.cpo.c8y.model.ManagedObjectReferenceCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ChildOperationsApi extends ApiClient.Api {

  /**
   * Remove a specific child addition from its parent
   * Remove a specific child addition (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAdditions/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildAdditionResource(@Param("id") String id, @Param("childId") String childId,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific child addition from its parent
   * Similar to <code>deleteManagedObjectChildAdditionResource</code> but it also
   * returns the http response headers .
   * Remove a specific child addition (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAdditions/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildAdditionResourceWithHttpInfo(@Param("id") String id,
      @Param("childId") String childId, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child additions from its parent
   * Remove specific child additions (by given child IDs) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAdditions")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildAdditionResourceMultiple(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child additions from its parent
   * Similar to <code>deleteManagedObjectChildAdditionResourceMultiple</code> but
   * it also returns the http response headers .
   * Remove specific child additions (by given child IDs) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAdditions")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildAdditionResourceMultipleWithHttpInfo(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific child asset from its parent
   * Remove a specific child asset (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAssets/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildAssetResource(@Param("id") String id, @Param("childId") String childId,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific child asset from its parent
   * Similar to <code>deleteManagedObjectChildAssetResource</code> but it also
   * returns the http response headers .
   * Remove a specific child asset (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAssets/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildAssetResourceWithHttpInfo(@Param("id") String id,
      @Param("childId") String childId, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child assets from its parent
   * Remove specific child assets (by given child IDs) from its parent (by a given
   * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner
   * of the source (parent) &lt;b&gt;OR&lt;/b&gt; owner of the child
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAssets")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildAssetResourceMultiple(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child assets from its parent
   * Similar to <code>deleteManagedObjectChildAssetResourceMultiple</code> but it
   * also returns the http response headers .
   * Remove specific child assets (by given child IDs) from its parent (by a given
   * ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner
   * of the source (parent) &lt;b&gt;OR&lt;/b&gt; owner of the child
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childAssets")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildAssetResourceMultipleWithHttpInfo(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific child device from its parent
   * Remove a specific child device (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childDevices/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildDeviceResource(@Param("id") String id, @Param("childId") String childId,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific child device from its parent
   * Similar to <code>deleteManagedObjectChildDeviceResource</code> but it also
   * returns the http response headers .
   * Remove a specific child device (by a given child ID) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childId                   Unique identifier of the child object.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childDevices/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildDeviceResourceWithHttpInfo(@Param("id") String id,
      @Param("childId") String childId, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child devices from its parent
   * Remove specific child devices (by given child IDs) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childDevices")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteManagedObjectChildDeviceResourceMultiple(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove specific child devices from its parent
   * Similar to <code>deleteManagedObjectChildDeviceResourceMultiple</code> but it
   * also returns the http response headers .
   * Remove specific child devices (by given child IDs) from its parent (by a
   * given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source (parent) &lt;b&gt;OR&lt;/b&gt;
   * owner of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on
   * the source (parent) &lt;/section&gt;
   * 
   * @param id                         Unique identifier of the managed object.
   *                                   (required)
   * @param childOperationsAddMultiple (required)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /inventory/managedObjects/{id}/childDevices")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteManagedObjectChildDeviceResourceMultipleWithHttpInfo(@Param("id") String id,
      ChildOperationsAddMultiple childOperationsAddMultiple,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Retrieve a specific child addition of a specific managed object
   * Retrieve a specific child addition (by a given child ID) of a specific
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission
   * on the source (parent) &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return GetManagedObjectChildAdditionResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  GetManagedObjectChildAdditionResource200Response getManagedObjectChildAdditionResource(@Param("id") String id,
      @Param("childId") String childId);

  /**
   * Retrieve a specific child addition of a specific managed object
   * Similar to <code>getManagedObjectChildAdditionResource</code> but it also
   * returns the http response headers .
   * Retrieve a specific child addition (by a given child ID) of a specific
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_READ &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission
   * on the source (parent) &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  ApiResponse<GetManagedObjectChildAdditionResource200Response> getManagedObjectChildAdditionResourceWithHttpInfo(
      @Param("id") String id, @Param("childId") String childId);

  /**
   * Retrieve all child additions of a specific managed object
   * Retrieve all child additions of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
   * @return ManagedObjectReferenceCollection
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ManagedObjectReferenceCollection getManagedObjectChildAdditionsResource(@Param("id") String id,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize, @Param("query") String query,
      @Param("withChildren") Boolean withChildren, @Param("withChildrenCount") Boolean withChildrenCount,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child additions of a specific managed object
   * Similar to <code>getManagedObjectChildAdditionsResource</code> but it also
   * returns the http response headers .
   * Retrieve all child additions of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<ManagedObjectReferenceCollection> getManagedObjectChildAdditionsResourceWithHttpInfo(
      @Param("id") String id, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("query") String query, @Param("withChildren") Boolean withChildren,
      @Param("withChildrenCount") Boolean withChildrenCount, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child additions of a specific managed object
   * Retrieve all child additions of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildAdditionsResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetManagedObjectChildAdditionsResourceQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return ManagedObjectReferenceCollection
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ManagedObjectReferenceCollection getManagedObjectChildAdditionsResource(@Param("id") String id,
      @QueryMap(encoded = true) GetManagedObjectChildAdditionsResourceQueryParams queryParams);

  /**
   * Retrieve all child additions of a specific managed object
   * Retrieve all child additions of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildAdditionsResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return ManagedObjectReferenceCollection
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAdditions?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<ManagedObjectReferenceCollection> getManagedObjectChildAdditionsResourceWithHttpInfo(
      @Param("id") String id, @QueryMap(encoded = true) GetManagedObjectChildAdditionsResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getManagedObjectChildAdditionsResource</code> method in a fluent style.
   */
  public static class GetManagedObjectChildAdditionsResourceQueryParams extends HashMap<String, Object> {
    public GetManagedObjectChildAdditionsResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams withChildren(final Boolean value) {
      put("withChildren", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams withChildrenCount(final Boolean value) {
      put("withChildrenCount", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAdditionsResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific child asset of a specific managed object
   * Retrieve a specific child asset (by a given child ID) of a specific managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return GetManagedObjectChildAssetResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  GetManagedObjectChildAssetResource200Response getManagedObjectChildAssetResource(@Param("id") String id,
      @Param("childId") String childId);

  /**
   * Retrieve a specific child asset of a specific managed object
   * Similar to <code>getManagedObjectChildAssetResource</code> but it also
   * returns the http response headers .
   * Retrieve a specific child asset (by a given child ID) of a specific managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  ApiResponse<GetManagedObjectChildAssetResource200Response> getManagedObjectChildAssetResourceWithHttpInfo(
      @Param("id") String id, @Param("childId") String childId);

  /**
   * Retrieve all child assets of a specific managed object
   * Retrieve all child assets of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
   * @return GetManagedObjectChildAssetsResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  GetManagedObjectChildAssetsResource200Response getManagedObjectChildAssetsResource(@Param("id") String id,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize, @Param("query") String query,
      @Param("withChildren") Boolean withChildren, @Param("withChildrenCount") Boolean withChildrenCount,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child assets of a specific managed object
   * Similar to <code>getManagedObjectChildAssetsResource</code> but it also
   * returns the http response headers .
   * Retrieve all child assets of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<GetManagedObjectChildAssetsResource200Response> getManagedObjectChildAssetsResourceWithHttpInfo(
      @Param("id") String id, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("query") String query, @Param("withChildren") Boolean withChildren,
      @Param("withChildrenCount") Boolean withChildrenCount, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child assets of a specific managed object
   * Retrieve all child assets of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildAssetsResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetManagedObjectChildAssetsResourceQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return GetManagedObjectChildAssetsResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  GetManagedObjectChildAssetsResource200Response getManagedObjectChildAssetsResource(@Param("id") String id,
      @QueryMap(encoded = true) GetManagedObjectChildAssetsResourceQueryParams queryParams);

  /**
   * Retrieve all child assets of a specific managed object
   * Retrieve all child assets of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildAssetsResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return GetManagedObjectChildAssetsResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childAssets?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<GetManagedObjectChildAssetsResource200Response> getManagedObjectChildAssetsResourceWithHttpInfo(
      @Param("id") String id, @QueryMap(encoded = true) GetManagedObjectChildAssetsResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getManagedObjectChildAssetsResource</code> method in a fluent style.
   */
  public static class GetManagedObjectChildAssetsResourceQueryParams extends HashMap<String, Object> {
    public GetManagedObjectChildAssetsResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams withChildren(final Boolean value) {
      put("withChildren", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams withChildrenCount(final Boolean value) {
      put("withChildrenCount", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildAssetsResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific child device of a specific managed object
   * Retrieve a specific child device (by a given child ID) of a specific managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return GetManagedObjectChildDeviceResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  GetManagedObjectChildDeviceResource200Response getManagedObjectChildDeviceResource(@Param("id") String id,
      @Param("childId") String childId);

  /**
   * Retrieve a specific child device of a specific managed object
   * Similar to <code>getManagedObjectChildDeviceResource</code> but it also
   * returns the http response headers .
   * Retrieve a specific child device (by a given child ID) of a specific managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the source (parent)
   * &lt;/section&gt;
   * 
   * @param id      Unique identifier of the managed object. (required)
   * @param childId Unique identifier of the child object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices/{childId}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreference+json",
  })
  ApiResponse<GetManagedObjectChildDeviceResource200Response> getManagedObjectChildDeviceResourceWithHttpInfo(
      @Param("id") String id, @Param("childId") String childId);

  /**
   * Retrieve all child devices of a specific managed object
   * Retrieve all child devices of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
   * @return GetManagedObjectChildDevicesResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  GetManagedObjectChildDevicesResource200Response getManagedObjectChildDevicesResource(@Param("id") String id,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize, @Param("query") String query,
      @Param("withChildren") Boolean withChildren, @Param("withChildrenCount") Boolean withChildrenCount,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child devices of a specific managed object
   * Similar to <code>getManagedObjectChildDevicesResource</code> but it also
   * returns the http response headers .
   * Retrieve all child devices of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * 
   * @param id                Unique identifier of the managed object. (required)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param query             Use query language to perform operations and/or
   *                          filter the results. Details about the properties and
   *                          supported operations can be found in [Query
   *                          language](#tag/Query-language). (optional)
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
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<GetManagedObjectChildDevicesResource200Response> getManagedObjectChildDevicesResourceWithHttpInfo(
      @Param("id") String id, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("query") String query, @Param("withChildren") Boolean withChildren,
      @Param("withChildrenCount") Boolean withChildrenCount, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all child devices of a specific managed object
   * Retrieve all child devices of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildDevicesResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetManagedObjectChildDevicesResourceQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return GetManagedObjectChildDevicesResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  GetManagedObjectChildDevicesResource200Response getManagedObjectChildDevicesResource(@Param("id") String id,
      @QueryMap(encoded = true) GetManagedObjectChildDevicesResourceQueryParams queryParams);

  /**
   * Retrieve all child devices of a specific managed object
   * Retrieve all child devices of a specific managed object by a given ID, or a
   * subset based on queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_READ &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_READ permission on the source &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getManagedObjectChildDevicesResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param id          Unique identifier of the managed object. (required)
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
   *                    <li>query - Use query language to perform operations
   *                    and/or filter the results. Details about the properties
   *                    and supported operations can be found in [Query
   *                    language](#tag/Query-language). (optional)</li>
   *                    <li>withChildren - Determines if children with ID and name
   *                    should be returned when fetching the managed object. Set
   *                    it to &#x60;false&#x60; to improve query performance.
   *                    (optional, default to true)</li>
   *                    <li>withChildrenCount - When set to &#x60;true&#x60;, the
   *                    returned result will contain the total number of children
   *                    in the respective objects (&#x60;childAdditions&#x60;,
   *                    &#x60;childAssets&#x60; and &#x60;childDevices&#x60;).
   *                    (optional, default to false)</li>
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
   * @return GetManagedObjectChildDevicesResource200Response
   */
  @RequestLine("GET /inventory/managedObjects/{id}/childDevices?currentPage={currentPage}&pageSize={pageSize}&query={query}&withChildren={withChildren}&withChildrenCount={withChildrenCount}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectreferencecollection+json",
  })
  ApiResponse<GetManagedObjectChildDevicesResource200Response> getManagedObjectChildDevicesResourceWithHttpInfo(
      @Param("id") String id, @QueryMap(encoded = true) GetManagedObjectChildDevicesResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getManagedObjectChildDevicesResource</code> method in a fluent style.
   */
  public static class GetManagedObjectChildDevicesResourceQueryParams extends HashMap<String, Object> {
    public GetManagedObjectChildDevicesResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams withChildren(final Boolean value) {
      put("withChildren", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams withChildrenCount(final Boolean value) {
      put("withChildrenCount", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetManagedObjectChildDevicesResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Assign a managed object as child addition
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child addition of another managed object (by
   * a given ID). * Assign multiple existing managed objects (by given child IDs)
   * as child additions of another managed object (by a given ID). * Create a
   * managed object in the inventory and assign it as a child addition to another
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; ((owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source)
   * &lt;b&gt;AND&lt;/b&gt; (owner of the child &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childAdditions")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void postManagedObjectChildAdditionsResource(@Param("id") String id, ChildOperationsAddOne childOperationsAddOne,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Assign a managed object as child addition
   * Similar to <code>postManagedObjectChildAdditionsResource</code> but it also
   * returns the http response headers .
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child addition of another managed object (by
   * a given ID). * Assign multiple existing managed objects (by given child IDs)
   * as child additions of another managed object (by a given ID). * Create a
   * managed object in the inventory and assign it as a child addition to another
   * managed object (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_MANAGED_OBJECT_ADMIN &lt;b&gt;OR&lt;/b&gt; ((owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the source)
   * &lt;b&gt;AND&lt;/b&gt; (owner of the child &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childAdditions")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> postManagedObjectChildAdditionsResourceWithHttpInfo(@Param("id") String id,
      ChildOperationsAddOne childOperationsAddOne, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Assign a managed object as child asset
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child asset of another managed object (by a
   * given ID). * Assign multiple existing managed objects (by given child IDs) as
   * child assets of another managed object (by a given ID). * Create a managed
   * object in the inventory and assign it as a child asset to another managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ((owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source) &lt;b&gt;AND&lt;/b&gt; (owner
   * of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the
   * child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childAssets")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void postManagedObjectChildAssetsResource(@Param("id") String id, ChildOperationsAddOne childOperationsAddOne,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Assign a managed object as child asset
   * Similar to <code>postManagedObjectChildAssetsResource</code> but it also
   * returns the http response headers .
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child asset of another managed object (by a
   * given ID). * Assign multiple existing managed objects (by given child IDs) as
   * child assets of another managed object (by a given ID). * Create a managed
   * object in the inventory and assign it as a child asset to another managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ((owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source) &lt;b&gt;AND&lt;/b&gt; (owner
   * of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the
   * child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childAssets")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> postManagedObjectChildAssetsResourceWithHttpInfo(@Param("id") String id,
      ChildOperationsAddOne childOperationsAddOne, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Assign a managed object as child device
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child device of another managed object (by a
   * given ID). * Assign multiple existing managed objects (by given child IDs) as
   * child devices of another managed object (by a given ID). * Create a managed
   * object in the inventory and assign it as a child device to another managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ((owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source) &lt;b&gt;AND&lt;/b&gt; (owner
   * of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the
   * child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childDevices")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void postManagedObjectChildDevicesResource(@Param("id") String id, ChildOperationsAddOne childOperationsAddOne,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Assign a managed object as child device
   * Similar to <code>postManagedObjectChildDevicesResource</code> but it also
   * returns the http response headers .
   * The possible ways to assign child objects are: * Assign an existing managed
   * object (by a given child ID) as child device of another managed object (by a
   * given ID). * Assign multiple existing managed objects (by given child IDs) as
   * child devices of another managed object (by a given ID). * Create a managed
   * object in the inventory and assign it as a child device to another managed
   * object (by a given ID). &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ((owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the source) &lt;b&gt;AND&lt;/b&gt; (owner
   * of the child &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the
   * child)) &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the managed object.
   *                                  (required)
   * @param childOperationsAddOne     (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("POST /inventory/managedObjects/{id}/childDevices")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.managedobjectreference+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> postManagedObjectChildDevicesResourceWithHttpInfo(@Param("id") String id,
      ChildOperationsAddOne childOperationsAddOne, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
