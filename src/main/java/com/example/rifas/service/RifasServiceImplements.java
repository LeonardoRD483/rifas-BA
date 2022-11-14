package com.example.rifas.service;

import com.example.rifas.model.Rifas;
import com.example.rifas.repository.RifasAndUserRepository;
import com.example.rifas.repository.RifasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RifasServiceImplements implements RifasService{

    @Autowired
    private RifasRepository rifasRepository;

    @Override
    public Iterable<Rifas> findAll() {
        return rifasRepository.findAll();
    }

    @Override
    public Page<Rifas> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Rifas> findBy(Integer id) {
        return Optional.empty();
    }

    @Override
    public Rifas save(Rifas client) {
        return rifasRepository.save(client);
    }

    @Override
    public void delete(Integer id) {

    }
}
