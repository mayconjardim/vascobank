package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContatoResource {

	@GetMapping("/contatos")
	public String saveContatos() {
		return "Salva contato no banco de dados";
	}
	
}
