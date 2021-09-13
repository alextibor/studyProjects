package com.library.View;

import java.util.Scanner;

public class Menu {

    ProductRegistrationView prv = new ProductRegistrationView();
    
    boolean exit;

    public void runMenu(){
        printHeader();
        while(!exit){
            printMainMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader(){
        System.out.println("+----------------------+");
        System.out.println("|      Welcome to      |");
        System.out.println("|       Library        |");
        System.out.println("+----------------------+");
    }

    private void printMainMenu(){
        System.out.println("\nPlease make a selection: ");
        System.out.println("1 - Register a book");
        System.out.println("2 - List the avaliable books");
        System.out.println("3 - Open your cart");
        System.out.println("4 - Checkout");
        System.out.println("--");
    }

    private int getInput(){
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 4){
            try {
                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection, please try again");
            }
        }
        return choice;
    }

    private void performAction(int choice){
        switch(choice){
            case 1:
                prv.runRegMenu();
                runMenu();
                //break;
            case 2:
                prv.retriveProdList();
                runMenu();
                //break;
            case 3:
                
                //break;
            case 4:
                //break;
            default:
            System.out.println("Invalid");
                //break;
        }
    }   
}
