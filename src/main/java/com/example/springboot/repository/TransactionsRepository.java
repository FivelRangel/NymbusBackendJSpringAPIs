package com.example.springboot.repository;

import com.example.springboot.entity.BankTransactions;
import com.example.springboot.entity.BankUser;
import com.example.springboot.entity.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TransactionsRepository extends JpaRepository<BankTransactions, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}

