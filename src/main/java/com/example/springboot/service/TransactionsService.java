package com.example.springboot.service;


import com.example.springboot.entity.BankTransactions;
import com.example.springboot.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;

    public List<BankTransactions> getTransactions() {
        return transactionsRepository.findAll();
    }

}
