package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A minimal permission stanza defining read and write permissions
 */
@ApiModel(description = "A minimal permission stanza defining read and write permissions")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class PermissionStanza {
  @SerializedName("read")
  private Boolean read = false;

  @SerializedName("write")
  private Boolean write = false;

  public PermissionStanza read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Is the resource readable
   * @return read
  **/
  @ApiModelProperty(required = true, value = "Is the resource readable")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public PermissionStanza write(Boolean write) {
    this.write = write;
    return this;
  }

   /**
   * Is the resource writable
   * @return write
  **/
  @ApiModelProperty(required = true, value = "Is the resource writable")
  public Boolean getWrite() {
    return write;
  }

  public void setWrite(Boolean write) {
    this.write = write;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionStanza permissionStanza = (PermissionStanza) o;
    return Objects.equals(this.read, permissionStanza.read) &&
        Objects.equals(this.write, permissionStanza.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionStanza {\n");
    
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
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

