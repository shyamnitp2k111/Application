package com.springbootapplication.application.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SampleJDBCTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveUserInfo(UserInfo userInfo) {
        String insertQuery = "INSERT INTO users (user_name, age) VALUES (?, ?)";
        int val = jdbcTemplate.update(insertQuery, userInfo.getUserName(), userInfo.getAge());
        System.out.println("[ jdbc template ] operation "+ val);
    }
}
