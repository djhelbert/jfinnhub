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
    "category",
    "datetime",
    "headline",
    "id",
    "image",
    "related",
    "source",
    "summary",
    "url"
})
public class GeneralNews {

  @JsonProperty("category")
  private String category;
  @JsonProperty("datetime")
  private Integer datetime;
  @JsonProperty("headline")
  private String headline;
  @JsonProperty("id")
  private Integer id;
  @JsonProperty("image")
  private String image;
  @JsonProperty("related")
  private String related;
  @JsonProperty("source")
  private String source;
  @JsonProperty("summary")
  private String summary;
  @JsonProperty("url")
  private String url;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(String category) {
    this.category = category;
  }

  @JsonProperty("datetime")
  public Integer getDatetime() {
    return datetime;
  }

  @JsonProperty("datetime")
  public void setDatetime(Integer datetime) {
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

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  @JsonProperty("image")
  public void setImage(String image) {
    this.image = image;
  }

  @JsonProperty("related")
  public String getRelated() {
    return related;
  }

  @JsonProperty("related")
  public void setRelated(String related) {
    this.related = related;
  }

  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(String source) {
    this.source = source;
  }

  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  @JsonProperty("summary")
  public void setSummary(String summary) {
    this.summary = summary;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
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
