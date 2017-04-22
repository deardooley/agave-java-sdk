package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.Notification;

/**
 * A request to run a registered app.
 */
@ApiModel(description = "A request to run a registered app.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobRequest {
  @SerializedName("appId")
  private String appId = null;

  @SerializedName("archive")
  private Boolean archive = true;

  @SerializedName("archivePath")
  private String archivePath = null;

  @SerializedName("archiveSystem")
  private String archiveSystem = null;

  @SerializedName("batchQueue")
  private String batchQueue = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("memoryPerNode")
  private Long memoryPerNode = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nodeCount")
  private Long nodeCount = null;

  @SerializedName("notifications")
  private List<Notification> notifications = new ArrayList<Notification>();

  @SerializedName("parameters")
  private Object parameters = null;

  @SerializedName("processorsPerNode")
  private Long processorsPerNode = null;

  @SerializedName("maxRunTime")
  private String maxRunTime = null;

  public JobRequest appId(String appId) {
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

  public JobRequest archive(Boolean archive) {
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

  public JobRequest archivePath(String archivePath) {
    this.archivePath = archivePath;
    return this;
  }

   /**
   * The path of the archive folder for this job on default storage sytem of the user
   * @return archivePath
  **/
  @ApiModelProperty(value = "The path of the archive folder for this job on default storage sytem of the user")
  public String getArchivePath() {
    return archivePath;
  }

  public void setArchivePath(String archivePath) {
    this.archivePath = archivePath;
  }

  public JobRequest archiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
    return this;
  }

   /**
   * The unique id of the storage system on which this job output will be staged.
   * @return archiveSystem
  **/
  @ApiModelProperty(value = "The unique id of the storage system on which this job output will be staged.")
  public String getArchiveSystem() {
    return archiveSystem;
  }

  public void setArchiveSystem(String archiveSystem) {
    this.archiveSystem = archiveSystem;
  }

  public JobRequest batchQueue(String batchQueue) {
    this.batchQueue = batchQueue;
    return this;
  }

   /**
   * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
   * @return batchQueue
  **/
  @ApiModelProperty(value = "The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.")
  public String getBatchQueue() {
    return batchQueue;
  }

  public void setBatchQueue(String batchQueue) {
    this.batchQueue = batchQueue;
  }

  public JobRequest inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
   * @return inputs
  **/
  @ApiModelProperty(value = "The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

  public JobRequest memoryPerNode(Long memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
    return this;
  }

   /**
   * The requested memory for this application to run given in GB.
   * @return memoryPerNode
  **/
  @ApiModelProperty(value = "The requested memory for this application to run given in GB.")
  public Long getMemoryPerNode() {
    return memoryPerNode;
  }

  public void setMemoryPerNode(Long memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
  }

  public JobRequest name(String name) {
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

  public JobRequest nodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
   * @return nodeCount
  **/
  @ApiModelProperty(value = "The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.")
  public Long getNodeCount() {
    return nodeCount;
  }

  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }

  public JobRequest notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public JobRequest addNotificationsItem(Notification notificationsItem) {
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

  public JobRequest parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
   * @return parameters
  **/
  @ApiModelProperty(value = "The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public JobRequest processorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
    return this;
  }

   /**
   * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
   * @return processorsPerNode
  **/
  @ApiModelProperty(value = "The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.")
  public Long getProcessorsPerNode() {
    return processorsPerNode;
  }

  public void setProcessorsPerNode(Long processorsPerNode) {
    this.processorsPerNode = processorsPerNode;
  }

  public JobRequest maxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
    return this;
  }

   /**
   * The requested compute time needed for this application to complete given in HH:mm:ss format.
   * @return maxRunTime
  **/
  @ApiModelProperty(value = "The requested compute time needed for this application to complete given in HH:mm:ss format.")
  public String getMaxRunTime() {
    return maxRunTime;
  }

  public void setMaxRunTime(String maxRunTime) {
    this.maxRunTime = maxRunTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRequest jobRequest = (JobRequest) o;
    return Objects.equals(this.appId, jobRequest.appId) &&
        Objects.equals(this.archive, jobRequest.archive) &&
        Objects.equals(this.archivePath, jobRequest.archivePath) &&
        Objects.equals(this.archiveSystem, jobRequest.archiveSystem) &&
        Objects.equals(this.batchQueue, jobRequest.batchQueue) &&
        Objects.equals(this.inputs, jobRequest.inputs) &&
        Objects.equals(this.memoryPerNode, jobRequest.memoryPerNode) &&
        Objects.equals(this.name, jobRequest.name) &&
        Objects.equals(this.nodeCount, jobRequest.nodeCount) &&
        Objects.equals(this.notifications, jobRequest.notifications) &&
        Objects.equals(this.parameters, jobRequest.parameters) &&
        Objects.equals(this.processorsPerNode, jobRequest.processorsPerNode) &&
        Objects.equals(this.maxRunTime, jobRequest.maxRunTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, archive, archivePath, archiveSystem, batchQueue, inputs, memoryPerNode, name, nodeCount, notifications, parameters, processorsPerNode, maxRunTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRequest {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archivePath: ").append(toIndentedString(archivePath)).append("\n");
    sb.append("    archiveSystem: ").append(toIndentedString(archiveSystem)).append("\n");
    sb.append("    batchQueue: ").append(toIndentedString(batchQueue)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    memoryPerNode: ").append(toIndentedString(memoryPerNode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    processorsPerNode: ").append(toIndentedString(processorsPerNode)).append("\n");
    sb.append("    maxRunTime: ").append(toIndentedString(maxRunTime)).append("\n");
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

