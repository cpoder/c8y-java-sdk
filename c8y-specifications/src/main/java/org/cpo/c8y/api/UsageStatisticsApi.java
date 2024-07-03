package org.cpo.c8y.api;

import java.io.File;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.RangeStatisticsFile;
import org.cpo.c8y.model.StatisticsFile;
import org.cpo.c8y.model.SummaryAllTenantsUsageStatistics;
import org.cpo.c8y.model.SummaryTenantUsageStatistics;
import org.cpo.c8y.model.TenantUsageStatisticsCollection;
import org.cpo.c8y.model.TenantUsageStatisticsFileCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface UsageStatisticsApi extends ApiClient.Api {

  /**
   * Retrieve a summary of all usage statistics
   * Retrieve a summary of all tenants usage statistics.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param dateFrom Start date or date and time of the statistics. (optional)
   * @param dateTo   End date or date and time of the statistics. (optional)
   * @return List&lt;SummaryAllTenantsUsageStatistics&gt;
   */
  @RequestLine("GET /tenant/statistics/allTenantsSummary?dateFrom={dateFrom}&dateTo={dateTo}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  List<SummaryAllTenantsUsageStatistics> getSummaryAllTenantsUsageStatistics(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo);

  /**
   * Retrieve a summary of all usage statistics
   * Similar to <code>getSummaryAllTenantsUsageStatistics</code> but it also
   * returns the http response headers .
   * Retrieve a summary of all tenants usage statistics.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
   * 
   * @param dateFrom Start date or date and time of the statistics. (optional)
   * @param dateTo   End date or date and time of the statistics. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/allTenantsSummary?dateFrom={dateFrom}&dateTo={dateTo}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<List<SummaryAllTenantsUsageStatistics>> getSummaryAllTenantsUsageStatisticsWithHttpInfo(
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo);

  /**
   * Retrieve a summary of all usage statistics
   * Retrieve a summary of all tenants usage statistics.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getSummaryAllTenantsUsageStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSummaryAllTenantsUsageStatisticsQueryParams} class
   * that allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
   *                    </ul>
   * @return List&lt;SummaryAllTenantsUsageStatistics&gt;
   */
  @RequestLine("GET /tenant/statistics/allTenantsSummary?dateFrom={dateFrom}&dateTo={dateTo}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  List<SummaryAllTenantsUsageStatistics> getSummaryAllTenantsUsageStatistics(
      @QueryMap(encoded = true) GetSummaryAllTenantsUsageStatisticsQueryParams queryParams);

  /**
   * Retrieve a summary of all usage statistics
   * Retrieve a summary of all tenants usage statistics.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getSummaryAllTenantsUsageStatistics</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
   *                    </ul>
   * @return List&lt;SummaryAllTenantsUsageStatistics&gt;
   */
  @RequestLine("GET /tenant/statistics/allTenantsSummary?dateFrom={dateFrom}&dateTo={dateTo}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<List<SummaryAllTenantsUsageStatistics>> getSummaryAllTenantsUsageStatisticsWithHttpInfo(
      @QueryMap(encoded = true) GetSummaryAllTenantsUsageStatisticsQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSummaryAllTenantsUsageStatistics</code> method in a fluent style.
   */
  public static class GetSummaryAllTenantsUsageStatisticsQueryParams extends HashMap<String, Object> {
    public GetSummaryAllTenantsUsageStatisticsQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetSummaryAllTenantsUsageStatisticsQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a usage statistics summary
   * Retrieve a usage statistics summary of a tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ If the &#x60;tenant&#x60;
   * request parameter is specified, then the current tenant must be the
   * management tenant &lt;b&gt;OR&lt;/b&gt; the parent of the requested
   * &#x60;tenant&#x60;. &lt;/section&gt;
   * 
   * @param dateFrom Start date or date and time of the statistics. (optional)
   * @param dateTo   End date or date and time of the statistics. (optional)
   * @param tenant   Unique identifier of a Cumulocity IoT tenant. (optional)
   * @return SummaryTenantUsageStatistics
   */
  @RequestLine("GET /tenant/statistics/summary?dateFrom={dateFrom}&dateTo={dateTo}&tenant={tenant}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticssummary+json",
  })
  SummaryTenantUsageStatistics getSummaryUsageStatistics(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("tenant") String tenant);

  /**
   * Retrieve a usage statistics summary
   * Similar to <code>getSummaryUsageStatistics</code> but it also returns the
   * http response headers .
   * Retrieve a usage statistics summary of a tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ If the &#x60;tenant&#x60;
   * request parameter is specified, then the current tenant must be the
   * management tenant &lt;b&gt;OR&lt;/b&gt; the parent of the requested
   * &#x60;tenant&#x60;. &lt;/section&gt;
   * 
   * @param dateFrom Start date or date and time of the statistics. (optional)
   * @param dateTo   End date or date and time of the statistics. (optional)
   * @param tenant   Unique identifier of a Cumulocity IoT tenant. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/summary?dateFrom={dateFrom}&dateTo={dateTo}&tenant={tenant}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticssummary+json",
  })
  ApiResponse<SummaryTenantUsageStatistics> getSummaryUsageStatisticsWithHttpInfo(
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("tenant") String tenant);

  /**
   * Retrieve a usage statistics summary
   * Retrieve a usage statistics summary of a tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ If the &#x60;tenant&#x60;
   * request parameter is specified, then the current tenant must be the
   * management tenant &lt;b&gt;OR&lt;/b&gt; the parent of the requested
   * &#x60;tenant&#x60;. &lt;/section&gt;
   * Note, this is equivalent to the other <code>getSummaryUsageStatistics</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSummaryUsageStatisticsQueryParams} class that allows
   * for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
   *                    <li>tenant - Unique identifier of a Cumulocity IoT tenant.
   *                    (optional)</li>
   *                    </ul>
   * @return SummaryTenantUsageStatistics
   */
  @RequestLine("GET /tenant/statistics/summary?dateFrom={dateFrom}&dateTo={dateTo}&tenant={tenant}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticssummary+json",
  })
  SummaryTenantUsageStatistics getSummaryUsageStatistics(
      @QueryMap(encoded = true) GetSummaryUsageStatisticsQueryParams queryParams);

  /**
   * Retrieve a usage statistics summary
   * Retrieve a usage statistics summary of a tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_MANAGED_OBJECT_READ If the &#x60;tenant&#x60;
   * request parameter is specified, then the current tenant must be the
   * management tenant &lt;b&gt;OR&lt;/b&gt; the parent of the requested
   * &#x60;tenant&#x60;. &lt;/section&gt;
   * Note, this is equivalent to the other <code>getSummaryUsageStatistics</code>
   * that receives the query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
   *                    <li>tenant - Unique identifier of a Cumulocity IoT tenant.
   *                    (optional)</li>
   *                    </ul>
   * @return SummaryTenantUsageStatistics
   */
  @RequestLine("GET /tenant/statistics/summary?dateFrom={dateFrom}&dateTo={dateTo}&tenant={tenant}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticssummary+json",
  })
  ApiResponse<SummaryTenantUsageStatistics> getSummaryUsageStatisticsWithHttpInfo(
      @QueryMap(encoded = true) GetSummaryUsageStatisticsQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSummaryUsageStatistics</code> method in a fluent style.
   */
  public static class GetSummaryUsageStatisticsQueryParams extends HashMap<String, Object> {
    public GetSummaryUsageStatisticsQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetSummaryUsageStatisticsQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetSummaryUsageStatisticsQueryParams tenant(final String value) {
      put("tenant", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve statistics of the current tenant
   * Retrieve usage statistics of the current tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the statistics.
   *                          (optional)
   * @param dateTo            End date or date and time of the statistics.
   *                          (optional)
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
   * @return TenantUsageStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticscollection+json",
  })
  TenantUsageStatisticsCollection getTenantUsageStatisticsCollectionResource(@Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve statistics of the current tenant
   * Similar to <code>getTenantUsageStatisticsCollectionResource</code> but it
   * also returns the http response headers .
   * Retrieve usage statistics of the current tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * 
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the statistics.
   *                          (optional)
   * @param dateTo            End date or date and time of the statistics.
   *                          (optional)
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
  @RequestLine("GET /tenant/statistics?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticscollection+json",
  })
  ApiResponse<TenantUsageStatisticsCollection> getTenantUsageStatisticsCollectionResourceWithHttpInfo(
      @Param("currentPage") Integer currentPage, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve statistics of the current tenant
   * Retrieve usage statistics of the current tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantUsageStatisticsCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTenantUsageStatisticsCollectionResourceQueryParams}
   * class that allows for
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
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
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
   * @return TenantUsageStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticscollection+json",
  })
  TenantUsageStatisticsCollection getTenantUsageStatisticsCollectionResource(
      @QueryMap(encoded = true) GetTenantUsageStatisticsCollectionResourceQueryParams queryParams);

  /**
   * Retrieve statistics of the current tenant
   * Retrieve usage statistics of the current tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_STATISTICS_READ &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantUsageStatisticsCollectionResource</code> that receives the
   * query parameters as a map,
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
   *                    statistics. (optional)</li>
   *                    <li>dateTo - End date or date and time of the statistics.
   *                    (optional)</li>
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
   * @return TenantUsageStatisticsCollection
   */
  @RequestLine("GET /tenant/statistics?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantusagestatisticscollection+json",
  })
  ApiResponse<TenantUsageStatisticsCollection> getTenantUsageStatisticsCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetTenantUsageStatisticsCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTenantUsageStatisticsCollectionResource</code> method in a fluent
   * style.
   */
  public static class GetTenantUsageStatisticsCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetTenantUsageStatisticsCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a usage statistics file
   * Retrieve a specific usage statistics file (by a given ID). &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id Unique identifier of the statistics file. (required)
   * @return File
   */
  @RequestLine("GET /tenant/statistics/files/{id}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  File getTenantUsageStatisticsFileById(@Param("id") String id);

  /**
   * Retrieve a usage statistics file
   * Similar to <code>getTenantUsageStatisticsFileById</code> but it also returns
   * the http response headers .
   * Retrieve a specific usage statistics file (by a given ID). &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param id Unique identifier of the statistics file. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/files/{id}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<File> getTenantUsageStatisticsFileByIdWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve usage statistics files metadata
   * Retrieve usage statistics summary files report metadata. &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant. Date range defines
   * the search criteria for files which have any data inside this range. For
   * example, query containing
   * &#x60;dateFrom&#x3D;2023-03-01&amp;dateTo&#x3D;2023-03-31&#x60; will return
   * files with statistics from ranges 2023-02-25---2023-03-03,
   * 2023-03-04---2023-03-05, 2023-03-15---2023-04-15, but not the files where the
   * whole range of data is outside of queried range, like
   * 2023-02-01---2023-02-27. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param dateFrom       Start date or date and time of the range included in
   *                       statistics file. (optional)
   * @param dateTo         End date or date and time of the range included in
   *                       statistics file. (optional)
   * @param pageSize       Indicates how many entries of the collection shall be
   *                       returned. The upper limit for one page is 2,000
   *                       objects. (optional, default to 5)
   * @param withTotalPages When set to &#x60;true&#x60;, the returned result will
   *                       contain in the statistics object the total number of
   *                       pages. Only applicable on [range
   *                       queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                       (optional, default to false)
   * @return TenantUsageStatisticsFileCollection
   */
  @RequestLine("GET /tenant/statistics/files?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantStatisticsfilecollection+json",
  })
  TenantUsageStatisticsFileCollection getTenantUsageStatisticsFileCollectionResource(
      @Param("currentPage") Integer currentPage, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("pageSize") Integer pageSize,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve usage statistics files metadata
   * Similar to <code>getTenantUsageStatisticsFileCollectionResource</code> but it
   * also returns the http response headers .
   * Retrieve usage statistics summary files report metadata. &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant. Date range defines
   * the search criteria for files which have any data inside this range. For
   * example, query containing
   * &#x60;dateFrom&#x3D;2023-03-01&amp;dateTo&#x3D;2023-03-31&#x60; will return
   * files with statistics from ranges 2023-02-25---2023-03-03,
   * 2023-03-04---2023-03-05, 2023-03-15---2023-04-15, but not the files where the
   * whole range of data is outside of queried range, like
   * 2023-02-01---2023-02-27. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param currentPage    The current page of the paginated results. (optional,
   *                       default to 1)
   * @param dateFrom       Start date or date and time of the range included in
   *                       statistics file. (optional)
   * @param dateTo         End date or date and time of the range included in
   *                       statistics file. (optional)
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
  @RequestLine("GET /tenant/statistics/files?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantStatisticsfilecollection+json",
  })
  ApiResponse<TenantUsageStatisticsFileCollection> getTenantUsageStatisticsFileCollectionResourceWithHttpInfo(
      @Param("currentPage") Integer currentPage, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("pageSize") Integer pageSize,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve usage statistics files metadata
   * Retrieve usage statistics summary files report metadata. &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant. Date range defines
   * the search criteria for files which have any data inside this range. For
   * example, query containing
   * &#x60;dateFrom&#x3D;2023-03-01&amp;dateTo&#x3D;2023-03-31&#x60; will return
   * files with statistics from ranges 2023-02-25---2023-03-03,
   * 2023-03-04---2023-03-05, 2023-03-15---2023-04-15, but not the files where the
   * whole range of data is outside of queried range, like
   * 2023-02-01---2023-02-27. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantUsageStatisticsFileCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the
   * {@link GetTenantUsageStatisticsFileCollectionResourceQueryParams} class that
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
   *                    <li>dateFrom - Start date or date and time of the range
   *                    included in statistics file. (optional)</li>
   *                    <li>dateTo - End date or date and time of the range
   *                    included in statistics file. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return TenantUsageStatisticsFileCollection
   */
  @RequestLine("GET /tenant/statistics/files?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantStatisticsfilecollection+json",
  })
  TenantUsageStatisticsFileCollection getTenantUsageStatisticsFileCollectionResource(
      @QueryMap(encoded = true) GetTenantUsageStatisticsFileCollectionResourceQueryParams queryParams);

  /**
   * Retrieve usage statistics files metadata
   * Retrieve usage statistics summary files report metadata. &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant. Date range defines
   * the search criteria for files which have any data inside this range. For
   * example, query containing
   * &#x60;dateFrom&#x3D;2023-03-01&amp;dateTo&#x3D;2023-03-31&#x60; will return
   * files with statistics from ranges 2023-02-25---2023-03-03,
   * 2023-03-04---2023-03-05, 2023-03-15---2023-04-15, but not the files where the
   * whole range of data is outside of queried range, like
   * 2023-02-01---2023-02-27. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTenantUsageStatisticsFileCollectionResource</code> that receives the
   * query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the range
   *                    included in statistics file. (optional)</li>
   *                    <li>dateTo - End date or date and time of the range
   *                    included in statistics file. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return TenantUsageStatisticsFileCollection
   */
  @RequestLine("GET /tenant/statistics/files?currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantStatisticsfilecollection+json",
  })
  ApiResponse<TenantUsageStatisticsFileCollection> getTenantUsageStatisticsFileCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetTenantUsageStatisticsFileCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTenantUsageStatisticsFileCollectionResource</code> method in a
   * fluent style.
   */
  public static class GetTenantUsageStatisticsFileCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetTenantUsageStatisticsFileCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsFileCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsFileCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsFileCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTenantUsageStatisticsFileCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve the latest usage statistics file
   * Retrieve the latest usage statistics file with REAL data for a given month.
   * There are two types of statistics files: * REAL - generated by the system on
   * the first day of the month and includes statistics for the previous month. *
   * TEST - generated by the user with a time range specified in the query
   * parameters (&#x60;dateFrom&#x60;, &#x60;dateTo&#x60;). &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param month Date (format YYYY-MM-dd) specifying the month for which the
   *              statistics file will be downloaded (the day value is ignored).
   *              (required)
   * @return File
   */
  @RequestLine("GET /tenant/statistics/files/latest/{month}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  File getTenantUsageStatisticsLatestFile(@Param("month") LocalDate month);

  /**
   * Retrieve the latest usage statistics file
   * Similar to <code>getTenantUsageStatisticsLatestFile</code> but it also
   * returns the http response headers .
   * Retrieve the latest usage statistics file with REAL data for a given month.
   * There are two types of statistics files: * REAL - generated by the system on
   * the first day of the month and includes statistics for the previous month. *
   * TEST - generated by the user with a time range specified in the query
   * parameters (&#x60;dateFrom&#x60;, &#x60;dateTo&#x60;). &gt; **&amp;#9432;
   * Info:** This is only accessible by the Management tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_TENANT_MANAGEMENT_ADMIN &lt;/section&gt;
   * 
   * @param month Date (format YYYY-MM-dd) specifying the month for which the
   *              statistics file will be downloaded (the day value is ignored).
   *              (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/statistics/files/latest/{month}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<File> getTenantUsageStatisticsLatestFileWithHttpInfo(@Param("month") LocalDate month);

  /**
   * Generate a statistics file report
   * Generate a TEST statistics file report for a given time range. There are two
   * types of statistics files: * REAL - generated by the system on the first day
   * of the month and including statistics from the previous month. * TEST -
   * generated by the user with a time range specified in the query parameters
   * (&#x60;dateFrom&#x60;, &#x60;dateTo&#x60;). &#x60;dateFrom&#x60; and
   * &#x60;dateTo&#x60; are using daily granularity and each day is stored with
   * respect to local Time Zone of the server. &gt; **&amp;#9432; Info:** This is
   * only accessible by the Management tenant. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param rangeStatisticsFile (required)
   * @param accept              Advertises which content types, expressed as MIME
   *                            types, the client is able to understand.
   *                            (optional)
   * @return StatisticsFile
   */
  @RequestLine("POST /tenant/statistics/files")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.tenantstatisticsdate+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantstatisticsfile+json",
      "Accept: {accept}"
  })
  StatisticsFile postGenerateStatisticsFileRequest(RangeStatisticsFile rangeStatisticsFile,
      @Param("accept") String accept);

  /**
   * Generate a statistics file report
   * Similar to <code>postGenerateStatisticsFileRequest</code> but it also returns
   * the http response headers .
   * Generate a TEST statistics file report for a given time range. There are two
   * types of statistics files: * REAL - generated by the system on the first day
   * of the month and including statistics from the previous month. * TEST -
   * generated by the user with a time range specified in the query parameters
   * (&#x60;dateFrom&#x60;, &#x60;dateTo&#x60;). &#x60;dateFrom&#x60; and
   * &#x60;dateTo&#x60; are using daily granularity and each day is stored with
   * respect to local Time Zone of the server. &gt; **&amp;#9432; Info:** This is
   * only accessible by the Management tenant. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param rangeStatisticsFile (required)
   * @param accept              Advertises which content types, expressed as MIME
   *                            types, the client is able to understand.
   *                            (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/statistics/files")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.tenantstatisticsdate+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.tenantstatisticsfile+json",
      "Accept: {accept}"
  })
  ApiResponse<StatisticsFile> postGenerateStatisticsFileRequestWithHttpInfo(RangeStatisticsFile rangeStatisticsFile,
      @Param("accept") String accept);

}
