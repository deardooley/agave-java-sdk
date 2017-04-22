package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.ClientAPISubscription;

/**
 * MultipleSubscriptionResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MultipleSubscriptionResponse {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private List<ClientAPISubscription> result = new ArrayList<ClientAPISubscription>();

  @SerializedName("status")
  private String status = null;

  public MultipleSubscriptionResponse message(String message) {
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

  public MultipleSubscriptionResponse result(List<ClientAPISubscription> result) {
    this.result = result;
    return this;
  }

  public MultipleSubscriptionResponse addResultItem(ClientAPISubscription resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * List of subscriptions
   * @return result
  **/
  @ApiModelProperty(required = true, value = "List of subscriptions")
  public List<ClientAPISubscription> getResult() {
    return result;
  }

  public void setResult(List<ClientAPISubscription> result) {
    this.result = result;
  }

  public MultipleSubscriptionResponse status(String status) {
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
    MultipleSubscriptionResponse multipleSubscriptionResponse = (MultipleSubscriptionResponse) o;
    return Objects.equals(this.message, multipleSubscriptionResponse.message) &&
        Objects.equals(this.result, multipleSubscriptionResponse.result) &&
        Objects.equals(this.status, multipleSubscriptionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleSubscriptionResponse {\n");
    
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

