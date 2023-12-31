package com.example.springboot;

import com.example.springboot.entity.BankTransactions;
import com.example.springboot.entity.BankUser;
import com.example.springboot.service.BankService;
import com.example.springboot.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    TransactionsService transactionsService;


    @GetMapping("/all")
    public List<BankTransactions> getUsers() {
        return transactionsService.getTransactions();
    }

    @GetMapping("/getTransactionPerUser/{userIdentifier}")
    public List<BankTransactions> buscarTrasferenciasPorUsuario(@PathVariable String identifier)
    {
        return transactionsService.buscarTrasferenciasPorUsuario(identifier);
    }
}
