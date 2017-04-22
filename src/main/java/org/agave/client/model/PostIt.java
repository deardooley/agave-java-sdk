package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * PostIt
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class PostIt {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("expires")
  private DateTime expires = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("postit")
  private String postit = null;

  @SerializedName("remainingUses")
  private Long remainingUses = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("noauth")
  private Boolean noauth = null;

  public PostIt created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The creation date in ISO 8601 format.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The creation date in ISO 8601 format.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public PostIt creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * The api user who made the PostIt creation request.
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "The api user who made the PostIt creation request.")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public PostIt expires(DateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The expiration date in ISO 8601 format.
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "The expiration date in ISO 8601 format.")
  public DateTime getExpires() {
    return expires;
  }

  public void setExpires(DateTime expires) {
    this.expires = expires;
  }

  public PostIt internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * The username of the internal user attached to this PostIt.
   * @return internalUsername
  **/
  @ApiModelProperty(required = true, value = "The username of the internal user attached to this PostIt.")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public PostIt method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The url that will be invoked when the PostIt is redeemed.
   * @return method
  **/
  @ApiModelProperty(required = true, value = "The url that will be invoked when the PostIt is redeemed.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PostIt postit(String postit) {
    this.postit = postit;
    return this;
  }

   /**
   * The PostIt nonce.
   * @return postit
  **/
  @ApiModelProperty(required = true, value = "The PostIt nonce.")
  public String getPostit() {
    return postit;
  }

  public void setPostit(String postit) {
    this.postit = postit;
  }

  public PostIt remainingUses(Long remainingUses) {
    this.remainingUses = remainingUses;
    return this;
  }

   /**
   * The number of invocations remaining on this token. 
   * @return remainingUses
  **/
  @ApiModelProperty(required = true, value = "The number of invocations remaining on this token. ")
  public Long getRemainingUses() {
    return remainingUses;
  }

  public void setRemainingUses(Long remainingUses) {
    this.remainingUses = remainingUses;
  }

  public PostIt url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url that will be invoked when the PostIt is redeemed.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url that will be invoked when the PostIt is redeemed.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PostIt noauth(Boolean noauth) {
    this.noauth = noauth;
    return this;
  }

   /**
   * If true, the provided url will be called without authentication. Default is false
   * @return noauth
  **/
  @ApiModelProperty(required = true, value = "If true, the provided url will be called without authentication. Default is false")
  public Boolean getNoauth() {
    return noauth;
  }

  public void setNoauth(Boolean noauth) {
    this.noauth = noauth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostIt postIt = (PostIt) o;
    return Objects.equals(this.created, postIt.created) &&
        Objects.equals(this.creator, postIt.creator) &&
        Objects.equals(this.expires, postIt.expires) &&
        Objects.equals(this.internalUsername, postIt.internalUsername) &&
        Objects.equals(this.method, postIt.method) &&
        Objects.equals(this.postit, postIt.postit) &&
        Objects.equals(this.remainingUses, postIt.remainingUses) &&
        Objects.equals(this.url, postIt.url) &&
        Objects.equals(this.noauth, postIt.noauth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, creator, expires, internalUsername, method, postit, remainingUses, url, noauth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIt {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    postit: ").append(toIndentedString(postit)).append("\n");
    sb.append("    remainingUses: ").append(toIndentedString(remainingUses)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    noauth: ").append(toIndentedString(noauth)).append("\n");
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

