package com.library.Repository;

import com.library.Model.*;
import com.library.Controller.*;

import java.util.ArrayList;
import java.util.List;

public class ListDb {
    
    List<Product> listArray;

    public ListDb(){
        this.listArray = new ArrayList<Product>();
    }

    public void getListArray() {
        listArray.forEach(listArray -> {
        System.out.println("Percorrendo: ");
        System.out.println("List" + listArray);
        });
    }

    public void setListArray(Product prod) {
        this.listArray.add(prod);
    }
}