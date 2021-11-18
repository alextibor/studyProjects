package com.stockConsultant.ifrastructure.repository;

import com.stockConsultant.model.Stock;
import com.stockConsultant.repository.StockRepository;
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
    public void remove(Stock stock){
        stock = search(stock.getId());
        manager.remove(stock);
    }
}
