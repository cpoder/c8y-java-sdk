package org.cpo.c8y.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Contains information about the number of processed operations.
 */

@JsonTypeName("bulkOperation_progress")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BulkOperationProgress {

  private Integer pending;

  private Integer failed;

  private Integer executing;

  private Integer successful;

  private Integer all;

  public BulkOperationProgress pending(Integer pending) {
    this.pending = pending;
    return this;
  }

  /**
   * Number of pending operations.
   * 
   * @return pending
   */

  @JsonProperty("pending")
  public Integer getPending() {
    return pending;
  }

  public void setPending(Integer pending) {
    this.pending = pending;
  }

  public BulkOperationProgress failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Number of failed operations.
   * 
   * @return failed
   */

  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public BulkOperationProgress executing(Integer executing) {
    this.executing = executing;
    return this;
  }

  /**
   * Number of operations being executed.
   * 
   * @return executing
   */

  @JsonProperty("executing")
  public Integer getExecuting() {
    return executing;
  }

  public void setExecuting(Integer executing) {
    this.executing = executing;
  }

  public BulkOperationProgress successful(Integer successful) {
    this.successful = successful;
    return this;
  }

  /**
   * Number of operations successfully processed.
   * 
   * @return successful
   */

  @JsonProperty("successful")
  public Integer getSuccessful() {
    return successful;
  }

  public void setSuccessful(Integer successful) {
    this.successful = successful;
  }

  public BulkOperationProgress all(Integer all) {
    this.all = all;
    return this;
  }

  /**
   * Total number of processed operations.
   * 
   * @return all
   */

  @JsonProperty("all")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationProgress bulkOperationProgress = (BulkOperationProgress) o;
    return Objects.equals(this.pending, bulkOperationProgress.pending) &&
        Objects.equals(this.failed, bulkOperationProgress.failed) &&
        Objects.equals(this.executing, bulkOperationProgress.executing) &&
        Objects.equals(this.successful, bulkOperationProgress.successful) &&
        Objects.equals(this.all, bulkOperationProgress.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, failed, executing, successful, all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationProgress {\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    executing: ").append(toIndentedString(executing)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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
