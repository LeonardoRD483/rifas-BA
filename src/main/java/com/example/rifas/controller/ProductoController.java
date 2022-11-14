package com.example.rifas.controller;

import com.example.rifas.model.Producto;
import com.example.rifas.service.ProductoServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    private ProductoServiceImplements productoServiceImplements;

    @GetMapping
    public Object getAllClient() {
        List<Producto> list = (List<Producto>) productoServiceImplements.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public Object created(@RequestBody Producto producto1) {
        Producto producto = productoServiceImplements.save(producto1);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

}
