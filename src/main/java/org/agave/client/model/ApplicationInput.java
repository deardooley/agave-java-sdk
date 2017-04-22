package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.ApplicationArgument;
import org.agave.client.model.ApplicationArgumentDetails;
import org.agave.client.model.ApplicationArgumentSemantics;
import org.agave.client.model.ApplicationArgumentValue;

import io.swagger.annotations.ApiModel;

/**
 * App inputs describe data inputs supported by your app. Each input can represent one or more files or folders. Inptus can be optional or required and may physically reside anywhere accessible using any of the data protocols supported by Agave.  &lt;a href&#x3D;\&quot;http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-inputs\&quot;&gt;Read more.&lt;/a&gt;
 */
@ApiModel(description = "App inputs describe data inputs supported by your app. Each input can represent one or more files or folders. Inptus can be optional or required and may physically reside anywhere accessible using any of the data protocols supported by Agave.  <a href=\"http://agaveapi.co/documentation/tutorials/app-management-tutorial/#app-inputs\">Read more.</a>")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class ApplicationInput extends ApplicationArgument {

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
    sb.append("class ApplicationInput {\n");
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

