package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.FileInfo;

/**
 * MultipleRemoteFileResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MultipleRemoteFileResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private List<FileInfo> result = new ArrayList<FileInfo>();

  @SerializedName("status")
  private String status = null;

  public MultipleRemoteFileResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * success or failure
   * @return message
  **/
  @ApiModelProperty(required = true, value = "success or failure")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MultipleRemoteFileResponse result(List<FileInfo> result) {
    this.result = result;
    return this;
  }

  public MultipleRemoteFileResponse addResultItem(FileInfo resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * response body
   * @return result
  **/
  @ApiModelProperty(required = true, value = "response body")
  public List<FileInfo> getResult() {
    return result;
  }

  public void setResult(List<FileInfo> result) {
    this.result = result;
  }

  public MultipleRemoteFileResponse status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleRemoteFileResponse multipleRemoteFileResponse = (MultipleRemoteFileResponse) o;
    return Objects.equals(this.message, multipleRemoteFileResponse.message) &&
        Objects.equals(this.result, multipleRemoteFileResponse.result) &&
        Objects.equals(this.status, multipleRemoteFileResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleRemoteFileResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

