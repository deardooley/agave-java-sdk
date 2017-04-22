package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobStatusSummary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobStatusSummary {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("status")
  private String status = null;

  public JobStatusSummary id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the job.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of the job.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobStatusSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED")
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
    JobStatusSummary jobStatusSummary = (JobStatusSummary) o;
    return Objects.equals(this.id, jobStatusSummary.id) &&
        Objects.equals(this.status, jobStatusSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatusSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

