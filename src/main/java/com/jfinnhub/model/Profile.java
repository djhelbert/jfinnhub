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
    "country",
    "currency",
    "exchange",
    "ipo",
    "marketCapitalization",
    "name",
    "phone",
    "shareOutstanding",
    "ticker",
    "weburl",
    "logo",
    "finnhubIndustry"
})
public class Profile {

  @JsonProperty("country")
  private String country;
  @JsonProperty("currency")
  private String currency;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("ipo")
  private String ipo;
  @JsonProperty("marketCapitalization")
  private Integer marketCapitalization;
  @JsonProperty("name")
  private String name;
  @JsonProperty("phone")
  private String phone;
  @JsonProperty("shareOutstanding")
  private Double shareOutstanding;
  @JsonProperty("ticker")
  private String ticker;
  @JsonProperty("weburl")
  private String weburl;
  @JsonProperty("logo")
  private String logo;
  @JsonProperty("finnhubIndustry")
  private String finnhubIndustry;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @JsonProperty("exchange")
  public String getExchange() {
    return exchange;
  }

  @JsonProperty("exchange")
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  @JsonProperty("ipo")
  public String getIpo() {
    return ipo;
  }

  @JsonProperty("ipo")
  public void setIpo(String ipo) {
    this.ipo = ipo;
  }

  @JsonProperty("marketCapitalization")
  public Integer getMarketCapitalization() {
    return marketCapitalization;
  }

  @JsonProperty("marketCapitalization")
  public void setMarketCapitalization(Integer marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  @JsonProperty("phone")
  public void setPhone(String phone) {
    this.phone = phone;
  }

  @JsonProperty("shareOutstanding")
  public Double getShareOutstanding() {
    return shareOutstanding;
  }

  @JsonProperty("shareOutstanding")
  public void setShareOutstanding(Double shareOutstanding) {
    this.shareOutstanding = shareOutstanding;
  }

  @JsonProperty("ticker")
  public String getTicker() {
    return ticker;
  }

  @JsonProperty("ticker")
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  @JsonProperty("weburl")
  public String getWeburl() {
    return weburl;
  }

  @JsonProperty("weburl")
  public void setWeburl(String weburl) {
    this.weburl = weburl;
  }

  @JsonProperty("logo")
  public String getLogo() {
    return logo;
  }

  @JsonProperty("logo")
  public void setLogo(String logo) {
    this.logo = logo;
  }

  @JsonProperty("finnhubIndustry")
  public String getFinnhubIndustry() {
    return finnhubIndustry;
  }

  @JsonProperty("finnhubIndustry")
  public void setFinnhubIndustry(String finnhubIndustry) {
    this.finnhubIndustry = finnhubIndustry;
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
