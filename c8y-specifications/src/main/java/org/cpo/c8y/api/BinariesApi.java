package org.cpo.c8y.api;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.BinaryCollection;
import org.cpo.c8y.model.BinaryInfo;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface BinariesApi extends ApiClient.Api {

  /**
   * Remove a stored file
   * Remove a managed object and its stored file by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the
   * resource &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the resource
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   */
  @RequestLine("DELETE /inventory/binaries/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  void deleteBinariesResource(@Param("id") String id);

  /**
   * Remove a stored file
   * Similar to <code>deleteBinariesResource</code> but it also returns the http
   * response headers .
   * Remove a managed object and its stored file by a given ID.
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN &lt;b&gt;OR&lt;/b&gt; owner of the
   * resource &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_ADMIN permission on the resource
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   */
  @RequestLine("DELETE /inventory/binaries/{id}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<Void> deleteBinariesResourceWithHttpInfo(@Param("id") String id);

  /**
   * Search for stored files
   * Retrieve metadata information about stored files. Search for files by query
   * parameters. This will not download the files.
   * 
   * @param childAdditionId Search for a specific child addition and list all the
   *                        groups to which it belongs. (optional)
   * @param childAssetId    Search for a specific child asset and list all the
   *                        groups to which it belongs. (optional)
   * @param childDeviceId   Search for a specific child device and list all the
   *                        groups to which it belongs. (optional)
   * @param currentPage     The current page of the paginated results. (optional,
   *                        default to 1)
   * @param ids             The managed object IDs to search for.
   *                        &gt;**&amp;#9432; Info:** If you query for multiple
   *                        IDs at once, comma-separate the values. (optional)
   * @param owner           Username of the owner of the managed objects.
   *                        (optional)
   * @param pageSize        Indicates how many entries of the collection shall be
   *                        returned. The upper limit for one page is 2,000
   *                        objects. (optional, default to 5)
   * @param text            Search for managed objects where a property value is
   *                        equal to the given one. The following properties are
   *                        examined: &#x60;id, type, name, owner,
   *                        externalIds&#x60;. (optional)
   * @param type            The type of managed object to search for. (optional)
   * @param withTotalPages  When set to &#x60;true&#x60;, the returned result will
   *                        contain in the statistics object the total number of
   *                        pages. Only applicable on [range
   *                        queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                        (optional, default to false)
   * @return BinaryCollection
   */
  @RequestLine("GET /inventory/binaries?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&ids={ids}&owner={owner}&pageSize={pageSize}&text={text}&type={type}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  BinaryCollection getBinariesCollectionResource(@Param("childAdditionId") String childAdditionId,
      @Param("childAssetId") String childAssetId, @Param("childDeviceId") String childDeviceId,
      @Param("currentPage") Integer currentPage, @Param("ids") List<String> ids, @Param("owner") String owner,
      @Param("pageSize") Integer pageSize, @Param("text") String text, @Param("type") String type,
      @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Search for stored files
   * Similar to <code>getBinariesCollectionResource</code> but it also returns the
   * http response headers .
   * Retrieve metadata information about stored files. Search for files by query
   * parameters. This will not download the files.
   * 
   * @param childAdditionId Search for a specific child addition and list all the
   *                        groups to which it belongs. (optional)
   * @param childAssetId    Search for a specific child asset and list all the
   *                        groups to which it belongs. (optional)
   * @param childDeviceId   Search for a specific child device and list all the
   *                        groups to which it belongs. (optional)
   * @param currentPage     The current page of the paginated results. (optional,
   *                        default to 1)
   * @param ids             The managed object IDs to search for.
   *                        &gt;**&amp;#9432; Info:** If you query for multiple
   *                        IDs at once, comma-separate the values. (optional)
   * @param owner           Username of the owner of the managed objects.
   *                        (optional)
   * @param pageSize        Indicates how many entries of the collection shall be
   *                        returned. The upper limit for one page is 2,000
   *                        objects. (optional, default to 5)
   * @param text            Search for managed objects where a property value is
   *                        equal to the given one. The following properties are
   *                        examined: &#x60;id, type, name, owner,
   *                        externalIds&#x60;. (optional)
   * @param type            The type of managed object to search for. (optional)
   * @param withTotalPages  When set to &#x60;true&#x60;, the returned result will
   *                        contain in the statistics object the total number of
   *                        pages. Only applicable on [range
   *                        queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                        (optional, default to false)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/binaries?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&ids={ids}&owner={owner}&pageSize={pageSize}&text={text}&type={type}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ApiResponse<BinaryCollection> getBinariesCollectionResourceWithHttpInfo(
      @Param("childAdditionId") String childAdditionId, @Param("childAssetId") String childAssetId,
      @Param("childDeviceId") String childDeviceId, @Param("currentPage") Integer currentPage,
      @Param("ids") List<String> ids, @Param("owner") String owner, @Param("pageSize") Integer pageSize,
      @Param("text") String text, @Param("type") String type, @Param("withTotalPages") Boolean withTotalPages);

  /**
   * Search for stored files
   * Retrieve metadata information about stored files. Search for files by query
   * parameters. This will not download the files.
   * Note, this is equivalent to the other
   * <code>getBinariesCollectionResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetBinariesCollectionResourceQueryParams} class that
   * allows for
   * building up this map in a fluent style.
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>childAdditionId - Search for a specific child addition
   *                    and list all the groups to which it belongs.
   *                    (optional)</li>
   *                    <li>childAssetId - Search for a specific child asset and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>childDeviceId - Search for a specific child device and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>ids - The managed object IDs to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple IDs at
   *                    once, comma-separate the values. (optional)</li>
   *                    <li>owner - Username of the owner of the managed objects.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>text - Search for managed objects where a property
   *                    value is equal to the given one. The following properties
   *                    are examined: &#x60;id, type, name, owner,
   *                    externalIds&#x60;. (optional)</li>
   *                    <li>type - The type of managed object to search for.
   *                    (optional)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return BinaryCollection
   */
  @RequestLine("GET /inventory/binaries?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&ids={ids}&owner={owner}&pageSize={pageSize}&text={text}&type={type}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  BinaryCollection getBinariesCollectionResource(
      @QueryMap(encoded = true) GetBinariesCollectionResourceQueryParams queryParams);

  /**
   * Search for stored files
   * Retrieve metadata information about stored files. Search for files by query
   * parameters. This will not download the files.
   * Note, this is equivalent to the other
   * <code>getBinariesCollectionResource</code> that receives the query parameters
   * as a map,
   * but this one also exposes the Http response headers
   * 
   * @param queryParams Map of query parameters as name-value pairs
   *                    <p>
   *                    The following elements may be specified in the query map:
   *                    </p>
   *                    <ul>
   *                    <li>childAdditionId - Search for a specific child addition
   *                    and list all the groups to which it belongs.
   *                    (optional)</li>
   *                    <li>childAssetId - Search for a specific child asset and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>childDeviceId - Search for a specific child device and
   *                    list all the groups to which it belongs. (optional)</li>
   *                    <li>currentPage - The current page of the paginated
   *                    results. (optional, default to 1)</li>
   *                    <li>ids - The managed object IDs to search for.
   *                    &gt;**&amp;#9432; Info:** If you query for multiple IDs at
   *                    once, comma-separate the values. (optional)</li>
   *                    <li>owner - Username of the owner of the managed objects.
   *                    (optional)</li>
   *                    <li>pageSize - Indicates how many entries of the
   *                    collection shall be returned. The upper limit for one page
   *                    is 2,000 objects. (optional, default to 5)</li>
   *                    <li>text - Search for managed objects where a property
   *                    value is equal to the given one. The following properties
   *                    are examined: &#x60;id, type, name, owner,
   *                    externalIds&#x60;. (optional)</li>
   *                    <li>type - The type of managed object to search for.
   *                    (optional)</li>
   *                    <li>withTotalPages - When set to &#x60;true&#x60;, the
   *                    returned result will contain in the statistics object the
   *                    total number of pages. Only applicable on [range
   *                    queries](https://en.wikipedia.org/wiki/Range_query_(database)).
   *                    (optional, default to false)</li>
   *                    </ul>
   * @return BinaryCollection
   */
  @RequestLine("GET /inventory/binaries?childAdditionId={childAdditionId}&childAssetId={childAssetId}&childDeviceId={childDeviceId}&currentPage={currentPage}&ids={ids}&owner={owner}&pageSize={pageSize}&text={text}&type={type}&withTotalPages={withTotalPages}")
  @Headers({
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobjectcollection+json",
  })
  ApiResponse<BinaryCollection> getBinariesCollectionResourceWithHttpInfo(
      @QueryMap(encoded = true) GetBinariesCollectionResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getBinariesCollectionResource</code> method in a fluent style.
   */
  public static class GetBinariesCollectionResourceQueryParams extends HashMap<String, Object> {
    public GetBinariesCollectionResourceQueryParams childAdditionId(final String value) {
      put("childAdditionId", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams childAssetId(final String value) {
      put("childAssetId", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams childDeviceId(final String value) {
      put("childDeviceId", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams currentPage(final Integer value) {
      put("currentPage", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams ids(final List<String> value) {
      put("ids", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams owner(final String value) {
      put("owner", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams pageSize(final Integer value) {
      put("pageSize", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams text(final String value) {
      put("text", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }

    public GetBinariesCollectionResourceQueryParams withTotalPages(final Boolean value) {
      put("withTotalPages", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a stored file
   * Retrieve a stored file (managed object) by a given ID. Supports chunk
   * download and resuming an interrupted download using the [&#x60;Range&#x60;
   * header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * resource &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the resource
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return File
   */
  @RequestLine("GET /inventory/binaries/{id}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  File getBinariesResource(@Param("id") String id);

  /**
   * Retrieve a stored file
   * Similar to <code>getBinariesResource</code> but it also returns the http
   * response headers .
   * Retrieve a stored file (managed object) by a given ID. Supports chunk
   * download and resuming an interrupted download using the [&#x60;Range&#x60;
   * header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range).
   * &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt; ROLE_INVENTORY_READ
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_READ &lt;b&gt;OR&lt;/b&gt; owner of the
   * resource &lt;b&gt;OR&lt;/b&gt; MANAGE_OBJECT_READ permission on the resource
   * &lt;/section&gt;
   * 
   * @param id Unique identifier of the managed object. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /inventory/binaries/{id}")
  @Headers({
      "Accept: application/octet-stream,application/vnd.com.nsn.cumulocity.error+json",
  })
  ApiResponse<File> getBinariesResourceWithHttpInfo(@Param("id") String id);

  /**
   * Upload a file
   * Uploading a file (binary) requires providing the following properties: *
   * &#x60;object&#x60; – In JSON format, it contains information about the file.
   * * &#x60;file&#x60; – Contains the file to be uploaded. After the file has
   * been uploaded, the corresponding managed object will contain the fragment
   * &#x60;c8y_IsBinary&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_CREATE
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_BINARY_CREATE &lt;/section&gt;
   * 
   * @param _object (required)
   * @param file    Path of the file to be uploaded. (required)
   * @return File
   */
  @RequestLine("POST /inventory/binaries")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  File postBinariesCollectionResource(@Param("object") BinaryInfo _object, @Param("file") File file);

  /**
   * Upload a file
   * Similar to <code>postBinariesCollectionResource</code> but it also returns
   * the http response headers .
   * Uploading a file (binary) requires providing the following properties: *
   * &#x60;object&#x60; – In JSON format, it contains information about the file.
   * * &#x60;file&#x60; – Contains the file to be uploaded. After the file has
   * been uploaded, the corresponding managed object will contain the fragment
   * &#x60;c8y_IsBinary&#x60;. &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_INVENTORY_CREATE
   * &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN &lt;b&gt;OR&lt;/b&gt;
   * ROLE_BINARY_CREATE &lt;/section&gt;
   * 
   * @param _object (required)
   * @param file    Path of the file to be uploaded. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /inventory/binaries")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ApiResponse<File> postBinariesCollectionResourceWithHttpInfo(@Param("object") BinaryInfo _object,
      @Param("file") File file);

  /**
   * Replace a file
   * Upload and replace the attached file (binary) of a specific managed object by
   * a given ID.&lt;br&gt; &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the resource &lt;/section&gt;
   * 
   * @param id   Unique identifier of the managed object. (required)
   * @param body (required)
   * @return File
   */
  @RequestLine("PUT /inventory/binaries/{id}")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  File putBinariesResource(@Param("id") String id, File body);

  /**
   * Replace a file
   * Similar to <code>putBinariesResource</code> but it also returns the http
   * response headers .
   * Upload and replace the attached file (binary) of a specific managed object by
   * a given ID.&lt;br&gt; &lt;section&gt;&lt;h5&gt;Required roles&lt;/h5&gt;
   * ROLE_INVENTORY_ADMIN &lt;b&gt;OR&lt;/b&gt; ROLE_BINARY_ADMIN
   * &lt;b&gt;OR&lt;/b&gt; owner of the resource &lt;b&gt;OR&lt;/b&gt;
   * MANAGE_OBJECT_ADMIN permission on the resource &lt;/section&gt;
   * 
   * @param id   Unique identifier of the managed object. (required)
   * @param body (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /inventory/binaries/{id}")
  @Headers({
      "Content-Type: text/plain",
      "Accept: application/vnd.com.nsn.cumulocity.error+json,application/vnd.com.nsn.cumulocity.managedobject+json",
  })
  ApiResponse<File> putBinariesResourceWithHttpInfo(@Param("id") String id, File body);

}
