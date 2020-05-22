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
    "bearishPercent",
    "bullishPercent"
})
public class Sentiment {

  @JsonProperty("bearishPercent")
  private Integer bearishPercent;
  @JsonProperty("bullishPercent")
  private Integer bullishPercent;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("bearishPercent")
  public Integer getBearishPercent() {
    return bearishPercent;
  }

  @JsonProperty("bearishPercent")
  public void setBearishPercent(Integer bearishPercent) {
    this.bearishPercent = bearishPercent;
  }

  @JsonProperty("bullishPercent")
  public Integer getBullishPercent() {
    return bullishPercent;
  }

  @JsonProperty("bullishPercent")
  public void setBullishPercent(Integer bullishPercent) {
    this.bullishPercent = bullishPercent;
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
