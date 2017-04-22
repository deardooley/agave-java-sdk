package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemStatusType;
import org.agave.client.model.SystemType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemSummary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemSummary {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("isPublic")
  private Boolean isPublic = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private SystemStatusType status = null;

  @SerializedName("type")
  private SystemType type = null;

  public SystemSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Verbose description of this system.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Verbose description of this system.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SystemSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this system.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for this system.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SystemSummary isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is the system the default for the authenticated user?
   * @return isDefault
  **/
  @ApiModelProperty(required = true, value = "Is the system the default for the authenticated user?")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SystemSummary isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Is the system publicly available?
   * @return isPublic
  **/
  @ApiModelProperty(required = true, value = "Is the system publicly available?")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public SystemSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Common name for this system.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Common name for this system.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemSummary status(SystemStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemStatusType getStatus() {
    return status;
  }

  public void setStatus(SystemStatusType status) {
    this.status = status;
  }

  public SystemSummary type(SystemType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemType getType() {
    return type;
  }

  public void setType(SystemType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemSummary systemSummary = (SystemSummary) o;
    return Objects.equals(this.description, systemSummary.description) &&
        Objects.equals(this.id, systemSummary.id) &&
        Objects.equals(this.isDefault, systemSummary.isDefault) &&
        Objects.equals(this.isPublic, systemSummary.isPublic) &&
        Objects.equals(this.name, systemSummary.name) &&
        Objects.equals(this.status, systemSummary.status) &&
        Objects.equals(this.type, systemSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, isPublic, name, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemSummary {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

