package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.Notification;

/**
 * This represents the request made to the Agave jobs api to run a registered application.
 */
@ApiModel(description = "This represents the request made to the Agave jobs api to run a registered application.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobSubmission {
  @SerializedName("archive")
  private Boolean archive = null;

  @SerializedName("archivePath")
  private String archivePath = null;

  @SerializedName("archiveSystem")
  private String archiveSystem = null;

  @SerializedName("inputs")
  private String inputs = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("maxMemory")
  private String maxMemory = null;

  @SerializedName("nodeCount")
  private Long nodeCount = null;

  @SerializedName("notifications")
  private List<Notification> notifications = new ArrayList<Notification>();

  @SerializedName("parameters")
  private Object parameters = null;

  @SerializedName("processorsPerNode")
  private Long processorsPerNode = null;

  @SerializedName("batchQueue")
  private String batchQueue = null;

  @SerializedName("maxRunTime")
  private String maxRunTime = null;

  @SerializedName("appId")
  private String appId = null;

  public JobSubmission archive(Boolean archive) {
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

  public JobSubmission archivePath(String archivePath) {
    this.archivePath = archivePath;
    return this;
  }

   /**
   * The path of the archive folder for this job on the archiveSystem. Defaults to default storage system of the user
   * @return archivePath
  **/
  @ApiModelProperty(required = true, value = "The path of the archive folder for this job on the archiveSystem. Defaults to default storage system of the user")
  public String getArchivePath() {
    return archivePath;
  }

  public void setArchivePath(String archivePath) {
    this.archivePath = archivePath;
  }

  public JobSubmission archiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
    return this;
  }

   /**
   * The system on which the job data will be archived
   * @return archiveSystem
  **/
  @ApiModelProperty(required = true, value = "The system on which the job data will be archived")
  public String getArchiveSystem() {
    return archiveSystem;
  }

  public void setArchiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
  }

  public JobSubmission inputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
   * @return inputs
  **/
  @ApiModelProperty(required = true, value = "The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.")
  public String getInputs() {
    return inputs;
  }

  public void setInputs(String inputs) {
    this.inputs = inputs;
  }

  public JobSubmission name(String name) {
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

  public JobSubmission maxMemory(String maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

   /**
   * The maximum amount of memory needed for this application to run given in GB.
   * @return maxMemory
  **/
  @ApiModelProperty(required = true, value = "The maximum amount of memory needed for this application to run given in GB.")
  public String getMaxMemory() {
    return maxMemory;
  }

  public void setMaxMemory(String maxMemory) {
    this.maxMemory = maxMemory;
  }

  public JobSubmission nodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * The number of nodes this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
   * @return nodeCount
  **/
  @ApiModelProperty(required = true, value = "The number of nodes this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.")
  public Long getNodeCount() {
    return nodeCount;
  }

  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }

  public JobSubmission notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public JobSubmission addNotificationsItem(Notification notificationsItem) {
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

  public JobSubmission parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public JobSubmission processorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
    return this;
  }

   /**
   * The number of processors this application should utilize while running.
   * @return processorsPerNode
  **/
  @ApiModelProperty(required = true, value = "The number of processors this application should utilize while running.")
  public Long getProcessorsPerNode() {
    return processorsPerNode;
  }

  public void setProcessorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
  }

  public JobSubmission batchQueue(String batchQueue) {
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

  public JobSubmission maxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
    return this;
  }

   /**
   * The estimated compute time needed for this application to complete given in hh:mm:ss format.
   * @return maxRunTime
  **/
  @ApiModelProperty(required = true, value = "The estimated compute time needed for this application to complete given in hh:mm:ss format.")
  public String getMaxRunTime() {
    return maxRunTime;
  }

  public void setMaxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
  }

  public JobSubmission appId(String appId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSubmission jobSubmission = (JobSubmission) o;
    return Objects.equals(this.archive, jobSubmission.archive) &&
        Objects.equals(this.archivePath, jobSubmission.archivePath) &&
        Objects.equals(this.archiveSystem, jobSubmission.archiveSystem) &&
        Objects.equals(this.inputs, jobSubmission.inputs) &&
        Objects.equals(this.name, jobSubmission.name) &&
        Objects.equals(this.maxMemory, jobSubmission.maxMemory) &&
        Objects.equals(this.nodeCount, jobSubmission.nodeCount) &&
        Objects.equals(this.notifications, jobSubmission.notifications) &&
        Objects.equals(this.parameters, jobSubmission.parameters) &&
        Objects.equals(this.processorsPerNode, jobSubmission.processorsPerNode) &&
        Objects.equals(this.batchQueue, jobSubmission.batchQueue) &&
        Objects.equals(this.maxRunTime, jobSubmission.maxRunTime) &&
        Objects.equals(this.appId, jobSubmission.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archivePath, archiveSystem, inputs, name, maxMemory, nodeCount, notifications, parameters, processorsPerNode, batchQueue, maxRunTime, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSubmission {\n");
    
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archivePath: ").append(toIndentedString(archivePath)).append("\n");
    sb.append("    archiveSystem: ").append(toIndentedString(archiveSystem)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    processorsPerNode: ").append(toIndentedString(processorsPerNode)).append("\n");
    sb.append("    batchQueue: ").append(toIndentedString(batchQueue)).append("\n");
    sb.append("    maxRunTime: ").append(toIndentedString(maxRunTime)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

