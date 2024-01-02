package com.example.springboot.service;

import com.example.springboot.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloRepository articulosRepository;




}
