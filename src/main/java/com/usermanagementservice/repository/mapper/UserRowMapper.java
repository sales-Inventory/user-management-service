package com.usermanagementservice.repository.mapper;

import com.usermanagementservice.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getString("user_id"));
        user.setFirstName(resultSet.getString("first_name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setAddress1(resultSet.getString("address_1"));
        user.setAddress2(resultSet.getString("address_2"));
        user.setCountry(resultSet.getString("country"));
        user.setCountryCode(resultSet.getString("country_code"));
        user.setContact(resultSet.getString("contact"));
        user.setRole(resultSet.getString("role"));
        return user;
    }
}
