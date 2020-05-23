package com.jfinnhub;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfinnhub.model.*;
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

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Finnhub Client
 */
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

    private String execute(HttpGet get) throws IOException {
        return client.execute(get, handler);
    }

    private String execute(HttpPost post) throws IOException {
        return client.execute(post, handler);
    }

    public String getNewsSentimentAsString(String symbol) throws IOException {
        return execute(get(Endpoint.newsSentiment(symbol, token)));
    }

    public NewsSentiment getNewsSentiment(String symbol) throws IOException {
        return objectMapper.readValue(getNewsSentimentAsString(symbol), NewsSentiment.class);
    }

    public String getMajorDevelopmentsAsString(String symbol) throws IOException {
        return execute(get(Endpoint.majorDevelopments(symbol, token)));
    }

    public MajorDevelopments getMajorDevelopments(String symbol) throws IOException {
        return objectMapper.readValue(getMajorDevelopmentsAsString(symbol), MajorDevelopments.class);
    }

    public String getGeneralNewsAsString() throws IOException {
        return execute(get(Endpoint.generalNews(token)));
    }

    public List<GeneralNews> getGeneralNews() throws IOException {
        return objectMapper.readValue(getGeneralNewsAsString(), new TypeReference<List<GeneralNews>>() {
        });
    }

    public String getProfileAsString(String symbol) throws IOException {
        return execute(get(Endpoint.profile(symbol, token)));
    }

    public Profile getProfile(String symbol) throws IOException {
        return objectMapper.readValue(getProfileAsString(symbol), Profile.class);
    }

    public String getCompanyProfileAsString(String symbol) throws IOException {
        return execute(get(Endpoint.companyProfile(symbol, token)));
    }

    public CompanyProfile getCompanyProfile(String symbol) throws IOException {
        return objectMapper.readValue(getCompanyProfileAsString(symbol), CompanyProfile.class);
    }

    public String getQuoteAsString(String symbol) throws IOException {
        return execute(get(Endpoint.quote(symbol, token)));
    }

    public Quote getQuote(String symbol) throws IOException {
        return objectMapper.readValue(getQuoteAsString(symbol), Quote.class);
    }

    class StringResponseHandler implements ResponseHandler<String> {
        public String handleResponse(final HttpResponse response) throws IOException {
            int status = response.getStatusLine().getStatusCode();

            if (status == 200) {
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
