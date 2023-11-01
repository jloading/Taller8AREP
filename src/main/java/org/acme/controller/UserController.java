package org.acme.controller;


import com.google.gson.Gson;
import org.acme.model.User;
import org.acme.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/user")
public class UserController {

    @Inject
    UserService userService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsers() {
        List<User> users = userService.getAllUser();
        Gson gson = new Gson();
        String json = gson.toJson(users);
        return json;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveUser(User usuario){
        userService.saveUser(usuario);
        return Response.status(201).build();
    }



}
