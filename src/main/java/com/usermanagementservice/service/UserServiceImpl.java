package com.usermanagementservice.service;

import com.usermanagementservice.model.User;
import com.usermanagementservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> users() {
        return userRepository.users();
    }

    public boolean createUser(User user) {
        return userRepository.createUser(user);
    }

    public User userById(String userId) {
        return userRepository.userById(userId);
    }

    public boolean editUser(String userId, User user) {
        return userRepository.editUser(userId, user);
    }

    public boolean deleteUser(String userId) {
        return userRepository.deleteUser(userId);
    }

    public User login(String userName, String password) {
        return userRepository.login(userName, password);
    }
}
