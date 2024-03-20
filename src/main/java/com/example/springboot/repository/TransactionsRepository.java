package com.example.springboot.repository;

import com.example.springboot.entity.BankTransactions;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface TransactionsRepository extends JpaRepository<BankTransactions, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

    List<BankTransactions> findByidentifier(int identifier);

}

