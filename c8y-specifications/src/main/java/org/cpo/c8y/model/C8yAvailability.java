package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * The availability information computed by Cumulocity IoT is stored in
 * fragments &#x60;c8y_Availability&#x60; and &#x60;c8y_Connection&#x60; of the
 * device.
 */

@JsonTypeName("c8y_Availability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yAvailability {

  private C8yAvailabilityStatus status;

  private OffsetDateTime lastMessage;

  public C8yAvailability status(C8yAvailabilityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */

  @JsonProperty("status")
  public C8yAvailabilityStatus getStatus() {
    return status;
  }

  public void setStatus(C8yAvailabilityStatus status) {
    this.status = status;
  }

  public C8yAvailability lastMessage(OffsetDateTime lastMessage) {
    this.lastMessage = lastMessage;
    return this;
  }

  /**
   * The time when the device sent the last message to Cumulocity IoT.
   * 
   * @return lastMessage
   */

  @JsonProperty("lastMessage")
  public OffsetDateTime getLastMessage() {
    return lastMessage;
  }

  public void setLastMessage(OffsetDateTime lastMessage) {
    this.lastMessage = lastMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yAvailability c8yAvailability = (C8yAvailability) o;
    return Objects.equals(this.status, c8yAvailability.status) &&
        Objects.equals(this.lastMessage, c8yAvailability.lastMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lastMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yAvailability {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastMessage: ").append(toIndentedString(lastMessage)).append("\n");
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
