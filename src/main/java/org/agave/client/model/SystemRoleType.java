package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemRoleType
 */
public enum SystemRoleType {
  
  @SerializedName("GUEST")
  GUEST("GUEST"),
  
  @SerializedName("USER")
  USER("USER"),
  
  @SerializedName("PUBLISHER")
  PUBLISHER("PUBLISHER"),
  
  @SerializedName("ADMIN")
  ADMIN("ADMIN"),
  
  @SerializedName("OWNER")
  OWNER("OWNER");

  private String value;

  SystemRoleType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

