package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemAuthConfigServer;
import org.agave.client.model.SystemLoginAuthenticationType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemAuthConfig
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemAuthConfig {
  @SerializedName("credential")
  private String credential = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("publicKey")
  private String publicKey = null;

  @SerializedName("privateKey")
  private String privateKey = null;

  @SerializedName("server")
  private SystemAuthConfigServer server = null;

  @SerializedName("type")
  private SystemLoginAuthenticationType type = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("caCerts")
  private String caCerts = null;

  public SystemAuthConfig credential(String credential) {
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

  public SystemAuthConfig internalUsername(String internalUsername) {
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

  public SystemAuthConfig password(String password) {
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

  public SystemAuthConfig publicKey(String publicKey) {
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

  public SystemAuthConfig privateKey(String privateKey) {
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

  public SystemAuthConfig server(SystemAuthConfigServer server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemAuthConfigServer getServer() {
    return server;
  }

  public void setServer(SystemAuthConfigServer server) {
    this.server = server;
  }

  public SystemAuthConfig type(SystemLoginAuthenticationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemLoginAuthenticationType getType() {
    return type;
  }

  public void setType(SystemLoginAuthenticationType type) {
    this.type = type;
  }

  public SystemAuthConfig username(String username) {
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

  public SystemAuthConfig caCerts(String caCerts) {
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
    SystemAuthConfig systemAuthConfig = (SystemAuthConfig) o;
    return Objects.equals(this.credential, systemAuthConfig.credential) &&
        Objects.equals(this.internalUsername, systemAuthConfig.internalUsername) &&
        Objects.equals(this.password, systemAuthConfig.password) &&
        Objects.equals(this.publicKey, systemAuthConfig.publicKey) &&
        Objects.equals(this.privateKey, systemAuthConfig.privateKey) &&
        Objects.equals(this.server, systemAuthConfig.server) &&
        Objects.equals(this.type, systemAuthConfig.type) &&
        Objects.equals(this.username, systemAuthConfig.username) &&
        Objects.equals(this.caCerts, systemAuthConfig.caCerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, internalUsername, password, publicKey, privateKey, server, type, username, caCerts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthConfig {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

