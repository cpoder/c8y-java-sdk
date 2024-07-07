package org.cpo.c8y.model;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * RequestRepresentation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RequestRepresentation {

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

  public RequestRepresentation body(String body) {
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

  public RequestRepresentation headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public RequestRepresentation putHeadersItem(String key, String headersItem) {
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

  public RequestRepresentation method(MethodEnum method) {
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

  public RequestRepresentation operation(OperationEnum operation) {
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

  public RequestRepresentation requestParams(Map<String, String> requestParams) {
    this.requestParams = requestParams;
    return this;
  }

  public RequestRepresentation putRequestParamsItem(String key, String requestParamsItem) {
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

  public RequestRepresentation url(URI url) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRepresentation requestRepresentation = (RequestRepresentation) o;
    return Objects.equals(this.body, requestRepresentation.body) &&
        Objects.equals(this.headers, requestRepresentation.headers) &&
        Objects.equals(this.method, requestRepresentation.method) &&
        Objects.equals(this.operation, requestRepresentation.operation) &&
        Objects.equals(this.requestParams, requestRepresentation.requestParams) &&
        Objects.equals(this.url, requestRepresentation.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers, method, operation, requestParams, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRepresentation {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
