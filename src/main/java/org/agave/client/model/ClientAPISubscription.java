package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ClientAPISubscriptionStatusType;
import org.agave.client.model.ClientSubscriptionTier;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClientAPISubscription
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ClientAPISubscription {
  @SerializedName("apiContext")
  private String apiContext = null;

  @SerializedName("apiName")
  private String apiName = null;

  @SerializedName("apiProvider")
  private String apiProvider = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("status")
  private ClientAPISubscriptionStatusType status = null;

  @SerializedName("tier")
  private ClientSubscriptionTier tier = null;

  public ClientAPISubscription apiContext(String apiContext) {
    this.apiContext = apiContext;
    return this;
  }

   /**
   * The base url path of the API.
   * @return apiContext
  **/
  @ApiModelProperty(required = true, value = "The base url path of the API.")
  public String getApiContext() {
    return apiContext;
  }

  public void setApiContext(String apiContext) {
    this.apiContext = apiContext;
  }

  public ClientAPISubscription apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

   /**
   * The name of the API.
   * @return apiName
  **/
  @ApiModelProperty(required = true, value = "The name of the API.")
  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public ClientAPISubscription apiProvider(String apiProvider) {
    this.apiProvider = apiProvider;
    return this;
  }

   /**
   * The user who registered the API.
   * @return apiProvider
  **/
  @ApiModelProperty(required = true, value = "The user who registered the API.")
  public String getApiProvider() {
    return apiProvider;
  }

  public void setApiProvider(String apiProvider) {
    this.apiProvider = apiProvider;
  }

  public ClientAPISubscription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The current major version of the API. This is appended to the api_context to create the base API url.
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "The current major version of the API. This is appended to the api_context to create the base API url.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ClientAPISubscription status(ClientAPISubscriptionStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public ClientAPISubscriptionStatusType getStatus() {
    return status;
  }

  public void setStatus(ClientAPISubscriptionStatusType status) {
    this.status = status;
  }

  public ClientAPISubscription tier(ClientSubscriptionTier tier) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAPISubscription clientAPISubscription = (ClientAPISubscription) o;
    return Objects.equals(this.apiContext, clientAPISubscription.apiContext) &&
        Objects.equals(this.apiName, clientAPISubscription.apiName) &&
        Objects.equals(this.apiProvider, clientAPISubscription.apiProvider) &&
        Objects.equals(this.apiVersion, clientAPISubscription.apiVersion) &&
        Objects.equals(this.status, clientAPISubscription.status) &&
        Objects.equals(this.tier, clientAPISubscription.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiContext, apiName, apiProvider, apiVersion, status, tier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAPISubscription {\n");
    
    sb.append("    apiContext: ").append(toIndentedString(apiContext)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    apiProvider: ").append(toIndentedString(apiProvider)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

