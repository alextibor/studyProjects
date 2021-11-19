package com.alexFood.jpa;

import com.alexFood.AlexFoodApplication;
import com.alexFood.domain.model.Cozinha;
import com.alexFood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


public class BuscaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlexFoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cozinhas.buscar(3L);
		
		System.out.println(cozinha.getNome());
	}
}
