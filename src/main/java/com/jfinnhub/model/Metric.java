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
    "freeOperatingCashFlow/revenue5Y",
    "freeOperatingCashFlow/revenueTTM",
    "grossMargin5Y",
    "grossMarginAnnual",
    "grossMarginTTM",
    "netProfitMargin%Annual",
    "netProfitMargin5Y",
    "netProfitMarginTTM",
    "operatingMargin5Y",
    "operatingMarginAnnual",
    "operatingMarginTTM",
    "pretaxMargin5Y",
    "pretaxMarginAnnual",
    "pretaxMarginTTM"
})
public class Metric {

  @JsonProperty("freeOperatingCashFlow/revenue5Y")
  private Double freeOperatingCashFlowRevenue5Y;
  @JsonProperty("freeOperatingCashFlow/revenueTTM")
  private Double freeOperatingCashFlowRevenueTTM;
  @JsonProperty("grossMargin5Y")
  private Double grossMargin5Y;
  @JsonProperty("grossMarginAnnual")
  private Double grossMarginAnnual;
  @JsonProperty("grossMarginTTM")
  private Double grossMarginTTM;
  @JsonProperty("netProfitMargin%Annual")
  private Double netProfitMarginAnnual;
  @JsonProperty("netProfitMargin5Y")
  private Double netProfitMargin5Y;
  @JsonProperty("netProfitMarginTTM")
  private Double netProfitMarginTTM;
  @JsonProperty("operatingMargin5Y")
  private Double operatingMargin5Y;
  @JsonProperty("operatingMarginAnnual")
  private Double operatingMarginAnnual;
  @JsonProperty("operatingMarginTTM")
  private Double operatingMarginTTM;
  @JsonProperty("pretaxMargin5Y")
  private Double pretaxMargin5Y;
  @JsonProperty("pretaxMarginAnnual")
  private Double pretaxMarginAnnual;
  @JsonProperty("pretaxMarginTTM")
  private Double pretaxMarginTTM;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("freeOperatingCashFlow/revenue5Y")
  public Double getFreeOperatingCashFlowRevenue5Y() {
    return freeOperatingCashFlowRevenue5Y;
  }

  @JsonProperty("freeOperatingCashFlow/revenue5Y")
  public void setFreeOperatingCashFlowRevenue5Y(Double freeOperatingCashFlowRevenue5Y) {
    this.freeOperatingCashFlowRevenue5Y = freeOperatingCashFlowRevenue5Y;
  }

  @JsonProperty("freeOperatingCashFlow/revenueTTM")
  public Double getFreeOperatingCashFlowRevenueTTM() {
    return freeOperatingCashFlowRevenueTTM;
  }

  @JsonProperty("freeOperatingCashFlow/revenueTTM")
  public void setFreeOperatingCashFlowRevenueTTM(Double freeOperatingCashFlowRevenueTTM) {
    this.freeOperatingCashFlowRevenueTTM = freeOperatingCashFlowRevenueTTM;
  }

  @JsonProperty("grossMargin5Y")
  public Double getGrossMargin5Y() {
    return grossMargin5Y;
  }

  @JsonProperty("grossMargin5Y")
  public void setGrossMargin5Y(Double grossMargin5Y) {
    this.grossMargin5Y = grossMargin5Y;
  }

  @JsonProperty("grossMarginAnnual")
  public Double getGrossMarginAnnual() {
    return grossMarginAnnual;
  }

  @JsonProperty("grossMarginAnnual")
  public void setGrossMarginAnnual(Double grossMarginAnnual) {
    this.grossMarginAnnual = grossMarginAnnual;
  }

  @JsonProperty("grossMarginTTM")
  public Double getGrossMarginTTM() {
    return grossMarginTTM;
  }

  @JsonProperty("grossMarginTTM")
  public void setGrossMarginTTM(Double grossMarginTTM) {
    this.grossMarginTTM = grossMarginTTM;
  }

  @JsonProperty("netProfitMargin%Annual")
  public Double getNetProfitMarginAnnual() {
    return netProfitMarginAnnual;
  }

  @JsonProperty("netProfitMargin%Annual")
  public void setNetProfitMarginAnnual(Double netProfitMarginAnnual) {
    this.netProfitMarginAnnual = netProfitMarginAnnual;
  }

  @JsonProperty("netProfitMargin5Y")
  public Double getNetProfitMargin5Y() {
    return netProfitMargin5Y;
  }

  @JsonProperty("netProfitMargin5Y")
  public void setNetProfitMargin5Y(Double netProfitMargin5Y) {
    this.netProfitMargin5Y = netProfitMargin5Y;
  }

  @JsonProperty("netProfitMarginTTM")
  public Double getNetProfitMarginTTM() {
    return netProfitMarginTTM;
  }

  @JsonProperty("netProfitMarginTTM")
  public void setNetProfitMarginTTM(Double netProfitMarginTTM) {
    this.netProfitMarginTTM = netProfitMarginTTM;
  }

  @JsonProperty("operatingMargin5Y")
  public Double getOperatingMargin5Y() {
    return operatingMargin5Y;
  }

  @JsonProperty("operatingMargin5Y")
  public void setOperatingMargin5Y(Double operatingMargin5Y) {
    this.operatingMargin5Y = operatingMargin5Y;
  }

  @JsonProperty("operatingMarginAnnual")
  public Double getOperatingMarginAnnual() {
    return operatingMarginAnnual;
  }

  @JsonProperty("operatingMarginAnnual")
  public void setOperatingMarginAnnual(Double operatingMarginAnnual) {
    this.operatingMarginAnnual = operatingMarginAnnual;
  }

  @JsonProperty("operatingMarginTTM")
  public Double getOperatingMarginTTM() {
    return operatingMarginTTM;
  }

  @JsonProperty("operatingMarginTTM")
  public void setOperatingMarginTTM(Double operatingMarginTTM) {
    this.operatingMarginTTM = operatingMarginTTM;
  }

  @JsonProperty("pretaxMargin5Y")
  public Double getPretaxMargin5Y() {
    return pretaxMargin5Y;
  }

  @JsonProperty("pretaxMargin5Y")
  public void setPretaxMargin5Y(Double pretaxMargin5Y) {
    this.pretaxMargin5Y = pretaxMargin5Y;
  }

  @JsonProperty("pretaxMarginAnnual")
  public Double getPretaxMarginAnnual() {
    return pretaxMarginAnnual;
  }

  @JsonProperty("pretaxMarginAnnual")
  public void setPretaxMarginAnnual(Double pretaxMarginAnnual) {
    this.pretaxMarginAnnual = pretaxMarginAnnual;
  }

  @JsonProperty("pretaxMarginTTM")
  public Double getPretaxMarginTTM() {
    return pretaxMarginTTM;
  }

  @JsonProperty("pretaxMarginTTM")
  public void setPretaxMarginTTM(Double pretaxMarginTTM) {
    this.pretaxMarginTTM = pretaxMarginTTM;
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
