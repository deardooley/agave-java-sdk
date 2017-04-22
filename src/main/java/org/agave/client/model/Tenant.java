package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.TenantContact;
import org.joda.time.DateTime;

/**
 * Tenant organization details
 */
@ApiModel(description = "Tenant organization details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Tenant {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("baseUrl")
  private String baseUrl = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("contact")
  private TenantContact contact = null;

  public Tenant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * uuid of the tenant
   * @return id
  **/
  @ApiModelProperty(value = "uuid of the tenant")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tenant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * human readable name of the tenant organization
   * @return name
  **/
  @ApiModelProperty(value = "human readable name of the tenant organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tenant baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The base url for all tenant requests. This should always be SSL enabled.
   * @return baseUrl
  **/
  @ApiModelProperty(value = "The base url for all tenant requests. This should always be SSL enabled.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public Tenant code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code by which this tenant is known, eg. agave.prod
   * @return code
  **/
  @ApiModelProperty(value = "The code by which this tenant is known, eg. agave.prod")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Tenant created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When the tenant was created in ISO8601 format
   * @return created
  **/
  @ApiModelProperty(value = "When the tenant was created in ISO8601 format")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Tenant lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * When the tenant was last updated in ISO8601 format
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "When the tenant was last updated in ISO8601 format")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Tenant contact(TenantContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public TenantContact getContact() {
    return contact;
  }

  public void setContact(TenantContact contact) {
    this.contact = contact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.id, tenant.id) &&
        Objects.equals(this.name, tenant.name) &&
        Objects.equals(this.baseUrl, tenant.baseUrl) &&
        Objects.equals(this.code, tenant.code) &&
        Objects.equals(this.created, tenant.created) &&
        Objects.equals(this.lastUpdated, tenant.lastUpdated) &&
        Objects.equals(this.contact, tenant.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, baseUrl, code, created, lastUpdated, contact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

