package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A compressed description of a monitoring task
 */
@ApiModel(description = "A compressed description of a monitoring task")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MonitoringTaskSummary {
  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("frequency")
  private Long frequency = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("updateSystemStatus")
  private Boolean updateSystemStatus = false;

  @SerializedName("id")
  private String id = null;

  public MonitoringTaskSummary active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether this monitor is currently active.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Whether this monitor is currently active.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MonitoringTaskSummary frequency(Long frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * The interval in minutes on which this monitor will run. Minimum is 5. Default is 720.
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "The interval in minutes on which this monitor will run. Minimum is 5. Default is 720.")
  public Long getFrequency() {
    return frequency;
  }

  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }

  public MonitoringTaskSummary internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * Internal user account used to perform the check.
   * @return internalUsername
  **/
  @ApiModelProperty(value = "Internal user account used to perform the check.")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public MonitoringTaskSummary target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The id of the sytem to be monitored. This must be an active system registered with the Systems service.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The id of the sytem to be monitored. This must be an active system registered with the Systems service.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public MonitoringTaskSummary updateSystemStatus(Boolean updateSystemStatus) {
    this.updateSystemStatus = updateSystemStatus;
    return this;
  }

   /**
   * Whether this Monitor should update the system status when the results change. You must have the ADMIN role on the target system to use this feature.
   * @return updateSystemStatus
  **/
  @ApiModelProperty(required = true, value = "Whether this Monitor should update the system status when the results change. You must have the ADMIN role on the target system to use this feature.")
  public Boolean getUpdateSystemStatus() {
    return updateSystemStatus;
  }

  public void setUpdateSystemStatus(Boolean updateSystemStatus) {
    this.updateSystemStatus = updateSystemStatus;
  }

  public MonitoringTaskSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the monitor
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of the monitor")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringTaskSummary monitoringTaskSummary = (MonitoringTaskSummary) o;
    return Objects.equals(this.active, monitoringTaskSummary.active) &&
        Objects.equals(this.frequency, monitoringTaskSummary.frequency) &&
        Objects.equals(this.internalUsername, monitoringTaskSummary.internalUsername) &&
        Objects.equals(this.target, monitoringTaskSummary.target) &&
        Objects.equals(this.updateSystemStatus, monitoringTaskSummary.updateSystemStatus) &&
        Objects.equals(this.id, monitoringTaskSummary.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, frequency, internalUsername, target, updateSystemStatus, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringTaskSummary {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    updateSystemStatus: ").append(toIndentedString(updateSystemStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

