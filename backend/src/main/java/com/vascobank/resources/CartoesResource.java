package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartoesResource {
	
	@GetMapping("/cartoes")
	public String getCartaoDetalhes() {
		return "Retorna cartões da conta vind do banco de dados";
	}

	
	
}
