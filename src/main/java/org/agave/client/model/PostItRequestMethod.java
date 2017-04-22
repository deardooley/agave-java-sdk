package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets PostItRequestMethod
 */
public enum PostItRequestMethod {
  
  @SerializedName("GET")
  GET("GET"),
  
  @SerializedName("PUT")
  PUT("PUT"),
  
  @SerializedName("POST")
  POST("POST"),
  
  @SerializedName("DELETE")
  DELETE("DELETE");

  private String value;

  PostItRequestMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

