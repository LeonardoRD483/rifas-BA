package com.example.rifas.service;

import com.example.rifas.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductoService {


    public Iterable<Producto> findAll();
    public Page<Producto> findAll(Pageable pageable);
    public Optional<Producto> findBy(Integer id);
    public Producto save(Producto client);
    public void delete(Integer id);
}
