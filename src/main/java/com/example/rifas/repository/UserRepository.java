package com.example.rifas.repository;

import com.example.rifas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findBynameAndAndPassword(String userName, String password);
}

