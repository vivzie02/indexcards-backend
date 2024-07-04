package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for User
 */
@Schema(description = "Model for User")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-27T14:18:57.858700547Z[GMT]")


public class User   {
  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("experienceLevel")
  private Integer experienceLevel = null;

  @JsonProperty("points")
  private Integer points = null;

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   **/
  @Schema(example = "Max Mustermann", description = "")
      @NotNull

    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User experienceLevel(Integer experienceLevel) {
    this.experienceLevel = experienceLevel;
    return this;
  }

  /**
   * Get experienceLevel
   * @return experienceLevel
   **/
  @Schema(example = "0", description = "")
      @NotNull

    public Integer getExperienceLevel() {
    return experienceLevel;
  }

  public void setExperienceLevel(Integer experienceLevel) {
    this.experienceLevel = experienceLevel;
  }

  public User points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   **/
  @Schema(example = "0", description = "")
      @NotNull

    public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.experienceLevel, user.experienceLevel) &&
        Objects.equals(this.points, user.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, experienceLevel, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    experienceLevel: ").append(toIndentedString(experienceLevel)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
