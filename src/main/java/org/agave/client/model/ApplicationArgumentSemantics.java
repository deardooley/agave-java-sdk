package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes the semantic definition of this input/output and the filetypes it represents. Multiple ontologies and values are supported. &lt;a href&#x3D;\&quot;http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-outputs\&quot;&gt;Read more.&lt;/a&gt;
 */
@ApiModel(description = "Describes the semantic definition of this input/output and the filetypes it represents. Multiple ontologies and values are supported. <a href=\"http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-outputs\">Read more.</a>")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationArgumentSemantics {
  @SerializedName("fileTypes")
  private List<String> fileTypes = new ArrayList<String>();

  @SerializedName("maxCardinality")
  private Long maxCardinality = null;

  @SerializedName("minCardinality")
  private Long minCardinality = null;

  @SerializedName("ontology")
  private List<String> ontology = new ArrayList<String>();

  public ApplicationArgumentSemantics fileTypes(List<String> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  public ApplicationArgumentSemantics addFileTypesItem(String fileTypesItem) {
    this.fileTypes.add(fileTypesItem);
    return this;
  }

   /**
   * The file types acceptable for this output.
   * @return fileTypes
  **/
  @ApiModelProperty(required = true, value = "The file types acceptable for this output.")
  public List<String> getFileTypes() {
    return fileTypes;
  }

  public void setFileTypes(List<String> fileTypes) {
    this.fileTypes = fileTypes;
  }

  public ApplicationArgumentSemantics maxCardinality(Long maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

   /**
   * The maximum number of times this output may appear.
   * @return maxCardinality
  **/
  @ApiModelProperty(required = true, value = "The maximum number of times this output may appear.")
  public Long getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Long maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public ApplicationArgumentSemantics minCardinality(Long minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

   /**
   * The minimum number of times this output may appear. -1 is unlimited
   * @return minCardinality
  **/
  @ApiModelProperty(required = true, value = "The minimum number of times this output may appear. -1 is unlimited")
  public Long getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Long minCardinality) {
    this.minCardinality = minCardinality;
  }

  public ApplicationArgumentSemantics ontology(List<String> ontology) {
    this.ontology = ontology;
    return this;
  }

  public ApplicationArgumentSemantics addOntologyItem(String ontologyItem) {
    this.ontology.add(ontologyItem);
    return this;
  }

   /**
   * Get ontology
   * @return ontology
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getOntology() {
    return ontology;
  }

  public void setOntology(List<String> ontology) {
    this.ontology = ontology;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationArgumentSemantics applicationArgumentSemantics = (ApplicationArgumentSemantics) o;
    return Objects.equals(this.fileTypes, applicationArgumentSemantics.fileTypes) &&
        Objects.equals(this.maxCardinality, applicationArgumentSemantics.maxCardinality) &&
        Objects.equals(this.minCardinality, applicationArgumentSemantics.minCardinality) &&
        Objects.equals(this.ontology, applicationArgumentSemantics.ontology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes, maxCardinality, minCardinality, ontology);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationArgumentSemantics {\n");
    
    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    ontology: ").append(toIndentedString(ontology)).append("\n");
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

