package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Enumerated single attribute object representing an enumeration value for an ApplicationParamaeterEnumValue. While a single pimary type may be specified, an ApplicationParameterEnumValueItem is the recommended structure as it allows for better display for consumers rendering enumerated values as HTML select elemetns.
 */
@ApiModel(description = "Enumerated single attribute object representing an enumeration value for an ApplicationParamaeterEnumValue. While a single pimary type may be specified, an ApplicationParameterEnumValueItem is the recommended structure as it allows for better display for consumers rendering enumerated values as HTML select elemetns.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationParameterEnumValueItem {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public ApplicationParameterEnumValueItem key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The enumerated value.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The enumerated value.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationParameterEnumValueItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the enumeration to display in a dropdown list
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the enumeration to display in a dropdown list")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationParameterEnumValueItem applicationParameterEnumValueItem = (ApplicationParameterEnumValueItem) o;
    return Objects.equals(this.key, applicationParameterEnumValueItem.key) &&
        Objects.equals(this.value, applicationParameterEnumValueItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationParameterEnumValueItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

