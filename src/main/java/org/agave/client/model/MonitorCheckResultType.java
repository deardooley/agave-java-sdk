package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets MonitorCheckResultType
 */
public enum MonitorCheckResultType {
  
  @SerializedName("FAILED")
  FAILED("FAILED"),
  
  @SerializedName("PASSED")
  PASSED("PASSED"),
  
  @SerializedName("UNKNOWN")
  UNKNOWN("UNKNOWN");

  private String value;

  MonitorCheckResultType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

