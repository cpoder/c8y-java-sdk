package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * BulkNewDeviceRequest
 */

@JsonTypeName("bulkNewDeviceRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class BulkNewDeviceRequest {

  private Integer numberOfAll;

  private Integer numberOfCreated;

  private Integer numberOfFailed;

  private Integer numberOfSuccessful;

  private List<BulkNewDeviceRequestCredentialUpdatedListInner> credentialUpdatedList = new ArrayList<>();

  private List<BulkNewDeviceRequestFailedCreationListInner> failedCreationList = new ArrayList<>();

  public BulkNewDeviceRequest numberOfAll(Integer numberOfAll) {
    this.numberOfAll = numberOfAll;
    return this;
  }

  /**
   * Number of lines processed from the CSV file, without the first line (column
   * headers).
   * 
   * @return numberOfAll
   */

  @JsonProperty("numberOfAll")
  public Integer getNumberOfAll() {
    return numberOfAll;
  }

  public void setNumberOfAll(Integer numberOfAll) {
    this.numberOfAll = numberOfAll;
  }

  public BulkNewDeviceRequest numberOfCreated(Integer numberOfCreated) {
    this.numberOfCreated = numberOfCreated;
    return this;
  }

  /**
   * Number of created device credentials.
   * 
   * @return numberOfCreated
   */

  @JsonProperty("numberOfCreated")
  public Integer getNumberOfCreated() {
    return numberOfCreated;
  }

  public void setNumberOfCreated(Integer numberOfCreated) {
    this.numberOfCreated = numberOfCreated;
  }

  public BulkNewDeviceRequest numberOfFailed(Integer numberOfFailed) {
    this.numberOfFailed = numberOfFailed;
    return this;
  }

  /**
   * Number of failed creations of device credentials.
   * 
   * @return numberOfFailed
   */

  @JsonProperty("numberOfFailed")
  public Integer getNumberOfFailed() {
    return numberOfFailed;
  }

  public void setNumberOfFailed(Integer numberOfFailed) {
    this.numberOfFailed = numberOfFailed;
  }

  public BulkNewDeviceRequest numberOfSuccessful(Integer numberOfSuccessful) {
    this.numberOfSuccessful = numberOfSuccessful;
    return this;
  }

  /**
   * Number of successful creations of device credentials. This counts both create
   * and update operations.
   * 
   * @return numberOfSuccessful
   */

  @JsonProperty("numberOfSuccessful")
  public Integer getNumberOfSuccessful() {
    return numberOfSuccessful;
  }

  public void setNumberOfSuccessful(Integer numberOfSuccessful) {
    this.numberOfSuccessful = numberOfSuccessful;
  }

  public BulkNewDeviceRequest credentialUpdatedList(
      List<BulkNewDeviceRequestCredentialUpdatedListInner> credentialUpdatedList) {
    this.credentialUpdatedList = credentialUpdatedList;
    return this;
  }

  public BulkNewDeviceRequest addCredentialUpdatedListItem(
      BulkNewDeviceRequestCredentialUpdatedListInner credentialUpdatedListItem) {
    if (this.credentialUpdatedList == null) {
      this.credentialUpdatedList = new ArrayList<>();
    }
    this.credentialUpdatedList.add(credentialUpdatedListItem);
    return this;
  }

  /**
   * An array with the updated device credentials.
   * 
   * @return credentialUpdatedList
   */

  @JsonProperty("credentialUpdatedList")
  public List<BulkNewDeviceRequestCredentialUpdatedListInner> getCredentialUpdatedList() {
    return credentialUpdatedList;
  }

  public void setCredentialUpdatedList(List<BulkNewDeviceRequestCredentialUpdatedListInner> credentialUpdatedList) {
    this.credentialUpdatedList = credentialUpdatedList;
  }

  public BulkNewDeviceRequest failedCreationList(List<BulkNewDeviceRequestFailedCreationListInner> failedCreationList) {
    this.failedCreationList = failedCreationList;
    return this;
  }

  public BulkNewDeviceRequest addFailedCreationListItem(
      BulkNewDeviceRequestFailedCreationListInner failedCreationListItem) {
    if (this.failedCreationList == null) {
      this.failedCreationList = new ArrayList<>();
    }
    this.failedCreationList.add(failedCreationListItem);
    return this;
  }

  /**
   * An array with details of the failed device credentials.
   * 
   * @return failedCreationList
   */

  @JsonProperty("failedCreationList")
  public List<BulkNewDeviceRequestFailedCreationListInner> getFailedCreationList() {
    return failedCreationList;
  }

  public void setFailedCreationList(List<BulkNewDeviceRequestFailedCreationListInner> failedCreationList) {
    this.failedCreationList = failedCreationList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkNewDeviceRequest bulkNewDeviceRequest = (BulkNewDeviceRequest) o;
    return Objects.equals(this.numberOfAll, bulkNewDeviceRequest.numberOfAll) &&
        Objects.equals(this.numberOfCreated, bulkNewDeviceRequest.numberOfCreated) &&
        Objects.equals(this.numberOfFailed, bulkNewDeviceRequest.numberOfFailed) &&
        Objects.equals(this.numberOfSuccessful, bulkNewDeviceRequest.numberOfSuccessful) &&
        Objects.equals(this.credentialUpdatedList, bulkNewDeviceRequest.credentialUpdatedList) &&
        Objects.equals(this.failedCreationList, bulkNewDeviceRequest.failedCreationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfAll, numberOfCreated, numberOfFailed, numberOfSuccessful, credentialUpdatedList,
        failedCreationList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkNewDeviceRequest {\n");
    sb.append("    numberOfAll: ").append(toIndentedString(numberOfAll)).append("\n");
    sb.append("    numberOfCreated: ").append(toIndentedString(numberOfCreated)).append("\n");
    sb.append("    numberOfFailed: ").append(toIndentedString(numberOfFailed)).append("\n");
    sb.append("    numberOfSuccessful: ").append(toIndentedString(numberOfSuccessful)).append("\n");
    sb.append("    credentialUpdatedList: ").append(toIndentedString(credentialUpdatedList)).append("\n");
    sb.append("    failedCreationList: ").append(toIndentedString(failedCreationList)).append("\n");
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
