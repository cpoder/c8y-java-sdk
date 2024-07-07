package org.cpo.c8y.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Provides detailed information about the closest mobile cell towers. When the
 * functionality is activated, the location of the device is determined based on
 * this fragment, in order to track the device whereabouts when GPS tracking is
 * not available.
 */

@JsonTypeName("c8y_CellInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T17:39:27.903333885+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
public class C8yCellInfo {

  private String radioType;

  private List<C8yCellTower> cellTowers = new ArrayList<>();

  public C8yCellInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public C8yCellInfo(List<C8yCellTower> cellTowers) {
    this.cellTowers = cellTowers;
  }

  public C8yCellInfo radioType(String radioType) {
    this.radioType = radioType;
    return this;
  }

  /**
   * The radio type of this cell tower.
   * 
   * @return radioType
   */

  @JsonProperty("radioType")
  public String getRadioType() {
    return radioType;
  }

  public void setRadioType(String radioType) {
    this.radioType = radioType;
  }

  public C8yCellInfo cellTowers(List<C8yCellTower> cellTowers) {
    this.cellTowers = cellTowers;
    return this;
  }

  public C8yCellInfo addCellTowersItem(C8yCellTower cellTowersItem) {
    if (this.cellTowers == null) {
      this.cellTowers = new ArrayList<>();
    }
    this.cellTowers.add(cellTowersItem);
    return this;
  }

  /**
   * Detailed information about the neighboring cell towers.
   * 
   * @return cellTowers
   */
  @NotNull

  @JsonProperty("cellTowers")
  public List<C8yCellTower> getCellTowers() {
    return cellTowers;
  }

  public void setCellTowers(List<C8yCellTower> cellTowers) {
    this.cellTowers = cellTowers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C8yCellInfo c8yCellInfo = (C8yCellInfo) o;
    return Objects.equals(this.radioType, c8yCellInfo.radioType) &&
        Objects.equals(this.cellTowers, c8yCellInfo.cellTowers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radioType, cellTowers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C8yCellInfo {\n");
    sb.append("    radioType: ").append(toIndentedString(radioType)).append("\n");
    sb.append("    cellTowers: ").append(toIndentedString(cellTowers)).append("\n");
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
