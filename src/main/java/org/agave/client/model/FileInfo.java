package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.FileType;
import org.joda.time.DateTime;

/**
 * Basic metadata description of a remote file or folder
 */
@ApiModel(description = "Basic metadata description of a remote file or folder")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class FileInfo {
  @SerializedName("format")
  private String format = null;

  @SerializedName("lastModified")
  private DateTime lastModified = null;

  @SerializedName("length")
  private Long length = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("permissions")
  private String permissions = null;

  @SerializedName("system")
  private String system = null;

  @SerializedName("type")
  private FileType type = null;

  public FileInfo format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The file type of the file.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "The file type of the file.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public FileInfo lastModified(DateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this file was last modified in ISO 8601 format.
   * @return lastModified
  **/
  @ApiModelProperty(required = true, value = "The date this file was last modified in ISO 8601 format.")
  public DateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTime lastModified) {
    this.lastModified = lastModified;
  }

  public FileInfo length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * The length of the file/folder.
   * @return length
  **/
  @ApiModelProperty(required = true, value = "The length of the file/folder.")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FileInfo mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime type of the file/folder. If unknown, it defaults to application/binary.
   * @return mimeType
  **/
  @ApiModelProperty(required = true, value = "The mime type of the file/folder. If unknown, it defaults to application/binary.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public FileInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the file/folder.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the file/folder.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The absolute path to the file/folder.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The absolute path to the file/folder.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FileInfo permissions(String permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The remote system permission of the invoking user on the file/folder.
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "The remote system permission of the invoking user on the file/folder.")
  public String getPermissions() {
    return permissions;
  }

  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }

  public FileInfo system(String system) {
    this.system = system;
    return this;
  }

   /**
   * The id of the system where this file lives.
   * @return system
  **/
  @ApiModelProperty(required = true, value = "The id of the system where this file lives.")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public FileInfo type(FileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public FileType getType() {
    return type;
  }

  public void setType(FileType type) {
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
    FileInfo fileInfo = (FileInfo) o;
    return Objects.equals(this.format, fileInfo.format) &&
        Objects.equals(this.lastModified, fileInfo.lastModified) &&
        Objects.equals(this.length, fileInfo.length) &&
        Objects.equals(this.mimeType, fileInfo.mimeType) &&
        Objects.equals(this.name, fileInfo.name) &&
        Objects.equals(this.path, fileInfo.path) &&
        Objects.equals(this.permissions, fileInfo.permissions) &&
        Objects.equals(this.system, fileInfo.system) &&
        Objects.equals(this.type, fileInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, lastModified, length, mimeType, name, path, permissions, system, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfo {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

