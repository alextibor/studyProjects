using System;
using libraryCSharp.Model;
using libraryCSharp.Repository;

namespace libraryCSharp.Controller
{
    public class ProductRegistration
    {
        private ListDb lDb;

        public ProductRegistration()
        {
            lDb = new ListDb();
        }
        public void ebookReg(){
            Product prod = new Ebook();
            
            Console.WriteLine("Please, register a new Ebook: ");
            Console.WriteLine("What is the name of the Ebook?");
            prod.productName = Console.ReadLine();
            
            Console.WriteLine("What is the name of the Author?");
            prod.author.name = Console.ReadLine();
            
            Console.WriteLine("Write the description: ");
            prod.description = Console.ReadLine();

            Console.WriteLine("What is the value of the Ebook?");
            prod.value = double.Parse(Console.ReadLine());

            lDb.setList(prod);
        }
        public void magazineReg()
        {
            Product prod = new Magazine();
            Console.WriteLine("Please, register a new Magazine: ");
            Console.WriteLine("What is the name of the Magazine?");
            prod.productName = Console.ReadLine();

            Console.WriteLine("Write the description: ");
            prod.description = Console.ReadLine();

            Console.WriteLine("What is the value of the Magazine?");
            prod.value = double.Parse(Console.ReadLine());

            lDb.setList(prod);
        }
        public void miniBookReg(){
            Product prod = new MiniBook();
            Console.WriteLine("Please, register a new MiniBook: ");
            Console.WriteLine("What is the name of the MiniBook?");
            prod.productName = Console.ReadLine();
            
            Console.WriteLine("What is the name of the Author?");
            prod.author.name = Console.ReadLine();
            
            Console.WriteLine("Write the description: ");
            prod.description = Console.ReadLine();

            Console.WriteLine("What is the value of the MiniBook?");
            prod.value = double.Parse(Console.ReadLine());

            lDb.setList(prod);
        }
        public void physicalBookReg(){
            Product prod = new MiniBook();
            Console.WriteLine("Please, register a new Book: ");
            Console.WriteLine("What is the name of the Book?");
            prod.productName = Console.ReadLine();
            
            Console.WriteLine("What is the name of the Author?");
            prod.author.name = Console.ReadLine();
            
            Console.WriteLine("Write the description: ");
            prod.description = Console.ReadLine();

            Console.WriteLine("What is the value of the Book?");
            prod.value = double.Parse(Console.ReadLine());

            lDb.setList(prod);
        }
        public void productShow(){
            lDb.getListArray();
        }
    }
}