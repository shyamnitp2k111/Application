package com.springbootapplication.application.jpa.relation;

import com.springbootapplication.application.jpa.relation.onetomanymapping.CustomRepository;
import com.springbootapplication.application.jpa.relation.onetomanymapping.UserTable;
import com.springbootapplication.application.jpa.relation.onetoonemapping.RepositoryLogic;
import com.springbootapplication.application.jpa.relation.onetoonemapping.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLogic {

    @Autowired
    private RepositoryLogic repositoryLogic;

    @Autowired
    private CustomRepository customRepository;

    public void saveUserValue(UserData userData) {
        repositoryLogic.save(userData);
    }

    public Optional<UserData> fetchUserInfo(int userId) {
        return repositoryLogic.findById(userId);
    }

    public void saveUserData(UserTable userTable) {
        customRepository.save(userTable);
    }
}
