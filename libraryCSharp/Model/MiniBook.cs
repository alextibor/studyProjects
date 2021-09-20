namespace libraryCSharp.Model
{
    public class MiniBook : Product
    {
        public MiniBook()
        {
            base.pc = new PublishingCompany();
            base.author = new Author();
        }
        
    }
}