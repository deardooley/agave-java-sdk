package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ACL
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ACL {
  @SerializedName("execute")
  private Boolean execute = null;

  @SerializedName("read")
  private Boolean read = null;

  @SerializedName("write")
  private Boolean write = null;

  public ACL execute(Boolean execute) {
    this.execute = execute;
    return this;
  }

   /**
   * can execute
   * @return execute
  **/
  @ApiModelProperty(required = true, value = "can execute")
  public Boolean getExecute() {
    return execute;
  }

  public void setExecute(Boolean execute) {
    this.execute = execute;
  }

  public ACL read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * can read
   * @return read
  **/
  @ApiModelProperty(required = true, value = "can read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public ACL write(Boolean write) {
    this.write = write;
    return this;
  }

   /**
   * can write
   * @return write
  **/
  @ApiModelProperty(required = true, value = "can write")
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
    ACL ACL = (ACL) o;
    return Objects.equals(this.execute, ACL.execute) &&
        Objects.equals(this.read, ACL.read) &&
        Objects.equals(this.write, ACL.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execute, read, write);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ACL {\n");
    
    sb.append("    execute: ").append(toIndentedString(execute)).append("\n");
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

