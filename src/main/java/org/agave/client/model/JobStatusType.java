package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets JobStatusType
 */
public enum JobStatusType {
  
  @SerializedName("PENDING")
  PENDING("PENDING"),
  
  @SerializedName("STAGING_INPUTS")
  STAGING_INPUTS("STAGING_INPUTS"),
  
  @SerializedName("CLEANING_UP")
  CLEANING_UP("CLEANING_UP"),
  
  @SerializedName("ARCHIVING")
  ARCHIVING("ARCHIVING"),
  
  @SerializedName("STAGING_JOB")
  STAGING_JOB("STAGING_JOB"),
  
  @SerializedName("FINISHED")
  FINISHED("FINISHED"),
  
  @SerializedName("KILLED")
  KILLED("KILLED"),
  
  @SerializedName("FAILED")
  FAILED("FAILED"),
  
  @SerializedName("STOPPED")
  STOPPED("STOPPED"),
  
  @SerializedName("RUNNING")
  RUNNING("RUNNING"),
  
  @SerializedName("PAUSED")
  PAUSED("PAUSED"),
  
  @SerializedName("QUEUED")
  QUEUED("QUEUED"),
  
  @SerializedName("SUBMITTING")
  SUBMITTING("SUBMITTING"),
  
  @SerializedName("STAGED")
  STAGED("STAGED"),
  
  @SerializedName("PROCESSING_INPUTS")
  PROCESSING_INPUTS("PROCESSING_INPUTS"),
  
  @SerializedName("ARCHIVING_FINISHED")
  ARCHIVING_FINISHED("ARCHIVING_FINISHED"),
  
  @SerializedName("ARCHIVING_FAILED")
  ARCHIVING_FAILED("ARCHIVING_FAILED"),
  
  @SerializedName("HEARTBEAT")
  HEARTBEAT("HEARTBEAT");

  private String value;

  JobStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

