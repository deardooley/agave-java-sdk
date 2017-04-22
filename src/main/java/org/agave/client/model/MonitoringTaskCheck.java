package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.MonitorCheckResultType;
import org.joda.time.DateTime;

/**
 * An individual check made for a monitoring task. 
 */
@ApiModel(description = "An individual check made for a monitoring task. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MonitoringTaskCheck {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private MonitorCheckResultType result = null;

  public MonitoringTaskCheck created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * A timestamp indicating when this monitor check was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "A timestamp indicating when this monitor check was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public MonitoringTaskCheck id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID for this monitor check.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The UUID for this monitor check.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitoringTaskCheck message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message if this monitor check failed.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The error message if this monitor check failed.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MonitoringTaskCheck result(MonitorCheckResultType result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public MonitorCheckResultType getResult() {
    return result;
  }

  public void setResult(MonitorCheckResultType result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringTaskCheck monitoringTaskCheck = (MonitoringTaskCheck) o;
    return Objects.equals(this.created, monitoringTaskCheck.created) &&
        Objects.equals(this.id, monitoringTaskCheck.id) &&
        Objects.equals(this.message, monitoringTaskCheck.message) &&
        Objects.equals(this.result, monitoringTaskCheck.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, message, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringTaskCheck {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

