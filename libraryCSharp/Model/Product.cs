using System;
using System.Collections.Generic;

namespace libraryCSharp.Model
{
    public abstract class Product
    {
        protected string productName { get; set; }
        protected string description { get; set; }
        protected double value { get; set; }
        protected string isbn { get; set; }
        protected bool printed { get; set; }
        protected Author author { get; set; }
        protected PublishingCompany pc { get; set; }

        public override string ToString()
        {
            return $"{nameof(productName)}: {productName}, {nameof(description)}: {description}, {nameof(value)}: {value}, {nameof(isbn)}: {isbn}, {nameof(printed)}: {printed}, {nameof(author)}: {author}, {nameof(pc)}: {pc}";
        }
        
    }
}