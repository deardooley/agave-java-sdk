package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.PermissionType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A permission request for a given user on the given resource
 */
@ApiModel(description = "A permission request for a given user on the given resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class PermissionRequest {
  @SerializedName("username")
  private String username = null;

  @SerializedName("permission")
  private PermissionType permission = null;

  public PermissionRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The name of the user for this permission object.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The name of the user for this permission object.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public PermissionRequest permission(PermissionType permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "")
  public PermissionType getPermission() {
    return permission;
  }

  public void setPermission(PermissionType permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRequest permissionRequest = (PermissionRequest) o;
    return Objects.equals(this.username, permissionRequest.username) &&
        Objects.equals(this.permission, permissionRequest.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

