package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.AuditRecord;
import org.cpo.c8y.model.AuditRecordCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface AuditsApi extends ApiClient.Api {

  /**
   * Retrieve all audit records
   * Retrieve all audit records registered on your tenant, or a specific subset
   * based on queries.
   * 
   * @param application       Name of the application from which the audit was
   *                          carried out. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the audit record
   *                          (device time). (optional)
   * @param dateTo            End date or date and time of the audit record
   *                          (device time). (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param source            The platform component ID to which the audit is
   *                          associated. (optional)
   * @param type              The type of audit record to search for. (optional)
   * @param user              The username to search for. (optional)
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
   * @return AuditRecordCollection
   */
  @RequestLine("GET /audit/auditRecords?application={application}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&source={source}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecordcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  AuditRecordCollection getAuditRecordCollectionResource(@Param("application") String application,
      @Param("currentPage") Integer currentPage, @Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("pageSize") Integer pageSize, @Param("source") String source,
      @Param("type") String type, @Param("user") String user, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all audit records
   * Similar to <code>getAuditRecordCollectionResource</code> but it also returns
   * the http response headers .
   * Retrieve all audit records registered on your tenant, or a specific subset
   * based on queries.
   * 
   * @param application       Name of the application from which the audit was
   *                          carried out. (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the audit record
   *                          (device time). (optional)
   * @param dateTo            End date or date and time of the audit record
   *                          (device time). (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param source            The platform component ID to which the audit is
   *                          associated. (optional)
   * @param type              The type of audit record to search for. (optional)
   * @param user              The username to search for. (optional)
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
  @RequestLine("GET /audit/auditRecords?application={application}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&source={source}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecordcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<AuditRecordCollection> getAuditRecordCollectionResourceWithHttpInfo(
      @Param("application") String application, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("pageSize") Integer pageSize, @Param("source") String source, @Param("type") String type,
      @Param("user") String user, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all audit records
   * Retrieve all audit records registered on your tenant, or a specific subset
   * based on queries.
   * Note, this is equivalent to the other
   * <code>getAuditRecordCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAuditRecordCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>application - Name of the application from which the
   *                    audit was carried out. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the audit
   *                    record (device time). (optional)</li>
   *                    <li>dateTo - End date or date and time of the audit record
   *                    (device time). (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>source - The platform component ID to which the audit
   *                    is associated. (optional)</li>
   *                    <li>type - The type of audit record to search for.
   *                    (optional)</li>
   *                    <li>user - The username to search for. (optional)</li>
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
   * @return AuditRecordCollection
   */
  @RequestLine("GET /audit/auditRecords?application={application}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&source={source}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecordcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  AuditRecordCollection getAuditRecordCollectionResource(
      @QueryMap(encoded = true) GetAuditRecordCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all audit records
   * Retrieve all audit records registered on your tenant, or a specific subset
   * based on queries.
   * Note, this is equivalent to the other
   * <code>getAuditRecordCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>application - Name of the application from which the
   *                    audit was carried out. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the audit
   *                    record (device time). (optional)</li>
   *                    <li>dateTo - End date or date and time of the audit record
   *                    (device time). (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>source - The platform component ID to which the audit
   *                    is associated. (optional)</li>
   *                    <li>type - The type of audit record to search for.
   *                    (optional)</li>
   *                    <li>user - The username to search for. (optional)</li>
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
   * @return AuditRecordCollection
   */
  @RequestLine("GET /audit/auditRecords?application={application}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&pageSize={pageSize}&source={source}&type={type}&user={user}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecordcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<AuditRecordCollection> getAuditRecordCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetAuditRecordCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAuditRecordCollectionResource</code> method in a fluent style.
   */
  public static class GetAuditRecordCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetAuditRecordCollectionResourceQueryParams application(final String value) {
      put("application", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetAuditRecordCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific audit record
   * Retrieve a specific audit record by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_AUDIT_READ
   * &lt;b&gt;OR&lt;/b&gt; AUDIT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the audit record. (required)
   * @return AuditRecord
   */
  @RequestLine("GET /audit/auditRecords/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecord+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  AuditRecord getAuditRecordResource(@Param("id") String id);

  /**
   * Retrieve a specific audit record
   * Similar to <code>getAuditRecordResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific audit record by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_AUDIT_READ
   * &lt;b&gt;OR&lt;/b&gt; AUDIT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the audit record. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /audit/auditRecords/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.auditrecord+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<AuditRecord> getAuditRecordResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create an audit record
   * Create an audit record. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_AUDIT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM &lt;b&gt;OR&lt;/b&gt;
   * AUDIT_ADMIN permission on the resource &lt;/section&gt;
   * 
   * @param auditRecord (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return AuditRecord
   */
  @RequestLine("POST /audit/auditRecords")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.auditrecord+json",
      "Accept: application/vnd.com.nsn.cumulocity.auditrecord+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  AuditRecord postAuditRecordCollectionResource(AuditRecord auditRecord, @Param("accept") String accept);

  /**
   * Create an audit record
   * Similar to <code>postAuditRecordCollectionResource</code> but it also returns
   * the http response headers .
   * Create an audit record. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_AUDIT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM &lt;b&gt;OR&lt;/b&gt;
   * AUDIT_ADMIN permission on the resource &lt;/section&gt;
   * 
   * @param auditRecord (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /audit/auditRecords")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.auditrecord+json",
      "Accept: application/vnd.com.nsn.cumulocity.auditrecord+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<AuditRecord> postAuditRecordCollectionResourceWithHttpInfo(AuditRecord auditRecord,
      @Param("accept") String accept);

}
