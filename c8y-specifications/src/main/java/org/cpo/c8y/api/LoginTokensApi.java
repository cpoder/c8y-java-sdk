package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.AccessToken;
import org.cpo.c8y.model.ApiResponse;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface LoginTokensApi extends ApiClient.Api {

    /**
     * Obtain an access token
     * Obtain an OAI-Secure access token.
     * 
     * @param tenantId  Unique identifier of a Cumulocity IoT tenant. If not
     *                  provided, the tenant is calculated based on the request
     *                  domain. (optional)
     * @param accept    Advertises which content types, expressed as MIME types, the
     *                  client is able to understand. (optional)
     * @param code      Used in case of SSO login. A code received from the external
     *                  authentication server is exchanged to an internal access
     *                  token. (optional)
     * @param grantType Dependent on the authentication type. PASSWORD is used for
     *                  OAI-Secure. (optional)
     * @param password  Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode   Current TFA code, sent by the user, if a TFA code is
     *                  required to log in. Used in case of OAI-Secure
     *                  authentication. (optional)
     * @param username  Used in case of OAI-Secure authentication. (optional)
     * @return AccessToken
     */
    @RequestLine("POST /tenant/oauth/token?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AccessToken postLoginFormBody(@Param("tenantId") String tenantId, @Param("accept") String accept,
            @Param("code") String code, @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode, @Param("username") String username);

    /**
     * Obtain an access token
     * Similar to <code>postLoginFormBody</code> but it also returns the http
     * response headers .
     * Obtain an OAI-Secure access token.
     * 
     * @param tenantId  Unique identifier of a Cumulocity IoT tenant. If not
     *                  provided, the tenant is calculated based on the request
     *                  domain. (optional)
     * @param accept    Advertises which content types, expressed as MIME types, the
     *                  client is able to understand. (optional)
     * @param code      Used in case of SSO login. A code received from the external
     *                  authentication server is exchanged to an internal access
     *                  token. (optional)
     * @param grantType Dependent on the authentication type. PASSWORD is used for
     *                  OAI-Secure. (optional)
     * @param password  Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode   Current TFA code, sent by the user, if a TFA code is
     *                  required to log in. Used in case of OAI-Secure
     *                  authentication. (optional)
     * @param username  Used in case of OAI-Secure authentication. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /tenant/oauth/token?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AccessToken> postLoginFormBodyWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("accept") String accept, @Param("code") String code, @Param("grant_type") String grantType,
            @Param("password") String password, @Param("tfa_code") String tfaCode, @Param("username") String username);

    /**
     * Obtain an access token
     * Obtain an OAI-Secure access token.
     * Note, this is equivalent to the other <code>postLoginFormBody</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PostLoginFormBodyQueryParams} class that allows for
     * building up this map in a fluent style.
     * 
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @param code        Used in case of SSO login. A code received from the
     *                    external authentication server is exchanged to an internal
     *                    access token. (optional)
     * @param grantType   Dependent on the authentication type. PASSWORD is used for
     *                    OAI-Secure. (optional)
     * @param password    Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode     Current TFA code, sent by the user, if a TFA code is
     *                    required to log in. Used in case of OAI-Secure
     *                    authentication. (optional)
     * @param username    Used in case of OAI-Secure authentication. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. If not provided, the tenant is calculated based on
     *                    the request domain. (optional)</li>
     *                    </ul>
     * @return AccessToken
     */
    @RequestLine("POST /tenant/oauth/token?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    AccessToken postLoginFormBody(@Param("accept") String accept, @Param("code") String code,
            @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode,
            @Param("username") String username, @QueryMap(encoded = true) PostLoginFormBodyQueryParams queryParams);

    /**
     * Obtain an access token
     * Obtain an OAI-Secure access token.
     * Note, this is equivalent to the other <code>postLoginFormBody</code> that
     * receives the query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @param code        Used in case of SSO login. A code received from the
     *                    external authentication server is exchanged to an internal
     *                    access token. (optional)
     * @param grantType   Dependent on the authentication type. PASSWORD is used for
     *                    OAI-Secure. (optional)
     * @param password    Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode     Current TFA code, sent by the user, if a TFA code is
     *                    required to log in. Used in case of OAI-Secure
     *                    authentication. (optional)
     * @param username    Used in case of OAI-Secure authentication. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. If not provided, the tenant is calculated based on
     *                    the request domain. (optional)</li>
     *                    </ul>
     * @return AccessToken
     */
    @RequestLine("POST /tenant/oauth/token?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<AccessToken> postLoginFormBodyWithHttpInfo(@Param("accept") String accept, @Param("code") String code,
            @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode,
            @Param("username") String username, @QueryMap(encoded = true) PostLoginFormBodyQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postLoginFormBody</code> method in a fluent style.
     */
    public static class PostLoginFormBodyQueryParams extends HashMap<String, Object> {
        public PostLoginFormBodyQueryParams tenantId(final String value) {
            put("tenant_id", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Obtain access tokens in cookies
     * Obtain an OAI-Secure and XSRF tokens in cookies.
     * 
     * @param tenantId  Unique identifier of a Cumulocity IoT tenant. If not
     *                  provided, the tenant is calculated based on the request
     *                  domain. (optional)
     * @param accept    Advertises which content types, expressed as MIME types, the
     *                  client is able to understand. (optional)
     * @param code      Used in case of SSO login. A code received from the external
     *                  authentication server is exchanged to an internal access
     *                  token. (optional)
     * @param grantType Dependent on the authentication type. PASSWORD is used for
     *                  OAI-Secure. (optional)
     * @param password  Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode   Current TFA code, sent by the user, if a TFA code is
     *                  required to log in. Used in case of OAI-Secure
     *                  authentication. (optional)
     * @param username  Used in case of OAI-Secure authentication. (optional)
     */
    @RequestLine("POST /tenant/oauth?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    void postLoginFormCookie(@Param("tenantId") String tenantId, @Param("accept") String accept,
            @Param("code") String code, @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode, @Param("username") String username);

    /**
     * Obtain access tokens in cookies
     * Similar to <code>postLoginFormCookie</code> but it also returns the http
     * response headers .
     * Obtain an OAI-Secure and XSRF tokens in cookies.
     * 
     * @param tenantId  Unique identifier of a Cumulocity IoT tenant. If not
     *                  provided, the tenant is calculated based on the request
     *                  domain. (optional)
     * @param accept    Advertises which content types, expressed as MIME types, the
     *                  client is able to understand. (optional)
     * @param code      Used in case of SSO login. A code received from the external
     *                  authentication server is exchanged to an internal access
     *                  token. (optional)
     * @param grantType Dependent on the authentication type. PASSWORD is used for
     *                  OAI-Secure. (optional)
     * @param password  Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode   Current TFA code, sent by the user, if a TFA code is
     *                  required to log in. Used in case of OAI-Secure
     *                  authentication. (optional)
     * @param username  Used in case of OAI-Secure authentication. (optional)
     */
    @RequestLine("POST /tenant/oauth?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<Void> postLoginFormCookieWithHttpInfo(@Param("tenantId") String tenantId,
            @Param("accept") String accept,
            @Param("code") String code, @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode, @Param("username") String username);

    /**
     * Obtain access tokens in cookies
     * Obtain an OAI-Secure and XSRF tokens in cookies.
     * Note, this is equivalent to the other <code>postLoginFormCookie</code>
     * method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PostLoginFormCookieQueryParams} class that allows for
     * building up this map in a fluent style.
     * 
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @param code        Used in case of SSO login. A code received from the
     *                    external authentication server is exchanged to an internal
     *                    access token. (optional)
     * @param grantType   Dependent on the authentication type. PASSWORD is used for
     *                    OAI-Secure. (optional)
     * @param password    Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode     Current TFA code, sent by the user, if a TFA code is
     *                    required to log in. Used in case of OAI-Secure
     *                    authentication. (optional)
     * @param username    Used in case of OAI-Secure authentication. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. If not provided, the tenant is calculated based on
     *                    the request domain. (optional)</li>
     *                    </ul>
     */
    @RequestLine("POST /tenant/oauth?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    void postLoginFormCookie(@Param("accept") String accept, @Param("code") String code,
            @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode,
            @Param("username") String username, @QueryMap(encoded = true) PostLoginFormCookieQueryParams queryParams);

    /**
     * Obtain access tokens in cookies
     * Obtain an OAI-Secure and XSRF tokens in cookies.
     * Note, this is equivalent to the other <code>postLoginFormCookie</code> that
     * receives the query parameters as a map,
     * but this one also exposes the Http response headers
     * 
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @param code        Used in case of SSO login. A code received from the
     *                    external authentication server is exchanged to an internal
     *                    access token. (optional)
     * @param grantType   Dependent on the authentication type. PASSWORD is used for
     *                    OAI-Secure. (optional)
     * @param password    Used in case of OAI-Secure authentication. (optional)
     * @param tfaCode     Current TFA code, sent by the user, if a TFA code is
     *                    required to log in. Used in case of OAI-Secure
     *                    authentication. (optional)
     * @param username    Used in case of OAI-Secure authentication. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>
     *                    The following elements may be specified in the query map:
     *                    </p>
     *                    <ul>
     *                    <li>tenantId - Unique identifier of a Cumulocity IoT
     *                    tenant. If not provided, the tenant is calculated based on
     *                    the request domain. (optional)</li>
     *                    </ul>
     */
    @RequestLine("POST /tenant/oauth?tenant_id={tenantId}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<Void> postLoginFormCookieWithHttpInfo(@Param("accept") String accept, @Param("code") String code,
            @Param("grant_type") String grantType, @Param("password") String password,
            @Param("tfa_code") String tfaCode,
            @Param("username") String username, @QueryMap(encoded = true) PostLoginFormCookieQueryParams queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postLoginFormCookie</code> method in a fluent style.
     */
    public static class PostLoginFormCookieQueryParams extends HashMap<String, Object> {
        public PostLoginFormCookieQueryParams tenantId(final String value) {
            put("tenant_id", EncodingUtils.encode(value));
            return this;
        }
    }
}
