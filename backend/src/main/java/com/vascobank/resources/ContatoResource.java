package com.vascobank.resources;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Contato;
import com.vascobank.repositories.ContatoRepository;

@RestController
public class ContatoResource {

    @Autowired
    private ContatoRepository contatoRepository;

    @PostMapping("/contato")
    public Contato saveContatoDetalhes(@RequestBody Contato contato) {
    	contato.setContatoId(getNumeroDeSolicitacao());
    	contato.setDataCriacao(new Date(System.currentTimeMillis()));
        return contatoRepository.save(contato);
    }

    public String getNumeroDeSolicitacao() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR"+ranNum;
    }
	
}
