package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.TenantContact;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tenant contact information
 */
@ApiModel(description = "Tenant contact information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TenantContact {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("url")
  private String url = null;

  /**
   * The type of contact this user represents.
   */
  public enum TypeEnum {
    @SerializedName("admin")
    ADMIN("admin"),
    
    @SerializedName("support")
    SUPPORT("support"),
    
    @SerializedName("education")
    EDUCATION("education"),
    
    @SerializedName("media")
    MEDIA("media"),
    
    @SerializedName("training")
    TRAINING("training"),
    
    @SerializedName("security")
    SECURITY("security");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("contact")
  private TenantContact contact = null;

  public TenantContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of the contact
   * @return name
  **/
  @ApiModelProperty(value = "Full name of the contact")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TenantContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The base url for all tenant requests. This should always be SSL enabled.
   * @return email
  **/
  @ApiModelProperty(value = "The base url for all tenant requests. This should always be SSL enabled.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TenantContact url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The code by which this tenant is known, eg. agave.prod
   * @return url
  **/
  @ApiModelProperty(value = "The code by which this tenant is known, eg. agave.prod")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TenantContact type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of contact this user represents.
   * @return type
  **/
  @ApiModelProperty(value = "The type of contact this user represents.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TenantContact primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Whether the contact is the primary contact for the tenant.
   * @return primary
  **/
  @ApiModelProperty(value = "Whether the contact is the primary contact for the tenant.")
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public TenantContact contact(TenantContact contact) {
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
    TenantContact tenantContact = (TenantContact) o;
    return Objects.equals(this.name, tenantContact.name) &&
        Objects.equals(this.email, tenantContact.email) &&
        Objects.equals(this.url, tenantContact.url) &&
        Objects.equals(this.type, tenantContact.type) &&
        Objects.equals(this.primary, tenantContact.primary) &&
        Objects.equals(this.contact, tenantContact.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, url, type, primary, contact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantContact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

