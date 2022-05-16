package com.usermanagementservice.service;

import com.usermanagementservice.model.User;

import java.util.List;

public interface UserService {

    List<User> users();

    boolean createUser(User user);

    User userById(String userId);

    boolean editUser(String userId, User user);

    boolean deleteUser(String userId);

    User login(String userName, String password);
}
