package com.library.Controller;

import java.util.Locale;
import java.util.Scanner;

import com.library.Model.*;
import com.library.Repository.*;

public class ProductRegistration {

    ListDb lDb = new ListDb();

    public void ebookReg(){
        Product prod = new Ebook();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, register a new Ebook: ");
        System.out.println("What is the name of the Ebook?");
        String nm = sc.nextLine();
        prod.setProductName(nm);
        System.out.println("What is the name of the Author?");
        String authorName = sc.nextLine();
        prod.setAuthorName(authorName);
        System.out.println("Write the description: ");
        String dc = sc.nextLine();
        prod.setDescription(dc);
        System.out.println("What is the value of the Ebook?");
        double vl = sc.nextDouble();
        prod.setValue(vl);
        System.out.println("What is the Publish Company? ");
        String pcn = sc.nextLine();
        prod.setPublishingCompanyName(pcn);
        lDb.setListArray(prod);
    }

    public void magazineReg(){
        Product prod = new Magazine();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, register a new Magazine: ");
        System.out.println("What is the name of the Magazine?");
        String nm = sc.nextLine();
        prod.setProductName(nm);
        System.out.println("Write the description: ");
        String dc = sc.nextLine();
        prod.setDescription(dc);
        System.out.println("What is the value of the Magazine?");
        double vl = sc.nextDouble();
        prod.setValue(vl);
        System.out.println("What is the Publish Company? ");
        String pcn = sc.nextLine();
        prod.setPublishingCompanyName(pcn);
        lDb.setListArray(prod);
    }

    public void miniBookReg(){
        Product prod = new MiniBook();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, register a new  MiniBook: ");
        System.out.println("What is the name of the MiniBook?");
        String nm = sc.nextLine();
        prod.setProductName(nm);
        System.out.println("Write the description: ");
        String dc = sc.nextLine();
        prod.setDescription(dc);
        System.out.println("What is the value of the MiniBook?");
        double vl = sc.nextDouble();
        prod.setValue(vl);
        System.out.println("What is the Publish Company? ");
        String pcn = sc.nextLine();
        prod.setPublishingCompanyName(pcn);
        lDb.setListArray(prod);
    }

    public void physicalBookReg(){
        Product prod = new MiniBook();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, register a new Physical Book: ");
        System.out.println("What is the name of the Physical Book? ");
        String nm = sc.nextLine();
        prod.setProductName(nm);
        System.out.println("Write the description: ");
        String dc = sc.nextLine();
        prod.setDescription(dc);
        System.out.println("What is the value of the Physical Book? ");
        double vl = sc.nextDouble();
        prod.setValue(vl);
        System.out.println("What is the Publish Company? ");
        String pcn = sc.nextLine();
        prod.setPublishingCompanyName(pcn);
        lDb.setListArray(prod);
    }

    public void productShow(){
        lDb.getListArray();
    }
}
