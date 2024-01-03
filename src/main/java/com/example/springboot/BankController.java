package com.example.springboot;

import com.example.springboot.entity.BankUser;
import com.example.springboot.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {


        @Autowired
        BankService bankService;


    @GetMapping("/users")
    public List<BankUser> getUsers() {
        return bankService.getUsers();
    }

    }
