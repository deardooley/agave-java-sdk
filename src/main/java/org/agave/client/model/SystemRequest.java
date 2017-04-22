package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.BatchQueue;
import org.agave.client.model.BatchSchedulerType;
import org.agave.client.model.SystemExecutionType;
import org.agave.client.model.SystemLoginConfig;
import org.agave.client.model.SystemStatusType;
import org.agave.client.model.SystemStorageConfig;
import org.agave.client.model.SystemType;

/**
 * SystemRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemRequest {
  @SerializedName("description")
  private String description = null;

  @SerializedName("environment")
  private String environment = null;

  @SerializedName("executionType")
  private SystemExecutionType executionType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("login")
  private SystemLoginConfig login = null;

  @SerializedName("maxSystemJobs")
  private Long maxSystemJobs = null;

  @SerializedName("maxSystemJobsPerUser")
  private Long maxSystemJobsPerUser = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("queues")
  private List<BatchQueue> queues = new ArrayList<BatchQueue>();

  @SerializedName("scheduler")
  private BatchSchedulerType scheduler = null;

  @SerializedName("scratchDir")
  private String scratchDir = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("startupScript")
  private String startupScript = null;

  @SerializedName("status")
  private SystemStatusType status = null;

  @SerializedName("storage")
  private SystemStorageConfig storage = null;

  @SerializedName("type")
  private SystemType type = null;

  @SerializedName("workDir")
  private String workDir = null;

  public SystemRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Verbose description of this system.
   * @return description
  **/
  @ApiModelProperty(value = "Verbose description of this system.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SystemRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Environment variables to set upon login prior to job submission.
   * @return environment
  **/
  @ApiModelProperty(value = "Environment variables to set upon login prior to job submission.")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public SystemRequest executionType(SystemExecutionType executionType) {
    this.executionType = executionType;
    return this;
  }

   /**
   * Get executionType
   * @return executionType
  **/
  @ApiModelProperty(value = "")
  public SystemExecutionType getExecutionType() {
    return executionType;
  }

  public void setExecutionType(SystemExecutionType executionType) {
    this.executionType = executionType;
  }

  public SystemRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this system.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for this system.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SystemRequest login(SystemLoginConfig login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(value = "")
  public SystemLoginConfig getLogin() {
    return login;
  }

  public void setLogin(SystemLoginConfig login) {
    this.login = login;
  }

  public SystemRequest maxSystemJobs(Long maxSystemJobs) {
    this.maxSystemJobs = maxSystemJobs;
    return this;
  }

   /**
   * The maximum number of jobs that can be simultaneously run on the system across all queues.
   * @return maxSystemJobs
  **/
  @ApiModelProperty(value = "The maximum number of jobs that can be simultaneously run on the system across all queues.")
  public Long getMaxSystemJobs() {
    return maxSystemJobs;
  }

  public void setMaxSystemJobs(Long maxSystemJobs) {
    this.maxSystemJobs = maxSystemJobs;
  }

  public SystemRequest maxSystemJobsPerUser(Long maxSystemJobsPerUser) {
    this.maxSystemJobsPerUser = maxSystemJobsPerUser;
    return this;
  }

   /**
   * The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.
   * @return maxSystemJobsPerUser
  **/
  @ApiModelProperty(value = "The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.")
  public Long getMaxSystemJobsPerUser() {
    return maxSystemJobsPerUser;
  }

  public void setMaxSystemJobsPerUser(Long maxSystemJobsPerUser) {
    this.maxSystemJobsPerUser = maxSystemJobsPerUser;
  }

  public SystemRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Common name for this system.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Common name for this system.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemRequest queues(List<BatchQueue> queues) {
    this.queues = queues;
    return this;
  }

  public SystemRequest addQueuesItem(BatchQueue queuesItem) {
    this.queues.add(queuesItem);
    return this;
  }

   /**
   * The execution paradigm used to run jobs on this system.
   * @return queues
  **/
  @ApiModelProperty(value = "The execution paradigm used to run jobs on this system.")
  public List<BatchQueue> getQueues() {
    return queues;
  }

  public void setQueues(List<BatchQueue> queues) {
    this.queues = queues;
  }

  public SystemRequest scheduler(BatchSchedulerType scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @ApiModelProperty(value = "")
  public BatchSchedulerType getScheduler() {
    return scheduler;
  }

  public void setScheduler(BatchSchedulerType scheduler) {
    this.scheduler = scheduler;
  }

  public SystemRequest scratchDir(String scratchDir) {
    this.scratchDir = scratchDir;
    return this;
  }

   /**
   * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
   * @return scratchDir
  **/
  @ApiModelProperty(value = "The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.")
  public String getScratchDir() {
    return scratchDir;
  }

  public void setScratchDir(String scratchDir) {
    this.scratchDir = scratchDir;
  }

  public SystemRequest site(String site) {
    this.site = site;
    return this;
  }

   /**
   * The site associated with this system.
   * @return site
  **/
  @ApiModelProperty(value = "The site associated with this system.")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public SystemRequest startupScript(String startupScript) {
    this.startupScript = startupScript;
    return this;
  }

   /**
   * Script to be run after login and prior to execution.
   * @return startupScript
  **/
  @ApiModelProperty(value = "Script to be run after login and prior to execution.")
  public String getStartupScript() {
    return startupScript;
  }

  public void setStartupScript(String startupScript) {
    this.startupScript = startupScript;
  }

  public SystemRequest status(SystemStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemStatusType getStatus() {
    return status;
  }

  public void setStatus(SystemStatusType status) {
    this.status = status;
  }

  public SystemRequest storage(SystemStorageConfig storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemStorageConfig getStorage() {
    return storage;
  }

  public void setStorage(SystemStorageConfig storage) {
    this.storage = storage;
  }

  public SystemRequest type(SystemType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemType getType() {
    return type;
  }

  public void setType(SystemType type) {
    this.type = type;
  }

  public SystemRequest workDir(String workDir) {
    this.workDir = workDir;
    return this;
  }

   /**
   * The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.
   * @return workDir
  **/
  @ApiModelProperty(value = "The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.")
  public String getWorkDir() {
    return workDir;
  }

  public void setWorkDir(String workDir) {
    this.workDir = workDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemRequest systemRequest = (SystemRequest) o;
    return Objects.equals(this.description, systemRequest.description) &&
        Objects.equals(this.environment, systemRequest.environment) &&
        Objects.equals(this.executionType, systemRequest.executionType) &&
        Objects.equals(this.id, systemRequest.id) &&
        Objects.equals(this.login, systemRequest.login) &&
        Objects.equals(this.maxSystemJobs, systemRequest.maxSystemJobs) &&
        Objects.equals(this.maxSystemJobsPerUser, systemRequest.maxSystemJobsPerUser) &&
        Objects.equals(this.name, systemRequest.name) &&
        Objects.equals(this.queues, systemRequest.queues) &&
        Objects.equals(this.scheduler, systemRequest.scheduler) &&
        Objects.equals(this.scratchDir, systemRequest.scratchDir) &&
        Objects.equals(this.site, systemRequest.site) &&
        Objects.equals(this.startupScript, systemRequest.startupScript) &&
        Objects.equals(this.status, systemRequest.status) &&
        Objects.equals(this.storage, systemRequest.storage) &&
        Objects.equals(this.type, systemRequest.type) &&
        Objects.equals(this.workDir, systemRequest.workDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, environment, executionType, id, login, maxSystemJobs, maxSystemJobsPerUser, name, queues, scheduler, scratchDir, site, startupScript, status, storage, type, workDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    maxSystemJobs: ").append(toIndentedString(maxSystemJobs)).append("\n");
    sb.append("    maxSystemJobsPerUser: ").append(toIndentedString(maxSystemJobsPerUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    scratchDir: ").append(toIndentedString(scratchDir)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    startupScript: ").append(toIndentedString(startupScript)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
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

