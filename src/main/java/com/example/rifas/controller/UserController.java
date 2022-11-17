package com.example.rifas.controller;

import com.example.rifas.model.Rifas;
import com.example.rifas.model.User;
import com.example.rifas.service.RifasServiceImplements;
import com.example.rifas.service.UserServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {


    @Autowired
    private UserServiceImplements userServiceImplements;

    @GetMapping
    public Object getAllClient() {
        List<User> list = (List<User>) userServiceImplements.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public Object created(@RequestBody User user) {
        User userDto = userServiceImplements.save(user);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/login/{userName}/{password}")
    public Object loginUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        User users = userServiceImplements.login(userName, password);
        if (null != users) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Contraseña/UserName Incorrecto", HttpStatus.BAD_GATEWAY);

        }
    }

}
