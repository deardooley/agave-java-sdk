package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Metadata
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Metadata {
  @SerializedName("associationIds")
  private List<String> associationIds = new ArrayList<String>();

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("value")
  private String value = null;

  public Metadata associationIds(List<String> associationIds) {
    this.associationIds = associationIds;
    return this;
  }

  public Metadata addAssociationIdsItem(String associationIdsItem) {
    this.associationIds.add(associationIdsItem);
    return this;
  }

   /**
   * UUIDs of associated Agave entities, including the Data to which this Metadata belongs.
   * @return associationIds
  **/
  @ApiModelProperty(required = true, value = "UUIDs of associated Agave entities, including the Data to which this Metadata belongs.")
  public List<String> getAssociationIds() {
    return associationIds;
  }

  public void setAssociationIds(List<String> associationIds) {
    this.associationIds = associationIds;
  }

  public Metadata created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * A timestamp indicating when this Metadata was created in the metadata store.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "A timestamp indicating when this Metadata was created in the metadata store.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Metadata internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * The name of the Internal User, if any, who owns this metadata.
   * @return internalUsername
  **/
  @ApiModelProperty(required = true, value = "The name of the Internal User, if any, who owns this metadata.")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public Metadata lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * A timestamp indicating when this Metadata was last updated in the metadata store.
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "A timestamp indicating when this Metadata was last updated in the metadata store.")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Metadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this metadata
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this metadata")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Metadata owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The API user who owns this Metadata.
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "The API user who owns this Metadata.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Metadata uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID for this Metadata.
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "The UUID for this Metadata.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Metadata value(String value) {
    this.value = value;
    return this;
  }

   /**
   * A free text or JSON string containing the metadata stored for the given associationIds
   * @return value
  **/
  @ApiModelProperty(required = true, value = "A free text or JSON string containing the metadata stored for the given associationIds")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.associationIds, metadata.associationIds) &&
        Objects.equals(this.created, metadata.created) &&
        Objects.equals(this.internalUsername, metadata.internalUsername) &&
        Objects.equals(this.lastUpdated, metadata.lastUpdated) &&
        Objects.equals(this.name, metadata.name) &&
        Objects.equals(this.owner, metadata.owner) &&
        Objects.equals(this.uuid, metadata.uuid) &&
        Objects.equals(this.value, metadata.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationIds, created, internalUsername, lastUpdated, name, owner, uuid, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    associationIds: ").append(toIndentedString(associationIds)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

