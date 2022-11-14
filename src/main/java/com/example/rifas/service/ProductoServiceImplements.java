package com.example.rifas.service;

import com.example.rifas.model.Producto;
import com.example.rifas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductoServiceImplements implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Page<Producto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Producto> findBy(Integer id) {
        return Optional.empty();
    }

    @Override
    public Producto save(Producto client) {
        return productoRepository.save(client);
    }

    @Override
    public void delete(Integer id) {

    }
}
