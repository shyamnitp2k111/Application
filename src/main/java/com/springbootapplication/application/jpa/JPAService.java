package com.springbootapplication.application.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAService {

    @Autowired
    private SampleJDBCTemplate jpaRepository;

    @Autowired
    UserRepository userRepository;

    public void saveUserInfo(UserInfo userInfo) {
        jpaRepository.saveUserInfo(userInfo);
    }

    public void saveUser(UserDetails userInfo) {
        userRepository.save(userInfo);
    }
}
