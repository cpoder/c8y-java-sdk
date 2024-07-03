package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Event;
import org.cpo.c8y.model.EventCollection;
import org.cpo.c8y.model.PostEventCollectionResourceRequest;
import org.cpo.c8y.model.PutEventResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface EventsApi extends ApiClient.Api {

  /**
   * Remove event collections
   * Remove event collections specified by query parameters. DELETE requests are
   * not synchronous. The response could be returned before the delete request has
   * been completed. This may happen especially when the deleted event has a lot
   * of associated data. After sending the request, the platform starts deleting
   * the associated data in an asynchronous way. Finally, the requested event is
   * deleted after all associated data has been deleted. &gt; **⚠️ Important:**
   * DELETE requires at least one of the following parameters: &#x60;source&#x60;,
   * &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;, &#x60;createdFrom&#x60;,
   * &#x60;createdTo&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param createdFrom               Start date or date and time of the
   *                                  event&#39;s creation (set by the platform
   *                                  during creation). (optional)
   * @param createdTo                 End date or date and time of the event&#39;s
   *                                  creation (set by the platform during
   *                                  creation). (optional)
   * @param dateFrom                  Start date or date and time of the event
   *                                  occurrence (provided by the device).
   *                                  (optional)
   * @param dateTo                    End date or date and time of the event
   *                                  occurrence (provided by the device).
   *                                  (optional)
   * @param fragmentType              A characteristic which identifies a managed
   *                                  object or event, for example, geolocation,
   *                                  electricity sensor, relay state. (optional)
   * @param source                    The managed object ID to which the event is
   *                                  associated. (optional)
   * @param type                      The type of event to search for. (optional)
   */
  @RequestLine("DELETE /event/events?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteEventCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("fragmentType") String fragmentType, @Param("source") String source, @Param("type") String type);

  /**
   * Remove event collections
   * Similar to <code>deleteEventCollectionResource</code> but it also returns the
   * http response headers .
   * Remove event collections specified by query parameters. DELETE requests are
   * not synchronous. The response could be returned before the delete request has
   * been completed. This may happen especially when the deleted event has a lot
   * of associated data. After sending the request, the platform starts deleting
   * the associated data in an asynchronous way. Finally, the requested event is
   * deleted after all associated data has been deleted. &gt; **⚠️ Important:**
   * DELETE requires at least one of the following parameters: &#x60;source&#x60;,
   * &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;, &#x60;createdFrom&#x60;,
   * &#x60;createdTo&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param createdFrom               Start date or date and time of the
   *                                  event&#39;s creation (set by the platform
   *                                  during creation). (optional)
   * @param createdTo                 End date or date and time of the event&#39;s
   *                                  creation (set by the platform during
   *                                  creation). (optional)
   * @param dateFrom                  Start date or date and time of the event
   *                                  occurrence (provided by the device).
   *                                  (optional)
   * @param dateTo                    End date or date and time of the event
   *                                  occurrence (provided by the device).
   *                                  (optional)
   * @param fragmentType              A characteristic which identifies a managed
   *                                  object or event, for example, geolocation,
   *                                  electricity sensor, relay state. (optional)
   * @param source                    The managed object ID to which the event is
   *                                  associated. (optional)
   * @param type                      The type of event to search for. (optional)
   */
  @RequestLine("DELETE /event/events?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteEventCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("fragmentType") String fragmentType, @Param("source") String source, @Param("type") String type);

  /**
   * Remove event collections
   * Remove event collections specified by query parameters. DELETE requests are
   * not synchronous. The response could be returned before the delete request has
   * been completed. This may happen especially when the deleted event has a lot
   * of associated data. After sending the request, the platform starts deleting
   * the associated data in an asynchronous way. Finally, the requested event is
   * deleted after all associated data has been deleted. &gt; **⚠️ Important:**
   * DELETE requires at least one of the following parameters: &#x60;source&#x60;,
   * &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;, &#x60;createdFrom&#x60;,
   * &#x60;createdTo&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteEventCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteEventCollectionResourceQueryParams} class that
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
   *                                  <li>createdFrom - Start date or date and
   *                                  time of the event&#39;s creation (set by the
   *                                  platform during creation). (optional)</li>
   *                                  <li>createdTo - End date or date and time of
   *                                  the event&#39;s creation (set by the
   *                                  platform during creation). (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the event occurrence (provided by the
   *                                  device). (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the event occurrence (provided by the
   *                                  device). (optional)</li>
   *                                  <li>fragmentType - A characteristic which
   *                                  identifies a managed object or event, for
   *                                  example, geolocation, electricity sensor,
   *                                  relay state. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the event is associated. (optional)</li>
   *                                  <li>type - The type of event to search for.
   *                                  (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /event/events?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteEventCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteEventCollectionResourceQueryParams queryParams);

  /**
   * Remove event collections
   * Remove event collections specified by query parameters. DELETE requests are
   * not synchronous. The response could be returned before the delete request has
   * been completed. This may happen especially when the deleted event has a lot
   * of associated data. After sending the request, the platform starts deleting
   * the associated data in an asynchronous way. Finally, the requested event is
   * deleted after all associated data has been deleted. &gt; **⚠️ Important:**
   * DELETE requires at least one of the following parameters: &#x60;source&#x60;,
   * &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;, &#x60;createdFrom&#x60;,
   * &#x60;createdTo&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteEventCollectionResource</code> that receives the query parameters
   * as a map,
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
   *                                  <li>createdFrom - Start date or date and
   *                                  time of the event&#39;s creation (set by the
   *                                  platform during creation). (optional)</li>
   *                                  <li>createdTo - End date or date and time of
   *                                  the event&#39;s creation (set by the
   *                                  platform during creation). (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the event occurrence (provided by the
   *                                  device). (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the event occurrence (provided by the
   *                                  device). (optional)</li>
   *                                  <li>fragmentType - A characteristic which
   *                                  identifies a managed object or event, for
   *                                  example, geolocation, electricity sensor,
   *                                  relay state. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the event is associated. (optional)</li>
   *                                  <li>type - The type of event to search for.
   *                                  (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /event/events?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteEventCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteEventCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteEventCollectionResource</code> method in a fluent style.
   */
  public static class DeleteEventCollectionResourceQueryParams extends HashMap<String, Object> {
    public DeleteEventCollectionResourceQueryParams createdFrom(final OffsetDateTime value) {
      put("createdFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams createdTo(final OffsetDateTime value) {
      put("createdTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams fragmentType(final String value) {
      put("fragmentType", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public DeleteEventCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a specific event
   * Remove a specific event by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the event. (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /event/events/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteEventResource(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific event
   * Similar to <code>deleteEventResource</code> but it also returns the http
   * response headers .
   * Remove a specific event by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the event. (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /event/events/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteEventResourceWithHttpInfo(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Retrieve all events
   * Retrieve all events on your tenant. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60; or
   * &#x60;createdFrom&#x60;–&#x60;createdTo&#x60;, the newest registered events
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;/section&gt;
   * 
   * @param createdFrom       Start date or date and time of the event&#39;s
   *                          creation (set by the platform during creation).
   *                          (optional)
   * @param createdTo         End date or date and time of the event&#39;s
   *                          creation (set by the platform during creation).
   *                          (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the event occurrence
   *                          (provided by the device). (optional)
   * @param dateTo            End date or date and time of the event occurrence
   *                          (provided by the device). (optional)
   * @param fragmentType      A characteristic which identifies a managed object
   *                          or event, for example, geolocation, electricity
   *                          sensor, relay state. (optional)
   * @param fragmentValue     Allows filtering events by the fragment&#39;s value,
   *                          but only when provided together with
   *                          &#x60;fragmentType&#x60;. &gt; **⚠️ Important:**
   *                          Only fragments with a string value are supported.
   *                          (optional)
   * @param lastUpdatedFrom   Start date or date and time of the last update made.
   *                          (optional)
   * @param lastUpdatedTo     End date or date and time of the last update made.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param revert            If you are using a range query (that is, at least
   *                          one of the &#x60;dateFrom&#x60; or
   *                          &#x60;dateTo&#x60; parameters is included in the
   *                          request), then setting &#x60;revert&#x3D;true&#x60;
   *                          will sort the results by the oldest events first. By
   *                          default, the results are sorted by the newest events
   *                          first. (optional, default to false)
   * @param source            The managed object ID to which the event is
   *                          associated. (optional)
   * @param type              The type of event to search for. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also events for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also events for related
   *                          source devices will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
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
   * @return EventCollection
   */
  @RequestLine("GET /event/events?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&fragmentValue={fragmentValue}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.eventcollection+json",
  })
  EventCollection getEventCollectionResource(@Param("createdFrom") OffsetDateTime createdFrom,
      @Param("createdTo") OffsetDateTime createdTo, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("fragmentType") String fragmentType, @Param("fragmentValue") String fragmentValue,
      @Param("lastUpdatedFrom") OffsetDateTime lastUpdatedFrom, @Param("lastUpdatedTo") OffsetDateTime lastUpdatedTo,
      @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert, @Param("source") String source,
      @Param("type") String type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all events
   * Similar to <code>getEventCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve all events on your tenant. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60; or
   * &#x60;createdFrom&#x60;–&#x60;createdTo&#x60;, the newest registered events
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;/section&gt;
   * 
   * @param createdFrom       Start date or date and time of the event&#39;s
   *                          creation (set by the platform during creation).
   *                          (optional)
   * @param createdTo         End date or date and time of the event&#39;s
   *                          creation (set by the platform during creation).
   *                          (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the event occurrence
   *                          (provided by the device). (optional)
   * @param dateTo            End date or date and time of the event occurrence
   *                          (provided by the device). (optional)
   * @param fragmentType      A characteristic which identifies a managed object
   *                          or event, for example, geolocation, electricity
   *                          sensor, relay state. (optional)
   * @param fragmentValue     Allows filtering events by the fragment&#39;s value,
   *                          but only when provided together with
   *                          &#x60;fragmentType&#x60;. &gt; **⚠️ Important:**
   *                          Only fragments with a string value are supported.
   *                          (optional)
   * @param lastUpdatedFrom   Start date or date and time of the last update made.
   *                          (optional)
   * @param lastUpdatedTo     End date or date and time of the last update made.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param revert            If you are using a range query (that is, at least
   *                          one of the &#x60;dateFrom&#x60; or
   *                          &#x60;dateTo&#x60; parameters is included in the
   *                          request), then setting &#x60;revert&#x3D;true&#x60;
   *                          will sort the results by the oldest events first. By
   *                          default, the results are sorted by the newest events
   *                          first. (optional, default to false)
   * @param source            The managed object ID to which the event is
   *                          associated. (optional)
   * @param type              The type of event to search for. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also events for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also events for related
   *                          source devices will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
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
  @RequestLine("GET /event/events?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&fragmentValue={fragmentValue}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.eventcollection+json",
  })
  ApiResponse<EventCollection> getEventCollectionResourceWithHttpInfo(@Param("createdFrom") OffsetDateTime createdFrom,
      @Param("createdTo") OffsetDateTime createdTo, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("fragmentType") String fragmentType, @Param("fragmentValue") String fragmentValue,
      @Param("lastUpdatedFrom") OffsetDateTime lastUpdatedFrom, @Param("lastUpdatedTo") OffsetDateTime lastUpdatedTo,
      @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert, @Param("source") String source,
      @Param("type") String type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all events
   * Retrieve all events on your tenant. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60; or
   * &#x60;createdFrom&#x60;–&#x60;createdTo&#x60;, the newest registered events
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other <code>getEventCollectionResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventCollectionResourceQueryParams} class that allows
   * for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>createdFrom - Start date or date and time of the
   *                    event&#39;s creation (set by the platform during
   *                    creation). (optional)</li>
   *                    <li>createdTo - End date or date and time of the
   *                    event&#39;s creation (set by the platform during
   *                    creation). (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the event
   *                    occurrence (provided by the device). (optional)</li>
   *                    <li>dateTo - End date or date and time of the event
   *                    occurrence (provided by the device). (optional)</li>
   *                    <li>fragmentType - A characteristic which identifies a
   *                    managed object or event, for example, geolocation,
   *                    electricity sensor, relay state. (optional)</li>
   *                    <li>fragmentValue - Allows filtering events by the
   *                    fragment&#39;s value, but only when provided together with
   *                    &#x60;fragmentType&#x60;. &gt; **⚠️ Important:** Only
   *                    fragments with a string value are supported.
   *                    (optional)</li>
   *                    <li>lastUpdatedFrom - Start date or date and time of the
   *                    last update made. (optional)</li>
   *                    <li>lastUpdatedTo - End date or date and time of the last
   *                    update made. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the oldest events first. By default, the
   *                    results are sorted by the newest events first. (optional,
   *                    default to false)</li>
   *                    <li>source - The managed object ID to which the event is
   *                    associated. (optional)</li>
   *                    <li>type - The type of event to search for.
   *                    (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    events for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    events for related source devices will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
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
   * @return EventCollection
   */
  @RequestLine("GET /event/events?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&fragmentValue={fragmentValue}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.eventcollection+json",
  })
  EventCollection getEventCollectionResource(
      @QueryMap(encoded = true) GetEventCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all events
   * Retrieve all events on your tenant. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60; or
   * &#x60;createdFrom&#x60;–&#x60;createdTo&#x60;, the newest registered events
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other <code>getEventCollectionResource</code>
   * that receives the query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>createdFrom - Start date or date and time of the
   *                    event&#39;s creation (set by the platform during
   *                    creation). (optional)</li>
   *                    <li>createdTo - End date or date and time of the
   *                    event&#39;s creation (set by the platform during
   *                    creation). (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the event
   *                    occurrence (provided by the device). (optional)</li>
   *                    <li>dateTo - End date or date and time of the event
   *                    occurrence (provided by the device). (optional)</li>
   *                    <li>fragmentType - A characteristic which identifies a
   *                    managed object or event, for example, geolocation,
   *                    electricity sensor, relay state. (optional)</li>
   *                    <li>fragmentValue - Allows filtering events by the
   *                    fragment&#39;s value, but only when provided together with
   *                    &#x60;fragmentType&#x60;. &gt; **⚠️ Important:** Only
   *                    fragments with a string value are supported.
   *                    (optional)</li>
   *                    <li>lastUpdatedFrom - Start date or date and time of the
   *                    last update made. (optional)</li>
   *                    <li>lastUpdatedTo - End date or date and time of the last
   *                    update made. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the oldest events first. By default, the
   *                    results are sorted by the newest events first. (optional,
   *                    default to false)</li>
   *                    <li>source - The managed object ID to which the event is
   *                    associated. (optional)</li>
   *                    <li>type - The type of event to search for.
   *                    (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    events for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    events for related source devices will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
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
   * @return EventCollection
   */
  @RequestLine("GET /event/events?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&fragmentValue={fragmentValue}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.eventcollection+json",
  })
  ApiResponse<EventCollection> getEventCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetEventCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventCollectionResource</code> method in a fluent style.
   */
  public static class GetEventCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetEventCollectionResourceQueryParams createdFrom(final OffsetDateTime value) {
      put("createdFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams createdTo(final OffsetDateTime value) {
      put("createdTo", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams fragmentType(final String value) {
      put("fragmentType", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams fragmentValue(final String value) {
      put("fragmentValue", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams lastUpdatedFrom(final OffsetDateTime value) {
      put("lastUpdatedFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams lastUpdatedTo(final OffsetDateTime value) {
      put("lastUpdatedTo", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams revert(final Boolean value) {
      put("revert", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams withSourceAssets(final Boolean value) {
      put("withSourceAssets", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams withSourceDevices(final Boolean value) {
      put("withSourceDevices", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetEventCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific event
   * Retrieve a specific event by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   * @return Event
   */
  @RequestLine("GET /event/events/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
  })
  Event getEventResource(@Param("id") String id);

  /**
   * Retrieve a specific event
   * Similar to <code>getEventResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific event by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_EVENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /event/events/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
  })
  ApiResponse<Event> getEventResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create an event
   * An event must be associated with a source (managed object) identified by an
   * ID.&lt;br&gt; In general, each event consists of: * A type to identify the
   * nature of the event. * A time stamp to indicate when the event was last
   * updated. * A description of the event. * The managed object which originated
   * the event. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param postEventCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @param xCumulocityProcessingMode          Used to explicitly control the
   *                                           processing mode of the request. See
   *                                           [Processing mode](#processing-mode)
   *                                           for more details. (optional,
   *                                           default to PERSISTENT)
   * @return Event
   */
  @RequestLine("POST /event/events")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.event+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Event postEventCollectionResource(PostEventCollectionResourceRequest postEventCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create an event
   * Similar to <code>postEventCollectionResource</code> but it also returns the
   * http response headers .
   * An event must be associated with a source (managed object) identified by an
   * ID.&lt;br&gt; In general, each event consists of: * A type to identify the
   * nature of the event. * A time stamp to indicate when the event was last
   * updated. * A description of the event. * The managed object which originated
   * the event. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param postEventCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @param xCumulocityProcessingMode          Used to explicitly control the
   *                                           processing mode of the request. See
   *                                           [Processing mode](#processing-mode)
   *                                           for more details. (optional,
   *                                           default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /event/events")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.event+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Event> postEventCollectionResourceWithHttpInfo(
      PostEventCollectionResourceRequest postEventCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific event
   * Update a specific event by a given ID. Only its text description and custom
   * fragments can be updated. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the event. (required)
   * @param putEventResourceRequest   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return Event
   */
  @RequestLine("PUT /event/events/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.event+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Event putEventResource(@Param("id") String id, PutEventResourceRequest putEventResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific event
   * Similar to <code>putEventResource</code> but it also returns the http
   * response headers .
   * Update a specific event by a given ID. Only its text description and custom
   * fragments can be updated. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the event. (required)
   * @param putEventResourceRequest   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /event/events/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.event+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.event+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Event> putEventResourceWithHttpInfo(@Param("id") String id,
      PutEventResourceRequest putEventResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
