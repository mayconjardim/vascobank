package com.vascobank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.Transacoes;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {

	List<Transacoes> findByUserIdOrderByDataTransacaoDesc(Long userId);


}
