package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.JobAction;
import org.agave.client.model.JobActionType;

import io.swagger.annotations.ApiModel;

/**
 * Resubmits the given job as a new job with a unique id. The archive system and path are reset. All other fields remain unchanged. Notifications set for the original job will not carry over.
 */
@ApiModel(description = "Resubmits the given job as a new job with a unique id. The archive system and path are reset. All other fields remain unchanged. Notifications set for the original job will not carry over.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobResubmitAction extends JobAction {

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
    sb.append("class JobResubmitAction {\n");
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

