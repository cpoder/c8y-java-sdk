package org.cpo.c8y.api;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.DevicePermissionOwners;
import org.cpo.c8y.model.UpdatedDevicePermissions;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface DevicePermissionsApi extends ApiClient.Api {

  /**
   * Returns all device permissions assignments
   * Returns all device permissions assignments if the current user has READ
   * permission. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return DevicePermissionOwners
   */
  @RequestLine("GET /user/devicePermissions/{id}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  DevicePermissionOwners getDevicePermissionsResource(@Param("id") String id);

  /**
   * Returns all device permissions assignments
   * Similar to <code>getDevicePermissionsResource</code> but it also returns the
   * http response headers .
   * Returns all device permissions assignments if the current user has READ
   * permission. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_USER_MANAGEMENT_READ &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /user/devicePermissions/{id}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<DevicePermissionOwners> getDevicePermissionsResourceWithHttpInfo(@Param("id") String id);

  /**
   * Updates the device permissions assignments
   * Updates the device permissions assignments if the current user has ADMIN
   * permission or CREATE permission and also has all device permissions.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param id                       Unique identifier of the managed object.
   *                                 (required)
   * @param updatedDevicePermissions (required)
   * @param accept                   Advertises which content types, expressed as
   *                                 MIME types, the client is able to understand.
   *                                 (optional)
   */
  @RequestLine("PUT /user/devicePermissions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  void putDevicePermissionsResource(@Param("id") String id, UpdatedDevicePermissions updatedDevicePermissions,
      @Param("accept") String accept);

  /**
   * Updates the device permissions assignments
   * Similar to <code>putDevicePermissionsResource</code> but it also returns the
   * http response headers .
   * Updates the device permissions assignments if the current user has ADMIN
   * permission or CREATE permission and also has all device permissions.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_USER_MANAGEMENT_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_USER_MANAGEMENT_CREATE &lt;/section&gt;
   * 
   * @param id                       Unique identifier of the managed object.
   *                                 (required)
   * @param updatedDevicePermissions (required)
   * @param accept                   Advertises which content types, expressed as
   *                                 MIME types, the client is able to understand.
   *                                 (optional)
   */
  @RequestLine("PUT /user/devicePermissions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}"
  })
  ApiResponse<Void> putDevicePermissionsResourceWithHttpInfo(@Param("id") String id,
      UpdatedDevicePermissions updatedDevicePermissions, @Param("accept") String accept);

}
