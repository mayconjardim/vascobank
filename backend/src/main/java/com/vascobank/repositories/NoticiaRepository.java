package com.vascobank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vascobank.entities.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

	@Query(value = "from Noticia n where CURDATE() BETWEEN dataInicio AND dataTermino")
	List<Noticia> findAllNoticiasAtivas();

}
