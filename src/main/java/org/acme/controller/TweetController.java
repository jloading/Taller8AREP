package org.acme.controller;

import com.google.gson.Gson;
import org.acme.model.Tweet;
import org.acme.model.User;
import org.acme.service.TweetService;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/tweet")
public class TweetController {

    @Inject
    TweetService tweetService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTweets() {
        List<Tweet> tweets = tweetService.getAllTweets();
        Gson gson = new Gson();
        String json = gson.toJson(tweets);
        return json;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveTweet(Tweet tweet){
        System.out.println(tweet);
        tweetService.saveTweet(tweet);
        return Response.status(201).build();
    }

}
