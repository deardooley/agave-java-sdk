package org.agave.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.agave.client.model.TransformDecoder;
import org.agave.client.model.TransformEncoder;

/**
 * Transform
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Transform {
  @SerializedName("decoders")
  private List<TransformDecoder> decoders = new ArrayList<TransformDecoder>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptionurl")
  private String descriptionurl = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("encoder")
  private TransformEncoder encoder = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  public Transform decoders(List<TransformDecoder> decoders) {
    this.decoders = decoders;
    return this;
  }

  public Transform addDecodersItem(TransformDecoder decodersItem) {
    this.decoders.add(decodersItem);
    return this;
  }

   /**
   * The available decoders for this transform.
   * @return decoders
  **/
  @ApiModelProperty(required = true, value = "The available decoders for this transform.")
  public List<TransformDecoder> getDecoders() {
    return decoders;
  }

  public void setDecoders(List<TransformDecoder> decoders) {
    this.decoders = decoders;
  }

  public Transform description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of this transform.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of this transform.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transform descriptionurl(String descriptionurl) {
    this.descriptionurl = descriptionurl;
    return this;
  }

   /**
   * The URL to find out more information.
   * @return descriptionurl
  **/
  @ApiModelProperty(required = true, value = "The URL to find out more information.")
  public String getDescriptionurl() {
    return descriptionurl;
  }

  public void setDescriptionurl(String descriptionurl) {
    this.descriptionurl = descriptionurl;
  }

  public Transform enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this transform is enabled or not.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Whether this transform is enabled or not.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Transform encoder(TransformEncoder encoder) {
    this.encoder = encoder;
    return this;
  }

   /**
   * Get encoder
   * @return encoder
  **/
  @ApiModelProperty(required = true, value = "")
  public TransformEncoder getEncoder() {
    return encoder;
  }

  public void setEncoder(TransformEncoder encoder) {
    this.encoder = encoder;
  }

  public Transform name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this transform.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this transform.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Transform tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Transform addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags describing this transform.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "The tags describing this transform.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transform transform = (Transform) o;
    return Objects.equals(this.decoders, transform.decoders) &&
        Objects.equals(this.description, transform.description) &&
        Objects.equals(this.descriptionurl, transform.descriptionurl) &&
        Objects.equals(this.enabled, transform.enabled) &&
        Objects.equals(this.encoder, transform.encoder) &&
        Objects.equals(this.name, transform.name) &&
        Objects.equals(this.tags, transform.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decoders, description, descriptionurl, enabled, encoder, name, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transform {\n");
    
    sb.append("    decoders: ").append(toIndentedString(decoders)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionurl: ").append(toIndentedString(descriptionurl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    encoder: ").append(toIndentedString(encoder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

