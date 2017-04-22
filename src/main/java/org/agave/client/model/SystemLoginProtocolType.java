package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemLoginProtocolType
 */
public enum SystemLoginProtocolType {
  
  @SerializedName("GSISSH")
  GSISSH("GSISSH"),
  
  @SerializedName("SSH")
  SSH("SSH"),
  
  @SerializedName("LOCAL")
  LOCAL("LOCAL");

  private String value;

  SystemLoginProtocolType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

