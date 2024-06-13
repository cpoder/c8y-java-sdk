package org.cpo.c8y.api;

import java.util.HashMap;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.EncodingUtils;
import org.cpo.c8y.model.ApiResponse;
import org.cpo.c8y.model.NotificationSubscriptionResult;
import org.cpo.c8y.model.NotificationToken;
import org.cpo.c8y.model.NotificationTokenClaims;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-12T15:25:13.061619582+02:00[Europe/Paris]", comments = "Generator version: 7.5.0")
public interface TokensApi extends ApiClient.Api {

  /**
   * Create a notification token
   * Create a new JWT (JSON web token) access token which can be used to establish
   * a successful WebSocket connection to read a sequence of notifications. In
   * general, each request to obtain an access token consists of: * The subscriber
   * name which the client wishes to be identified with. * The subscription name.
   * This value must be associated with a subscription that&#39;s already been
   * created and in essence, the obtained token will give the ability to read
   * notifications for the subscription that is specified here. * The token
   * expiration duration. * The option to disable signing of the token by the
   * Cumulocity IoT platform. * The subscription type that the token should be
   * associated with. * The option to use the token to create shared consumers of
   * the subscription. * The option to select the non-persistent variant of the
   * subscription, if one exists. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
   * 
   * @param notificationTokenClaims   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return NotificationToken
   */
  @RequestLine("POST /notification2/token")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  NotificationToken postNotificationTokenResource(NotificationTokenClaims notificationTokenClaims,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Create a notification token
   * Similar to <code>postNotificationTokenResource</code> but it also returns the
   * http response headers .
   * Create a new JWT (JSON web token) access token which can be used to establish
   * a successful WebSocket connection to read a sequence of notifications. In
   * general, each request to obtain an access token consists of: * The subscriber
   * name which the client wishes to be identified with. * The subscription name.
   * This value must be associated with a subscription that&#39;s already been
   * created and in essence, the obtained token will give the ability to read
   * notifications for the subscription that is specified here. * The token
   * expiration duration. * The option to disable signing of the token by the
   * Cumulocity IoT platform. * The subscription type that the token should be
   * associated with. * The option to use the token to create shared consumers of
   * the subscription. * The option to select the non-persistent variant of the
   * subscription, if one exists. &lt;section&gt;&lt;h5&gt;Required
   * roles&lt;/h5&gt; ROLE_NOTIFICATION_2_ADMIN &lt;/section&gt;
   * 
   * @param notificationTokenClaims   (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /notification2/token")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<NotificationToken> postNotificationTokenResourceWithHttpInfo(
      NotificationTokenClaims notificationTokenClaims, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Unsubscribe a subscriber
   * Unsubscribe a notification subscriber using the notification token. Once a
   * subscription is made, notifications will be kept until they are consumed by
   * all subscribers who have previously connected to the subscription. For
   * non-volatile subscriptions, this can result in notifications remaining in
   * storage if never consumed by the application. They will be deleted if a
   * tenant is deleted. It can take up considerable space in permanent storage for
   * high-frequency notification sources. Therefore, we recommend you to
   * unsubscribe a subscriber that will never run again.
   * 
   * @param token                     Subscriptions associated with this token
   *                                  will be removed. (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return NotificationSubscriptionResult
   */
  @RequestLine("POST /notification2/unsubscribe?token={token}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  NotificationSubscriptionResult postNotificationTokenUnsubscribeResource(@Param("token") String token,
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Unsubscribe a subscriber
   * Similar to <code>postNotificationTokenUnsubscribeResource</code> but it also
   * returns the http response headers .
   * Unsubscribe a notification subscriber using the notification token. Once a
   * subscription is made, notifications will be kept until they are consumed by
   * all subscribers who have previously connected to the subscription. For
   * non-volatile subscriptions, this can result in notifications remaining in
   * storage if never consumed by the application. They will be deleted if a
   * tenant is deleted. It can take up considerable space in permanent storage for
   * high-frequency notification sources. Therefore, we recommend you to
   * unsubscribe a subscriber that will never run again.
   * 
   * @param token                     Subscriptions associated with this token
   *                                  will be removed. (required)
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /notification2/unsubscribe?token={token}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<NotificationSubscriptionResult> postNotificationTokenUnsubscribeResourceWithHttpInfo(
      @Param("token") String token, @Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode);

  /**
   * Unsubscribe a subscriber
   * Unsubscribe a notification subscriber using the notification token. Once a
   * subscription is made, notifications will be kept until they are consumed by
   * all subscribers who have previously connected to the subscription. For
   * non-volatile subscriptions, this can result in notifications remaining in
   * storage if never consumed by the application. They will be deleted if a
   * tenant is deleted. It can take up considerable space in permanent storage for
   * high-frequency notification sources. Therefore, we recommend you to
   * unsubscribe a subscriber that will never run again.
   * Note, this is equivalent to the other
   * <code>postNotificationTokenUnsubscribeResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostNotificationTokenUnsubscribeResourceQueryParams}
   * class that allows for
   * building up this map in a fluent style.
   * 
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param queryParams               Map of query parameters as name-value pairs
   *                                  <p>
   *                                  The following elements may be specified in
   *                                  the query map:
   *                                  </p>
   *                                  <ul>
   *                                  <li>token - Subscriptions associated with
   *                                  this token will be removed. (required)</li>
   *                                  </ul>
   * @return NotificationSubscriptionResult
   */
  @RequestLine("POST /notification2/unsubscribe?token={token}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  NotificationSubscriptionResult postNotificationTokenUnsubscribeResource(@Param("accept") String accept,
      @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PostNotificationTokenUnsubscribeResourceQueryParams queryParams);

  /**
   * Unsubscribe a subscriber
   * Unsubscribe a notification subscriber using the notification token. Once a
   * subscription is made, notifications will be kept until they are consumed by
   * all subscribers who have previously connected to the subscription. For
   * non-volatile subscriptions, this can result in notifications remaining in
   * storage if never consumed by the application. They will be deleted if a
   * tenant is deleted. It can take up considerable space in permanent storage for
   * high-frequency notification sources. Therefore, we recommend you to
   * unsubscribe a subscriber that will never run again.
   * Note, this is equivalent to the other
   * <code>postNotificationTokenUnsubscribeResource</code> that receives the query
   * parameters as a map,
   * but this one also exposes the Http response headers
   * 
   * @param accept                    Advertises which content types, expressed as
   *                                  MIME types, the client is able to
   *                                  understand. (optional)
   * @param xCumulocityProcessingMode Used to explicitly control the processing
   *                                  mode of the request. See [Processing
   *                                  mode](#processing-mode) for more details.
   *                                  (optional, default to PERSISTENT)
   * @param queryParams               Map of query parameters as name-value pairs
   *                                  <p>
   *                                  The following elements may be specified in
   *                                  the query map:
   *                                  </p>
   *                                  <ul>
   *                                  <li>token - Subscriptions associated with
   *                                  this token will be removed. (required)</li>
   *                                  </ul>
   * @return NotificationSubscriptionResult
   */
  @RequestLine("POST /notification2/unsubscribe?token={token}")
  @Headers({
      "Accept: application/json,application/vnd.com.nsn.cumulocity.error+json",
      "Accept: {accept}",

      "X-Cumulocity-Processing-Mode: {xCumulocityProcessingMode}"
  })
  ApiResponse<NotificationSubscriptionResult> postNotificationTokenUnsubscribeResourceWithHttpInfo(
      @Param("accept") String accept, @Param("xCumulocityProcessingMode") String xCumulocityProcessingMode,
      @QueryMap(encoded = true) PostNotificationTokenUnsubscribeResourceQueryParams queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>postNotificationTokenUnsubscribeResource</code> method in a fluent
   * style.
   */
  public static class PostNotificationTokenUnsubscribeResourceQueryParams extends HashMap<String, Object> {
    public PostNotificationTokenUnsubscribeResourceQueryParams token(final String value) {
      put("token", EncodingUtils.encode(value));
      return this;
    }
  }
}
