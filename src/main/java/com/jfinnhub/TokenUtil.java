package com.jfinnhub;

/**
 * Token Utility
 */
public class TokenUtil {

  public static final String TOKEN = "finnhub_token";

  private TokenUtil() {
  }

  /**
   * Get Token from Property finnhub_token
   *
   * @return String
   */
  public static String getToken() {
    return System.getProperty(TOKEN);
  }
}
