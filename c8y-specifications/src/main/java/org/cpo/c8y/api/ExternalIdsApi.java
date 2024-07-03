package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.ExternalId;
import org.cpo.c8y.model.ExternalIds;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ExternalIdsApi extends ApiClient.Api {

    /**
     * Remove a specific external ID
     * Remove a specific external ID of a particular type.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_ADMIN permission on the resource &lt;/section&gt;
     * 
     * @param type       The identifier used in the external system that Cumulocity
     *                   IoT interfaces with. (required)
     * @param externalId The type of the external identifier. (required)
     */
    @RequestLine("DELETE /identity/externalIds/{type}/{externalId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteExternalIDResource(@Param("type") String type, @Param("externalId") String externalId);

    /**
     * Remove a specific external ID
     * Similar to <code>deleteExternalIDResource</code> but it also returns the http
     * response headers .
     * Remove a specific external ID of a particular type.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_ADMIN permission on the resource &lt;/section&gt;
     * 
     * @param type       The identifier used in the external system that Cumulocity
     *                   IoT interfaces with. (required)
     * @param externalId The type of the external identifier. (required)
     */
    @RequestLine("DELETE /identity/externalIds/{type}/{externalId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteExternalIDResourceWithHttpInfo(@Param("type") String type,
            @Param("externalId") String externalId);

    /**
     * Retrieve all external IDs of a specific managed object
     * Retrieve all external IDs of a existing managed object (identified by ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_READ
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_READ permission on the resource &lt;/section&gt;
     * 
     * @param id Unique identifier of the managed object. (required)
     * @return ExternalIds
     */
    @RequestLine("GET /identity/globalIds/{id}/externalIds")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalidcollection+json",
    })
    ExternalIds getExternalIDCollectionResource(@Param("id") String id);

    /**
     * Retrieve all external IDs of a specific managed object
     * Similar to <code>getExternalIDCollectionResource</code> but it also returns
     * the http response headers .
     * Retrieve all external IDs of a existing managed object (identified by ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_READ
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_READ permission on the resource &lt;/section&gt;
     * 
     * @param id Unique identifier of the managed object. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /identity/globalIds/{id}/externalIds")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalidcollection+json",
    })
    ApiResponse<ExternalIds> getExternalIDCollectionResourceWithHttpInfo(@Param("id") String id);

    /**
     * Retrieve a specific external ID
     * Retrieve a specific external ID of a particular type.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_READ
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_READ permission on the resource &lt;/section&gt;
     * 
     * @param type       The identifier used in the external system that Cumulocity
     *                   IoT interfaces with. (required)
     * @param externalId The type of the external identifier. (required)
     * @return ExternalId
     */
    @RequestLine("GET /identity/externalIds/{type}/{externalId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalid+json",
    })
    ExternalId getExternalIDResource(@Param("type") String type, @Param("externalId") String externalId);

    /**
     * Retrieve a specific external ID
     * Similar to <code>getExternalIDResource</code> but it also returns the http
     * response headers .
     * Retrieve a specific external ID of a particular type.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_READ
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_READ permission on the resource &lt;/section&gt;
     * 
     * @param type       The identifier used in the external system that Cumulocity
     *                   IoT interfaces with. (required)
     * @param externalId The type of the external identifier. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /identity/externalIds/{type}/{externalId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalid+json",
    })
    ApiResponse<ExternalId> getExternalIDResourceWithHttpInfo(@Param("type") String type,
            @Param("externalId") String externalId);

    /**
     * Create an external ID
     * Create an external ID for an existing managed object (identified by ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_ADMIN permission on the resource &lt;/section&gt;
     * 
     * @param id         Unique identifier of the managed object. (required)
     * @param externalId (required)
     * @param accept     Advertises which content types, expressed as MIME types,
     *                   the client is able to understand. (optional)
     * @return ExternalId
     */
    @RequestLine("POST /identity/globalIds/{id}/externalIds")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.externalid+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalid+json",
            "Accept: {accept}"
    })
    ExternalId postExternalIDCollectionResource(@Param("id") String id, ExternalId externalId,
            @Param("accept") String accept);

    /**
     * Create an external ID
     * Similar to <code>postExternalIDCollectionResource</code> but it also returns
     * the http response headers .
     * Create an external ID for an existing managed object (identified by ID).
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_IDENTITY_ADMIN
     * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
     * MANAGED_OBJECT_ADMIN permission on the resource &lt;/section&gt;
     * 
     * @param id         Unique identifier of the managed object. (required)
     * @param externalId (required)
     * @param accept     Advertises which content types, expressed as MIME types,
     *                   the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /identity/globalIds/{id}/externalIds")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.externalid+json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.externalid+json",
            "Accept: {accept}"
    })
    ApiResponse<ExternalId> postExternalIDCollectionResourceWithHttpInfo(@Param("id") String id, ExternalId externalId,
            @Param("accept") String accept);

}
