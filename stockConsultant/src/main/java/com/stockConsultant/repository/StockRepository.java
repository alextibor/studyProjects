package com.stockConsultant.repository;

import com.stockConsultant.model.Stock;

import java.util.List;

public interface StockRepository {

    List<Stock> list();
    Stock search(Long id);
    Stock save(Stock stock);
    void remove(Stock stock);
}
