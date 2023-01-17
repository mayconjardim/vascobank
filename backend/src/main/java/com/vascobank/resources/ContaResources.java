package com.vascobank.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Conta;
import com.vascobank.repositories.ContaRepository;

@RestController
public class ContaResources {

	@Autowired
	private ContaRepository contaRepository;

	@GetMapping("/contas")
	public Conta getContaDetalhes(@RequestParam Long id) {
		Conta contas = contaRepository.findByUserId(id);
		if (contas != null) {
			return contas;
		} else {
			return null;
		}
	}

}
