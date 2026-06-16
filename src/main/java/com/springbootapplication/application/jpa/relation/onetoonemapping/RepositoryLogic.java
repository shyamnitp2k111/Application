package com.springbootapplication.application.jpa.relation.onetoonemapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLogic extends JpaRepository<UserData, Integer> {
}
