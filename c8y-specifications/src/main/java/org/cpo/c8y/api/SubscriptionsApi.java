package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.NotificationSubscription;
import org.cpo.c8y.model.NotificationSubscriptionCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface SubscriptionsApi extends ApiClient.Api {

    /**
     * Remove subscriptions by source
     * Remove subscriptions by source and context. &gt;**&amp;#9432; Info:** The
     * request will result in an error if there are no query parameters. The
     * &#x60;source&#x60; parameter is optional only if the &#x60;context&#x60;
     * parameter equals &#x60;tenant&#x60;. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param context                   The context to which the subscription is
     *                                  associated. &gt; **&amp;#9432; Info:** If
     *                                  the value is &#x60;mo&#x60; (managed
     *                                  object), then &#x60;source&#x60; must also
     *                                  be provided in the query. (optional, default
     *                                  to mo)
     * @param source                    The managed object ID to which the
     *                                  subscription is associated. (optional)
     */
    @RequestLine("DELETE /notification2/subscriptions?context={context}&source={source}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    void deleteNotificationSubscriptionBySourceResource(
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("context") String context,
            @Param("source") String source);

    /**
     * Remove subscriptions by source
     * Similar to <code>deleteNotificationSubscriptionBySourceResource</code> but it
     * also returns the http response headers .
     * Remove subscriptions by source and context. &gt;**&amp;#9432; Info:** The
     * request will result in an error if there are no query parameters. The
     * &#x60;source&#x60; parameter is optional only if the &#x60;context&#x60;
     * parameter equals &#x60;tenant&#x60;. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @param context                   The context to which the subscription is
     *                                  associated. &gt; **&amp;#9432; Info:** If
     *                                  the value is &#x60;mo&#x60; (managed
     *                                  object), then &#x60;source&#x60; must also
     *                                  be provided in the query. (optional, default
     *                                  to mo)
     * @param source                    The managed object ID to which the
     *                                  subscription is associated. (optional)
     */
    @RequestLine("DELETE /notification2/subscriptions?context={context}&source={source}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Void> deleteNotificationSubscriptionBySourceResourceWithHttpInfo(
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode, @Param("context") String context,
            @Param("source") String source);

    /**
     * Remove subscriptions by source
     * Remove subscriptions by source and context. &gt;**&amp;#9432; Info:** The
     * request will result in an error if there are no query parameters. The
     * &#x60;source&#x60; parameter is optional only if the &#x60;context&#x60;
     * parameter equals &#x60;tenant&#x60;. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>deleteNotificationSubscriptionBySourceResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the
     * {@link DeleteNotificationSubscriptionBySourceResourceQueryParams} class that
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
     *                                  <li>context - The context to which the
     *                                  subscription is associated. &gt;
     *                                  **&amp;#9432; Info:** If the value is
     *                                  &#x60;mo&#x60; (managed object), then
     *                                  &#x60;source&#x60; must also be provided in
     *                                  the query. (optional, default to mo)</li>
     *                                  <li>source - The managed object ID to which
     *                                  the subscription is associated.
     *                                  (optional)</li>
     *                                  </ul>
     */
    @RequestLine("DELETE /notification2/subscriptions?context={context}&source={source}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    void deleteNotificationSubscriptionBySourceResource(
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) DeleteNotificationSubscriptionBySourceResourceQueryParams queryParams);

    /**
     * Remove subscriptions by source
     * Remove subscriptions by source and context. &gt;**&amp;#9432; Info:** The
     * request will result in an error if there are no query parameters. The
     * &#x60;source&#x60; parameter is optional only if the &#x60;context&#x60;
     * parameter equals &#x60;tenant&#x60;. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>deleteNotificationSubscriptionBySourceResource</code> that receives the
     * query parameters as a map,
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
     *                                  <li>context - The context to which the
     *                                  subscription is associated. &gt;
     *                                  **&amp;#9432; Info:** If the value is
     *                                  &#x60;mo&#x60; (managed object), then
     *                                  &#x60;source&#x60; must also be provided in
     *                                  the query. (optional, default to mo)</li>
     *                                  <li>source - The managed object ID to which
     *                                  the subscription is associated.
     *                                  (optional)</li>
     *                                  </ul>
     */
    @RequestLine("DELETE /notification2/subscriptions?context={context}&source={source}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Void> deleteNotificationSubscriptionBySourceResourceWithHttpInfo(
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
            @QueryMap(encoded = true) DeleteNotificationSubscriptionBySourceResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>deleteNotificationSubscriptionBySourceResource</code> method in a
     * fluent style.
     */
    public static class DeleteNotificationSubscriptionBySourceResourceQueryParams extends HashMap<String, Object> {
        public DeleteNotificationSubscriptionBySourceResourceQueryParams context(final String value) {
            put("context", EncodingUtils.encode(value));
            return this;
        }

        public DeleteNotificationSubscriptionBySourceResourceQueryParams source(final String value) {
            put("source", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Remove a specific subscription
     * Remove a specific subscription by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN
     * &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the notification
     *                                  subscription. (required)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     */
    @RequestLine("DELETE /notification2/subscriptions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    void deleteNotificationSubscriptionResource(@Param("id") String id,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Remove a specific subscription
     * Similar to <code>deleteNotificationSubscriptionResource</code> but it also
     * returns the http response headers .
     * Remove a specific subscription by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN
     * &lt;/section&gt;
     * 
     * @param id                        Unique identifier of the notification
     *                                  subscription. (required)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     */
    @RequestLine("DELETE /notification2/subscriptions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<Void> deleteNotificationSubscriptionResourceWithHttpInfo(@Param("id") String id,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Retrieve all subscriptions
     * Retrieve all subscriptions on your tenant, or a specific subset based on
     * queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param context           The context to which the subscription is associated.
     *                          (optional)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param source            The managed object ID to which the subscription is
     *                          associated. (optional)
     * @param subscription      The subscription name by which filtering will be
     *                          done. (optional)
     * @param typeFilter        The type used to filter subscriptions. This will
     *                          check the subscription&#39;s
     *                          &#x60;subscriptionFilter.typeFilter&#x60; field.
     *                          &gt; **&amp;#9432; Info:** Filtering by
     *                          &#x60;typeFilter&#x60; may affect paging. Additional
     *                          post filtering may be performed if OData-like
     *                          expressions are used in the subscriptions.
     *                          (optional)
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
     * @return NotificationSubscriptionCollection
     */
    @RequestLine("GET /notification2/subscriptions?context={context}&currentPage={currentPage}&pageSize={pageSize}&source={source}&subscription={subscription}&typeFilter={typeFilter}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscriptioncollection+json",
    })
    NotificationSubscriptionCollection getNotificationSubscriptionCollectionResource(@Param("context") String context,
            @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
            @Param("source") String source,
            @Param("subscription") String subscription, @Param("typeFilter") String typeFilter,
            @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all subscriptions
     * Similar to <code>getNotificationSubscriptionCollectionResource</code> but it
     * also returns the http response headers .
     * Retrieve all subscriptions on your tenant, or a specific subset based on
     * queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param context           The context to which the subscription is associated.
     *                          (optional)
     * @param currentPage       The current page of the paginated results.
     *                          (optional, default to 1)
     * @param pageSize          Indicates how many entries of the collection shall
     *                          be returned. The upper limit for one page is 2,000
     *                          objects. (optional, default to 5)
     * @param source            The managed object ID to which the subscription is
     *                          associated. (optional)
     * @param subscription      The subscription name by which filtering will be
     *                          done. (optional)
     * @param typeFilter        The type used to filter subscriptions. This will
     *                          check the subscription&#39;s
     *                          &#x60;subscriptionFilter.typeFilter&#x60; field.
     *                          &gt; **&amp;#9432; Info:** Filtering by
     *                          &#x60;typeFilter&#x60; may affect paging. Additional
     *                          post filtering may be performed if OData-like
     *                          expressions are used in the subscriptions.
     *                          (optional)
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
    @RequestLine("GET /notification2/subscriptions?context={context}&currentPage={currentPage}&pageSize={pageSize}&source={source}&subscription={subscription}&typeFilter={typeFilter}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscriptioncollection+json",
    })
    ApiResponse<NotificationSubscriptionCollection> getNotificationSubscriptionCollectionResourceWithHttpInfo(
            @Param("context") String context, @Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize,
            @Param("source") String source, @Param("subscription") String subscription,
            @Param("typeFilter") String typeFilter, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all subscriptions
     * Retrieve all subscriptions on your tenant, or a specific subset based on
     * queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getNotificationSubscriptionCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the
     * {@link GetNotificationSubscriptionCollectionResourceQueryParams} class that
     * allows for
     * building up this map in a fluent style.
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>context - The context to which the subscription is
     *                    associated. (optional)</li>
     *                    <li>currentPage - The current page of the paginated
     *                    results. (optional, default to 1)</li>
     *                    <li>pageSize - Indicates how many entries of the
     *                    collection shall be returned. The upper limit for one page
     *                    is 2,000 objects. (optional, default to 5)</li>
     *                    <li>source - The managed object ID to which the
     *                    subscription is associated. (optional)</li>
     *                    <li>subscription - The subscription name by which
     *                    filtering will be done. (optional)</li>
     *                    <li>typeFilter - The type used to filter subscriptions.
     *                    This will check the subscription&#39;s
     *                    &#x60;subscriptionFilter.typeFilter&#x60; field. &gt;
     *                    **&amp;#9432; Info:** Filtering by &#x60;typeFilter&#x60;
     *                    may affect paging. Additional post filtering may be
     *                    performed if OData-like expressions are used in the
     *                    subscriptions. (optional)</li>
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
     * @return NotificationSubscriptionCollection
     */
    @RequestLine("GET /notification2/subscriptions?context={context}&currentPage={currentPage}&pageSize={pageSize}&source={source}&subscription={subscription}&typeFilter={typeFilter}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscriptioncollection+json",
    })
    NotificationSubscriptionCollection getNotificationSubscriptionCollectionResource(
            @QueryMap(encoded = true) GetNotificationSubscriptionCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all subscriptions
     * Retrieve all subscriptions on your tenant, or a specific subset based on
     * queries. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getNotificationSubscriptionCollectionResource</code> that receives the
     * query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>context - The context to which the subscription is
     *                    associated. (optional)</li>
     *                    <li>currentPage - The current page of the paginated
     *                    results. (optional, default to 1)</li>
     *                    <li>pageSize - Indicates how many entries of the
     *                    collection shall be returned. The upper limit for one page
     *                    is 2,000 objects. (optional, default to 5)</li>
     *                    <li>source - The managed object ID to which the
     *                    subscription is associated. (optional)</li>
     *                    <li>subscription - The subscription name by which
     *                    filtering will be done. (optional)</li>
     *                    <li>typeFilter - The type used to filter subscriptions.
     *                    This will check the subscription&#39;s
     *                    &#x60;subscriptionFilter.typeFilter&#x60; field. &gt;
     *                    **&amp;#9432; Info:** Filtering by &#x60;typeFilter&#x60;
     *                    may affect paging. Additional post filtering may be
     *                    performed if OData-like expressions are used in the
     *                    subscriptions. (optional)</li>
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
     * @return NotificationSubscriptionCollection
     */
    @RequestLine("GET /notification2/subscriptions?context={context}&currentPage={currentPage}&pageSize={pageSize}&source={source}&subscription={subscription}&typeFilter={typeFilter}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscriptioncollection+json",
    })
    ApiResponse<NotificationSubscriptionCollection> getNotificationSubscriptionCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetNotificationSubscriptionCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getNotificationSubscriptionCollectionResource</code> method in a fluent
     * style.
     */
    public static class GetNotificationSubscriptionCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetNotificationSubscriptionCollectionResourceQueryParams context(final String value) {
            put("context", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams source(final String value) {
            put("source", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams subscription(final String value) {
            put("subscription", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams typeFilter(final String value) {
            put("typeFilter", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetNotificationSubscriptionCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a specific subscription
     * Retrieve a specific subscription by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the notification subscription. (required)
     * @return NotificationSubscription
     */
    @RequestLine("GET /notification2/subscriptions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscription+json",
    })
    NotificationSubscription getNotificationSubscriptionResource(@Param("id") String id);

    /**
     * Retrieve a specific subscription
     * Similar to <code>getNotificationSubscriptionResource</code> but it also
     * returns the http response headers .
     * Retrieve a specific subscription by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the notification subscription. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /notification2/subscriptions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscription+json",
    })
    ApiResponse<NotificationSubscription> getNotificationSubscriptionResourceWithHttpInfo(@Param("id") String id);

    /**
     * Create a subscription
     * Create a new subscription, for example, a subscription that forwards
     * measurements and events of a specific type for a given device. In general,
     * each subscription may consist of: * The managed object to which the
     * subscription is associated. * The context under which the subscription is to
     * be processed. * The name of the subscription. * The applicable filter
     * criteria. * The option to only include specific custom fragments in the
     * forwarded data. * The option to use persistent or non-persistent message
     * storage. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param notificationSubscription  (required)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @return NotificationSubscription
     */
    @RequestLine("POST /notification2/subscriptions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.subscription+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscription+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    NotificationSubscription postNotificationSubscriptionResource(NotificationSubscription notificationSubscription,
            @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

    /**
     * Create a subscription
     * Similar to <code>postNotificationSubscriptionResource</code> but it also
     * returns the http response headers .
     * Create a new subscription, for example, a subscription that forwards
     * measurements and events of a specific type for a given device. In general,
     * each subscription may consist of: * The managed object to which the
     * subscription is associated. * The context under which the subscription is to
     * be processed. * The name of the subscription. * The applicable filter
     * criteria. * The option to only include specific custom fragments in the
     * forwarded data. * The option to use persistent or non-persistent message
     * storage. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
     * 
     * @param notificationSubscription  (required)
     * @param accept                    Advertises which content types, expressed as
     *                                  MIME types, the client is able to
     *                                  understand. (optional)
     * @param xCumulocityProcessingMode Used to explicitly control the processing
     *                                  mode of the request. See [Processing
     *                                  mode](#processing-mode) for more details.
     *                                  (optional, default to PERSISTENT)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /notification2/subscriptions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.subscription+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.subscription+json",
            "Accept: {accept}",

            "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
    })
    ApiResponse<NotificationSubscription> postNotificationSubscriptionResourceWithHttpInfo(
            NotificationSubscription notificationSubscription, @Param("accept") String accept,
            @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
