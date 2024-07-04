package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model for the index cards
 */
@Schema(description = "Model for the index cards")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-27T14:18:57.858700547Z[GMT]")


public class IndexCard   {
  @JsonProperty("cardId")
  private UUID cardId = null;

  @JsonProperty("collectionId")
  private UUID collectionId = null;

  @JsonProperty("frontSide")
  private String frontSide = null;

  /**
   * Gets or Sets frontFormat
   */
  public enum FrontFormatEnum {
    LATIN("latin"),
    
    HIRAGANA("hiragana"),
    
    KATAKANA("katakana"),
    
    KANJI("kanji");

    private String value;

    FrontFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrontFormatEnum fromValue(String text) {
      for (FrontFormatEnum b : FrontFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("frontFormat")
  private FrontFormatEnum frontFormat = null;

  @JsonProperty("backSide")
  private String backSide = null;

  /**
   * Gets or Sets backFormat
   */
  public enum BackFormatEnum {
    LATIN("latin"),
    
    HIRAGANA("hiragana"),
    
    KATAKANA("katakana"),
    
    KANJI("kanji");

    private String value;

    BackFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BackFormatEnum fromValue(String text) {
      for (BackFormatEnum b : BackFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("backFormat")
  private BackFormatEnum backFormat = null;

  public IndexCard cardId(UUID cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
   **/
  @Schema(example = "9666e8bf-6f37-44d1-aab4-f2faaf6da243", description = "")
      @NotNull

    @Valid
    public UUID getCardId() {
    return cardId;
  }

  public void setCardId(UUID cardId) {
    this.cardId = cardId;
  }

  public IndexCard collectionId(UUID collectionId) {
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

  public IndexCard frontSide(String frontSide) {
    this.frontSide = frontSide;
    return this;
  }

  /**
   * Get frontSide
   * @return frontSide
   **/
  @Schema(example = "What is the capital of Portugal?", description = "")
      @NotNull

    public String getFrontSide() {
    return frontSide;
  }

  public void setFrontSide(String frontSide) {
    this.frontSide = frontSide;
  }

  public IndexCard frontFormat(FrontFormatEnum frontFormat) {
    this.frontFormat = frontFormat;
    return this;
  }

  /**
   * Get frontFormat
   * @return frontFormat
   **/
  @Schema(example = "latin", description = "")
      @NotNull

    public FrontFormatEnum getFrontFormat() {
    return frontFormat;
  }

  public void setFrontFormat(FrontFormatEnum frontFormat) {
    this.frontFormat = frontFormat;
  }

  public IndexCard backSide(String backSide) {
    this.backSide = backSide;
    return this;
  }

  /**
   * Get backSide
   * @return backSide
   **/
  @Schema(example = "Lisbon", description = "")
      @NotNull

    public String getBackSide() {
    return backSide;
  }

  public void setBackSide(String backSide) {
    this.backSide = backSide;
  }

  public IndexCard backFormat(BackFormatEnum backFormat) {
    this.backFormat = backFormat;
    return this;
  }

  /**
   * Get backFormat
   * @return backFormat
   **/
  @Schema(example = "latin", description = "")
      @NotNull

    public BackFormatEnum getBackFormat() {
    return backFormat;
  }

  public void setBackFormat(BackFormatEnum backFormat) {
    this.backFormat = backFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexCard indexCard = (IndexCard) o;
    return Objects.equals(this.cardId, indexCard.cardId) &&
        Objects.equals(this.collectionId, indexCard.collectionId) &&
        Objects.equals(this.frontSide, indexCard.frontSide) &&
        Objects.equals(this.frontFormat, indexCard.frontFormat) &&
        Objects.equals(this.backSide, indexCard.backSide) &&
        Objects.equals(this.backFormat, indexCard.backFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, collectionId, frontSide, frontFormat, backSide, backFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexCard {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    frontSide: ").append(toIndentedString(frontSide)).append("\n");
    sb.append("    frontFormat: ").append(toIndentedString(frontFormat)).append("\n");
    sb.append("    backSide: ").append(toIndentedString(backSide)).append("\n");
    sb.append("    backFormat: ").append(toIndentedString(backFormat)).append("\n");
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
