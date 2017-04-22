package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request object to create a new UUID
 */
@ApiModel(description = "Request object to create a new UUID")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class UUIDRequest {
  @SerializedName("type")
  private String type = null;

  public UUIDRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The resource type for which the UUID should be created.
   * @return type
  **/
  @ApiModelProperty(value = "The resource type for which the UUID should be created.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UUIDRequest uuIDRequest = (UUIDRequest) o;
    return Objects.equals(this.type, uuIDRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UUIDRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

