package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransformRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TransformRequest {
  @SerializedName("nativeFormat")
  private String nativeFormat = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  public TransformRequest nativeFormat(String nativeFormat) {
    this.nativeFormat = nativeFormat;
    return this;
  }

   /**
   * The original file type of the file. If not given, the file type is assumed to be raw.
   * @return nativeFormat
  **/
  @ApiModelProperty(required = true, value = "The original file type of the file. If not given, the file type is assumed to be raw.")
  public String getNativeFormat() {
    return nativeFormat;
  }

  public void setNativeFormat(String nativeFormat) {
    this.nativeFormat = nativeFormat;
  }

  public TransformRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The uri to which the transformed file will be staged.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The uri to which the transformed file will be staged.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TransformRequest callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URI to notify when the transfer is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
   * @return callbackUrl
  **/
  @ApiModelProperty(required = true, value = "The URI to notify when the transfer is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformRequest transformRequest = (TransformRequest) o;
    return Objects.equals(this.nativeFormat, transformRequest.nativeFormat) &&
        Objects.equals(this.url, transformRequest.url) &&
        Objects.equals(this.callbackUrl, transformRequest.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeFormat, url, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformRequest {\n");
    
    sb.append("    nativeFormat: ").append(toIndentedString(nativeFormat)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

