package org.cpo.c8y.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * RangeStatisticsFile
 */

@JsonTypeName("rangeStatisticsFile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class RangeStatisticsFile {

  private OffsetDateTime dateFrom;

  private OffsetDateTime dateTo;

  public RangeStatisticsFile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RangeStatisticsFile(OffsetDateTime dateFrom, OffsetDateTime dateTo) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
  }

  public RangeStatisticsFile dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Statistics generation start date.
   * 
   * @return dateFrom
   */
  @NotNull

  @JsonProperty("dateFrom")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public RangeStatisticsFile dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Statistics generation end date.
   * 
   * @return dateTo
   */
  @NotNull

  @JsonProperty("dateTo")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeStatisticsFile rangeStatisticsFile = (RangeStatisticsFile) o;
    return Objects.equals(this.dateFrom, rangeStatisticsFile.dateFrom) &&
        Objects.equals(this.dateTo, rangeStatisticsFile.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeStatisticsFile {\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
