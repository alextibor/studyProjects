package com.alexFood.jpa;

import com.alexFood.AlexFoodApplication;
import com.alexFood.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alexFood.model.Cozinha;

public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlexFoodApplication.class )
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");

		cozinhas.salvar(cozinha1);
		cozinhas.salvar(cozinha2);

		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
	}
}
