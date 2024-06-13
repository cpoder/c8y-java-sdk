package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.BulkOperation;
import org.cpo.c8y.model.BulkOperationCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface BulkOperationsApi extends ApiClient.Api {

  /**
   * Delete a specific bulk operation
   * Delete a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_ADMIN
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the bulk operation.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteBulkOperationResource(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Delete a specific bulk operation
   * Similar to <code>deleteBulkOperationResource</code> but it also returns the
   * http response headers .
   * Delete a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_ADMIN
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the bulk operation.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteBulkOperationResourceWithHttpInfo(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Retrieve a list of bulk operations
   * Retrieve a list of bulk operations. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ &lt;/section&gt;
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
   * @return BulkOperationCollection
   */
  @RequestLine("GET /devicecontrol/bulkoperations?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  BulkOperationCollection getBulkOperationCollectionResource(@Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements);

  /**
   * Retrieve a list of bulk operations
   * Similar to <code>getBulkOperationCollectionResource</code> but it also
   * returns the http response headers .
   * Retrieve a list of bulk operations. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ &lt;/section&gt;
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
  @RequestLine("GET /devicecontrol/bulkoperations?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<BulkOperationCollection> getBulkOperationCollectionResourceWithHttpInfo(
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements);

  /**
   * Retrieve a list of bulk operations
   * Retrieve a list of bulk operations. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getBulkOperationCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetBulkOperationCollectionResourceQueryParams} class
   * that allows for
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
   * @return BulkOperationCollection
   */
  @RequestLine("GET /devicecontrol/bulkoperations?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  BulkOperationCollection getBulkOperationCollectionResource(
      @QueryMap(encoded = true) GetBulkOperationCollectionResourceQueryParams queryParams);

  /**
   * Retrieve a list of bulk operations
   * Retrieve a list of bulk operations. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getBulkOperationCollectionResource</code> that receives the query
   * parameters as a map,
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
   * @return BulkOperationCollection
   */
  @RequestLine("GET /devicecontrol/bulkoperations?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperationcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<BulkOperationCollection> getBulkOperationCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetBulkOperationCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getBulkOperationCollectionResource</code> method in a fluent style.
   */
  public static class GetBulkOperationCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetBulkOperationCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetBulkOperationCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetBulkOperationCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific bulk operation
   * Retrieve a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the bulk operation. (required)
   * @return BulkOperation
   */
  @RequestLine("GET /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  BulkOperation getBulkOperationResource(@Param("id") String id);

  /**
   * Retrieve a specific bulk operation
   * Similar to <code>getBulkOperationResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_READ
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the bulk operation. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<BulkOperation> getBulkOperationResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create a bulk operation
   * Create a bulk operation. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_BULK_OPERATION_ADMIN &lt;/section&gt;
   * 
   * @param bulkOperation             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return BulkOperation
   */
  @RequestLine("POST /devicecontrol/bulkoperations")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.bulkoperation+json",
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  BulkOperation postBulkOperationCollectionResource(BulkOperation bulkOperation, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create a bulk operation
   * Similar to <code>postBulkOperationCollectionResource</code> but it also
   * returns the http response headers .
   * Create a bulk operation. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_BULK_OPERATION_ADMIN &lt;/section&gt;
   * 
   * @param bulkOperation             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /devicecontrol/bulkoperations")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.bulkoperation+json",
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<BulkOperation> postBulkOperationCollectionResourceWithHttpInfo(BulkOperation bulkOperation,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific bulk operation
   * Update a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_ADMIN
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the bulk operation.
   *                                  (required)
   * @param bulkOperation             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return BulkOperation
   */
  @RequestLine("PUT /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.bulkoperation+json",
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  BulkOperation putBulkOperationResource(@Param("id") String id, BulkOperation bulkOperation,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific bulk operation
   * Similar to <code>putBulkOperationResource</code> but it also returns the http
   * response headers .
   * Update a specific bulk operation (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_BULK_OPERATION_ADMIN
   * &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the bulk operation.
   *                                  (required)
   * @param bulkOperation             (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /devicecontrol/bulkoperations/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.bulkoperation+json",
      "Accept: application/vnd.com.nsn.cumulocity.bulkoperation+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<BulkOperation> putBulkOperationResourceWithHttpInfo(@Param("id") String id, BulkOperation bulkOperation,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
