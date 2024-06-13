package org.cpo.c8y.api;

import java.time.LocalDate;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.DeviceStatisticsCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface DeviceStatisticsApi extends ApiClient.Api {

  /**
   * Retrieve daily device statistics
   * Retrieve daily device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param date           Date (format YYYY-MM-dd) of the queried day. (required)
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param deviceId       The ID of the device to search for. (optional)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/daily/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  DeviceStatisticsCollection getTenantDeviceStatisticsDailyCollection(@Param("tenantId") String tenantId,
      @Param("date") LocalDate date, @Param("currentPage") Integer currentPage, @Param("deviceId") String deviceId,
      @Param("pageSize") Integer pageSize, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve daily device statistics
   * Similar to <code>getTenantDeviceStatisticsDailyCollection</code> but it also
   * returns the http response headers .
   * Retrieve daily device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param date           Date (format YYYY-MM-dd) of the queried day. (required)
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param deviceId       The ID of the device to search for. (optional)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/daily/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<DeviceStatisticsCollection> getTenantDeviceStatisticsDailyCollectionWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("date") LocalDate date, @Param("currentPage") Integer currentPage,
      @Param("deviceId") String deviceId, @Param("pageSize") Integer pageSize,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve daily device statistics
   * Retrieve daily device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantDeviceStatisticsDailyCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTenantDeviceStatisticsDailyCollectionQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param date        Date (format YYYY-MM-dd) of the queried day. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>deviceId - The ID of the device to search for.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/daily/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  DeviceStatisticsCollection getTenantDeviceStatisticsDailyCollection(@Param("tenantId") String tenantId,
      @Param("date") LocalDate date,
      @QueryMap(encoded = true) GetTenantDeviceStatisticsDailyCollectionQueryParams queryParams);

  /**
   * Retrieve daily device statistics
   * Retrieve daily device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantDeviceStatisticsDailyCollection</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param date        Date (format YYYY-MM-dd) of the queried day. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>deviceId - The ID of the device to search for.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/daily/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<DeviceStatisticsCollection> getTenantDeviceStatisticsDailyCollectionWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("date") LocalDate date,
      @QueryMap(encoded = true) GetTenantDeviceStatisticsDailyCollectionQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTenantDeviceStatisticsDailyCollection</code> method in a fluent
   * style.
   */
  public static class GetTenantDeviceStatisticsDailyCollectionQueryParams extends HashMap<String, Object> {
    public GetTenantDeviceStatisticsDailyCollectionQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsDailyCollectionQueryParams deviceId(final String value) {
      put("deviceId", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsDailyCollectionQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsDailyCollectionQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve monthly device statistics
   * Retrieve monthly device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param date           Date (format YYYY-MM-dd) of the queried month (the day
   *                       value is ignored). (required)
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param deviceId       The ID of the device to search for. (optional)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/monthly/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  DeviceStatisticsCollection getTenantDeviceStatisticsMonthlyCollection(@Param("tenantId") String tenantId,
      @Param("date") LocalDate date, @Param("currentPage") Integer currentPage, @Param("deviceId") String deviceId,
      @Param("pageSize") Integer pageSize, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve monthly device statistics
   * Similar to <code>getTenantDeviceStatisticsMonthlyCollection</code> but it
   * also returns the http response headers .
   * Retrieve monthly device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param tenantId       Unique identifier of a Cumulocity IoT tenant.
   *                       (required)
   * @param date           Date (format YYYY-MM-dd) of the queried month (the day
   *                       value is ignored). (required)
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param deviceId       The ID of the device to search for. (optional)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/monthly/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<DeviceStatisticsCollection> getTenantDeviceStatisticsMonthlyCollectionWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("date") LocalDate date, @Param("currentPage") Integer currentPage,
      @Param("deviceId") String deviceId, @Param("pageSize") Integer pageSize,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve monthly device statistics
   * Retrieve monthly device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantDeviceStatisticsMonthlyCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTenantDeviceStatisticsMonthlyCollectionQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param date        Date (format YYYY-MM-dd) of the queried month (the day
   *                    value is ignored). (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>deviceId - The ID of the device to search for.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/monthly/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  DeviceStatisticsCollection getTenantDeviceStatisticsMonthlyCollection(@Param("tenantId") String tenantId,
      @Param("date") LocalDate date,
      @QueryMap(encoded = true) GetTenantDeviceStatisticsMonthlyCollectionQueryParams queryParams);

  /**
   * Retrieve monthly device statistics
   * Retrieve monthly device statistics from a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantDeviceStatisticsMonthlyCollection</code> that receives the
   * query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param date        Date (format YYYY-MM-dd) of the queried month (the day
   *                    value is ignored). (required)
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>deviceId - The ID of the device to search for.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return DeviceStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics/device/{tenantId}/monthly/{date}?currentPage={currentPage}&deviceId={deviceId}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<DeviceStatisticsCollection> getTenantDeviceStatisticsMonthlyCollectionWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("date") LocalDate date,
      @QueryMap(encoded = true) GetTenantDeviceStatisticsMonthlyCollectionQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTenantDeviceStatisticsMonthlyCollection</code> method in a fluent
   * style.
   */
  public static class GetTenantDeviceStatisticsMonthlyCollectionQueryParams extends HashMap<String, Object> {
    public GetTenantDeviceStatisticsMonthlyCollectionQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsMonthlyCollectionQueryParams deviceId(final String value) {
      put("deviceId", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsMonthlyCollectionQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantDeviceStatisticsMonthlyCollectionQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }
}
