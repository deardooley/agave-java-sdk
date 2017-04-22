package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.PostItRequestMethod;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PostItRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class PostItRequest {
  @SerializedName("url")
  private String url = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("method")
  private PostItRequestMethod method = null;

  @SerializedName("lifetime")
  private Long lifetime = null;

  @SerializedName("maxUses")
  private Long maxUses = null;

  @SerializedName("noauth")
  private Boolean noauth = null;

  public PostItRequest url(String url) {
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

  public PostItRequest internalUsername(String internalUsername) {
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

  public PostItRequest method(PostItRequestMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")
  public PostItRequestMethod getMethod() {
    return method;
  }

  public void setMethod(PostItRequestMethod method) {
    this.method = method;
  }

  public PostItRequest lifetime(Long lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * The maximum lifetime in seconds of this PostIt on this token. Defaults to 2592000 (30 days)
   * @return lifetime
  **/
  @ApiModelProperty(required = true, value = "The maximum lifetime in seconds of this PostIt on this token. Defaults to 2592000 (30 days)")
  public Long getLifetime() {
    return lifetime;
  }

  public void setLifetime(Long lifetime) {
    this.lifetime = lifetime;
  }

  public PostItRequest maxUses(Long maxUses) {
    this.maxUses = maxUses;
    return this;
  }

   /**
   * The maximum number of invocations remaining on this PostIt. Defaults to no limit
   * @return maxUses
  **/
  @ApiModelProperty(required = true, value = "The maximum number of invocations remaining on this PostIt. Defaults to no limit")
  public Long getMaxUses() {
    return maxUses;
  }

  public void setMaxUses(Long maxUses) {
    this.maxUses = maxUses;
  }

  public PostItRequest noauth(Boolean noauth) {
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
    PostItRequest postItRequest = (PostItRequest) o;
    return Objects.equals(this.url, postItRequest.url) &&
        Objects.equals(this.internalUsername, postItRequest.internalUsername) &&
        Objects.equals(this.method, postItRequest.method) &&
        Objects.equals(this.lifetime, postItRequest.lifetime) &&
        Objects.equals(this.maxUses, postItRequest.maxUses) &&
        Objects.equals(this.noauth, postItRequest.noauth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, internalUsername, method, lifetime, maxUses, noauth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostItRequest {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    maxUses: ").append(toIndentedString(maxUses)).append("\n");
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

