package com.jfinnhub;

/**
 * Constants
 */
public class Endpoint {

  public static final String FINNHUB_API_V1 = "https://finnhub.io/api/v1";
  public static final String COMP_PROFILE = FINNHUB_API_V1 + "/stock/profile?symbol=%s&token=%s";
  public static final String PROFILE = FINNHUB_API_V1 + "/stock/profile2?symbol=%s&token=%s";
  public static final String QUOTE = FINNHUB_API_V1 + "/stock/quote?symbol=%s&token=%s";
  public static final String GEN_NEWS = FINNHUB_API_V1 + "/news?category=general&token=%s";
  public static final String MAJOR_DEV = FINNHUB_API_V1 + "/major-devlopment?symbol=%s&token=%s";
  public static final String NEWS_SENTIMENT = FINNHUB_API_V1 + "/news-sentiment?symbol=%s&token=%s";
  public static final String METRICS = FINNHUB_API_V1 + "/metric?symbol=%s&token=%s&metric=%s";

  private Endpoint() {
  }

  public static String companyProfile(String symbol, String token) {
    return String.format(COMP_PROFILE, symbol, token);
  }

  public static String profile(String symbol, String token) {
    return String.format(PROFILE, symbol, token);
  }

  public static String quote(String symbol, String token) {
    return String.format(QUOTE, symbol, token);
  }

  public static String generalNews(String token) {
    return String.format(GEN_NEWS, token);
  }

  public static String majorDevelopments(String symbol, String token) {
    return String.format(MAJOR_DEV, symbol, token);
  }

  public static String newsSentiment(String symbol, String token) {
    return String.format(NEWS_SENTIMENT, symbol, token);
  }

  public static String metrics(String symbol, String token, String metric) {
    return String.format(METRICS, symbol, token, metric);
  }
}
