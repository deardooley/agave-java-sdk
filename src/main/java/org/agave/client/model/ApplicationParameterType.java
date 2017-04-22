package org.agave.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * The primary type of the application
 */
public enum ApplicationParameterType {
  
  @SerializedName("STRING")
  STRING("STRING"),
  
  @SerializedName("NUMBER")
  NUMBER("NUMBER"),
  
  @SerializedName("BOOL")
  BOOL("BOOL"),
  
  @SerializedName("FLAG")
  FLAG("FLAG");

  private String value;

  ApplicationParameterType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

