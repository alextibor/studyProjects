namespace libraryCSharp.Model
{
    public class Magazine : Product
    {
        public Magazine()
        {
            base.pc = new PublishingCompany();
            base.author = new Author();
        }
        
    }
}