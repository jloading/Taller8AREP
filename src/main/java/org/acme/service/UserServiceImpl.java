package org.acme.service;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.acme.model.User;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class UserServiceImpl implements UserService{

    @Inject
    MongoClient mongoClient;

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("cluster0").getCollection("user");
    }

    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();
        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                User user = new User();
                user.setId(String.valueOf(document.getObjectId("_id")));
                user.setNombre(document.getString("nombre"));
                user.setCorreo(document.getString("correo"));
                user.setClave(document.getString("clave"));
                list.add(user);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    @Override
    public void saveUser(User usuario) {
        Document document = new Document()
                .append("nombre", usuario.getNombre())
                .append("correo", usuario.getCorreo())
                .append("clave", usuario.getClave());
        getCollection().insertOne(document);

    }
}
