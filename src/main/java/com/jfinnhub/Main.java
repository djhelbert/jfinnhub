package com.jfinnhub;

import com.beust.jcommander.JCommander;

import java.io.IOException;

/**
 * Main Class
 */
public class Main {

    /**
     * Main Method
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            final Arguments jArgs = new Arguments();
            final JCommander jCmd = JCommander.newBuilder()
                    .addObject(jArgs)
                    .build();
            jCmd.parse(args);

            final FinnhubClient client = new FinnhubClient();

            if (jArgs.isCompanyProfile()) {
                System.out.println(client.getCompanyProfileAsString(jArgs.getSymbol()));
            }

            if (jArgs.isQuote()) {
                System.out.println(client.getQuoteAsString(jArgs.getSymbol()));
            }

            if (jArgs.isMajorDevelopments()) {
                System.out.println(client.getMajorDevelopmentsAsString(jArgs.getSymbol()));
            }

            if (jArgs.isGeneralNews()) {
                System.out.println(client.getGeneralNewsAsString());
            }

            if (jArgs.isQuote()) {
                System.out.println(client.getProfileAsString(jArgs.getSymbol()));
            }

            if (jArgs.isNewSentiment()) {
                System.out.println(client.getNewsSentimentAsString(jArgs.getSymbol()));
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
