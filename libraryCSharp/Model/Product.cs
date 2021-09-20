namespace libraryCSharp.Model
{
    public abstract class Product
    {
        protected string productName { get; set; }
        protected string description { get; set; }
        protected double value { get; set; }
        protected string isbn { get; set; }
        protected Author author { get; set; }
        protected PublishingCompany pc { get; set; }
        protected bool printed { get; set; }
        
        public void setAuthorName(string authorName){
            author.set(authorName);
        }

        public void setPublishingCompanyName(string pcName){
            pc.setPcName(pcName);
        }
    }
}