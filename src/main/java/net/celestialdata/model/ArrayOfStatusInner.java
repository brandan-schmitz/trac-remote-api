package net.celestialdata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ArrayOfStatusInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-24T00:01:04.004Z[GMT]")
public class ArrayOfStatusInner   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("running")
  private Boolean running = null;

  public ArrayOfStatusInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Lazy River", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayOfStatusInner running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfStatusInner arrayOfStatusInner = (ArrayOfStatusInner) o;
    return Objects.equals(this.name, arrayOfStatusInner.name) &&
        Objects.equals(this.running, arrayOfStatusInner.running);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, running);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfStatusInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
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
