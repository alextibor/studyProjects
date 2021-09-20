using System;
using System.Collections.Generic;
using libraryCSharp.Model;
using System.Collections;

namespace libraryCSharp.Repository
{
    public class ListDb
    {
        private List<Product> list;
        
        public ListDb(){
            this.list= new List<Product>();
        }
        
        public void getListArray() {
            //list.ForEach(Console.WriteLine);
            foreach(Product product in this.list){
                Console.WriteLine(product);
            }
        }

        public void setList(Product prod)
        {
            this.list.Add(prod);
        }
    }
}