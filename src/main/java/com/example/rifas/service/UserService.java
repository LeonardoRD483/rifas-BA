package com.example.rifas.service;

import com.example.rifas.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {


    public Iterable<User> findAll();
    public Page<User> findAll(Pageable pageable);
    public Optional<User> findBy(Integer id);
    public User save(User client);
    public void delete(Integer id);

}
