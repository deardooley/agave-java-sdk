package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets ApplicationParallelism
 */
public enum ApplicationParallelism {
  
  @SerializedName("PARALLEL")
  PARALLEL("PARALLEL"),
  
  @SerializedName("PTHREAD")
  PTHREAD("PTHREAD"),
  
  @SerializedName("SERIAL")
  SERIAL("SERIAL");

  private String value;

  ApplicationParallelism(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

