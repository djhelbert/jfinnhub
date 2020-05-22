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
    "symbol",
    "datetime",
    "headline",
    "description"
})
public class MajorDevelopment {

  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("datetime")
  private String datetime;
  @JsonProperty("headline")
  private String headline;
  @JsonProperty("description")
  private String description;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  @JsonProperty("symbol")
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  @JsonProperty("datetime")
  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  @JsonProperty("headline")
  public String getHeadline() {
    return headline;
  }

  @JsonProperty("headline")
  public void setHeadline(String headline) {
    this.headline = headline;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
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
