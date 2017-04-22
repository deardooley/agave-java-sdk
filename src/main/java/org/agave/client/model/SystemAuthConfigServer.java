package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemAuthConfigServerProtocolType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemAuthConfigServer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemAuthConfigServer {
  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("protocol")
  private SystemAuthConfigServerProtocolType protocol = null;

  public SystemAuthConfigServer endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The hostname or ip address of the remote server.
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "The hostname or ip address of the remote server.")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public SystemAuthConfigServer port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * The port number of the remote server..
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port number of the remote server..")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public SystemAuthConfigServer protocol(SystemAuthConfigServerProtocolType protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemAuthConfigServerProtocolType getProtocol() {
    return protocol;
  }

  public void setProtocol(SystemAuthConfigServerProtocolType protocol) {
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
    SystemAuthConfigServer systemAuthConfigServer = (SystemAuthConfigServer) o;
    return Objects.equals(this.endpoint, systemAuthConfigServer.endpoint) &&
        Objects.equals(this.port, systemAuthConfigServer.port) &&
        Objects.equals(this.protocol, systemAuthConfigServer.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthConfigServer {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

