package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Represents a predicate for verification. It acts as a condition which is
 * necessary to assign a user to the given groups, permit access to the
 * specified applications or to assign specific inventory roles to device
 * groups.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class JSONPredicateRepresentation {

  private List<JSONPredicateRepresentation> childPredicates = new ArrayList<>();

  /**
   * Operator executed on the parameter from the JWT access token claim pointed by
   * `parameterPath` and the provided parameter `value`.
   */
  public enum OperatorEnum {
    EQ("EQ"),

    NEQ("NEQ"),

    GT("GT"),

    LT("LT"),

    GTE("GTE"),

    LTE("LTE"),

    IN("IN"),

    AND("AND"),

    OR("OR");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperatorEnum operator;

  private String parameterPath;

  private String value;

  public JSONPredicateRepresentation childPredicates(List<JSONPredicateRepresentation> childPredicates) {
    this.childPredicates = childPredicates;
    return this;
  }

  public JSONPredicateRepresentation addChildPredicatesItem(JSONPredicateRepresentation childPredicatesItem) {
    if (this.childPredicates == null) {
      this.childPredicates = new ArrayList<>();
    }
    this.childPredicates.add(childPredicatesItem);
    return this;
  }

  /**
   * Nested predicates.
   * 
   * @return childPredicates
   */

  @JsonProperty("childPredicates")
  public List<JSONPredicateRepresentation> getChildPredicates() {
    return childPredicates;
  }

  public void setChildPredicates(List<JSONPredicateRepresentation> childPredicates) {
    this.childPredicates = childPredicates;
  }

  public JSONPredicateRepresentation operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Operator executed on the parameter from the JWT access token claim pointed by
   * `parameterPath` and the provided parameter `value`.
   * 
   * @return operator
   */

  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public JSONPredicateRepresentation parameterPath(String parameterPath) {
    this.parameterPath = parameterPath;
    return this;
  }

  /**
   * Path to the claim from the JWT access token from the external authorization
   * server.
   * 
   * @return parameterPath
   */

  @JsonProperty("parameterPath")
  public String getParameterPath() {
    return parameterPath;
  }

  public void setParameterPath(String parameterPath) {
    this.parameterPath = parameterPath;
  }

  public JSONPredicateRepresentation value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Given value used for parameter verification.
   * 
   * @return value
   */

  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONPredicateRepresentation jsONPredicateRepresentation = (JSONPredicateRepresentation) o;
    return Objects.equals(this.childPredicates, jsONPredicateRepresentation.childPredicates) &&
        Objects.equals(this.operator, jsONPredicateRepresentation.operator) &&
        Objects.equals(this.parameterPath, jsONPredicateRepresentation.parameterPath) &&
        Objects.equals(this.value, jsONPredicateRepresentation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childPredicates, operator, parameterPath, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONPredicateRepresentation {\n");
    sb.append("    childPredicates: ").append(toIndentedString(childPredicates)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    parameterPath: ").append(toIndentedString(parameterPath)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
