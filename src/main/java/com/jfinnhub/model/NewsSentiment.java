package com.jfinnhub.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "buzz",
    "companyNewsScore",
    "sectorAverageBullishPercent",
    "sectorAverageNewsScore",
    "sentiment",
    "symbol"
})
public class NewsSentiment {

  @JsonProperty("buzz")
  private Buzz buzz;
  @JsonProperty("companyNewsScore")
  private Double companyNewsScore;
  @JsonProperty("sectorAverageBullishPercent")
  private Double sectorAverageBullishPercent;
  @JsonProperty("sectorAverageNewsScore")
  private Double sectorAverageNewsScore;
  @JsonProperty("sentiment")
  private Sentiment sentiment;
  @JsonProperty("symbol")
  private String symbol;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("buzz")
  public Buzz getBuzz() {
    return buzz;
  }

  @JsonProperty("buzz")
  public void setBuzz(Buzz buzz) {
    this.buzz = buzz;
  }

  @JsonProperty("companyNewsScore")
  public Double getCompanyNewsScore() {
    return companyNewsScore;
  }

  @JsonProperty("companyNewsScore")
  public void setCompanyNewsScore(Double companyNewsScore) {
    this.companyNewsScore = companyNewsScore;
  }

  @JsonProperty("sectorAverageBullishPercent")
  public Double getSectorAverageBullishPercent() {
    return sectorAverageBullishPercent;
  }

  @JsonProperty("sectorAverageBullishPercent")
  public void setSectorAverageBullishPercent(Double sectorAverageBullishPercent) {
    this.sectorAverageBullishPercent = sectorAverageBullishPercent;
  }

  @JsonProperty("sectorAverageNewsScore")
  public Double getSectorAverageNewsScore() {
    return sectorAverageNewsScore;
  }

  @JsonProperty("sectorAverageNewsScore")
  public void setSectorAverageNewsScore(Double sectorAverageNewsScore) {
    this.sectorAverageNewsScore = sectorAverageNewsScore;
  }

  @JsonProperty("sentiment")
  public Sentiment getSentiment() {
    return sentiment;
  }

  @JsonProperty("sentiment")
  public void setSentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
  }

  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  @JsonProperty("symbol")
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
