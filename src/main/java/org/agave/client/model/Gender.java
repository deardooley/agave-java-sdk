package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets Gender
 */
public enum Gender {
  
  @SerializedName("male")
  MALE("male"),
  
  @SerializedName("female")
  FEMALE("female");

  private String value;

  Gender(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

