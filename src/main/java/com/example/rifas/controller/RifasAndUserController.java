package com.example.rifas.controller;

import com.example.rifas.model.Producto;
import com.example.rifas.model.RifasAndUser;
import com.example.rifas.repository.RifasAndUserRepository;
import com.example.rifas.service.ProductoServiceImplements;
import com.example.rifas.service.RifasAndUserServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rifasAndUser")
@CrossOrigin(origins = "*")
public class RifasAndUserController {

    @Autowired
    private RifasAndUserServiceImplements rifasAndUserServiceImplements;

    @GetMapping
    public Object getAllClient() {
        List<RifasAndUser> list = (List<RifasAndUser>) rifasAndUserServiceImplements.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public Object created(@RequestBody RifasAndUser rifasAndUser1) {
        RifasAndUser rifasAndUser = rifasAndUserServiceImplements.save(rifasAndUser1);
        return new ResponseEntity<>(rifasAndUser, HttpStatus.OK);
    }
}
