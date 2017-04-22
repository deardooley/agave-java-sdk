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
public class UUIDResolution {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("representation")
  private Object representation = null;

  public UUIDResolution uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * uuid created/requested
   * @return uuid
  **/
  @ApiModelProperty(value = "uuid created/requested")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public UUIDResolution type(String type) {
    this.type = type;
    return this;
  }

   /**
   * the resource type represented by this uuid
   * @return type
  **/
  @ApiModelProperty(value = "the resource type represented by this uuid")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UUIDResolution representation(Object representation) {
    this.representation = representation;
    return this;
  }

   /**
   * the full object representation for this uuid
   * @return representation
  **/
  @ApiModelProperty(value = "the full object representation for this uuid")
  public Object getRepresentation() {
    return representation;
  }

  public void setRepresentation(Object representation) {
    this.representation = representation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UUIDResolution uuIDResolution = (UUIDResolution) o;
    return Objects.equals(this.uuid, uuIDResolution.uuid) &&
        Objects.equals(this.type, uuIDResolution.type) &&
        Objects.equals(this.representation, uuIDResolution.representation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, representation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UUIDResolution {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    representation: ").append(toIndentedString(representation)).append("\n");
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

