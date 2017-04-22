package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.NotificationRequest;

/**
 * File import request to copy a file from an accessible URL.
 */
@ApiModel(description = "File import request to copy a file from an accessible URL.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class FileImportRequest {
  @SerializedName("fileType")
  private String fileType = null;

  @SerializedName("notifications")
  private List<NotificationRequest> notifications = new ArrayList<NotificationRequest>();

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("append")
  private Boolean append = false;

  @SerializedName("urlToImport")
  private String urlToImport = null;

  public FileImportRequest fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file format this file is in. Defaults to raw. This will be used in file transform operations.
   * @return fileType
  **/
  @ApiModelProperty(value = "The file format this file is in. Defaults to raw. This will be used in file transform operations.")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public FileImportRequest notifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
    return this;
  }

  public FileImportRequest addNotificationsItem(NotificationRequest notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Notifications to set with the successful acceptance of this upload request
   * @return notifications
  **/
  @ApiModelProperty(value = "Notifications to set with the successful acceptance of this upload request")
  public List<NotificationRequest> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationRequest> notifications) {
    this.notifications = notifications;
  }

  public FileImportRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name to give the upload file. If unset, takes the original file name.
   * @return fileName
  **/
  @ApiModelProperty(value = "The name to give the upload file. If unset, takes the original file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileImportRequest append(Boolean append) {
    this.append = append;
    return this;
  }

   /**
   * Boolean flag indicating this file should be appended to the target file
   * @return append
  **/
  @ApiModelProperty(value = "Boolean flag indicating this file should be appended to the target file")
  public Boolean getAppend() {
    return append;
  }

  public void setAppend(Boolean append) {
    this.append = append;
  }

  public FileImportRequest urlToImport(String urlToImport) {
    this.urlToImport = urlToImport;
    return this;
  }

   /**
   * The URL to import the file from. This parameter is used if not file is uploaded with this post.
   * @return urlToImport
  **/
  @ApiModelProperty(value = "The URL to import the file from. This parameter is used if not file is uploaded with this post.")
  public String getUrlToImport() {
    return urlToImport;
  }

  public void setUrlToImport(String urlToImport) {
    this.urlToImport = urlToImport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileImportRequest fileImportRequest = (FileImportRequest) o;
    return Objects.equals(this.fileType, fileImportRequest.fileType) &&
        Objects.equals(this.notifications, fileImportRequest.notifications) &&
        Objects.equals(this.fileName, fileImportRequest.fileName) &&
        Objects.equals(this.append, fileImportRequest.append) &&
        Objects.equals(this.urlToImport, fileImportRequest.urlToImport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, notifications, fileName, append, urlToImport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImportRequest {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    append: ").append(toIndentedString(append)).append("\n");
    sb.append("    urlToImport: ").append(toIndentedString(urlToImport)).append("\n");
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

