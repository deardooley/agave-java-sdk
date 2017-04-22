package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets FileManagementActionType
 */
public enum FileManagementActionType {
  
  @SerializedName("MKDIR")
  MKDIR("MKDIR"),
  
  @SerializedName("RENAME")
  RENAME("RENAME"),
  
  @SerializedName("COPY")
  COPY("COPY"),
  
  @SerializedName("MOVE")
  MOVE("MOVE");

  private String value;

  FileManagementActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

