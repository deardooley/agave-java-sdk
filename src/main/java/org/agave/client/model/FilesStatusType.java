package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets FilesStatusType
 */
public enum FilesStatusType {
  
  @SerializedName("PREPROCESSING")
  PREPROCESSING("PREPROCESSING"),
  
  @SerializedName("STAGING_QUEUED")
  STAGING_QUEUED("STAGING_QUEUED"),
  
  @SerializedName("STAGING")
  STAGING("STAGING"),
  
  @SerializedName("STAGING_COMPLETED")
  STAGING_COMPLETED("STAGING_COMPLETED"),
  
  @SerializedName("STAGING_FAILED")
  STAGING_FAILED("STAGING_FAILED"),
  
  @SerializedName("TRANSFORMING_QUEUED")
  TRANSFORMING_QUEUED("TRANSFORMING_QUEUED"),
  
  @SerializedName("TRANSFORMING")
  TRANSFORMING("TRANSFORMING"),
  
  @SerializedName("TRANSFORMING_FAILED")
  TRANSFORMING_FAILED("TRANSFORMING_FAILED"),
  
  @SerializedName("TRANSFORMING_COMPLETED")
  TRANSFORMING_COMPLETED("TRANSFORMING_COMPLETED");

  private String value;

  FilesStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

