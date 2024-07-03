package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.CurrentUser;
import org.cpo.c8y.model.CurrentUserTotpCode;
import org.cpo.c8y.model.CurrentUserTotpSecret;
import org.cpo.c8y.model.CurrentUserTotpSecretActivity;
import org.cpo.c8y.model.PasswordChange;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface CurrentUserApi extends ApiClient.Api {

    /**
     * Retrieve the current user
     * Retrieve the user reference of the current user.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt; Users with ROLE_SYSTEM are not allowed to query with Accept
     * header &#x60;application/vnd.com.nsn.cumulocity.user+json&#x60;
     * 
     * @return CurrentUser
     */
    @RequestLine("GET /user/currentUser")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currentuser+json,application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
    })
    CurrentUser getCurrentUserResource();

    /**
     * Retrieve the current user
     * Similar to <code>getCurrentUserResource</code> but it also returns the http
     * response headers .
     * Retrieve the user reference of the current user.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt; Users with ROLE_SYSTEM are not allowed to query with Accept
     * header &#x60;application/vnd.com.nsn.cumulocity.user+json&#x60;
     * 
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/currentUser")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.currentuser+json,application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.user+json",
    })
    ApiResponse<CurrentUser> getCurrentUserResourceWithHttpInfo();

    /**
     * Returns the activation state of the two-factor authentication feature.
     * Returns the activation state of the two-factor authentication feature for the
     * current user. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * 
     * @return CurrentUserTotpSecretActivity
     */
    @RequestLine("GET /user/currentUser/totpSecret/activity")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
    })
    CurrentUserTotpSecretActivity getCurrentUserTfaTotpResourceActivity();

    /**
     * Returns the activation state of the two-factor authentication feature.
     * Similar to <code>getCurrentUserTfaTotpResourceActivity</code> but it also
     * returns the http response headers .
     * Returns the activation state of the two-factor authentication feature for the
     * current user. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt; ROLE_SYSTEM
     * &lt;/section&gt;
     * 
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /user/currentUser/totpSecret/activity")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<CurrentUserTotpSecretActivity> getCurrentUserTfaTotpResourceActivityWithHttpInfo();

    /**
     * Generate secret to set up TFA
     * Generate a secret code to create a QR code to set up the two-factor
     * authentication functionality using a TFA app/service. For more information
     * about the feature, see [Platform administration &gt; Authentication &gt;
     * Two-factor authentication](https://cumulocity.com/docs/authentication/tfa/)
     * in the Cumulocity IoT user documentation. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param accept Advertises which content types, expressed as MIME types, the
     *               client is able to understand. (optional)
     * @return CurrentUserTotpSecret
     */
    @RequestLine("POST /user/currentUser/totpSecret")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    CurrentUserTotpSecret postCurrentUserTfaTotpResource(@Param("accept") String accept);

    /**
     * Generate secret to set up TFA
     * Similar to <code>postCurrentUserTfaTotpResource</code> but it also returns
     * the http response headers .
     * Generate a secret code to create a QR code to set up the two-factor
     * authentication functionality using a TFA app/service. For more information
     * about the feature, see [Platform administration &gt; Authentication &gt;
     * Two-factor authentication](https://cumulocity.com/docs/authentication/tfa/)
     * in the Cumulocity IoT user documentation. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param accept Advertises which content types, expressed as MIME types, the
     *               client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /user/currentUser/totpSecret")
    @Headers({
            "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<CurrentUserTotpSecret> postCurrentUserTfaTotpResourceWithHttpInfo(@Param("accept") String accept);

    /**
     * Activates or deactivates the two-factor authentication feature
     * Activates or deactivates the two-factor authentication feature for the
     * current user. For more information about the feature, see [Platform
     * administration &gt; Authentication &gt; Two-factor
     * authentication](https://cumulocity.com/docs/authentication/tfa/) in the
     * Cumulocity IoT user documentation. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param currentUserTotpSecretActivity (required)
     */
    @RequestLine("POST /user/currentUser/totpSecret/activity")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void postCurrentUserTfaTotpResourceActivity(CurrentUserTotpSecretActivity currentUserTotpSecretActivity);

    /**
     * Activates or deactivates the two-factor authentication feature
     * Similar to <code>postCurrentUserTfaTotpResourceActivity</code> but it also
     * returns the http response headers .
     * Activates or deactivates the two-factor authentication feature for the
     * current user. For more information about the feature, see [Platform
     * administration &gt; Authentication &gt; Two-factor
     * authentication](https://cumulocity.com/docs/authentication/tfa/) in the
     * Cumulocity IoT user documentation. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param currentUserTotpSecretActivity (required)
     */
    @RequestLine("POST /user/currentUser/totpSecret/activity")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> postCurrentUserTfaTotpResourceActivityWithHttpInfo(
            CurrentUserTotpSecretActivity currentUserTotpSecretActivity);

    /**
     * Verify TFA code
     * Verifies the authentication code that the current user received from a TFA
     * app/service and uploaded to the platform to gain access or enable the
     * two-factor authentication feature. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param currentUserTotpCode (required)
     */
    @RequestLine("POST /user/currentUser/totpSecret/verify")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void postCurrentUserTfaTotpResourceVerify(CurrentUserTotpCode currentUserTotpCode);

    /**
     * Verify TFA code
     * Similar to <code>postCurrentUserTfaTotpResourceVerify</code> but it also
     * returns the http response headers .
     * Verifies the authentication code that the current user received from a TFA
     * app/service and uploaded to the platform to gain access or enable the
     * two-factor authentication feature. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_READ &lt;b&gt;OR&lt;/b&gt;
     * ROLE_SYSTEM &lt;/section&gt;
     * 
     * @param currentUserTotpCode (required)
     */
    @RequestLine("POST /user/currentUser/totpSecret/verify")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> postCurrentUserTfaTotpResourceVerifyWithHttpInfo(CurrentUserTotpCode currentUserTotpCode);

    /**
     * Update the current user&#39;s password
     * Update the current user&#39;s password. &gt; **⚠️ Important:** If the tenant
     * uses OAI-Secure authentication, the current user will not be logged out.
     * Instead, a new cookie will be set with a new token, and the previous token
     * will expire within a minute. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;/section&gt;
     * 
     * @param passwordChange (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     */
    @RequestLine("PUT /user/currentUser/password")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    void putCurrentUserPasswordResource(PasswordChange passwordChange, @Param("accept") String accept);

    /**
     * Update the current user&#39;s password
     * Similar to <code>putCurrentUserPasswordResource</code> but it also returns
     * the http response headers .
     * Update the current user&#39;s password. &gt; **⚠️ Important:** If the tenant
     * uses OAI-Secure authentication, the current user will not be logged out.
     * Instead, a new cookie will be set with a new token, and the previous token
     * will expire within a minute. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;/section&gt;
     * 
     * @param passwordChange (required)
     * @param accept         Advertises which content types, expressed as MIME
     *                       types, the client is able to understand. (optional)
     */
    @RequestLine("PUT /user/currentUser/password")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<Void> putCurrentUserPasswordResourceWithHttpInfo(PasswordChange passwordChange,
            @Param("accept") String accept);

    /**
     * Update the current user
     * Update the current user. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;/section&gt;
     * 
     * @param currentUser (required)
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @return CurrentUser
     */
    @RequestLine("PUT /user/currentUser")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.currentuser+json",
            "Accept: application/vnd.com.nsn.cumulocity.currentuser+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    CurrentUser putCurrentUserResource(CurrentUser currentUser, @Param("accept") String accept);

    /**
     * Update the current user
     * Similar to <code>putCurrentUserResource</code> but it also returns the http
     * response headers .
     * Update the current user. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_USER_MANAGEMENT_OWN_ADMIN &lt;/section&gt;
     * 
     * @param currentUser (required)
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("PUT /user/currentUser")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.currentuser+json",
            "Accept: application/vnd.com.nsn.cumulocity.currentuser+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<CurrentUser> putCurrentUserResourceWithHttpInfo(CurrentUser currentUser,
            @Param("accept") String accept);

}
