package com.aluraDB.loja.testes;

import com.aluraDB.loja.dao.CategoriaDAO;
import com.aluraDB.loja.dao.ProdutoDAO;
import com.aluraDB.loja.modelo.Categoria;
import com.aluraDB.loja.modelo.Produto;
import com.aluraDB.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) { 
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito Legal", new BigDecimal("800"), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO prodDAO = new ProdutoDAO(em);
        CategoriaDAO catDAO = new CategoriaDAO(em);

        em.getTransaction().begin();
        catDAO.cadastrar(celulares);
        prodDAO.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
