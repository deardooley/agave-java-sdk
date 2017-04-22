package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.SystemSummary;

/**
 * MultipleSystemResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MultipleSystemResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private List<SystemSummary> result = new ArrayList<SystemSummary>();

  @SerializedName("status")
  private String status = null;

  public MultipleSystemResponse message(String message) {
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

  public MultipleSystemResponse result(List<SystemSummary> result) {
    this.result = result;
    return this;
  }

  public MultipleSystemResponse addResultItem(SystemSummary resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * response body
   * @return result
  **/
  @ApiModelProperty(required = true, value = "response body")
  public List<SystemSummary> getResult() {
    return result;
  }

  public void setResult(List<SystemSummary> result) {
    this.result = result;
  }

  public MultipleSystemResponse status(String status) {
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
    MultipleSystemResponse multipleSystemResponse = (MultipleSystemResponse) o;
    return Objects.equals(this.message, multipleSystemResponse.message) &&
        Objects.equals(this.result, multipleSystemResponse.result) &&
        Objects.equals(this.status, multipleSystemResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleSystemResponse {\n");
    
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

