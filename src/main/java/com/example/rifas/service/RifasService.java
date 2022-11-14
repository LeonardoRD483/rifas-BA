package com.example.rifas.service;

import com.example.rifas.model.Rifas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RifasService {

    public Iterable<Rifas> findAll();
    public Page<Rifas> findAll(Pageable pageable);
    public Optional<Rifas> findBy(Integer id);
    public Rifas save(Rifas client);
    public void delete(Integer id);

}
