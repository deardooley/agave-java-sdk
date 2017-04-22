package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets ApplicationExecutionType
 */
public enum ApplicationExecutionType {
  
  @SerializedName("HPC")
  HPC("HPC"),
  
  @SerializedName("CONDOR")
  CONDOR("CONDOR"),
  
  @SerializedName("CLI")
  CLI("CLI");

  private String value;

  ApplicationExecutionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

