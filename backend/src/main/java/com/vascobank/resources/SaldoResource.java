package com.vascobank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Transacoes;
import com.vascobank.repositories.TransacoesRepository;

@RestController
public class SaldoResource {

	@Autowired
	private TransacoesRepository transacoesRepository;

	@GetMapping("/saldos")
	public List<Transacoes> getDetalhesSaldo(@RequestParam Long id) {
		List<Transacoes> transacoes = transacoesRepository.findByUserIdOrderByDataTransacaoDesc(id);
		if (transacoes != null) {
			return transacoes;
		} else {
			return null;
		}
	}

}
