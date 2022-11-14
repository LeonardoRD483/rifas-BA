package com.example.rifas.service;

import com.example.rifas.model.User;
import com.example.rifas.repository.RifasRepository;
import com.example.rifas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<User> findBy(Integer id) {
        return Optional.empty();
    }

    @Override
    public User save(User client) {
        return userRepository.save(client);
    }

    @Override
    public void delete(Integer id) {

    }
}
