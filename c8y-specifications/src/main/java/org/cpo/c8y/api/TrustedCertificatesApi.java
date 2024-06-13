package org.cpo.c8y.api;

import java.io.File;
import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.AccessToken;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.PutTrustedCertificateResourceRequest;
import org.cpo.c8y.model.TrustedCertificate;
import org.cpo.c8y.model.TrustedCertificateCollection;
import org.cpo.c8y.model.UpdateCRLEntries;
import org.cpo.c8y.model.UploadedTrustedCertSignedVerificationCode;
import org.cpo.c8y.model.UploadedTrustedCertificate;
import org.cpo.c8y.model.UploadedTrustedCertificateCollection;
import org.cpo.c8y.model.VerifyCertificateChain;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface TrustedCertificatesApi extends ApiClient.Api {

  /**
   * Remove a stored certificate
   * Remove a stored trusted certificate (by a given fingerprint) from a specific
   * tenant (by a given ID). When a trusted certificate is deleted, the
   * established MQTT connection to all devices that are using the corresponding
   * certificate are closed. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant &lt;b&gt;OR&lt;/b&gt; is the
   * management tenant) &lt;/section&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   */
  @RequestLine("DELETE /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteTrustedCertificateResource(@Param("tenantId") String tenantId, @Param("fingerprint") String fingerprint);

  /**
   * Remove a stored certificate
   * Similar to <code>deleteTrustedCertificateResource</code> but it also returns
   * the http response headers .
   * Remove a stored trusted certificate (by a given fingerprint) from a specific
   * tenant (by a given ID). When a trusted certificate is deleted, the
   * established MQTT connection to all devices that are using the corresponding
   * certificate are closed. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant &lt;b&gt;OR&lt;/b&gt; is the
   * management tenant) &lt;/section&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   */
  @RequestLine("DELETE /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteTrustedCertificateResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint);

  /**
   * Get revoked certificates
   * This endpoint downloads current CRL file containing list of revoked
   * certificate in a binary file format with &#x60;content-type&#x60; as
   * &#x60;application/pkix-crl&#x60;.
   * 
   * @return File
   */
  @RequestLine("GET /tenant/trusted-certificates/settings/crl")
  @Headers({
      "Accept: application/pkix-crl",
  })
  File getCRLSettings();

  /**
   * Get revoked certificates
   * Similar to <code>getCRLSettings</code> but it also returns the http response
   * headers .
   * This endpoint downloads current CRL file containing list of revoked
   * certificate in a binary file format with &#x60;content-type&#x60; as
   * &#x60;application/pkix-crl&#x60;.
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/trusted-certificates/settings/crl")
  @Headers({
      "Accept: application/pkix-crl",
  })
  ApiResponse<File> getCRLSettingsWithHttpInfo();

  /**
   * Retrieve all stored certificates
   * Retrieve all the trusted certificates of a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
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
   * @return TrustedCertificateCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  TrustedCertificateCollection getTrustedCertificateCollectionResource(@Param("tenantId") String tenantId,
      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize,
      @Param("withTotalElements") Boolean withTotalElements, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all stored certificates
   * Similar to <code>getTrustedCertificateCollectionResource</code> but it also
   * returns the http response headers .
   * Retrieve all the trusted certificates of a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId          Unique identifier of a Cumulocity IoT tenant.
   *                          (required)
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
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<TrustedCertificateCollection> getTrustedCertificateCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("currentPage") Integer currentPage,
      @Param("pageSize") Integer pageSize, @Param("withTotalElements") Boolean withTotalElements,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Retrieve all stored certificates
   * Retrieve all the trusted certificates of a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTrustedCertificateCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTrustedCertificateCollectionResourceQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
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
   * @return TrustedCertificateCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  TrustedCertificateCollection getTrustedCertificateCollectionResource(@Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetTrustedCertificateCollectionResourceQueryParams queryParams);

  /**
   * Retrieve all stored certificates
   * Retrieve all the trusted certificates of a specific tenant (by a given ID).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>getTrustedCertificateCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
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
   * @return TrustedCertificateCollection
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates?currentPage={currentPage}&pageSize={pageSize}&withTotalElements={withTotalElements}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<TrustedCertificateCollection> getTrustedCertificateCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId,
      @QueryMap(encoded = true) GetTrustedCertificateCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTrustedCertificateCollectionResource</code> method in a fluent
   * style.
   */
  public static class GetTrustedCertificateCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetTrustedCertificateCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetTrustedCertificateCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetTrustedCertificateCollectionResourceQueryParams withTotalElements(final Boolean value) {
      put("withTotalElements", EncodingUtils.encode(value));
      return this;
    }

    public GetTrustedCertificateCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a stored certificate
   * Retrieve the data of a stored trusted certificate (by a given fingerprint) of
   * a specific tenant (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_ADMIN) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @return TrustedCertificate
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  TrustedCertificate getTrustedCertificateResource(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint);

  /**
   * Retrieve a stored certificate
   * Similar to <code>getTrustedCertificateResource</code> but it also returns the
   * http response headers .
   * Retrieve the data of a stored trusted certificate (by a given fingerprint) of
   * a specific tenant (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_ADMIN) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<TrustedCertificate> getTrustedCertificateResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint);

  /**
   * Confirm an already uploaded certificate
   * Confirm an already uploaded certificate (by a given fingerprint) for a
   * specific tenant (by a given ID). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the management tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/confirmed")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificate postConfirmedTrustedCertificatePopResource(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint, @Param("accept") String accept);

  /**
   * Confirm an already uploaded certificate
   * Similar to <code>postConfirmedTrustedCertificatePopResource</code> but it
   * also returns the http response headers .
   * Confirm an already uploaded certificate (by a given fingerprint) for a
   * specific tenant (by a given ID). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the management tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/confirmed")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificate> postConfirmedTrustedCertificatePopResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("fingerprint") String fingerprint, @Param("accept") String accept);

  /**
   * Obtain device access token
   * Only those devices which are registered to use cert auth can authenticate via
   * mTLS protocol and retrieve JWT token. To establish a Two-Way SSL (Mutual
   * Authentication) connection, you must have the following: * private_key *
   * client certificate * certificate authority root certificate * certificate
   * authority intermediate certificates (Optional)
   * 
   * @param xSslCertChain Used to send a certificate chain in the header. Separate
   *                      the chain with &#x60; &#x60; (a space character) and
   *                      also each 64 bit block with &#x60; &#x60; (a space
   *                      character). (required)
   * @param accept        Advertises which content types, expressed as MIME types,
   *                      the client is able to understand. (optional)
   * @return AccessToken
   */
  @RequestLine("POST /devicecontrol/deviceAccessToken")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Ssl-Cert-Chain: {xSslCertChain}"
  })
  AccessToken postDeviceAccessTokenResource(@Param("xSslCertChain") String xSslCertChain,
      @Param("accept") String accept);

  /**
   * Obtain device access token
   * Similar to <code>postDeviceAccessTokenResource</code> but it also returns the
   * http response headers .
   * Only those devices which are registered to use cert auth can authenticate via
   * mTLS protocol and retrieve JWT token. To establish a Two-Way SSL (Mutual
   * Authentication) connection, you must have the following: * private_key *
   * client certificate * certificate authority root certificate * certificate
   * authority intermediate certificates (Optional)
   * 
   * @param xSslCertChain Used to send a certificate chain in the header. Separate
   *                      the chain with &#x60; &#x60; (a space character) and
   *                      also each 64 bit block with &#x60; &#x60; (a space
   *                      character). (required)
   * @param accept        Advertises which content types, expressed as MIME types,
   *                      the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /devicecontrol/deviceAccessToken")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Ssl-Cert-Chain: {xSslCertChain}"
  })
  ApiResponse<AccessToken> postDeviceAccessTokenResourceWithHttpInfo(@Param("xSslCertChain") String xSslCertChain,
      @Param("accept") String accept);

  /**
   * Add a new certificate
   * Add a new trusted certificate to a specific tenant (by a given ID) which can
   * be further used by the devices to establish connections with the Cumulocity
   * IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId                   Unique identifier of a Cumulocity IoT
   *                                   tenant. (required)
   * @param uploadedTrustedCertificate (required)
   * @param accept                     Advertises which content types, expressed
   *                                   as MIME types, the client is able to
   *                                   understand. (optional)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   * @param addToTrustStore            If set to &#x60;true&#x60; the certificate
   *                                   is added to the truststore. The truststore
   *                                   contains all trusted certificates. A
   *                                   connection to a device is only established
   *                                   if it connects to Cumulocity IoT with a
   *                                   certificate in the truststore. (optional,
   *                                   default to false)
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  TrustedCertificate postTrustedCertificateCollectionResource(@Param("tenantId") String tenantId,
      UploadedTrustedCertificate uploadedTrustedCertificate, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("addToTrustStore") Boolean addToTrustStore);

  /**
   * Add a new certificate
   * Similar to <code>postTrustedCertificateCollectionResource</code> but it also
   * returns the http response headers .
   * Add a new trusted certificate to a specific tenant (by a given ID) which can
   * be further used by the devices to establish connections with the Cumulocity
   * IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId                   Unique identifier of a Cumulocity IoT
   *                                   tenant. (required)
   * @param uploadedTrustedCertificate (required)
   * @param accept                     Advertises which content types, expressed
   *                                   as MIME types, the client is able to
   *                                   understand. (optional)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   * @param addToTrustStore            If set to &#x60;true&#x60; the certificate
   *                                   is added to the truststore. The truststore
   *                                   contains all trusted certificates. A
   *                                   connection to a device is only established
   *                                   if it connects to Cumulocity IoT with a
   *                                   certificate in the truststore. (optional,
   *                                   default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<TrustedCertificate> postTrustedCertificateCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, UploadedTrustedCertificate uploadedTrustedCertificate,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @Param("addToTrustStore") Boolean addToTrustStore);

  /**
   * Add a new certificate
   * Add a new trusted certificate to a specific tenant (by a given ID) which can
   * be further used by the devices to establish connections with the Cumulocity
   * IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>postTrustedCertificateCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostTrustedCertificateCollectionResourceQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId                   Unique identifier of a Cumulocity IoT
   *                                   tenant. (required)
   * @param uploadedTrustedCertificate (required)
   * @param accept                     Advertises which content types, expressed
   *                                   as MIME types, the client is able to
   *                                   understand. (optional)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   * @param queryParams                Map of query parameters as name-value pairs
   *                                   <p>
   *                                   The following elements may be specified in
   *                                   the query map:
   *                                   </p>
   *                                   <ul>
   *                                   <li>addToTrustStore - If set to
   *                                   &#x60;true&#x60; the certificate is added
   *                                   to the truststore. The truststore contains
   *                                   all trusted certificates. A connection to a
   *                                   device is only established if it connects
   *                                   to Cumulocity IoT with a certificate in the
   *                                   truststore. (optional, default to
   *                                   false)</li>
   *                                   </ul>
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  TrustedCertificate postTrustedCertificateCollectionResource(@Param("tenantId") String tenantId,
      UploadedTrustedCertificate uploadedTrustedCertificate, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PostTrustedCertificateCollectionResourceQueryParams queryParams);

  /**
   * Add a new certificate
   * Add a new trusted certificate to a specific tenant (by a given ID) which can
   * be further used by the devices to establish connections with the Cumulocity
   * IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>postTrustedCertificateCollectionResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId                   Unique identifier of a Cumulocity IoT
   *                                   tenant. (required)
   * @param uploadedTrustedCertificate (required)
   * @param accept                     Advertises which content types, expressed
   *                                   as MIME types, the client is able to
   *                                   understand. (optional)
   * @param xCumulocityProcessingMode  Used to explicitly control the processing
   *                                   mode of the request. See [Processing
   *                                   mode](#processing-mode) for more details.
   *                                   (optional, default to PERSISTENT)
   * @param queryParams                Map of query parameters as name-value pairs
   *                                   <p>
   *                                   The following elements may be specified in
   *                                   the query map:
   *                                   </p>
   *                                   <ul>
   *                                   <li>addToTrustStore - If set to
   *                                   &#x60;true&#x60; the certificate is added
   *                                   to the truststore. The truststore contains
   *                                   all trusted certificates. A connection to a
   *                                   device is only established if it connects
   *                                   to Cumulocity IoT with a certificate in the
   *                                   truststore. (optional, default to
   *                                   false)</li>
   *                                   </ul>
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<TrustedCertificate> postTrustedCertificateCollectionResourceWithHttpInfo(
      @Param("tenantId") String tenantId, UploadedTrustedCertificate uploadedTrustedCertificate,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PostTrustedCertificateCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>postTrustedCertificateCollectionResource</code> method in a fluent
   * style.
   */
  public static class PostTrustedCertificateCollectionResourceQueryParams extends HashMap<String, Object> {
    public PostTrustedCertificateCollectionResourceQueryParams addToTrustStore(final Boolean value) {
      put("addToTrustStore", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Add multiple certificates
   * Add multiple trusted certificates to a specific tenant (by a given ID) which
   * can be further used by the devices to establish connections with the
   * Cumulocity IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param uploadedTrustedCertificateCollection (required)
   * @param addToTrustStore                      If set to &#x60;true&#x60; the
   *                                             certificate is added to the
   *                                             truststore. The truststore
   *                                             contains all trusted
   *                                             certificates. A connection to a
   *                                             device is only established if it
   *                                             connects to Cumulocity IoT with a
   *                                             certificate in the truststore.
   *                                             (optional, default to false)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @return TrustedCertificateCollection
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates/bulk?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificateCollection postTrustedCertificateCollectionResourceBulk(@Param("tenantId") String tenantId,
      UploadedTrustedCertificateCollection uploadedTrustedCertificateCollection,
      @Param("addToTrustStore") Boolean addToTrustStore, @Param("accept") String accept);

  /**
   * Add multiple certificates
   * Similar to <code>postTrustedCertificateCollectionResourceBulk</code> but it
   * also returns the http response headers .
   * Add multiple trusted certificates to a specific tenant (by a given ID) which
   * can be further used by the devices to establish connections with the
   * Cumulocity IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param uploadedTrustedCertificateCollection (required)
   * @param addToTrustStore                      If set to &#x60;true&#x60; the
   *                                             certificate is added to the
   *                                             truststore. The truststore
   *                                             contains all trusted
   *                                             certificates. A connection to a
   *                                             device is only established if it
   *                                             connects to Cumulocity IoT with a
   *                                             certificate in the truststore.
   *                                             (optional, default to false)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates/bulk?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificateCollection> postTrustedCertificateCollectionResourceBulkWithHttpInfo(
      @Param("tenantId") String tenantId, UploadedTrustedCertificateCollection uploadedTrustedCertificateCollection,
      @Param("addToTrustStore") Boolean addToTrustStore, @Param("accept") String accept);

  /**
   * Add multiple certificates
   * Add multiple trusted certificates to a specific tenant (by a given ID) which
   * can be further used by the devices to establish connections with the
   * Cumulocity IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>postTrustedCertificateCollectionResourceBulk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostTrustedCertificateCollectionResourceBulkQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param uploadedTrustedCertificateCollection (required)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @param queryParams                          Map of query parameters as
   *                                             name-value pairs
   *                                             <p>
   *                                             The following elements may be
   *                                             specified in the query map:
   *                                             </p>
   *                                             <ul>
   *                                             <li>addToTrustStore - If set to
   *                                             &#x60;true&#x60; the certificate
   *                                             is added to the truststore. The
   *                                             truststore contains all trusted
   *                                             certificates. A connection to a
   *                                             device is only established if it
   *                                             connects to Cumulocity IoT with a
   *                                             certificate in the truststore.
   *                                             (optional, default to false)</li>
   *                                             </ul>
   * @return TrustedCertificateCollection
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates/bulk?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificateCollection postTrustedCertificateCollectionResourceBulk(@Param("tenantId") String tenantId,
      UploadedTrustedCertificateCollection uploadedTrustedCertificateCollection, @Param("accept") String accept,
      @QueryMap(encoded = true) PostTrustedCertificateCollectionResourceBulkQueryParams queryParams);

  /**
   * Add multiple certificates
   * Add multiple trusted certificates to a specific tenant (by a given ID) which
   * can be further used by the devices to establish connections with the
   * Cumulocity IoT platform. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; (is the current tenant) &lt;/section&gt;
   * Note, this is equivalent to the other
   * <code>postTrustedCertificateCollectionResourceBulk</code> that receives the
   * query parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param uploadedTrustedCertificateCollection (required)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @param queryParams                          Map of query parameters as
   *                                             name-value pairs
   *                                             <p>
   *                                             The following elements may be
   *                                             specified in the query map:
   *                                             </p>
   *                                             <ul>
   *                                             <li>addToTrustStore - If set to
   *                                             &#x60;true&#x60; the certificate
   *                                             is added to the truststore. The
   *                                             truststore contains all trusted
   *                                             certificates. A connection to a
   *                                             device is only established if it
   *                                             connects to Cumulocity IoT with a
   *                                             certificate in the truststore.
   *                                             (optional, default to false)</li>
   *                                             </ul>
   * @return TrustedCertificateCollection
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates/bulk?addToTrustStore={addToTrustStore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificateCollection> postTrustedCertificateCollectionResourceBulkWithHttpInfo(
      @Param("tenantId") String tenantId, UploadedTrustedCertificateCollection uploadedTrustedCertificateCollection,
      @Param("accept") String accept,
      @QueryMap(encoded = true) PostTrustedCertificateCollectionResourceBulkQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>postTrustedCertificateCollectionResourceBulk</code> method in a fluent
   * style.
   */
  public static class PostTrustedCertificateCollectionResourceBulkQueryParams extends HashMap<String, Object> {
    public PostTrustedCertificateCollectionResourceBulkQueryParams addToTrustStore(final Boolean value) {
      put("addToTrustStore", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Provide the proof of possession for an already uploaded certificate
   * Provide the proof of possession for a specific uploaded certificate (by a
   * given fingerprint) for a specific tenant (by a given ID). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId                                  Unique identifier of a
   *                                                  Cumulocity IoT tenant.
   *                                                  (required)
   * @param fingerprint                               Unique identifier of a
   *                                                  trusted certificate.
   *                                                  (required)
   * @param uploadedTrustedCertSignedVerificationCode (required)
   * @param accept                                    Advertises which content
   *                                                  types, expressed as MIME
   *                                                  types, the client is able to
   *                                                  understand. (optional)
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/pop")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificate postTrustedCertificatePopResource(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint,
      UploadedTrustedCertSignedVerificationCode uploadedTrustedCertSignedVerificationCode,
      @Param("accept") String accept);

  /**
   * Provide the proof of possession for an already uploaded certificate
   * Similar to <code>postTrustedCertificatePopResource</code> but it also returns
   * the http response headers .
   * Provide the proof of possession for a specific uploaded certificate (by a
   * given fingerprint) for a specific tenant (by a given ID). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId                                  Unique identifier of a
   *                                                  Cumulocity IoT tenant.
   *                                                  (required)
   * @param fingerprint                               Unique identifier of a
   *                                                  trusted certificate.
   *                                                  (required)
   * @param uploadedTrustedCertSignedVerificationCode (required)
   * @param accept                                    Advertises which content
   *                                                  types, expressed as MIME
   *                                                  types, the client is able to
   *                                                  understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/pop")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificate> postTrustedCertificatePopResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint,
      UploadedTrustedCertSignedVerificationCode uploadedTrustedCertSignedVerificationCode,
      @Param("accept") String accept);

  /**
   * Generate a verification code for the proof of possession operation for the
   * given certificate
   * Generate a verification code for the proof of possession operation for the
   * certificate (by a given fingerprint). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return TrustedCertificate
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/verification-code")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificate postVerificationCodeTrustedCertificatesPopResource(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint, @Param("accept") String accept);

  /**
   * Generate a verification code for the proof of possession operation for the
   * given certificate
   * Similar to <code>postVerificationCodeTrustedCertificatesPopResource</code>
   * but it also returns the http response headers .
   * Generate a verification code for the proof of possession operation for the
   * certificate (by a given fingerprint). &lt;div
   * class&#x3D;\&quot;reqRoles\&quot;&gt;&lt;div&gt;&lt;h5&gt;&lt;/h5&gt;&lt;/div&gt;&lt;div&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/div&gt;&lt;/div&gt;
   * 
   * @param tenantId    Unique identifier of a Cumulocity IoT tenant. (required)
   * @param fingerprint Unique identifier of a trusted certificate. (required)
   * @param accept      Advertises which content types, expressed as MIME types,
   *                    the client is able to understand. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/tenants/{tenantId}/trusted-certificates-pop/{fingerprint}/verification-code")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificate> postVerificationCodeTrustedCertificatesPopResourceWithHttpInfo(
      @Param("tenantId") String tenantId, @Param("fingerprint") String fingerprint, @Param("accept") String accept);

  /**
   * Verify a certificate chain
   * Verify a device certificate chain against a specific tenant using file upload
   * or by HTTP headers. The tenant ID is &#x60;optional&#x60; and this api will
   * try to resolve the tenant from the chain if not found in the request header.
   * For file upload, the max chain length support is 10 and for a header it is 5.
   * If CRL (certificate revocation list) check is enabled on the tenant and the
   * certificate chain is identified to be revoked during validation the further
   * validation of the chain stops and returns unauthorized. &gt; **&amp;#9432;
   * Info:** File upload takes precedence over HTTP headers if both are passed.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_MANAGEMENT_READ) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is current management tenant) &lt;b&gt;OR&lt;/b&gt; (is
   * authenticated &lt;b&gt;AND&lt;/b&gt; is current user service user)
   * &lt;/section&gt;
   * 
   * @param xCumulocityClientCertChain Used to send a certificate chain in the
   *                                   header. Separate the chain with
   *                                   &#x60;,&#x60; and also each 64 bit block
   *                                   with &#x60; &#x60; (a space character).
   *                                   (required)
   * @param file                       File to be uploaded. (required)
   * @param xCumulocityTenantId        Used to send a tenant ID. (optional)
   * @param tenantId                   (optional)
   * @return VerifyCertificateChain
   */
  @RequestLine("POST /tenant/trusted-certificates/verify-cert-chain")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-TenantId: {xCumulocityTenantId}",

      "X-Cumulocity-Client-Cert-Chain: {xCumulocityClientCertChain}"
  })
  VerifyCertificateChain postX509ChainValidate(@Param("xCumulocityClientCertChain") String xCumulocityClientCertChain,
      @Param("file") File file, @Param("xCumulocityTenantId") String xCumulocityTenantId,
      @Param("tenantId") String tenantId);

  /**
   * Verify a certificate chain
   * Similar to <code>postX509ChainValidate</code> but it also returns the http
   * response headers .
   * Verify a device certificate chain against a specific tenant using file upload
   * or by HTTP headers. The tenant ID is &#x60;optional&#x60; and this api will
   * try to resolve the tenant from the chain if not found in the request header.
   * For file upload, the max chain length support is 10 and for a header it is 5.
   * If CRL (certificate revocation list) check is enabled on the tenant and the
   * certificate chain is identified to be revoked during validation the further
   * validation of the chain stops and returns unauthorized. &gt; **&amp;#9432;
   * Info:** File upload takes precedence over HTTP headers if both are passed.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_MANAGEMENT_READ) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is current management tenant) &lt;b&gt;OR&lt;/b&gt; (is
   * authenticated &lt;b&gt;AND&lt;/b&gt; is current user service user)
   * &lt;/section&gt;
   * 
   * @param xCumulocityClientCertChain Used to send a certificate chain in the
   *                                   header. Separate the chain with
   *                                   &#x60;,&#x60; and also each 64 bit block
   *                                   with &#x60; &#x60; (a space character).
   *                                   (required)
   * @param file                       File to be uploaded. (required)
   * @param xCumulocityTenantId        Used to send a tenant ID. (optional)
   * @param tenantId                   (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /tenant/trusted-certificates/verify-cert-chain")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "X-Cumulocity-TenantId: {xCumulocityTenantId}",

      "X-Cumulocity-Client-Cert-Chain: {xCumulocityClientCertChain}"
  })
  ApiResponse<VerifyCertificateChain> postX509ChainValidateWithHttpInfo(
      @Param("xCumulocityClientCertChain") String xCumulocityClientCertChain, @Param("file") File file,
      @Param("xCumulocityTenantId") String xCumulocityTenantId, @Param("tenantId") String tenantId);

  /**
   * Add revoked certificates
   * &gt; **&amp;#9432; Info:** A certificate revocation list (CRL) is a list of
   * digital certificates that have been revoked by the issuing certificate
   * authority (CA) before expiration date. In Cumulocity IoT, a CRL check can be
   * in online or offline mode or both. An endpoint to add revoked certificate
   * serial numbers for offline CRL check via payload or file. For payload, a JSON
   * object required with list of CRL entries, for example: &#x60;&#x60;&#x60;json
   * { \&quot;crls\&quot;: [ { \&quot;serialNumberInHex\&quot;:
   * \&quot;1000\&quot;, \&quot;revocationDate\&quot;:
   * \&quot;2023-01-11T16:12:36.288Z\&quot; } ] } &#x60;&#x60;&#x60; Each entry is
   * composed of: * serialNumberInHex: Needs to be in &#x60;Hexadecimal
   * Value&#x60;. e.g As (1000)^16 &#x3D;&#x3D; (4096)^10, So we have to enter
   * 1000. If duplicate serial number exists in payload, the existing entry
   * stays&lt;/br&gt; * &#x60;revocationDate&#x60; - accepted Date format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60;, for example:
   * &#x60;2023-01-11T16:12:36.288Z&#x60;. This is an optional parameter and
   * defaults to the current server UTC date time if not specified in the payload.
   * If specified and the date is in future then those entries will be also
   * defaulted to current date. For file upload, each file can hold at maximum
   * 5000 revocation entries. Multiple upload is allowed. In case of duplicates,
   * the latest (last uploaded) entry is considered. See below for a sample CSV
   * file: | SERIAL NO. | REVOCATION DATE | |--|--| | 1000 |
   * 2023-01-11T16:12:36.288Z | Each entry is composed of : * serialNumberInHex:
   * Needs to be in &#x60;Hexadecimal Value&#x60;. e.g (1000)^16 &#x3D;&#x3D;
   * (4096)^10, So we have to enter 1000. If duplicate serial number exists in
   * payload, the latest entry will be taken.&lt;/br&gt; * revocationDate:
   * Accepted Date format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60; e.g:
   * 2023-01-11T16:12:36.288Z. This is an optional and will be default to current
   * server UTC date time if not specified in payload. If specified and the date
   * is in future then those entries will be skipped. The CRL setting for offline
   * and online check can be enabled/disabled using &lt;kbd&gt;&lt;a
   * href&#x3D;\&quot;#operation/putOptionResource\&quot;&gt;/tenant/options&lt;/a&gt;&lt;/kbd&gt;.
   * Keys are &#x60;crl.online.check.enabled&#x60; and
   * &#x60;crl.offline.check.enabled&#x60; under the category
   * &#x60;configuration&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/section&gt; **⚠️
   * Important:** According to CRL policy, added serial numbers cannot be
   * reversed.
   * 
   * @param updateCRLEntries (required)
   */
  @RequestLine("PUT /tenant/trusted-certificates/settings/crl")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void putCRLSettings(UpdateCRLEntries updateCRLEntries);

  /**
   * Add revoked certificates
   * Similar to <code>putCRLSettings</code> but it also returns the http response
   * headers .
   * &gt; **&amp;#9432; Info:** A certificate revocation list (CRL) is a list of
   * digital certificates that have been revoked by the issuing certificate
   * authority (CA) before expiration date. In Cumulocity IoT, a CRL check can be
   * in online or offline mode or both. An endpoint to add revoked certificate
   * serial numbers for offline CRL check via payload or file. For payload, a JSON
   * object required with list of CRL entries, for example: &#x60;&#x60;&#x60;json
   * { \&quot;crls\&quot;: [ { \&quot;serialNumberInHex\&quot;:
   * \&quot;1000\&quot;, \&quot;revocationDate\&quot;:
   * \&quot;2023-01-11T16:12:36.288Z\&quot; } ] } &#x60;&#x60;&#x60; Each entry is
   * composed of: * serialNumberInHex: Needs to be in &#x60;Hexadecimal
   * Value&#x60;. e.g As (1000)^16 &#x3D;&#x3D; (4096)^10, So we have to enter
   * 1000. If duplicate serial number exists in payload, the existing entry
   * stays&lt;/br&gt; * &#x60;revocationDate&#x60; - accepted Date format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60;, for example:
   * &#x60;2023-01-11T16:12:36.288Z&#x60;. This is an optional parameter and
   * defaults to the current server UTC date time if not specified in the payload.
   * If specified and the date is in future then those entries will be also
   * defaulted to current date. For file upload, each file can hold at maximum
   * 5000 revocation entries. Multiple upload is allowed. In case of duplicates,
   * the latest (last uploaded) entry is considered. See below for a sample CSV
   * file: | SERIAL NO. | REVOCATION DATE | |--|--| | 1000 |
   * 2023-01-11T16:12:36.288Z | Each entry is composed of : * serialNumberInHex:
   * Needs to be in &#x60;Hexadecimal Value&#x60;. e.g (1000)^16 &#x3D;&#x3D;
   * (4096)^10, So we have to enter 1000. If duplicate serial number exists in
   * payload, the latest entry will be taken.&lt;/br&gt; * revocationDate:
   * Accepted Date format:
   * &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60; e.g:
   * 2023-01-11T16:12:36.288Z. This is an optional and will be default to current
   * server UTC date time if not specified in payload. If specified and the date
   * is in future then those entries will be skipped. The CRL setting for offline
   * and online check can be enabled/disabled using &lt;kbd&gt;&lt;a
   * href&#x3D;\&quot;#operation/putOptionResource\&quot;&gt;/tenant/options&lt;/a&gt;&lt;/kbd&gt;.
   * Keys are &#x60;crl.online.check.enabled&#x60; and
   * &#x60;crl.offline.check.enabled&#x60; under the category
   * &#x60;configuration&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_TENANT_ADMIN)
   * &lt;b&gt;AND&lt;/b&gt; is the current tenant &lt;/section&gt; **⚠️
   * Important:** According to CRL policy, added serial numbers cannot be
   * reversed.
   * 
   * @param updateCRLEntries (required)
   */
  @RequestLine("PUT /tenant/trusted-certificates/settings/crl")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> putCRLSettingsWithHttpInfo(UpdateCRLEntries updateCRLEntries);

  /**
   * Update a stored certificate
   * Update the data of a stored trusted certificate (by a given fingerprint) of a
   * specific tenant (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_ADMIN) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param fingerprint                          Unique identifier of a trusted
   *                                             certificate. (required)
   * @param putTrustedCertificateResourceRequest (required)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @return TrustedCertificate
   */
  @RequestLine("PUT /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  TrustedCertificate putTrustedCertificateResource(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint,
      PutTrustedCertificateResourceRequest putTrustedCertificateResourceRequest, @Param("accept") String accept);

  /**
   * Update a stored certificate
   * Similar to <code>putTrustedCertificateResource</code> but it also returns the
   * http response headers .
   * Update the data of a stored trusted certificate (by a given fingerprint) of a
   * specific tenant (by a given ID). &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; (ROLE_TENANT_MANAGEMENT_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_TENANT_ADMIN) &lt;b&gt;AND&lt;/b&gt; (is the current tenant
   * &lt;b&gt;OR&lt;/b&gt; is the management tenant) &lt;/section&gt;
   * 
   * @param tenantId                             Unique identifier of a Cumulocity
   *                                             IoT tenant. (required)
   * @param fingerprint                          Unique identifier of a trusted
   *                                             certificate. (required)
   * @param putTrustedCertificateResourceRequest (required)
   * @param accept                               Advertises which content types,
   *                                             expressed as MIME types, the
   *                                             client is able to understand.
   *                                             (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /tenant/tenants/{tenantId}/trusted-certificates/{fingerprint}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<TrustedCertificate> putTrustedCertificateResourceWithHttpInfo(@Param("tenantId") String tenantId,
      @Param("fingerprint") String fingerprint,
      PutTrustedCertificateResourceRequest putTrustedCertificateResourceRequest, @Param("accept") String accept);

}
