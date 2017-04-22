package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.SystemAuthConfig;
import org.agave.client.model.SystemStorageProtocolType;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemStorageConfig
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class SystemStorageConfig {
  @SerializedName("auth")
  private SystemAuthConfig auth = null;

  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("homeDir")
  private String homeDir = "/";

  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("mirror")
  private Boolean mirror = false;

  @SerializedName("protocol")
  private SystemStorageProtocolType protocol = null;

  @SerializedName("publicAppsDir")
  private String publicAppsDir = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("rootDir")
  private String rootDir = "/";

  @SerializedName("zone")
  private String zone = null;

  public SystemStorageConfig auth(SystemAuthConfig auth) {
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

  public SystemStorageConfig containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * The name of the bucket to interact with when using an object store.
   * @return containerName
  **/
  @ApiModelProperty(value = "The name of the bucket to interact with when using an object store.")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public SystemStorageConfig homeDir(String homeDir) {
    this.homeDir = homeDir;
    return this;
  }

   /**
   * The path on the remote system to use as the home directory for all API requests. For cases where the home directory should be dynamically defined, the ${USERNAME} token can be included in the homeDir value to represent the username of the authenticated user. ex. /home/${USERNAME}.
   * @return homeDir
  **/
  @ApiModelProperty(value = "The path on the remote system to use as the home directory for all API requests. For cases where the home directory should be dynamically defined, the ${USERNAME} token can be included in the homeDir value to represent the username of the authenticated user. ex. /home/${USERNAME}.")
  public String getHomeDir() {
    return homeDir;
  }

  public void setHomeDir(String homeDir) {
    this.homeDir = homeDir;
  }

  public SystemStorageConfig host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The hostname or ip address of the storage server
   * @return host
  **/
  @ApiModelProperty(required = true, value = "The hostname or ip address of the storage server")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SystemStorageConfig port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * The port number of the storage server.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port number of the storage server.")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public SystemStorageConfig mirror(Boolean mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Whether the permissions set on the server should be pushed to the storage system itself. This only applies to IRODS and AWS systems.
   * @return mirror
  **/
  @ApiModelProperty(value = "Whether the permissions set on the server should be pushed to the storage system itself. This only applies to IRODS and AWS systems.")
  public Boolean getMirror() {
    return mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }

  public SystemStorageConfig protocol(SystemStorageProtocolType protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")
  public SystemStorageProtocolType getProtocol() {
    return protocol;
  }

  public void setProtocol(SystemStorageProtocolType protocol) {
    this.protocol = protocol;
  }

  public SystemStorageConfig publicAppsDir(String publicAppsDir) {
    this.publicAppsDir = publicAppsDir;
    return this;
  }

   /**
   * The path on the remote system where apps will be stored if this is set as the default public storage system.
   * @return publicAppsDir
  **/
  @ApiModelProperty(value = "The path on the remote system where apps will be stored if this is set as the default public storage system.")
  public String getPublicAppsDir() {
    return publicAppsDir;
  }

  public void setPublicAppsDir(String publicAppsDir) {
    this.publicAppsDir = publicAppsDir;
  }

  public SystemStorageConfig resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The name of the target resource when defining an IRODS system.
   * @return resource
  **/
  @ApiModelProperty(value = "The name of the target resource when defining an IRODS system.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public SystemStorageConfig rootDir(String rootDir) {
    this.rootDir = rootDir;
    return this;
  }

   /**
   * The path on the remote system to use as the root for all API requests.
   * @return rootDir
  **/
  @ApiModelProperty(value = "The path on the remote system to use as the root for all API requests.")
  public String getRootDir() {
    return rootDir;
  }

  public void setRootDir(String rootDir) {
    this.rootDir = rootDir;
  }

  public SystemStorageConfig zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * The name of the zone when defining an IRODS system.
   * @return zone
  **/
  @ApiModelProperty(value = "The name of the zone when defining an IRODS system.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemStorageConfig systemStorageConfig = (SystemStorageConfig) o;
    return Objects.equals(this.auth, systemStorageConfig.auth) &&
        Objects.equals(this.containerName, systemStorageConfig.containerName) &&
        Objects.equals(this.homeDir, systemStorageConfig.homeDir) &&
        Objects.equals(this.host, systemStorageConfig.host) &&
        Objects.equals(this.port, systemStorageConfig.port) &&
        Objects.equals(this.mirror, systemStorageConfig.mirror) &&
        Objects.equals(this.protocol, systemStorageConfig.protocol) &&
        Objects.equals(this.publicAppsDir, systemStorageConfig.publicAppsDir) &&
        Objects.equals(this.resource, systemStorageConfig.resource) &&
        Objects.equals(this.rootDir, systemStorageConfig.rootDir) &&
        Objects.equals(this.zone, systemStorageConfig.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, containerName, homeDir, host, port, mirror, protocol, publicAppsDir, resource, rootDir, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStorageConfig {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    homeDir: ").append(toIndentedString(homeDir)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicAppsDir: ").append(toIndentedString(publicAppsDir)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    rootDir: ").append(toIndentedString(rootDir)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

