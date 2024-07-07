package org.cpo.c8y.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;

/**
 * Request a device to send a log file and view it in Cumulocity IoT&#39;s log
 * viewer.
 */

@JsonTypeName("c8y_LogfileRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yLogfileRequest {

  private String logFile;

  private OffsetDateTime dateFrom;

  private OffsetDateTime dateTo;

  private String searchText;

  private Integer maximumLines;

  private URI file;

  public C8yLogfileRequest logFile(String logFile) {
    this.logFile = logFile;
    return this;
  }

  /**
   * Indicates the log file to select.
   * 
   * @return logFile
   */

  @JsonProperty("logFile")
  public String getLogFile() {
    return logFile;
  }

  public void setLogFile(String logFile) {
    this.logFile = logFile;
  }

  public C8yLogfileRequest dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Start date and time of log entries in the log file to be sent.
   * 
   * @return dateFrom
   */

  @JsonProperty("dateFrom")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public C8yLogfileRequest dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * End date and time of log entries in the log file to be sent.
   * 
   * @return dateTo
   */

  @JsonProperty("dateTo")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  public C8yLogfileRequest searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

  /**
   * Provide a text that needs to be present in the log entry.
   * 
   * @return searchText
   */

  @JsonProperty("searchText")
  public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public C8yLogfileRequest maximumLines(Integer maximumLines) {
    this.maximumLines = maximumLines;
    return this;
  }

  /**
   * Upper limit of the number of lines that should be sent to Cumulocity IoT
   * after filtering.
   * 
   * @return maximumLines
   */

  @JsonProperty("maximumLines")
  public Integer getMaximumLines() {
    return maximumLines;
  }

  public void setMaximumLines(Integer maximumLines) {
    this.maximumLines = maximumLines;
  }

  public C8yLogfileRequest file(URI file) {
    this.file = file;
    return this;
  }

  /**
   * A link to the log file request.
   * 
   * @return file
   */

  @JsonProperty("file")
  public URI getFile() {
    return file;
  }

  public void setFile(URI file) {
    this.file = file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yLogfileRequest c8yLogfileRequest = (C8yLogfileRequest) o;
    return Objects.equals(this.logFile, c8yLogfileRequest.logFile) &&
        Objects.equals(this.dateFrom, c8yLogfileRequest.dateFrom) &&
        Objects.equals(this.dateTo, c8yLogfileRequest.dateTo) &&
        Objects.equals(this.searchText, c8yLogfileRequest.searchText) &&
        Objects.equals(this.maximumLines, c8yLogfileRequest.maximumLines) &&
        Objects.equals(this.file, c8yLogfileRequest.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logFile, dateFrom, dateTo, searchText, maximumLines, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yLogfileRequest {\n");
    sb.append("    logFile: ").append(toIndentedString(logFile)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    maximumLines: ").append(toIndentedString(maximumLines)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
