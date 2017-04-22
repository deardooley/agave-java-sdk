package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Applications are a self-describing representation of an executable software item. See the &lt;a href&#x3D;\&quot;http://agaveapi.co/documentation/tutorials/app-management-tutorial/\&quot;&gt;App Management Tutorial&lt;/a&gt; for more information.
 */
@ApiModel(description = "Applications are a self-describing representation of an executable software item. See the <a href=\"http://agaveapi.co/documentation/tutorials/app-management-tutorial/\">App Management Tutorial</a> for more information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Application {
  @SerializedName("available")
  private String available = null;

  @SerializedName("checkpointable")
  private String checkpointable = null;

  @SerializedName("defaultMaxRunTime")
  private String defaultMaxRunTime = null;

  @SerializedName("defaultMemoryPerNode")
  private String defaultMemoryPerNode = null;

  @SerializedName("defaultNodeCount")
  private String defaultNodeCount = null;

  @SerializedName("defaultProcessorsPerNode")
  private String defaultProcessorsPerNode = null;

  @SerializedName("defaultQueue")
  private String defaultQueue = null;

  @SerializedName("deploymentPath")
  private String deploymentPath = null;

  @SerializedName("deploymentSystem")
  private String deploymentSystem = null;

  @SerializedName("executionSystem")
  private String executionSystem = null;

  @SerializedName("executionType")
  private String executionType = null;

  @SerializedName("helpURI")
  private String helpURI = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("inputs")
  private String inputs = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("lastModified")
  private String lastModified = null;

  @SerializedName("longDescription")
  private String longDescription = null;

  @SerializedName("modules")
  private String modules = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ontology")
  private String ontology = null;

  @SerializedName("outputs")
  private String outputs = null;

  @SerializedName("parallelism")
  private String parallelism = null;

  @SerializedName("parameters")
  private String parameters = null;

  @SerializedName("isPublic")
  private String isPublic = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("templatePath")
  private String templatePath = null;

  @SerializedName("testPath")
  private String testPath = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("version")
  private String version = null;

  public Application available(String available) {
    this.available = available;
    return this;
  }

   /**
   * Whether the application is available.
   * @return available
  **/
  @ApiModelProperty(required = true, value = "Whether the application is available.")
  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }

  public Application checkpointable(String checkpointable) {
    this.checkpointable = checkpointable;
    return this;
  }

   /**
   * Whether the application supports checkpointing.
   * @return checkpointable
  **/
  @ApiModelProperty(required = true, value = "Whether the application supports checkpointing.")
  public String getCheckpointable() {
    return checkpointable;
  }

  public void setCheckpointable(String checkpointable) {
    this.checkpointable = checkpointable;
  }

  public Application defaultMaxRunTime(String defaultMaxRunTime) {
    this.defaultMaxRunTime = defaultMaxRunTime;
    return this;
  }

   /**
   * The max execution time that should be used if none is given in a job description. Ignore if the system does not support schedulers.
   * @return defaultMaxRunTime
  **/
  @ApiModelProperty(required = true, value = "The max execution time that should be used if none is given in a job description. Ignore if the system does not support schedulers.")
  public String getDefaultMaxRunTime() {
    return defaultMaxRunTime;
  }

  public void setDefaultMaxRunTime(String defaultMaxRunTime) {
    this.defaultMaxRunTime = defaultMaxRunTime;
  }

  public Application defaultMemoryPerNode(String defaultMemoryPerNode) {
    this.defaultMemoryPerNode = defaultMemoryPerNode;
    return this;
  }

   /**
   * The default memory in GB to pass to the scheduler if none is given in the job description. This must be less than the max memory parameter in the target queue definition.
   * @return defaultMemoryPerNode
  **/
  @ApiModelProperty(required = true, value = "The default memory in GB to pass to the scheduler if none is given in the job description. This must be less than the max memory parameter in the target queue definition.")
  public String getDefaultMemoryPerNode() {
    return defaultMemoryPerNode;
  }

  public void setDefaultMemoryPerNode(String defaultMemoryPerNode) {
    this.defaultMemoryPerNode = defaultMemoryPerNode;
  }

  public Application defaultNodeCount(String defaultNodeCount) {
    this.defaultNodeCount = defaultNodeCount;
    return this;
  }

   /**
   * The number of nodes that should be used if none is given in a job description. Ignore if the system does not support schedulers.
   * @return defaultNodeCount
  **/
  @ApiModelProperty(required = true, value = "The number of nodes that should be used if none is given in a job description. Ignore if the system does not support schedulers.")
  public String getDefaultNodeCount() {
    return defaultNodeCount;
  }

  public void setDefaultNodeCount(String defaultNodeCount) {
    this.defaultNodeCount = defaultNodeCount;
  }

  public Application defaultProcessorsPerNode(String defaultProcessorsPerNode) {
    this.defaultProcessorsPerNode = defaultProcessorsPerNode;
    return this;
  }

   /**
   * The number of processors to pass to the scheduler if none are given in the job description. This must be 1 if the app is serial.
   * @return defaultProcessorsPerNode
  **/
  @ApiModelProperty(required = true, value = "The number of processors to pass to the scheduler if none are given in the job description. This must be 1 if the app is serial.")
  public String getDefaultProcessorsPerNode() {
    return defaultProcessorsPerNode;
  }

  public void setDefaultProcessorsPerNode(String defaultProcessorsPerNode) {
    this.defaultProcessorsPerNode = defaultProcessorsPerNode;
  }

  public Application defaultQueue(String defaultQueue) {
    this.defaultQueue = defaultQueue;
    return this;
  }

   /**
   * The queue on the execution system that should be used if none is given in a job description. Ignore if the system does not support schedulers.
   * @return defaultQueue
  **/
  @ApiModelProperty(required = true, value = "The queue on the execution system that should be used if none is given in a job description. Ignore if the system does not support schedulers.")
  public String getDefaultQueue() {
    return defaultQueue;
  }

  public void setDefaultQueue(String defaultQueue) {
    this.defaultQueue = defaultQueue;
  }

  public Application deploymentPath(String deploymentPath) {
    this.deploymentPath = deploymentPath;
    return this;
  }

   /**
   * The location in default storage system containing the application wrapper and dependencies of the user
   * @return deploymentPath
  **/
  @ApiModelProperty(required = true, value = "The location in default storage system containing the application wrapper and dependencies of the user")
  public String getDeploymentPath() {
    return deploymentPath;
  }

  public void setDeploymentPath(String deploymentPath) {
    this.deploymentPath = deploymentPath;
  }

  public Application deploymentSystem(String deploymentSystem) {
    this.deploymentSystem = deploymentSystem;
    return this;
  }

   /**
   * The system id of the storage system where this app should run.
   * @return deploymentSystem
  **/
  @ApiModelProperty(required = true, value = "The system id of the storage system where this app should run.")
  public String getDeploymentSystem() {
    return deploymentSystem;
  }

  public void setDeploymentSystem(String deploymentSystem) {
    this.deploymentSystem = deploymentSystem;
  }

  public Application executionSystem(String executionSystem) {
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

  public Application executionType(String executionType) {
    this.executionType = executionType;
    return this;
  }

   /**
   * The execution type of the application. If you're unsure, it's probably HPC.
   * @return executionType
  **/
  @ApiModelProperty(required = true, value = "The execution type of the application. If you're unsure, it's probably HPC.")
  public String getExecutionType() {
    return executionType;
  }

  public void setExecutionType(String executionType) {
    this.executionType = executionType;
  }

  public Application helpURI(String helpURI) {
    this.helpURI = helpURI;
    return this;
  }

   /**
   * The URL where users can go for more information about the app.
   * @return helpURI
  **/
  @ApiModelProperty(required = true, value = "The URL where users can go for more information about the app.")
  public String getHelpURI() {
    return helpURI;
  }

  public void setHelpURI(String helpURI) {
    this.helpURI = helpURI;
  }

  public Application id(String id) {
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

  public Application icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * The icon to associate with this app.
   * @return icon
  **/
  @ApiModelProperty(required = true, value = "The icon to associate with this app.")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Application inputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * The inputs files for this application. 
   * @return inputs
  **/
  @ApiModelProperty(required = true, value = "The inputs files for this application. ")
  public String getInputs() {
    return inputs;
  }

  public void setInputs(String inputs) {
    this.inputs = inputs;
  }

  public Application label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label to use when generating forms.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "The label to use when generating forms.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Application lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this application was last modified in ISO 8601 format.
   * @return lastModified
  **/
  @ApiModelProperty(required = true, value = "The date this application was last modified in ISO 8601 format.")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Application longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The full text description of this input to use when generating forms.
   * @return longDescription
  **/
  @ApiModelProperty(required = true, value = "The full text description of this input to use when generating forms.")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Application modules(String modules) {
    this.modules = modules;
    return this;
  }

   /**
   * An array of modules to load prior to the execution of the application.
   * @return modules
  **/
  @ApiModelProperty(required = true, value = "An array of modules to load prior to the execution of the application.")
  public String getModules() {
    return modules;
  }

  public void setModules(String modules) {
    this.modules = modules;
  }

  public Application name(String name) {
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

  public Application ontology(String ontology) {
    this.ontology = ontology;
    return this;
  }

   /**
   * An array of ontology values describing this application.
   * @return ontology
  **/
  @ApiModelProperty(required = true, value = "An array of ontology values describing this application.")
  public String getOntology() {
    return ontology;
  }

  public void setOntology(String ontology) {
    this.ontology = ontology;
  }

  public Application outputs(String outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * The outputs files for this application. 
   * @return outputs
  **/
  @ApiModelProperty(required = true, value = "The outputs files for this application. ")
  public String getOutputs() {
    return outputs;
  }

  public void setOutputs(String outputs) {
    this.outputs = outputs;
  }

  public Application parallelism(String parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * The parallelism type of the application. If you're unsure, it's probably SERIAL.
   * @return parallelism
  **/
  @ApiModelProperty(required = true, value = "The parallelism type of the application. If you're unsure, it's probably SERIAL.")
  public String getParallelism() {
    return parallelism;
  }

  public void setParallelism(String parallelism) {
    this.parallelism = parallelism;
  }

  public Application parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The inputs parameters for this application. 
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "The inputs parameters for this application. ")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public Application isPublic(String isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Whether the application is public or private.
   * @return isPublic
  **/
  @ApiModelProperty(required = true, value = "Whether the application is public or private.")
  public String getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(String isPublic) {
    this.isPublic = isPublic;
  }

  public Application revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The number of times this application has been revised.
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "The number of times this application has been revised.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public Application shortDescription(String shortDescription) {
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

  public Application tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * An array of tags related to this application.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "An array of tags related to this application.")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Application templatePath(String templatePath) {
    this.templatePath = templatePath;
    return this;
  }

   /**
   * The path to the wrapper script relative to the deploymentPath.
   * @return templatePath
  **/
  @ApiModelProperty(required = true, value = "The path to the wrapper script relative to the deploymentPath.")
  public String getTemplatePath() {
    return templatePath;
  }

  public void setTemplatePath(String templatePath) {
    this.templatePath = templatePath;
  }

  public Application testPath(String testPath) {
    this.testPath = testPath;
    return this;
  }

   /**
   * The path to the test script relative to the deploymentPath.
   * @return testPath
  **/
  @ApiModelProperty(required = true, value = "The path to the test script relative to the deploymentPath.")
  public String getTestPath() {
    return testPath;
  }

  public void setTestPath(String testPath) {
    this.testPath = testPath;
  }

  public Application uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID of this application. UUID are 36 alphanumeric string.
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "The UUID of this application. UUID are 36 alphanumeric string.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Application version(String version) {
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
    Application application = (Application) o;
    return Objects.equals(this.available, application.available) &&
        Objects.equals(this.checkpointable, application.checkpointable) &&
        Objects.equals(this.defaultMaxRunTime, application.defaultMaxRunTime) &&
        Objects.equals(this.defaultMemoryPerNode, application.defaultMemoryPerNode) &&
        Objects.equals(this.defaultNodeCount, application.defaultNodeCount) &&
        Objects.equals(this.defaultProcessorsPerNode, application.defaultProcessorsPerNode) &&
        Objects.equals(this.defaultQueue, application.defaultQueue) &&
        Objects.equals(this.deploymentPath, application.deploymentPath) &&
        Objects.equals(this.deploymentSystem, application.deploymentSystem) &&
        Objects.equals(this.executionSystem, application.executionSystem) &&
        Objects.equals(this.executionType, application.executionType) &&
        Objects.equals(this.helpURI, application.helpURI) &&
        Objects.equals(this.id, application.id) &&
        Objects.equals(this.icon, application.icon) &&
        Objects.equals(this.inputs, application.inputs) &&
        Objects.equals(this.label, application.label) &&
        Objects.equals(this.lastModified, application.lastModified) &&
        Objects.equals(this.longDescription, application.longDescription) &&
        Objects.equals(this.modules, application.modules) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.ontology, application.ontology) &&
        Objects.equals(this.outputs, application.outputs) &&
        Objects.equals(this.parallelism, application.parallelism) &&
        Objects.equals(this.parameters, application.parameters) &&
        Objects.equals(this.isPublic, application.isPublic) &&
        Objects.equals(this.revision, application.revision) &&
        Objects.equals(this.shortDescription, application.shortDescription) &&
        Objects.equals(this.tags, application.tags) &&
        Objects.equals(this.templatePath, application.templatePath) &&
        Objects.equals(this.testPath, application.testPath) &&
        Objects.equals(this.uuid, application.uuid) &&
        Objects.equals(this.version, application.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, checkpointable, defaultMaxRunTime, defaultMemoryPerNode, defaultNodeCount, defaultProcessorsPerNode, defaultQueue, deploymentPath, deploymentSystem, executionSystem, executionType, helpURI, id, icon, inputs, label, lastModified, longDescription, modules, name, ontology, outputs, parallelism, parameters, isPublic, revision, shortDescription, tags, templatePath, testPath, uuid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    checkpointable: ").append(toIndentedString(checkpointable)).append("\n");
    sb.append("    defaultMaxRunTime: ").append(toIndentedString(defaultMaxRunTime)).append("\n");
    sb.append("    defaultMemoryPerNode: ").append(toIndentedString(defaultMemoryPerNode)).append("\n");
    sb.append("    defaultNodeCount: ").append(toIndentedString(defaultNodeCount)).append("\n");
    sb.append("    defaultProcessorsPerNode: ").append(toIndentedString(defaultProcessorsPerNode)).append("\n");
    sb.append("    defaultQueue: ").append(toIndentedString(defaultQueue)).append("\n");
    sb.append("    deploymentPath: ").append(toIndentedString(deploymentPath)).append("\n");
    sb.append("    deploymentSystem: ").append(toIndentedString(deploymentSystem)).append("\n");
    sb.append("    executionSystem: ").append(toIndentedString(executionSystem)).append("\n");
    sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
    sb.append("    helpURI: ").append(toIndentedString(helpURI)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ontology: ").append(toIndentedString(ontology)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templatePath: ").append(toIndentedString(templatePath)).append("\n");
    sb.append("    testPath: ").append(toIndentedString(testPath)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

