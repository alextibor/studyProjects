package com.alexFood.infrastucture.repository;

import com.alexFood.model.FormaPagamento;
import com.alexFood.model.Restaurante;
import com.alexFood.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar(){
        return manager.createQuery("from FormaPagamento", FormaPagamento.class)
                .getResultList();
    }
    @Override
    public FormaPagamento buscar(Long id){
        return manager.find(FormaPagamento.class, id);
    }

    @Transactional
    @Override
    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return manager.merge(formaPagamento);
    }

    @Transactional
    @Override
    public void remover(FormaPagamento formaPagamento){
        formaPagamento = buscar(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
