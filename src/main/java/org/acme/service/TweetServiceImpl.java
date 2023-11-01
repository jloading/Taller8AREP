package org.acme.service;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.acme.model.Tweet;
import org.acme.model.User;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class TweetServiceImpl implements TweetService{

    @Inject
    MongoClient mongoClient;



    private MongoCollection getCollection(){
        return mongoClient.getDatabase("cluster0").getCollection("tweet");
    }

    @Override
    public List<Tweet> getAllTweets() {
        List<Tweet> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();
        try {
            while (cursor.hasNext()) {
                Document tweetDocument = cursor.next();
                Tweet tweet = new Tweet();
                tweet.setId(String.valueOf(tweetDocument.getObjectId("_id")));
                tweet.setTexto(tweetDocument.getString("texto"));
                tweet.setFecha(tweetDocument.getDate("fecha"));
                User userTweet = new User();
                Document documentUser = (Document) tweetDocument.get("usuario");
                userTweet.setId(documentUser.getString("_id"));
                userTweet.setNombre(documentUser.getString("nombre"));
                userTweet.setCorreo(documentUser.getString("correo"));
                userTweet.setClave(documentUser.getString("clave"));
                tweet.setUsuario(userTweet);
                list.add(tweet);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    @Override
    public void saveTweet(Tweet tweet) {
        Document document = new Document()
                .append("texto", tweet.getTexto())
                .append("usuario", tweet.getUsuario())
                .append("fecha", tweet.getFecha());
        getCollection().insertOne(document);

    }
}
