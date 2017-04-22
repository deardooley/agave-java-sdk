package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ApplicationArgumentDetails;
import org.agave.client.model.ApplicationArgumentSemantics;
import org.agave.client.model.ApplicationArgumentValue;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This is the base model for all Application input, output, and parameter objects.
 */
@ApiModel(description = "This is the base model for all Application input, output, and parameter objects.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationArgument {
  @SerializedName("details")
  private ApplicationArgumentDetails details = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("semantics")
  private ApplicationArgumentSemantics semantics = null;

  @SerializedName("value")
  private ApplicationArgumentValue value = null;

  public ApplicationArgument details(ApplicationArgumentDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationArgumentDetails getDetails() {
    return details;
  }

  public void setDetails(ApplicationArgumentDetails details) {
    this.details = details;
  }

  public ApplicationArgument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this argument. This will be the replacement string in your wrapper scripts.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of this argument. This will be the replacement string in your wrapper scripts.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationArgument semantics(ApplicationArgumentSemantics semantics) {
    this.semantics = semantics;
    return this;
  }

   /**
   * Get semantics
   * @return semantics
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationArgumentSemantics getSemantics() {
    return semantics;
  }

  public void setSemantics(ApplicationArgumentSemantics semantics) {
    this.semantics = semantics;
  }

  public ApplicationArgument value(ApplicationArgumentValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationArgumentValue getValue() {
    return value;
  }

  public void setValue(ApplicationArgumentValue value) {
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
    ApplicationArgument applicationArgument = (ApplicationArgument) o;
    return Objects.equals(this.details, applicationArgument.details) &&
        Objects.equals(this.id, applicationArgument.id) &&
        Objects.equals(this.semantics, applicationArgument.semantics) &&
        Objects.equals(this.value, applicationArgument.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, id, semantics, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationArgument {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    semantics: ").append(toIndentedString(semantics)).append("\n");
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

