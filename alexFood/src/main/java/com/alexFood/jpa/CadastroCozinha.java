package com.alexFood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alexFood.model.Cozinha;

public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
		return manager.createQuery("from cozinha", Cozinha.class).getResultList();
	}
	
	@Transactional
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}

}
