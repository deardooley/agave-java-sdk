package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.FileManagementActionType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A generic action to take on a file item
 */
@ApiModel(description = "A generic action to take on a file item")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class FileAction {
  @SerializedName("action")
  private FileManagementActionType action = null;

  @SerializedName("path")
  private String path = null;

  public FileAction action(FileManagementActionType action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public FileManagementActionType getAction() {
    return action;
  }

  public void setAction(FileManagementActionType action) {
    this.action = action;
  }

  public FileAction path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Name of new directory or target file or folder.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Name of new directory or target file or folder.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAction fileAction = (FileAction) o;
    return Objects.equals(this.action, fileAction.action) &&
        Objects.equals(this.path, fileAction.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

