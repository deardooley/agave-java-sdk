package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemAuthConfigServerProtocolType
 */
public enum SystemAuthConfigServerProtocolType {
  
  @SerializedName("MYPROXY")
  MYPROXY("MYPROXY"),
  
  @SerializedName("MPG")
  MPG("MPG");

  private String value;

  SystemAuthConfigServerProtocolType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

