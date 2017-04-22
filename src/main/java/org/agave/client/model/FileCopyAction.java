package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.FileAction;
import org.agave.client.model.FileManagementActionType;

import io.swagger.annotations.ApiModel;

/**
 * Request for a file/folder to be copied on the target system. Metadata will be appended to the destination if it already exists. Otherwise, a new history will be created.
 */
@ApiModel(description = "Request for a file/folder to be copied on the target system. Metadata will be appended to the destination if it already exists. Otherwise, a new history will be created.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class FileCopyAction extends FileAction {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCopyAction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

