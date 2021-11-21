package com.algaworks.algafoodApi.jpa;

import com.algaworks.algafoodApi.AlgafoodApiApplication;
import com.algaworks.algafoodApi.domain.model.Cozinha;
import com.algaworks.algafoodApi.domain.model.Restaurante;
import com.algaworks.algafoodApi.domain.repository.CozinhaRepository;
import com.algaworks.algafoodApi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;


public class ConsultaRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        List<Restaurante> todosRestaurantes = restauranteRepository.listar();

        for (Restaurante restaurante : todosRestaurantes){
            System.out.printf("%s - %f - %s\n", restaurante.getNome(),
                    restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
        }
    }
}
