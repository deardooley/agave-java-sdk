package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * An abbreviated Application object returned in request in application collection queries
 */
@ApiModel(description = "An abbreviated Application object returned in request in application collection queries")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("executionSystem")
  private String executionSystem = null;

  @SerializedName("lastModified")
  private DateTime lastModified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isPublic")
  private Boolean isPublic = null;

  @SerializedName("revision")
  private Long revision = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("version")
  private String version = null;

  public ApplicationSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique id of this app. Comprised of the app name-version.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique id of this app. Comprised of the app name-version.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationSummary executionSystem(String executionSystem) {
    this.executionSystem = executionSystem;
    return this;
  }

   /**
   * The system id of the execution system where this app should run.
   * @return executionSystem
  **/
  @ApiModelProperty(required = true, value = "The system id of the execution system where this app should run.")
  public String getExecutionSystem() {
    return executionSystem;
  }

  public void setExecutionSystem(String executionSystem) {
    this.executionSystem = executionSystem;
  }

  public ApplicationSummary lastModified(DateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this application was last modified in ISO 8601 format.
   * @return lastModified
  **/
  @ApiModelProperty(required = true, value = "The date this application was last modified in ISO 8601 format.")
  public DateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTime lastModified) {
    this.lastModified = lastModified;
  }

  public ApplicationSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application. The name does not have to be unique, but the combination of name and version does.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application. The name does not have to be unique, but the combination of name and version does.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationSummary isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Whether the application is public or private.
   * @return isPublic
  **/
  @ApiModelProperty(required = true, value = "Whether the application is public or private.")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public ApplicationSummary revision(Long revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The number of times this application has been revised.
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "The number of times this application has been revised.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public ApplicationSummary shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The short description of this application.
   * @return shortDescription
  **/
  @ApiModelProperty(required = true, value = "The short description of this application.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ApplicationSummary version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSummary applicationSummary = (ApplicationSummary) o;
    return Objects.equals(this.id, applicationSummary.id) &&
        Objects.equals(this.executionSystem, applicationSummary.executionSystem) &&
        Objects.equals(this.lastModified, applicationSummary.lastModified) &&
        Objects.equals(this.name, applicationSummary.name) &&
        Objects.equals(this.isPublic, applicationSummary.isPublic) &&
        Objects.equals(this.revision, applicationSummary.revision) &&
        Objects.equals(this.shortDescription, applicationSummary.shortDescription) &&
        Objects.equals(this.version, applicationSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, executionSystem, lastModified, name, isPublic, revision, shortDescription, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    executionSystem: ").append(toIndentedString(executionSystem)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

