package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.Notification;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class NotificationResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private Notification result = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("version")
  private String version = null;

  public NotificationResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * success or failure
   * @return message
  **/
  @ApiModelProperty(required = true, value = "success or failure")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationResponse result(Notification result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public Notification getResult() {
    return result;
  }

  public void setResult(Notification result) {
    this.result = result;
  }

  public NotificationResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * success or failure
   * @return status
  **/
  @ApiModelProperty(required = true, value = "success or failure")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NotificationResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * API version number
   * @return version
  **/
  @ApiModelProperty(required = true, value = "API version number")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationResponse notificationResponse = (NotificationResponse) o;
    return Objects.equals(this.message, notificationResponse.message) &&
        Objects.equals(this.result, notificationResponse.result) &&
        Objects.equals(this.status, notificationResponse.status) &&
        Objects.equals(this.version, notificationResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

