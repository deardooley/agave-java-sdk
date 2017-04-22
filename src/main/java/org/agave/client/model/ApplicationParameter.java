package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ApplicationArgument;
import org.agave.client.model.ApplicationArgumentDetails;
import org.agave.client.model.ApplicationArgumentSemantics;
import org.agave.client.model.ApplicationArgumentValue;

import io.swagger.annotations.ApiModel;

/**
 * App parameters define the command-line arguments (flags, arguments, etc.) needed by your wrapper script in order to properly run your application code. &lt;a href&#x3D;\&quot;http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-parameters\&quot;&gt;Read more.&lt;/a&gt;
 */
@ApiModel(description = "App parameters define the command-line arguments (flags, arguments, etc.) needed by your wrapper script in order to properly run your application code. <a href=\"http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-parameters\">Read more.</a>")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationParameter extends ApplicationArgument {

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
    sb.append("class ApplicationParameter {\n");
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

