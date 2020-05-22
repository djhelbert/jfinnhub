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
    "metric",
    "metricType",
    "symbol"
})
public class Metrics {

  @JsonProperty("metric")
  private Metric metric;
  @JsonProperty("metricType")
  private String metricType;
  @JsonProperty("symbol")
  private String symbol;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("metric")
  public Metric getMetric() {
    return metric;
  }

  @JsonProperty("metric")
  public void setMetric(Metric metric) {
    this.metric = metric;
  }

  @JsonProperty("metricType")
  public String getMetricType() {
    return metricType;
  }

  @JsonProperty("metricType")
  public void setMetricType(String metricType) {
    this.metricType = metricType;
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
