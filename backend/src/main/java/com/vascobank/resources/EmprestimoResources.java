package com.vascobank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vascobank.entities.Emprestimos;
import com.vascobank.repositories.EmprestimosRepository;

@RestController
public class EmprestimoResources {

    @Autowired
    private EmprestimosRepository emprestimosRepository;

    @GetMapping("/emprestimos")
    public List<Emprestimos> getDetalhesEmprestimos(@RequestParam Long id) {
        List<Emprestimos> emp = emprestimosRepository.findByUserIdOrderByDataCriacaoDesc(id);
        if (emp != null ) {
            return emp;
        }else {
            return null;
        }
    }
	
}
