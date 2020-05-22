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
    "name",
    "share",
    "turnover",
    "turnoverPercent",
    "change",
    "filingDate",
    "portfolioPercent"
})
public class Ownership {

  @JsonProperty("name")
  private String name;
  @JsonProperty("share")
  private Integer share;
  @JsonProperty("turnover")
  private String turnover;
  @JsonProperty("turnoverPercent")
  private Double turnoverPercent;
  @JsonProperty("change")
  private Integer change;
  @JsonProperty("filingDate")
  private String filingDate;
  @JsonProperty("portfolioPercent")
  private Double portfolioPercent;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("share")
  public Integer getShare() {
    return share;
  }

  @JsonProperty("share")
  public void setShare(Integer share) {
    this.share = share;
  }

  @JsonProperty("turnover")
  public String getTurnover() {
    return turnover;
  }

  @JsonProperty("turnover")
  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }

  @JsonProperty("turnoverPercent")
  public Double getTurnoverPercent() {
    return turnoverPercent;
  }

  @JsonProperty("turnoverPercent")
  public void setTurnoverPercent(Double turnoverPercent) {
    this.turnoverPercent = turnoverPercent;
  }

  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  @JsonProperty("change")
  public void setChange(Integer change) {
    this.change = change;
  }

  @JsonProperty("filingDate")
  public String getFilingDate() {
    return filingDate;
  }

  @JsonProperty("filingDate")
  public void setFilingDate(String filingDate) {
    this.filingDate = filingDate;
  }

  @JsonProperty("portfolioPercent")
  public Double getPortfolioPercent() {
    return portfolioPercent;
  }

  @JsonProperty("portfolioPercent")
  public void setPortfolioPercent(Double portfolioPercent) {
    this.portfolioPercent = portfolioPercent;
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
