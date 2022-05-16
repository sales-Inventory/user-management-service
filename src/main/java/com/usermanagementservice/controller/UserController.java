package com.usermanagementservice.controller;

import com.usermanagementservice.model.User;
import com.usermanagementservice.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/user-service")
public class UserController {


    private UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> users() {
        return ResponseEntity.ok(userServiceImpl.users());
    }

    @PostMapping("/")
    public ResponseEntity<Boolean> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userServiceImpl.createUser(user));
    }

    @GetMapping("/user")
    public ResponseEntity<User> userById(@RequestParam String userId) {
        return ResponseEntity.ok(userServiceImpl.userById(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Boolean> editUser(@PathVariable String userId, @RequestBody User user) {
        return ResponseEntity.ok(userServiceImpl.editUser(userId, user));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable String userId) {
        return ResponseEntity.ok(userServiceImpl.deleteUser(userId));
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestParam String email, @RequestParam String password) {
        return ResponseEntity.ok(userServiceImpl.login(email, password));
    }
}
