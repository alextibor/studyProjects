namespace libraryCSharp.Model
{
    public class Ebook : Product
    {
        public Ebook()
        {
            base.pc = new PublishingCompany();
            base.author = new Author();
        }
    }
}