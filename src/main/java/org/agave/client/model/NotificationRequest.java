package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class NotificationRequest {
  @SerializedName("associatedUuid")
  private String associatedUuid = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("persistent")
  private Boolean persistent = null;

  public NotificationRequest associatedUuid(String associatedUuid) {
    this.associatedUuid = associatedUuid;
    return this;
  }

   /**
   * UUID of resource to whome the event applies.
   * @return associatedUuid
  **/
  @ApiModelProperty(required = true, value = "UUID of resource to whome the event applies.")
  public String getAssociatedUuid() {
    return associatedUuid;
  }

  public void setAssociatedUuid(String associatedUuid) {
    this.associatedUuid = associatedUuid;
  }

  public NotificationRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url or email address that will be notified of the event.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url or email address that will be notified of the event.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public NotificationRequest persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }

   /**
   * Whether this notification should stay active after it fires the first time.
   * @return persistent
  **/
  @ApiModelProperty(required = true, value = "Whether this notification should stay active after it fires the first time.")
  public Boolean getPersistent() {
    return persistent;
  }

  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequest notificationRequest = (NotificationRequest) o;
    return Objects.equals(this.associatedUuid, notificationRequest.associatedUuid) &&
        Objects.equals(this.url, notificationRequest.url) &&
        Objects.equals(this.persistent, notificationRequest.persistent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedUuid, url, persistent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequest {\n");
    
    sb.append("    associatedUuid: ").append(toIndentedString(associatedUuid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
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

