package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for a collection of index-cards
 */
@Schema(description = "Model for a collection of index-cards")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-27T14:18:57.858700547Z[GMT]")


public class Collections   {
  @JsonProperty("collectionId")
  private UUID collectionId = null;

  @JsonProperty("userId")
  private UUID userId = null;

  @JsonProperty("collectionName")
  private String collectionName = null;

  @JsonProperty("numberOfCards")
  private Integer numberOfCards = null;

  public Collections collectionId(UUID collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * Get collectionId
   * @return collectionId
   **/
  @Schema(example = "9666e8bf-6f37-44d1-aab4-f2faaf6da243", description = "")
      @NotNull

    @Valid
    public UUID getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }

  public Collections userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "9666e8bf-6f37-44d1-aab4-f2faaf6da243", description = "")
      @NotNull

    @Valid
    public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Collections collectionName(String collectionName) {
    this.collectionName = collectionName;
    return this;
  }

  /**
   * Get collectionName
   * @return collectionName
   **/
  @Schema(example = "Geography", description = "")
      @NotNull

    public String getCollectionName() {
    return collectionName;
  }

  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }

  public Collections numberOfCards(Integer numberOfCards) {
    this.numberOfCards = numberOfCards;
    return this;
  }

  /**
   * Get numberOfCards
   * @return numberOfCards
   **/
  @Schema(example = "20", description = "")
      @NotNull

    public Integer getNumberOfCards() {
    return numberOfCards;
  }

  public void setNumberOfCards(Integer numberOfCards) {
    this.numberOfCards = numberOfCards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collections collections = (Collections) o;
    return Objects.equals(this.collectionId, collections.collectionId) &&
        Objects.equals(this.userId, collections.userId) &&
        Objects.equals(this.collectionName, collections.collectionName) &&
        Objects.equals(this.numberOfCards, collections.numberOfCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, userId, collectionName, numberOfCards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collections {\n");
    
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
    sb.append("    numberOfCards: ").append(toIndentedString(numberOfCards)).append("\n");
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
