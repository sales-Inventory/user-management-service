package com.usermanagementservice.model;

import lombok.Data;

@Data
public class User {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address1;
    private String address2;
    private String country;
    private String countryCode;
    private String contact;
    private String role;

}
