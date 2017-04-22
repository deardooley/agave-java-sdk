package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets term3
 */
public enum Term3 {
  
  @SerializedName("username")
  USERNAME("username"),
  
  @SerializedName("email")
  EMAIL("email"),
  
  @SerializedName("name")
  NAME("name"),
  
  @SerializedName("status")
  STATUS("status");

  private String value;

  Term3(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

