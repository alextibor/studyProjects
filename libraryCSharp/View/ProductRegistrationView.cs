using System;

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
            Console.WriteLine("Would you like to register another product?");
            Console.WriteLine("1 - Yes / 2 - No");
            int answer = int.Parse(Console.ReadLine());
            if(answer == 1){
                clearScreen();
                runRegMenu();
            } else if (answer == 2){
                clearScreen();
                Menu mainMenu = new Menu();
                mainMenu.runMenu();
            } else{
                clearScreen();
                Console.WriteLine("Invalid answer.");
                nextMove();
            }
        }

        public void retriveProdList(){
            prodreg.productShow();
        }
    }    
}

