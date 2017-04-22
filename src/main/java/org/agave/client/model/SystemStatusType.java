package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemStatusType
 */
public enum SystemStatusType {
  
  @SerializedName("UP")
  UP("UP"),
  
  @SerializedName("DOWN")
  DOWN("DOWN"),
  
  @SerializedName("UNKNOWN")
  UNKNOWN("UNKNOWN");

  private String value;

  SystemStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

