package com.example.rifas.service;

import com.example.rifas.model.RifasAndUser;
import com.example.rifas.repository.ProductoRepository;
import com.example.rifas.repository.RifasAndUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RifasAndUserServiceImplements implements RifasAndUserService{

    @Autowired
    private RifasAndUserRepository rifasAndUserRepository;

    @Override
    public Iterable<RifasAndUser> findAll() {
        return rifasAndUserRepository.findAll();
    }

    @Override
    public Page<RifasAndUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<RifasAndUser> findBy(Integer id) {
        return Optional.empty();
    }

    @Override
    public RifasAndUser save(RifasAndUser client) {
        return rifasAndUserRepository.save(client);
    }

    @Override
    public void delete(Integer id) {

    }
}
