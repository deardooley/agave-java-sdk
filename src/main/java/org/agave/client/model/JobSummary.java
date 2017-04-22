package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * JobSummary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobSummary {
  @SerializedName("appId")
  private String appId = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("executionSystem")
  private String executionSystem = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("status")
  private String status = null;

  public JobSummary appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public JobSummary endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The date the job ended in ISO 8601 format.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "The date the job ended in ISO 8601 format.")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public JobSummary executionSystem(String executionSystem) {
    this.executionSystem = executionSystem;
    return this;
  }

   /**
   * The system id of the execution system.
   * @return executionSystem
  **/
  @ApiModelProperty(required = true, value = "The system id of the execution system.")
  public String getExecutionSystem() {
    return executionSystem;
  }

  public void setExecutionSystem(String executionSystem) {
    this.executionSystem = executionSystem;
  }

  public JobSummary id(Long id) {
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

  public JobSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the job.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the job.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobSummary owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The job owner.
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "The job owner.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public JobSummary startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The date the job started in ISO 8601 format.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "The date the job started in ISO 8601 format.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public JobSummary status(String status) {
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
    JobSummary jobSummary = (JobSummary) o;
    return Objects.equals(this.appId, jobSummary.appId) &&
        Objects.equals(this.endTime, jobSummary.endTime) &&
        Objects.equals(this.executionSystem, jobSummary.executionSystem) &&
        Objects.equals(this.id, jobSummary.id) &&
        Objects.equals(this.name, jobSummary.name) &&
        Objects.equals(this.owner, jobSummary.owner) &&
        Objects.equals(this.startTime, jobSummary.startTime) &&
        Objects.equals(this.status, jobSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, endTime, executionSystem, id, name, owner, startTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSummary {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    executionSystem: ").append(toIndentedString(executionSystem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

