package com.stockConsultant.api.contoller;

import com.stockConsultant.domain.model.Stock;
import com.stockConsultant.domain.repository.StockRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping
    public List<Stock> listing(){
        return stockRepository.list();
    }

    @GetMapping("/{stockId}")
    public ResponseEntity<Stock> search(@PathVariable Long stockId){
        Stock stock = stockRepository.search(stockId);

        if (stock != null) {
            return ResponseEntity.status(HttpStatus.OK).body(stock);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Stock add(@RequestBody Stock stock){
        return stockRepository.save(stock);
    }

    @PutMapping("/{stockId}")
    public ResponseEntity<Stock> update(@PathVariable Long stockId, @RequestBody Stock stock) {
        Stock currentStock = stockRepository.search(stockId);
        if (currentStock != null){
            BeanUtils.copyProperties(stock, currentStock, "id");
            stockRepository.save(currentStock);
            return ResponseEntity.ok(currentStock);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{stockId}")
    public ResponseEntity<Stock> remove(@PathVariable Long stockId){
        try {
            Stock stock = stockRepository.search(stockId);

            if (stock != null){
                stockRepository.remove(stock);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (DataIntegrityViolationException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
