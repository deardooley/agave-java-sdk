package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.FileAction;
import org.agave.client.model.FileManagementActionType;

import io.swagger.annotations.ApiModel;

/**
 * Request for a file/folder to be renamed on the target system. Metadata will be preserved after rename. Rename operations are only applied relative to the file/folder given in the URL. To rename a file/folder to a different path, see the FileMoveAction.
 */
@ApiModel(description = "Request for a file/folder to be renamed on the target system. Metadata will be preserved after rename. Rename operations are only applied relative to the file/folder given in the URL. To rename a file/folder to a different path, see the FileMoveAction.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class FileRenameAction extends FileAction {

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
    sb.append("class FileRenameAction {\n");
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

