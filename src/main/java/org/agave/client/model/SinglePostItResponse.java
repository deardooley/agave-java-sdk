package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.PostIt;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SinglePostItResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SinglePostItResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private PostIt result = null;

  @SerializedName("status")
  private String status = null;

  public SinglePostItResponse message(String message) {
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

  public SinglePostItResponse result(PostIt result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public PostIt getResult() {
    return result;
  }

  public void setResult(PostIt result) {
    this.result = result;
  }

  public SinglePostItResponse status(String status) {
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
    SinglePostItResponse singlePostItResponse = (SinglePostItResponse) o;
    return Objects.equals(this.message, singlePostItResponse.message) &&
        Objects.equals(this.result, singlePostItResponse.result) &&
        Objects.equals(this.status, singlePostItResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePostItResponse {\n");
    
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

