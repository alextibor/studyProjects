package com.alexFood.api.controller;

import com.alexFood.domain.model.Estado;
import com.alexFood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    public EstadoRepository estadoRepository;

    @GetMapping
    public List<Estado> listando(){
        return estadoRepository.listar();
    }
}
