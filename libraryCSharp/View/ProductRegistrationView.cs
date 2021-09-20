using System;
using libraryCSharp.Controller;

namespace libraryCSharp.View
{
    public class ProductRegistrationView {
        
        ProductRegistration prodreg;
        
        public ProductRegistrationView() {
            prodreg = new ProductRegistration();
        }

        bool exit;
        
        public void runRegMenu(){
            printPodRegTitle();
            while(!exit){
                printMainMenu();
                int choice = getUserInput();
                performAction(choice);
            }
        }

        private int getUserInput(){
            
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
                    eBookRegView();
                    nextMove();
                    break;
                case 2:
                    physicalBookRegView();
                    nextMove();
                    break;
                case 3:
                    miniBookRegView();
                    nextMove();
                    break;
                case 4:
                    magazineRegView();
                    nextMove();
                    break;
                default:
                    Console.WriteLine("Invalid");
                    break;
            }
        }

        private void printPodRegTitle(){
            Console.WriteLine("Which product would you like to register?");
        }

        private void printMainMenu(){
            Console.WriteLine("\nPlease make a selection: ");
            Console.WriteLine("1 - Ebook");
            Console.WriteLine("2 - Physical Book");
            Console.WriteLine("3 - Minibook");
            Console.WriteLine("4 - Magazine");
            Console.WriteLine("--");
        }

        public void eBookRegView(){
            Console.Clear();
            prodreg.ebookReg();
            Console.Clear();
        }

        public void physicalBookRegView(){
            Console.Clear();
            prodreg.physicalBookReg();
            Console.Clear();
        }

        public void miniBookRegView(){
            Console.Clear();
            prodreg.miniBookReg();
            Console.Clear();;
        }

        public void magazineRegView(){
            Console.Clear();
            prodreg.magazineReg();
            Console.Clear();
        }

        public void nextMove(){
            Console.WriteLine("Would you like to register another product?");
            Console.WriteLine("1 - Yes / 2 - No");
            int answer = int.Parse(Console.ReadLine());
            if(answer == 1){
                Console.Clear();
                runRegMenu();
            } else if (answer == 2){
                Console.Clear();
                Menu mainMenu = new Menu();
                mainMenu.runMenu();
            } else{
                Console.Clear();
                Console.WriteLine("Invalid answer.");
                nextMove();
            }
        }

        public void RetriveProdList(){
            prodreg.productShow();
        }
    }    
}

