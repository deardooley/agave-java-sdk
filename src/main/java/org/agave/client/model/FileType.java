package org.agave.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * The type of the remote file/folder
 */
public enum FileType {
  
  @SerializedName("FILE")
  FILE("FILE"),
  
  @SerializedName("DIR")
  DIR("DIR"),
  
  @SerializedName("UNKNOWN")
  UNKNOWN("UNKNOWN");

  private String value;

  FileType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

