package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransformEncoder
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TransformEncoder {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public TransformEncoder description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of what this encoder is and what it does.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of what this encoder is and what it does.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransformEncoder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The encoder name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The encoder name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformEncoder transformEncoder = (TransformEncoder) o;
    return Objects.equals(this.description, transformEncoder.description) &&
        Objects.equals(this.name, transformEncoder.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformEncoder {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

