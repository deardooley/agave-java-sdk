package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets term
 */
public enum Term {
  
  @SerializedName("username")
  USERNAME("username"),
  
  @SerializedName("email")
  EMAIL("email"),
  
  @SerializedName("name")
  NAME("name");

  private String value;

  Term(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

