package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * JobHistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobHistory {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private String status = null;

  public JobHistory created(DateTime created) {
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

  public JobHistory description(String description) {
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

  public JobHistory status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the job after this event.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the job after this event.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobHistory jobHistory = (JobHistory) o;
    return Objects.equals(this.created, jobHistory.created) &&
        Objects.equals(this.description, jobHistory.description) &&
        Objects.equals(this.status, jobHistory.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobHistory {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

