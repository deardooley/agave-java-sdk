package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * MetadataSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class MetadataSchema {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("internalUsername")
  private String internalUsername = null;

  @SerializedName("lastUpdated")
  private DateTime lastUpdated = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("schema")
  private String schema = null;

  @SerializedName("uuid")
  private String uuid = null;

  public MetadataSchema created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * A timestamp indicating when this Metadata was created in the metadata schema store.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "A timestamp indicating when this Metadata was created in the metadata schema store.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public MetadataSchema internalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
    return this;
  }

   /**
   * The name of the Internal User, if any, who owns this schema.
   * @return internalUsername
  **/
  @ApiModelProperty(required = true, value = "The name of the Internal User, if any, who owns this schema.")
  public String getInternalUsername() {
    return internalUsername;
  }

  public void setInternalUsername(String internalUsername) {
    this.internalUsername = internalUsername;
  }

  public MetadataSchema lastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * A timestamp indicating when this Metadata was last updated in the metadata schema store.
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "A timestamp indicating when this Metadata was last updated in the metadata schema store.")
  public DateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(DateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public MetadataSchema owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The API user who owns this Schema.
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "The API user who owns this Schema.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public MetadataSchema schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * A JSON Schema
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "A JSON Schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public MetadataSchema uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID for this Schema.
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "The UUID for this Schema.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataSchema metadataSchema = (MetadataSchema) o;
    return Objects.equals(this.created, metadataSchema.created) &&
        Objects.equals(this.internalUsername, metadataSchema.internalUsername) &&
        Objects.equals(this.lastUpdated, metadataSchema.lastUpdated) &&
        Objects.equals(this.owner, metadataSchema.owner) &&
        Objects.equals(this.schema, metadataSchema.schema) &&
        Objects.equals(this.uuid, metadataSchema.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, internalUsername, lastUpdated, owner, schema, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSchema {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    internalUsername: ").append(toIndentedString(internalUsername)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

