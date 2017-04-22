package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemType
 */
public enum SystemType {
  
  @SerializedName("STORAGE")
  STORAGE("STORAGE"),
  
  @SerializedName("EXECUTION")
  EXECUTION("EXECUTION");

  private String value;

  SystemType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

