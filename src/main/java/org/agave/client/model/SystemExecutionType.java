package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemExecutionType
 */
public enum SystemExecutionType {
  
  @SerializedName("CLI")
  CLI("CLI"),
  
  @SerializedName("CONDOR")
  CONDOR("CONDOR"),
  
  @SerializedName("HPC")
  HPC("HPC");

  private String value;

  SystemExecutionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

