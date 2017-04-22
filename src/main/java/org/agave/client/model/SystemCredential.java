package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.agave.client.model.AuthenticationType;
import org.agave.client.model.SystemAuthConfigServerProtocolType;
import org.agave.client.model.SystemType;
import org.joda.time.DateTime;

/**
 * Authentication credential for the default or internal user on a system
 */
@ApiModel(description = "Authentication credential for the default or internal user on a system")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemCredential {
  @SerializedName("credential")
  private String credential = null;

  @SerializedName("expirationDate")
  private DateTime expirationDate = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("parentType")
  private SystemType parentType = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("publicKey")
  private String publicKey = null;

  @SerializedName("privateKey")
  private String privateKey = null;

  @SerializedName("server")
  private SystemAuthConfigServerProtocolType server = null;

  @SerializedName("type")
  private AuthenticationType type = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("caCerts")
  private String caCerts = null;

  public SystemCredential credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..
   * @return credential
  **/
  @ApiModelProperty(required = true, value = "The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public SystemCredential expirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The date the credential expires in ISO 8601 format.
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "The date the credential expires in ISO 8601 format.")
  public DateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SystemCredential internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * The username of the internal user associated with this credential.
   * @return internalUsername
  **/
  @ApiModelProperty(required = true, value = "The username of the internal user associated with this credential.")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public SystemCredential isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is this the default credential for this internal user of this type on this system?
   * @return isDefault
  **/
  @ApiModelProperty(required = true, value = "Is this the default credential for this internal user of this type on this system?")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SystemCredential parentType(SystemType parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemType getParentType() {
    return parentType;
  }

  public void setParentType(SystemType parentType) {
    this.parentType = parentType;
  }

  public SystemCredential password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password on the remote system used to authenticate.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The password on the remote system used to authenticate.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SystemCredential publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The public ssh key used to authenticate to the remote system.
   * @return publicKey
  **/
  @ApiModelProperty(required = true, value = "The public ssh key used to authenticate to the remote system.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public SystemCredential privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The public ssh key used to authenticate to the remote system..
   * @return privateKey
  **/
  @ApiModelProperty(required = true, value = "The public ssh key used to authenticate to the remote system..")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public SystemCredential server(SystemAuthConfigServerProtocolType server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemAuthConfigServerProtocolType getServer() {
    return server;
  }

  public void setServer(SystemAuthConfigServerProtocolType server) {
    this.server = server;
  }

  public SystemCredential type(AuthenticationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public AuthenticationType getType() {
    return type;
  }

  public void setType(AuthenticationType type) {
    this.type = type;
  }

  public SystemCredential username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The local username on the remote system used to authenticate.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The local username on the remote system used to authenticate.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SystemCredential valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Is the credential still valid or has it expired?.
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "Is the credential still valid or has it expired?.")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public SystemCredential caCerts(String caCerts) {
    this.caCerts = caCerts;
    return this;
  }

   /**
   * A public URL to the location of the trusted CA certs to use with this credential.
   * @return caCerts
  **/
  @ApiModelProperty(required = true, value = "A public URL to the location of the trusted CA certs to use with this credential.")
  public String getCaCerts() {
    return caCerts;
  }

  public void setCaCerts(String caCerts) {
    this.caCerts = caCerts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemCredential systemCredential = (SystemCredential) o;
    return Objects.equals(this.credential, systemCredential.credential) &&
        Objects.equals(this.expirationDate, systemCredential.expirationDate) &&
        Objects.equals(this.internalUsername, systemCredential.internalUsername) &&
        Objects.equals(this.isDefault, systemCredential.isDefault) &&
        Objects.equals(this.parentType, systemCredential.parentType) &&
        Objects.equals(this.password, systemCredential.password) &&
        Objects.equals(this.publicKey, systemCredential.publicKey) &&
        Objects.equals(this.privateKey, systemCredential.privateKey) &&
        Objects.equals(this.server, systemCredential.server) &&
        Objects.equals(this.type, systemCredential.type) &&
        Objects.equals(this.username, systemCredential.username) &&
        Objects.equals(this.valid, systemCredential.valid) &&
        Objects.equals(this.caCerts, systemCredential.caCerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, expirationDate, internalUsername, isDefault, parentType, password, publicKey, privateKey, server, type, username, valid, caCerts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemCredential {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
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

