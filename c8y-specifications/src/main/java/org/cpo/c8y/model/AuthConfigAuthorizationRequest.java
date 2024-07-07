package org.cpo.c8y.model;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * AuthConfigAuthorizationRequest
 */

@JsonTypeName("authConfig_authorizationRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class AuthConfigAuthorizationRequest {

  private String body;

  private Map<String, String> headers = new HashMap<>();

  /**
   * HTTP request method.
   */
  public enum MethodEnum {
    GET("GET"),

    POST("POST");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MethodEnum method;

  /**
   * Requested operation.
   */
  public enum OperationEnum {
    EXECUTE("EXECUTE"),

    REDIRECT("REDIRECT");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  private Map<String, String> requestParams = new HashMap<>();

  private URI url;

  public AuthConfigAuthorizationRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Body of the request.
   * 
   * @return body
   */

  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public AuthConfigAuthorizationRequest headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public AuthConfigAuthorizationRequest putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Headers of the request.
   * 
   * @return headers
   */

  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public AuthConfigAuthorizationRequest method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP request method.
   * 
   * @return method
   */

  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public AuthConfigAuthorizationRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Requested operation.
   * 
   * @return operation
   */

  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public AuthConfigAuthorizationRequest requestParams(Map<String, String> requestParams) {
    this.requestParams = requestParams;
    return this;
  }

  public AuthConfigAuthorizationRequest putRequestParamsItem(String key, String requestParamsItem) {
    if (this.requestParams == null) {
      this.requestParams = new HashMap<>();
    }
    this.requestParams.put(key, requestParamsItem);
    return this;
  }

  /**
   * Parameters of the request.
   * 
   * @return requestParams
   */

  @JsonProperty("requestParams")
  public Map<String, String> getRequestParams() {
    return requestParams;
  }

  public void setRequestParams(Map<String, String> requestParams) {
    this.requestParams = requestParams;
  }

  public AuthConfigAuthorizationRequest url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Target of the request described as a URL.
   * 
   * @return url
   */

  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public AuthConfigAuthorizationRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigAuthorizationRequest authConfigAuthorizationRequest = (AuthConfigAuthorizationRequest) o;
    return Objects.equals(this.body, authConfigAuthorizationRequest.body) &&
        Objects.equals(this.headers, authConfigAuthorizationRequest.headers) &&
        Objects.equals(this.method, authConfigAuthorizationRequest.method) &&
        Objects.equals(this.operation, authConfigAuthorizationRequest.operation) &&
        Objects.equals(this.requestParams, authConfigAuthorizationRequest.requestParams) &&
        Objects.equals(this.url, authConfigAuthorizationRequest.url) &&
        Objects.equals(this.additionalProperties, authConfigAuthorizationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers, method, operation, requestParams, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigAuthorizationRequest {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");

    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
