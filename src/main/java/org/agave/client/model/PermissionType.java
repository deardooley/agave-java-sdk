package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets PermissionType
 */
public enum PermissionType {
  
  @SerializedName("ALL")
  ALL("ALL"),
  
  @SerializedName("EXECUTE")
  EXECUTE("EXECUTE"),
  
  @SerializedName("NONE")
  NONE("NONE"),
  
  @SerializedName("READ")
  READ("READ"),
  
  @SerializedName("READ_EXECUTE")
  READ_EXECUTE("READ_EXECUTE"),
  
  @SerializedName("READ_WRITE")
  READ_WRITE("READ_WRITE"),
  
  @SerializedName("WRITE")
  WRITE("WRITE"),
  
  @SerializedName("WRITE_EXECUTE")
  WRITE_EXECUTE("WRITE_EXECUTE");

  private String value;

  PermissionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

