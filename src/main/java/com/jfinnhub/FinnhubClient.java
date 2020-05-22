package com.jfinnhub;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfinnhub.model.CompanyProfile;
import com.jfinnhub.model.GeneralNews;
import com.jfinnhub.model.MajorDevelopments;
import com.jfinnhub.model.NewsSentiment;
import com.jfinnhub.model.Profile;
import com.jfinnhub.model.Quote;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinnhubClient {

  private static final CloseableHttpClient client = HttpClients.createDefault();
  private static final ObjectMapper objectMapper = new ObjectMapper();
  private static final String token = TokenUtil.getToken();
  private static final Logger logger = LoggerFactory.getLogger(FinnhubClient.class);

  private final StringResponseHandler handler = new StringResponseHandler();

  private HttpEntity entity(String content) throws UnsupportedEncodingException {
    HttpEntity entity = new StringEntity(content);
    return entity;
  }

  private HttpPost post(String endpoint, HttpEntity entity) {
    final HttpPost post = new HttpPost(endpoint);
    post.setEntity(entity);

    return post;
  }

  private HttpGet get(String endpoint) {
    logger.info(endpoint);
    return new HttpGet(endpoint);
  }

  public String getNewsSentimentAsString(String symbol) throws IOException {
    return client.execute(get(Endpoint.newsSentiment(symbol, token)), handler);
  }

  public NewsSentiment getNewsSentiment(String symbol) throws IOException {
    return objectMapper.readValue(getNewsSentimentAsString(symbol), NewsSentiment.class);
  }

  public String getMajorDevelopmentsAsString(String symbol) throws IOException {
    return client.execute(get(Endpoint.majorDevelopments(symbol, token)), handler);
  }

  public MajorDevelopments getMajorDevelopments(String symbol) throws IOException {
    return objectMapper.readValue(getMajorDevelopmentsAsString(symbol), MajorDevelopments.class);
  }

  public String getGeneralNewsAsString() throws IOException {
    return client.execute(get(Endpoint.generalNews(token)), handler);
  }

  public List<GeneralNews> getGeneralNews() throws IOException {
    return objectMapper.readValue(getGeneralNewsAsString(), new TypeReference<List<GeneralNews>>() {
    });
  }

  public String getProfileAsString(String symbol) throws IOException {
    return client.execute(get(Endpoint.profile(symbol, token)), handler);
  }

  public Profile getProfile(String symbol) throws IOException {
    return objectMapper.readValue(getProfileAsString(symbol), Profile.class);
  }

  public String getCompanyProfileAsString(String symbol) throws IOException {
    return client.execute(get(Endpoint.companyProfile(symbol, token)), handler);
  }

  public CompanyProfile getCompanyProfile(String symbol) throws IOException {
    return objectMapper.readValue(getCompanyProfileAsString(symbol), CompanyProfile.class);
  }

  public String getQuoteAsString(String symbol) throws IOException {
    return client.execute(get(Endpoint.quote(symbol, token)), handler);
  }

  public Quote getQuote(String symbol) throws IOException {
    return objectMapper.readValue(getQuoteAsString(symbol), Quote.class);
  }

  class StringResponseHandler implements ResponseHandler<String> {

    public String handleResponse(final HttpResponse response) throws IOException {
      int status = response.getStatusLine().getStatusCode();

      if (status >= 200 && status < 300) {
        final HttpEntity entity = response.getEntity();

        if (entity == null) {
          logger.warn("Null Entity");
          return null;
        } else {
          return EntityUtils.toString(entity);
        }
      } else {
        logger.warn("HTTP Status = " + status);
        return null;
      }
    }
  }
}
