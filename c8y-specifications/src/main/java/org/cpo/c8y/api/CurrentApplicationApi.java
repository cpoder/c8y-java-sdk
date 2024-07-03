package org.cpo.c8y.api;

import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Application;
import org.cpo.c8y.model.ApplicationSettingsInner;
import org.cpo.c8y.model.ApplicationUserCollection;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface CurrentApplicationApi extends ApiClient.Api {

    /**
     * Retrieve the subscribed users of the current application
     * Retrieve the subscribed users of the current application.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; Microservice bootstrap
     * user required. &lt;/section&gt;
     * 
     * @return ApplicationUserCollection
     */
    @RequestLine("GET /application/currentApplication/subscriptions")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationusercollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApplicationUserCollection getApplicationUserCollectionRepresentation();

    /**
     * Retrieve the subscribed users of the current application
     * Similar to <code>getApplicationUserCollectionRepresentation</code> but it
     * also returns the http response headers .
     * Retrieve the subscribed users of the current application.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; Microservice bootstrap
     * user required. &lt;/section&gt;
     * 
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/currentApplication/subscriptions")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationusercollection+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<ApplicationUserCollection> getApplicationUserCollectionRepresentationWithHttpInfo();

    /**
     * Retrieve the current application
     * Retrieve the current application. This only works inside an application, for
     * example, a microservice. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * Microservice bootstrap user required. &lt;/section&gt;
     * 
     * @return Application
     */
    @RequestLine("GET /application/currentApplication")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    Application getCurrentApplicationResource();

    /**
     * Retrieve the current application
     * Similar to <code>getCurrentApplicationResource</code> but it also returns the
     * http response headers .
     * Retrieve the current application. This only works inside an application, for
     * example, a microservice. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * Microservice bootstrap user required. &lt;/section&gt;
     * 
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/currentApplication")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Application> getCurrentApplicationResourceWithHttpInfo();

    /**
     * Retrieve the current application settings
     * Retrieve the current application settings. This only works inside an
     * application, for example, a microservice. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; Microservice bootstrap user &lt;b&gt;OR&lt;/b&gt;
     * microservice service user required. &lt;/section&gt;
     * 
     * @return List&lt;ApplicationSettingsInner&gt;
     */
    @RequestLine("GET /application/currentApplication/settings")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationsettings+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    List<ApplicationSettingsInner> getCurrentApplicationResourceSettings();

    /**
     * Retrieve the current application settings
     * Similar to <code>getCurrentApplicationResourceSettings</code> but it also
     * returns the http response headers .
     * Retrieve the current application settings. This only works inside an
     * application, for example, a microservice. &lt;section&gt;&lt;h5&gt;Required
     * roles&lt;/h5&gt; Microservice bootstrap user &lt;b&gt;OR&lt;/b&gt;
     * microservice service user required. &lt;/section&gt;
     * 
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/currentApplication/settings")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationsettings+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<List<ApplicationSettingsInner>> getCurrentApplicationResourceSettingsWithHttpInfo();

    /**
     * Update the current application
     * Update the current application. This only works inside an application, for
     * example, a microservice. This method is deprecated as it is only used by
     * legacy microservices that are not running on Kubernetes.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; Microservice bootstrap
     * user required. &lt;/section&gt;
     * 
     * @param application (required)
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @return Application
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /application/currentApplication")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    Application putCurrentApplicationResource(Application application, @Param("accept") String accept);

    /**
     * Update the current application
     * Similar to <code>putCurrentApplicationResource</code> but it also returns the
     * http response headers .
     * Update the current application. This only works inside an application, for
     * example, a microservice. This method is deprecated as it is only used by
     * legacy microservices that are not running on Kubernetes.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; Microservice bootstrap
     * user required. &lt;/section&gt;
     * 
     * @param application (required)
     * @param accept      Advertises which content types, expressed as MIME types,
     *                    the client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /application/currentApplication")
    @Headers({
            "Content-Type: application/vnd.com.nsn.cumulocity.application+json",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<Application> putCurrentApplicationResourceWithHttpInfo(Application application,
            @Param("accept") String accept);

}
