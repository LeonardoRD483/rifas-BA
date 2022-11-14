package com.example.rifas.service;

import com.example.rifas.model.RifasAndUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RifasAndUserService {

    public Iterable<RifasAndUser> findAll();
    public Page<RifasAndUser> findAll(Pageable pageable);
    public Optional<RifasAndUser> findBy(Integer id);
    public RifasAndUser save(RifasAndUser client);
    public void delete(Integer id);

}
