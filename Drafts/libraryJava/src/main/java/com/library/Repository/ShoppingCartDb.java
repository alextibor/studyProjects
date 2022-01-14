package com.library.Repository;

import com.library.Model.*;
import com.library.Controller.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDb {
    
    List<Product> cartArray;

    public ShoppingCartDb(){
        this.cartArray = new ArrayList<Product>();
    }

    public void getCartArray() {
        cartArray.forEach(cartArray -> {
        System.out.println("Percorrendo: ");
        System.out.println("List" + cartArray);
        });
    }

    public void setCartArray(Product prod) {
        this.cartArray.add(prod);
    }
}
