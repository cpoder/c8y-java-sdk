package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Operation;
import org.cpo.c8y.model.OperationCollection;
import org.cpo.c8y.model.PostOperationCollectionResourceRequest;
import org.cpo.c8y.model.PutOperationResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface OperationsApi extends ApiClient.Api {

  /**
   * Delete a list of operations
   * Delete a list of operations. The DELETE method allows for deletion of
   * operation collections. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param agentId                   An agent ID that may be part of the
   *                                  operation. (optional)
   * @param dateFrom                  Start date or date and time of the
   *                                  operation. (optional)
   * @param dateTo                    End date or date and time of the operation.
   *                                  (optional)
   * @param deviceId                  The ID of the device the operation is
   *                                  performed for. (optional)
   * @param status                    Status of the operation. (optional)
   */
  @RequestLine("DELETE /devicecontrol/operations?agentId={agentId}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&status={status}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteOperationCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("agentId") String agentId, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("deviceId") String deviceId, @Param("status") String status);

  /**
   * Delete a list of operations
   * Similar to <code>deleteOperationCollectionResource</code> but it also returns
   * the http response headers .
   * Delete a list of operations. The DELETE method allows for deletion of
   * operation collections. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param agentId                   An agent ID that may be part of the
   *                                  operation. (optional)
   * @param dateFrom                  Start date or date and time of the
   *                                  operation. (optional)
   * @param dateTo                    End date or date and time of the operation.
   *                                  (optional)
   * @param deviceId                  The ID of the device the operation is
   *                                  performed for. (optional)
   * @param status                    Status of the operation. (optional)
   */
  @RequestLine("DELETE /devicecontrol/operations?agentId={agentId}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&status={status}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteOperationCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("agentId") String agentId,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("deviceId") String deviceId, @Param("status") String status);

  /**
   * Delete a list of operations
   * Delete a list of operations. The DELETE method allows for deletion of
   * operation collections. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteOperationCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOperationCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
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
   *                                  <li>agentId - An agent ID that may be part
   *                                  of the operation. (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the operation. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the operation. (optional)</li>
   *                                  <li>deviceId - The ID of the device the
   *                                  operation is performed for. (optional)</li>
   *                                  <li>status - Status of the operation.
   *                                  (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /devicecontrol/operations?agentId={agentId}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&status={status}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteOperationCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteOperationCollectionResourceQueryParams queryParams);

  /**
   * Delete a list of operations
   * Delete a list of operations. The DELETE method allows for deletion of
   * operation collections. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteOperationCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
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
   *                                  <li>agentId - An agent ID that may be part
   *                                  of the operation. (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the operation. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the operation. (optional)</li>
   *                                  <li>deviceId - The ID of the device the
   *                                  operation is performed for. (optional)</li>
   *                                  <li>status - Status of the operation.
   *                                  (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /devicecontrol/operations?agentId={agentId}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&status={status}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteOperationCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteOperationCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteOperationCollectionResource</code> method in a fluent style.
   */
  public static class DeleteOperationCollectionResourceQueryParams extends HashMap<String, Object> {
    public DeleteOperationCollectionResourceQueryParams agentId(final String value) {
      put("agentId", EncodingUtils.encode(value));
      return this;
    }

    public DeleteOperationCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteOperationCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteOperationCollectionResourceQueryParams deviceId(final String value) {
      put("deviceId", EncodingUtils.encode(value));
      return this;
    }

    public DeleteOperationCollectionResourceQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a list of operations
   * Retrieve a list of operations. Notes about operation collections: * The
   * embedded operation object contains &#x60;deviceExternalIDs&#x60; only when
   * queried with an &#x60;agentId&#x60; parameter. * The embedded operation
   * object is filled with &#x60;deviceName&#x60;, but only when requesting
   * resource: Get a collection of operations. * Operations are returned in the
   * order of their ascending IDs. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
   * 
   * @param agentId           An agent ID that may be part of the operation. If
   *                          this parameter is set, the operation response
   *                          objects contain the &#x60;deviceExternalIDs&#x60;
   *                          object. (optional)
   * @param bulkOperationId   The bulk operation ID that this operation belongs
   *                          to. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the operation.
   *                          (optional)
   * @param dateTo            End date or date and time of the operation.
   *                          (optional)
   * @param deviceId          The ID of the device the operation is performed for.
   *                          (optional)
   * @param fragmentType      The type of fragment that must be part of the
   *                          operation. (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param revert            If you are using a range query (that is, at least
   *                          one of the &#x60;dateFrom&#x60; or
   *                          &#x60;dateTo&#x60; parameters is included in the
   *                          request), then setting &#x60;revert&#x3D;true&#x60;
   *                          will sort the results by the newest operations
   *                          first. By default, the results are sorted by the
   *                          oldest operations first. (optional, default to
   *                          false)
   * @param status            Status of the operation. (optional)
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
   * @return OperationCollection
   */
  @RequestLine("GET /devicecontrol/operations?agentId={agentId}&bulkOperationId={bulkOperationId}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&fragmentType={fragmentType}&pageSize={pageSize}&revert={revert}&status={status}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operationcollection+json",
  })
  OperationCollection getOperationCollectionResource(@Param("agentId") String agentId,
      @Param("bulkOperationId") String bulkOperationId, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("deviceId") String deviceId, @Param("fragmentType") String fragmentType,
      @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert, @Param("status") String status,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve a list of operations
   * Similar to <code>getOperationCollectionResource</code> but it also returns
   * the http response headers .
   * Retrieve a list of operations. Notes about operation collections: * The
   * embedded operation object contains &#x60;deviceExternalIDs&#x60; only when
   * queried with an &#x60;agentId&#x60; parameter. * The embedded operation
   * object is filled with &#x60;deviceName&#x60;, but only when requesting
   * resource: Get a collection of operations. * Operations are returned in the
   * order of their ascending IDs. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
   * 
   * @param agentId           An agent ID that may be part of the operation. If
   *                          this parameter is set, the operation response
   *                          objects contain the &#x60;deviceExternalIDs&#x60;
   *                          object. (optional)
   * @param bulkOperationId   The bulk operation ID that this operation belongs
   *                          to. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the operation.
   *                          (optional)
   * @param dateTo            End date or date and time of the operation.
   *                          (optional)
   * @param deviceId          The ID of the device the operation is performed for.
   *                          (optional)
   * @param fragmentType      The type of fragment that must be part of the
   *                          operation. (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param revert            If you are using a range query (that is, at least
   *                          one of the &#x60;dateFrom&#x60; or
   *                          &#x60;dateTo&#x60; parameters is included in the
   *                          request), then setting &#x60;revert&#x3D;true&#x60;
   *                          will sort the results by the newest operations
   *                          first. By default, the results are sorted by the
   *                          oldest operations first. (optional, default to
   *                          false)
   * @param status            Status of the operation. (optional)
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
  @RequestLine("GET /devicecontrol/operations?agentId={agentId}&bulkOperationId={bulkOperationId}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&fragmentType={fragmentType}&pageSize={pageSize}&revert={revert}&status={status}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operationcollection+json",
  })
  ApiResponse<OperationCollection> getOperationCollectionResourceWithHttpInfo(@Param("agentId") String agentId,
      @Param("bulkOperationId") String bulkOperationId, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("deviceId") String deviceId, @Param("fragmentType") String fragmentType,
      @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert, @Param("status") String status,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve a list of operations
   * Retrieve a list of operations. Notes about operation collections: * The
   * embedded operation object contains &#x60;deviceExternalIDs&#x60; only when
   * queried with an &#x60;agentId&#x60; parameter. * The embedded operation
   * object is filled with &#x60;deviceName&#x60;, but only when requesting
   * resource: Get a collection of operations. * Operations are returned in the
   * order of their ascending IDs. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getOperationCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetOperationCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>agentId - An agent ID that may be part of the
   *                    operation. If this parameter is set, the operation
   *                    response objects contain the &#x60;deviceExternalIDs&#x60;
   *                    object. (optional)</li>
   *                    <li>bulkOperationId - The bulk operation ID that this
   *                    operation belongs to. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the
   *                    operation. (optional)</li>
   *                    <li>dateTo - End date or date and time of the operation.
   *                    (optional)</li>
   *                    <li>deviceId - The ID of the device the operation is
   *                    performed for. (optional)</li>
   *                    <li>fragmentType - The type of fragment that must be part
   *                    of the operation. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest operations first. By default, the
   *                    results are sorted by the oldest operations first.
   *                    (optional, default to false)</li>
   *                    <li>status - Status of the operation. (optional)</li>
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
   * @return OperationCollection
   */
  @RequestLine("GET /devicecontrol/operations?agentId={agentId}&bulkOperationId={bulkOperationId}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&fragmentType={fragmentType}&pageSize={pageSize}&revert={revert}&status={status}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operationcollection+json",
  })
  OperationCollection getOperationCollectionResource(
      @QueryMap(encoded = true) GetOperationCollectionResourceQueryParams queryParams);

  /**
   * Retrieve a list of operations
   * Retrieve a list of operations. Notes about operation collections: * The
   * embedded operation object contains &#x60;deviceExternalIDs&#x60; only when
   * queried with an &#x60;agentId&#x60; parameter. * The embedded operation
   * object is filled with &#x60;deviceName&#x60;, but only when requesting
   * resource: Get a collection of operations. * Operations are returned in the
   * order of their ascending IDs. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getOperationCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>agentId - An agent ID that may be part of the
   *                    operation. If this parameter is set, the operation
   *                    response objects contain the &#x60;deviceExternalIDs&#x60;
   *                    object. (optional)</li>
   *                    <li>bulkOperationId - The bulk operation ID that this
   *                    operation belongs to. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the
   *                    operation. (optional)</li>
   *                    <li>dateTo - End date or date and time of the operation.
   *                    (optional)</li>
   *                    <li>deviceId - The ID of the device the operation is
   *                    performed for. (optional)</li>
   *                    <li>fragmentType - The type of fragment that must be part
   *                    of the operation. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest operations first. By default, the
   *                    results are sorted by the oldest operations first.
   *                    (optional, default to false)</li>
   *                    <li>status - Status of the operation. (optional)</li>
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
   * @return OperationCollection
   */
  @RequestLine("GET /devicecontrol/operations?agentId={agentId}&bulkOperationId={bulkOperationId}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&deviceId={deviceId}&fragmentType={fragmentType}&pageSize={pageSize}&revert={revert}&status={status}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operationcollection+json",
  })
  ApiResponse<OperationCollection> getOperationCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetOperationCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getOperationCollectionResource</code> method in a fluent style.
   */
  public static class GetOperationCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetOperationCollectionResourceQueryParams agentId(final String value) {
      put("agentId", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams bulkOperationId(final String value) {
      put("bulkOperationId", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams deviceId(final String value) {
      put("deviceId", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams fragmentType(final String value) {
      put("fragmentType", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams revert(final Boolean value) {
      put("revert", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams status(final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetOperationCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific operation
   * Retrieve a specific operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permission on the device &lt;/section&gt;
   * 
   * @param id Unique identifier of the operation. (required)
   * @return Operation
   */
  @RequestLine("GET /devicecontrol/operations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
  })
  Operation getOperationResource(@Param("id") String id);

  /**
   * Retrieve a specific operation
   * Similar to <code>getOperationResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permission on the device &lt;/section&gt;
   * 
   * @param id Unique identifier of the operation. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /devicecontrol/operations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
  })
  ApiResponse<Operation> getOperationResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create an operation
   * Create an operation. It is possible to add custom fragments to operations,
   * for example &#x60;com_cumulocity_model_WebCamDevice&#x60; is a custom object
   * of the webcam operation. There are some custom fragments which are used by
   * web applications (like Device management) to provide additional context to
   * operations, for example: * &#x60;description&#x60; - this fragment can be
   * used to provide a brief user-friendly description of the operation which is
   * later displayed in the operations list views within web applications.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the device &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permissions on the device &lt;/section&gt;
   * 
   * @param postOperationCollectionResourceRequest (required)
   * @param accept                                 Advertises which content types,
   *                                               expressed as MIME types, the
   *                                               client is able to understand.
   *                                               (optional)
   * @param xCumulocityProcessingMode              Used to explicitly control the
   *                                               processing mode of the request.
   *                                               See [Processing
   *                                               mode](#processing-mode) for
   *                                               more details. (optional,
   *                                               default to PERSISTENT)
   * @return Operation
   */
  @RequestLine("POST /devicecontrol/operations")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Operation postOperationCollectionResource(
      PostOperationCollectionResourceRequest postOperationCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create an operation
   * Similar to <code>postOperationCollectionResource</code> but it also returns
   * the http response headers .
   * Create an operation. It is possible to add custom fragments to operations,
   * for example &#x60;com_cumulocity_model_WebCamDevice&#x60; is a custom object
   * of the webcam operation. There are some custom fragments which are used by
   * web applications (like Device management) to provide additional context to
   * operations, for example: * &#x60;description&#x60; - this fragment can be
   * used to provide a brief user-friendly description of the operation which is
   * later displayed in the operations list views within web applications.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the device &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permissions on the device &lt;/section&gt;
   * 
   * @param postOperationCollectionResourceRequest (required)
   * @param accept                                 Advertises which content types,
   *                                               expressed as MIME types, the
   *                                               client is able to understand.
   *                                               (optional)
   * @param xCumulocityProcessingMode              Used to explicitly control the
   *                                               processing mode of the request.
   *                                               See [Processing
   *                                               mode](#processing-mode) for
   *                                               more details. (optional,
   *                                               default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /devicecontrol/operations")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Operation> postOperationCollectionResourceWithHttpInfo(
      PostOperationCollectionResourceRequest postOperationCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific operation status
   * Update a specific operation (by a given ID). You can only update its status.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permission on the device &lt;/section&gt;
   * 
   * @param id                          Unique identifier of the operation.
   *                                    (required)
   * @param putOperationResourceRequest (required)
   * @param accept                      Advertises which content types, expressed
   *                                    as MIME types, the client is able to
   *                                    understand. (optional)
   * @param xCumulocityProcessingMode   Used to explicitly control the processing
   *                                    mode of the request. See [Processing
   *                                    mode](#processing-mode) for more details.
   *                                    (optional, default to PERSISTENT)
   * @return Operation
   */
  @RequestLine("PUT /devicecontrol/operations/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Operation putOperationResource(@Param("id") String id, PutOperationResourceRequest putOperationResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific operation status
   * Similar to <code>putOperationResource</code> but it also returns the http
   * response headers .
   * Update a specific operation (by a given ID). You can only update its status.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt; ADMIN
   * permission on the device &lt;/section&gt;
   * 
   * @param id                          Unique identifier of the operation.
   *                                    (required)
   * @param putOperationResourceRequest (required)
   * @param accept                      Advertises which content types, expressed
   *                                    as MIME types, the client is able to
   *                                    understand. (optional)
   * @param xCumulocityProcessingMode   Used to explicitly control the processing
   *                                    mode of the request. See [Processing
   *                                    mode](#processing-mode) for more details.
   *                                    (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /devicecontrol/operations/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.operation+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Operation> putOperationResourceWithHttpInfo(@Param("id") String id,
      PutOperationResourceRequest putOperationResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
