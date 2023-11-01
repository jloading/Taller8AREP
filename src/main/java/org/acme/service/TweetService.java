package org.acme.service;

import org.acme.model.Tweet;
import org.acme.model.User;

import java.util.List;

public interface TweetService {
    public List<Tweet> getAllTweets();

    public void saveTweet(Tweet tweet);
}
