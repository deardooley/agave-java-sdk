package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This represents a rollup of a data transfer operation.
 */
@ApiModel(description = "This represents a rollup of a data transfer operation.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class TransferTaskProgressSummary {
  @SerializedName("averageRate")
  private Long averageRate = 0l;

  @SerializedName("source")
  private String source = null;

  @SerializedName("totalActiveTransfers")
  private Long totalActiveTransfers = 0l;

  @SerializedName("totalBytes")
  private Long totalBytes = 0l;

  @SerializedName("totalBytesTransferred")
  private Long totalBytesTransferred = 0l;

  @SerializedName("totalFiles")
  private Long totalFiles = 0l;

  @SerializedName("uuid")
  private String uuid = null;

  public TransferTaskProgressSummary averageRate(Long averageRate) {
    this.averageRate = averageRate;
    return this;
  }

   /**
   * Average transfer rate in bytes/sec
   * @return averageRate
  **/
  @ApiModelProperty(required = true, value = "Average transfer rate in bytes/sec")
  public Long getAverageRate() {
    return averageRate;
  }

  public void setAverageRate(Long averageRate) {
    this.averageRate = averageRate;
  }

  public TransferTaskProgressSummary source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source URL of the transfer operation
   * @return source
  **/
  @ApiModelProperty(required = true, value = "The source URL of the transfer operation")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TransferTaskProgressSummary totalActiveTransfers(Long totalActiveTransfers) {
    this.totalActiveTransfers = totalActiveTransfers;
    return this;
  }

   /**
   * The number of concurrent transfers behind this transfer task
   * @return totalActiveTransfers
  **/
  @ApiModelProperty(required = true, value = "The number of concurrent transfers behind this transfer task")
  public Long getTotalActiveTransfers() {
    return totalActiveTransfers;
  }

  public void setTotalActiveTransfers(Long totalActiveTransfers) {
    this.totalActiveTransfers = totalActiveTransfers;
  }

  public TransferTaskProgressSummary totalBytes(Long totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }

   /**
   * The total number of bytes to be transferred
   * @return totalBytes
  **/
  @ApiModelProperty(required = true, value = "The total number of bytes to be transferred")
  public Long getTotalBytes() {
    return totalBytes;
  }

  public void setTotalBytes(Long totalBytes) {
    this.totalBytes = totalBytes;
  }

  public TransferTaskProgressSummary totalBytesTransferred(Long totalBytesTransferred) {
    this.totalBytesTransferred = totalBytesTransferred;
    return this;
  }

   /**
   * The total number of bytes transferred thus far
   * @return totalBytesTransferred
  **/
  @ApiModelProperty(required = true, value = "The total number of bytes transferred thus far")
  public Long getTotalBytesTransferred() {
    return totalBytesTransferred;
  }

  public void setTotalBytesTransferred(Long totalBytesTransferred) {
    this.totalBytesTransferred = totalBytesTransferred;
  }

  public TransferTaskProgressSummary totalFiles(Long totalFiles) {
    this.totalFiles = totalFiles;
    return this;
  }

   /**
   * The total number of files transferred to date
   * @return totalFiles
  **/
  @ApiModelProperty(required = true, value = "The total number of files transferred to date")
  public Long getTotalFiles() {
    return totalFiles;
  }

  public void setTotalFiles(Long totalFiles) {
    this.totalFiles = totalFiles;
  }

  public TransferTaskProgressSummary uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The id of the transfer task associated with this object
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "The id of the transfer task associated with this object")
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
    TransferTaskProgressSummary transferTaskProgressSummary = (TransferTaskProgressSummary) o;
    return Objects.equals(this.averageRate, transferTaskProgressSummary.averageRate) &&
        Objects.equals(this.source, transferTaskProgressSummary.source) &&
        Objects.equals(this.totalActiveTransfers, transferTaskProgressSummary.totalActiveTransfers) &&
        Objects.equals(this.totalBytes, transferTaskProgressSummary.totalBytes) &&
        Objects.equals(this.totalBytesTransferred, transferTaskProgressSummary.totalBytesTransferred) &&
        Objects.equals(this.totalFiles, transferTaskProgressSummary.totalFiles) &&
        Objects.equals(this.uuid, transferTaskProgressSummary.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageRate, source, totalActiveTransfers, totalBytes, totalBytesTransferred, totalFiles, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferTaskProgressSummary {\n");
    
    sb.append("    averageRate: ").append(toIndentedString(averageRate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    totalActiveTransfers: ").append(toIndentedString(totalActiveTransfers)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
    sb.append("    totalBytesTransferred: ").append(toIndentedString(totalBytesTransferred)).append("\n");
    sb.append("    totalFiles: ").append(toIndentedString(totalFiles)).append("\n");
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

