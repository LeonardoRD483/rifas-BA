package com.example.rifas.controller;

import com.example.rifas.model.Rifas;
import com.example.rifas.model.RifasAndUser;
import com.example.rifas.service.RifasServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rifas")
@CrossOrigin(origins = "*")
public class RifasController {

    @Autowired
    private RifasServiceImplements rifasServiceImplements;

    @GetMapping
    public Object getAllClient() {
        List<Rifas> list = (List<Rifas>) rifasServiceImplements.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public Object created(@RequestBody Rifas rifasAndUser1) {
        Rifas rifasAndUser = rifasServiceImplements.save(rifasAndUser1);
        return new ResponseEntity<>(rifasAndUser, HttpStatus.OK);
    }



}
