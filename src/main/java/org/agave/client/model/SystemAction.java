package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemActionType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A generic action to apply to a system
 */
@ApiModel(description = "A generic action to apply to a system")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemAction {
  @SerializedName("action")
  private SystemActionType action = null;

  public SystemAction action(SystemActionType action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemActionType getAction() {
    return action;
  }

  public void setAction(SystemActionType action) {
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
    SystemAction systemAction = (SystemAction) o;
    return Objects.equals(this.action, systemAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAction {\n");
    
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

