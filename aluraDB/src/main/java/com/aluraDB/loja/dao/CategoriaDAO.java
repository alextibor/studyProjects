  package com.aluraDB.loja.dao;

import com.aluraDB.loja.modelo.Categoria;
import com.aluraDB.loja.modelo.Produto;

import javax.persistence.EntityManager;

public class CategoriaDAO {

    private EntityManager em;

    public CategoriaDAO(EntityManager em){

        this.em = em;
    }

    public void cadastrar(Categoria categoria){

        this.em.persist(categoria);
    }
}
