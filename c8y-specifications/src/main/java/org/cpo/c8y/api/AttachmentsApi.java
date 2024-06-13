package org.cpo.c8y.api;

import java.io.File;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.EventBinary;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface AttachmentsApi extends ApiClient.Api {

  /**
   * Remove the attached file from a specific event
   * Remove the attached file (binary) from a specific event by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   */
  @RequestLine("DELETE /event/events/{id}/binaries")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteEventBinaryResource(@Param("id") String id);

  /**
   * Remove the attached file from a specific event
   * Similar to <code>deleteEventBinaryResource</code> but it also returns the
   * http response headers .
   * Remove the attached file (binary) from a specific event by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   */
  @RequestLine("DELETE /event/events/{id}/binaries")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteEventBinaryResourceWithHttpInfo(@Param("id") String id);

  /**
   * Retrieve the attached file of a specific event
   * Retrieve the attached file (binary) of a specific event by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_READ
   * &lt;b&gt;OR&lt;/b&gt; EVENT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   * @return File
   */
  @RequestLine("GET /event/events/{id}/binaries")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  File getEventBinaryResource(@Param("id") String id);

  /**
   * Retrieve the attached file of a specific event
   * Similar to <code>getEventBinaryResource</code> but it also returns the http
   * response headers .
   * Retrieve the attached file (binary) of a specific event by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_READ
   * &lt;b&gt;OR&lt;/b&gt; EVENT_READ permission on the source &lt;/section&gt;
   * 
   * @param id Unique identifier of the event. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /event/events/{id}/binaries")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<File> getEventBinaryResourceWithHttpInfo(@Param("id") String id);

  /**
   * Attach a file to a specific event
   * Upload a file (binary) as an attachment of a specific event by a given ID.
   * The size of the attachment is configurable, and the default size is 50 MiB.
   * The default chunk size is 5MiB. &gt; **&amp;#9432; Info:** If there is a
   * binary already attached to the event, the POST request results in a 409
   * error. When the file has been uploaded, the corresponding event contains the
   * fragment &#x60;c8y_IsBinary&#x60; similar to: &#x60;&#x60;&#x60;json
   * \&quot;c8y_IsBinary\&quot;: { \&quot;name\&quot;: \&quot;hello.txt\&quot;,
   * \&quot;length\&quot;: 365, \&quot;type\&quot;: \&quot;text/plain\&quot; }
   * &#x60;&#x60;&#x60; There are two request body schemas you can use for your
   * POST requests. &#x60;text/plain&#x60; is preselected (see below). If you set
   * it to &#x60;multipart/form-data&#x60; each value is sent as a block of data
   * (body part), with a user agent-defined delimiter (&#x60;boundary&#x60;)
   * separating each part. The keys are given in the
   * &#x60;Content-Disposition&#x60; header of each part. &#x60;&#x60;&#x60;http
   * POST /event/events/{id}/binaries Host: https://&lt;TENANT_DOMAIN&gt;
   * Authorization: &lt;AUTHORIZATION&gt; Accept: application/json Content-Type:
   * multipart/form-data;boundary&#x3D;\&quot;boundary\&quot; --boundary
   * Content-Disposition: form-data; name&#x3D;\&quot;object\&quot; {
   * \&quot;name\&quot;: \&quot;hello.txt\&quot;, \&quot;type\&quot;:
   * \&quot;text/plain\&quot; } --boundary Content-Disposition: form-data;
   * name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;hello.txt\&quot;
   * Content-Type: text/plain &lt;FILE_CONTENTS&gt; --boundary--
   * &#x60;&#x60;&#x60; &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id   Unique identifier of the event. (required)
   * @param body (required)
   * @return EventBinary
   */
  @RequestLine("POST /event/events/{id}/binaries")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  EventBinary postEventBinaryResource(@Param("id") String id, File body);

  /**
   * Attach a file to a specific event
   * Similar to <code>postEventBinaryResource</code> but it also returns the http
   * response headers .
   * Upload a file (binary) as an attachment of a specific event by a given ID.
   * The size of the attachment is configurable, and the default size is 50 MiB.
   * The default chunk size is 5MiB. &gt; **&amp;#9432; Info:** If there is a
   * binary already attached to the event, the POST request results in a 409
   * error. When the file has been uploaded, the corresponding event contains the
   * fragment &#x60;c8y_IsBinary&#x60; similar to: &#x60;&#x60;&#x60;json
   * \&quot;c8y_IsBinary\&quot;: { \&quot;name\&quot;: \&quot;hello.txt\&quot;,
   * \&quot;length\&quot;: 365, \&quot;type\&quot;: \&quot;text/plain\&quot; }
   * &#x60;&#x60;&#x60; There are two request body schemas you can use for your
   * POST requests. &#x60;text/plain&#x60; is preselected (see below). If you set
   * it to &#x60;multipart/form-data&#x60; each value is sent as a block of data
   * (body part), with a user agent-defined delimiter (&#x60;boundary&#x60;)
   * separating each part. The keys are given in the
   * &#x60;Content-Disposition&#x60; header of each part. &#x60;&#x60;&#x60;http
   * POST /event/events/{id}/binaries Host: https://&lt;TENANT_DOMAIN&gt;
   * Authorization: &lt;AUTHORIZATION&gt; Accept: application/json Content-Type:
   * multipart/form-data;boundary&#x3D;\&quot;boundary\&quot; --boundary
   * Content-Disposition: form-data; name&#x3D;\&quot;object\&quot; {
   * \&quot;name\&quot;: \&quot;hello.txt\&quot;, \&quot;type\&quot;:
   * \&quot;text/plain\&quot; } --boundary Content-Disposition: form-data;
   * name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;hello.txt\&quot;
   * Content-Type: text/plain &lt;FILE_CONTENTS&gt; --boundary--
   * &#x60;&#x60;&#x60; &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_EVENT_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the source
   * &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN permission on the source &lt;/section&gt;
   * 
   * @param id   Unique identifier of the event. (required)
   * @param body (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /event/events/{id}/binaries")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<EventBinary> postEventBinaryResourceWithHttpInfo(@Param("id") String id, File body);

  /**
   * Replace the attached file of a specific event
   * Upload and replace the attached file (binary) of a specific event by a given
   * ID.&lt;br&gt; The size of the attachment is configurable, and the default
   * size is 50 MiB. The default chunk size is 5MiB.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id   Unique identifier of the event. (required)
   * @param body (optional)
   * @return EventBinary
   */
  @RequestLine("PUT /event/events/{id}/binaries")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  EventBinary putEventBinaryResource(@Param("id") String id, File body);

  /**
   * Replace the attached file of a specific event
   * Similar to <code>putEventBinaryResource</code> but it also returns the http
   * response headers .
   * Upload and replace the attached file (binary) of a specific event by a given
   * ID.&lt;br&gt; The size of the attachment is configurable, and the default
   * size is 50 MiB. The default chunk size is 5MiB.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_EVENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the source &lt;b&gt;OR&lt;/b&gt; EVENT_ADMIN
   * permission on the source &lt;/section&gt;
   * 
   * @param id   Unique identifier of the event. (required)
   * @param body (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /event/events/{id}/binaries")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<EventBinary> putEventBinaryResourceWithHttpInfo(@Param("id") String id, File body);

}
