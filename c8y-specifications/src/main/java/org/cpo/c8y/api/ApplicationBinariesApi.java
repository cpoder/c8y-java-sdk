package org.cpo.c8y.api;

import java.io.File;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.Application;
import org.cpo.c8y.model.ApplicationBinaries;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface ApplicationBinariesApi extends ApiClient.Api {

    /**
     * Delete a specific application attachment
     * Delete a specific application attachment (by a given application ID and a
     * given binary ID). This method is not supported by microservice applications.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id       Unique identifier of the application. (required)
     * @param binaryId Unique identifier of the binary. (required)
     */
    @RequestLine("DELETE /application/applications/{id}/binaries/{binaryId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    void deleteBinaryApplicationContentResourceById(@Param("id") String id, @Param("binaryId") String binaryId);

    /**
     * Delete a specific application attachment
     * Similar to <code>deleteBinaryApplicationContentResourceById</code> but it
     * also returns the http response headers .
     * Delete a specific application attachment (by a given application ID and a
     * given binary ID). This method is not supported by microservice applications.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id       Unique identifier of the application. (required)
     * @param binaryId Unique identifier of the binary. (required)
     */
    @RequestLine("DELETE /application/applications/{id}/binaries/{binaryId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<Void> deleteBinaryApplicationContentResourceByIdWithHttpInfo(@Param("id") String id,
            @Param("binaryId") String binaryId);

    /**
     * Retrieve all application attachments
     * Retrieve all application attachments. This method is not supported by
     * microservice applications. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id Unique identifier of the application. (required)
     * @return ApplicationBinaries
     */
    @RequestLine("GET /application/applications/{id}/binaries")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationbinaries+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApplicationBinaries getBinaryApplicationContentResource(@Param("id") String id);

    /**
     * Retrieve all application attachments
     * Similar to <code>getBinaryApplicationContentResource</code> but it also
     * returns the http response headers .
     * Retrieve all application attachments. This method is not supported by
     * microservice applications. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id Unique identifier of the application. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applications/{id}/binaries")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.applicationbinaries+json,application/vnd.com.nsn.cumulocity.error+json",
    })
    ApiResponse<ApplicationBinaries> getBinaryApplicationContentResourceWithHttpInfo(@Param("id") String id);

    /**
     * Retrieve a specific application attachment
     * Retrieve a specific application attachment (by a given application ID and a
     * given binary ID). This method is not supported by microservice applications.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id       Unique identifier of the application. (required)
     * @param binaryId Unique identifier of the binary. (required)
     * @return File
     */
    @RequestLine("GET /application/applications/{id}/binaries/{binaryId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/zip",
    })
    File getBinaryApplicationContentResourceById(@Param("id") String id, @Param("binaryId") String binaryId);

    /**
     * Retrieve a specific application attachment
     * Similar to <code>getBinaryApplicationContentResourceById</code> but it also
     * returns the http response headers .
     * Retrieve a specific application attachment (by a given application ID and a
     * given binary ID). This method is not supported by microservice applications.
     * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;/section&gt;
     * 
     * @param id       Unique identifier of the application. (required)
     * @param binaryId Unique identifier of the binary. (required)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("GET /application/applications/{id}/binaries/{binaryId}")
    @Headers({
            "Accept: application/vnd.com.nsn.cumulocity.error+json,application/zip",
    })
    ApiResponse<File> getBinaryApplicationContentResourceByIdWithHttpInfo(@Param("id") String id,
            @Param("binaryId") String binaryId);

    /**
     * Upload an application attachment
     * Upload an application attachment (by a given application ID). For the
     * applications of type “microservice” and “web application” to be available for
     * Cumulocity IoT platform users, an attachment ZIP file must be uploaded. For a
     * microservice application, the ZIP file must consist of: * cumulocity.json -
     * file describing the deployment * image.tar - executable Docker image For a
     * web application, the ZIP file must include an index.html file in the root
     * directory. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id     Unique identifier of the application. (required)
     * @param file   The ZIP file to be uploaded. (required)
     * @param accept Advertises which content types, expressed as MIME types, the
     *               client is able to understand. (optional)
     * @return Application
     */
    @RequestLine("POST /application/applications/{id}/binaries")
    @Headers({
            "Content-Type: multipart/form-data",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    Application postBinaryApplicationContentResource(@Param("id") String id, @Param("file") File file,
            @Param("accept") String accept);

    /**
     * Upload an application attachment
     * Similar to <code>postBinaryApplicationContentResource</code> but it also
     * returns the http response headers .
     * Upload an application attachment (by a given application ID). For the
     * applications of type “microservice” and “web application” to be available for
     * Cumulocity IoT platform users, an attachment ZIP file must be uploaded. For a
     * microservice application, the ZIP file must consist of: * cumulocity.json -
     * file describing the deployment * image.tar - executable Docker image For a
     * web application, the ZIP file must include an index.html file in the root
     * directory. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
     * ROLE_APPLICATION_MANAGEMENT_ADMIN &lt;b&gt;AND&lt;/b&gt; tenant is the owner
     * of the application &lt;/section&gt;
     * 
     * @param id     Unique identifier of the application. (required)
     * @param file   The ZIP file to be uploaded. (required)
     * @param accept Advertises which content types, expressed as MIME types, the
     *               client is able to understand. (optional)
     * @return A ApiResponse that wraps the response boyd and the http headers.
     */
    @RequestLine("POST /application/applications/{id}/binaries")
    @Headers({
            "Content-Type: multipart/form-data",
            "Accept: application/vnd.com.nsn.cumulocity.application+json,application/vnd.com.nsn.cumulocity.error+json",
            "Accept: {accept}"
    })
    ApiResponse<Application> postBinaryApplicationContentResourceWithHttpInfo(@Param("id") String id,
            @Param("file") File file, @Param("accept") String accept);

}
