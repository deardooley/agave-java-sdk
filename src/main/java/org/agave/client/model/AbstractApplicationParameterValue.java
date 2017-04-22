package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AbstractApplicationParameterValue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class AbstractApplicationParameterValue {
  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("enumValues")
  private String enumValues = null;

  @SerializedName("enquote")
  private Boolean enquote = false;

  @SerializedName("order")
  private Long order = 0l;

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("type")
  private String type = "string";

  @SerializedName("validator")
  private String validator = null;

  @SerializedName("visible")
  private Boolean visible = true;

  public AbstractApplicationParameterValue defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value for this parameter. The type will be determined by the value.type field.
   * @return defaultValue
  **/
  @ApiModelProperty(value = "The default value for this parameter. The type will be determined by the value.type field.")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public AbstractApplicationParameterValue enumValues(String enumValues) {
    this.enumValues = enumValues;
    return this;
  }

   /**
   * An array of enumerated object values.
   * @return enumValues
  **/
  @ApiModelProperty(value = "An array of enumerated object values.")
  public String getEnumValues() {
    return enumValues;
  }

  public void setEnumValues(String enumValues) {
    this.enumValues = enumValues;
  }

  public AbstractApplicationParameterValue enquote(Boolean enquote) {
    this.enquote = enquote;
    return this;
  }

   /**
   * Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime
   * @return enquote
  **/
  @ApiModelProperty(required = true, value = "Whether the argument value should be surrounded by quotation marks before injection into the wrapper template at runtime")
  public Boolean getEnquote() {
    return enquote;
  }

  public void setEnquote(Boolean enquote) {
    this.enquote = enquote;
  }

  public AbstractApplicationParameterValue order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.
   * @return order
  **/
  @ApiModelProperty(required = true, value = "The order in which this parameter should be printed when generating an execution command for forked execution. This will also be the order in which paramters are returned in the response json.")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public AbstractApplicationParameterValue required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Is this parameter required? If visible is false, this must be true.
   * @return required
  **/
  @ApiModelProperty(required = true, value = "Is this parameter required? If visible is false, this must be true.")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AbstractApplicationParameterValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this parameter value. (Acceptable values are: \"string\", \"number\", \"enumeration\", \"bool\", \"flag\")
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of this parameter value. (Acceptable values are: \"string\", \"number\", \"enumeration\", \"bool\", \"flag\")")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AbstractApplicationParameterValue validator(String validator) {
    this.validator = validator;
    return this;
  }

   /**
   * The regular expression used to validate this parameter value. For enumerations, separate values with |
   * @return validator
  **/
  @ApiModelProperty(value = "The regular expression used to validate this parameter value. For enumerations, separate values with |")
  public String getValidator() {
    return validator;
  }

  public void setValidator(String validator) {
    this.validator = validator;
  }

  public AbstractApplicationParameterValue visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Should this parameter be visible? If not, there must be a default and it will be required.
   * @return visible
  **/
  @ApiModelProperty(required = true, value = "Should this parameter be visible? If not, there must be a default and it will be required.")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractApplicationParameterValue abstractApplicationParameterValue = (AbstractApplicationParameterValue) o;
    return Objects.equals(this.defaultValue, abstractApplicationParameterValue.defaultValue) &&
        Objects.equals(this.enumValues, abstractApplicationParameterValue.enumValues) &&
        Objects.equals(this.enquote, abstractApplicationParameterValue.enquote) &&
        Objects.equals(this.order, abstractApplicationParameterValue.order) &&
        Objects.equals(this.required, abstractApplicationParameterValue.required) &&
        Objects.equals(this.type, abstractApplicationParameterValue.type) &&
        Objects.equals(this.validator, abstractApplicationParameterValue.validator) &&
        Objects.equals(this.visible, abstractApplicationParameterValue.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, enumValues, enquote, order, required, type, validator, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractApplicationParameterValue {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    enumValues: ").append(toIndentedString(enumValues)).append("\n");
    sb.append("    enquote: ").append(toIndentedString(enquote)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

