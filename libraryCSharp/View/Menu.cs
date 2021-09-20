using System;
using System.Runtime.InteropServices;
using libraryCSharp.Controller;

namespace libraryCSharp.View
{
    public class Menu
    {
        ProductRegistrationView prv;
        bool exit;

        public Menu()
        {
            prv = new ProductRegistrationView();
        }

        public void runMenu(){
            printHeader();
            while(!exit){
                printMainMenu();
                int choice = getInput();
                performAction(choice);
            }
        }
        
        private void printHeader(){
            Console.WriteLine("+----------------------+");
            Console.WriteLine("|      Welcome to      |");
            Console.WriteLine("|        Library       |");
            Console.WriteLine("+----------------------+");
        }
        
        private void printMainMenu(){
            Console.WriteLine("\nPlease make a selection: ");
            Console.WriteLine("1 - Register a products");
            Console.WriteLine("2 - List the avaliable products");
            Console.WriteLine("3 - Open your cart");
            Console.WriteLine("4 - Checkout");
            Console.WriteLine("--");
        }
        
        private int getInput(){
            int choice = -1;
            while(choice < 0 || choice > 4){
                try {
                    Console.WriteLine("\nEnter your choice: ");
                    choice = int.Parse(Console.ReadLine());

                } catch (FormatException e) {
                    Console.WriteLine("Invalid selection, please try again");
                }
            }
            return choice;
        }
        private void performAction(int choice){
            switch(choice){
                case 1:
                    prv.runRegMenu();
                    runMenu();
                break;
                case 2:
                    prv.RetriveProdList();
                    runMenu();
                break;
                case 3:
                
                break;
                case 4:
                break;
                default:
                    Console.WriteLine("Invalid");
                break;
            }
        }  
        
    }
}