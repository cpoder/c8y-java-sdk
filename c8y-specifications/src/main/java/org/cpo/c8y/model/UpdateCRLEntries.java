package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

/**
 * A list of serial numbers.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T18:31:26.148945241+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class UpdateCRLEntries {

  private List<CRLEntry> crls = new ArrayList<>();

  public UpdateCRLEntries crls(List<CRLEntry> crls) {
    this.crls = crls;
    return this;
  }

  public UpdateCRLEntries addCrlsItem(CRLEntry crlsItem) {
    if (this.crls == null) {
      this.crls = new ArrayList<>();
    }
    this.crls.add(crlsItem);
    return this;
  }

  /**
   * Get crls
   * 
   * @return crls
   */

  @JsonProperty("crls")
  public List<CRLEntry> getCrls() {
    return crls;
  }

  public void setCrls(List<CRLEntry> crls) {
    this.crls = crls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCRLEntries updateCRLEntries = (UpdateCRLEntries) o;
    return Objects.equals(this.crls, updateCRLEntries.crls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCRLEntries {\n");
    sb.append("    crls: ").append(toIndentedString(crls)).append("\n");
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
