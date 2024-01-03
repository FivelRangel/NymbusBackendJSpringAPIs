package com.example.springboot.service;

import com.example.springboot.entity.BankUser;
import com.example.springboot.entity.Producto;
import com.example.springboot.repository.BankRepository;
import com.example.springboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;
    public List<BankUser> getUsers() {
        return bankRepository.findAll();
    }

    public int getBudget() {
        int totalBudget=0;
         bankRepository.findAll();

         for (Long i = 0L; i<bankRepository.findAll().size(); i++)
         {
             totalBudget=totalBudget+bankRepository.getReferenceById(i).getBudget();
         }

         return totalBudget;

    }
}
