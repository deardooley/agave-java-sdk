package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.UUIDResolution;

/**
 * Resource to which a tag has been associated
 */
@ApiModel(description = "Resource to which a tag has been associated")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class UUIDSummary {
  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private List<UUIDResolution> result = new ArrayList<UUIDResolution>();

  @SerializedName("status")
  private String status = null;

  @SerializedName("version")
  private String version = null;

  public UUIDSummary message(String message) {
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

  public UUIDSummary result(List<UUIDResolution> result) {
    this.result = result;
    return this;
  }

  public UUIDSummary addResultItem(UUIDResolution resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<UUIDResolution> getResult() {
    return result;
  }

  public void setResult(List<UUIDResolution> result) {
    this.result = result;
  }

  public UUIDSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * success or failure
   * @return status
  **/
  @ApiModelProperty(value = "success or failure")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UUIDSummary version(String version) {
    this.version = version;
    return this;
  }

   /**
   * API version number
   * @return version
  **/
  @ApiModelProperty(value = "API version number")
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
    UUIDSummary uuIDSummary = (UUIDSummary) o;
    return Objects.equals(this.message, uuIDSummary.message) &&
        Objects.equals(this.result, uuIDSummary.result) &&
        Objects.equals(this.status, uuIDSummary.status) &&
        Objects.equals(this.version, uuIDSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UUIDSummary {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

