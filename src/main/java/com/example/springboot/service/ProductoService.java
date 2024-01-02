package com.example.springboot.service;

import com.example.springboot.entity.Producto;
import com.example.springboot.repository.HelloRepository;
import com.example.springboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}
