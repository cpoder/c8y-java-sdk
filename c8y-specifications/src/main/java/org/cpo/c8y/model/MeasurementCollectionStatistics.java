package org.cpo.c8y.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * MeasurementCollectionStatistics
 */

@JsonTypeName("MeasurementCollection_statistics")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class MeasurementCollectionStatistics {

  private Integer currentPage;

  private Integer pageSize;

  private Integer totalElements;

  private Integer totalPages;

  public MeasurementCollectionStatistics currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * The current page of the paginated results.
   * minimum: 1
   * 
   * @return currentPage
   */

  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public MeasurementCollectionStatistics pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Indicates the number of objects that the collection may contain per page. The
   * upper limit for one page is 2,000 objects.
   * minimum: 1
   * maximum: 2000
   * 
   * @return pageSize
   */

  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public MeasurementCollectionStatistics totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * The total number of results (elements).
   * minimum: 0
   * 
   * @return totalElements
   */

  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public MeasurementCollectionStatistics totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * The total number of paginated results (pages). > **&#9432; Info:** This
   * property is returned by default except when an operation retrieves all
   * records where values are between an upper and lower boundary, for example,
   * querying ranges using `dateFrom`–`dateTo`. In such cases, the query parameter
   * `withTotalPages=true` should be used to include the total number of pages (at
   * the expense of slightly slower performance).
   * minimum: 0
   * 
   * @return totalPages
   */

  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
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
  public MeasurementCollectionStatistics putAdditionalProperty(String key, Object value) {
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
    MeasurementCollectionStatistics measurementCollectionStatistics = (MeasurementCollectionStatistics) o;
    return Objects.equals(this.currentPage, measurementCollectionStatistics.currentPage) &&
        Objects.equals(this.pageSize, measurementCollectionStatistics.pageSize) &&
        Objects.equals(this.totalElements, measurementCollectionStatistics.totalElements) &&
        Objects.equals(this.totalPages, measurementCollectionStatistics.totalPages) &&
        Objects.equals(this.additionalProperties, measurementCollectionStatistics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageSize, totalElements, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementCollectionStatistics {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");

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
