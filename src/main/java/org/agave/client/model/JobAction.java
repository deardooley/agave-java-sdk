package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.JobActionType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Requests that a management action take place against a job.
 */
@ApiModel(description = "Requests that a management action take place against a job.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobAction {
  @SerializedName("action")
  private JobActionType action = null;

  public JobAction action(JobActionType action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public JobActionType getAction() {
    return action;
  }

  public void setAction(JobActionType action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAction jobAction = (JobAction) o;
    return Objects.equals(this.action, jobAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

