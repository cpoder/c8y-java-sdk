package org.cpo.c8y.api;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.Alarm;
import org.cpo.c8y.model.AlarmCollection;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.PostAlarmCollectionResourceRequest;
import org.cpo.c8y.model.PutAlarmCollectionResourceRequest;
import org.cpo.c8y.model.PutAlarmResourceRequest;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface AlarmsApi extends ApiClient.Api {

  /**
   * Remove alarm collections
   * Remove alarm collections specified by query parameters. &gt; **⚠️
   * Important:** DELETE requires at least one of the following parameters:
   * &#x60;source&#x60;, &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;,
   * &#x60;createdFrom&#x60;, &#x60;createdTo&#x60;. &gt; Also note that DELETE
   * requests are not synchronous. The response could be returned before the
   * delete request has been completed. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param createdFrom               Start date or date and time of the alarm
   *                                  creation. (optional)
   * @param createdTo                 End date or date and time of the alarm
   *                                  creation. (optional)
   * @param dateFrom                  Start date or date and time of the alarm
   *                                  occurrence. (optional)
   * @param dateTo                    End date or date and time of the alarm
   *                                  occurrence. (optional)
   * @param resolved                  When set to &#x60;true&#x60; only alarms
   *                                  with status CLEARED will be fetched, whereas
   *                                  &#x60;false&#x60; will fetch all alarms with
   *                                  status ACTIVE or ACKNOWLEDGED. Takes
   *                                  precedence over the &#x60;status&#x60;
   *                                  parameter. (optional, default to false)
   * @param severity                  The severity of the alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm severities at once,
   *                                  comma-separate the values. (optional)
   * @param source                    The managed object ID to which the alarm is
   *                                  associated. (optional)
   * @param status                    The status of the alarm to search for.
   *                                  Should not be used when &#x60;resolved&#x60;
   *                                  parameter is provided. &gt;**&amp;#9432;
   *                                  Info:** If you query for multiple alarm
   *                                  statuses at once, comma-separate the values.
   *                                  (optional)
   * @param type                      The types of alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm types at once, comma-separate
   *                                  the values. Space characters in alarm types
   *                                  must be escaped. (optional)
   * @param withSourceAssets          When set to &#x60;true&#x60; also alarms for
   *                                  related source assets will be included in
   *                                  the request. When this parameter is provided
   *                                  a &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)
   * @param withSourceDevices         When set to &#x60;true&#x60; also alarms for
   *                                  related source devices will be included in
   *                                  the request. When this parameter is provided
   *                                  a &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)
   */
  @RequestLine("DELETE /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteAlarmCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("resolved") Boolean resolved, @Param("severity") List<String> severity, @Param("source") String source,
      @Param("status") List<String> status, @Param("type") List<String> type,
      @Param("withSourceAssets") Boolean withSourceAssets, @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Remove alarm collections
   * Similar to <code>deleteAlarmCollectionResource</code> but it also returns the
   * http response headers .
   * Remove alarm collections specified by query parameters. &gt; **⚠️
   * Important:** DELETE requires at least one of the following parameters:
   * &#x60;source&#x60;, &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;,
   * &#x60;createdFrom&#x60;, &#x60;createdTo&#x60;. &gt; Also note that DELETE
   * requests are not synchronous. The response could be returned before the
   * delete request has been completed. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;/section&gt;
   * 
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param createdFrom               Start date or date and time of the alarm
   *                                  creation. (optional)
   * @param createdTo                 End date or date and time of the alarm
   *                                  creation. (optional)
   * @param dateFrom                  Start date or date and time of the alarm
   *                                  occurrence. (optional)
   * @param dateTo                    End date or date and time of the alarm
   *                                  occurrence. (optional)
   * @param resolved                  When set to &#x60;true&#x60; only alarms
   *                                  with status CLEARED will be fetched, whereas
   *                                  &#x60;false&#x60; will fetch all alarms with
   *                                  status ACTIVE or ACKNOWLEDGED. Takes
   *                                  precedence over the &#x60;status&#x60;
   *                                  parameter. (optional, default to false)
   * @param severity                  The severity of the alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm severities at once,
   *                                  comma-separate the values. (optional)
   * @param source                    The managed object ID to which the alarm is
   *                                  associated. (optional)
   * @param status                    The status of the alarm to search for.
   *                                  Should not be used when &#x60;resolved&#x60;
   *                                  parameter is provided. &gt;**&amp;#9432;
   *                                  Info:** If you query for multiple alarm
   *                                  statuses at once, comma-separate the values.
   *                                  (optional)
   * @param type                      The types of alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm types at once, comma-separate
   *                                  the values. Space characters in alarm types
   *                                  must be escaped. (optional)
   * @param withSourceAssets          When set to &#x60;true&#x60; also alarms for
   *                                  related source assets will be included in
   *                                  the request. When this parameter is provided
   *                                  a &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)
   * @param withSourceDevices         When set to &#x60;true&#x60; also alarms for
   *                                  related source devices will be included in
   *                                  the request. When this parameter is provided
   *                                  a &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)
   */
  @RequestLine("DELETE /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteAlarmCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("resolved") Boolean resolved, @Param("severity") List<String> severity, @Param("source") String source,
      @Param("status") List<String> status, @Param("type") List<String> type,
      @Param("withSourceAssets") Boolean withSourceAssets, @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Remove alarm collections
   * Remove alarm collections specified by query parameters. &gt; **⚠️
   * Important:** DELETE requires at least one of the following parameters:
   * &#x60;source&#x60;, &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;,
   * &#x60;createdFrom&#x60;, &#x60;createdTo&#x60;. &gt; Also note that DELETE
   * requests are not synchronous. The response could be returned before the
   * delete request has been completed. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteAlarmCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAlarmCollectionResourceQueryParams} class that
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
   *                                  time of the alarm creation. (optional)</li>
   *                                  <li>createdTo - End date or date and time of
   *                                  the alarm creation. (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the alarm occurrence. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the alarm occurrence. (optional)</li>
   *                                  <li>resolved - When set to &#x60;true&#x60;
   *                                  only alarms with status CLEARED will be
   *                                  fetched, whereas &#x60;false&#x60; will
   *                                  fetch all alarms with status ACTIVE or
   *                                  ACKNOWLEDGED. Takes precedence over the
   *                                  &#x60;status&#x60; parameter. (optional,
   *                                  default to false)</li>
   *                                  <li>severity - The severity of the alarm to
   *                                  search for. &gt;**&amp;#9432; Info:** If you
   *                                  query for multiple alarm severities at once,
   *                                  comma-separate the values. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the alarm is associated. (optional)</li>
   *                                  <li>status - The status of the alarm to
   *                                  search for. Should not be used when
   *                                  &#x60;resolved&#x60; parameter is provided.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm statuses at once,
   *                                  comma-separate the values. (optional)</li>
   *                                  <li>type - The types of alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm types at once, comma-separate
   *                                  the values. Space characters in alarm types
   *                                  must be escaped. (optional)</li>
   *                                  <li>withSourceAssets - When set to
   *                                  &#x60;true&#x60; also alarms for related
   *                                  source assets will be included in the
   *                                  request. When this parameter is provided a
   *                                  &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)</li>
   *                                  <li>withSourceDevices - When set to
   *                                  &#x60;true&#x60; also alarms for related
   *                                  source devices will be included in the
   *                                  request. When this parameter is provided a
   *                                  &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void deleteAlarmCollectionResource(@Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteAlarmCollectionResourceQueryParams queryParams);

  /**
   * Remove alarm collections
   * Remove alarm collections specified by query parameters. &gt; **⚠️
   * Important:** DELETE requires at least one of the following parameters:
   * &#x60;source&#x60;, &#x60;dateFrom&#x60;, &#x60;dateTo&#x60;,
   * &#x60;createdFrom&#x60;, &#x60;createdTo&#x60;. &gt; Also note that DELETE
   * requests are not synchronous. The response could be returned before the
   * delete request has been completed. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>deleteAlarmCollectionResource</code> that receives the query parameters
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
   *                                  time of the alarm creation. (optional)</li>
   *                                  <li>createdTo - End date or date and time of
   *                                  the alarm creation. (optional)</li>
   *                                  <li>dateFrom - Start date or date and time
   *                                  of the alarm occurrence. (optional)</li>
   *                                  <li>dateTo - End date or date and time of
   *                                  the alarm occurrence. (optional)</li>
   *                                  <li>resolved - When set to &#x60;true&#x60;
   *                                  only alarms with status CLEARED will be
   *                                  fetched, whereas &#x60;false&#x60; will
   *                                  fetch all alarms with status ACTIVE or
   *                                  ACKNOWLEDGED. Takes precedence over the
   *                                  &#x60;status&#x60; parameter. (optional,
   *                                  default to false)</li>
   *                                  <li>severity - The severity of the alarm to
   *                                  search for. &gt;**&amp;#9432; Info:** If you
   *                                  query for multiple alarm severities at once,
   *                                  comma-separate the values. (optional)</li>
   *                                  <li>source - The managed object ID to which
   *                                  the alarm is associated. (optional)</li>
   *                                  <li>status - The status of the alarm to
   *                                  search for. Should not be used when
   *                                  &#x60;resolved&#x60; parameter is provided.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm statuses at once,
   *                                  comma-separate the values. (optional)</li>
   *                                  <li>type - The types of alarm to search for.
   *                                  &gt;**&amp;#9432; Info:** If you query for
   *                                  multiple alarm types at once, comma-separate
   *                                  the values. Space characters in alarm types
   *                                  must be escaped. (optional)</li>
   *                                  <li>withSourceAssets - When set to
   *                                  &#x60;true&#x60; also alarms for related
   *                                  source assets will be included in the
   *                                  request. When this parameter is provided a
   *                                  &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)</li>
   *                                  <li>withSourceDevices - When set to
   *                                  &#x60;true&#x60; also alarms for related
   *                                  source devices will be included in the
   *                                  request. When this parameter is provided a
   *                                  &#x60;source&#x60; must be specified.
   *                                  (optional, default to false)</li>
   *                                  </ul>
   */
  @RequestLine("DELETE /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> deleteAlarmCollectionResourceWithHttpInfo(
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) DeleteAlarmCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteAlarmCollectionResource</code> method in a fluent style.
   */
  public static class DeleteAlarmCollectionResourceQueryParams extends HashMap<String, Object> {
    public DeleteAlarmCollectionResourceQueryParams createdFrom(final OffsetDateTime value) {
      put("createdFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams createdTo(final OffsetDateTime value) {
      put("createdTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams resolved(final Boolean value) {
      put("resolved", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams severity(final List<String> value) {
      put("severity", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams status(final List<String> value) {
      put("status", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams withSourceAssets(final Boolean value) {
      put("withSourceAssets", EncodingUtils.encode(value));
      return this;
    }

    public DeleteAlarmCollectionResourceQueryParams withSourceDevices(final Boolean value) {
      put("withSourceDevices", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve the total number of alarms
   * Count the total number of active alarms on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are counted. Otherwise, inventory role permissions are used to count the
   * alarms and the limit is 100. &lt;/section&gt;
   * 
   * @param dateFrom          Start date or date and time of the alarm occurrence.
   *                          (optional)
   * @param dateTo            End date or date and time of the alarm occurrence.
   *                          (optional)
   * @param resolved          When set to &#x60;true&#x60; only alarms with status
   *                          CLEARED will be fetched, whereas &#x60;false&#x60;
   *                          will fetch all alarms with status ACTIVE or
   *                          ACKNOWLEDGED. Takes precedence over the
   *                          &#x60;status&#x60; parameter. (optional, default to
   *                          false)
   * @param severity          The severity of the alarm to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          alarm severities at once, comma-separate the values.
   *                          (optional)
   * @param source            The managed object ID to which the alarm is
   *                          associated. (optional)
   * @param status            The status of the alarm to search for. Should not be
   *                          used when &#x60;resolved&#x60; parameter is
   *                          provided. &gt;**&amp;#9432; Info:** If you query for
   *                          multiple alarm statuses at once, comma-separate the
   *                          values. (optional)
   * @param type              The types of alarm to search for. &gt;**&amp;#9432;
   *                          Info:** If you query for multiple alarm types at
   *                          once, comma-separate the values. Space characters in
   *                          alarm types must be escaped. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also alarms for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also alarms for related
   *                          source devices will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @return Integer
   */
  @RequestLine("GET /alarm/alarms/count?dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  Integer getAlarmCollectionCountResource(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("resolved") Boolean resolved,
      @Param("severity") List<String> severity, @Param("source") String source, @Param("status") List<String> status,
      @Param("type") List<String> type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Retrieve the total number of alarms
   * Similar to <code>getAlarmCollectionCountResource</code> but it also returns
   * the http response headers .
   * Count the total number of active alarms on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are counted. Otherwise, inventory role permissions are used to count the
   * alarms and the limit is 100. &lt;/section&gt;
   * 
   * @param dateFrom          Start date or date and time of the alarm occurrence.
   *                          (optional)
   * @param dateTo            End date or date and time of the alarm occurrence.
   *                          (optional)
   * @param resolved          When set to &#x60;true&#x60; only alarms with status
   *                          CLEARED will be fetched, whereas &#x60;false&#x60;
   *                          will fetch all alarms with status ACTIVE or
   *                          ACKNOWLEDGED. Takes precedence over the
   *                          &#x60;status&#x60; parameter. (optional, default to
   *                          false)
   * @param severity          The severity of the alarm to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          alarm severities at once, comma-separate the values.
   *                          (optional)
   * @param source            The managed object ID to which the alarm is
   *                          associated. (optional)
   * @param status            The status of the alarm to search for. Should not be
   *                          used when &#x60;resolved&#x60; parameter is
   *                          provided. &gt;**&amp;#9432; Info:** If you query for
   *                          multiple alarm statuses at once, comma-separate the
   *                          values. (optional)
   * @param type              The types of alarm to search for. &gt;**&amp;#9432;
   *                          Info:** If you query for multiple alarm types at
   *                          once, comma-separate the values. Space characters in
   *                          alarm types must be escaped. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also alarms for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also alarms for related
   *                          source devices will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /alarm/alarms/count?dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  ApiResponse<Integer> getAlarmCollectionCountResourceWithHttpInfo(@Param("dateFrom") OffsetDateTime dateFrom,
      @Param("dateTo") OffsetDateTime dateTo, @Param("resolved") Boolean resolved,
      @Param("severity") List<String> severity, @Param("source") String source, @Param("status") List<String> status,
      @Param("type") List<String> type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Retrieve the total number of alarms
   * Count the total number of active alarms on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are counted. Otherwise, inventory role permissions are used to count the
   * alarms and the limit is 100. &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getAlarmCollectionCountResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAlarmCollectionCountResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>dateTo - End date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>resolved - When set to &#x60;true&#x60; only alarms
   *                    with status CLEARED will be fetched, whereas
   *                    &#x60;false&#x60; will fetch all alarms with status ACTIVE
   *                    or ACKNOWLEDGED. Takes precedence over the
   *                    &#x60;status&#x60; parameter. (optional, default to
   *                    false)</li>
   *                    <li>severity - The severity of the alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    severities at once, comma-separate the values.
   *                    (optional)</li>
   *                    <li>source - The managed object ID to which the alarm is
   *                    associated. (optional)</li>
   *                    <li>status - The status of the alarm to search for. Should
   *                    not be used when &#x60;resolved&#x60; parameter is
   *                    provided. &gt;**&amp;#9432; Info:** If you query for
   *                    multiple alarm statuses at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>type - The types of alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    types at once, comma-separate the values. Space characters
   *                    in alarm types must be escaped. (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    alarms for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    alarms for related source devices will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    </ul>
   * @return Integer
   */
  @RequestLine("GET /alarm/alarms/count?dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  Integer getAlarmCollectionCountResource(
      @QueryMap(encoded = true) GetAlarmCollectionCountResourceQueryParams queryParams);

  /**
   * Retrieve the total number of alarms
   * Count the total number of active alarms on your tenant.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are counted. Otherwise, inventory role permissions are used to count the
   * alarms and the limit is 100. &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getAlarmCollectionCountResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>dateFrom - Start date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>dateTo - End date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>resolved - When set to &#x60;true&#x60; only alarms
   *                    with status CLEARED will be fetched, whereas
   *                    &#x60;false&#x60; will fetch all alarms with status ACTIVE
   *                    or ACKNOWLEDGED. Takes precedence over the
   *                    &#x60;status&#x60; parameter. (optional, default to
   *                    false)</li>
   *                    <li>severity - The severity of the alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    severities at once, comma-separate the values.
   *                    (optional)</li>
   *                    <li>source - The managed object ID to which the alarm is
   *                    associated. (optional)</li>
   *                    <li>status - The status of the alarm to search for. Should
   *                    not be used when &#x60;resolved&#x60; parameter is
   *                    provided. &gt;**&amp;#9432; Info:** If you query for
   *                    multiple alarm statuses at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>type - The types of alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    types at once, comma-separate the values. Space characters
   *                    in alarm types must be escaped. (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    alarms for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    alarms for related source devices will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    </ul>
   * @return Integer
   */
  @RequestLine("GET /alarm/alarms/count?dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,text/plain, application/json",
  })
  ApiResponse<Integer> getAlarmCollectionCountResourceWithHttpInfo(
      @QueryMap(encoded = true) GetAlarmCollectionCountResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAlarmCollectionCountResource</code> method in a fluent style.
   */
  public static class GetAlarmCollectionCountResourceQueryParams extends HashMap<String, Object> {
    public GetAlarmCollectionCountResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams resolved(final Boolean value) {
      put("resolved", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams severity(final List<String> value) {
      put("severity", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams status(final List<String> value) {
      put("status", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams withSourceAssets(final Boolean value) {
      put("withSourceAssets", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionCountResourceQueryParams withSourceDevices(final Boolean value) {
      put("withSourceDevices", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve all alarms
   * Retrieve all alarms on your tenant, or a specific subset based on queries.
   * The results are sorted by the newest alarms first. #### Query parameters The
   * query parameter &#x60;withTotalPages&#x60; only works when the user has the
   * ROLE_ALARM_READ role, otherwise it is ignored.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are returned. If a user has access to alarms through inventory roles, only
   * those alarms are returned. &lt;/section&gt;
   * 
   * @param createdFrom       Start date or date and time of the alarm creation.
   *                          (optional)
   * @param createdTo         End date or date and time of the alarm creation.
   *                          (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the alarm occurrence.
   *                          (optional)
   * @param dateTo            End date or date and time of the alarm occurrence.
   *                          (optional)
   * @param lastUpdatedFrom   Start date or date and time of the last update made.
   *                          (optional)
   * @param lastUpdatedTo     End date or date and time of the last update made.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param resolved          When set to &#x60;true&#x60; only alarms with status
   *                          CLEARED will be fetched, whereas &#x60;false&#x60;
   *                          will fetch all alarms with status ACTIVE or
   *                          ACKNOWLEDGED. Takes precedence over the
   *                          &#x60;status&#x60; parameter. (optional, default to
   *                          false)
   * @param severity          The severity of the alarm to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          alarm severities at once, comma-separate the values.
   *                          (optional)
   * @param source            The managed object ID to which the alarm is
   *                          associated. (optional)
   * @param status            The status of the alarm to search for. Should not be
   *                          used when &#x60;resolved&#x60; parameter is
   *                          provided. &gt;**&amp;#9432; Info:** If you query for
   *                          multiple alarm statuses at once, comma-separate the
   *                          values. (optional)
   * @param type              The types of alarm to search for. &gt;**&amp;#9432;
   *                          Info:** If you query for multiple alarm types at
   *                          once, comma-separate the values. Space characters in
   *                          alarm types must be escaped. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also alarms for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also alarms for related
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
   * @return AlarmCollection
   */
  @RequestLine("GET /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarmcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  AlarmCollection getAlarmCollectionResource(@Param("createdFrom") OffsetDateTime createdFrom,
      @Param("createdTo") OffsetDateTime createdTo, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("lastUpdatedFrom") OffsetDateTime lastUpdatedFrom, @Param("lastUpdatedTo") OffsetDateTime lastUpdatedTo,
      @Param("pageSize") Integer pageSize, @Param("resolved") Boolean resolved,
      @Param("severity") List<String> severity, @Param("source") String source, @Param("status") List<String> status,
      @Param("type") List<String> type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all alarms
   * Similar to <code>getAlarmCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve all alarms on your tenant, or a specific subset based on queries.
   * The results are sorted by the newest alarms first. #### Query parameters The
   * query parameter &#x60;withTotalPages&#x60; only works when the user has the
   * ROLE_ALARM_READ role, otherwise it is ignored.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are returned. If a user has access to alarms through inventory roles, only
   * those alarms are returned. &lt;/section&gt;
   * 
   * @param createdFrom       Start date or date and time of the alarm creation.
   *                          (optional)
   * @param createdTo         End date or date and time of the alarm creation.
   *                          (optional)
   * @param currentPage       The current page of the paginated results.
   *                          (optional, default to 1)
   * @param dateFrom          Start date or date and time of the alarm occurrence.
   *                          (optional)
   * @param dateTo            End date or date and time of the alarm occurrence.
   *                          (optional)
   * @param lastUpdatedFrom   Start date or date and time of the last update made.
   *                          (optional)
   * @param lastUpdatedTo     End date or date and time of the last update made.
   *                          (optional)
   * @param pageSize          Indicates how many entries of the collection shall
   *                          be returned. The upper limit for one page is 2,000
   *                          objects. (optional, default to 5)
   * @param resolved          When set to &#x60;true&#x60; only alarms with status
   *                          CLEARED will be fetched, whereas &#x60;false&#x60;
   *                          will fetch all alarms with status ACTIVE or
   *                          ACKNOWLEDGED. Takes precedence over the
   *                          &#x60;status&#x60; parameter. (optional, default to
   *                          false)
   * @param severity          The severity of the alarm to search for.
   *                          &gt;**&amp;#9432; Info:** If you query for multiple
   *                          alarm severities at once, comma-separate the values.
   *                          (optional)
   * @param source            The managed object ID to which the alarm is
   *                          associated. (optional)
   * @param status            The status of the alarm to search for. Should not be
   *                          used when &#x60;resolved&#x60; parameter is
   *                          provided. &gt;**&amp;#9432; Info:** If you query for
   *                          multiple alarm statuses at once, comma-separate the
   *                          values. (optional)
   * @param type              The types of alarm to search for. &gt;**&amp;#9432;
   *                          Info:** If you query for multiple alarm types at
   *                          once, comma-separate the values. Space characters in
   *                          alarm types must be escaped. (optional)
   * @param withSourceAssets  When set to &#x60;true&#x60; also alarms for related
   *                          source assets will be included in the request. When
   *                          this parameter is provided a &#x60;source&#x60; must
   *                          be specified. (optional, default to false)
   * @param withSourceDevices When set to &#x60;true&#x60; also alarms for related
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
  @RequestLine("GET /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarmcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<AlarmCollection> getAlarmCollectionResourceWithHttpInfo(@Param("createdFrom") OffsetDateTime createdFrom,
      @Param("createdTo") OffsetDateTime createdTo, @Param("currentPage") Integer currentPage,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("lastUpdatedFrom") OffsetDateTime lastUpdatedFrom, @Param("lastUpdatedTo") OffsetDateTime lastUpdatedTo,
      @Param("pageSize") Integer pageSize, @Param("resolved") Boolean resolved,
      @Param("severity") List<String> severity, @Param("source") String source, @Param("status") List<String> status,
      @Param("type") List<String> type, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all alarms
   * Retrieve all alarms on your tenant, or a specific subset based on queries.
   * The results are sorted by the newest alarms first. #### Query parameters The
   * query parameter &#x60;withTotalPages&#x60; only works when the user has the
   * ROLE_ALARM_READ role, otherwise it is ignored.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are returned. If a user has access to alarms through inventory roles, only
   * those alarms are returned. &lt;/section&gt;
   * Note, this is equivalent to the other <code>getAlarmCollectionResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAlarmCollectionResourceQueryParams} class that allows
   * for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>createdFrom - Start date or date and time of the alarm
   *                    creation. (optional)</li>
   *                    <li>createdTo - End date or date and time of the alarm
   *                    creation. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>dateTo - End date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>lastUpdatedFrom - Start date or date and time of the
   *                    last update made. (optional)</li>
   *                    <li>lastUpdatedTo - End date or date and time of the last
   *                    update made. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>resolved - When set to &#x60;true&#x60; only alarms
   *                    with status CLEARED will be fetched, whereas
   *                    &#x60;false&#x60; will fetch all alarms with status ACTIVE
   *                    or ACKNOWLEDGED. Takes precedence over the
   *                    &#x60;status&#x60; parameter. (optional, default to
   *                    false)</li>
   *                    <li>severity - The severity of the alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    severities at once, comma-separate the values.
   *                    (optional)</li>
   *                    <li>source - The managed object ID to which the alarm is
   *                    associated. (optional)</li>
   *                    <li>status - The status of the alarm to search for. Should
   *                    not be used when &#x60;resolved&#x60; parameter is
   *                    provided. &gt;**&amp;#9432; Info:** If you query for
   *                    multiple alarm statuses at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>type - The types of alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    types at once, comma-separate the values. Space characters
   *                    in alarm types must be escaped. (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    alarms for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    alarms for related source devices will be included in the
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
   * @return AlarmCollection
   */
  @RequestLine("GET /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarmcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  AlarmCollection getAlarmCollectionResource(
      @QueryMap(encoded = true) GetAlarmCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all alarms
   * Retrieve all alarms on your tenant, or a specific subset based on queries.
   * The results are sorted by the newest alarms first. #### Query parameters The
   * query parameter &#x60;withTotalPages&#x60; only works when the user has the
   * ROLE_ALARM_READ role, otherwise it is ignored.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; The role ROLE_ALARM_READ
   * is not required, but if a user has this role, all the alarms on the tenant
   * are returned. If a user has access to alarms through inventory roles, only
   * those alarms are returned. &lt;/section&gt;
   * Note, this is equivalent to the other <code>getAlarmCollectionResource</code>
   * that receives the query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>createdFrom - Start date or date and time of the alarm
   *                    creation. (optional)</li>
   *                    <li>createdTo - End date or date and time of the alarm
   *                    creation. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>dateFrom - Start date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>dateTo - End date or date and time of the alarm
   *                    occurrence. (optional)</li>
   *                    <li>lastUpdatedFrom - Start date or date and time of the
   *                    last update made. (optional)</li>
   *                    <li>lastUpdatedTo - End date or date and time of the last
   *                    update made. (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>resolved - When set to &#x60;true&#x60; only alarms
   *                    with status CLEARED will be fetched, whereas
   *                    &#x60;false&#x60; will fetch all alarms with status ACTIVE
   *                    or ACKNOWLEDGED. Takes precedence over the
   *                    &#x60;status&#x60; parameter. (optional, default to
   *                    false)</li>
   *                    <li>severity - The severity of the alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    severities at once, comma-separate the values.
   *                    (optional)</li>
   *                    <li>source - The managed object ID to which the alarm is
   *                    associated. (optional)</li>
   *                    <li>status - The status of the alarm to search for. Should
   *                    not be used when &#x60;resolved&#x60; parameter is
   *                    provided. &gt;**&amp;#9432; Info:** If you query for
   *                    multiple alarm statuses at once, comma-separate the
   *                    values. (optional)</li>
   *                    <li>type - The types of alarm to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple alarm
   *                    types at once, comma-separate the values. Space characters
   *                    in alarm types must be escaped. (optional)</li>
   *                    <li>withSourceAssets - When set to &#x60;true&#x60; also
   *                    alarms for related source assets will be included in the
   *                    request. When this parameter is provided a
   *                    &#x60;source&#x60; must be specified. (optional, default
   *                    to false)</li>
   *                    <li>withSourceDevices - When set to &#x60;true&#x60; also
   *                    alarms for related source devices will be included in the
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
   * @return AlarmCollection
   */
  @RequestLine("GET /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&currentPage={currentPage}&dateFrom={dateFrom}&dateTo={dateTo}&lastUpdatedFrom={lastUpdatedFrom}&lastUpdatedTo={lastUpdatedTo}&pageSize={pageSize}&resolved={resolved}&severity={severity}&source={source}&status={status}&type={type}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarmcollection+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<AlarmCollection> getAlarmCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetAlarmCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAlarmCollectionResource</code> method in a fluent style.
   */
  public static class GetAlarmCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetAlarmCollectionResourceQueryParams createdFrom(final OffsetDateTime value) {
      put("createdFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams createdTo(final OffsetDateTime value) {
      put("createdTo", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams lastUpdatedFrom(final OffsetDateTime value) {
      put("lastUpdatedFrom", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams lastUpdatedTo(final OffsetDateTime value) {
      put("lastUpdatedTo", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams resolved(final Boolean value) {
      put("resolved", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams severity(final List<String> value) {
      put("severity", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams status(final List<String> value) {
      put("status", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams withSourceAssets(final Boolean value) {
      put("withSourceAssets", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams withSourceDevices(final Boolean value) {
      put("withSourceDevices", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetAlarmCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific alarm
   * Retrieve a specific alarm by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; ALARM_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the alarm. (required)
   * @return Alarm
   */
  @RequestLine("GET /alarm/alarms/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  Alarm getAlarmResource(@Param("id") String id);

  /**
   * Retrieve a specific alarm
   * Similar to <code>getAlarmResource</code> but it also returns the http
   * response headers .
   * Retrieve a specific alarm by a given ID. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_READ &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; ALARM_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the alarm. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /alarm/alarms/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Alarm> getAlarmResourceWithHttpInfo(@Param("id") String id);

  /**
   * Create an alarm
   * An alarm must be associated with a source (managed object) identified by
   * ID.&lt;br&gt; In general, each alarm may consist of: * A status showing
   * whether the alarm is ACTIVE, ACKNOWLEDGED or CLEARED. * A time stamp to
   * indicate when the alarm was last updated. * The severity of the alarm:
   * CRITICAL, MAJOR, MINOR or WARNING. * A history of changes to the event in
   * form of audit logs. ### Alarm suppression If the source device is in
   * maintenance mode, the alarm is not created and not reported to the Cumulocity
   * IoT event processing engine. When sending a POST request to create a new
   * alarm and if the source device is in maintenance mode, the self link of the
   * alarm will be: &#x60;&#x60;&#x60;json \&quot;self\&quot;:
   * \&quot;https://&lt;TENANT_DOMAIN&gt;/alarm/alarms/null\&quot;
   * &#x60;&#x60;&#x60; ### Alarm de-duplication If an ACTIVE or ACKNOWLEDGED
   * alarm with the same source and type exists, no new alarm is created. Instead,
   * the existing alarm is updated by incrementing the &#x60;count&#x60; property;
   * the &#x60;time&#x60; property is also updated. Any other changes are ignored,
   * and the alarm history is not updated. Alarms with status CLEARED are not
   * de-duplicated. The first occurrence of the alarm is recorded in the
   * &#x60;firstOccurrenceTime&#x60; property. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; ALARM_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param postAlarmCollectionResourceRequest (required)
   * @param accept                             Advertises which content types,
   *                                           expressed as MIME types, the client
   *                                           is able to understand. (optional)
   * @param xCumulocityProcessingMode          Used to explicitly control the
   *                                           processing mode of the request. See
   *                                           [Processing mode](#processing-mode)
   *                                           for more details. (optional,
   *                                           default to PERSISTENT)
   * @return Alarm
   */
  @RequestLine("POST /alarm/alarms")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Alarm postAlarmCollectionResource(PostAlarmCollectionResourceRequest postAlarmCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create an alarm
   * Similar to <code>postAlarmCollectionResource</code> but it also returns the
   * http response headers .
   * An alarm must be associated with a source (managed object) identified by
   * ID.&lt;br&gt; In general, each alarm may consist of: * A status showing
   * whether the alarm is ACTIVE, ACKNOWLEDGED or CLEARED. * A time stamp to
   * indicate when the alarm was last updated. * The severity of the alarm:
   * CRITICAL, MAJOR, MINOR or WARNING. * A history of changes to the event in
   * form of audit logs. ### Alarm suppression If the source device is in
   * maintenance mode, the alarm is not created and not reported to the Cumulocity
   * IoT event processing engine. When sending a POST request to create a new
   * alarm and if the source device is in maintenance mode, the self link of the
   * alarm will be: &#x60;&#x60;&#x60;json \&quot;self\&quot;:
   * \&quot;https://&lt;TENANT_DOMAIN&gt;/alarm/alarms/null\&quot;
   * &#x60;&#x60;&#x60; ### Alarm de-duplication If an ACTIVE or ACKNOWLEDGED
   * alarm with the same source and type exists, no new alarm is created. Instead,
   * the existing alarm is updated by incrementing the &#x60;count&#x60; property;
   * the &#x60;time&#x60; property is also updated. Any other changes are ignored,
   * and the alarm history is not updated. Alarms with status CLEARED are not
   * de-duplicated. The first occurrence of the alarm is recorded in the
   * &#x60;firstOccurrenceTime&#x60; property. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_ALARM_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; ALARM_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param postAlarmCollectionResourceRequest (required)
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
  @RequestLine("POST /alarm/alarms")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Alarm> postAlarmCollectionResourceWithHttpInfo(
      PostAlarmCollectionResourceRequest postAlarmCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update alarm collections
   * Update alarm collections specified by query parameters. At least one query
   * parameter is required to avoid accidentally updating all existing
   * alarms.&lt;br&gt; Currently, only the status of alarms can be modified. &gt;
   * **&amp;#9432; Info:** Since this operation can take considerable time, the
   * request returns after maximum 0.5 seconds of processing, and the update
   * operation continues as a background process in the platform.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;/section&gt;
   * 
   * @param putAlarmCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @param xCumulocityProcessingMode         Used to explicitly control the
   *                                          processing mode of the request. See
   *                                          [Processing mode](#processing-mode)
   *                                          for more details. (optional, default
   *                                          to PERSISTENT)
   * @param createdFrom                       Start date or date and time of the
   *                                          alarm creation. (optional)
   * @param createdTo                         End date or date and time of the
   *                                          alarm creation. (optional)
   * @param dateFrom                          Start date or date and time of the
   *                                          alarm occurrence. (optional)
   * @param dateTo                            End date or date and time of the
   *                                          alarm occurrence. (optional)
   * @param resolved                          When set to &#x60;true&#x60; only
   *                                          alarms with status CLEARED will be
   *                                          fetched, whereas &#x60;false&#x60;
   *                                          will fetch all alarms with status
   *                                          ACTIVE or ACKNOWLEDGED. Takes
   *                                          precedence over the
   *                                          &#x60;status&#x60; parameter.
   *                                          (optional, default to false)
   * @param severity                          The severity of the alarm to search
   *                                          for. &gt;**&amp;#9432; Info:** If
   *                                          you query for multiple alarm
   *                                          severities at once, comma-separate
   *                                          the values. (optional)
   * @param source                            The managed object ID to which the
   *                                          alarm is associated. (optional)
   * @param status                            The status of the alarm to search
   *                                          for. Should not be used when
   *                                          &#x60;resolved&#x60; parameter is
   *                                          provided. &gt;**&amp;#9432; Info:**
   *                                          If you query for multiple alarm
   *                                          statuses at once, comma-separate the
   *                                          values. (optional)
   * @param withSourceAssets                  When set to &#x60;true&#x60; also
   *                                          alarms for related source assets
   *                                          will be included in the request.
   *                                          When this parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)
   * @param withSourceDevices                 When set to &#x60;true&#x60; also
   *                                          alarms for related source devices
   *                                          will be included in the request.
   *                                          When this parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)
   */
  @RequestLine("PUT /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void putAlarmCollectionResource(PutAlarmCollectionResourceRequest putAlarmCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("resolved") Boolean resolved, @Param("severity") List<String> severity, @Param("source") String source,
      @Param("status") List<String> status, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Update alarm collections
   * Similar to <code>putAlarmCollectionResource</code> but it also returns the
   * http response headers .
   * Update alarm collections specified by query parameters. At least one query
   * parameter is required to avoid accidentally updating all existing
   * alarms.&lt;br&gt; Currently, only the status of alarms can be modified. &gt;
   * **&amp;#9432; Info:** Since this operation can take considerable time, the
   * request returns after maximum 0.5 seconds of processing, and the update
   * operation continues as a background process in the platform.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;/section&gt;
   * 
   * @param putAlarmCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @param xCumulocityProcessingMode         Used to explicitly control the
   *                                          processing mode of the request. See
   *                                          [Processing mode](#processing-mode)
   *                                          for more details. (optional, default
   *                                          to PERSISTENT)
   * @param createdFrom                       Start date or date and time of the
   *                                          alarm creation. (optional)
   * @param createdTo                         End date or date and time of the
   *                                          alarm creation. (optional)
   * @param dateFrom                          Start date or date and time of the
   *                                          alarm occurrence. (optional)
   * @param dateTo                            End date or date and time of the
   *                                          alarm occurrence. (optional)
   * @param resolved                          When set to &#x60;true&#x60; only
   *                                          alarms with status CLEARED will be
   *                                          fetched, whereas &#x60;false&#x60;
   *                                          will fetch all alarms with status
   *                                          ACTIVE or ACKNOWLEDGED. Takes
   *                                          precedence over the
   *                                          &#x60;status&#x60; parameter.
   *                                          (optional, default to false)
   * @param severity                          The severity of the alarm to search
   *                                          for. &gt;**&amp;#9432; Info:** If
   *                                          you query for multiple alarm
   *                                          severities at once, comma-separate
   *                                          the values. (optional)
   * @param source                            The managed object ID to which the
   *                                          alarm is associated. (optional)
   * @param status                            The status of the alarm to search
   *                                          for. Should not be used when
   *                                          &#x60;resolved&#x60; parameter is
   *                                          provided. &gt;**&amp;#9432; Info:**
   *                                          If you query for multiple alarm
   *                                          statuses at once, comma-separate the
   *                                          values. (optional)
   * @param withSourceAssets                  When set to &#x60;true&#x60; also
   *                                          alarms for related source assets
   *                                          will be included in the request.
   *                                          When this parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)
   * @param withSourceDevices                 When set to &#x60;true&#x60; also
   *                                          alarms for related source devices
   *                                          will be included in the request.
   *                                          When this parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)
   */
  @RequestLine("PUT /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> putAlarmCollectionResourceWithHttpInfo(
      PutAlarmCollectionResourceRequest putAlarmCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("createdFrom") OffsetDateTime createdFrom, @Param("createdTo") OffsetDateTime createdTo,
      @Param("dateFrom") OffsetDateTime dateFrom, @Param("dateTo") OffsetDateTime dateTo,
      @Param("resolved") Boolean resolved, @Param("severity") List<String> severity, @Param("source") String source,
      @Param("status") List<String> status, @Param("withSourceAssets") Boolean withSourceAssets,
      @Param("withSourceDevices") Boolean withSourceDevices);

  /**
   * Update alarm collections
   * Update alarm collections specified by query parameters. At least one query
   * parameter is required to avoid accidentally updating all existing
   * alarms.&lt;br&gt; Currently, only the status of alarms can be modified. &gt;
   * **&amp;#9432; Info:** Since this operation can take considerable time, the
   * request returns after maximum 0.5 seconds of processing, and the update
   * operation continues as a background process in the platform.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;/section&gt;
   * Note, this is equivalent to the other <code>putAlarmCollectionResource</code>
   * method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PutAlarmCollectionResourceQueryParams} class that allows
   * for
   * building up this map in a fluent style.
   * 
   * @param putAlarmCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @param xCumulocityProcessingMode         Used to explicitly control the
   *                                          processing mode of the request. See
   *                                          [Processing mode](#processing-mode)
   *                                          for more details. (optional, default
   *                                          to PERSISTENT)
   * @param queryParams                       Map of query parameters as
   *                                          name-value pairs
   *                                          <p>
   *                                          The following elements may be
   *                                          specified in the query map:
   *                                          </p>
   *                                          <ul>
   *                                          <li>createdFrom - Start date or date
   *                                          and time of the alarm creation.
   *                                          (optional)</li>
   *                                          <li>createdTo - End date or date and
   *                                          time of the alarm creation.
   *                                          (optional)</li>
   *                                          <li>dateFrom - Start date or date
   *                                          and time of the alarm occurrence.
   *                                          (optional)</li>
   *                                          <li>dateTo - End date or date and
   *                                          time of the alarm occurrence.
   *                                          (optional)</li>
   *                                          <li>resolved - When set to
   *                                          &#x60;true&#x60; only alarms with
   *                                          status CLEARED will be fetched,
   *                                          whereas &#x60;false&#x60; will fetch
   *                                          all alarms with status ACTIVE or
   *                                          ACKNOWLEDGED. Takes precedence over
   *                                          the &#x60;status&#x60; parameter.
   *                                          (optional, default to false)</li>
   *                                          <li>severity - The severity of the
   *                                          alarm to search for.
   *                                          &gt;**&amp;#9432; Info:** If you
   *                                          query for multiple alarm severities
   *                                          at once, comma-separate the values.
   *                                          (optional)</li>
   *                                          <li>source - The managed object ID
   *                                          to which the alarm is associated.
   *                                          (optional)</li>
   *                                          <li>status - The status of the alarm
   *                                          to search for. Should not be used
   *                                          when &#x60;resolved&#x60; parameter
   *                                          is provided. &gt;**&amp;#9432;
   *                                          Info:** If you query for multiple
   *                                          alarm statuses at once,
   *                                          comma-separate the values.
   *                                          (optional)</li>
   *                                          <li>withSourceAssets - When set to
   *                                          &#x60;true&#x60; also alarms for
   *                                          related source assets will be
   *                                          included in the request. When this
   *                                          parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)</li>
   *                                          <li>withSourceDevices - When set to
   *                                          &#x60;true&#x60; also alarms for
   *                                          related source devices will be
   *                                          included in the request. When this
   *                                          parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)</li>
   *                                          </ul>
   */
  @RequestLine("PUT /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  void putAlarmCollectionResource(PutAlarmCollectionResourceRequest putAlarmCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PutAlarmCollectionResourceQueryParams queryParams);

  /**
   * Update alarm collections
   * Update alarm collections specified by query parameters. At least one query
   * parameter is required to avoid accidentally updating all existing
   * alarms.&lt;br&gt; Currently, only the status of alarms can be modified. &gt;
   * **&amp;#9432; Info:** Since this operation can take considerable time, the
   * request returns after maximum 0.5 seconds of processing, and the update
   * operation continues as a background process in the platform.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;/section&gt;
   * Note, this is equivalent to the other <code>putAlarmCollectionResource</code>
   * that receives the query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param putAlarmCollectionResourceRequest (required)
   * @param accept                            Advertises which content types,
   *                                          expressed as MIME types, the client
   *                                          is able to understand. (optional)
   * @param xCumulocityProcessingMode         Used to explicitly control the
   *                                          processing mode of the request. See
   *                                          [Processing mode](#processing-mode)
   *                                          for more details. (optional, default
   *                                          to PERSISTENT)
   * @param queryParams                       Map of query parameters as
   *                                          name-value pairs
   *                                          <p>
   *                                          The following elements may be
   *                                          specified in the query map:
   *                                          </p>
   *                                          <ul>
   *                                          <li>createdFrom - Start date or date
   *                                          and time of the alarm creation.
   *                                          (optional)</li>
   *                                          <li>createdTo - End date or date and
   *                                          time of the alarm creation.
   *                                          (optional)</li>
   *                                          <li>dateFrom - Start date or date
   *                                          and time of the alarm occurrence.
   *                                          (optional)</li>
   *                                          <li>dateTo - End date or date and
   *                                          time of the alarm occurrence.
   *                                          (optional)</li>
   *                                          <li>resolved - When set to
   *                                          &#x60;true&#x60; only alarms with
   *                                          status CLEARED will be fetched,
   *                                          whereas &#x60;false&#x60; will fetch
   *                                          all alarms with status ACTIVE or
   *                                          ACKNOWLEDGED. Takes precedence over
   *                                          the &#x60;status&#x60; parameter.
   *                                          (optional, default to false)</li>
   *                                          <li>severity - The severity of the
   *                                          alarm to search for.
   *                                          &gt;**&amp;#9432; Info:** If you
   *                                          query for multiple alarm severities
   *                                          at once, comma-separate the values.
   *                                          (optional)</li>
   *                                          <li>source - The managed object ID
   *                                          to which the alarm is associated.
   *                                          (optional)</li>
   *                                          <li>status - The status of the alarm
   *                                          to search for. Should not be used
   *                                          when &#x60;resolved&#x60; parameter
   *                                          is provided. &gt;**&amp;#9432;
   *                                          Info:** If you query for multiple
   *                                          alarm statuses at once,
   *                                          comma-separate the values.
   *                                          (optional)</li>
   *                                          <li>withSourceAssets - When set to
   *                                          &#x60;true&#x60; also alarms for
   *                                          related source assets will be
   *                                          included in the request. When this
   *                                          parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)</li>
   *                                          <li>withSourceDevices - When set to
   *                                          &#x60;true&#x60; also alarms for
   *                                          related source devices will be
   *                                          included in the request. When this
   *                                          parameter is provided a
   *                                          &#x60;source&#x60; must be
   *                                          specified. (optional, default to
   *                                          false)</li>
   *                                          </ul>
   */
  @RequestLine("PUT /alarm/alarms?createdFrom={createdFrom}&createdTo={createdTo}&dateFrom={dateFrom}&dateTo={dateTo}&resolved={resolved}&severity={severity}&source={source}&status={status}&withSourceAssets={withSourceAssets}&withSourceDevices={withSourceDevices}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Void> putAlarmCollectionResourceWithHttpInfo(
      PutAlarmCollectionResourceRequest putAlarmCollectionResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PutAlarmCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>putAlarmCollectionResource</code> method in a fluent style.
   */
  public static class PutAlarmCollectionResourceQueryParams extends HashMap<String, Object> {
    public PutAlarmCollectionResourceQueryParams createdFrom(final OffsetDateTime value) {
      put("createdFrom", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams createdTo(final OffsetDateTime value) {
      put("createdTo", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams dateFrom(final OffsetDateTime value) {
      put("dateFrom", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams dateTo(final OffsetDateTime value) {
      put("dateTo", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams resolved(final Boolean value) {
      put("resolved", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams severity(final List<String> value) {
      put("severity", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams source(final String value) {
      put("source", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams status(final List<String> value) {
      put("status", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams withSourceAssets(final Boolean value) {
      put("withSourceAssets", EncodingUtils.encode(value));
      return this;
    }

    public PutAlarmCollectionResourceQueryParams withSourceDevices(final Boolean value) {
      put("withSourceDevices", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a specific alarm
   * Update a specific alarm by a given ID. Only text, status, severity and custom
   * properties can be modified. A request will be rejected when non-modifiable
   * properties are provided in the request body. &gt; **&amp;#9432; Info:**
   * Changes to alarms will generate a new audit record. The audit record will
   * include the username and application that triggered the update, if
   * applicable. If the update operation doesn’t change anything (that is, the
   * request body contains data that is identical to the already present in the
   * database), there will be no audit record added and no notifications will be
   * sent. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; ALARM_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the alarm. (required)
   * @param putAlarmResourceRequest   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return Alarm
   */
  @RequestLine("PUT /alarm/alarms/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  Alarm putAlarmResource(@Param("id") String id, PutAlarmResourceRequest putAlarmResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Update a specific alarm
   * Similar to <code>putAlarmResource</code> but it also returns the http
   * response headers .
   * Update a specific alarm by a given ID. Only text, status, severity and custom
   * properties can be modified. A request will be rejected when non-modifiable
   * properties are provided in the request body. &gt; **&amp;#9432; Info:**
   * Changes to alarms will generate a new audit record. The audit record will
   * include the username and application that triggered the update, if
   * applicable. If the update operation doesn’t change anything (that is, the
   * request body contains data that is identical to the already present in the
   * database), there will be no audit record added and no notifications will be
   * sent. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_ALARM_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; ALARM_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id                        Unique identifier of the alarm. (required)
   * @param putAlarmResourceRequest   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /alarm/alarms/{id}")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.alarm+json",
      "Accept: application/vnd.com.nsn.cumulocity.alarm+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<Alarm> putAlarmResourceWithHttpInfo(@Param("id") String id,
      PutAlarmResourceRequest putAlarmResourceRequest, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
