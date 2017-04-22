package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.TagResource;
import org.joda.time.DateTime;

/**
 * Base tag object
 */
@ApiModel(description = "Base tag object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Tag {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("resources")
  private List<TagResource> resources = new ArrayList<TagResource>();

  public Tag id(String id) {
    this.id = id;
    return this;
  }

   /**
   * uuid of this tag
   * @return id
  **/
  @ApiModelProperty(value = "uuid of this tag")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of tag
   * @return name
  **/
  @ApiModelProperty(value = "name of tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Date tag was created
   * @return created
  **/
  @ApiModelProperty(value = "Date tag was created")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Tag lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Date tag was last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Date tag was last updated")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Tag resources(List<TagResource> resources) {
    this.resources = resources;
    return this;
  }

  public Tag addResourcesItem(TagResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * The list of resource uuid associated with this tag
   * @return resources
  **/
  @ApiModelProperty(value = "The list of resource uuid associated with this tag")
  public List<TagResource> getResources() {
    return resources;
  }

  public void setResources(List<TagResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.created, tag.created) &&
        Objects.equals(this.lastUpdated, tag.lastUpdated) &&
        Objects.equals(this.resources, tag.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, created, lastUpdated, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

