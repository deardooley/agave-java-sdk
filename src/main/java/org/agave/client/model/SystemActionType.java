package org.agave.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * The actions available on a system.
 */
public enum SystemActionType {
  
  @SerializedName("PUBLISH")
  PUBLISH("PUBLISH"),
  
  @SerializedName("UNPUBLISH")
  UNPUBLISH("UNPUBLISH"),
  
  @SerializedName("SETDEFAULT")
  SETDEFAULT("SETDEFAULT"),
  
  @SerializedName("UNSETDEFAULT")
  UNSETDEFAULT("UNSETDEFAULT"),
  
  @SerializedName("SETGLOBALDEFAULT")
  SETGLOBALDEFAULT("SETGLOBALDEFAULT"),
  
  @SerializedName("UNSETGLOBALDEFAULT")
  UNSETGLOBALDEFAULT("UNSETGLOBALDEFAULT"),
  
  @SerializedName("CLONE")
  CLONE("CLONE");

  private String value;

  SystemActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

