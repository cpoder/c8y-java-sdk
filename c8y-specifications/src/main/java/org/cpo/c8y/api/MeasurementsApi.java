package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Measurement;
import org.cpo.c8y.model.MeasurementCollection;
import org.cpo.c8y.model.MeasurementSeries;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface MeasurementsApi extends ApiClient.Api {

  /**
   * Remove measurement collections
   * Remove measurement collections specified by query parameters. DELETE requests
   * are not synchronous. The response could be returned before the delete request
   * has been completed. This may happen especially when there are a lot of
   * measurements to be deleted. &gt; **⚠️ Important:** DELETE requires at least
   * one of the following parameters: &#x60;source&#x60;, &#x60;dateFrom&#x60;,
   * &#x60;dateTo&#x60;. In case of enhanced time series measurements, both
   * &#x60;dateFrom&#x60; and &#x60;dateTo&#x60; parameters must be truncated to
   * full hours (for example, 2022-08-19T14:00:00.000Z), otherwise an error will
   * be returned. The &#x60;fragmentType&#x60; parameter allows to delete
   * measurements only by a measurement fragment when enhanced time series
   * measurements are used. It&#39;s not possible to delete by a custom
   * (non-measurement) fragment. Example for a valid measurement value fragment:
   * &#x60;&#x60;&#x60; \&quot;c8y_TemperatureMeasurement\&quot;: {
   * \&quot;T\&quot;: { \&quot;value\&quot;: 28, \&quot;unit\&quot;:
   * \&quot;C\&quot; } } &#x60;&#x60;&#x60; In the example above
   * &#x60;c8y_TemperatureMeasurement&#x60; is called fragment and &#x60;T&#x60;
   * is called series. Example for a non-measurement fragment: &#x60;&#x60;&#x60;
   * \&quot;c8y_TemperatureMeasurement\&quot;: 28 &#x60;&#x60;&#x60; Enhanced Time
   * series measurements will not allow to delete by fragment specific like above.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param dateFrom                  Start date or date and time of the
   *                                  measurement. (optional)
   * @param dateTo                    End date or date and time of the
   *                                  measurement. (optional)
   * @param fragmentType              A characteristic which identifies a managed
   *                                  object or event, for example, geolocation,
   *                                  electricity sensor, relay state. (optional)
   * @param source                    The managed object ID to which the
   *                                  measurement is associated. (optional)
   * @param type                      The type of measurement to search for.
   *                                  (optional)
   */
  @RequestLine("DELETE /measurement/measurements?dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteMeasurementCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("fragmentType") String fragmentType, @Param("source") String source, @Param("type") String type);

  /**
   * Remove measurement collections
   * Similar to <code>deleteMeasurementCollectionResource</code> but it also
   * returns the http response headers .
   * Remove measurement collections specified by query parameters. DELETE requests
   * are not synchronous. The response could be returned before the delete request
   * has been completed. This may happen especially when there are a lot of
   * measurements to be deleted. &gt; **⚠️ Important:** DELETE requires at least
   * one of the following parameters: &#x60;source&#x60;, &#x60;dateFrom&#x60;,
   * &#x60;dateTo&#x60;. In case of enhanced time series measurements, both
   * &#x60;dateFrom&#x60; and &#x60;dateTo&#x60; parameters must be truncated to
   * full hours (for example, 2022-08-19T14:00:00.000Z), otherwise an error will
   * be returned. The &#x60;fragmentType&#x60; parameter allows to delete
   * measurements only by a measurement fragment when enhanced time series
   * measurements are used. It&#39;s not possible to delete by a custom
   * (non-measurement) fragment. Example for a valid measurement value fragment:
   * &#x60;&#x60;&#x60; \&quot;c8y_TemperatureMeasurement\&quot;: {
   * \&quot;T\&quot;: { \&quot;value\&quot;: 28, \&quot;unit\&quot;:
   * \&quot;C\&quot; } } &#x60;&#x60;&#x60; In the example above
   * &#x60;c8y_TemperatureMeasurement&#x60; is called fragment and &#x60;T&#x60;
   * is called series. Example for a non-measurement fragment: &#x60;&#x60;&#x60;
   * \&quot;c8y_TemperatureMeasurement\&quot;: 28 &#x60;&#x60;&#x60; Enhanced Time
   * series measurements will not allow to delete by fragment specific like above.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param dateFrom                  Start date or date and time of the
   *                                  measurement. (optional)
   * @param dateTo                    End date or date and time of the
   *                                  measurement. (optional)
   * @param fragmentType              A characteristic which identifies a managed
   *                                  object or event, for example, geolocation,
   *                                  electricity sensor, relay state. (optional)
   * @param source                    The managed object ID to which the
   *                                  measurement is associated. (optional)
   * @param type                      The type of measurement to search for.
   *                                  (optional)
   */
  @RequestLine("DELETE /measurement/measurements?dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteMeasurementCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("fragmentType") String fragmentType,
      @Param("source") String source, @Param("type") String type);

  /**
   * Remove measurement collections
   * Remove measurement collections specified by query parameters. DELETE requests
   * are not synchronous. The response could be returned before the delete request
   * has been completed. This may happen especially when there are a lot of
   * measurements to be deleted. &gt; **⚠️ Important:** DELETE requires at least
   * one of the following parameters: &#x60;source&#x60;, &#x60;dateFrom&#x60;,
   * &#x60;dateTo&#x60;. In case of enhanced time series measurements, both
   * &#x60;dateFrom&#x60; and &#x60;dateTo&#x60; parameters must be truncated to
   * full hours (for example, 2022-08-19T14:00:00.000Z), otherwise an error will
   * be returned. The &#x60;fragmentType&#x60; parameter allows to delete
   * measurements only by a measurement fragment when enhanced time series
   * measurements are used. It&#39;s not possible to delete by a custom
   * (non-measurement) fragment. Example for a valid measurement value fragment:
   * &#x60;&#x60;&#x60; \&quot;c8y_TemperatureMeasurement\&quot;: {
   * \&quot;T\&quot;: { \&quot;value\&quot;: 28, \&quot;unit\&quot;:
   * \&quot;C\&quot; } } &#x60;&#x60;&#x60; In the example above
   * &#x60;c8y_TemperatureMeasurement&#x60; is called fragment and &#x60;T&#x60;
   * is called series. Example for a non-measurement fragment: &#x60;&#x60;&#x60;
   * \&quot;c8y_TemperatureMeasurement\&quot;: 28 &#x60;&#x60;&#x60; Enhanced Time
   * series measurements will not allow to delete by fragment specific like above.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteMeasurementCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMeasurementCollectionResourceQueryParams} class
   * that allows for
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
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the measurement. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the measurement. (optional)</li>
   *                                  <li>fragmentType - A characteristic which
   *                                  identifies a managed object or event, for
   *                                  example, geolocation, electricity sensor,
   *                                  relay state. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the measurement is associated.
   *                                  (optional)</li>
   *                                  <li>type - The type of measurement to search
   *                                  for. (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /measurement/measurements?dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteMeasurementCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteMeasurementCollectionResourceQueryParams queryParams);

  /**
   * Remove measurement collections
   * Remove measurement collections specified by query parameters. DELETE requests
   * are not synchronous. The response could be returned before the delete request
   * has been completed. This may happen especially when there are a lot of
   * measurements to be deleted. &gt; **⚠️ Important:** DELETE requires at least
   * one of the following parameters: &#x60;source&#x60;, &#x60;dateFrom&#x60;,
   * &#x60;dateTo&#x60;. In case of enhanced time series measurements, both
   * &#x60;dateFrom&#x60; and &#x60;dateTo&#x60; parameters must be truncated to
   * full hours (for example, 2022-08-19T14:00:00.000Z), otherwise an error will
   * be returned. The &#x60;fragmentType&#x60; parameter allows to delete
   * measurements only by a measurement fragment when enhanced time series
   * measurements are used. It&#39;s not possible to delete by a custom
   * (non-measurement) fragment. Example for a valid measurement value fragment:
   * &#x60;&#x60;&#x60; \&quot;c8y_TemperatureMeasurement\&quot;: {
   * \&quot;T\&quot;: { \&quot;value\&quot;: 28, \&quot;unit\&quot;:
   * \&quot;C\&quot; } } &#x60;&#x60;&#x60; In the example above
   * &#x60;c8y_TemperatureMeasurement&#x60; is called fragment and &#x60;T&#x60;
   * is called series. Example for a non-measurement fragment: &#x60;&#x60;&#x60;
   * \&quot;c8y_TemperatureMeasurement\&quot;: 28 &#x60;&#x60;&#x60; Enhanced Time
   * series measurements will not allow to delete by fragment specific like above.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteMeasurementCollectionResource</code> that receives the query
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
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the measurement. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the measurement. (optional)</li>
   *                                  <li>fragmentType - A characteristic which
   *                                  identifies a managed object or event, for
   *                                  example, geolocation, electricity sensor,
   *                                  relay state. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the measurement is associated.
   *                                  (optional)</li>
   *                                  <li>type - The type of measurement to search
   *                                  for. (optional)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /measurement/measurements?dateFrom={dateFrom}&dateTo={dateTo}&fragmentType={fragmentType}&source={source}&type={type}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteMeasurementCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteMeasurementCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteMeasurementCollectionResource</code> method in a fluent style.
   */
  public static class DeleteMeasurementCollectionResourceQueryParams extends HashMap<String, Object> {
    public DeleteMeasurementCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteMeasurementCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteMeasurementCollectionResourceQueryParams fragmentType(final String value) {
      put("fragmentType", EncodingUtils.encode(value));
      return this;
    }

    public DeleteMeasurementCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public DeleteMeasurementCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove a specific measurement
   * Remove a specific measurement by a given ID. Note that you cannot delete time
   * series measurements by ID. Instead, you can delete by query or use the
   * retention rules to remove expired measurements data from the Operational
   * Store. No behavior changes for tenants which do not have time series enabled.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MEASUREMENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the measurement.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /measurement/measurements/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteMeasurementResource(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Remove a specific measurement
   * Similar to <code>deleteMeasurementResource</code> but it also returns the
   * http response headers .
   * Remove a specific measurement by a given ID. Note that you cannot delete time
   * series measurements by ID. Instead, you can delete by query or use the
   * retention rules to remove expired measurements data from the Operational
   * Store. No behavior changes for tenants which do not have time series enabled.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt;
   * MEASUREMENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the measurement.
   *                                  (required)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   */
  @RequestLine("DELETE /measurement/measurements/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteMeasurementResourceWithHttpInfo(@Param("id") String id,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Retrieve all measurements
   * Retrieve all measurements on your tenant, or a specific subset based on
   * queries. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60;, the oldest registered measurements
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. For large measurement collections,
   * querying older records without filters can be slow as the server needs to
   * scan from the beginning of the input results set before beginning to return
   * the results. For cases when older measurements should be retrieved, it is
   * recommended to narrow the scope by using range queries based on the time
   * stamp reported by a device. The scope of query can also be reduced
   * significantly when a source device is provided. Review [Measurements
   * Specifics](#tag/Measurements-specifics) for details about data streaming and
   * response formats. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;/section&gt;
   * 
   * @param currentPage         The current page of the paginated results.
   *                            (optional, default to 1)
   * @param dateFrom            Start date or date and time of the measurement.
   *                            (optional)
   * @param dateTo              End date or date and time of the measurement.
   *                            (optional)
   * @param pageSize            Indicates how many entries of the collection shall
   *                            be returned. The upper limit for one page is 2,000
   *                            objects. (optional, default to 5)
   * @param revert              If you are using a range query (that is, at least
   *                            one of the &#x60;dateFrom&#x60; or
   *                            &#x60;dateTo&#x60; parameters is included in the
   *                            request), then setting
   *                            &#x60;revert&#x3D;true&#x60; will sort the results
   *                            by the newest measurements first. By default, the
   *                            results are sorted by the oldest measurements
   *                            first. (optional, default to false)
   * @param source              The managed object ID to which the measurement is
   *                            associated. (optional)
   * @param type                The type of measurement to search for. (optional)
   * @param valueFragmentSeries The specific series to search for. (optional)
   * @param valueFragmentType   A characteristic which identifies the measurement.
   *                            (optional)
   * @param withTotalElements   When set to &#x60;true&#x60;, the returned result
   *                            will contain in the statistics object the total
   *                            number of elements. Only applicable on [range
   *                            queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                            (optional, default to false)
   * @param withTotalPages      When set to &#x60;true&#x60;, the returned result
   *                            will contain in the statistics object the total
   *                            number of pages. Only applicable on [range
   *                            queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                            (optional, default to false)
   * @return MeasurementCollection
   */
  @RequestLine("GET /measurement/measurements?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&valueFragmentSeries={valueFragmentSeries}&valueFragmentType={valueFragmentType}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
  })
  MeasurementCollection getMeasurementCollectionResource(@Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert, @Param("source") String source,
      @Param("type") String type, @Param("valueFragmentSeries") String valueFragmentSeries,
      @Param("valueFragmentType") String valueFragmentType, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all measurements
   * Similar to <code>getMeasurementCollectionResource</code> but it also returns
   * the http response headers .
   * Retrieve all measurements on your tenant, or a specific subset based on
   * queries. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60;, the oldest registered measurements
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. For large measurement collections,
   * querying older records without filters can be slow as the server needs to
   * scan from the beginning of the input results set before beginning to return
   * the results. For cases when older measurements should be retrieved, it is
   * recommended to narrow the scope by using range queries based on the time
   * stamp reported by a device. The scope of query can also be reduced
   * significantly when a source device is provided. Review [Measurements
   * Specifics](#tag/Measurements-specifics) for details about data streaming and
   * response formats. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;/section&gt;
   * 
   * @param currentPage         The current page of the paginated results.
   *                            (optional, default to 1)
   * @param dateFrom            Start date or date and time of the measurement.
   *                            (optional)
   * @param dateTo              End date or date and time of the measurement.
   *                            (optional)
   * @param pageSize            Indicates how many entries of the collection shall
   *                            be returned. The upper limit for one page is 2,000
   *                            objects. (optional, default to 5)
   * @param revert              If you are using a range query (that is, at least
   *                            one of the &#x60;dateFrom&#x60; or
   *                            &#x60;dateTo&#x60; parameters is included in the
   *                            request), then setting
   *                            &#x60;revert&#x3D;true&#x60; will sort the results
   *                            by the newest measurements first. By default, the
   *                            results are sorted by the oldest measurements
   *                            first. (optional, default to false)
   * @param source              The managed object ID to which the measurement is
   *                            associated. (optional)
   * @param type                The type of measurement to search for. (optional)
   * @param valueFragmentSeries The specific series to search for. (optional)
   * @param valueFragmentType   A characteristic which identifies the measurement.
   *                            (optional)
   * @param withTotalElements   When set to &#x60;true&#x60;, the returned result
   *                            will contain in the statistics object the total
   *                            number of elements. Only applicable on [range
   *                            queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                            (optional, default to false)
   * @param withTotalPages      When set to &#x60;true&#x60;, the returned result
   *                            will contain in the statistics object the total
   *                            number of pages. Only applicable on [range
   *                            queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                            (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /measurement/measurements?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&valueFragmentSeries={valueFragmentSeries}&valueFragmentType={valueFragmentType}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
  })
  ApiResponse<MeasurementCollection> getMeasurementCollectionResourceWithHttpInfo(
      @Param("currentPage") Integer currentPage, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("pageSize") Integer pageSize, @Param("revert") Boolean revert,
      @Param("source") String source, @Param("type") String type,
      @Param("valueFragmentSeries") String valueFragmentSeries, @Param("valueFragmentType") String valueFragmentType,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all measurements
   * Retrieve all measurements on your tenant, or a specific subset based on
   * queries. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60;, the oldest registered measurements
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. For large measurement collections,
   * querying older records without filters can be slow as the server needs to
   * scan from the beginning of the input results set before beginning to return
   * the results. For cases when older measurements should be retrieved, it is
   * recommended to narrow the scope by using range queries based on the time
   * stamp reported by a device. The scope of query can also be reduced
   * significantly when a source device is provided. Review [Measurements
   * Specifics](#tag/Measurements-specifics) for details about data streaming and
   * response formats. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getMeasurementCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMeasurementCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the
   *                    measurement. (optional)</li>
   *                    <li>dateTo - End date or date and time of the measurement.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest measurements first. By default, the
   *                    results are sorted by the oldest measurements first.
   *                    (optional, default to false)</li>
   *                    <li>source - The managed object ID to which the
   *                    measurement is associated. (optional)</li>
   *                    <li>type - The type of measurement to search for.
   *                    (optional)</li>
   *                    <li>valueFragmentSeries - The specific series to search
   *                    for. (optional)</li>
   *                    <li>valueFragmentType - A characteristic which identifies
   *                    the measurement. (optional)</li>
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
   * @return MeasurementCollection
   */
  @RequestLine("GET /measurement/measurements?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&valueFragmentSeries={valueFragmentSeries}&valueFragmentType={valueFragmentType}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
  })
  MeasurementCollection getMeasurementCollectionResource(
      @QueryMap(encoded = true) GetMeasurementCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all measurements
   * Retrieve all measurements on your tenant, or a specific subset based on
   * queries. In case of executing [range
   * queries](https://en.wikipedia.org/wiki/Range_query_(database)) between an
   * upper and lower boundary, for example, querying using
   * &#x60;dateFrom&#x60;–&#x60;dateTo&#x60;, the oldest registered measurements
   * are returned first. It is possible to change the order using the query
   * parameter &#x60;revert&#x3D;true&#x60;. For large measurement collections,
   * querying older records without filters can be slow as the server needs to
   * scan from the beginning of the input results set before beginning to return
   * the results. For cases when older measurements should be retrieved, it is
   * recommended to narrow the scope by using range queries based on the time
   * stamp reported by a device. The scope of query can also be reduced
   * significantly when a source device is provided. Review [Measurements
   * Specifics](#tag/Measurements-specifics) for details about data streaming and
   * response formats. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getMeasurementCollectionResource</code> that receives the query
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
   *                    <li>dateFrom - Start date or date and time of the
   *                    measurement. (optional)</li>
   *                    <li>dateTo - End date or date and time of the measurement.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest measurements first. By default, the
   *                    results are sorted by the oldest measurements first.
   *                    (optional, default to false)</li>
   *                    <li>source - The managed object ID to which the
   *                    measurement is associated. (optional)</li>
   *                    <li>type - The type of measurement to search for.
   *                    (optional)</li>
   *                    <li>valueFragmentSeries - The specific series to search
   *                    for. (optional)</li>
   *                    <li>valueFragmentType - A characteristic which identifies
   *                    the measurement. (optional)</li>
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
   * @return MeasurementCollection
   */
  @RequestLine("GET /measurement/measurements?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&revert={revert}&source={source}&type={type}&valueFragmentSeries={valueFragmentSeries}&valueFragmentType={valueFragmentType}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
  })
  ApiResponse<MeasurementCollection> getMeasurementCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetMeasurementCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getMeasurementCollectionResource</code> method in a fluent style.
   */
  public static class GetMeasurementCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetMeasurementCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams revert(final Boolean value) {
      put("revert", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams valueFragmentSeries(final String value) {
      put("valueFragmentSeries", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams valueFragmentType(final String value) {
      put("valueFragmentType", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific measurement
   * Retrieve a specific measurement by a given ID. Note that you cannot retrieve
   * time series measurements by ID. Instead you can search for such measurements
   * via query parameters. No behavior changes for tenants which do not have time
   * series enabled. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the measurement. (required)
   * @return Measurement
   */
  @RequestLine("GET /measurement/measurements/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurement+json",
  })
  Measurement getMeasurementResource(@Param("id") String id);

  /**
   * Retrieve a specific measurement
   * Similar to <code>getMeasurementResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific measurement by a given ID. Note that you cannot retrieve
   * time series measurements by ID. Instead you can search for such measurements
   * via query parameters. No behavior changes for tenants which do not have time
   * series enabled. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the measurement. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /measurement/measurements/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurement+json",
  })
  ApiResponse<Measurement> getMeasurementResourceWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve a list of series and their values
   * Retrieve a list of series (all or only those matching the specified names)
   * and their values within a given period of a specific managed object
   * (source).&lt;br&gt; A series is any fragment in measurement that contains a
   * &#x60;value&#x60; property. It is possible to fetch aggregated results using
   * the &#x60;aggregationType&#x60; parameter. If the aggregation is not
   * specified, the result will contain no more than 5000 values. &gt; **⚠️
   * Important:** For the aggregation to be done correctly, a device shall always
   * use the same time zone when it sends dates. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param dateFrom        Start date or date and time of the measurement.
   *                        (required)
   * @param dateTo          End date or date and time of the measurement.
   *                        (required)
   * @param source          The managed object ID to which the measurement is
   *                        associated. (required)
   * @param aggregationType Fetch aggregated results as specified. (optional)
   * @param revert          If you are using a range query (that is, at least one
   *                        of the &#x60;dateFrom&#x60; or &#x60;dateTo&#x60;
   *                        parameters is included in the request), then setting
   *                        &#x60;revert&#x3D;true&#x60; will sort the results by
   *                        the newest measurements first. By default, the results
   *                        are sorted by the oldest measurements first.
   *                        (optional, default to false)
   * @param series          The specific series to search for. &gt;**&amp;#9432;
   *                        Info:** If you query for multiple series at once,
   *                        comma-separate the values. (optional)
   * @return MeasurementSeries
   */
  @RequestLine("GET /measurement/measurements/series?aggregationType={aggregationType}&dateFrom={dateFrom}&dateTo={dateTo}&revert={revert}&series={series}&source={source}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  MeasurementSeries getMeasurementSeriesResource(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("source") String source,
      @Param("aggregationType") String aggregationType, @Param("revert") Boolean revert,
      @Param("series") List<String> series);

  /**
   * Retrieve a list of series and their values
   * Similar to <code>getMeasurementSeriesResource</code> but it also returns the
   * http response headers .
   * Retrieve a list of series (all or only those matching the specified names)
   * and their values within a given period of a specific managed object
   * (source).&lt;br&gt; A series is any fragment in measurement that contains a
   * &#x60;value&#x60; property. It is possible to fetch aggregated results using
   * the &#x60;aggregationType&#x60; parameter. If the aggregation is not
   * specified, the result will contain no more than 5000 values. &gt; **⚠️
   * Important:** For the aggregation to be done correctly, a device shall always
   * use the same time zone when it sends dates. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * 
   * @param dateFrom        Start date or date and time of the measurement.
   *                        (required)
   * @param dateTo          End date or date and time of the measurement.
   *                        (required)
   * @param source          The managed object ID to which the measurement is
   *                        associated. (required)
   * @param aggregationType Fetch aggregated results as specified. (optional)
   * @param revert          If you are using a range query (that is, at least one
   *                        of the &#x60;dateFrom&#x60; or &#x60;dateTo&#x60;
   *                        parameters is included in the request), then setting
   *                        &#x60;revert&#x3D;true&#x60; will sort the results by
   *                        the newest measurements first. By default, the results
   *                        are sorted by the oldest measurements first.
   *                        (optional, default to false)
   * @param series          The specific series to search for. &gt;**&amp;#9432;
   *                        Info:** If you query for multiple series at once,
   *                        comma-separate the values. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /measurement/measurements/series?aggregationType={aggregationType}&dateFrom={dateFrom}&dateTo={dateTo}&revert={revert}&series={series}&source={source}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<MeasurementSeries> getMeasurementSeriesResourceWithHttpInfo(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("source") String source,
      @Param("aggregationType") String aggregationType, @Param("revert") Boolean revert,
      @Param("series") List<String> series);

  /**
   * Retrieve a list of series and their values
   * Retrieve a list of series (all or only those matching the specified names)
   * and their values within a given period of a specific managed object
   * (source).&lt;br&gt; A series is any fragment in measurement that contains a
   * &#x60;value&#x60; property. It is possible to fetch aggregated results using
   * the &#x60;aggregationType&#x60; parameter. If the aggregation is not
   * specified, the result will contain no more than 5000 values. &gt; **⚠️
   * Important:** For the aggregation to be done correctly, a device shall always
   * use the same time zone when it sends dates. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getMeasurementSeriesResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetMeasurementSeriesResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>aggregationType - Fetch aggregated results as
   *                    specified. (optional)</li>
   *                    <li>dateFrom - Start date or date and time of the
   *                    measurement. (required)</li>
   *                    <li>dateTo - End date or date and time of the measurement.
   *                    (required)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest measurements first. By default, the
   *                    results are sorted by the oldest measurements first.
   *                    (optional, default to false)</li>
   *                    <li>series - The specific series to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple series
   *                    at once, comma-separate the values. (optional)</li>
   *                    <li>source - The managed object ID to which the
   *                    measurement is associated. (required)</li>
   *                    </ul>
   * @return MeasurementSeries
   */
  @RequestLine("GET /measurement/measurements/series?aggregationType={aggregationType}&dateFrom={dateFrom}&dateTo={dateTo}&revert={revert}&series={series}&source={source}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  MeasurementSeries getMeasurementSeriesResource(
      @QueryMap(encoded = true) GetMeasurementSeriesResourceQueryParams queryParams);

  /**
   * Retrieve a list of series and their values
   * Retrieve a list of series (all or only those matching the specified names)
   * and their values within a given period of a specific managed object
   * (source).&lt;br&gt; A series is any fragment in measurement that contains a
   * &#x60;value&#x60; property. It is possible to fetch aggregated results using
   * the &#x60;aggregationType&#x60; parameter. If the aggregation is not
   * specified, the result will contain no more than 5000 values. &gt; **⚠️
   * Important:** For the aggregation to be done correctly, a device shall always
   * use the same time zone when it sends dates. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_READ permission on the source
   * &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getMeasurementSeriesResource</code> that receives the query parameters
   * as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>aggregationType - Fetch aggregated results as
   *                    specified. (optional)</li>
   *                    <li>dateFrom - Start date or date and time of the
   *                    measurement. (required)</li>
   *                    <li>dateTo - End date or date and time of the measurement.
   *                    (required)</li>
   *                    <li>revert - If you are using a range query (that is, at
   *                    least one of the &#x60;dateFrom&#x60; or
   *                    &#x60;dateTo&#x60; parameters is included in the request),
   *                    then setting &#x60;revert&#x3D;true&#x60; will sort the
   *                    results by the newest measurements first. By default, the
   *                    results are sorted by the oldest measurements first.
   *                    (optional, default to false)</li>
   *                    <li>series - The specific series to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple series
   *                    at once, comma-separate the values. (optional)</li>
   *                    <li>source - The managed object ID to which the
   *                    measurement is associated. (required)</li>
   *                    </ul>
   * @return MeasurementSeries
   */
  @RequestLine("GET /measurement/measurements/series?aggregationType={aggregationType}&dateFrom={dateFrom}&dateTo={dateTo}&revert={revert}&series={series}&source={source}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<MeasurementSeries> getMeasurementSeriesResourceWithHttpInfo(
      @QueryMap(encoded = true) GetMeasurementSeriesResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getMeasurementSeriesResource</code> method in a fluent style.
   */
  public static class GetMeasurementSeriesResourceQueryParams extends HashMap<String, Object> {
    public GetMeasurementSeriesResourceQueryParams aggregationType(final String value) {
      put("aggregationType", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementSeriesResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementSeriesResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementSeriesResourceQueryParams revert(final Boolean value) {
      put("revert", EncodingUtils.encode(value));
      return this;
    }

    public GetMeasurementSeriesResourceQueryParams series(final List<String> value) {
      put("series", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetMeasurementSeriesResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create a measurement
   * A measurement must be associated with a source (managed object) identified by
   * ID, and must specify the type of measurement and the time when it was
   * measured by the device (for example, a thermometer). Each measurement
   * fragment is an object (for example, &#x60;c8y_Steam&#x60;) containing the
   * actual measurements as properties. The property name represents the name of
   * the measurement (for example, &#x60;Temperature&#x60;) and it contains two
   * properties: * &#x60;value&#x60; - The value of the individual measurement.
   * The maximum precision for floating point numbers is 64-bit IEEE 754. For
   * integers it&#39;s a 64-bit two&#39;s complement integer. The
   * &#x60;value&#x60; is mandatory for a fragment. * &#x60;unit&#x60; - The unit
   * of the measurements. Review the [System of units](#section/System-of-units)
   * section for details about the conversions of units. Also review [Getting
   * started &gt; Technical concepts &gt; Cumulocity IoT&#39;s domain model &gt;
   * Inventory &gt; Fragments &gt; Naming conventions of
   * fragments](https://cumulocity.com/docs/concepts/domain-model/#naming-conventions-of-fragments)
   * in the Cumulocity IoT user documentation. The example below uses
   * &#x60;c8y_Steam&#x60; in the request body to illustrate a fragment for
   * recording temperature measurements. &gt; **⚠️ Important:** Property names
   * used for fragment and series must not contain whitespaces nor the special
   * characters &#x60;. , * [ ] ( ) @ $&#x60;. This is required to ensure a
   * correct processing and visualization of measurement series on UI graphs. ###
   * Create multiple measurements It is also possible to create multiple
   * measurements at once by sending a &#x60;measurements&#x60; array containing
   * all the measurements to be created. The content type must be
   * &#x60;application/vnd.com.nsn.cumulocity.measurementcollection+json&#x60;.
   * &gt; **&amp;#9432; Info:** For more details about fragments with specific
   * meanings, review the sections [Device management
   * library](#section/Device-management-library) and [Sensor
   * library](#section/Sensor-library). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param measurement               (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return Measurement
   */
  @RequestLine("POST /measurement/measurements")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.measurement+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurement+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Measurement postMeasurementCollectionResource(Measurement measurement, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create a measurement
   * Similar to <code>postMeasurementCollectionResource</code> but it also returns
   * the http response headers .
   * A measurement must be associated with a source (managed object) identified by
   * ID, and must specify the type of measurement and the time when it was
   * measured by the device (for example, a thermometer). Each measurement
   * fragment is an object (for example, &#x60;c8y_Steam&#x60;) containing the
   * actual measurements as properties. The property name represents the name of
   * the measurement (for example, &#x60;Temperature&#x60;) and it contains two
   * properties: * &#x60;value&#x60; - The value of the individual measurement.
   * The maximum precision for floating point numbers is 64-bit IEEE 754. For
   * integers it&#39;s a 64-bit two&#39;s complement integer. The
   * &#x60;value&#x60; is mandatory for a fragment. * &#x60;unit&#x60; - The unit
   * of the measurements. Review the [System of units](#section/System-of-units)
   * section for details about the conversions of units. Also review [Getting
   * started &gt; Technical concepts &gt; Cumulocity IoT&#39;s domain model &gt;
   * Inventory &gt; Fragments &gt; Naming conventions of
   * fragments](https://cumulocity.com/docs/concepts/domain-model/#naming-conventions-of-fragments)
   * in the Cumulocity IoT user documentation. The example below uses
   * &#x60;c8y_Steam&#x60; in the request body to illustrate a fragment for
   * recording temperature measurements. &gt; **⚠️ Important:** Property names
   * used for fragment and series must not contain whitespaces nor the special
   * characters &#x60;. , * [ ] ( ) @ $&#x60;. This is required to ensure a
   * correct processing and visualization of measurement series on UI graphs. ###
   * Create multiple measurements It is also possible to create multiple
   * measurements at once by sending a &#x60;measurements&#x60; array containing
   * all the measurements to be created. The content type must be
   * &#x60;application/vnd.com.nsn.cumulocity.measurementcollection+json&#x60;.
   * &gt; **&amp;#9432; Info:** For more details about fragments with specific
   * meanings, review the sections [Device management
   * library](#section/Device-management-library) and [Sensor
   * library](#section/Sensor-library). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_MEASUREMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the
   * source &lt;b&gt;OR&lt;/b&gt; MEASUREMENT_ADMIN permission on the source
   * &lt;/section&gt;
   * 
   * @param measurement               (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /measurement/measurements")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.measurement+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.measurement+json,application/vnd.com.nsn.cumulocity.measurementcollection+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Measurement> postMeasurementCollectionResourceWithHttpInfo(Measurement measurement,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
