package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.TransferTaskProgressSummary;
import org.joda.time.DateTime;

/**
 * A generic history event representing a change on a resource or one of its associations.
 */
@ApiModel(description = "A generic history event representing a change on a resource or one of its associations.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class HistoryEvent {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("progress")
  private TransferTaskProgressSummary progress = null;

  public HistoryEvent created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date of the event.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The date of the event.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public HistoryEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of the event details.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A brief description of the event details.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryEvent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the file/folder after this event.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the file/folder after this event.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HistoryEvent progress(TransferTaskProgressSummary progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public TransferTaskProgressSummary getProgress() {
    return progress;
  }

  public void setProgress(TransferTaskProgressSummary progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryEvent historyEvent = (HistoryEvent) o;
    return Objects.equals(this.created, historyEvent.created) &&
        Objects.equals(this.description, historyEvent.description) &&
        Objects.equals(this.status, historyEvent.status) &&
        Objects.equals(this.progress, historyEvent.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, status, progress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryEvent {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

