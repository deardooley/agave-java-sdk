package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets ApplicationActionType
 */
public enum ApplicationActionType {
  
  @SerializedName("CLONE")
  CLONE("CLONE"),
  
  @SerializedName("PUBLISH")
  PUBLISH("PUBLISH"),
  
  @SerializedName("UNPUBLISH")
  UNPUBLISH("UNPUBLISH"),
  
  @SerializedName("ENABLE")
  ENABLE("ENABLE"),
  
  @SerializedName("DISABLE")
  DISABLE("DISABLE");

  private String value;

  ApplicationActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

