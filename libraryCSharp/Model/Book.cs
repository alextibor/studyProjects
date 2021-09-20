namespace libraryCSharp.Model
{
    public class Book : Product
    {
        public Book()
        {
            base.pc = new PublishingCompany();
            base.author = new Author();
        }

        public override string ToString()
        {
            return base.ToString();
        }
        
    }
}