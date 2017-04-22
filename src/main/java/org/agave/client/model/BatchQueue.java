package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BatchQueue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class BatchQueue {
  @SerializedName("customDirectives")
  private String customDirectives = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("maxJobs")
  private Long maxJobs = null;

  @SerializedName("maxUserJobs")
  private Long maxUserJobs = null;

  @SerializedName("maxNodes")
  private String maxNodes = null;

  @SerializedName("maxMemoryPerNode")
  private String maxMemoryPerNode = null;

  @SerializedName("maxProcessorsPerNode")
  private Long maxProcessorsPerNode = null;

  @SerializedName("maxRequestedTime")
  private String maxRequestedTime = null;

  @SerializedName("name")
  private String name = null;

  public BatchQueue customDirectives(String customDirectives) {
    this.customDirectives = customDirectives;
    return this;
  }

   /**
   * Any custom directives that should be appended to scheduler directives. ex. #$ -A TG-12345
   * @return customDirectives
  **/
  @ApiModelProperty(required = true, value = "Any custom directives that should be appended to scheduler directives. ex. #$ -A TG-12345")
  public String getCustomDirectives() {
    return customDirectives;
  }

  public void setCustomDirectives(String customDirectives) {
    this.customDirectives = customDirectives;
  }

  public BatchQueue isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is this the default queue for the system.
   * @return isDefault
  **/
  @ApiModelProperty(required = true, value = "Is this the default queue for the system.")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public BatchQueue maxJobs(Long maxJobs) {
    this.maxJobs = maxJobs;
    return this;
  }

   /**
   * The maximum number of jobs that can be in queue at once.
   * @return maxJobs
  **/
  @ApiModelProperty(required = true, value = "The maximum number of jobs that can be in queue at once.")
  public Long getMaxJobs() {
    return maxJobs;
  }

  public void setMaxJobs(Long maxJobs) {
    this.maxJobs = maxJobs;
  }

  public BatchQueue maxUserJobs(Long maxUserJobs) {
    this.maxUserJobs = maxUserJobs;
    return this;
  }

   /**
   * The maximum number of jobs per user that can be in queue at once.
   * @return maxUserJobs
  **/
  @ApiModelProperty(required = true, value = "The maximum number of jobs per user that can be in queue at once.")
  public Long getMaxUserJobs() {
    return maxUserJobs;
  }

  public void setMaxUserJobs(Long maxUserJobs) {
    this.maxUserJobs = maxUserJobs;
  }

  public BatchQueue maxNodes(String maxNodes) {
    this.maxNodes = maxNodes;
    return this;
  }

   /**
   * The max nodes available per node to jobs submitted to this queue.
   * @return maxNodes
  **/
  @ApiModelProperty(required = true, value = "The max nodes available per node to jobs submitted to this queue.")
  public String getMaxNodes() {
    return maxNodes;
  }

  public void setMaxNodes(String maxNodes) {
    this.maxNodes = maxNodes;
  }

  public BatchQueue maxMemoryPerNode(String maxMemoryPerNode) {
    this.maxMemoryPerNode = maxMemoryPerNode;
    return this;
  }

   /**
   * The max memory available per node to jobs submitted to this queue.
   * @return maxMemoryPerNode
  **/
  @ApiModelProperty(required = true, value = "The max memory available per node to jobs submitted to this queue.")
  public String getMaxMemoryPerNode() {
    return maxMemoryPerNode;
  }

  public void setMaxMemoryPerNode(String maxMemoryPerNode) {
    this.maxMemoryPerNode = maxMemoryPerNode;
  }

  public BatchQueue maxProcessorsPerNode(Long maxProcessorsPerNode) {
    this.maxProcessorsPerNode = maxProcessorsPerNode;
    return this;
  }

   /**
   * The max processors per node available to jobs submitted to this queue.
   * @return maxProcessorsPerNode
  **/
  @ApiModelProperty(required = true, value = "The max processors per node available to jobs submitted to this queue.")
  public Long getMaxProcessorsPerNode() {
    return maxProcessorsPerNode;
  }

  public void setMaxProcessorsPerNode(Long maxProcessorsPerNode) {
    this.maxProcessorsPerNode = maxProcessorsPerNode;
  }

  public BatchQueue maxRequestedTime(String maxRequestedTime) {
    this.maxRequestedTime = maxRequestedTime;
    return this;
  }

   /**
   * The max length of jobs submitted to this queue in hhh:mm:ss format.
   * @return maxRequestedTime
  **/
  @ApiModelProperty(required = true, value = "The max length of jobs submitted to this queue in hhh:mm:ss format.")
  public String getMaxRequestedTime() {
    return maxRequestedTime;
  }

  public void setMaxRequestedTime(String maxRequestedTime) {
    this.maxRequestedTime = maxRequestedTime;
  }

  public BatchQueue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the batch queue.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the batch queue.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchQueue batchQueue = (BatchQueue) o;
    return Objects.equals(this.customDirectives, batchQueue.customDirectives) &&
        Objects.equals(this.isDefault, batchQueue.isDefault) &&
        Objects.equals(this.maxJobs, batchQueue.maxJobs) &&
        Objects.equals(this.maxUserJobs, batchQueue.maxUserJobs) &&
        Objects.equals(this.maxNodes, batchQueue.maxNodes) &&
        Objects.equals(this.maxMemoryPerNode, batchQueue.maxMemoryPerNode) &&
        Objects.equals(this.maxProcessorsPerNode, batchQueue.maxProcessorsPerNode) &&
        Objects.equals(this.maxRequestedTime, batchQueue.maxRequestedTime) &&
        Objects.equals(this.name, batchQueue.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customDirectives, isDefault, maxJobs, maxUserJobs, maxNodes, maxMemoryPerNode, maxProcessorsPerNode, maxRequestedTime, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchQueue {\n");
    
    sb.append("    customDirectives: ").append(toIndentedString(customDirectives)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    maxJobs: ").append(toIndentedString(maxJobs)).append("\n");
    sb.append("    maxUserJobs: ").append(toIndentedString(maxUserJobs)).append("\n");
    sb.append("    maxNodes: ").append(toIndentedString(maxNodes)).append("\n");
    sb.append("    maxMemoryPerNode: ").append(toIndentedString(maxMemoryPerNode)).append("\n");
    sb.append("    maxProcessorsPerNode: ").append(toIndentedString(maxProcessorsPerNode)).append("\n");
    sb.append("    maxRequestedTime: ").append(toIndentedString(maxRequestedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

