package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.NewDeviceRequest;
import org.cpo.c8y.model.NewDeviceRequestCollection;
import org.cpo.c8y.model.PostNewDeviceRequestCollectionResourceRequest;
import org.cpo.c8y.model.PutNewDeviceRequestResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface NewDeviceRequestsApi extends ApiClient.Api {

    /**
     * Delete a specific new device request
     * Delete a specific new device request (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param requestId Unique identifier of the new device request. (required)
     */
    @RequestLine("DELETE /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteNewDeviceRequestResource(@Param("requestId") String requestId);

    /**
     * Delete a specific new device request
     * Similar to <code>deleteNewDeviceRequestResource</code> but it also returns
     * the http response headers .
     * Delete a specific new device request (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
     * &lt;/section&gt;
     * 
     * @param requestId Unique identifier of the new device request. (required)
     */
    @RequestLine("DELETE /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteNewDeviceRequestResourceWithHttpInfo(@Param("requestId") String requestId);

    /**
     * Retrieve a list of new device requests
     * Retrieve a list of new device requests. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
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
     * @return NewDeviceRequestCollection
     */
    @RequestLine("GET /devicecontrol/newDeviceRequests?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequestcollection+json",
    })
    NewDeviceRequestCollection getNewDeviceRequestCollectionResource(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve a list of new device requests
     * Similar to <code>getNewDeviceRequestCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve a list of new device requests. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
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
    @RequestLine("GET /devicecontrol/newDeviceRequests?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequestcollection+json",
    })
    ApiResponse<NewDeviceRequestCollection> getNewDeviceRequestCollectionResourceWithHttpInfo(
            @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
            @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve a list of new device requests
     * Retrieve a list of new device requests. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getNewDeviceRequestCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetNewDeviceRequestCollectionResourceQueryParams} class
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
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return NewDeviceRequestCollection
     */
    @RequestLine("GET /devicecontrol/newDeviceRequests?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequestcollection+json",
    })
    NewDeviceRequestCollection getNewDeviceRequestCollectionResource(
            @QueryMap(encoded = true) GetNewDeviceRequestCollectionResourceQueryParams queryParams);

    /**
     * Retrieve a list of new device requests
     * Retrieve a list of new device requests. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getNewDeviceRequestCollectionResource</code> that receives the query
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
     *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
     *                    returned result will contain in the statistics object the
     *                    total number of pages. Only applicable on [range
     *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
     *                    (optional, default to false)</li>
     *                    </ul>
     * @return NewDeviceRequestCollection
     */
    @RequestLine("GET /devicecontrol/newDeviceRequests?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequestcollection+json",
    })
    ApiResponse<NewDeviceRequestCollection> getNewDeviceRequestCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetNewDeviceRequestCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getNewDeviceRequestCollectionResource</code> method in a fluent style.
     */
    public static class GetNewDeviceRequestCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetNewDeviceRequestCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetNewDeviceRequestCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetNewDeviceRequestCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetNewDeviceRequestCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific new device request
     * Retrieve a specific new device request (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ
     * &lt;/section&gt;
     * 
     * @param requestId Unique identifier of the new device request. (required)
     * @return NewDeviceRequest
     */
    @RequestLine("GET /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
    })
    NewDeviceRequest getNewDeviceRequestResource(@Param("requestId") String requestId);

    /**
     * Retrieve a specific new device request
     * Similar to <code>getNewDeviceRequestResource</code> but it also returns the
     * http response headers .
     * Retrieve a specific new device request (by a given ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_READ
     * &lt;/section&gt;
     * 
     * @param requestId Unique identifier of the new device request. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
    })
    ApiResponse<NewDeviceRequest> getNewDeviceRequestResourceWithHttpInfo(@Param("requestId") String requestId);

    /**
     * Create a new device request
     * Create a new device request. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
     * 
     * @param postNewDeviceRequestCollectionResourceRequest (required)
     * @param accept                                        Advertises which content
     *                                                      types, expressed as MIME
     *                                                      types, the client is
     *                                                      able to understand.
     *                                                      (optional)
     * @param xCumulocityProcessingMode                     Used to explicitly
     *                                                      control the processing
     *                                                      mode of the request. See
     *                                                      [Processing
     *                                                      mode](#processing-mode)
     *                                                      for more details.
     *                                                      (optional, default to
     *                                                      PERSISTENT)
     * @return NewDeviceRequest
     */
    @RequestLine("POST /devicecontrol/newDeviceRequests")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    NewDeviceRequest postNewDeviceRequestCollectionResource(
            PostNewDeviceRequestCollectionResourceRequest postNewDeviceRequestCollectionResourceRequest,
            @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Create a new device request
     * Similar to <code>postNewDeviceRequestCollectionResource</code> but it also
     * returns the http response headers .
     * Create a new device request. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
     * 
     * @param postNewDeviceRequestCollectionResourceRequest (required)
     * @param accept                                        Advertises which content
     *                                                      types, expressed as MIME
     *                                                      types, the client is
     *                                                      able to understand.
     *                                                      (optional)
     * @param xCumulocityProcessingMode                     Used to explicitly
     *                                                      control the processing
     *                                                      mode of the request. See
     *                                                      [Processing
     *                                                      mode](#processing-mode)
     *                                                      for more details.
     *                                                      (optional, default to
     *                                                      PERSISTENT)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /devicecontrol/newDeviceRequests")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<NewDeviceRequest> postNewDeviceRequestCollectionResourceWithHttpInfo(
            PostNewDeviceRequestCollectionResourceRequest postNewDeviceRequestCollectionResourceRequest,
            @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Update a specific new device request status
     * Update a specific new device request (by a given ID). You can only update its
     * status. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
     * 
     * @param requestId                          Unique identifier of the new device
     *                                           request. (required)
     * @param putNewDeviceRequestResourceRequest (required)
     * @param accept                             Advertises which content types,
     *                                           expressed as MIME types, the client
     *                                           is able to understand. (optional)
     * @return NewDeviceRequest
     */
    @RequestLine("PUT /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: {accept}"
    })
    NewDeviceRequest putNewDeviceRequestResource(@Param("requestId") String requestId,
            PutNewDeviceRequestResourceRequest putNewDeviceRequestResourceRequest, @Param("accept") String accept);

    /**
     * Update a specific new device request status
     * Similar to <code>putNewDeviceRequestResource</code> but it also returns the
     * http response headers .
     * Update a specific new device request (by a given ID). You can only update its
     * status. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
     * 
     * @param requestId                          Unique identifier of the new device
     *                                           request. (required)
     * @param putNewDeviceRequestResourceRequest (required)
     * @param accept                             Advertises which content types,
     *                                           expressed as MIME types, the client
     *                                           is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /devicecontrol/newDeviceRequests/{requestId}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.newdevicerequest+json",
            "Accept: {accept}"
    })
    ApiResponse<NewDeviceRequest> putNewDeviceRequestResourceWithHttpInfo(@Param("requestId") String requestId,
            PutNewDeviceRequestResourceRequest putNewDeviceRequestResourceRequest, @Param("accept") String accept);

}
