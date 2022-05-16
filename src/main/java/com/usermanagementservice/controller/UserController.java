package com.usermanagementservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> extractOrdersFromLogicBroker() {
        return ResponseEntity.ok("hello guyssssssssssssss");
    }
}
