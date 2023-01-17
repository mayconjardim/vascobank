package com.vascobank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascobank.entities.Cartoes;

public interface CartoesRepository extends JpaRepository<Cartoes, Long> {

	List<Cartoes> findByUserId(Long userId);

}
