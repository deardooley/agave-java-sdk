package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.PermissionStanza;
import org.joda.time.DateTime;

/**
 * A generic permission applied to any resource in the API
 */
@ApiModel(description = "A generic permission applied to any resource in the API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Permission {
  @SerializedName("username")
  private String username = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("permission")
  private PermissionStanza permission = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("id")
  private String id = null;

  public Permission username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to whom this permission grant applies
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username to whom this permission grant applies")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Permission internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * The internal user associated with this permission
   * @return internalUsername
  **/
  @ApiModelProperty(value = "The internal user associated with this permission")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public Permission permission(PermissionStanza permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "")
  public PermissionStanza getPermission() {
    return permission;
  }

  public void setPermission(PermissionStanza permission) {
    this.permission = permission;
  }

  public Permission created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date the permission was created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The date the permission was created")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Permission lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The date the permission was last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "The date the permission was last updated")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Permission id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this permission
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of this permission")
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
    Permission permission = (Permission) o;
    return Objects.equals(this.username, permission.username) &&
        Objects.equals(this.internalUsername, permission.internalUsername) &&
        Objects.equals(this.permission, permission.permission) &&
        Objects.equals(this.created, permission.created) &&
        Objects.equals(this.lastUpdated, permission.lastUpdated) &&
        Objects.equals(this.id, permission.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, internalUsername, permission, created, lastUpdated, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

