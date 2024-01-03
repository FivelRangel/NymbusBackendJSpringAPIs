package com.example.springboot;

import com.example.springboot.entity.BankUser;
import com.example.springboot.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addUser")
    public BankUser addUser(@RequestBody BankUser bankUser)
    {

        return bankService.setUser(bankUser);
    }

    //Dashboard
    @GetMapping("/totalBudget")
    public int getTotalBudget() {
        return bankService.getBudget();
    }

    //Transactions
    @GetMapping("/transactions")
    public int getTotalTransactions() {
        return bankService.getBudget();
    }



    }
