package com.alexFood.jpa;

import com.alexFood.AlexFoodApplication;
import com.alexFood.model.Cozinha;
import com.alexFood.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlexFoodApplication.class )
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhas= applicationContext.getBean(CozinhaRepository.class);

		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");

		cozinhas.salvar(cozinha);
	}
}
