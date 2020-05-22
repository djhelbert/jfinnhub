package com.jfinnhub;

import com.jfinnhub.model.GeneralNews;
import com.jfinnhub.model.NewsSentiment;
import com.jfinnhub.model.Profile;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    try {
      FinnhubClient client = new FinnhubClient();
      //System.out.println(client.getCompanyProfileAsString("ORCL"));
      //System.out.println(client.getQuoteAsString("ORCL"));
      //System.out.println(client.getMajorDevelopmentsAsString("ORCL"));
      System.out.println(client.getGeneralNewsAsString());
      List<GeneralNews> gn = client.getGeneralNews();
      System.out.println(client.getProfileAsString("ORCL"));
      Profile prof = client.getProfile("ORCL");
      System.out.println(client.getNewsSentimentAsString("ORCL"));
      NewsSentiment newsSent = client.getNewsSentiment("ORCL");
      System.out.println("");
    } catch(Exception err ) {
      err.printStackTrace();
    }
  }
}
