package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Tag object without resource list
 */
@ApiModel(description = "Tag object without resource list")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TagSummary {
  @SerializedName("name")
  private String name = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  public TagSummary name(String name) {
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

  public TagSummary created(DateTime created) {
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

  public TagSummary lastUpdated(DateTime lastUpdated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSummary tagSummary = (TagSummary) o;
    return Objects.equals(this.name, tagSummary.name) &&
        Objects.equals(this.created, tagSummary.created) &&
        Objects.equals(this.lastUpdated, tagSummary.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, created, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

