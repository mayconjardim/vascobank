package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoResources {

	@GetMapping("/emprestimos")
	public String getEmprestimoDetalhes() {
		return "Retorna emprestimos da conta vind do banco de dados";
	}
	
}
