package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets BatchSchedulerType
 */
public enum BatchSchedulerType {
  
  @SerializedName("COBALT")
  COBALT("COBALT"),
  
  @SerializedName("CONDOR")
  CONDOR("CONDOR"),
  
  @SerializedName("FORK")
  FORK("FORK"),
  
  @SerializedName("LOADLEVELER")
  LOADLEVELER("LOADLEVELER"),
  
  @SerializedName("LSF")
  LSF("LSF"),
  
  @SerializedName("MOAB")
  MOAB("MOAB"),
  
  @SerializedName("PBS")
  PBS("PBS"),
  
  @SerializedName("SGE")
  SGE("SGE"),
  
  @SerializedName("SLURM")
  SLURM("SLURM"),
  
  @SerializedName("TORQUE")
  TORQUE("TORQUE"),
  
  @SerializedName("UNKNOWN")
  UNKNOWN("UNKNOWN");

  private String value;

  BatchSchedulerType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

