package org.acme.service;

import org.acme.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public void saveUser(User user);
}
