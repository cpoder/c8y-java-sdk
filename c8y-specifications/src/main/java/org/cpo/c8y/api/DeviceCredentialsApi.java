package org.cpo.c8y.api;

import java.io.File;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.BulkNewDeviceRequest;
import org.cpo.c8y.model.DeviceCredentials;
import org.cpo.c8y.model.PostDeviceCredentialsCollectionResourceRequest;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface DeviceCredentialsApi extends ApiClient.Api {

  /**
   * Create a bulk device credentials request
   * Create a bulk device credentials request. Device credentials and basic device
   * representation can be provided within a CSV file which must be UTF-8 or ANSI
   * encoded. The CSV file must have two sections. The first section is the first
   * line of the CSV file. This line contains column names (headers):
   * |Name|Mandatory|Description| |--- |--- |--- | |ID|Yes|The external ID of a
   * device.| |CREDENTIALS|Yes*|Password for the device&#39;s user. Mandatory,
   * unless AUTH_TYPE is \&quot;CERTIFICATES\&quot;, then CREDENTIALS can be
   * skipped.| |AUTH_TYPE|No|Required authentication type for the device&#39;s
   * user. If the device uses credentials, this can be skipped or filled with
   * \&quot;BASIC\&quot;. Devices that use certificates must set
   * \&quot;CERTIFICATES\&quot;.| |TENANT|No|The ID of the tenant for which the
   * registration is executed (only allowed for the management tenant).|
   * |TYPE|No|The type of the device representation.| |NAME|No|The name of the
   * device representation.| |ICCID|No|The ICCID of the device (SIM card number).
   * If the ICCID appears in file, the import adds a fragment
   * &#x60;c8y_Mobile.iccid&#x60;. The ICCID value is not mandatory for each row,
   * see the example for an HTTP request below.| |IDTYPE|No|The type of the
   * external ID. If IDTYPE doesn&#39;t appear in the file, the default value is
   * used. The default value is &#x60;c8y_Serial&#x60;. The IDTYPE value is not
   * mandatory for each row, see the example for an HTTP request below.|
   * |PATH|No|The path in the groups hierarchy where the device is added. PATH
   * contains the name of each group separated by &#x60;/&#x60;, that is:
   * &#x60;main_group/sub_group/.../last_sub_group&#x60;. If a group does not
   * exist, the import creates the group.| |SHELL|No|If this column contains a
   * value of 1, the import adds the SHELL feature to the device (specifically the
   * &#x60;c8y_SupportedOperations&#x60; fragment). The SHELL value is not
   * mandatory for each row, see the example for an HTTP request below.| Section
   * two is the rest of the CSV file. Section two contains the device information.
   * The order and quantity of the values must be the same as of the headers. A
   * separator is automatically obtained from the CSV file. Valid separator values
   * are: &#x60;\\t&#x60; (tabulation mark), &#x60;;&#x60; (semicolon) and
   * &#x60;,&#x60; (comma). &gt; **⚠️ Important:** The CSV file needs the
   * \&quot;com_cumulocity_model_Agent.active\&quot; header with a value of
   * \&quot;true\&quot; to be added to the request. &gt; **&amp;#9432; Info:** A
   * bulk registration creates an elementary representation of the device. Then,
   * the device needs to update it to a full representation with its own status.
   * The device is ready to use only after it is updated to the full
   * representation. Also see [Device management &gt; Device management
   * application &gt; Registering devices &gt; Single device registration &gt;
   * Security token
   * policy](https://cumulocity.com/docs/device-management-application/registering-devices/#security-token-policy)
   * and [Device management &gt; Device integration &gt; Device integration using
   * REST &gt; Integration life
   * cycle](https://cumulocity.com/docs/device-integration/rest/#integration-life-cycle).
   * A CSV file can appear in many forms (with regard to the optional tenant
   * column and the occurrence of device information): * If a user is logged in as
   * the management tenant, then the columns ID, CREDENTIALS and TENANT are
   * mandatory, and the device credentials will be created for the tenant
   * mentioned in the TENANT column. * If a user is logged in as a different
   * tenant, for example, as &#x60;sample_tenant&#x60;, then the columns ID and
   * CREDENTIALS are mandatory (if the file contains the TENANT column, it is
   * ignored and the device credentials will be created for the tenant that is
   * logged in). * If a user wants to add information about the device, the
   * columns TYPE and NAME must appear in the CSV file. * If a user wants to add
   * information about a SIM card number, the columns TYPE, NAME and ICCID must
   * appear in the CSV file. * If a user wants to change the type of external ID,
   * the columns TYPE, NAME and IDTYPE must appear in the CSV file. * If a user
   * wants to add a device to a group, the columns TYPE, NAME and PATH must appear
   * in the CSV file. * If a user wants to add the SHELL feature, the columns
   * TYPE, NAME and SHELL must appear in the CSV file and the column SHELL must
   * contain a value of 1. It is possible to define a custom [external
   * ID](#tag/External-IDs) mapping and some custom device properties which are
   * added to newly created devices during registration: * To add a custom
   * external ID mapping, enter the external ID type as the header of the last
   * column with the prefix \&quot;external-\&quot;, for example, to add an
   * external ID mapping of type &#x60;c8y_Imei&#x60;, enter
   * &#x60;external-c8y_Imei&#x60; in the last column header. The value of this
   * external ID type should be set in the corresponding column of the data rows.
   * * To add a custom property to a registered device, enter the custom property
   * name as a header, for example, \&quot;myCustomProperty\&quot;, and the value
   * would be in the rows below. The custom device properties mapping has the
   * following limitations: * Braces &#39;{}&#39; used in data rows will be
   * interpreted as strings of \&quot;{}\&quot;. The system will interpret the
   * value as an object when some custom property is added, for example, put
   * &#x60;com_cumulocity_model_Agent.active&#x60; into the headers row and
   * &#x60;true&#x60; into the data row to create an object
   * &#x60;\&quot;com_cumulocity_model_Agent\&quot;: {\&quot;active\&quot;:
   * \&quot;true\&quot;}\&quot;&#x60;. * It is not possible to add array values
   * via bulk registration. Example file: &#x60;&#x60;&#x60;csv
   * ID;CREDENTIALS;TYPE;NAME;ICCID;IDTYPE;PATH;SHELL
   * id_101;AbcD1234!1234AbcD;type_of_device;Device 101;111111111;;csv
   * device/subgroup0;1 id_102;AbcD1234!1234AbcD;type_of_device;Device
   * 102;222222222;;csv device/subgroup0;0
   * id_111;AbcD1234!1234AbcD;type_of_device;Device 111;333333333;c8y_Imei;csv
   * device1/subgroup1;0 id_112;AbcD1234!1234AbcD;type_of_device;Device
   * 112;444444444;;csv device1/subgroup1;1
   * id_121;AbcD1234!1234AbcD;type_of_device;Device 121;555555555;;csv
   * device1/subgroup2;1 id_122;AbcD1234!1234AbcD;type_of_device;Device 122;;;csv
   * device1/subgroup2; id_131;AbcD1234!1234AbcD;type_of_device;Device 131;;;csv
   * device1/subgroup3; &#x60;&#x60;&#x60; There is also a simple registration
   * method that creates all registration requests at once, then each one needs to
   * go through regular acceptance. This simple registration only makes use of the
   * ID and PATH fields from the list above. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * 
   * @param file                      The CSV file to be uploaded. (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return BulkNewDeviceRequest
   */
  @RequestLine("POST /devicecontrol/bulkNewDeviceRequests")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.bulknewdevicerequest+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  BulkNewDeviceRequest postBulkNewDeviceRequestCollectionResource(@Param("file") File file,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create a bulk device credentials request
   * Similar to <code>postBulkNewDeviceRequestCollectionResource</code> but it
   * also returns the http response headers .
   * Create a bulk device credentials request. Device credentials and basic device
   * representation can be provided within a CSV file which must be UTF-8 or ANSI
   * encoded. The CSV file must have two sections. The first section is the first
   * line of the CSV file. This line contains column names (headers):
   * |Name|Mandatory|Description| |--- |--- |--- | |ID|Yes|The external ID of a
   * device.| |CREDENTIALS|Yes*|Password for the device&#39;s user. Mandatory,
   * unless AUTH_TYPE is \&quot;CERTIFICATES\&quot;, then CREDENTIALS can be
   * skipped.| |AUTH_TYPE|No|Required authentication type for the device&#39;s
   * user. If the device uses credentials, this can be skipped or filled with
   * \&quot;BASIC\&quot;. Devices that use certificates must set
   * \&quot;CERTIFICATES\&quot;.| |TENANT|No|The ID of the tenant for which the
   * registration is executed (only allowed for the management tenant).|
   * |TYPE|No|The type of the device representation.| |NAME|No|The name of the
   * device representation.| |ICCID|No|The ICCID of the device (SIM card number).
   * If the ICCID appears in file, the import adds a fragment
   * &#x60;c8y_Mobile.iccid&#x60;. The ICCID value is not mandatory for each row,
   * see the example for an HTTP request below.| |IDTYPE|No|The type of the
   * external ID. If IDTYPE doesn&#39;t appear in the file, the default value is
   * used. The default value is &#x60;c8y_Serial&#x60;. The IDTYPE value is not
   * mandatory for each row, see the example for an HTTP request below.|
   * |PATH|No|The path in the groups hierarchy where the device is added. PATH
   * contains the name of each group separated by &#x60;/&#x60;, that is:
   * &#x60;main_group/sub_group/.../last_sub_group&#x60;. If a group does not
   * exist, the import creates the group.| |SHELL|No|If this column contains a
   * value of 1, the import adds the SHELL feature to the device (specifically the
   * &#x60;c8y_SupportedOperations&#x60; fragment). The SHELL value is not
   * mandatory for each row, see the example for an HTTP request below.| Section
   * two is the rest of the CSV file. Section two contains the device information.
   * The order and quantity of the values must be the same as of the headers. A
   * separator is automatically obtained from the CSV file. Valid separator values
   * are: &#x60;\\t&#x60; (tabulation mark), &#x60;;&#x60; (semicolon) and
   * &#x60;,&#x60; (comma). &gt; **⚠️ Important:** The CSV file needs the
   * \&quot;com_cumulocity_model_Agent.active\&quot; header with a value of
   * \&quot;true\&quot; to be added to the request. &gt; **&amp;#9432; Info:** A
   * bulk registration creates an elementary representation of the device. Then,
   * the device needs to update it to a full representation with its own status.
   * The device is ready to use only after it is updated to the full
   * representation. Also see [Device management &gt; Device management
   * application &gt; Registering devices &gt; Single device registration &gt;
   * Security token
   * policy](https://cumulocity.com/docs/device-management-application/registering-devices/#security-token-policy)
   * and [Device management &gt; Device integration &gt; Device integration using
   * REST &gt; Integration life
   * cycle](https://cumulocity.com/docs/device-integration/rest/#integration-life-cycle).
   * A CSV file can appear in many forms (with regard to the optional tenant
   * column and the occurrence of device information): * If a user is logged in as
   * the management tenant, then the columns ID, CREDENTIALS and TENANT are
   * mandatory, and the device credentials will be created for the tenant
   * mentioned in the TENANT column. * If a user is logged in as a different
   * tenant, for example, as &#x60;sample_tenant&#x60;, then the columns ID and
   * CREDENTIALS are mandatory (if the file contains the TENANT column, it is
   * ignored and the device credentials will be created for the tenant that is
   * logged in). * If a user wants to add information about the device, the
   * columns TYPE and NAME must appear in the CSV file. * If a user wants to add
   * information about a SIM card number, the columns TYPE, NAME and ICCID must
   * appear in the CSV file. * If a user wants to change the type of external ID,
   * the columns TYPE, NAME and IDTYPE must appear in the CSV file. * If a user
   * wants to add a device to a group, the columns TYPE, NAME and PATH must appear
   * in the CSV file. * If a user wants to add the SHELL feature, the columns
   * TYPE, NAME and SHELL must appear in the CSV file and the column SHELL must
   * contain a value of 1. It is possible to define a custom [external
   * ID](#tag/External-IDs) mapping and some custom device properties which are
   * added to newly created devices during registration: * To add a custom
   * external ID mapping, enter the external ID type as the header of the last
   * column with the prefix \&quot;external-\&quot;, for example, to add an
   * external ID mapping of type &#x60;c8y_Imei&#x60;, enter
   * &#x60;external-c8y_Imei&#x60; in the last column header. The value of this
   * external ID type should be set in the corresponding column of the data rows.
   * * To add a custom property to a registered device, enter the custom property
   * name as a header, for example, \&quot;myCustomProperty\&quot;, and the value
   * would be in the rows below. The custom device properties mapping has the
   * following limitations: * Braces &#39;{}&#39; used in data rows will be
   * interpreted as strings of \&quot;{}\&quot;. The system will interpret the
   * value as an object when some custom property is added, for example, put
   * &#x60;com_cumulocity_model_Agent.active&#x60; into the headers row and
   * &#x60;true&#x60; into the data row to create an object
   * &#x60;\&quot;com_cumulocity_model_Agent\&quot;: {\&quot;active\&quot;:
   * \&quot;true\&quot;}\&quot;&#x60;. * It is not possible to add array values
   * via bulk registration. Example file: &#x60;&#x60;&#x60;csv
   * ID;CREDENTIALS;TYPE;NAME;ICCID;IDTYPE;PATH;SHELL
   * id_101;AbcD1234!1234AbcD;type_of_device;Device 101;111111111;;csv
   * device/subgroup0;1 id_102;AbcD1234!1234AbcD;type_of_device;Device
   * 102;222222222;;csv device/subgroup0;0
   * id_111;AbcD1234!1234AbcD;type_of_device;Device 111;333333333;c8y_Imei;csv
   * device1/subgroup1;0 id_112;AbcD1234!1234AbcD;type_of_device;Device
   * 112;444444444;;csv device1/subgroup1;1
   * id_121;AbcD1234!1234AbcD;type_of_device;Device 121;555555555;;csv
   * device1/subgroup2;1 id_122;AbcD1234!1234AbcD;type_of_device;Device 122;;;csv
   * device1/subgroup2; id_131;AbcD1234!1234AbcD;type_of_device;Device 131;;;csv
   * device1/subgroup3; &#x60;&#x60;&#x60; There is also a simple registration
   * method that creates all registration requests at once, then each one needs to
   * go through regular acceptance. This simple registration only makes use of the
   * ID and PATH fields from the list above. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_DEVICE_CONTROL_ADMIN &lt;/section&gt;
   * 
   * @param file                      The CSV file to be uploaded. (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /devicecontrol/bulkNewDeviceRequests")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.bulknewdevicerequest+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<BulkNewDeviceRequest> postBulkNewDeviceRequestCollectionResourceWithHttpInfo(@Param("file") File file,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create device credentials
   * Create device credentials. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_BOOTSTRAP &lt;/section&gt;
   * 
   * @param postDeviceCredentialsCollectionResourceRequest (required)
   * @param accept                                         Advertises which
   *                                                       content types,
   *                                                       expressed as MIME
   *                                                       types, the client is
   *                                                       able to understand.
   *                                                       (optional)
   * @param xCumulocityProcessingMode                      Used to explicitly
   *                                                       control the processing
   *                                                       mode of the request.
   *                                                       See [Processing
   *                                                       mode](#processing-mode)
   *                                                       for more details.
   *                                                       (optional, default to
   *                                                       PERSISTENT)
   * @return DeviceCredentials
   */
  @RequestLine("POST /devicecontrol/deviceCredentials")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.devicecredentials+json",
      "Accept: application/vnd.com.nsn.cumulocity.devicecredentials+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  DeviceCredentials postDeviceCredentialsCollectionResource(
      PostDeviceCredentialsCollectionResourceRequest postDeviceCredentialsCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create device credentials
   * Similar to <code>postDeviceCredentialsCollectionResource</code> but it also
   * returns the http response headers .
   * Create device credentials. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_DEVICE_BOOTSTRAP &lt;/section&gt;
   * 
   * @param postDeviceCredentialsCollectionResourceRequest (required)
   * @param accept                                         Advertises which
   *                                                       content types,
   *                                                       expressed as MIME
   *                                                       types, the client is
   *                                                       able to understand.
   *                                                       (optional)
   * @param xCumulocityProcessingMode                      Used to explicitly
   *                                                       control the processing
   *                                                       mode of the request.
   *                                                       See [Processing
   *                                                       mode](#processing-mode)
   *                                                       for more details.
   *                                                       (optional, default to
   *                                                       PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /devicecontrol/deviceCredentials")
  @Headers({
      "Content-Type: application/vnd.com.nsn.cumulocity.devicecredentials+json",
      "Accept: application/vnd.com.nsn.cumulocity.devicecredentials+json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<DeviceCredentials> postDeviceCredentialsCollectionResourceWithHttpInfo(
      PostDeviceCredentialsCollectionResourceRequest postDeviceCredentialsCollectionResourceRequest,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

}
