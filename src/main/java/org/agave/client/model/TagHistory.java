package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Individual tag event
 */
@ApiModel(description = "Individual tag event")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TagHistory {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("event")
  private String event = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  public TagHistory created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * uuid of the referenced resource
   * @return created
  **/
  @ApiModelProperty(value = "uuid of the referenced resource")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public TagHistory event(String event) {
    this.event = event;
    return this;
  }

   /**
   * event that occurred on this tag
   * @return event
  **/
  @ApiModelProperty(value = "event that occurred on this tag")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public TagHistory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the event which occurred
   * @return description
  **/
  @ApiModelProperty(value = "description of the event which occurred")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TagHistory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique identifier of the event
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier of the event")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagHistory tagHistory = (TagHistory) o;
    return Objects.equals(this.created, tagHistory.created) &&
        Objects.equals(this.event, tagHistory.event) &&
        Objects.equals(this.description, tagHistory.description) &&
        Objects.equals(this.id, tagHistory.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, event, description, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagHistory {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

