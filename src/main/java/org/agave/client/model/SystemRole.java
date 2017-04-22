package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.SystemRoleType;
import org.joda.time.DateTime;

/**
 * A role granted a user on a system
 */
@ApiModel(description = "A role granted a user on a system")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemRole {
  @SerializedName("username")
  private String username = null;

  @SerializedName("role")
  private SystemRoleType role = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("id")
  private String id = null;

  public SystemRole username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to whom the role applies.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username to whom the role applies.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SystemRole role(SystemRoleType role) {
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

  public SystemRole created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date the role was first granted
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The date the role was first granted")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public SystemRole lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The date the role was last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "The date the role was last updated.")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public SystemRole id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this role grant
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of this role grant")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemRole systemRole = (SystemRole) o;
    return Objects.equals(this.username, systemRole.username) &&
        Objects.equals(this.role, systemRole.role) &&
        Objects.equals(this.created, systemRole.created) &&
        Objects.equals(this.lastUpdated, systemRole.lastUpdated) &&
        Objects.equals(this.id, systemRole.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, role, created, lastUpdated, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemRole {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

