package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets ClientAPISubscriptionStatusType
 */
public enum ClientAPISubscriptionStatusType {
  
  @SerializedName("CREATED")
  CREATED("CREATED"),
  
  @SerializedName("PROTOTYPED")
  PROTOTYPED("PROTOTYPED"),
  
  @SerializedName("PUBLISHED")
  PUBLISHED("PUBLISHED"),
  
  @SerializedName("DEPRECATED")
  DEPRECATED("DEPRECATED"),
  
  @SerializedName("RETIRED")
  RETIRED("RETIRED"),
  
  @SerializedName("BLOCKED")
  BLOCKED("BLOCKED");

  private String value;

  ClientAPISubscriptionStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

