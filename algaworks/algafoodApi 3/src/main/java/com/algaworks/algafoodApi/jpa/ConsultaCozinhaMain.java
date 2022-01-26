package com.algaworks.algafoodApi.jpa;

import com.algaworks.algafoodApi.AlgafoodApiApplication;
import com.algaworks.algafoodApi.domain.model.Cozinha;
import com.algaworks.algafoodApi.domain.repository.CozinhaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        List<Cozinha> cozinhas = cozinhaRepository.listar();

        for (Cozinha cozinha : cozinhas){
            System.out.println(cozinha.getNome());
        }
    }
}