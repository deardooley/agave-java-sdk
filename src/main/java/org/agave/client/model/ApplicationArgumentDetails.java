package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ApplicationArgumentDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationArgumentDetails {
  @SerializedName("description")
  private String description = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("argument")
  private String argument = null;

  @SerializedName("showArgument")
  private Boolean showArgument = false;

  @SerializedName("repeatArgument")
  private Boolean repeatArgument = false;

  public ApplicationArgumentDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of this input.
   * @return description
  **/
  @ApiModelProperty(value = "Description of this input.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationArgumentDetails label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label for this input
   * @return label
  **/
  @ApiModelProperty(value = "The label for this input")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ApplicationArgumentDetails argument(String argument) {
    this.argument = argument;
    return this;
  }

   /**
   * The command line value of this input (ex -n, --name, -name, etc)
   * @return argument
  **/
  @ApiModelProperty(value = "The command line value of this input (ex -n, --name, -name, etc)")
  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public ApplicationArgumentDetails showArgument(Boolean showArgument) {
    this.showArgument = showArgument;
    return this;
  }

   /**
   * Whether the argument value should be passed into the wrapper at run time
   * @return showArgument
  **/
  @ApiModelProperty(required = true, value = "Whether the argument value should be passed into the wrapper at run time")
  public Boolean getShowArgument() {
    return showArgument;
  }

  public void setShowArgument(Boolean showArgument) {
    this.showArgument = showArgument;
  }

  public ApplicationArgumentDetails repeatArgument(Boolean repeatArgument) {
    this.repeatArgument = repeatArgument;
    return this;
  }

   /**
   * Whether the argument value should be repeated in front of each user-supplied input before injection into the wrapper template at runtime
   * @return repeatArgument
  **/
  @ApiModelProperty(required = true, value = "Whether the argument value should be repeated in front of each user-supplied input before injection into the wrapper template at runtime")
  public Boolean getRepeatArgument() {
    return repeatArgument;
  }

  public void setRepeatArgument(Boolean repeatArgument) {
    this.repeatArgument = repeatArgument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationArgumentDetails applicationArgumentDetails = (ApplicationArgumentDetails) o;
    return Objects.equals(this.description, applicationArgumentDetails.description) &&
        Objects.equals(this.label, applicationArgumentDetails.label) &&
        Objects.equals(this.argument, applicationArgumentDetails.argument) &&
        Objects.equals(this.showArgument, applicationArgumentDetails.showArgument) &&
        Objects.equals(this.repeatArgument, applicationArgumentDetails.repeatArgument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, label, argument, showArgument, repeatArgument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationArgumentDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    showArgument: ").append(toIndentedString(showArgument)).append("\n");
    sb.append("    repeatArgument: ").append(toIndentedString(repeatArgument)).append("\n");
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

