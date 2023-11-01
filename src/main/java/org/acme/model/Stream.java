package org.acme.model;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    private String id;

    private List<Tweet> tweets;

    public Stream(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}