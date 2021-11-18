package com.alexFood.infrastucture.repository;

import com.alexFood.model.Cozinha;
import com.alexFood.model.Permissao;
import com.alexFood.repository.PermissaoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PermissaoRepositoryImpl  implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar(){
        return manager.createQuery("from Permissao", Permissao.class)
                .getResultList();
    }
    @Override
    public Permissao buscar(Long id){
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao){
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }
}
