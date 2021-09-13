package com.library.View;

import com.library.Controller.*;

import java.util.Scanner;

public class ProductRegistrationView {

    Scanner sc = new Scanner(System.in);
    ProductRegistration prodreg = new ProductRegistration();

    boolean exit;
    
    public void runRegMenu(){
        printPodRegTitle();
        while(!exit){
            printMainMenu();
            int choice = getUserInput();
            performAction(choice);
        }
    }

    private int getUserInput(){
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
                eBookRegView();
                nextMove();
                //break;
            case 2:
                physicalBookRegView();
                nextMove();
                //break;
            case 3:
                miniBookRegView();
                nextMove();
                //break;
            case 4:
                magazineRegView();
                nextMove();
                //break;
            default:
                System.out.println("Invalid");
                //break;
        }
    }

    private void printPodRegTitle(){
        System.out.println("Which product would you like to register?");
    }

    private void printMainMenu(){
        System.out.println("\nPlease make a selection: ");
        System.out.println("1 - Ebook");
        System.out.println("2 - Physical Book");
        System.out.println("3 - Minibook");
        System.out.println("4 - Magazine");
        System.out.println("--");
    }

    public void eBookRegView(){
        clearScreen();
        prodreg.ebookReg();
        clearScreen();
    }

    public void physicalBookRegView(){
        clearScreen();
        prodreg.physicalBookReg();
        clearScreen();
    }

    public void miniBookRegView(){
        clearScreen();
        prodreg.miniBookReg();
        clearScreen();
    }

    public void magazineRegView(){
        clearScreen();
        prodreg.magazineReg();
        clearScreen();
    }

    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public void nextMove(){
        System.out.println("Would you like to register another product?");
        System.out.println("1 - Yes / 2 - No");
        int answer = sc.nextInt();
        if(answer == 1){
            clearScreen();
            runRegMenu();
        } else if (answer == 2){
            clearScreen();
            Menu mainMenu = new Menu();
            mainMenu.runMenu();
        } else{
            clearScreen();
            System.out.println("Invalid answer.");
            nextMove();
        }
    }

    public void retriveProdList(){
        prodreg.productShow();
    }
}
