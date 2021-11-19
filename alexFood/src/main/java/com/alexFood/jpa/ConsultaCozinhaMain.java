package com.alexFood.jpa;

import java.util.List;

import com.alexFood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alexFood.AlexFoodApplication;
import com.alexFood.domain.model.Cozinha;


public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlexFoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhas = cozinhas.listar();
		
		for(Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
