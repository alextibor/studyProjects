package com.library.Controller;

import com.library.Model.Product;
import com.library.Repository.*;

public class ShoppingCart {

    private double total;

    public void addInCart(Product product){
        System.out.println("Adding: " + product);
        this.total += product.getValue();
    }

    public double getTotal() {
        return this.total;
    }
}
