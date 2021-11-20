package com.stockConsultant.domain.repository;

import com.stockConsultant.domain.model.Stock;

import java.util.List;

public interface StockRepository {

    List<Stock> list();
    Stock search(Long id);
    Stock save(Stock stock);
    void remove(Long id);
}
