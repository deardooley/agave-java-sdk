package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.SystemStatusType;
import org.agave.client.model.SystemStorageConfig;
import org.agave.client.model.SystemType;
import org.joda.time.DateTime;

/**
 * System
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class System {
  @SerializedName("description")
  private String description = null;

  @SerializedName("environment")
  private String environment = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isDefault")
  private Boolean isDefault = false;

  @SerializedName("isPublic")
  private Boolean isPublic = false;

  @SerializedName("lastModified")
  private DateTime lastModified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revision")
  private Long revision = 1l;

  @SerializedName("scratchDir")
  private String scratchDir = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("status")
  private SystemStatusType status = null;

  @SerializedName("storage")
  private SystemStorageConfig storage = null;

  @SerializedName("type")
  private SystemType type = null;

  @SerializedName("uuid")
  private String uuid = null;

  public System description(String description) {
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

  public System environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Environment variables to set upon login prior to job submission.
   * @return environment
  **/
  @ApiModelProperty(value = "Environment variables to set upon login prior to job submission.")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public System id(String id) {
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

  public System isDefault(Boolean isDefault) {
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

  public System isPublic(Boolean isPublic) {
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

  public System lastModified(DateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this system was last modified in ISO 8601 format.
   * @return lastModified
  **/
  @ApiModelProperty(required = true, value = "The date this system was last modified in ISO 8601 format.")
  public DateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTime lastModified) {
    this.lastModified = lastModified;
  }

  public System name(String name) {
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

  public System revision(Long revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The number of times this app has been updated.
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "The number of times this app has been updated.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public System scratchDir(String scratchDir) {
    this.scratchDir = scratchDir;
    return this;
  }

   /**
   * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
   * @return scratchDir
  **/
  @ApiModelProperty(value = "The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.")
  public String getScratchDir() {
    return scratchDir;
  }

  public void setScratchDir(String scratchDir) {
    this.scratchDir = scratchDir;
  }

  public System site(String site) {
    this.site = site;
    return this;
  }

   /**
   * The site associated with this system.
   * @return site
  **/
  @ApiModelProperty(value = "The site associated with this system.")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public System status(SystemStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SystemStatusType getStatus() {
    return status;
  }

  public void setStatus(SystemStatusType status) {
    this.status = status;
  }

  public System storage(SystemStorageConfig storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemStorageConfig getStorage() {
    return storage;
  }

  public void setStorage(SystemStorageConfig storage) {
    this.storage = storage;
  }

  public System type(SystemType type) {
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

  public System uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The uuid of this system.
   * @return uuid
  **/
  @ApiModelProperty(value = "The uuid of this system.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    System system = (System) o;
    return Objects.equals(this.description, system.description) &&
        Objects.equals(this.environment, system.environment) &&
        Objects.equals(this.id, system.id) &&
        Objects.equals(this.isDefault, system.isDefault) &&
        Objects.equals(this.isPublic, system.isPublic) &&
        Objects.equals(this.lastModified, system.lastModified) &&
        Objects.equals(this.name, system.name) &&
        Objects.equals(this.revision, system.revision) &&
        Objects.equals(this.scratchDir, system.scratchDir) &&
        Objects.equals(this.site, system.site) &&
        Objects.equals(this.status, system.status) &&
        Objects.equals(this.storage, system.storage) &&
        Objects.equals(this.type, system.type) &&
        Objects.equals(this.uuid, system.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, environment, id, isDefault, isPublic, lastModified, name, revision, scratchDir, site, status, storage, type, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class System {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scratchDir: ").append(toIndentedString(scratchDir)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

