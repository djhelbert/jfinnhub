package com.jfinnhub.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "majorDevelopment",
    "symbol"
})
public class MajorDevelopments {

  @JsonProperty("majorDevelopment")
  private List<MajorDevelopment> majorDevelopment = null;
  @JsonProperty("symbol")
  private String symbol;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("majorDevelopment")
  public List<MajorDevelopment> getMajorDevelopment() {
    return majorDevelopment;
  }

  @JsonProperty("majorDevelopment")
  public void setMajorDevelopment(List<MajorDevelopment> majorDevelopment) {
    this.majorDevelopment = majorDevelopment;
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