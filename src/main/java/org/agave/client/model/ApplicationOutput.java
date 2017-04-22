package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ApplicationArgument;
import org.agave.client.model.ApplicationArgumentDetails;
import org.agave.client.model.ApplicationArgumentSemantics;
import org.agave.client.model.ApplicationArgumentValue;

import io.swagger.annotations.ApiModel;

/**
 * In addition to describing the inputs and parameters that your wrapper script requires, it is often helpful to provide the expected outputs when running your app. This is the purpose of the outputs attribute. App outputs specify an array of JSON objects describing the data that should be present when your app completes. It is entirely optional and provided, at this point in time, for reference purpose only.  &lt;a href&#x3D;\&quot;http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-outputs\&quot;&gt;Read more.&lt;/a&gt;
 */
@ApiModel(description = "In addition to describing the inputs and parameters that your wrapper script requires, it is often helpful to provide the expected outputs when running your app. This is the purpose of the outputs attribute. App outputs specify an array of JSON objects describing the data that should be present when your app completes. It is entirely optional and provided, at this point in time, for reference purpose only.  <a href=\"http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-outputs\">Read more.</a>")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationOutput extends ApplicationArgument {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

