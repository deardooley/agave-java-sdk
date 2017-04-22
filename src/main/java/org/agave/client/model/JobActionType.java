package org.agave.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * The type of action to perform on a job.
 */
public enum JobActionType {
  
  @SerializedName("RESUBMIT")
  RESUBMIT("RESUBMIT"),
  
  @SerializedName("STOP")
  STOP("STOP");

  private String value;

  JobActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

