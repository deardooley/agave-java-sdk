package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemAuthConfig;
import org.agave.client.model.SystemLoginProtocolType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemLoginConfig
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemLoginConfig {
  @SerializedName("auth")
  private SystemAuthConfig auth = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("protocol")
  private SystemLoginProtocolType protocol = null;

  public SystemLoginConfig auth(SystemAuthConfig auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemAuthConfig getAuth() {
    return auth;
  }

  public void setAuth(SystemAuthConfig auth) {
    this.auth = auth;
  }

  public SystemLoginConfig host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The hostname or ip address of the submission server
   * @return host
  **/
  @ApiModelProperty(required = true, value = "The hostname or ip address of the submission server")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SystemLoginConfig port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * The port number of the submission server.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port number of the submission server.")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public SystemLoginConfig protocol(SystemLoginProtocolType protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemLoginProtocolType getProtocol() {
    return protocol;
  }

  public void setProtocol(SystemLoginProtocolType protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemLoginConfig systemLoginConfig = (SystemLoginConfig) o;
    return Objects.equals(this.auth, systemLoginConfig.auth) &&
        Objects.equals(this.host, systemLoginConfig.host) &&
        Objects.equals(this.port, systemLoginConfig.port) &&
        Objects.equals(this.protocol, systemLoginConfig.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, host, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemLoginConfig {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

