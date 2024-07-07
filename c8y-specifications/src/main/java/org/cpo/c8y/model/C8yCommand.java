package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * To carry out interactive sessions with a device, use the
 * &#x60;c8y_Command&#x60; fragment. If this fragment is in the list of
 * supported operations for a device, a tab &#x60;Shell&#x60; will be shown.
 * Using the &#x60;Shell&#x60; tab, the user can send commands in an arbitrary,
 * device-specific syntax to the device. The command is sent to the device in a
 * property &#x60;text&#x60;.
 */

@JsonTypeName("c8y_Command")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yCommand {

  private String text;

  private String result;

  public C8yCommand text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The command sent to the device.
   * 
   * @return text
   */

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public C8yCommand result(String result) {
    this.result = result;
    return this;
  }

  /**
   * To communicate the results of a particular command, the device adds a
   * property `result`.
   * 
   * @return result
   */

  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yCommand c8yCommand = (C8yCommand) o;
    return Objects.equals(this.text, c8yCommand.text) &&
        Objects.equals(this.result, c8yCommand.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yCommand {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
