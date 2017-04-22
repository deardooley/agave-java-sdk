package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemRoleType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A basic role granted to a user for a particular system
 */
@ApiModel(description = "A basic role granted to a user for a particular system")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemRoleRequest {
  @SerializedName("username")
  private String username = null;

  @SerializedName("role")
  private SystemRoleType role = null;

  public SystemRoleRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the api user granted this role.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username of the api user granted this role.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SystemRoleRequest role(SystemRoleType role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemRoleType getRole() {
    return role;
  }

  public void setRole(SystemRoleType role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemRoleRequest systemRoleRequest = (SystemRoleRequest) o;
    return Objects.equals(this.username, systemRoleRequest.username) &&
        Objects.equals(this.role, systemRoleRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemRoleRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

