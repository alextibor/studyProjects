package com.stockConsultant.contoller;

import com.stockConsultant.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @GetMapping("/getStocks")
    public Stock stocks(){
        return null;
    }

}
