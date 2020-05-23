package com.jfinnhub;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.Parameter;

public class Arguments {
    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = "-symbol", description = "Symbol")
    private String symbol;

    @Parameter(names = "--general_news", description = "General News")
    private boolean generalNews;

    @Parameter(names = "--news_sentiment", description = "News Sentiment for Symbol")
    private boolean newSentiment;

    @Parameter(names = "--profile", description = "Simple Profile for Symbol")
    private boolean profile;

    @Parameter(names = "--quote", description = "Quote for Symbol")
    private boolean quote;

    @Parameter(names = "--company_profile", description = "Full Company Profile for Symbol")
    private boolean companyProfile;

    @Parameter(names = "--major_developments", description = "Major News Devlopments for Symbol")
    private boolean majorDevelopments;

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isGeneralNews() {
        return generalNews;
    }

    public void setGeneralNews(boolean generalNews) {
        this.generalNews = generalNews;
    }

    public boolean isNewSentiment() {
        return newSentiment;
    }

    public void setNewSentiment(boolean newSentiment) {
        this.newSentiment = newSentiment;
    }

    public boolean isProfile() {
        return profile;
    }

    public void setProfile(boolean profile) {
        this.profile = profile;
    }

    public boolean isQuote() {
        return quote;
    }

    public void setQuote(boolean quote) {
        this.quote = quote;
    }

    public boolean isCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(boolean companyProfile) {
        this.companyProfile = companyProfile;
    }

    public boolean isMajorDevelopments() {
        return majorDevelopments;
    }

    public void setMajorDevelopments(boolean majorDevelopments) {
        this.majorDevelopments = majorDevelopments;
    }
}
