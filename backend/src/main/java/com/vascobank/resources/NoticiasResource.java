package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticiasResource {

	@GetMapping("/noticias")
	public String getNoticias() {
		return "Retorna noticias vindas do banco de dados";
	}
	
}
