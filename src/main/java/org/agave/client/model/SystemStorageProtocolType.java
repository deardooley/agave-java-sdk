package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemStorageProtocolType
 */
public enum SystemStorageProtocolType {
  
  @SerializedName("FTP")
  FTP("FTP"),
  
  @SerializedName("GRIDFTP")
  GRIDFTP("GRIDFTP"),
  
  @SerializedName("IRODS")
  IRODS("IRODS"),
  
  @SerializedName("LOCAL")
  LOCAL("LOCAL"),
  
  @SerializedName("S3")
  S3("S3"),
  
  @SerializedName("SFTP")
  SFTP("SFTP");

  private String value;

  SystemStorageProtocolType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

