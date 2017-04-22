package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ApplicationActionType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Generic action to take on an app
 */
@ApiModel(description = "Generic action to take on an app")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationAction {
  @SerializedName("action")
  private ApplicationActionType action = null;

  public ApplicationAction action(ApplicationActionType action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public ApplicationActionType getAction() {
    return action;
  }

  public void setAction(ApplicationActionType action) {
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
    ApplicationAction applicationAction = (ApplicationAction) o;
    return Objects.equals(this.action, applicationAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAction {\n");
    
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

