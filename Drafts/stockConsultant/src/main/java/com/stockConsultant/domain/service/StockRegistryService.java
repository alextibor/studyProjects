package com.stockConsultant.domain.service;

import com.stockConsultant.domain.exception.EntityInUseException;
import com.stockConsultant.domain.model.Stock;
import com.stockConsultant.domain.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class StockRegistryService {

    @Autowired
    private StockRepository stockRepository;

    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    public void exclude(Long stockId) {
        try {
            stockRepository.remove(stockId);
        } catch (EmptyResultDataAccessException e) {
            String.format("There is no stock registered with Id %d", stockId);
        } catch (DataIntegrityViolationException e) {
            throw new EntityInUseException(String.format("Stock code %d cannot be removed as it is in use", stockId));
        }

    }
}
