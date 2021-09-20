using System;
using System.Collections.Generic;

namespace libraryCSharp.Model
{
    public abstract class Product
    {
        public Product()
        {
            pc = new PublishingCompany();
            author = new Author();
        }
        
        public string productName { get; set; }
        public string description { get; set; }
        public double value { get; set; }
        public string isbn { get; set; }
        public bool printed { get; set; }
        public Author author { get; set; }
        public PublishingCompany pc { get; set; }

        public override string ToString()
        {
            return
                $"{nameof(productName)}: {productName}, {nameof(description)}: {description}, {nameof(value)}: {value}, {nameof(isbn)}: {isbn}, {nameof(printed)}: {printed}, {nameof(author)}: {author}, {nameof(pc)}: {pc}";
        }

    }
}