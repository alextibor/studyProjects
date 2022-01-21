package com.alexFood.api.controller;

import com.alexFood.domain.model.Cidade;
import com.alexFood.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    public CidadeRepository cidadeRepository;

    @GetMapping
    public List<Cidade> listando(){
        return cidadeRepository.listar();
    }
}
