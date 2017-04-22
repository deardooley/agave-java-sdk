package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets AuthenticationType
 */
public enum AuthenticationType {
  
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
  X509("X509"),
  
  @SerializedName("ANONYMOUS")
  ANONYMOUS("ANONYMOUS");

  private String value;

  AuthenticationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

