package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Client
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Client {
  @SerializedName("key")
  private String key = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tier")
  private String tier = null;

  public Client key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The API key for this client.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The API key for this client.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Client secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The API secret for this client.
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "The API secret for this client.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Client callbackUrl(String callbackUrl) {
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

  public Client description(String description) {
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

  public Client name(String name) {
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

  public Client tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * The access tier for this client.
   * @return tier
  **/
  @ApiModelProperty(required = true, value = "The access tier for this client.")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.key, client.key) &&
        Objects.equals(this.secret, client.secret) &&
        Objects.equals(this.callbackUrl, client.callbackUrl) &&
        Objects.equals(this.description, client.description) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.tier, client.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, secret, callbackUrl, description, name, tier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

