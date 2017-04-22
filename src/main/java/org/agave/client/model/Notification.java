package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Notification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Notification {
  @SerializedName("event")
  private String event = null;

  @SerializedName("persistent")
  private Boolean persistent = null;

  @SerializedName("url")
  private Long url = null;

  public Notification event(String event) {
    this.event = event;
    return this;
  }

   /**
   * The event you wish to recieve a notification about. Specify * for all events.
   * @return event
  **/
  @ApiModelProperty(required = true, value = "The event you wish to recieve a notification about. Specify * for all events.")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Notification persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }

   /**
   * Whether this event should remain active after it triggers the first time.
   * @return persistent
  **/
  @ApiModelProperty(required = true, value = "Whether this event should remain active after it triggers the first time.")
  public Boolean getPersistent() {
    return persistent;
  }

  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  public Notification url(Long url) {
    this.url = url;
    return this;
  }

   /**
   * The URI to notify when the import is complete. This can be an email address or URL. If a URL is given, a POST will be made to this address. URL templating is supported. Valid template values are: ${JOB_STATUS}, ${JOB_URL}, ${JOB_ID}, ${JOB_SYSTEM}, ${JOB_NAME}, ${JOB_START_TIME}, ${JOB_END_TIME}, ${JOB_SUBMIT_TIME}, ${JOB_ARCHIVE_PATH}, ${JOB_ARCHIVE_URL}, ${JOB_ERROR}
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URI to notify when the import is complete. This can be an email address or URL. If a URL is given, a POST will be made to this address. URL templating is supported. Valid template values are: ${JOB_STATUS}, ${JOB_URL}, ${JOB_ID}, ${JOB_SYSTEM}, ${JOB_NAME}, ${JOB_START_TIME}, ${JOB_END_TIME}, ${JOB_SUBMIT_TIME}, ${JOB_ARCHIVE_PATH}, ${JOB_ARCHIVE_URL}, ${JOB_ERROR}")
  public Long getUrl() {
    return url;
  }

  public void setUrl(Long url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.event, notification.event) &&
        Objects.equals(this.persistent, notification.persistent) &&
        Objects.equals(this.url, notification.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, persistent, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

