package com.vascobank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {



}
