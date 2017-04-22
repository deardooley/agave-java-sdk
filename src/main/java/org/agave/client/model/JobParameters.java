package org.agave.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobParameters
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class JobParameters {
  @SerializedName("parameter1")
  private String parameter1 = null;

  public JobParameters parameter1(String parameter1) {
    this.parameter1 = parameter1;
    return this;
  }

   /**
   * One or more parameters identified in the description of the app you're running. 
   * @return parameter1
  **/
  @ApiModelProperty(required = true, value = "One or more parameters identified in the description of the app you're running. ")
  public String getParameter1() {
    return parameter1;
  }

  public void setParameter1(String parameter1) {
    this.parameter1 = parameter1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobParameters jobParameters = (JobParameters) o;
    return Objects.equals(this.parameter1, jobParameters.parameter1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter1);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobParameters {\n");
    
    sb.append("    parameter1: ").append(toIndentedString(parameter1)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

