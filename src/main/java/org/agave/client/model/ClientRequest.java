package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ClientSubscriptionTier;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClientRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ClientRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tier")
  private ClientSubscriptionTier tier = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  public ClientRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the client.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the client.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the client. This will be shown to users when authentication via OAuth web flows
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the client. This will be shown to users when authentication via OAuth web flows")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClientRequest tier(ClientSubscriptionTier tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @ApiModelProperty(required = true, value = "")
  public ClientSubscriptionTier getTier() {
    return tier;
  }

  public void setTier(ClientSubscriptionTier tier) {
    this.tier = tier;
  }

  public ClientRequest callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback URL for OAuth authentication grant.
   * @return callbackUrl
  **/
  @ApiModelProperty(required = true, value = "Callback URL for OAuth authentication grant.")
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
    ClientRequest clientRequest = (ClientRequest) o;
    return Objects.equals(this.name, clientRequest.name) &&
        Objects.equals(this.description, clientRequest.description) &&
        Objects.equals(this.tier, clientRequest.tier) &&
        Objects.equals(this.callbackUrl, clientRequest.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tier, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

