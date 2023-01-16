package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaResources {

	@GetMapping("/contas")
	public String getMinhaContaDetalhes() {
		return "Retorna detalhes da conta vindo do Banco de dados";
	}

}
