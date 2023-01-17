package com.vascobank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Cartoes;
import com.vascobank.repositories.CartoesRepository;

@RestController
public class CartoesResource {
	
    @Autowired
    private CartoesRepository cartoesRepository;

    @GetMapping("/cartoes")
    public List<Cartoes> getDetalhesCartoes(@RequestParam Long id) {
        List<Cartoes> cartoes = cartoesRepository.findByUserId(id);
        if (cartoes != null ) {
            return cartoes;
        }else {
            return null;
        }
    }

	
	
}
