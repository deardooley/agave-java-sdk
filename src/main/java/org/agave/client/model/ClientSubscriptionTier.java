package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets ClientSubscriptionTier
 */
public enum ClientSubscriptionTier {
  
  @SerializedName("BRONZE")
  BRONZE("BRONZE"),
  
  @SerializedName("GOLD")
  GOLD("GOLD"),
  
  @SerializedName("SILVER")
  SILVER("SILVER"),
  
  @SerializedName("UNLIMITED")
  UNLIMITED("UNLIMITED");

  private String value;

  ClientSubscriptionTier(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

