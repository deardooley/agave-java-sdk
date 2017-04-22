package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Resource to which a tag has been associated
 */
@ApiModel(description = "Resource to which a tag has been associated")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TagResource {
  @SerializedName("id")
  private String id = null;

  public TagResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * uuid of the API resource
   * @return id
  **/
  @ApiModelProperty(value = "uuid of the API resource")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResource tagResource = (TagResource) o;
    return Objects.equals(this.id, tagResource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

