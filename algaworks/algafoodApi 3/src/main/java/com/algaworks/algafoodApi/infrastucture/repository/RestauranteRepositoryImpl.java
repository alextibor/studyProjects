package com.algaworks.algafoodApi.infrastucture.repository;

import com.algaworks.algafoodApi.domain.model.Cozinha;
import com.algaworks.algafoodApi.domain.model.Restaurante;
import com.algaworks.algafoodApi.domain.repository.CozinhaRepository;
import com.algaworks.algafoodApi.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> listar(){
        return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
    }

    @Override
    public Restaurante buscar(Long id) {
        return manager.find(Restaurante.class, id);
    }

    @Transactional
    @Override
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Transactional
    @Override
    public void remover(Restaurante restaurante) {
        manager.remove(restaurante);
    }
}
