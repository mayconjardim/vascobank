package com.vascobank.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaldoResource {

	 @GetMapping("/saldos")
	 public String getSaldoDetalhes() {
		 return "Retorna saldo da conta vindo do banco de dados";
	 }
	
}
