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
    "address",
    "city",
    "country",
    "currency",
    "cusip",
    "sedol",
    "description",
    "employeeTotal",
    "exchange",
    "ggroup",
    "gind",
    "gsector",
    "gsubind",
    "ipo",
    "isin",
    "marketCapitalization",
    "naics",
    "naicsNationalIndustry",
    "naicsSector",
    "naicsSubsector",
    "name",
    "phone",
    "shareOutstanding",
    "state",
    "ticker",
    "weburl",
    "logo",
    "finnhubIndustry"
})
public class CompanyProfile {

  @JsonProperty("address")
  private String address;
  @JsonProperty("city")
  private String city;
  @JsonProperty("country")
  private String country;
  @JsonProperty("currency")
  private String currency;
  @JsonProperty("cusip")
  private String cusip;
  @JsonProperty("sedol")
  private String sedol;
  @JsonProperty("description")
  private String description;
  @JsonProperty("employeeTotal")
  private String employeeTotal;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("ggroup")
  private String ggroup;
  @JsonProperty("gind")
  private String gind;
  @JsonProperty("gsector")
  private String gsector;
  @JsonProperty("gsubind")
  private String gsubind;
  @JsonProperty("ipo")
  private String ipo;
  @JsonProperty("isin")
  private String isin;
  @JsonProperty("marketCapitalization")
  private Integer marketCapitalization;
  @JsonProperty("naics")
  private String naics;
  @JsonProperty("naicsNationalIndustry")
  private String naicsNationalIndustry;
  @JsonProperty("naicsSector")
  private String naicsSector;
  @JsonProperty("naicsSubsector")
  private String naicsSubsector;
  @JsonProperty("name")
  private String name;
  @JsonProperty("phone")
  private String phone;
  @JsonProperty("shareOutstanding")
  private Double shareOutstanding;
  @JsonProperty("state")
  private String state;
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

  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(String address) {
    this.address = address;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

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

  @JsonProperty("cusip")
  public String getCusip() {
    return cusip;
  }

  @JsonProperty("cusip")
  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  @JsonProperty("sedol")
  public String getSedol() {
    return sedol;
  }

  @JsonProperty("sedol")
  public void setSedol(String sedol) {
    this.sedol = sedol;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("employeeTotal")
  public String getEmployeeTotal() {
    return employeeTotal;
  }

  @JsonProperty("employeeTotal")
  public void setEmployeeTotal(String employeeTotal) {
    this.employeeTotal = employeeTotal;
  }

  @JsonProperty("exchange")
  public String getExchange() {
    return exchange;
  }

  @JsonProperty("exchange")
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  @JsonProperty("ggroup")
  public String getGgroup() {
    return ggroup;
  }

  @JsonProperty("ggroup")
  public void setGgroup(String ggroup) {
    this.ggroup = ggroup;
  }

  @JsonProperty("gind")
  public String getGind() {
    return gind;
  }

  @JsonProperty("gind")
  public void setGind(String gind) {
    this.gind = gind;
  }

  @JsonProperty("gsector")
  public String getGsector() {
    return gsector;
  }

  @JsonProperty("gsector")
  public void setGsector(String gsector) {
    this.gsector = gsector;
  }

  @JsonProperty("gsubind")
  public String getGsubind() {
    return gsubind;
  }

  @JsonProperty("gsubind")
  public void setGsubind(String gsubind) {
    this.gsubind = gsubind;
  }

  @JsonProperty("ipo")
  public String getIpo() {
    return ipo;
  }

  @JsonProperty("ipo")
  public void setIpo(String ipo) {
    this.ipo = ipo;
  }

  @JsonProperty("isin")
  public String getIsin() {
    return isin;
  }

  @JsonProperty("isin")
  public void setIsin(String isin) {
    this.isin = isin;
  }

  @JsonProperty("marketCapitalization")
  public Integer getMarketCapitalization() {
    return marketCapitalization;
  }

  @JsonProperty("marketCapitalization")
  public void setMarketCapitalization(Integer marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
  }

  @JsonProperty("naics")
  public String getNaics() {
    return naics;
  }

  @JsonProperty("naics")
  public void setNaics(String naics) {
    this.naics = naics;
  }

  @JsonProperty("naicsNationalIndustry")
  public String getNaicsNationalIndustry() {
    return naicsNationalIndustry;
  }

  @JsonProperty("naicsNationalIndustry")
  public void setNaicsNationalIndustry(String naicsNationalIndustry) {
    this.naicsNationalIndustry = naicsNationalIndustry;
  }

  @JsonProperty("naicsSector")
  public String getNaicsSector() {
    return naicsSector;
  }

  @JsonProperty("naicsSector")
  public void setNaicsSector(String naicsSector) {
    this.naicsSector = naicsSector;
  }

  @JsonProperty("naicsSubsector")
  public String getNaicsSubsector() {
    return naicsSubsector;
  }

  @JsonProperty("naicsSubsector")
  public void setNaicsSubsector(String naicsSubsector) {
    this.naicsSubsector = naicsSubsector;
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

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
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
