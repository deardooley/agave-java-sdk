package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This is the wrapper within which all API responses are returned.
 */
@ApiModel(description = "This is the wrapper within which all API responses are returned.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class AgaveResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = "success";

  @SerializedName("version")
  private String version = null;

  public AgaveResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * success or failure
   * @return message
  **/
  @ApiModelProperty(value = "success or failure")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AgaveResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * success or failure
   * @return status
  **/
  @ApiModelProperty(required = true, value = "success or failure")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AgaveResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The current api version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The current api version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgaveResponse agaveResponse = (AgaveResponse) o;
    return Objects.equals(this.message, agaveResponse.message) &&
        Objects.equals(this.status, agaveResponse.status) &&
        Objects.equals(this.version, agaveResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgaveResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

