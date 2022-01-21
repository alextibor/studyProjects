package com.stockConsultant.infrastructure.repository;

import com.stockConsultant.domain.model.Stock;
import com.stockConsultant.domain.repository.StockRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class StockRepositoryImpl implements StockRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Stock> list(){
        return manager.createQuery("from Stock", Stock.class)
                .getResultList();
    }
    @Override
    public Stock search(Long id){
        return manager.find(Stock.class, id);
    }

    @Transactional
    @Override
    public Stock save(Stock stock) {
        return manager.merge(stock);
    }

    @Transactional
    @Override
    public void remove(Long id){
        Stock stock = search(id);

        if(stock == null){
            throw new EmptyResultDataAccessException(1);
        }
        manager.remove(stock);
    }
}
