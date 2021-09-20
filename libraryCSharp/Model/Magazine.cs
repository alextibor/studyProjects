namespace libraryCSharp.Model
{
    public class Magazine : Product
    {
        public Magazine()
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