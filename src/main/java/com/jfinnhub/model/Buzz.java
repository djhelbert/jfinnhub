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
    "articlesInLastWeek",
    "buzz",
    "weeklyAverage"
})
public class Buzz {

  @JsonProperty("articlesInLastWeek")
  private Integer articlesInLastWeek;
  @JsonProperty("buzz")
  private Double buzz;
  @JsonProperty("weeklyAverage")
  private Double weeklyAverage;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("articlesInLastWeek")
  public Integer getArticlesInLastWeek() {
    return articlesInLastWeek;
  }

  @JsonProperty("articlesInLastWeek")
  public void setArticlesInLastWeek(Integer articlesInLastWeek) {
    this.articlesInLastWeek = articlesInLastWeek;
  }

  @JsonProperty("buzz")
  public Double getBuzz() {
    return buzz;
  }

  @JsonProperty("buzz")
  public void setBuzz(Double buzz) {
    this.buzz = buzz;
  }

  @JsonProperty("weeklyAverage")
  public Double getWeeklyAverage() {
    return weeklyAverage;
  }

  @JsonProperty("weeklyAverage")
  public void setWeeklyAverage(Double weeklyAverage) {
    this.weeklyAverage = weeklyAverage;
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
