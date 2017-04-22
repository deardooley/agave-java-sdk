package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes the validation, default value, and primary types associated with this ApplicationArgument
 */
@ApiModel(description = "Describes the validation, default value, and primary types associated with this ApplicationArgument")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationArgumentValue {
  @SerializedName("defaultValue")
  private List<String> defaultValue = new ArrayList<String>();

  @SerializedName("enquote")
  private Boolean enquote = false;

  @SerializedName("order")
  private Long order = 0l;

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("validator")
  private String validator = null;

  @SerializedName("visible")
  private Boolean visible = true;

  public ApplicationArgumentValue defaultValue(List<String> defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public ApplicationArgumentValue addDefaultValueItem(String defaultValueItem) {
    this.defaultValue.add(defaultValueItem);
    return this;
  }

   /**
   * The default value for this parameter. The type will be determined by the value.type field.
   * @return defaultValue
  **/
  @ApiModelProperty(value = "The default value for this parameter. The type will be determined by the value.type field.")
  public List<String> getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(List<String> defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ApplicationArgumentValue enquote(Boolean enquote) {
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

  public ApplicationArgumentValue order(Long order) {
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

  public ApplicationArgumentValue required(Boolean required) {
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

  public ApplicationArgumentValue validator(String validator) {
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

  public ApplicationArgumentValue visible(Boolean visible) {
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
    ApplicationArgumentValue applicationArgumentValue = (ApplicationArgumentValue) o;
    return Objects.equals(this.defaultValue, applicationArgumentValue.defaultValue) &&
        Objects.equals(this.enquote, applicationArgumentValue.enquote) &&
        Objects.equals(this.order, applicationArgumentValue.order) &&
        Objects.equals(this.required, applicationArgumentValue.required) &&
        Objects.equals(this.validator, applicationArgumentValue.validator) &&
        Objects.equals(this.visible, applicationArgumentValue.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, enquote, order, required, validator, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationArgumentValue {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    enquote: ").append(toIndentedString(enquote)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

