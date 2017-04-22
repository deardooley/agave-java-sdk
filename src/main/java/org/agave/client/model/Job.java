package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.JobInputs;
import org.agave.client.model.JobParameters;
import org.agave.client.model.Notification;
import org.joda.time.DateTime;

/**
 * Job
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Job {
  @SerializedName("appId")
  private String appId = null;

  @SerializedName("archive")
  private Boolean archive = null;

  @SerializedName("archivePath")
  private String archivePath = null;

  @SerializedName("archiveSystem")
  private String archiveSystem = null;

  @SerializedName("batchQueue")
  private String batchQueue = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("executionSystem")
  private String executionSystem = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("inputs")
  private JobInputs inputs = null;

  @SerializedName("localId")
  private String localId = null;

  @SerializedName("memoryPerNode")
  private String memoryPerNode = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nodeCount")
  private Long nodeCount = null;

  @SerializedName("notifications")
  private List<Notification> notifications = new ArrayList<Notification>();

  @SerializedName("outputPath")
  private String outputPath = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("parameters")
  private JobParameters parameters = null;

  @SerializedName("processorsPerNode")
  private Long processorsPerNode = null;

  @SerializedName("maxRunTime")
  private String maxRunTime = null;

  @SerializedName("retries")
  private Long retries = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submitTime")
  private DateTime submitTime = null;

  @SerializedName("workPath")
  private String workPath = null;

  public Job appId(String appId) {
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

  public Job archive(Boolean archive) {
    this.archive = archive;
    return this;
  }

   /**
   * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
   * @return archive
  **/
  @ApiModelProperty(required = true, value = "Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.")
  public Boolean getArchive() {
    return archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = archive;
  }

  public Job archivePath(String archivePath) {
    this.archivePath = archivePath;
    return this;
  }

   /**
   * The path of the archive folder for this job on default storage sytem of the user
   * @return archivePath
  **/
  @ApiModelProperty(required = true, value = "The path of the archive folder for this job on default storage sytem of the user")
  public String getArchivePath() {
    return archivePath;
  }

  public void setArchivePath(String archivePath) {
    this.archivePath = archivePath;
  }

  public Job archiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
    return this;
  }

   /**
   * The unique id of the storage system on which this job output will be staged.
   * @return archiveSystem
  **/
  @ApiModelProperty(required = true, value = "The unique id of the storage system on which this job output will be staged.")
  public String getArchiveSystem() {
    return archiveSystem;
  }

  public void setArchiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
  }

  public Job batchQueue(String batchQueue) {
    this.batchQueue = batchQueue;
    return this;
  }

   /**
   * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
   * @return batchQueue
  **/
  @ApiModelProperty(required = true, value = "The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.")
  public String getBatchQueue() {
    return batchQueue;
  }

  public void setBatchQueue(String batchQueue) {
    this.batchQueue = batchQueue;
  }

  public Job endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The date the job stopped running due to termination, completion, or error in ISO 8601 format.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "The date the job stopped running due to termination, completion, or error in ISO 8601 format.")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public Job executionSystem(String executionSystem) {
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

  public Job id(Long id) {
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

  public Job inputs(JobInputs inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(required = true, value = "")
  public JobInputs getInputs() {
    return inputs;
  }

  public void setInputs(JobInputs inputs) {
    this.inputs = inputs;
  }

  public Job localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * The process or local job id of the job on the remote execution system.
   * @return localId
  **/
  @ApiModelProperty(required = true, value = "The process or local job id of the job on the remote execution system.")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public Job memoryPerNode(String memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
    return this;
  }

   /**
   * The requested memory for this application to run given in GB.
   * @return memoryPerNode
  **/
  @ApiModelProperty(required = true, value = "The requested memory for this application to run given in GB.")
  public String getMemoryPerNode() {
    return memoryPerNode;
  }

  public void setMemoryPerNode(String memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
  }

  public Job message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message incurred when the job failed.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The error message incurred when the job failed.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Job name(String name) {
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

  public Job nodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
   * @return nodeCount
  **/
  @ApiModelProperty(required = true, value = "The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.")
  public Long getNodeCount() {
    return nodeCount;
  }

  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }

  public Job notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Job addNotificationsItem(Notification notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * An array of notifications you wish to receive.
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "An array of notifications you wish to receive.")
  public List<Notification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }

  public Job outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Relative path of the job output data.
   * @return outputPath
  **/
  @ApiModelProperty(required = true, value = "Relative path of the job output data.")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public Job owner(String owner) {
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

  public Job parameters(JobParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "")
  public JobParameters getParameters() {
    return parameters;
  }

  public void setParameters(JobParameters parameters) {
    this.parameters = parameters;
  }

  public Job processorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
    return this;
  }

   /**
   * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
   * @return processorsPerNode
  **/
  @ApiModelProperty(required = true, value = "The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.")
  public Long getProcessorsPerNode() {
    return processorsPerNode;
  }

  public void setProcessorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
  }

  public Job maxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
    return this;
  }

   /**
   * The requested compute time needed for this application to complete given in HH:mm:ss format.
   * @return maxRunTime
  **/
  @ApiModelProperty(required = true, value = "The requested compute time needed for this application to complete given in HH:mm:ss format.")
  public String getMaxRunTime() {
    return maxRunTime;
  }

  public void setMaxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
  }

  public Job retries(Long retries) {
    this.retries = retries;
    return this;
  }

   /**
   * The number of retires it took to submit this job.
   * @return retries
  **/
  @ApiModelProperty(required = true, value = "The number of retires it took to submit this job.")
  public Long getRetries() {
    return retries;
  }

  public void setRetries(Long retries) {
    this.retries = retries;
  }

  public Job startTime(DateTime startTime) {
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

  public Job status(String status) {
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

  public Job submitTime(DateTime submitTime) {
    this.submitTime = submitTime;
    return this;
  }

   /**
   * The date the job was submitted in ISO 8601 format.
   * @return submitTime
  **/
  @ApiModelProperty(required = true, value = "The date the job was submitted in ISO 8601 format.")
  public DateTime getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(DateTime submitTime) {
    this.submitTime = submitTime;
  }

  public Job workPath(String workPath) {
    this.workPath = workPath;
    return this;
  }

   /**
   * The directory on the remote execution system from which the job is running.
   * @return workPath
  **/
  @ApiModelProperty(required = true, value = "The directory on the remote execution system from which the job is running.")
  public String getWorkPath() {
    return workPath;
  }

  public void setWorkPath(String workPath) {
    this.workPath = workPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.appId, job.appId) &&
        Objects.equals(this.archive, job.archive) &&
        Objects.equals(this.archivePath, job.archivePath) &&
        Objects.equals(this.archiveSystem, job.archiveSystem) &&
        Objects.equals(this.batchQueue, job.batchQueue) &&
        Objects.equals(this.endTime, job.endTime) &&
        Objects.equals(this.executionSystem, job.executionSystem) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.inputs, job.inputs) &&
        Objects.equals(this.localId, job.localId) &&
        Objects.equals(this.memoryPerNode, job.memoryPerNode) &&
        Objects.equals(this.message, job.message) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.nodeCount, job.nodeCount) &&
        Objects.equals(this.notifications, job.notifications) &&
        Objects.equals(this.outputPath, job.outputPath) &&
        Objects.equals(this.owner, job.owner) &&
        Objects.equals(this.parameters, job.parameters) &&
        Objects.equals(this.processorsPerNode, job.processorsPerNode) &&
        Objects.equals(this.maxRunTime, job.maxRunTime) &&
        Objects.equals(this.retries, job.retries) &&
        Objects.equals(this.startTime, job.startTime) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.submitTime, job.submitTime) &&
        Objects.equals(this.workPath, job.workPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, archive, archivePath, archiveSystem, batchQueue, endTime, executionSystem, id, inputs, localId, memoryPerNode, message, name, nodeCount, notifications, outputPath, owner, parameters, processorsPerNode, maxRunTime, retries, startTime, status, submitTime, workPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archivePath: ").append(toIndentedString(archivePath)).append("\n");
    sb.append("    archiveSystem: ").append(toIndentedString(archiveSystem)).append("\n");
    sb.append("    batchQueue: ").append(toIndentedString(batchQueue)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    executionSystem: ").append(toIndentedString(executionSystem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    memoryPerNode: ").append(toIndentedString(memoryPerNode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    processorsPerNode: ").append(toIndentedString(processorsPerNode)).append("\n");
    sb.append("    maxRunTime: ").append(toIndentedString(maxRunTime)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    workPath: ").append(toIndentedString(workPath)).append("\n");
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

