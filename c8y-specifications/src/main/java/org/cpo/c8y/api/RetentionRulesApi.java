package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.PostRetentionRuleCollectionResourceRequest;
import org.cpo.c8y.model.RetentionRule;
import org.cpo.c8y.model.RetentionRuleCollection;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface RetentionRulesApi extends ApiClient.Api {

    /**
     * Remove a retention rule
     * Remove a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; the rule is editable &lt;/section&gt;
     * 
     * @param id Unique identifier of the retention rule. (required)
     */
    @RequestLine("DELETE /retention/retentions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteRetentionRuleResource(@Param("id") String id);

    /**
     * Remove a retention rule
     * Similar to <code>deleteRetentionRuleResource</code> but it also returns the
     * http response headers .
     * Remove a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; the rule is editable &lt;/section&gt;
     * 
     * @param id Unique identifier of the retention rule. (required)
     */
    @RequestLine("DELETE /retention/retentions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteRetentionRuleResourceWithHttpInfo(@Param("id") String id);

    /**
     * Retrieve all retention rules
     * Retrieve all retention rules on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
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
     * @return RetentionRuleCollection
     */
    @RequestLine("GET /retention/retentions?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrulecollection+json",
    })
    RetentionRuleCollection getRetentionRuleCollectionResource(@Param("currentPage") Integer currentPage,
            @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
            @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all retention rules
     * Similar to <code>getRetentionRuleCollectionResource</code> but it also
     * returns the http response headers .
     * Retrieve all retention rules on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
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
    @RequestLine("GET /retention/retentions?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrulecollection+json",
    })
    ApiResponse<RetentionRuleCollection> getRetentionRuleCollectionResourceWithHttpInfo(
            @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
            @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

    /**
     * Retrieve all retention rules
     * Retrieve all retention rules on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getRetentionRuleCollectionResource</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetRetentionRuleCollectionResourceQueryParams} class
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
     * @return RetentionRuleCollection
     */
    @RequestLine("GET /retention/retentions?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrulecollection+json",
    })
    RetentionRuleCollection getRetentionRuleCollectionResource(
            @QueryMap(encoded = true) GetRetentionRuleCollectionResourceQueryParams queryParams);

    /**
     * Retrieve all retention rules
     * Retrieve all retention rules on your tenant.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
     * Note, this is equivalent to the other
     * <code>getRetentionRuleCollectionResource</code> that receives the query
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
     * @return RetentionRuleCollection
     */
    @RequestLine("GET /retention/retentions?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrulecollection+json",
    })
    ApiResponse<RetentionRuleCollection> getRetentionRuleCollectionResourceWithHttpInfo(
            @QueryMap(encoded = true) GetRetentionRuleCollectionResourceQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getRetentionRuleCollectionResource</code> method in a fluent style.
     */
    public static class GetRetentionRuleCollectionResourceQueryParams extends HashMap<String, Object> {
        public GetRetentionRuleCollectionResourceQueryParams currentPage(final Integer value) {
            put("currentPage", EncodingUtils.encode(value));
            return this;
        }

        public GetRetentionRuleCollectionResourceQueryParams pageSize(final Integer value) {
            put("pageSize", EncodingUtils.encode(value));
            return this;
        }

        public GetRetentionRuleCollectionResourceQueryParams withTotalElements(final Boolean value) {
            put("withTotalElements", EncodingUtils.encode(value));
            return this;
        }

        public GetRetentionRuleCollectionResourceQueryParams withTotalPages(final Boolean value) {
            put("withTotalPages", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Retrieve a retention rule
     * Retrieve a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the retention rule. (required)
     * @return RetentionRule
     */
    @RequestLine("GET /retention/retentions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
    })
    RetentionRule getRetentionRuleResource(@Param("id") String id);

    /**
     * Retrieve a retention rule
     * Similar to <code>getRetentionRuleResource</code> but it also returns the http
     * response headers .
     * Retrieve a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_READ
     * &lt;/section&gt;
     * 
     * @param id Unique identifier of the retention rule. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /retention/retentions/{id}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
    })
    ApiResponse<RetentionRule> getRetentionRuleResourceWithHttpInfo(@Param("id") String id);

    /**
     * Create a retention rule
     * Create a retention rule on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN &lt;/section&gt;
     * 
     * @param postRetentionRuleCollectionResourceRequest (required)
     * @param accept                                     Advertises which content
     *                                                   types, expressed as MIME
     *                                                   types, the client is able
     *                                                   to understand. (optional)
     * @return RetentionRule
     */
    @RequestLine("POST /retention/retentions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: {accept}"
    })
    RetentionRule postRetentionRuleCollectionResource(
            PostRetentionRuleCollectionResourceRequest postRetentionRuleCollectionResourceRequest,
            @Param("accept") String accept);

    /**
     * Create a retention rule
     * Similar to <code>postRetentionRuleCollectionResource</code> but it also
     * returns the http response headers .
     * Create a retention rule on your tenant. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN &lt;/section&gt;
     * 
     * @param postRetentionRuleCollectionResourceRequest (required)
     * @param accept                                     Advertises which content
     *                                                   types, expressed as MIME
     *                                                   types, the client is able
     *                                                   to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /retention/retentions")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: {accept}"
    })
    ApiResponse<RetentionRule> postRetentionRuleCollectionResourceWithHttpInfo(
            PostRetentionRuleCollectionResourceRequest postRetentionRuleCollectionResourceRequest,
            @Param("accept") String accept);

    /**
     * Update a retention rule
     * Update a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; (the rule is editable &lt;b&gt;OR&lt;/b&gt; it&#39;s
     * the tenant management) &lt;/section&gt;
     * 
     * @param id            Unique identifier of the retention rule. (required)
     * @param retentionRule (required)
     * @param accept        Advertises which content types, expressed as MIME types,
     *                      the client is able to understand. (optional)
     * @return RetentionRule
     */
    @RequestLine("PUT /retention/retentions/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: {accept}"
    })
    RetentionRule putRetentionRuleResource(@Param("id") String id, RetentionRule retentionRule,
            @Param("accept") String accept);

    /**
     * Update a retention rule
     * Similar to <code>putRetentionRuleResource</code> but it also returns the http
     * response headers .
     * Update a specific retention rule by a given ID.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_RETENTION_RULE_ADMIN
     * &lt;b&gt;AND&lt;/b&gt; (the rule is editable &lt;b&gt;OR&lt;/b&gt; it&#39;s
     * the tenant management) &lt;/section&gt;
     * 
     * @param id            Unique identifier of the retention rule. (required)
     * @param retentionRule (required)
     * @param accept        Advertises which content types, expressed as MIME types,
     *                      the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /retention/retentions/{id}")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.retentionrule+json",
            "Accept: {accept}"
    })
    ApiResponse<RetentionRule> putRetentionRuleResourceWithHttpInfo(@Param("id") String id, RetentionRule retentionRule,
            @Param("accept") String accept);

}
