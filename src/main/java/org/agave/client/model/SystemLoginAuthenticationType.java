package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets SystemLoginAuthenticationType
 */
public enum SystemLoginAuthenticationType {
  
  @SerializedName("APIKEYS")
  APIKEYS("APIKEYS"),
  
  @SerializedName("LOCAL")
  LOCAL("LOCAL"),
  
  @SerializedName("PAM")
  PAM("PAM"),
  
  @SerializedName("PASSWORD")
  PASSWORD("PASSWORD"),
  
  @SerializedName("SSHKEYS")
  SSHKEYS("SSHKEYS"),
  
  @SerializedName("TOKEN")
  TOKEN("TOKEN"),
  
  @SerializedName("X509")
  X509("X509");

  private String value;

  SystemLoginAuthenticationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

