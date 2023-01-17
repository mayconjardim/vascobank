package com.vascobank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.Emprestimos;

public interface EmprestimosRepository extends JpaRepository<Emprestimos, Long> {

	List<Emprestimos> findByUserIdOrderBydataCriacaoDesc(Long userId);

}
