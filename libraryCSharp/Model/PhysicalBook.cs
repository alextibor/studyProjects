namespace libraryCSharp.Model
{
    public class PhysicalBook : Product
    {
        public PhysicalBook()
        {
            base.pc = new PublishingCompany();
            base.author = new Author();
        }
        
    }
}