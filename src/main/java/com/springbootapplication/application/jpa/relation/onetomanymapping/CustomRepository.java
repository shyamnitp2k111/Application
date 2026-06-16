package com.springbootapplication.application.jpa.relation.onetomanymapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepository extends JpaRepository<UserTable, Integer> {
}
