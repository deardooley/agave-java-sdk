package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemCredentialType
 */
public enum SystemCredentialType {
  
  @SerializedName("LOGIN")
  LOGIN("LOGIN"),
  
  @SerializedName("STORAGE")
  STORAGE("STORAGE");

  private String value;

  SystemCredentialType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

